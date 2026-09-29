/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprpwp;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryno;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spryqk {
    private sprkik cfr_renamed_1;
    private static BigInteger cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private static BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_3502() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (this.cfr_renamed_1 == null) {
            throw new IllegalStateException(spryno.cfr_renamed_9("!v(v4r2|43(|23/}/g/r*z5v\""));
        }
        BigInteger bigInteger3 = this.cfr_renamed_1.cfr_renamed_2295();
        int n = bigInteger3.bitLength() - 1;
        do {
            bigInteger2 = sprhdf.cfr_renamed_5230(n, this.cfr_renamed_3);
            bigInteger = bigInteger2.gcd(bigInteger3);
        } while (bigInteger2.equals(cfr_renamed_4) || bigInteger2.equals(cfr_renamed_2) || !bigInteger.equals(cfr_renamed_2));
        return bigInteger2;
    }

    static {
        cfr_renamed_4 = BigInteger.valueOf(0L);
        cfr_renamed_2 = BigInteger.valueOf(1L);
    }

    public void cfr_renamed_5692(sprbj arg0) {
        spryqk spryqk2;
        if (arg0 instanceof sprbgk) {
            sprbgk sprbgk2 = (sprbgk)arg0;
            this.cfr_renamed_1 = (sprkik)sprbgk2.cfr_renamed_284();
            spryqk2 = this;
            this.cfr_renamed_3 = sprbgk2.cfr_renamed_1295();
        } else {
            this.cfr_renamed_1 = (sprkik)arg0;
            spryqk2 = this;
            this.cfr_renamed_3 = sprybl.cfr_renamed_2794();
        }
        if (spryqk2.cfr_renamed_1 instanceof sprkhk) {
            throw new IllegalArgumentException(sprpwp.cfr_renamed_9("V*_*C.E CoC*@:X=T<\u0011\u001db\u000e\u0011?D-]&RoZ*H"));
        }
    }
}

