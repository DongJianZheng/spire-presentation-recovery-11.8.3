/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprcvd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkee;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprqn;
import com.spire.presentation.packages.sprryca;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryn;

public abstract class sprjpd
implements sprqn {
    private int cfr_renamed_2;
    private char[] cfr_renamed_4;

    @Override
    public int cfr_renamed_3233() {
        return this.cfr_renamed_2;
    }

    @Override
    public byte[] cfr_renamed_3222(byte[] arg0, sprije arg1, int arg2) throws sprlqd {
        sprryca sprryca2;
        sprkee sprkee2 = sprkee.cfr_renamed_23(arg1.cfr_renamed_284());
        sprryca sprryca3 = sprryca2 = new sprryca();
        sprryca3.cfr_renamed_1515(arg0, sprkee2.cfr_renamed_1477(), sprkee2.cfr_renamed_1478().intValue());
        return ((sprnld)sprryca3.cfr_renamed_249(arg2)).cfr_renamed_1521();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnld cfr_renamed_4041(sprije arg0, sprije arg1, byte[] arg2, byte[] arg3) throws sprlqd {
        spryn spryn2 = sprcvd.cfr_renamed_4040(arg0.cfr_renamed_593());
        spryn2.cfr_renamed_1217(false, new sprnjd(new sprnld(arg2), sprxue.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_186()));
        try {
            return new sprnld(spryn2.cfr_renamed_1579(arg3, 0, arg3.length));
        }
        catch (sprpjd sprpjd2) {
            throw new sprlqd(new StringBuilder().insert(0, sprcno.cfr_renamed_9(" P4\\9[uJ:\u001e P\"L4NuU0Go\u001e")).append(sprpjd2.getMessage()).toString(), sprpjd2);
        }
    }

    @Override
    public char[] cfr_renamed_1601() {
        return this.cfr_renamed_4;
    }

    public sprjpd(char[] cArray) {
        sprjpd sprjpd2 = this;
        sprjpd2.cfr_renamed_2 = 1;
        sprjpd2.cfr_renamed_4 = cArray;
    }

    public sprjpd cfr_renamed_4012(int arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }
}

