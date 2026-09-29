/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprfyl;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlgg;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprni;
import com.spire.presentation.packages.sprpvl;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprxil;
import java.security.Provider;
import java.security.SecureRandom;

public class sprdtl {
    private static final sprni cfr_renamed_0 = sprlgg.cfr_renamed_3;
    private SecureRandom cfr_renamed_1;
    private sprpvl cfr_renamed_2;
    private final sprlem cfr_renamed_3;
    private final int cfr_renamed_4;

    public sprmh cfr_renamed_1451() throws sprcsl {
        sprdtl sprdtl2 = this;
        sprdtl sprdtl3 = this;
        return new sprfyl(sprdtl3, sprdtl2.cfr_renamed_3, sprdtl2.cfr_renamed_4, sprdtl3.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    public sprdtl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_2 = new sprpvl(new sprxil((String)arg0));
        return this;
    }

    public static /* synthetic */ sprpvl cfr_renamed_10962(sprdtl arg0) {
        return arg0.cfr_renamed_2;
    }

    public sprdtl(sprlem arg0) {
        this(arg0, -1);
    }

    /*
     * WARNING - void declaration
     */
    public sprdtl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_2 = new sprpvl(new sprkhi((Provider)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprdtl(sprlem sprlem2, int n) {
        void arg0;
        sprdtl sprdtl2 = this;
        sprdtl sprdtl3 = this;
        sprdtl3.cfr_renamed_2 = new sprpvl(new sprrul());
        sprdtl2.cfr_renamed_3 = arg0;
        sprdtl2.cfr_renamed_4 = n;
    }

    public sprdtl cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public static /* synthetic */ sprni cfr_renamed_3565() {
        return cfr_renamed_0;
    }
}

