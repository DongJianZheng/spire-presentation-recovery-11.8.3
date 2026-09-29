/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprgxa;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprvza;
import com.spire.presentation.packages.spryn;
import java.security.SecureRandom;

public class spraeb
extends sprgxa {
    private SecureRandom cfr_renamed_2;
    private sprnld cfr_renamed_3;
    private spryn cfr_renamed_4;

    public spraeb cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    @Override
    public byte[] cfr_renamed_1533(spreya arg0) throws sprmfb {
        spraeb spraeb2;
        byte[] byArray = sprvza.cfr_renamed_1577(arg0);
        if (this.cfr_renamed_2 == null) {
            spraeb spraeb3 = this;
            spraeb2 = spraeb3;
            this.cfr_renamed_4.cfr_renamed_1217(true, spraeb3.cfr_renamed_3);
        } else {
            spraeb spraeb4 = this;
            spraeb2 = spraeb4;
            spraeb spraeb5 = this;
            spraeb4.cfr_renamed_4.cfr_renamed_1217(true, new spraed(spraeb5.cfr_renamed_3, spraeb5.cfr_renamed_2));
        }
        return spraeb2.cfr_renamed_4.cfr_renamed_1575(byArray, 0, byArray.length);
    }

    /*
     * WARNING - void declaration
     */
    public spraeb(sprije sprije2, spryn spryn2, sprnld sprnld2) {
        void arg1;
        void arg0;
        spraeb spraeb2 = this;
        super((sprije)arg0);
        spraeb2.cfr_renamed_4 = arg1;
        spraeb2.cfr_renamed_3 = sprnld2;
    }
}

