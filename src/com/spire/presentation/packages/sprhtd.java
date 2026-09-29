/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjxd;
import com.spire.presentation.packages.sprxyd;
import com.spire.presentation.packages.sprzra;

public class sprhtd
extends sprjxd {
    private byte[] cfr_renamed_4;

    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        if (arg0 instanceof byte[]) {
            return sprzra.cfr_renamed_92(this.cfr_renamed_4, (byte[])arg0);
        }
        if (arg0 instanceof sprxyd) {
            return ((sprxyd)arg0).cfr_renamed_3995().equals(this);
        }
        return false;
    }

    public sprhtd(byte[] byArray) {
        super(1);
        this.cfr_renamed_4 = byArray;
    }

    @Override
    public Object clone() {
        return new sprhtd(this.cfr_renamed_4);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprhtd)) {
            return false;
        }
        sprhtd sprhtd2 = (sprhtd)arg0;
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, sprhtd2.cfr_renamed_4);
    }

    public byte[] cfr_renamed_327() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }
}

