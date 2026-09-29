/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhxa;
import com.spire.presentation.packages.sprpug;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprxeo {
    public static final int cfr_renamed_1 = 3;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 1;

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((0 & arg0) == 0) {
            hashSet.add("Default");
        }
        if ((1 & arg0) == 1) {
            hashSet.add(sprhxa.cfr_renamed_9("g\u0015[\u0003\u0006L"));
        }
        if ((2 & arg0) == 2) {
            hashSet.add(sprpug.cfr_renamed_9("hwTalw"));
        }
        return hashSet;
    }

    private /* synthetic */ sprxeo() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if ("Default".equals(arg0)) {
            return 0;
        }
        if (sprhxa.cfr_renamed_9("g\u0015[\u0003\u0006L").equals(arg0)) {
            return 1;
        }
        if (sprpug.cfr_renamed_9("hwTalw").equals(arg0)) {
            return 2;
        }
        throw new IllegalArgumentException(sprhxa.cfr_renamed_9("/Y\u0011Y\u0015@\u0014\u0017=S\u0013g\u0015[\u0003c\u0003G\u001f\u0017\u0014V\u0017RT"));
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[3];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        return nArray;
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprxeo.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return "Default";
            }
            case 1: {
                return sprpug.cfr_renamed_9("hwTa\t.");
            }
            case 2: {
                return sprhxa.cfr_renamed_9("g\u0015[\u0003c\u0015");
            }
        }
        return sprpug.cfr_renamed_9("mvSvWoV8\u007f|QHWtALAh]8NyTm]6");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return "Default";
            }
            case 1: {
                return sprhxa.cfr_renamed_9("g\u0015[\u0003\u0006L");
            }
            case 2: {
                return sprpug.cfr_renamed_9("hwTalw");
            }
        }
        return sprhxa.cfr_renamed_9("b\u0014\\\u0014X\rYZp\u001e^*X\u0016N.N\nRZA\u001b[\u000fRT");
    }
}

