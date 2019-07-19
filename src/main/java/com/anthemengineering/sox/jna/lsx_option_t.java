package com.anthemengineering.sox.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : sox.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class lsx_option_t extends Structure {
	/**
	 * < Name of the long option.<br>
	 * C type : const char*
	 */
	public Pointer name;
	/**
	 * @see lsx_option_arg_t<br>
	 * < Whether the long option supports an argument and, if so, whether the argument is required or optional.<br>
	 * C type : lsx_option_arg_t
	 */
	public int has_arg;
	/**
	 * < Flag to set if argument is present.<br>
	 * C type : int*
	 */
	public IntByReference flag;
	/** < Value to put in flag if argument is present. */
	public int val;
	public lsx_option_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("name", "has_arg", "flag", "val");
	}
	/**
	 * @param name < Name of the long option.<br>
	 * C type : const char*<br>
	 * @param has_arg @see lsx_option_arg_t<br>
	 * < Whether the long option supports an argument and, if so, whether the argument is required or optional.<br>
	 * C type : lsx_option_arg_t<br>
	 * @param flag < Flag to set if argument is present.<br>
	 * C type : int*<br>
	 * @param val < Value to put in flag if argument is present.
	 */
	public lsx_option_t(Pointer name, int has_arg, IntByReference flag, int val) {
		super();
		this.name = name;
		this.has_arg = has_arg;
		this.flag = flag;
		this.val = val;
	}
	public lsx_option_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends lsx_option_t implements Structure.ByReference {
		
	};
	public static class ByValue extends lsx_option_t implements Structure.ByValue {
		
	};
}
