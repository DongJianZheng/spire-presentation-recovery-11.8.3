/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprxgf;

public class spraqg
extends sprqqe {
    private byte[] cfr_renamed_119;
    private int cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public int cfr_renamed_1146() {
        return this.cfr_renamed_91;
    }

    public sprnhf cfr_renamed_845() {
        return new sprnhf(this.cfr_renamed_2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_91));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_119));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_3));
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_0));
        return new sprcen(sprrvm2);
    }

    public spraye cfr_renamed_1149() {
        return new spraye(this.cfr_renamed_0);
    }

    public sprwff cfr_renamed_1152() {
        return new sprwff(this.cfr_renamed_4);
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_1;
    }

    public spricf cfr_renamed_1147() {
        return new spricf(this.cfr_renamed_845(), this.cfr_renamed_119);
    }

    public sprwff cfr_renamed_1151() {
        return new sprwff(this.cfr_renamed_3);
    }

    public static spraqg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraqg) {
            return (spraqg)arg0;
        }
        if (arg0 != null) {
            return new spraqg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spraqg(int n, int n2, sprnhf sprnhf2, spricf spricf2, sprwff sprwff2, sprwff sprwff3, spraye spraye2) {
        void arg4;
        void arg6;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spraqg spraqg2 = this;
        spraqg spraqg3 = this;
        spraqg spraqg4 = this;
        this.cfr_renamed_91 = arg0;
        spraqg4.cfr_renamed_1 = arg1;
        spraqg4.cfr_renamed_2 = arg2.cfr_renamed_91();
        spraqg3.cfr_renamed_119 = arg3.cfr_renamed_91();
        spraqg3.cfr_renamed_0 = arg6.cfr_renamed_91();
        spraqg2.cfr_renamed_4 = arg4.cfr_renamed_91();
        spraqg2.cfr_renamed_3 = sprwff3.cfr_renamed_91();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spraqg(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_91 = ((sprktm)sprszm2.cfr_renamed_85(0)).cfr_renamed_5023();
        this.cfr_renamed_1 = ((sprktm)arg0.cfr_renamed_85(1)).cfr_renamed_5023();
        this.cfr_renamed_2 = ((sproug)arg0.cfr_renamed_85(2)).cfr_renamed_186();
        this.cfr_renamed_119 = ((sproug)arg0.cfr_renamed_85(3)).cfr_renamed_186();
        this.cfr_renamed_4 = ((sproug)arg0.cfr_renamed_85(4)).cfr_renamed_186();
        this.cfr_renamed_3 = ((sproug)arg0.cfr_renamed_85(5)).cfr_renamed_186();
        this.cfr_renamed_0 = ((sproug)arg0.cfr_renamed_85(6)).cfr_renamed_186();
    }
}

