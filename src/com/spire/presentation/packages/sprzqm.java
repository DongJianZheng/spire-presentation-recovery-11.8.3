/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcaa;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprzqm
extends sprqqe {
    private final sprjfn cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprzqm(byte[] byArray, sprjfn sprjfn2) {
        void arg0;
        sprzqm sprzqm2 = this;
        sprzqm2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg0);
        sprzqm2.cfr_renamed_3 = sprjfn2;
    }

    public sprjfn cfr_renamed_11383() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_11384() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public static sprzqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzqm) {
            return (sprzqm)arg0;
        }
        if (arg0 != null) {
            return new sprzqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprzqm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprrcaa.cfr_renamed_9("\u0003H\tI\u0018T\u000fE\u001e\u0006\u0019C\u001bS\u000fH\tCJU\u0003\\\u000f"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(v0.cfr_renamed_85(0)).cfr_renamed_186());
        this.cfr_renamed_3 = sprjfn.cfr_renamed_23(v0.cfr_renamed_85(1));
    }
}

