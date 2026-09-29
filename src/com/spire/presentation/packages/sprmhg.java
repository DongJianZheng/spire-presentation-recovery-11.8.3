/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprato;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprqkg;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.sprymg;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public abstract class sprmhg
extends sprymg {
    private spryye cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_7424(sprnfg arg0) throws spryhg {
        sprmhg sprmhg2 = this;
        sprwn sprwn2 = sprmhg2.cfr_renamed_7485(sprmhg2.cfr_renamed_615().cfr_renamed_593());
        sprbj sprbj2 = sprmhg2.cfr_renamed_3;
        if (sprmhg2.cfr_renamed_4 != null) {
            sprbj2 = new sprbgk(sprbj2, this.cfr_renamed_4);
        }
        try {
            byte[] byArray = sprqkg.cfr_renamed_7480(arg0);
            sprwn sprwn3 = sprwn2;
            sprwn3.cfr_renamed_5535(true, sprbj2);
            return sprwn3.cfr_renamed_1337(byArray, 0, byArray.length);
        }
        catch (sprull sprull2) {
            throw new spryhg(sprato.cfr_renamed_9("o.{\"v%:4u`\u007f.y2c0n`y/t4\u007f.n3:+\u007f9"), sprull2);
        }
    }

    public sprmhg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public abstract sprwn cfr_renamed_7485(sprlem var1);

    /*
     * WARNING - void declaration
     */
    public sprmhg(sprddm sprddm2, spryye spryye2) {
        super((sprddm)arg0);
        void arg0;
        this.cfr_renamed_3 = spryye2;
    }
}

