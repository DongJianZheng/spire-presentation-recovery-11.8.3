/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsn;
import com.spire.presentation.packages.sprcqn;
import com.spire.presentation.packages.spreon;
import com.spire.presentation.packages.sprhpn;
import com.spire.presentation.packages.sprhsn;
import com.spire.presentation.packages.spripn;
import com.spire.presentation.packages.sprqhn;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprdkn
extends sprbsn {
    private spreon cfr_renamed_4;

    @sprtea
    public void cfr_renamed_11665() {
        super.clear();
    }

    public void cfr_renamed_12924(int arg0, Object arg1) {
    }

    @sprtea
    public sprcqn cfr_renamed_12819(int arg0) {
        sprdkn sprdkn2;
        sprcqn sprcqn2 = null;
        switch (arg0) {
            case 47: {
                sprcqn2 = new sprqhn();
                sprdkn2 = this;
                break;
            }
            case 51: {
                sprcqn2 = new spripn();
                sprdkn2 = this;
                break;
            }
            case 14: {
                sprcqn2 = new sprhpn();
                sprdkn2 = this;
                break;
            }
            case 13: {
                sprcqn2 = new sprhsn();
            }
            default: {
                sprdkn2 = this;
            }
        }
        sprdkn2.cfr_renamed_12808(sprcqn2);
        return sprcqn2;
    }

    @sprtea
    public sprdkn cfr_renamed_12837(spreon arg0) {
        int n;
        sprdkn sprdkn2 = (sprdkn)super.cfr_renamed_12099();
        sprdkn2.cfr_renamed_4 = arg0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_12925().size()) {
            sprcqn sprcqn2 = (sprcqn)this.cfr_renamed_12925().cfr_renamed_12151(n);
            sprdkn2.cfr_renamed_12808(sprcqn2.cfr_renamed_12099());
            n2 = ++n;
        }
        return sprdkn2;
    }

    @Override
    public boolean cfr_renamed_12926(Object arg0) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean cfr_renamed_12927(Object arg0) {
        return false;
    }

    public Object cfr_renamed_12151(int arg0) {
        return null;
    }

    @Override
    public void cfr_renamed_12928(Object[] arg0, int arg1) {
    }

    public void cfr_renamed_12929(int arg0, Object arg1) {
    }

    public int cfr_renamed_12930(Object arg0) {
        return 0;
    }
}

