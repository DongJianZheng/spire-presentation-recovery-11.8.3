/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public class spruap {
    private float cfr_renamed_2;
    private float cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_17853() {
        return this.cfr_renamed_4;
    }

    public spruap() {
        this(0, 0.5f, 0.5f);
    }

    public static boolean cfr_renamed_18009(int arg0) {
        return arg0 == 0;
    }

    public float cfr_renamed_14012() {
        return this.cfr_renamed_2;
    }

    public static boolean cfr_renamed_17834(float arg0) {
        float f = 0.01f;
        return arg0 > 0.5f - f && arg0 < 0.5f + f;
    }

    public static boolean cfr_renamed_17833(float arg0) {
        float f = 0.01f;
        return arg0 > 0.5f - f && arg0 < 0.5f + f;
    }

    /*
     * WARNING - void declaration
     */
    public spruap(int n, float f, float f2) {
        void arg2;
        void arg1;
        void arg0;
        spruap spruap2 = this;
        spruap2.cfr_renamed_4 = arg0;
        float f3 = f > 1.0f ? 1.0f : (spruap2.cfr_renamed_2 = arg1 < 0.0f ? 0.0f : arg1);
        this.cfr_renamed_3 = arg2 > 1.0f ? 1.0f : (arg2 < 0.0f ? 0.0f : arg2);
    }

    public boolean cfr_renamed_18010() {
        return spruap.cfr_renamed_18009(this.cfr_renamed_17853()) && spruap.cfr_renamed_17833(this.cfr_renamed_14012()) && spruap.cfr_renamed_17834(this.cfr_renamed_14009());
    }

    public float cfr_renamed_14009() {
        return this.cfr_renamed_3;
    }
}

