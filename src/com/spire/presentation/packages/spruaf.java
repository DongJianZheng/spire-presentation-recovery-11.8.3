/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class spruaf {
    public static final int cfr_renamed_3 = 4;
    public static final int cfr_renamed_4 = 32;

    public static Integer cfr_renamed_279(int arg0) {
        return arg0;
    }

    public static int cfr_renamed_5201(int arg0) {
        return Integer.numberOfLeadingZeros(arg0);
    }

    public static int cfr_renamed_931(int arg0) {
        return Integer.bitCount(arg0);
    }

    public static int cfr_renamed_493(int arg0, int arg1) {
        return Integer.rotateRight(arg0, arg1);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 3;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 2 ^ 5;
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

    public static int cfr_renamed_5202(int arg0) {
        return Integer.reverseBytes(arg0);
    }

    public static int cfr_renamed_5203(int arg0) {
        return Integer.numberOfTrailingZeros(arg0);
    }

    public static int cfr_renamed_5204(int arg0) {
        return Integer.highestOneBit(arg0);
    }

    public static int cfr_renamed_494(int arg0, int arg1) {
        return Integer.rotateLeft(arg0, arg1);
    }

    public static int cfr_renamed_5205(int arg0) {
        return Integer.reverse(arg0);
    }

    public static int cfr_renamed_5206(int arg0) {
        return Integer.lowestOneBit(arg0);
    }
}

