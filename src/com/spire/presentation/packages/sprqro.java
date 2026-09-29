/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwp;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.sprujp;

@sprtea
public class sprqro {
    private static sprujp cfr_renamed_119 = new sprujp();
    private long cfr_renamed_91;
    public static sprqro cfr_renamed_0;
    public static long cfr_renamed_1;
    public static long cfr_renamed_2;
    private static sprbwp cfr_renamed_3;
    private long cfr_renamed_4;

    public sprqro cfr_renamed_18614(byte arg0) {
        if (!cfr_renamed_3.cfr_renamed_18615(arg0)) {
            return this;
        }
        long l = cfr_renamed_3.cfr_renamed_18616(arg0);
        return new sprqro(this.cfr_renamed_4 & 0xFFFFFFFFL | l & 0xFFFFFFFFL, this.cfr_renamed_91);
    }

    public byte cfr_renamed_15541() {
        if (cfr_renamed_119.cfr_renamed_18617(this.cfr_renamed_4)) {
            return cfr_renamed_119.cfr_renamed_18618(this.cfr_renamed_4);
        }
        return 1;
    }

    public int hashCode() {
        return (int)(this.cfr_renamed_4 & 0xFFFFFFFFL) * 397 ^ (int)(this.cfr_renamed_91 & 0xFFFFFFFFL);
    }

    public boolean cfr_renamed_18619(sprqro arg0) {
        return this.cfr_renamed_4 == arg0.cfr_renamed_4 && this.cfr_renamed_91 == arg0.cfr_renamed_91;
    }

    static {
        cfr_renamed_3 = new sprbwp();
        cfr_renamed_0 = new sprqro(0L, 0L);
        cfr_renamed_2 = 1L;
        cfr_renamed_1 = 0x80000000L;
        sprqro.cfr_renamed_18620(1L, (byte)0);
        sprqro.cfr_renamed_18620(2L, (byte)-18);
        sprqro.cfr_renamed_18620(4L, (byte)-52);
        sprqro.cfr_renamed_18620(8L, (byte)-95);
        sprqro.cfr_renamed_18620(16L, (byte)-94);
        sprqro.cfr_renamed_18620(32L, (byte)-79);
        sprqro.cfr_renamed_18620(64L, (byte)-78);
        sprqro.cfr_renamed_18620(128L, (byte)-70);
        sprqro.cfr_renamed_18620(256L, (byte)-93);
        sprqro.cfr_renamed_18620(65536L, (byte)-34);
        sprqro.cfr_renamed_18620(131072L, (byte)-128);
        sprqro.cfr_renamed_18620(262144L, (byte)-122);
        sprqro.cfr_renamed_18620(524288L, (byte)-127);
        sprqro.cfr_renamed_18620(0x100000L, (byte)-120);
        sprqro.cfr_renamed_18620(0x200000L, (byte)-126);
        sprqro.cfr_renamed_18620(0x20000000L, (byte)77);
        sprqro.cfr_renamed_18620(0x40000000L, (byte)-1);
        sprqro.cfr_renamed_18620(0x80000000L, (byte)2);
    }

    private static /* synthetic */ void cfr_renamed_18620(long arg0, byte arg1) {
        cfr_renamed_119.cfr_renamed_18621(arg0, arg1);
        cfr_renamed_3.cfr_renamed_18622(arg1, arg0);
    }

    public boolean cfr_renamed_18405() {
        return sproup.cfr_renamed_18602(this.cfr_renamed_4, cfr_renamed_1);
    }

    public long cfr_renamed_18471() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprqro(long l, long l2) {
        void arg0;
        sprqro sprqro2 = this;
        sprqro2.cfr_renamed_4 = arg0;
        sprqro2.cfr_renamed_91 = l2;
    }

    /*
     * WARNING - void declaration
     */
    public sprqro(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprqro sprqro2 = this;
        sprqro2.cfr_renamed_4 = sprtzja.cfr_renamed_12136((byte[])arg0, (int)arg1);
        sprqro2.cfr_renamed_91 = sprtzja.cfr_renamed_12136(byArray, (int)(arg1 + 4));
    }

    public boolean equals(Object arg0) {
        if (sprriia.cfr_renamed_15321(null, arg0)) {
            return false;
        }
        if (sprriia.cfr_renamed_15321(this, arg0)) {
            return true;
        }
        if (arg0.getClass() != this.getClass()) {
            return false;
        }
        return this.cfr_renamed_18619((sprqro)arg0);
    }

    public long cfr_renamed_18470() {
        return this.cfr_renamed_4;
    }
}

