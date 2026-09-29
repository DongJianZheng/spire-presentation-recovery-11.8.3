/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprnin;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprppn
extends sprnin {
    private sprcno cfr_renamed_3;
    private int cfr_renamed_4 = 95;

    public int cfr_renamed_13404() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_13408(int arg0) {
        if (arg0 < 0 || arg0 > 100) {
            throw new IllegalArgumentException("value");
        }
        this.cfr_renamed_4 = arg0;
    }

    public sprcno cfr_renamed_13104() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprppn(spriy spriy2) {
        void arg0;
        sprppn sprppn2 = this;
        this.cfr_renamed_3 = new sprcno((spriy)arg0);
    }

    public void cfr_renamed_13191(sprcno arg0) {
        this.cfr_renamed_3 = arg0;
    }
}

