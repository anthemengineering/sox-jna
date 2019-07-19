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
public class sox_fileinfo_t extends Structure {
	/**
	 * < Pointer to data buffer<br>
	 * C type : char*
	 */
	public Pointer buf;
	/** < Size of buffer in bytes */
	public size_t size;
	/** < Count read into buffer */
	public size_t count;
	/** < Position in buffer */
	public size_t pos;
	public sox_fileinfo_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("buf", "size", "count", "pos");
	}
	/**
	 * @param buf < Pointer to data buffer<br>
	 * C type : char*<br>
	 * @param size < Size of buffer in bytes<br>
	 * @param count < Count read into buffer<br>
	 * @param pos < Position in buffer
	 */
	public sox_fileinfo_t(Pointer buf, size_t size, size_t count, size_t pos) {
		super();
		this.buf = buf;
		this.size = size;
		this.count = count;
		this.pos = pos;
	}
	public sox_fileinfo_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends sox_fileinfo_t implements Structure.ByReference {
		
	};
	public static class ByValue extends sox_fileinfo_t implements Structure.ByValue {
		
	};
}
