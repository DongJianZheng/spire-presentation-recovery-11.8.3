/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprmmo {
    private String cfr_renamed_2;
    private String cfr_renamed_3;
    private String cfr_renamed_4;

    @sprtea
    public String cfr_renamed_16910() {
        return this.cfr_renamed_2;
    }

    public int hashCode() {
        int n = this.cfr_renamed_2.hashCode();
        n = n * 397 ^ this.cfr_renamed_4.hashCode();
        n = n * 397 ^ this.cfr_renamed_3.hashCode();
        return n;
    }

    @sprtea
    public String cfr_renamed_13303() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_16911(sprmmo arg0) {
        return sprraia.cfr_renamed_11730(this.cfr_renamed_2, arg0.cfr_renamed_2) && sprraia.cfr_renamed_11730(this.cfr_renamed_4, arg0.cfr_renamed_4) && sprraia.cfr_renamed_11730(this.cfr_renamed_3, arg0.cfr_renamed_3);
    }

    @sprtea
    public String cfr_renamed_15513() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprmmo(String string, String string2, String string3) {
        void arg1;
        void arg0;
        sprmmo sprmmo2 = this;
        this.cfr_renamed_2 = arg0;
        sprmmo2.cfr_renamed_4 = arg1;
        sprmmo2.cfr_renamed_3 = string3;
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
        return this.cfr_renamed_16911((sprmmo)arg0);
    }
}

