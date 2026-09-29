/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprwff;

public abstract class sprcye {
    public int cfr_renamed_4;

    public abstract boolean equals(Object var1);

    public abstract boolean cfr_renamed_805();

    public abstract byte[] cfr_renamed_91();

    public abstract int hashCode();

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 5;
        int cfr_ignored_0 = 2 << 3 ^ 2;
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 ^ 5) << 1;
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

    public abstract String toString();

    public abstract sprcye cfr_renamed_5467(sprwff var1);

    public abstract sprcye cfr_renamed_5468(sprcye var1);

    public final int cfr_renamed_806() {
        return this.cfr_renamed_4;
    }
}

