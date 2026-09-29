/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqy;
import com.spire.presentation.packages.sprbdh;
import com.spire.presentation.packages.sprezh;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprik;
import com.spire.presentation.packages.sprjd;
import com.spire.presentation.packages.sprohh;
import com.spire.presentation.packages.sprskh;
import java.math.BigInteger;

public abstract class sprrhh {
    public static final sprjd cfr_renamed_3;
    public static final sprjd cfr_renamed_4;

    public static sprik cfr_renamed_1766(int[] arg0) {
        int n;
        if (arg0[0] != 0) {
            throw new IllegalArgumentException(sprezh.cfr_renamed_9("Gu|bjrmnlkk'~hb~`hcnok}'gi.@H/<..j{tz'ffxb.dai}soiz'zb|j"));
        }
        int n2 = n = 1;
        while (n2 < arg0.length) {
            if (arg0[n] <= arg0[n - 1]) {
                throw new IllegalArgumentException(spraqy.cfr_renamed_9("\u0003V?@=V>P2Us\\+I<W6W'JsT&J'\u00191\\sT<W<M<W:Z2U?@sP=Z!\\2J:W4"));
            }
            n2 = ++n;
        }
        return new sprskh(cfr_renamed_4, new sprohh(arg0));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprjd cfr_renamed_1767(BigInteger arg0) {
        BigInteger bigInteger = arg0;
        int n = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || n < 2) {
            throw new IllegalArgumentException(sprezh.cfr_renamed_9(" moouodzb|n}sgd)'cr}s.ek'0:.5"));
        }
        if (n < 3) {
            switch (sprhdf.cfr_renamed_5225(arg0)) {
                case 2: {
                    return cfr_renamed_4;
                }
                case 3: {
                    return cfr_renamed_3;
                }
            }
        }
        return new sprbdh(arg0);
    }

    static {
        cfr_renamed_4 = new sprbdh(BigInteger.valueOf(2L));
        cfr_renamed_3 = new sprbdh(BigInteger.valueOf(3L));
    }
}

