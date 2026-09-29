/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprgwg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprth;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtrg;
import com.spire.presentation.packages.sprxil;
import java.security.Provider;

public class sprqrg {
    private sprth cfr_renamed_2;
    private sprcyg cfr_renamed_3;
    private sprmrg cfr_renamed_4;

    public sprqrg() {
        sprqrg sprqrg2 = this;
        this.cfr_renamed_3 = new sprcyg(new sprrul());
        sprqrg2.cfr_renamed_4 = new sprmrg();
    }

    public sprqrg(sprth sprth2) {
        sprqrg sprqrg2 = this;
        this.cfr_renamed_3 = new sprcyg(new sprrul());
        this.cfr_renamed_2 = sprth2;
    }

    /*
     * WARNING - void declaration
     */
    public sprqrg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprcyg(new sprkhi((Provider)arg0));
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.cfr_renamed_1498((Provider)arg0);
        }
        return this;
    }

    public static /* synthetic */ sprcyg cfr_renamed_7948(sprqrg arg0) {
        return arg0.cfr_renamed_3;
    }

    public sprgwg cfr_renamed_1480(char[] arg0) throws sprtqg {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_1451();
        }
        sprqrg sprqrg2 = this;
        return new sprtrg(sprqrg2, arg0, sprqrg2.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprqrg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprcyg(new sprxil((String)arg0));
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.cfr_renamed_1499((String)arg0);
        }
        return this;
    }
}

