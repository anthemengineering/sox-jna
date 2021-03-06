/*
 *  Copyright 2019 Anthem Engineering LLC.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.anthemengineering.sox.format;

import com.anthemengineering.sox.Sox;
import com.anthemengineering.sox.jna.size_t;
import com.anthemengineering.sox.jna.sox_format_t;
import com.sun.jna.Native;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static com.anthemengineering.sox.ValidationUtil.nonNull;
import static com.anthemengineering.sox.ValidationUtil.positiveNumber;

public class InMemory implements SoxSource, SoxSink {
    private ByteBuffer buffer;
    private long bufferSize;

    public InMemory buffer(byte[] buffer) {
        this.buffer = ByteBuffer.allocateDirect(buffer.length);
        this.buffer.put(buffer);
        this.bufferSize = buffer.length;

        return this;
    }

    public InMemory buffer(ByteBuffer buffer, long bufferSize) {
        if (!buffer.isDirect()) {
            return buffer(buffer.array());
        } else {
            this.buffer = buffer;
            this.bufferSize = bufferSize;
        }

        return this;
    }

    @Override
    public sox_format_t create() {
        return Sox.openRead(
                nonNull(Native.getDirectBufferPointer(buffer), "Unable to get direct memory pointer"),
                new size_t(positiveNumber(bufferSize, "BufferSize is not set.")));
    }


    @Override
    public sox_format_t create(sox_format_t format) {
        return Sox.openWrite(
                nonNull(Native.getDirectBufferPointer(buffer), "Unable to get direct memory pointer"),
                new size_t(positiveNumber(bufferSize, "BufferSize is not set.")),
                format.signal,
                format.encoding,
                format.filetype.getString(0, StandardCharsets.US_ASCII.name()),
                null);
    }
}
