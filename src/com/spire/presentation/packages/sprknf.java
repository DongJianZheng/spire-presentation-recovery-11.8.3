/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprvof;
import java.io.Serializable;

public final class sprknf
implements Serializable {
    private static final long cfr_renamed_2 = 1L;
    private final byte[] cfr_renamed_3;
    private final int cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
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

    public int cfr_renamed_1452() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_97() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprknf(int n, byte[] byArray) {
        void arg0;
        sprknf sprknf2 = this;
        sprknf2.cfr_renamed_4 = arg0;
        sprknf2.cfr_renamed_3 = byArray;
    }
}

