/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboo;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjlg;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.spryy;
import java.security.SecureRandom;

public class sprujg
extends sprjlg {
    private spryy cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprtpk cfr_renamed_4;

    public sprujg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprujg(sprddm sprddm2, spryy spryy2, sprtpk sprtpk2) {
        void arg1;
        void arg0;
        sprujg sprujg2 = this;
        super((sprddm)arg0);
        sprujg2.cfr_renamed_2 = arg1;
        sprujg2.cfr_renamed_4 = sprtpk2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprnfg cfr_renamed_7425(sprddm arg0, byte[] arg1) throws spryhg {
        this.cfr_renamed_2.cfr_renamed_5535(false, this.cfr_renamed_4);
        try {
            return new sprnfg(arg0, this.cfr_renamed_2.cfr_renamed_1579(arg1, 0, arg1.length));
        }
        catch (sprull sprull2) {
            throw new spryhg(new StringBuilder().insert(0, sprboo.cfr_renamed_9("\u001b6\u000f:\u0002=N,\u0001x\u001b6\u0019*\u000f(N3\u000b!Tx")).append(sprull2.getMessage()).toString(), sprull2);
        }
    }
}

