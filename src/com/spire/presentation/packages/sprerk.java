/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcs;
import com.spire.presentation.packages.sprkki;
import com.spire.presentation.packages.sprljn;
import com.spire.presentation.packages.sprull;
import java.security.SecureRandom;

public class sprerk
implements sprcs {
    @Override
    public int cfr_renamed_3210(byte[] arg0, int arg1) {
        int n = arg0.length - arg1;
        arg0[arg1++] = -128;
        int n2 = arg1;
        while (n2 < arg0.length) {
            arg0[arg1++] = 0;
            n2 = arg1;
        }
        return n;
    }

    @Override
    public void cfr_renamed_3251(SecureRandom arg0) throws IllegalArgumentException {
    }

    @Override
    public int cfr_renamed_3236(byte[] arg0) throws sprull {
        int n = -1;
        int n2 = -1;
        int n3 = arg0.length;
        while (--n3 >= 0) {
            int n4 = arg0[n3] & 0xFF;
            int n5 = (n4 ^ 0) - 1 >> 31;
            int n6 = (n4 ^ 0x80) - 1 >> 31;
            int n7 = n;
            n = n7 ^ (n3 ^ n7) & (n2 & n6);
            n2 &= n5;
        }
        if (n < 0) {
            throw new sprull(sprljn.cfr_renamed_9("\u0000Q\u0014\u0010\u0012\\\u001fS\u001b\u0010\u0013_\u0002B\u0005@\u0004U\u0014"));
        }
        return arg0.length - n;
    }

    @Override
    public String cfr_renamed_3389() {
        return sprkki.cfr_renamed_9("\u001a<\u001cXk^eBg");
    }
}

