/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfzd;
import com.spire.presentation.packages.sprjje;
import com.spire.presentation.packages.sprszd;

public class spruqd {
    private sprjje cfr_renamed_4;

    public sprfzd cfr_renamed_4270() {
        return new sprfzd(this.cfr_renamed_4.cfr_renamed_4281());
    }

    public sprszd cfr_renamed_4282() {
        return this.cfr_renamed_4.cfr_renamed_4282();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 << 2 ^ 1);
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

    public spruqd(sprjje sprjje2) {
        this.cfr_renamed_4 = sprjje2;
    }
}

