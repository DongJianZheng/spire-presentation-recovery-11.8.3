/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbro;
import com.spire.presentation.packages.sprqro;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprshp;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprjgp {
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private sprshp cfr_renamed_1;
    private sprbro cfr_renamed_2;
    private int cfr_renamed_3;
    private sprqro cfr_renamed_4;

    public sprshp cfr_renamed_18523() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_16910() {
        return this.cfr_renamed_0;
    }

    public sprbro cfr_renamed_18514() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_18991() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_19004(sprjgp arg0) {
        return this.cfr_renamed_1.cfr_renamed_19005(arg0.cfr_renamed_1) && this.cfr_renamed_2.equals(arg0.cfr_renamed_2) && this.cfr_renamed_4.equals(arg0.cfr_renamed_4) && this.cfr_renamed_0 == arg0.cfr_renamed_0 && this.cfr_renamed_3 == arg0.cfr_renamed_3 && this.cfr_renamed_91 == arg0.cfr_renamed_91;
    }

    public sprqro cfr_renamed_18493() {
        return this.cfr_renamed_4;
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
        return this.cfr_renamed_19004((sprjgp)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprjgp(sprshp sprshp2, sprbro sprbro2, sprqro sprqro2, int n, int n2, int n3) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprjgp sprjgp2 = this;
        sprjgp sprjgp3 = this;
        sprjgp sprjgp4 = this;
        sprjgp4.cfr_renamed_1 = arg0;
        sprjgp4.cfr_renamed_2 = arg1;
        sprjgp3.cfr_renamed_4 = arg2;
        sprjgp3.cfr_renamed_0 = arg3;
        sprjgp2.cfr_renamed_3 = arg4;
        sprjgp2.cfr_renamed_91 = n3;
    }

    public int cfr_renamed_15541() {
        return this.cfr_renamed_91;
    }

    public int hashCode() {
        int n = this.cfr_renamed_1.hashCode();
        n = n * 397 ^ this.cfr_renamed_2.hashCode();
        n = n * 397 ^ this.cfr_renamed_4.hashCode();
        n = n * 397 ^ this.cfr_renamed_0;
        n = n * 397 ^ this.cfr_renamed_3;
        n = n * 397 ^ this.cfr_renamed_91;
        return n;
    }
}

