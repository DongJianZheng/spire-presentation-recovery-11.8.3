/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhsk;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprrica;
import java.math.BigInteger;

public class sprytk
extends sprhsk {
    private static final BigInteger cfr_renamed_2;
    private static final BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    static {
        cfr_renamed_3 = BigInteger.valueOf(1L);
        cfr_renamed_2 = BigInteger.valueOf(2L);
    }

    private /* synthetic */ BigInteger cfr_renamed_9988(BigInteger arg0, sprmqk arg1) {
        if (arg1 != null) {
            if (cfr_renamed_2.compareTo(arg0) <= 0 && arg1.cfr_renamed_1155().subtract(cfr_renamed_2).compareTo(arg0) >= 0 && cfr_renamed_3.equals(arg0.modPow(arg1.cfr_renamed_1604(), arg1.cfr_renamed_1155()))) {
                return arg0;
            }
            throw new IllegalArgumentException(sprrica.cfr_renamed_9("$\u0002+C1W8\u00029M8Q}L2V}C-R8C/\u0002)M}@8\u00024L}A2P/G>V}E/M(R"));
        }
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprytk(BigInteger bigInteger, sprmqk sprmqk2) {
        void arg1;
        sprytk sprytk2 = this;
        super(false, (sprmqk)arg1);
        sprytk2.cfr_renamed_4 = sprytk2.cfr_renamed_9988(bigInteger, (sprmqk)arg1);
    }

    public BigInteger spr\u3181() {
        return this.cfr_renamed_4;
    }
}

