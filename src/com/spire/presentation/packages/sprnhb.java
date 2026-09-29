/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import java.math.BigInteger;

public class sprnhb
extends sprkra {
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private sprtzd cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public sprjta cfr_renamed_1145() {
        return new sprjta(this.cfr_renamed_4);
    }

    public sprtzd cfr_renamed_113() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_3);
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_2));
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_1));
        sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_4));
        return new sprpse(sprlre2);
    }

    public static sprnhb cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnhb) {
            return (sprnhb)arg0;
        }
        if (arg0 != null) {
            return new sprnhb(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnhb(sprbne sprbne2) {
        void arg0;
        this.cfr_renamed_3 = (sprtzd)sprbne2.cfr_renamed_85(0);
        BigInteger bigInteger = ((sprooe)arg0.cfr_renamed_85(1)).cfr_renamed_97();
        this.cfr_renamed_2 = bigInteger.intValue();
        BigInteger bigInteger2 = ((sprooe)arg0.cfr_renamed_85(2)).cfr_renamed_97();
        sprnhb sprnhb2 = this;
        sprnhb2.cfr_renamed_1 = bigInteger2.intValue();
        sprnhb2.cfr_renamed_4 = ((sprxue)arg0.cfr_renamed_85(3)).cfr_renamed_186();
    }

    /*
     * WARNING - void declaration
     */
    public sprnhb(sprtzd sprtzd2, int n, int n2, sprjta sprjta2) {
        void arg2;
        void arg1;
        void arg0;
        sprnhb sprnhb2 = this;
        sprnhb sprnhb3 = this;
        sprnhb3.cfr_renamed_3 = arg0;
        sprnhb3.cfr_renamed_2 = arg1;
        sprnhb2.cfr_renamed_1 = arg2;
        sprnhb2.cfr_renamed_4 = sprjta2.cfr_renamed_91();
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_2;
    }
}

