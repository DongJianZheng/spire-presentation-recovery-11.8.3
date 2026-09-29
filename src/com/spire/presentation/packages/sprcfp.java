/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjuaa;
import com.spire.presentation.packages.sprtbq;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprcfp {
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 1;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[2];
        nArray[0] = 0;
        nArray[1] = 1;
        return nArray;
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprjuaa.cfr_renamed_9("%'\u00011\u001a-\u001dr").equals(arg0)) {
            return 0;
        }
        if (sprtbq.cfr_renamed_9("\u0011z5l.p).").equals(arg0)) {
            return 1;
        }
        throw new IllegalArgumentException(sprjuaa.cfr_renamed_9("\u0017\u001d)\u001d-\u0004,S\u000e\t\u0001\u001c/\u0003\u0014\u00160\u0000+\u001c,S,\u0012/\u0016l"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 5;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 2 << 1;
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

    private /* synthetic */ sprcfp() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprtbq.cfr_renamed_9("\u0011z5l.p)/");
            }
            case 1: {
                return sprjuaa.cfr_renamed_9("%'\u00011\u001a-\u001ds");
            }
        }
        return sprtbq.cfr_renamed_9("\u0012q,q(h)?\u000be\u0004p*o\u0011z5l.p)?1~+j\"1");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprjuaa.cfr_renamed_9("%'\u00011\u001a-\u001dr");
            }
            case 1: {
                return sprtbq.cfr_renamed_9("\u0011z5l.p).");
            }
        }
        return sprjuaa.cfr_renamed_9("&,\u0018,\u001c5\u001db?80-\u001e2%'\u00011\u001a-\u001db\u0005#\u001f7\u0016l");
    }
}

