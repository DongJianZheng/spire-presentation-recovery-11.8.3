/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprox;
import com.spire.presentation.packages.sprpmk;

public class sprypk {
    public sprox cfr_renamed_2;
    public final String cfr_renamed_3;
    public String cfr_renamed_4;

    public sprypk cfr_renamed_9763(String arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 4;
        int n4 = n2;
        int n5 = 1 << 3 ^ 4;
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

    public sprypk(String string) {
        this.cfr_renamed_3 = string;
    }

    public sprpmk cfr_renamed_1451() {
        sprypk sprypk2 = this;
        return new sprpmk(sprypk2.cfr_renamed_3, sprypk2.cfr_renamed_4, this.cfr_renamed_2);
    }

    public sprypk cfr_renamed_9720(sprox arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }
}

