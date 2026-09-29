/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqd;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmvd;
import com.spire.presentation.packages.sprqrd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprypd;
import com.spire.presentation.packages.sprzxd;
import java.security.Provider;
import java.security.SecureRandom;

public class sprkqd {
    private final int cfr_renamed_1;
    private sprzxd cfr_renamed_2;
    private final sprtzd cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public sprkqd cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprkqd(sprtzd arg0) {
        this(arg0, -1);
    }

    public static /* synthetic */ sprzxd cfr_renamed_4065(sprkqd arg0) {
        return arg0.cfr_renamed_2;
    }

    public sprha cfr_renamed_1451() throws sprlqd {
        sprkqd sprkqd2 = this;
        sprkqd sprkqd3 = this;
        return new sprmvd(sprkqd3, sprkqd2.cfr_renamed_3, sprkqd2.cfr_renamed_1, sprkqd3.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprkqd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_2 = new sprzxd(new sprqrd((Provider)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprkqd(sprtzd sprtzd2, int n) {
        void arg0;
        sprkqd sprkqd2 = this;
        sprkqd sprkqd3 = this;
        sprkqd3.cfr_renamed_2 = new sprzxd(new sprypd());
        sprkqd2.cfr_renamed_3 = arg0;
        sprkqd2.cfr_renamed_1 = n;
    }

    /*
     * WARNING - void declaration
     */
    public sprkqd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_2 = new sprzxd(new sprbqd((String)arg0));
        return this;
    }
}

