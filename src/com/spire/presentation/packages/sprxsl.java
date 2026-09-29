/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprpim;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprzxl;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class sprxsl {
    private sprpim cfr_renamed_3;
    private spraem cfr_renamed_4;

    public List cfr_renamed_583() {
        return sprzxl.cfr_renamed_5274(this.cfr_renamed_3.cfr_renamed_98());
    }

    public spraem cfr_renamed_4233() {
        return this.cfr_renamed_4;
    }

    public Set cfr_renamed_662() {
        return sprzxl.cfr_renamed_10880(this.cfr_renamed_3.cfr_renamed_98());
    }

    /*
     * WARNING - void declaration
     */
    public sprxsl(sprpim sprpim2, boolean bl, spraem spraem2) {
        sprrdm sprrdm2;
        void arg2;
        void arg0;
        sprxsl sprxsl2 = this;
        sprxsl2.cfr_renamed_3 = arg0;
        sprxsl2.cfr_renamed_4 = arg2;
        if (bl && arg0.cfr_renamed_663() && (sprrdm2 = arg0.cfr_renamed_98().cfr_renamed_5024(sprrdm.cfr_renamed_119)) != null) {
            this.cfr_renamed_4 = spraem.cfr_renamed_23(sprrdm2.cfr_renamed_372());
        }
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_3.cfr_renamed_98();
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_3.cfr_renamed_2136().cfr_renamed_97();
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        sprhgm sprhgm2 = this.cfr_renamed_3.cfr_renamed_98();
        if (sprhgm2 != null) {
            return sprhgm2.cfr_renamed_5024(arg0);
        }
        return null;
    }

    public Date cfr_renamed_2139() {
        return this.cfr_renamed_3.cfr_renamed_2139().cfr_renamed_110();
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_3.cfr_renamed_663();
    }

    public Set cfr_renamed_665() {
        return sprzxl.cfr_renamed_10879(this.cfr_renamed_3.cfr_renamed_98());
    }
}

