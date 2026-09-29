/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlyo;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprzhp;

@sprtea
public class sprvro {
    private sprzhp cfr_renamed_3;
    private sprlyo[] cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 1 << 1;
        int cfr_ignored_0 = 2 << 3;
        int n4 = n2;
        int n5 = 4 << 4 ^ (3 << 2 ^ 1);
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

    public static sprvro cfr_renamed_18689(sprujo arg0, long arg1) {
        int n;
        arg0.cfr_renamed_14060().cfr_renamed_11547(arg1, 0);
        sprvro sprvro2 = new sprvro();
        sprujo sprujo2 = arg0;
        int n2 = sprujo2.cfr_renamed_13218();
        int n3 = sprujo2.cfr_renamed_13218();
        int[] nArray = sprrzo.cfr_renamed_18661(sprujo2, n3 & 0xFFFF);
        sprlyo[] sprlyoArray = new sprlyo[n3];
        int n4 = n = 0;
        while (n4 < (n3 & 0xFFFF)) {
            int n5 = n;
            sprlyo sprlyo2 = sprlyo.cfr_renamed_18689(arg0, arg1 + (long)(nArray[n] & 0xFFFF));
            sprlyoArray[n5] = sprlyo2;
            n4 = ++n;
        }
        sprvro2.cfr_renamed_4 = sprlyoArray;
        sprvro2.cfr_renamed_3 = sprzhp.cfr_renamed_18689(arg0, arg1 + (long)(n2 & 0xFFFF));
        return sprvro2;
    }
}

