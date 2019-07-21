package com.anthemengineering.sox.effects;

import com.anthemengineering.sox.effects.utils.OptList;

/**
 * flanger [delay depth regen width speed shape phase interp]
 *
 * Apply a flanging effect to the audio. See [3] for a detailed description of flanging.
 *
 * All parameters are optional (right to left).
 */
public class Flanger implements SoxEffect {
    @Override
    public String getName() {
        return "flanger";
    }

    private String delay;
    private String depth;
    private String regen;
    private String width;
    private String speed;
    private String shape;
    private String phase;
    private String interp;

    public Flanger delay(String delay) {
        this.delay = delay;
        return this;
    }

    public Flanger depth(String depth) {
        this.depth = depth;
        return this;
    }

    public Flanger regen(String regen) {
        this.regen = regen;
        return this;
    }

    public Flanger width(String width) {
        this.width = width;
        return this;
    }

    public Flanger speed(String speed) {
        this.speed = speed;
        return this;
    }

    public Flanger shape(String shape) {
        this.shape = shape;
        return this;
    }

    public Flanger phase(String phase) {
        this.phase = phase;
        return this;
    }

    public Flanger interp(String interp) {
        this.interp = interp;
        return this;
    }

    @Override
    public String[] getOptionsList() {
        OptList optList = new OptList();
        optList.addMany(delay, depth, regen, width, speed, shape, phase, interp);

        return optList.toStringArray();
    }
}