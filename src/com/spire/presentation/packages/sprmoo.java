/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfhf;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprywc;

@sprtea
public final class sprmoo {
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 0;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[2];
        nArray[0] = 0;
        nArray[1] = 1;
        return nArray;
    }

    private /* synthetic */ sprmoo() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 5;
        int cfr_ignored_0 = 5 << 3 ^ 4;
        int n4 = n2;
        int n5 = 4 << 3 ^ 3;
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

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprywc.cfr_renamed_9("G\u0019a\u0004w\u0013[\u0000q\u0004");
            }
            case 1: {
                return sprfhf.cfr_renamed_9("M'k:}-]'n1");
            }
        }
        return sprywc.cfr_renamed_9("#z\u001dz\u0019c\u001841p\u001fW\u0019y\u0006{\u0005}\u0002}\u0018s;{\u0012qVb\u0017x\u0003qX");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprfhf.cfr_renamed_9("M'k:}-Q>{:").equals(arg0)) {
            return 0;
        }
        if (sprywc.cfr_renamed_9("G\u0019a\u0004w\u0013W\u0019d\u000f").equals(arg0)) {
            return 1;
        }
        throw new IllegalArgumentException(sprfhf.cfr_renamed_9("K&u&q?phY,w\u000bq%n'm!j!p/S'z->&\u007f%{f"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprywc.cfr_renamed_9("G\u0019a\u0004w\u0013[\u0000q\u0004");
            }
            case 1: {
                return sprfhf.cfr_renamed_9("M'k:}-]'n1");
            }
        }
        return sprywc.cfr_renamed_9("#z\u001dz\u0019c\u001841p\u001fW\u0019y\u0006{\u0005}\u0002}\u0018s;{\u0012qVb\u0017x\u0003qX");
    }
}

