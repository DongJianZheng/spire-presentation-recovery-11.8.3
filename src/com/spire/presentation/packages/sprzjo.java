/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkjo;
import com.spire.presentation.packages.sprmgo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprzjo
extends sprmgo {
    private sprkjo cfr_renamed_4;

    @sprtea
    public static sprzjo cfr_renamed_141(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return null;
        }
        return new sprzjo(sprkjo.cfr_renamed_141(sprraia.cfr_renamed_12806(arg0)));
    }

    @sprtea
    public static sprzjo cfr_renamed_15774(Long arg0) {
        return new sprzjo(new sprkjo(arg0));
    }

    public String toString() {
        return this.cfr_renamed_4.toString();
    }

    @sprtea
    public sprzjo cfr_renamed_15775(sprkjo arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    @sprtea
    public sprkjo cfr_renamed_15755() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprzjo(long l) {
        void arg0;
        sprzjo sprzjo2 = this;
        sprzjo2.cfr_renamed_4 = new sprkjo((long)arg0);
    }

    @sprtea
    public sprzjo(sprkjo sprkjo2) {
        this.cfr_renamed_4 = sprkjo2;
    }
}

