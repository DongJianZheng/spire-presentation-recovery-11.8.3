/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprvva;

public class spraie {
    private sprcae cfr_renamed_4;

    public spraie(sprcae sprcae2) {
        this.cfr_renamed_4 = sprcae2;
    }

    public sprcae cfr_renamed_4651() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 1 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ 5 << 1;
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

    public static spraie cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraie) {
            return (spraie)arg0;
        }
        if (arg0 instanceof sprcae) {
            return new spraie(sprcae.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }
}

