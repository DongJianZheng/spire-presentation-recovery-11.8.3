/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprwso {
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_13341() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        return this.cfr_renamed_3 * 397 ^ this.cfr_renamed_4;
    }

    public boolean cfr_renamed_18578(sprwso arg0) {
        if (sprriia.cfr_renamed_15321(null, arg0)) {
            return false;
        }
        if (sprriia.cfr_renamed_15321(this, arg0)) {
            return true;
        }
        return arg0.cfr_renamed_3 == this.cfr_renamed_3 && arg0.cfr_renamed_4 == this.cfr_renamed_4;
    }

    public int cfr_renamed_13430() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprwso(int n, int n2) {
        void arg1;
        sprwso sprwso2 = this;
        sprwso2.cfr_renamed_3 = arg1;
        sprwso2.cfr_renamed_4 = n;
    }

    public boolean equals(Object arg0) {
        if (sprriia.cfr_renamed_15321(null, arg0)) {
            return false;
        }
        if (sprriia.cfr_renamed_15321(this, arg0)) {
            return true;
        }
        if (arg0.getClass() != sprwso.class) {
            return false;
        }
        return this.cfr_renamed_18578((sprwso)arg0);
    }
}

