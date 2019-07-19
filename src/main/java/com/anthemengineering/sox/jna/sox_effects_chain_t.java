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
@SuppressWarnings({"unused", "JavaDoc"})
public class sox_effects_chain_t extends Structure {
	/**
	 * < Table of effects to be applied to a stream<br>
	 * C type : sox_effect_t**
	 */
	public com.anthemengineering.sox.jna.sox_effect_t.ByReference[] effects;
	/** < Number of effects to be applied */
	public size_t length;
	/**
	 * < Copy of global effects settings<br>
	 * C type : sox_effects_globals_t
	 */
	public sox_effects_globals_t global_info;
	/**
	 * < Input encoding<br>
	 * C type : const sox_encodinginfo_t*
	 */
	public com.anthemengineering.sox.jna.sox_encodinginfo_t.ByReference in_enc;
	/**
	 * < Output encoding<br>
	 * C type : const sox_encodinginfo_t*
	 */
	public com.anthemengineering.sox.jna.sox_encodinginfo_t.ByReference out_enc;
	/** < Size of effects table (including unused entries) */
	public size_t table_size;
	/**
	 * < Channel interleave buffer<br>
	 * C type : sox_sample_t*
	 */
	public IntByReference il_buf;
	public sox_effects_chain_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("effects", "length", "global_info", "in_enc", "out_enc", "table_size", "il_buf");
	}
	/**
	 * @param effects < Table of effects to be applied to a stream<br>
	 * C type : sox_effect_t**<br>
	 * @param length < Number of effects to be applied<br>
	 * @param global_info < Copy of global effects settings<br>
	 * C type : sox_effects_globals_t<br>
	 * @param in_enc < Input encoding<br>
	 * C type : const sox_encodinginfo_t*<br>
	 * @param out_enc < Output encoding<br>
	 * C type : const sox_encodinginfo_t*<br>
	 * @param table_size < Size of effects table (including unused entries)<br>
	 * @param il_buf < Channel interleave buffer<br>
	 * C type : sox_sample_t*
	 */
	public sox_effects_chain_t(com.anthemengineering.sox.jna.sox_effect_t.ByReference effects[], size_t length, sox_effects_globals_t global_info, com.anthemengineering.sox.jna.sox_encodinginfo_t.ByReference in_enc, com.anthemengineering.sox.jna.sox_encodinginfo_t.ByReference out_enc, size_t table_size, IntByReference il_buf) {
		super();
		if ((effects.length != this.effects.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.effects = effects;
		this.length = length;
		this.global_info = global_info;
		this.in_enc = in_enc;
		this.out_enc = out_enc;
		this.table_size = table_size;
		this.il_buf = il_buf;
	}
	public sox_effects_chain_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends sox_effects_chain_t implements Structure.ByReference {
		
	};
	public static class ByValue extends sox_effects_chain_t implements Structure.ByValue {
		
	};
}
