/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcqn;
import com.spire.presentation.packages.sprddn;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;

@sprtea
public class sprhsn
extends sprcqn {
    private int cfr_renamed_1 = 13;
    private String cfr_renamed_2;
    private sprszca cfr_renamed_3;
    private String cfr_renamed_4;

    @Override
    @sprtea
    public void cfr_renamed_12816(spreen arg0) {
        byte[] byArray;
        if (!sprraia.cfr_renamed_12280(this.cfr_renamed_313())) {
            byArray = this.cfr_renamed_12805().cfr_renamed_11606(this.cfr_renamed_313());
            spreen spreen2 = arg0;
            spreen2.cfr_renamed_4924(sprtzja.cfr_renamed_11602(22), 0, 2);
            spreen2.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
            arg0.cfr_renamed_4924(byArray, 0, byArray.length);
            byArray = sprszca.cfr_renamed_12801().cfr_renamed_11606(this.cfr_renamed_313());
            spreen spreen3 = arg0;
            spreen3.cfr_renamed_4924(sprtzja.cfr_renamed_11602(62), 0, 2);
            spreen3.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
            arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        }
        spreen spreen4 = arg0;
        sprhsn sprhsn2 = this;
        spreen4.cfr_renamed_4924(sprtzja.cfr_renamed_11602(sprhsn2.cfr_renamed_1), 0, 2);
        byArray = sprhsn2.cfr_renamed_12805().cfr_renamed_11606(this.cfr_renamed_12922());
        spreen4.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length + 10), 0, 4);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
        arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11787(0L), 0, 6);
    }

    @sprtea
    public int cfr_renamed_19() {
        return this.cfr_renamed_1;
    }

    @Override
    @sprtea
    public sprszca cfr_renamed_12805() {
        return this.cfr_renamed_3;
    }

    @Override
    @sprtea
    public String cfr_renamed_313() {
        return this.cfr_renamed_4;
    }

    @Override
    @sprtea
    public void cfr_renamed_12820(sprszca arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public String cfr_renamed_12922() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_12821(spreen spreen2) {
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_11548(arg0.cfr_renamed_3274() + 4L);
        sprszca sprszca2 = this.cfr_renamed_12805();
        int n = (int)(sprddn.cfr_renamed_12161((spreen)v0) & 0xFFFFFFFFL);
        byte[] byArray = new byte[n];
        v0.cfr_renamed_11556(byArray, 0, n);
        this.cfr_renamed_12923(sprszca2.cfr_renamed_11595(byArray, 0, byArray.length));
        void v1 = arg0;
        v1.cfr_renamed_11548(v1.cfr_renamed_3274() + 6L);
    }

    @sprtea
    public void cfr_renamed_12923(String arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @Override
    @sprtea
    public void cfr_renamed_11640(String arg0) {
        this.cfr_renamed_4 = arg0;
    }
}

