/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprid;
import com.spire.presentation.packages.sprjzg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprkxg;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprqj;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprxil;
import java.security.Provider;

public class spravg
implements sprqj {
    private sprmrg cfr_renamed_2;
    private sprcyg cfr_renamed_3;
    private sprjzg cfr_renamed_4;

    public static /* synthetic */ sprmrg cfr_renamed_7986(spravg arg0) {
        return arg0.cfr_renamed_2;
    }

    @Override
    public sprid cfr_renamed_2658(int arg0, int arg1) throws sprtqg {
        return new sprkxg(this, arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public spravg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprcyg(new sprxil(string));
        spravg spravg2 = this;
        this.cfr_renamed_4.cfr_renamed_1499(string);
        spravg2.cfr_renamed_2.cfr_renamed_1499((String)arg0);
        return spravg2;
    }

    public static /* synthetic */ sprjzg cfr_renamed_7987(spravg arg0) {
        return arg0.cfr_renamed_4;
    }

    public spravg() {
        spravg spravg2 = this;
        this.cfr_renamed_3 = new sprcyg(new sprrul());
        spravg2.cfr_renamed_2 = new sprmrg();
        this.cfr_renamed_4 = new sprjzg();
    }

    /*
     * WARNING - void declaration
     */
    public spravg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprcyg(new sprkhi(provider));
        spravg spravg2 = this;
        this.cfr_renamed_4.cfr_renamed_1498(provider);
        spravg2.cfr_renamed_2.cfr_renamed_1498((Provider)arg0);
        return spravg2;
    }

    public static /* synthetic */ sprcyg cfr_renamed_7988(spravg arg0) {
        return arg0.cfr_renamed_3;
    }
}

