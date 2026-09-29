/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcs;
import com.spire.presentation.packages.sprjre;
import com.spire.presentation.packages.sprull;
import java.security.SecureRandom;

public class sprhbl
implements sprcs {
    @Override
    public String cfr_renamed_3389() {
        return sprjre.cfr_renamed_9("K\t\\");
    }

    @Override
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
    }

    @Override
    public int cfr_renamed_3210(byte[] arg0, int arg1) {
        int n;
        byte by;
        int n2 = arg0.length - arg1;
        if (arg1 > 0) {
            by = (byte)((arg0[arg1 - 1] & 1) == 0 ? 255 : 0);
            n = arg1;
        } else {
            by = (byte)((arg0[arg0.length - 1] & 1) == 0 ? 255 : 0);
            n = arg1;
        }
        while (n < arg0.length) {
            arg0[arg1++] = by;
            n = arg1;
        }
        return n2;
    }

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprull {
        int n = arg0.length;
        int n2 = arg0[--n] & 0xFF;
        int n3 = 1;
        int n4 = -1;
        while (--n >= 0) {
            int n5 = (arg0[n] & 0xFF ^ n2) - 1 >> 31;
            n3 -= (n4 &= n5);
        }
        return n3;
    }
}

