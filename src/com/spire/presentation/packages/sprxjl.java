/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcgp;
import com.spire.presentation.packages.sprevk;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprlal;
import com.spire.presentation.packages.sprvhl;
import com.spire.presentation.packages.sprybl;
import java.math.BigInteger;

public class sprxjl {
    private sprevk cfr_renamed_4;

    public byte[] cfr_renamed_5695(sprbj arg0) {
        sprlal sprlal2 = (sprlal)arg0;
        sprvhl sprvhl2 = new sprvhl();
        sprvhl sprvhl3 = new sprvhl();
        sprvhl sprvhl4 = sprvhl2;
        sprvhl4.cfr_renamed_5692(this.cfr_renamed_4.cfr_renamed_2095());
        BigInteger bigInteger = sprvhl4.cfr_renamed_5695(sprlal2.cfr_renamed_3351());
        sprvhl sprvhl5 = sprvhl3;
        sprvhl5.cfr_renamed_5692(this.cfr_renamed_4.cfr_renamed_2094());
        BigInteger bigInteger2 = sprvhl5.cfr_renamed_5695(sprlal2.cfr_renamed_2096());
        int n = this.cfr_renamed_1938();
        byte[] byArray = new byte[n * 2];
        sprhdf.cfr_renamed_5224(bigInteger2, byArray, 0, n);
        int n2 = n;
        sprhdf.cfr_renamed_5224(bigInteger, byArray, n2, n2);
        return byArray;
    }

    public void cfr_renamed_5692(sprbj arg0) {
        this.cfr_renamed_4 = (sprevk)arg0;
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10591(sprcgp.cfr_renamed_9("\u001a\b\u001c\u000f\u0017\u001e"), this.cfr_renamed_4.cfr_renamed_2095()));
    }

    public int cfr_renamed_1938() {
        return (this.cfr_renamed_4.cfr_renamed_2095().cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938() + 7) / 8;
    }
}

