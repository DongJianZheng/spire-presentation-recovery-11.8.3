/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgb;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprzyfa;

public abstract class sprubb
extends sprbgb {
    private sprhgb cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprubb(sprije sprije2, sprhgb sprhgb2) {
        super((sprije)arg0);
        void arg0;
        this.cfr_renamed_4 = sprhgb2;
    }

    public abstract sprh cfr_renamed_1584(sprtzd var1);

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public spreya cfr_renamed_1534(sprije arg0, byte[] arg1) throws sprmfb {
        sprubb sprubb2 = this;
        sprh sprh2 = sprubb2.cfr_renamed_1584(sprubb2.cfr_renamed_615().cfr_renamed_593());
        sprh2.cfr_renamed_1217(false, this.cfr_renamed_4);
        try {
            byte[] byArray = sprh2.cfr_renamed_1337(arg1, 0, arg1.length);
            if (!arg0.cfr_renamed_593().equals(sprm.cfr_renamed_1262)) return new spreya(arg0, byArray);
            return new spreya(arg0, byArray);
        }
        catch (sprpjd sprpjd2) {
            throw new sprmfb(new StringBuilder().insert(0, sprzyfa.cfr_renamed_9("\u001e1\n=\u0007:K+\u0004\u007f\u0019:\b0\u001d:\u0019\u007f\u0018:\b-\u000e+K4\u000e&Q\u007f")).append(sprpjd2.getMessage()).toString(), sprpjd2);
        }
    }
}

