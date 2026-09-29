/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprdlm
extends sprqqe {
    private final byte[] cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdlm(sprddm sprddm2, byte[] byArray, byte[] byArray2) {
        void arg1;
        void arg0;
        sprdlm sprdlm2 = this;
        this.cfr_renamed_3 = arg0;
        sprdlm2.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg1);
        sprdlm2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray2);
    }

    public static sprdlm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdlm) {
            return (sprdlm)arg0;
        }
        if (arg0 != null) {
            return new sprdlm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprdlm(sprddm sprddm2, byte[] byArray) {
        void arg0;
        sprdlm sprdlm2 = this;
        this.cfr_renamed_3 = arg0;
        sprdlm2.cfr_renamed_2 = null;
        sprdlm2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprdlm sprdlm2 = this;
        sprrvm2.cfr_renamed_5004(sprdlm2.cfr_renamed_3);
        if (sprdlm2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)new sprfvg(this.cfr_renamed_2)));
        }
        sprrvm2.cfr_renamed_5004(new sprycn(true, 2, (sprco)new sprfvg(this.cfr_renamed_4)));
        return new sprcen(sprrvm2);
    }

    public static sprdlm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprdlm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    private /* synthetic */ sprdlm(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() == 2) {
            sprdlm sprdlm2 = this;
            sprdlm2.cfr_renamed_2 = null;
            sprdlm2.cfr_renamed_4 = sproug.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(1), true).cfr_renamed_186();
            return;
        }
        this.cfr_renamed_2 = sproug.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(1), true).cfr_renamed_186();
        this.cfr_renamed_4 = sproug.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(2), true).cfr_renamed_186();
    }
}

