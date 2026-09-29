/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprrsl;
import com.spire.presentation.packages.sprwrl;
import java.security.SecureRandom;

public class sprgwl {
    private final sprlem cfr_renamed_1;
    private sprrsl cfr_renamed_2;
    private final int cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public sprmh cfr_renamed_1451() throws sprcsl {
        sprgwl sprgwl2 = this;
        sprgwl sprgwl3 = this;
        return new sprwrl(sprgwl3, sprgwl2.cfr_renamed_1, sprgwl2.cfr_renamed_3, sprgwl3.cfr_renamed_4);
    }

    public sprgwl cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprgwl(sprlem sprlem2, int n) {
        void arg0;
        sprgwl sprgwl2 = this;
        sprgwl sprgwl3 = this;
        sprgwl3.cfr_renamed_2 = new sprrsl();
        sprgwl2.cfr_renamed_1 = arg0;
        sprgwl2.cfr_renamed_3 = n;
    }

    public sprgwl(sprlem arg0) {
        this(arg0, -1);
    }

    public static /* synthetic */ sprrsl cfr_renamed_11004(sprgwl arg0) {
        return arg0.cfr_renamed_2;
    }
}

