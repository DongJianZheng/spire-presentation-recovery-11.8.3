/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcs;
import com.spire.presentation.packages.sprdqd;
import com.spire.presentation.packages.sprull;
import java.security.SecureRandom;

public class sprxyk
implements sprcs {
    @Override
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
    }

    @Override
    public String cfr_renamed_3389() {
        return "PKCS7";
    }

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprull {
        int n;
        byte by = arg0[arg0.length - 1];
        int n2 = by & 0xFF;
        int n3 = arg0.length - n2;
        int n4 = (n3 | n2 - 1) >> 31;
        int n5 = n = 0;
        while (n5 < arg0.length) {
            int n6 = arg0[n] ^ by;
            int n7 = ~(n - n3 >> 31);
            n4 |= n6 & n7;
            n5 = ++n;
        }
        if (n4 != 0) {
            throw new sprull(sprdqd.cfr_renamed_9("blv-pa}ny-qb`\u007fg}fhv"));
        }
        return n2;
    }

    @Override
    public int cfr_renamed_3210(byte[] arg0, int arg1) {
        byte by = (byte)(arg0.length - arg1);
        int n = arg1;
        while (n < arg0.length) {
            arg0[arg1++] = by;
            n = arg1;
        }
        return by;
    }
}

