/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprwik;

public class sprejk {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        char c = '\u0001';
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int n3 = n2;
        int n4 = 3 << 3 ^ (2 ^ 5);
        while (n3 >= 0) {
            int n5 = n2--;
            cArray[n5] = (char)(s.charAt(n5) ^ n4);
            if (n2 < 0) break;
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ c);
            n3 = n2;
        }
        return new String(cArray);
    }

    public byte[] cfr_renamed_3045(int arg0, boolean arg1) {
        return new sprwik(null).cfr_renamed_3045(arg0, arg1);
    }
}

