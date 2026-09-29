/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprkng;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprqkg;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.spryy;
import java.security.SecureRandom;

public class sprbgg
extends sprkng {
    private SecureRandom cfr_renamed_2;
    private sprtpk cfr_renamed_3;
    private spryy cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_7424(sprnfg arg0) throws spryhg {
        sprbgg sprbgg2;
        byte[] byArray = sprqkg.cfr_renamed_7480(arg0);
        if (this.cfr_renamed_2 == null) {
            sprbgg sprbgg3 = this;
            sprbgg2 = sprbgg3;
            this.cfr_renamed_4.cfr_renamed_5535(true, sprbgg3.cfr_renamed_3);
        } else {
            sprbgg sprbgg4 = this;
            sprbgg2 = sprbgg4;
            sprbgg sprbgg5 = this;
            sprbgg4.cfr_renamed_4.cfr_renamed_5535(true, new sprbgk(sprbgg5.cfr_renamed_3, sprbgg5.cfr_renamed_2));
        }
        return sprbgg2.cfr_renamed_4.cfr_renamed_1575(byArray, 0, byArray.length);
    }

    public sprbgg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprbgg(sprddm sprddm2, spryy spryy2, sprtpk sprtpk2) {
        void arg1;
        void arg0;
        sprbgg sprbgg2 = this;
        super((sprddm)arg0);
        sprbgg2.cfr_renamed_4 = arg1;
        sprbgg2.cfr_renamed_3 = sprtpk2;
    }
}

