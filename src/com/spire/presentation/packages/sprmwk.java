/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcs;
import com.spire.presentation.packages.sprnjb;
import com.spire.presentation.packages.sprull;
import java.security.SecureRandom;

public class sprmwk
implements sprcs {
    @Override
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
    }

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprull {
        int n = 0;
        int n2 = -1;
        int n3 = arg0.length;
        while (--n3 >= 0) {
            int n4 = (arg0[n3] & 0xFF ^ 0) - 1 >> 31;
            n -= (n2 &= n4);
        }
        return n;
    }

    @Override
    public String cfr_renamed_3389() {
        return sprnjb.cfr_renamed_9(":8\u00122\"$\u00148");
    }

    @Override
    public int cfr_renamed_3210(byte[] arg0, int arg1) {
        int n = arg0.length - arg1;
        int n2 = arg1;
        while (n2 < arg0.length) {
            arg0[arg1++] = 0;
            n2 = arg1;
        }
        return n;
    }
}

