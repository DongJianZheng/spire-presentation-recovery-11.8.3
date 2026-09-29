/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprej;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprifg;
import com.spire.presentation.packages.sprqfg;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public abstract class spropg {
    private sprddm cfr_renamed_1;
    public sprej cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprddm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcf cfr_renamed_7489(spryye spryye2) throws sprhjg {
        void arg0;
        spropg spropg2 = this;
        spropg spropg3 = this;
        sprvm sprvm2 = spropg2.cfr_renamed_7484(spropg2.cfr_renamed_4, spropg3.cfr_renamed_1);
        if (spropg3.cfr_renamed_3 != null) {
            sprvm2.cfr_renamed_5535(true, new sprbgk((sprbj)arg0, this.cfr_renamed_3));
        } else {
            sprvm2.cfr_renamed_5535(true, (sprbj)arg0);
        }
        return new sprqfg(this, sprvm2);
    }

    /*
     * WARNING - void declaration
     */
    public spropg(sprddm sprddm2, sprddm sprddm3) {
        void arg0;
        spropg spropg2 = this;
        spropg2.cfr_renamed_4 = arg0;
        spropg2.cfr_renamed_1 = sprddm3;
        spropg2.cfr_renamed_2 = sprifg.cfr_renamed_3;
    }

    public abstract sprvm cfr_renamed_7484(sprddm var1, sprddm var2) throws sprhjg;

    public static /* synthetic */ sprddm cfr_renamed_7490(spropg arg0) {
        return arg0.cfr_renamed_4;
    }

    public spropg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }
}

