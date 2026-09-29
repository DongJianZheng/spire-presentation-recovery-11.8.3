/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraih;
import com.spire.presentation.packages.sprbtg;
import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprklh;
import com.spire.presentation.packages.sprmyg;
import com.spire.presentation.packages.sprnik;
import com.spire.presentation.packages.sprnjh;
import com.spire.presentation.packages.sprovg;
import com.spire.presentation.packages.sprwdh;
import com.spire.presentation.packages.spryhk;
import com.spire.presentation.packages.sprzch;

public class sprsuj {
    public spraih cfr_renamed_0;
    public sprklh cfr_renamed_1;
    public final sprnjh cfr_renamed_2;
    public final spryhk cfr_renamed_3;
    public sprbvg cfr_renamed_4;

    public sprsuj(sprnjh arg0) {
        this(null, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprsuj cfr_renamed_4767(int n) {
        void arg0;
        this.cfr_renamed_4 = new sprbvg((int)arg0);
        return this;
    }

    public sprsuj cfr_renamed_9557(sprmyg ... arg0) {
        int n;
        sprovg sprovg2 = sprbtg.cfr_renamed_7843();
        int n2 = n = 0;
        while (n2 != arg0.length) {
            sprmyg[] sprmygArray = new sprmyg[1];
            sprmyg sprmyg2 = arg0[n];
            sprmygArray[0] = sprmyg2;
            sprovg2.cfr_renamed_9558(sprmygArray);
            n2 = ++n;
        }
        sprsuj sprsuj2 = this;
        sprsuj2.cfr_renamed_2.cfr_renamed_9559(sprovg2.cfr_renamed_9560());
        return sprsuj2;
    }

    public sprsuj cfr_renamed_9561(sprnik arg0) {
        sprsuj sprsuj2 = this;
        sprsuj2.cfr_renamed_2.cfr_renamed_9562(arg0.cfr_renamed_568());
        return sprsuj2;
    }

    public sprsuj cfr_renamed_9563(int n) {
        this.cfr_renamed_1 = new sprklh(n);
        sprsuj sprsuj2 = this;
        this.cfr_renamed_2.cfr_renamed_9564(sprsuj2.cfr_renamed_1);
        return sprsuj2;
    }

    public sprsuj cfr_renamed_9565(sprwdh ... arg0) {
        sprsuj sprsuj2 = this;
        sprsuj2.cfr_renamed_2.cfr_renamed_9566(sprzch.cfr_renamed_7843().cfr_renamed_9567(arg0).cfr_renamed_9568());
        return sprsuj2;
    }

    public sprsuj cfr_renamed_9569(byte[] byArray) {
        this.cfr_renamed_0 = new spraih(byArray);
        sprsuj sprsuj2 = this;
        this.cfr_renamed_2.cfr_renamed_9570(sprsuj2.cfr_renamed_0);
        return sprsuj2;
    }

    public spryhk cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprsuj(spryhk spryhk2, sprnjh sprnjh2) {
        void arg0;
        sprsuj sprsuj2 = this;
        this.cfr_renamed_4 = new sprbvg(3);
        sprsuj2.cfr_renamed_0 = new spraih(new byte[3]);
        this.cfr_renamed_1 = new sprklh(0);
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_2 = sprnjh2;
        this.cfr_renamed_2.cfr_renamed_9570(this.cfr_renamed_0);
        sprsuj sprsuj3 = this;
        sprsuj3.cfr_renamed_2.cfr_renamed_9564(sprsuj3.cfr_renamed_1);
    }
}

