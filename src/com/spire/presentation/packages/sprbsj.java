/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprupn;
import java.util.HashSet;
import java.util.Set;

public class sprbsj {
    private static final Set<String> cfr_renamed_4 = new HashSet<String>();

    static {
        cfr_renamed_4.add("DES");
        cfr_renamed_4.add(sprupn.cfr_renamed_9("0l'l0l"));
        cfr_renamed_4.add(sprgt.cfr_renamed_2.cfr_renamed_19());
        cfr_renamed_4.add(sprdl.cfr_renamed_2797.cfr_renamed_19());
        cfr_renamed_4.add(sprdl.cfr_renamed_152.cfr_renamed_19());
    }

    public static boolean cfr_renamed_9390(String arg0) {
        String string = sprkoe.cfr_renamed_116(arg0);
        return cfr_renamed_4.contains(string);
    }

    public static void cfr_renamed_1520(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            byte by = arg0[n];
            arg0[n++] = (byte)(by & 0xFE | (by >> 1 ^ by >> 2 ^ by >> 3 ^ by >> 4 ^ by >> 5 ^ by >> 6 ^ by >> 7 ^ 1) & 1);
            n2 = n;
        }
    }
}

