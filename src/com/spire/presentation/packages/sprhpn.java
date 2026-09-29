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
public class sprhpn
extends sprcqn {
    private String cfr_renamed_119;
    private String cfr_renamed_91;
    private sprszca cfr_renamed_0;
    private int cfr_renamed_1;
    private String cfr_renamed_2;
    private long cfr_renamed_3;
    private int cfr_renamed_4;

    @sprtea
    public String cfr_renamed_12931() {
        return this.cfr_renamed_2;
    }

    @Override
    @sprtea
    public sprszca cfr_renamed_12805() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public int cfr_renamed_19() {
        return this.cfr_renamed_1;
    }

    @Override
    @sprtea
    public void cfr_renamed_11640(String arg0) {
        this.cfr_renamed_91 = arg0;
    }

    @sprtea
    public int cfr_renamed_2704() {
        return this.cfr_renamed_4;
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
        this.cfr_renamed_12932(sprszca2.cfr_renamed_11595(byArray, 0, byArray.length));
        void v1 = arg0;
        n = (int)(sprddn.cfr_renamed_12161((spreen)v1) & 0xFFFFFFFFL);
        byArray = new byte[n];
        v1.cfr_renamed_11556(byArray, 0, n);
        this.cfr_renamed_12933(sprszca2.cfr_renamed_11595(byArray, 0, byArray.length));
        sprhpn sprhpn2 = this;
        sprhpn2.cfr_renamed_12843(sprddn.cfr_renamed_12161((spreen)arg0));
        sprhpn2.cfr_renamed_12827(sprddn.cfr_renamed_12168((spreen)arg0));
    }

    @Override
    @sprtea
    public String cfr_renamed_313() {
        return this.cfr_renamed_91;
    }

    @sprtea
    public void cfr_renamed_12932(String arg0) {
        this.cfr_renamed_119 = arg0;
    }

    @sprtea
    public void cfr_renamed_12827(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public long cfr_renamed_2703() {
        return this.cfr_renamed_3;
    }

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
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(14), 0, 2);
        sprhpn sprhpn2 = this;
        byArray = this.cfr_renamed_12805().cfr_renamed_11606(sprhpn2.cfr_renamed_12934());
        byte[] byArray2 = sprhpn2.cfr_renamed_12805().cfr_renamed_11606(this.cfr_renamed_12931());
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length + byArray2.length + 16), 0, 4);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
        arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray2.length), 0, 4);
        arg0.cfr_renamed_4924(byArray2, 0, byArray2.length);
        spreen spreen4 = arg0;
        spreen4.cfr_renamed_4924(sprtzja.cfr_renamed_11787(this.cfr_renamed_2703()), 0, 4);
        spreen4.cfr_renamed_4924(sprtzja.cfr_renamed_11602(this.cfr_renamed_2704()), 0, 2);
    }

    @sprtea
    public String cfr_renamed_12934() {
        return this.cfr_renamed_119;
    }

    @Override
    @sprtea
    public void cfr_renamed_12820(sprszca arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public sprhpn() {
        sprhpn sprhpn2 = this;
        sprhpn sprhpn3 = this;
        this.cfr_renamed_1 = 14;
        sprhpn3.cfr_renamed_119 = "";
        sprhpn3.cfr_renamed_2 = "";
        sprhpn2.cfr_renamed_3 = 0L;
        sprhpn2.cfr_renamed_4 = 1;
    }

    @sprtea
    public void cfr_renamed_12933(String arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @sprtea
    public void cfr_renamed_12843(long arg0) {
        this.cfr_renamed_3 = arg0;
    }
}

