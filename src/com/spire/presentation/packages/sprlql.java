/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreol;
import com.spire.presentation.packages.sprixl;
import com.spire.presentation.packages.sprjx;

public class sprlql {
    private final sprjx cfr_renamed_4;

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 3 << 3 ^ 5;
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

    public sprlql(sprjx sprjx2) {
        this.cfr_renamed_4 = sprjx2;
    }

    public spreol cfr_renamed_10941(String arg0) throws sprixl {
        return new spreol(this.cfr_renamed_4.cfr_renamed_10941(arg0).cfr_renamed_8434());
    }
}

