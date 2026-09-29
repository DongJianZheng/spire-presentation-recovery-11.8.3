/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.SecureRandom;

public class sprqna {
    public static int cfr_renamed_808(SecureRandom arg0, int arg1) {
        int n;
        int n2;
        int n3 = arg1;
        if ((n3 & -n3) == arg1) {
            return (int)((long)arg1 * (long)(arg0.nextInt() >>> 1) >> 31);
        }
        while ((n2 = arg0.nextInt() >>> 1) - (n = n2 % arg1) + (arg1 - 1) < 0) {
        }
        return n;
    }
}

