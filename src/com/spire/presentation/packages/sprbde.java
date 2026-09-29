/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprbde
extends sprkra {
    private sprbne cfr_renamed_4;

    public sprmra cfr_renamed_1157() {
        return (sprmra)this.cfr_renamed_4595(1);
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprbde(BigInteger bigInteger, sprmra sprmra2, spra spra2) {
        void arg1;
        void arg2;
        sprlre sprlre2;
        byte[] byArray = sprvpa.cfr_renamed_514(bigInteger);
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(new sprooe(1L));
        sprlre3.cfr_renamed_49(new sprlqe(byArray));
        if (arg2 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, (spra)arg2));
        }
        if (arg1 != null) {
            sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, (spra)arg1));
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }

    public sprbde(sprbne sprbne2) {
        this.cfr_renamed_4 = sprbne2;
    }

    private /* synthetic */ sprvva cfr_renamed_4595(int arg0) {
        Enumeration enumeration = this.cfr_renamed_4.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            spryte spryte2;
            spra spra2 = (spra)enumeration.nextElement();
            if (!(spra2 instanceof spryte) || (spryte2 = (spryte)spra2).cfr_renamed_312() != arg0) continue;
            return spryte2.cfr_renamed_2456().cfr_renamed_119();
        }
        return null;
    }

    public BigInteger cfr_renamed_1521() {
        sprxue sprxue2 = (sprxue)this.cfr_renamed_4.cfr_renamed_85(1);
        return new BigInteger(1, sprxue2.cfr_renamed_186());
    }

    public sprvva cfr_renamed_284() {
        return this.cfr_renamed_4595(0);
    }

    public sprbde(BigInteger arg0, spra arg1) {
        this(arg0, null, arg1);
    }

    public sprbde(BigInteger bigInteger) {
        sprlre sprlre2;
        byte[] byArray = sprvpa.cfr_renamed_514(bigInteger);
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(new sprooe(1L));
        sprlre3.cfr_renamed_49(new sprlqe(byArray));
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }
}

