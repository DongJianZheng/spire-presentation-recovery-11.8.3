/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprxuo;

@sprtea
public class sprzvo {
    public static sprxuo[] cfr_renamed_18701(sprujo arg0, int arg1) {
        int n;
        sprxuo[] sprxuoArray = new sprxuo[arg1];
        int n2 = n = 0;
        while (n2 < arg1) {
            sprxuoArray[n++] = sprzvo.cfr_renamed_18699(arg0);
            n2 = n;
        }
        return sprxuoArray;
    }

    public static sprxuo cfr_renamed_18699(sprujo arg0) {
        return new sprxuo(arg0.cfr_renamed_12254(), arg0.cfr_renamed_13218());
    }

    private /* synthetic */ sprzvo() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 5;
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

