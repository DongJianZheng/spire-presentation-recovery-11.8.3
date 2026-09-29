/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkpp;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprshp {
    private static final int cfr_renamed_0 = 10;
    private byte[] cfr_renamed_1;
    public static final byte cfr_renamed_2 = 1;
    public static final byte cfr_renamed_3 = 0;
    public static sprshp cfr_renamed_4 = new sprshp(new byte[10]);

    public boolean cfr_renamed_19005(sprshp arg0) {
        return sprkpp.cfr_renamed_19039(this.cfr_renamed_205(), arg0.cfr_renamed_205());
    }

    public byte[] cfr_renamed_205() {
        return this.cfr_renamed_1;
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
        return this.cfr_renamed_19005((sprshp)arg0);
    }

    public int hashCode() {
        int n;
        int n2 = 0;
        byte[] byArray = this.cfr_renamed_1;
        int n3 = this.cfr_renamed_1.length;
        int n4 = n = 0;
        while (n4 < n3) {
            byte by = byArray[n];
            n2 = n2 * 397 ^ by & 0xFF;
            n4 = ++n;
        }
        return n2;
    }

    public sprshp(byte[] byArray) {
        byte[] arg0;
        if (byArray == null) {
            arg0 = new byte[10];
        }
        this.cfr_renamed_1 = arg0;
    }
}

