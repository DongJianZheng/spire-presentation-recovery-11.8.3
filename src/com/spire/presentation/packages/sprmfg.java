/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhg;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprpd;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprqrm;
import com.spire.presentation.packages.sprsf;
import com.spire.presentation.packages.sprwil;
import java.security.SecureRandom;

public class sprmfg
implements sprpd {
    private int cfr_renamed_0;
    private sprddm cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private sprpl cfr_renamed_3;
    private int cfr_renamed_4;

    public sprmfg cfr_renamed_1616(int arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprmfg() {
        this(new sprwil(), new sprddm(sprgt.cfr_renamed_0, sprpen.cfr_renamed_4));
    }

    @Override
    public sprsf cfr_renamed_1480(char[] arg0) {
        if (this.cfr_renamed_2 == null) {
            sprmfg sprmfg2 = this;
            sprmfg2.cfr_renamed_2 = new SecureRandom();
        }
        sprmfg sprmfg3 = this;
        byte[] byArray = new byte[sprmfg3.cfr_renamed_0];
        sprmfg3.cfr_renamed_2.nextBytes(byArray);
        return sprbhg.cfr_renamed_7418(sprmfg3.cfr_renamed_1.cfr_renamed_593(), this.cfr_renamed_3, new sprqrm(byArray, this.cfr_renamed_4), arg0);
    }

    @Override
    public sprddm cfr_renamed_1479() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprmfg(sprpl sprpl2, sprddm sprddm2) {
        void arg1;
        void arg0;
        sprmfg sprmfg2 = this;
        sprmfg sprmfg3 = this;
        sprmfg3.cfr_renamed_4 = 1024;
        sprmfg3.cfr_renamed_3 = arg0;
        sprmfg2.cfr_renamed_1 = arg1;
        sprmfg2.cfr_renamed_0 = sprpl2.cfr_renamed_1218();
    }
}

