/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkaq;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprqhb;
import com.spire.presentation.packages.spryn;
import java.security.SecureRandom;

public class sprzab
extends sprqhb {
    private sprnld cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private spryn cfr_renamed_4;

    public sprzab cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprzab(sprije sprije2, spryn spryn2, sprnld sprnld2) {
        void arg1;
        void arg0;
        sprzab sprzab2 = this;
        super((sprije)arg0);
        sprzab2.cfr_renamed_4 = arg1;
        sprzab2.cfr_renamed_2 = sprnld2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public spreya cfr_renamed_1534(sprije arg0, byte[] arg1) throws sprmfb {
        this.cfr_renamed_4.cfr_renamed_1217(false, this.cfr_renamed_2);
        try {
            return new spreya(arg0, this.cfr_renamed_4.cfr_renamed_1579(arg1, 0, arg1.length));
        }
        catch (sprpjd sprpjd2) {
            throw new sprmfb(new StringBuilder().insert(0, sprkaq.cfr_renamed_9("l\u0001x\ru\n9\u001bvOl\u0001n\u001dx\u001f9\u0004|\u0016#O")).append(sprpjd2.getMessage()).toString(), sprpjd2);
        }
    }
}

