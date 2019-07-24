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

package com.anthemengineering.sox.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : sox.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
@SuppressWarnings({"unused", "JavaDoc"})
public class sox_version_info_t extends Structure {
	/** structure size = sizeof(sox_version_info_t) */
	public size_t size;
	/**
	 * see sox_version_flags_t<br>
	 * feature flags = popen | magic | threads | memopen<br>
	 * C type : sox_version_flags_t
	 */
	public int flags;
	/**
	 * version number = 0x140400<br>
	 * C type : sox_uint32_t
	 */
	public int version_code;
	/**
	 * version string = sox_version(), for example, "14.4.0"<br>
	 * C type : const char*
	 */
	public Pointer version;
	/**
	 * version extra info or null = "PACKAGE_EXTRA", for example, "beta"<br>
	 * C type : const char*
	 */
	public Pointer version_extra;
	/**
	 * build time = "__DATE__ __TIME__", for example, "Jan  7 2010 03:31:50"<br>
	 * C type : const char*
	 */
	public Pointer time;
	/**
	 * distro or null = "DISTRO", for example, "Debian"<br>
	 * C type : const char*
	 */
	public Pointer distro;
	/**
	 * compiler info or null, for example, "msvc 160040219"<br>
	 * C type : const char*
	 */
	public Pointer compiler;
	/**
	 * arch, for example, "1248 48 44 L OMP"<br>
	 * C type : const char*
	 */
	public Pointer arch;
	public sox_version_info_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("size", "flags", "version_code", "version", "version_extra", "time", "distro", "compiler", "arch");
	}
	/**
	 * @param size structure size = sizeof(sox_version_info_t)<br>
	 * @param flags see sox_version_flags_t<br>
	 * feature flags = popen | magic | threads | memopen<br>
	 * C type : sox_version_flags_t<br>
	 * @param version_code version number = 0x140400<br>
	 * C type : sox_uint32_t<br>
	 * @param version version string = sox_version(), for example, "14.4.0"<br>
	 * C type : const char*<br>
	 * @param version_extra version extra info or null = "PACKAGE_EXTRA", for example, "beta"<br>
	 * C type : const char*<br>
	 * @param time build time = "__DATE__ __TIME__", for example, "Jan  7 2010 03:31:50"<br>
	 * C type : const char*<br>
	 * @param distro distro or null = "DISTRO", for example, "Debian"<br>
	 * C type : const char*<br>
	 * @param compiler compiler info or null, for example, "msvc 160040219"<br>
	 * C type : const char*<br>
	 * @param arch arch, for example, "1248 48 44 L OMP"<br>
	 * C type : const char*
	 */
	public sox_version_info_t(size_t size, int flags, int version_code, Pointer version, Pointer version_extra, Pointer time, Pointer distro, Pointer compiler, Pointer arch) {
		super();
		this.size = size;
		this.flags = flags;
		this.version_code = version_code;
		this.version = version;
		this.version_extra = version_extra;
		this.time = time;
		this.distro = distro;
		this.compiler = compiler;
		this.arch = arch;
	}
	public sox_version_info_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends sox_version_info_t implements Structure.ByReference {
		
	};
	public static class ByValue extends sox_version_info_t implements Structure.ByValue {
		
	};
}
