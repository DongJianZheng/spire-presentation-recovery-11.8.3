/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrd;
import com.spire.presentation.packages.sprcvd;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprfrd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkee;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprryca;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryn;

public class sprhrd
extends sprbrd {
    public sprhrd(sprtzd arg0, char[] arg1) {
        super(arg0, arg1);
    }

    @Override
    public byte[] cfr_renamed_4011(sprije arg0, byte[] arg1, spreya arg2) throws sprlqd {
        spryn spryn2;
        byte[] byArray = ((sprnld)sprfrd.cfr_renamed_4213(arg2)).cfr_renamed_1521();
        spryn spryn3 = spryn2 = sprcvd.cfr_renamed_4040(arg0.cfr_renamed_593());
        spryn3.cfr_renamed_1217(true, new sprnjd(new sprnld(arg1), sprxue.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_186()));
        return spryn3.cfr_renamed_1575(byArray, 0, byArray.length);
    }

    @Override
    public byte[] cfr_renamed_3222(byte[] arg0, sprije arg1, int arg2) throws sprlqd {
        sprryca sprryca2;
        sprkee sprkee2 = sprkee.cfr_renamed_23(arg1.cfr_renamed_284());
        sprryca sprryca3 = sprryca2 = new sprryca();
        sprryca3.cfr_renamed_1515(arg0, sprkee2.cfr_renamed_1477(), sprkee2.cfr_renamed_1478().intValue());
        return ((sprnld)sprryca3.cfr_renamed_249(arg2)).cfr_renamed_1521();
    }
}

