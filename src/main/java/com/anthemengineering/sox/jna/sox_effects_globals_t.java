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
public class sox_effects_globals_t extends Structure {
	/**
	 * @see sox_plot_t<br>
	 * < To help the user choose effect & options<br>
	 * C type : sox_plot_t
	 */
	public int plot;
	/**
	 * < Pointer to associated SoX globals<br>
	 * C type : sox_globals_t*
	 */
	public com.anthemengineering.sox.jna.sox_globals_t.ByReference global_info;
	public sox_effects_globals_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("plot", "global_info");
	}
	/**
	 * @param plot @see sox_plot_t<br>
	 * < To help the user choose effect & options<br>
	 * C type : sox_plot_t<br>
	 * @param global_info < Pointer to associated SoX globals<br>
	 * C type : sox_globals_t*
	 */
	public sox_effects_globals_t(int plot, com.anthemengineering.sox.jna.sox_globals_t.ByReference global_info) {
		super();
		this.plot = plot;
		this.global_info = global_info;
	}
	public sox_effects_globals_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends sox_effects_globals_t implements Structure.ByReference {
		
	};
	public static class ByValue extends sox_effects_globals_t implements Structure.ByValue {
		
	};
}
