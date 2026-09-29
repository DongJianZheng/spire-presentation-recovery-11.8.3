/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcqn;
import com.spire.presentation.packages.sprddn;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;

@sprtea
public class spripn
extends sprcqn {
    private sprszca cfr_renamed_1;
    private String cfr_renamed_2;
    private String cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    @sprtea
    public void cfr_renamed_11640(String arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @sprtea
    public String cfr_renamed_12922() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public int cfr_renamed_19() {
        return this.cfr_renamed_4;
    }

    @Override
    @sprtea
    public void cfr_renamed_12820(sprszca arg0) {
        this.cfr_renamed_1 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_12816(spreen spreen2) {
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(this.cfr_renamed_19()), 0, 2);
        byte[] byArray = this.cfr_renamed_12805().cfr_renamed_11606(this.cfr_renamed_12922());
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
        arg0.cfr_renamed_4924(byArray, 0, byArray.length);
    }

    @Override
    @sprtea
    public String cfr_renamed_313() {
        return this.cfr_renamed_2;
    }

    @Override
    @sprtea
    public sprszca cfr_renamed_12805() {
        return this.cfr_renamed_1;
    }

    @Override
    @sprtea
    public void cfr_renamed_12821(spreen arg0) {
        spreen spreen2 = arg0;
        int n = (int)(sprddn.cfr_renamed_12161(spreen2) & 0xFFFFFFFFL);
        byte[] byArray = new byte[n];
        spreen2.cfr_renamed_11556(byArray, 0, n);
        spripn spripn2 = this;
        spripn2.cfr_renamed_12923(spripn2.cfr_renamed_12805().cfr_renamed_11595(byArray, 0, byArray.length));
    }

    @sprtea
    public void cfr_renamed_12923(String arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public spripn() {
        spripn spripn2 = this;
        this.cfr_renamed_4 = 51;
        spripn2.cfr_renamed_3 = "";
        spripn2.cfr_renamed_1 = null;
    }
}

