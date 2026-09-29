/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprw;
import java.util.Collection;

public abstract class sprwlb {
    public abstract Collection cfr_renamed_150(sprb var1);

    public abstract void cfr_renamed_151(sprw var1);

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = 4 << 3 ^ 5;
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 << 2 ^ 1);
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

