package com.anthemengineering.sox.jna;

import com.anthemengineering.sox.jna.SoxLibrary.sox_format_handler_read;
import com.anthemengineering.sox.jna.SoxLibrary.sox_format_handler_seek;
import com.anthemengineering.sox.jna.SoxLibrary.sox_format_handler_startread;
import com.anthemengineering.sox.jna.SoxLibrary.sox_format_handler_startwrite;
import com.anthemengineering.sox.jna.SoxLibrary.sox_format_handler_stopread;
import com.anthemengineering.sox.jna.SoxLibrary.sox_format_handler_stopwrite;
import com.anthemengineering.sox.jna.SoxLibrary.sox_format_handler_write;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * Client API:<br>
 * Handler structure defined by each format.<br>
 * <i>native declaration : sox.h:1466</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class sox_format_handler_t extends Structure {
	/** < Checked on load; must be 1st in struct */
	public int sox_lib_version_code;
	/**
	 * < short description of format<br>
	 * C type : const char*
	 */
	public Pointer description;
	/**
	 * < null-terminated array of filename extensions that are handled by this format<br>
	 * C type : const char**
	 */
	public PointerByReference names;
	/** < File flags (SOX_FILE_* values). */
	public int flags;
	/**
	 * < called to initialize reader (decoder)<br>
	 * C type : sox_format_handler_startread
	 */
	public sox_format_handler_startread startread;
	/**
	 * < called to read (decode) a block of samples<br>
	 * C type : sox_format_handler_read
	 */
	public sox_format_handler_read read;
	/**
	 * < called to close reader (decoder); may be null if no closing necessary<br>
	 * C type : sox_format_handler_stopread
	 */
	public sox_format_handler_stopread stopread;
	/**
	 * < called to initialize writer (encoder)<br>
	 * C type : sox_format_handler_startwrite
	 */
	public sox_format_handler_startwrite startwrite;
	/**
	 * < called to write (encode) a block of samples<br>
	 * C type : sox_format_handler_write
	 */
	public sox_format_handler_write write;
	/**
	 * < called to close writer (decoder); may be null if no closing necessary<br>
	 * C type : sox_format_handler_stopwrite
	 */
	public sox_format_handler_stopwrite stopwrite;
	/**
	 * < called to reposition reader; may be null if not supported<br>
	 * C type : sox_format_handler_seek
	 */
	public sox_format_handler_seek seek;
	/** C type : unsigned const* */
	public IntByReference write_formats;
	/** C type : const sox_rate_t* */
	public DoubleByReference write_rates;
	public size_t priv_size;
	public sox_format_handler_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("sox_lib_version_code", "description", "names", "flags", "startread", "read", "stopread", "startwrite", "write", "stopwrite", "seek", "write_formats", "write_rates", "priv_size");
	}
	public sox_format_handler_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends sox_format_handler_t implements Structure.ByReference {
		
	};
	public static class ByValue extends sox_format_handler_t implements Structure.ByValue {
		
	};
}
