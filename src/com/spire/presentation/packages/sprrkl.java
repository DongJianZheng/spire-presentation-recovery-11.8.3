/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgxh;
import java.math.BigInteger;

public class sprrkl {
    public static int cfr_renamed_9919(BigInteger arg0) {
        return sprrkl.cfr_renamed_10167(arg0.bitLength());
    }

    public static int cfr_renamed_10167(int arg0) {
        if (arg0 >= 2048) {
            if (arg0 >= 3072) {
                if (arg0 >= 7680) {
                    if (arg0 >= 15360) {
                        return 256;
                    }
                    return 192;
                }
                return 128;
            }
            return 112;
        }
        if (arg0 >= 1024) {
            return 80;
        }
        return 20;
    }

    public static int cfr_renamed_9917(sprgxh arg0) {
        int n = (arg0.cfr_renamed_1938() + 1) / 2;
        if (n > 256) {
            return 256;
        }
        return n;
    }
}

