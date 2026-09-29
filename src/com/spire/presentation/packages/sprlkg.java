/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
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

public class sprlkg
extends sprqqe {
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprddm cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_1146() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprlkg(int n, int n2, sprnhf sprnhf2, spricf spricf2, sprwff sprwff2, sprddm sprddm2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprlkg sprlkg2 = this;
        sprlkg sprlkg3 = this;
        sprlkg sprlkg4 = this;
        sprlkg4.cfr_renamed_4 = arg0;
        sprlkg4.cfr_renamed_0 = arg1;
        sprlkg3.cfr_renamed_1 = arg2.cfr_renamed_91();
        sprlkg3.cfr_renamed_91 = arg3.cfr_renamed_91();
        sprlkg2.cfr_renamed_2 = arg4.cfr_renamed_91();
        sprlkg2.cfr_renamed_3 = sprddm2;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_0;
    }

    public spricf cfr_renamed_1147() {
        return new spricf(this.cfr_renamed_845(), this.cfr_renamed_91);
    }

    public static sprlkg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlkg) {
            return (sprlkg)arg0;
        }
        if (arg0 != null) {
            return new sprlkg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprddm cfr_renamed_580() {
        return this.cfr_renamed_3;
    }

    public sprwff cfr_renamed_1155() {
        return new sprwff(this.cfr_renamed_2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm sprrvm4 = sprrvm2;
        sprrvm4.cfr_renamed_5004(new sprktm(this.cfr_renamed_4));
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_0));
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_1));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_91));
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    public sprnhf cfr_renamed_845() {
        return new sprnhf(this.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlkg(sprszm sprszm2) {
        void arg0;
        this.cfr_renamed_4 = ((sprktm)sprszm2.cfr_renamed_85(0)).cfr_renamed_5023();
        this.cfr_renamed_0 = ((sprktm)arg0.cfr_renamed_85(1)).cfr_renamed_5023();
        this.cfr_renamed_1 = ((sproug)arg0.cfr_renamed_85(2)).cfr_renamed_186();
        this.cfr_renamed_91 = ((sproug)arg0.cfr_renamed_85(3)).cfr_renamed_186();
        this.cfr_renamed_2 = ((sproug)arg0.cfr_renamed_85(4)).cfr_renamed_186();
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(arg0.cfr_renamed_85(5));
    }
}

