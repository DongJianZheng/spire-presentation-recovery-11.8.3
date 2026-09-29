/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhg;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgrk;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprqrm;
import com.spire.presentation.packages.sprvkg;
import com.spire.presentation.packages.sprwil;
import com.spire.presentation.packages.sprxyk;
import java.security.SecureRandom;

public class sprqig {
    private sprirk cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private sprpl cfr_renamed_2;
    private sprlem cfr_renamed_3;
    private int cfr_renamed_4;

    public sprmh cfr_renamed_1480(char[] arg0) {
        if (this.cfr_renamed_1 == null) {
            sprqig sprqig2 = this;
            sprqig2.cfr_renamed_1 = new SecureRandom();
        }
        byte[] byArray = new byte[20];
        sprqig sprqig3 = this;
        sprqig3.cfr_renamed_1.nextBytes(byArray);
        sprqrm sprqrm2 = new sprqrm(byArray, this.cfr_renamed_4);
        sprqig sprqig4 = this;
        sprbj sprbj2 = sprbhg.cfr_renamed_7416(sprqig3.cfr_renamed_3, this.cfr_renamed_2, sprqig4.cfr_renamed_0.cfr_renamed_1195(), sprqrm2, arg0);
        sprqig4.cfr_renamed_0.cfr_renamed_5535(true, sprbj2);
        return new sprvkg(this, sprqrm2, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprqig(sprlem sprlem2, sprmr sprmr2, sprpl sprpl2) {
        void arg1;
        void arg0;
        sprqig sprqig2 = this;
        this.cfr_renamed_4 = 1024;
        sprqig2.cfr_renamed_3 = arg0;
        sprqig sprqig3 = this;
        sprqig2.cfr_renamed_0 = new sprgrk((sprmr)arg1, new sprxyk());
        sprqig2.cfr_renamed_2 = sprpl2;
    }

    public sprqig cfr_renamed_1616(int arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public static /* synthetic */ sprlem cfr_renamed_7419(sprqig arg0) {
        return arg0.cfr_renamed_3;
    }

    public static /* synthetic */ sprirk cfr_renamed_7420(sprqig arg0) {
        return arg0.cfr_renamed_0;
    }

    public sprqig(sprlem arg0, sprmr arg1) {
        this(arg0, arg1, new sprwil());
    }
}

