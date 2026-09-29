/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public final class sprhra {
    public static byte[] cfr_renamed_429(char[] arg0) {
        int n;
        byte[] byArray = new byte[arg0.length];
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            int n3 = n--;
            byArray[n3] = (byte)arg0[n3];
            n2 = n;
        }
        return byArray;
    }

    private /* synthetic */ sprhra() {
    }

    public static byte[] cfr_renamed_1105(char[] arg0) {
        int n;
        int n2;
        byte[] byArray = new byte[arg0.length];
        int n3 = n2 = 0;
        while (n3 < arg0.length) {
            int n4 = n2++;
            byArray[n4] = (byte)arg0[n4];
            n3 = n2;
        }
        n2 = byArray.length * 2;
        byte[] byArray2 = new byte[n2 + 2];
        int n5 = 0;
        int n6 = n = 0;
        while (n6 < byArray.length) {
            n5 = n * 2;
            byArray2[n5] = 0;
            byte by = byArray[n];
            byArray2[n5 + 1] = by;
            n6 = ++n;
        }
        byArray2[n2] = 0;
        byArray2[n2 + 1] = 0;
        return byArray2;
    }

    public static char[] cfr_renamed_1106(char[] arg0) {
        char[] cArray = new char[arg0.length];
        System.arraycopy(arg0, 0, cArray, 0, arg0.length);
        return cArray;
    }

    public static boolean cfr_renamed_1107(char[] arg0, char[] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            return false;
        }
        boolean bl = true;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            bl &= arg0[n] == arg1[n];
            n2 = --n;
        }
        return bl;
    }
}

