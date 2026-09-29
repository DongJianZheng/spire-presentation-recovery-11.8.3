/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproqda;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzofa;

@sprtea
public final class sprbjo {
    public static final int cfr_renamed_91 = 5;
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 5;
    public static final int cfr_renamed_2 = 3;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 2;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 3;
        int n4 = n2;
        int n5 = 2 << 3 ^ 2;
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

    private /* synthetic */ sprbjo() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return sproqda.cfr_renamed_9("Btg");
            }
            case 2: {
                return sprzofa.cfr_renamed_9("=c");
            }
            case 3: {
                return sproqda.cfr_renamed_9("[uq");
            }
            case 4: {
                return sprzofa.cfr_renamed_9("6x\u0014w");
            }
            case 5: {
                return sproqda.cfr_renamed_9("Yljz");
            }
        }
        return sprzofa.cfr_renamed_9("'\u007f\u0019\u007f\u001df\u001c15u\u001bC\u0017v\u001b~\u001c\\\u001du\u00171\u0004p\u001ed\u0017?");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1: {
                return sproqda.cfr_renamed_9("Btg");
            }
            case 2: {
                return sprzofa.cfr_renamed_9("=c");
            }
            case 3: {
                return sproqda.cfr_renamed_9("[uq");
            }
            case 4: {
                return sprzofa.cfr_renamed_9("6x\u0014w");
            }
            case 5: {
                return sproqda.cfr_renamed_9("Yljz");
            }
        }
        return sprzofa.cfr_renamed_9("'\u007f\u0019\u007f\u001df\u001c15u\u001bC\u0017v\u001b~\u001c\\\u001du\u00171\u0004p\u001ed\u0017?");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sproqda.cfr_renamed_9("Btg").equals(arg0)) {
            return 1;
        }
        if (sprzofa.cfr_renamed_9("=c").equals(arg0)) {
            return 2;
        }
        if (sproqda.cfr_renamed_9("[uq").equals(arg0)) {
            return 3;
        }
        if (sprzofa.cfr_renamed_9("6x\u0014w").equals(arg0)) {
            return 4;
        }
        if (sproqda.cfr_renamed_9("Yljz").equals(arg0)) {
            return 5;
        }
        throw new IllegalArgumentException(sprzofa.cfr_renamed_9("D\u001cz\u001c~\u0005\u007fRV\u0016x t\u0015x\u001d\u007f?~\u0016tR\u007f\u0013|\u0017?"));
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[5];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 3;
        nArray[3] = 4;
        nArray[4] = 5;
        return nArray;
    }
}

