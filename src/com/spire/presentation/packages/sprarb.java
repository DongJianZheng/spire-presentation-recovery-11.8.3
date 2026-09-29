/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajp;
import com.spire.presentation.packages.sprbb;
import com.spire.presentation.packages.sprepaa;
import com.spire.presentation.packages.sprjlb;
import com.spire.presentation.packages.sprtmb;
import com.spire.presentation.packages.sprytb;
import com.spire.presentation.packages.sprzb;
import java.math.BigInteger;

public abstract class sprarb {
    public static final sprbb cfr_renamed_3;
    public static final sprbb cfr_renamed_4;

    static {
        cfr_renamed_4 = new sprytb(BigInteger.valueOf(2L));
        cfr_renamed_3 = new sprytb(BigInteger.valueOf(3L));
    }

    public static sprzb cfr_renamed_1766(int[] arg0) {
        int n;
        if (arg0[0] != 0) {
            throw new IllegalArgumentException(sprajp.cfr_renamed_9("\u000fp4g\"w%k$n#\"6m*{(m+k'n5\"/lfE\u0000*t+fo3q2\".c0gfa)l5v'l2\"2g4o"));
        }
        int n2 = n = 1;
        while (n2 < arg0.length) {
            if (arg0[n] <= arg0[n - 1]) {
                throw new IllegalArgumentException(sprepaa.cfr_renamed_9(")O\u0015Y\u0017O\u0014I\u0018LYE\u0001P\u0016N\u001cN\rSYM\fS\r\u0000\u001bEYM\u0016N\rO\u0017I\u001aA\u0015L\u0000\u0000\u0010N\u001aR\u001cA\nI\u0017G"));
            }
            n2 = ++n;
        }
        return new sprtmb(cfr_renamed_4, new sprjlb(arg0));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprbb cfr_renamed_1767(BigInteger arg0) {
        BigInteger bigInteger = arg0;
        int n = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || n < 2) {
            throw new IllegalArgumentException(sprajp.cfr_renamed_9("%%j'p'a2g4k5v/aa\"+w5vf`#\"x?f0"));
        }
        if (n < 3) {
            switch (arg0.intValue()) {
                case 2: {
                    return cfr_renamed_4;
                }
                case 3: {
                    return cfr_renamed_3;
                }
            }
        }
        return new sprytb(arg0);
    }
}

