/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprrnm;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxcja;

public class sprzfe
extends sprkra {
    public static final int cfr_renamed_86 = 1;
    public static final int cfr_renamed_152 = 4;
    public static final int cfr_renamed_112 = 8;
    public static final int cfr_renamed_119 = 32;
    private sprmra cfr_renamed_91;
    public static final int cfr_renamed_0 = 2;
    public static final int cfr_renamed_1 = 128;
    public static final int cfr_renamed_2 = 16;
    public static final int cfr_renamed_3 = 32768;
    public static final int cfr_renamed_4 = 64;

    private /* synthetic */ sprzfe(sprmra sprmra2) {
        this.cfr_renamed_91 = sprmra2;
    }

    /*
     * WARNING - void declaration
     */
    public sprzfe(int n) {
        void arg0;
        sprzfe sprzfe2 = this;
        sprzfe2.cfr_renamed_91 = new sprmra((int)arg0);
    }

    public String toString() {
        byte[] byArray = this.cfr_renamed_91.cfr_renamed_81();
        if (byArray.length == 1) {
            return new StringBuilder().insert(0, sprxcja.cfr_renamed_9("J/x\u001fr+f/;j12")).append(Integer.toHexString(byArray[0] & 0xFF)).toString();
        }
        return new StringBuilder().insert(0, sprrnm.cfr_renamed_9("R}`Mjy~}#8)`")).append(Integer.toHexString((byArray[1] & 0xFF) << 8 | byArray[0] & 0xFF)).toString();
    }

    public boolean cfr_renamed_4249(int arg0) {
        return (this.cfr_renamed_91.cfr_renamed_1868() & arg0) == arg0;
    }

    public byte[] cfr_renamed_81() {
        return this.cfr_renamed_91.cfr_renamed_81();
    }

    public static sprzfe cfr_renamed_2757(sprszd arg0) {
        return sprzfe.cfr_renamed_23(arg0.cfr_renamed_4477(sprtie.cfr_renamed_953));
    }

    public int cfr_renamed_106() {
        return this.cfr_renamed_91.cfr_renamed_106();
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_91;
    }

    public static sprzfe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzfe) {
            return (sprzfe)arg0;
        }
        if (arg0 != null) {
            return new sprzfe(sprmra.cfr_renamed_23(arg0));
        }
        return null;
    }
}

