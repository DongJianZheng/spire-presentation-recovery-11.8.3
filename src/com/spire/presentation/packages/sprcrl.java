/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprksl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spryil;

public class sprcrl
extends spryil {
    private byte[] cfr_renamed_4;

    public boolean cfr_renamed_132(Object arg0) {
        if (arg0 instanceof byte[]) {
            return sproze.cfr_renamed_92(this.cfr_renamed_4, (byte[])arg0);
        }
        if (arg0 instanceof sprksl) {
            return ((sprksl)arg0).cfr_renamed_3995().equals(this);
        }
        return false;
    }

    public sprcrl(byte[] byArray) {
        super(1);
        this.cfr_renamed_4 = byArray;
    }

    @Override
    public Object clone() {
        return new sprcrl(this.cfr_renamed_4);
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprcrl)) {
            return false;
        }
        sprcrl sprcrl2 = (sprcrl)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_4, sprcrl2.cfr_renamed_4);
    }

    public byte[] cfr_renamed_327() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}

