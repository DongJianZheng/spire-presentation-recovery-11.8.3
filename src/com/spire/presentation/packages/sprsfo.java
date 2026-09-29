/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmgo;
import com.spire.presentation.packages.sprqio;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprssja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvfja;

@sprtea
public class sprsfo
extends sprmgo {
    private Double cfr_renamed_3;
    private Double cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprsfo(double d, double d2) {
        void arg0;
        sprsfo sprsfo2 = this;
        sprsfo sprsfo3 = this;
        sprsfo3.cfr_renamed_4 = 0.0;
        sprsfo3.cfr_renamed_3 = 0.0;
        sprsfo2.cfr_renamed_4 = (double)arg0;
        sprsfo2.cfr_renamed_3 = d2;
    }

    public String toString() {
        return new StringBuilder().insert(0, sprsfo.cfr_renamed_15502(this.cfr_renamed_4)).append(" ").append(sprsfo.cfr_renamed_15502(this.cfr_renamed_3)).toString();
    }

    @sprtea
    public static sprsfo cfr_renamed_141(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return null;
        }
        String[] stringArray = sprqio.cfr_renamed_15133(arg0, " ", true);
        if (stringArray.length != 2) {
            return null;
        }
        return new sprsfo(sprssja.cfr_renamed_13364(stringArray[0], sprvfja.cfr_renamed_12042()), sprssja.cfr_renamed_13364(stringArray[1], sprvfja.cfr_renamed_12042()));
    }

    @sprtea
    public sprsfo cfr_renamed_15503(Double arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    @sprtea
    public Double spr\u3181() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public static sprsfo cfr_renamed_15776(double arg0, double arg1) {
        return new sprsfo(arg0, arg1);
    }

    @sprtea
    public sprsfo cfr_renamed_15501(Double arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    @sprtea
    public Double cfr_renamed_1980() {
        return this.cfr_renamed_4;
    }
}

