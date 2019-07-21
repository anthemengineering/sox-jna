package com.anthemengineering.sox;

import com.anthemengineering.sox.jna.sox_effect_t;
import com.anthemengineering.sox.jna.sox_effects_chain_t;
import com.anthemengineering.sox.jna.sox_format_t;

public class SoxMain {

    private static final String SOURCE_PATH = "src/test/resources/ascending-fifths.wav";
    private static final String DESTINATION_PATH = "target/output.wav";

    public static void main(String[] args) {
        Sox sox = new Sox();
        System.out.println("Initialized sox");

        sox_format_t source = sox.openRead(SOURCE_PATH);
        System.out.println("Opened " + SOURCE_PATH + ": " + source);

        sox_format_t destination = sox.openWrite(DESTINATION_PATH, source.signal, true);
        System.out.println("Opened " + DESTINATION_PATH + ": " + destination);

        sox_effects_chain_t chain = sox.createEffectsChain(source.encoding, destination.encoding);
        System.out.println("Created effects chain: " + chain);

        sox_effect_t inputEffect = sox.createInputEffect(source);
        sox.addEffect(chain, inputEffect, source.signal, source.signal);
        System.out.println("Added input effect to chain");

        sox_effect_t highpassEffect = sox.createEffect("highpass", "1000");
        sox.addEffect(chain, highpassEffect, source.signal, source.signal);
        System.out.println("Added highpass effect to chain");

        sox_effect_t flangerEffect = sox.createEffect("flanger");
        sox.addEffect(chain, flangerEffect, source.signal, source.signal);
        System.out.println("Added flanger effect to chain");

        sox_effect_t outputEffect = sox.createOutputEffect(destination);
        sox.addEffect(chain, outputEffect, source.signal, source.signal);
        System.out.println("Added output effect to chain");

        sox.flowEffects(chain);
        System.out.println("Flowed chain");

        sox.deleteEffectsChain(chain);
        sox.close(source);
        sox.close(destination);
        System.out.println("Cleaned up");
    }
}
