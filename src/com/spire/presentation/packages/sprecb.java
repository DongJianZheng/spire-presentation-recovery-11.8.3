/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprnza;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvqfa;
import com.spire.presentation.packages.sprvza;
import java.security.SecureRandom;

public abstract class sprecb
extends sprnza {
    private SecureRandom cfr_renamed_3;
    private sprhgb cfr_renamed_4;

    public sprecb cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1533(spreya arg0) throws sprmfb {
        sprecb sprecb2 = this;
        sprh sprh2 = sprecb2.cfr_renamed_1583(sprecb2.cfr_renamed_615().cfr_renamed_593());
        sprt sprt2 = sprecb2.cfr_renamed_4;
        if (sprecb2.cfr_renamed_3 != null) {
            sprt2 = new spraed(sprt2, this.cfr_renamed_3);
        }
        try {
            byte[] byArray = sprvza.cfr_renamed_1577(arg0);
            sprh sprh3 = sprh2;
            sprh3.cfr_renamed_1217(true, this.cfr_renamed_4);
            return sprh3.cfr_renamed_1337(byArray, 0, byArray.length);
        }
        catch (sprpjd sprpjd2) {
            throw new sprmfb(sprvqfa.cfr_renamed_9("'\u000b3\u0007>\u0000r\u0011=E7\u000b1\u0017+\u0015&E1\n<\u00117\u000b&\u0016r\u000e7\u001c"), sprpjd2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprecb(sprije sprije2, sprhgb sprhgb2) {
        super((sprije)arg0);
        void arg0;
        this.cfr_renamed_4 = sprhgb2;
    }

    public abstract sprh cfr_renamed_1583(sprtzd var1);
}

