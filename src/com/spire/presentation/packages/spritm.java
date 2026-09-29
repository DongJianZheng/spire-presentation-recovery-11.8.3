/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwpm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryrm;
import java.util.Enumeration;

public class spritm
extends sprqqe
implements sprdl {
    private sprwpm cfr_renamed_3;
    private sprbqm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public sprbqm cfr_renamed_2430() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spritm(sprwpm sprwpm2, sprbqm sprbqm2) {
        void arg0;
        spritm spritm2 = this;
        spritm2.cfr_renamed_3 = arg0;
        spritm2.cfr_renamed_4 = sprbqm2;
    }

    public sprwpm cfr_renamed_2429() {
        return this.cfr_renamed_3;
    }

    public static spritm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spritm) {
            return (spritm)arg0;
        }
        if (arg0 != null) {
            return new spritm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ spritm(sprszm sprszm2) {
        spritm spritm2;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        sprszm sprszm3 = sprszm.cfr_renamed_23(((sprco)enumeration.nextElement()).cfr_renamed_119());
        if (sprszm3.cfr_renamed_85(0).equals(cfr_renamed_3247)) {
            spritm2 = this;
            this.cfr_renamed_3 = new sprwpm(cfr_renamed_3247, spryrm.cfr_renamed_23(sprszm3.cfr_renamed_85(1)));
        } else {
            spritm2 = this;
            this.cfr_renamed_3 = sprwpm.cfr_renamed_23(sprszm3);
        }
        spritm2.cfr_renamed_4 = sprbqm.cfr_renamed_23(enumeration.nextElement());
    }
}

