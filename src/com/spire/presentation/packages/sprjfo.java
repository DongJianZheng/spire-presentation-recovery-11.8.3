/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdf;
import com.spire.presentation.packages.sprphja;

public class sprjfo {
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_16125() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_16126() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_16127() {
        return this.cfr_renamed_4;
    }

    public sprphja cfr_renamed_16128(sprphja arg0) {
        if (this.cfr_renamed_16125() == 0 || this.cfr_renamed_16126() == 0) {
            throw new IllegalStateException(sprfdf.cfr_renamed_9("\u001aL%C?K7\u0002 A2N6\u0002%C?W6Q}"));
        }
        return new sprphja(arg0.cfr_renamed_1942() * (float)this.cfr_renamed_16129() / (float)this.cfr_renamed_16126(), arg0.cfr_renamed_1452() * (float)this.cfr_renamed_16127() / (float)this.cfr_renamed_16125());
    }

    public int cfr_renamed_16129() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprjfo(int n, int n2, int n3, int n4) {
        void arg2;
        void arg1;
        void arg0;
        sprjfo sprjfo2 = this;
        sprjfo sprjfo3 = this;
        sprjfo3.cfr_renamed_1 = arg0;
        sprjfo3.cfr_renamed_4 = arg1;
        sprjfo2.cfr_renamed_2 = arg2;
        sprjfo2.cfr_renamed_3 = n4;
    }
}

