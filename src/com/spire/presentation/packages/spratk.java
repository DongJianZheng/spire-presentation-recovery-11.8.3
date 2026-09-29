/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbkn;
import com.spire.presentation.packages.sprbtk;
import com.spire.presentation.packages.sprdyg;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprook;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprxk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryye;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spratk
implements sprxk {
    private SecureRandom cfr_renamed_0;
    private sprjs cfr_renamed_1;
    private static final BigInteger cfr_renamed_2 = BigInteger.valueOf(0L);
    private final int cfr_renamed_3;
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(1L);

    public static byte[] cfr_renamed_10123(sprjs arg0, BigInteger arg1, BigInteger arg2, int arg3) {
        byte[] byArray = sprhdf.cfr_renamed_512((arg1.bitLength() + 7) / 8, arg2);
        sprjs sprjs2 = arg0;
        sprjs sprjs3 = arg0;
        sprjs2.cfr_renamed_5671(new sprook(byArray, null));
        byte[] byArray2 = new byte[arg3];
        sprjs2.cfr_renamed_2341(byArray2, 0, byArray2.length);
        return byArray2;
    }

    @Override
    public sprki cfr_renamed_5686(spryye arg0) {
        sprkik sprkik2 = (sprkik)arg0;
        if (sprkik2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprdyg.cfr_renamed_9("@\u0007R\u001eY\u0011\u0010\u0019U\u000b\u0010\u0000U\u0003E\u001bB\u0017TRV\u001dBRU\u001cS\u0000I\u0002D\u001b_\u001c"));
        }
        sprybl.cfr_renamed_9170(new sprfdl(sprbkn.cfr_renamed_9("x0k(O\u000e"), sprrkl.cfr_renamed_9919(sprkik2.cfr_renamed_2295()), sprkik2, spriil.cfr_renamed_3));
        sprkik sprkik3 = sprkik2;
        BigInteger bigInteger = sprkik3.cfr_renamed_2295();
        BigInteger bigInteger2 = sprkik3.cfr_renamed_360();
        BigInteger bigInteger3 = sprhdf.cfr_renamed_513(cfr_renamed_2, bigInteger.subtract(cfr_renamed_4), this.cfr_renamed_0);
        BigInteger bigInteger4 = bigInteger3.modPow(bigInteger2, bigInteger);
        byte[] byArray = sprhdf.cfr_renamed_512((bigInteger.bitLength() + 7) / 8, bigInteger4);
        return new sprbtk(spratk.cfr_renamed_10123(this.cfr_renamed_1, bigInteger, bigInteger3, this.cfr_renamed_3), byArray);
    }

    /*
     * WARNING - void declaration
     */
    public spratk(int n, sprjs sprjs2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        spratk spratk2 = this;
        this.cfr_renamed_3 = arg0;
        spratk2.cfr_renamed_1 = arg1;
        spratk2.cfr_renamed_0 = secureRandom;
    }
}

