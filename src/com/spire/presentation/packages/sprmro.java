/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprmro {
    public short cfr_renamed_2;
    public short cfr_renamed_3;
    public short cfr_renamed_4;

    public static sprmro cfr_renamed_18031(short[] arg0, int arg1) {
        int n = arg1 * 3;
        return new sprmro(arg0[n], arg0[n + 1], arg0[n + 2]);
    }

    public sprmro(int arg0, int arg1, int arg2) {
        this((short)arg0, (short)arg1, (short)arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprmro(short s, short s2, short s3) {
        void arg1;
        void arg0;
        sprmro sprmro2 = this;
        this.cfr_renamed_3 = arg0;
        sprmro2.cfr_renamed_4 = arg1;
        sprmro2.cfr_renamed_2 = s3;
    }

    public sprmro() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
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

