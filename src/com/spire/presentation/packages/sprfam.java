/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprkhfa;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprtkc;
import com.spire.presentation.packages.sprxgf;

public class sprfam
extends sprqqe {
    public static final int cfr_renamed_86 = 2;
    public static final int cfr_renamed_152 = 16;
    private sprgbf cfr_renamed_112;
    public static final int cfr_renamed_119 = 8;
    public static final int cfr_renamed_91 = 4;
    public static final int cfr_renamed_0 = 128;
    public static final int cfr_renamed_1 = 32768;
    public static final int cfr_renamed_2 = 32;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 64;

    public byte[] cfr_renamed_81() {
        return this.cfr_renamed_112.cfr_renamed_81();
    }

    public boolean cfr_renamed_4249(int arg0) {
        return (this.cfr_renamed_112.cfr_renamed_1868() & arg0) == arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprfam(int n) {
        void arg0;
        sprfam sprfam2 = this;
        sprfam2.cfr_renamed_112 = new sprdye((int)arg0);
    }

    public String toString() {
        byte[] byArray = this.cfr_renamed_112.cfr_renamed_81();
        if (byArray.length == 1) {
            return new StringBuilder().insert(0, sprtkc.cfr_renamed_9("\u0010^\"n(Z<^a\u001bkC")).append(Integer.toHexString(byArray[0] & 0xFF)).toString();
        }
        return new StringBuilder().insert(0, sprkhfa.cfr_renamed_9("\u007f\u0010M G\u0014S\u0010\u000eU\u0004\r")).append(Integer.toHexString((byArray[1] & 0xFF) << 8 | byArray[0] & 0xFF)).toString();
    }

    private /* synthetic */ sprfam(sprgbf sprgbf2) {
        this.cfr_renamed_112 = sprgbf2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_112;
    }

    public static sprfam cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfam) {
            return (sprfam)arg0;
        }
        if (arg0 != null) {
            return new sprfam(sprgbf.cfr_renamed_23(arg0));
        }
        return null;
    }

    public int cfr_renamed_106() {
        return this.cfr_renamed_112.cfr_renamed_106();
    }

    public static sprfam cfr_renamed_5322(sprhgm arg0) {
        return sprfam.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_272));
    }
}

