package com.anthemengineering.sox.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.DoubleByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : sox.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
@SuppressWarnings({"unused", "JavaDoc"})
public class sox_signalinfo_t extends Structure {
	/**
	 * < samples per second, 0 if unknown<br>
	 * C type : sox_rate_t
	 */
	public double rate;
	/** < number of sound channels, 0 if unknown */
	public int channels;
	/** < bits per sample, 0 if unknown */
	public int precision;
	/**
	 * < samples * chans in file, 0 if unknown, -1 if unspecified<br>
	 * C type : sox_uint64_t
	 */
	public long length;
	/**
	 * < Effects headroom multiplier; may be null<br>
	 * C type : double*
	 */
	public DoubleByReference mult;
	public sox_signalinfo_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("rate", "channels", "precision", "length", "mult");
	}
	/**
	 * @param rate < samples per second, 0 if unknown<br>
	 * C type : sox_rate_t<br>
	 * @param channels < number of sound channels, 0 if unknown<br>
	 * @param precision < bits per sample, 0 if unknown<br>
	 * @param length < samples * chans in file, 0 if unknown, -1 if unspecified<br>
	 * C type : sox_uint64_t<br>
	 * @param mult < Effects headroom multiplier; may be null<br>
	 * C type : double*
	 */
	public sox_signalinfo_t(double rate, int channels, int precision, long length, DoubleByReference mult) {
		super();
		this.rate = rate;
		this.channels = channels;
		this.precision = precision;
		this.length = length;
		this.mult = mult;
	}
	public sox_signalinfo_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends sox_signalinfo_t implements Structure.ByReference {
		
	};
	public static class ByValue extends sox_signalinfo_t implements Structure.ByValue {
		
	};
}
