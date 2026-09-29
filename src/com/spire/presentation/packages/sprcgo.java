/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraio;
import com.spire.presentation.packages.sprctp;
import com.spire.presentation.packages.sprkfo;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;

@sprtea
public abstract class sprcgo {
    private static final int cfr_renamed_4 = 2;

    public abstract int cfr_renamed_16232(int var1);

    public static sprcgo cfr_renamed_1716(int arg0) {
        if (arg0 == 2) {
            return new spraio();
        }
        int n = sprctp.cfr_renamed_16449(arg0, 1252);
        return new sprkfo(sprszca.cfr_renamed_12817(n));
    }

    public abstract String cfr_renamed_14565(byte[] var1);

    public abstract String cfr_renamed_16261(byte[] var1);

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 4;
        int cfr_ignored_0 = 1 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 3 << 3 ^ 2;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }
}

