/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnje;

public class sprgad {
    private final sprnje cfr_renamed_4;

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    public sprnje cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprgad(sprnje sprnje2) {
        this.cfr_renamed_4 = sprnje2;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprgad) {
            return this.cfr_renamed_4.equals(((sprgad)arg0).cfr_renamed_4);
        }
        return false;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 5 << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 2;
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

