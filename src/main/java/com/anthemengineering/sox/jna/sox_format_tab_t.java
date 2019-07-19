package com.anthemengineering.sox.jna;

import com.anthemengineering.sox.jna.SoxLibrary.sox_format_fn_t;
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
public class sox_format_tab_t extends Structure {
	/**
	 * < Name of format handler<br>
	 * C type : char*
	 */
	public Pointer name;
	/**
	 * < Function to call to get format handler's information<br>
	 * C type : sox_format_fn_t
	 */
	public sox_format_fn_t fn;
	public sox_format_tab_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("name", "fn");
	}
	/**
	 * @param name < Name of format handler<br>
	 * C type : char*<br>
	 * @param fn < Function to call to get format handler's information<br>
	 * C type : sox_format_fn_t
	 */
	public sox_format_tab_t(Pointer name, sox_format_fn_t fn) {
		super();
		this.name = name;
		this.fn = fn;
	}
	public sox_format_tab_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends sox_format_tab_t implements Structure.ByReference {
		
	};
	public static class ByValue extends sox_format_tab_t implements Structure.ByValue {
		
	};
}
