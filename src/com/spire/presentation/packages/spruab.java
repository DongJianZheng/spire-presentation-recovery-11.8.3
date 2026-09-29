/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;

public class spruab {
    private sprlc cfr_renamed_4;

    public byte[] cfr_renamed_1370(byte[] arg0) {
        byte[] byArray = new byte[arg0.length];
        this.cfr_renamed_4.cfr_renamed_1197(arg0, 0, arg0.length);
        spruab spruab2 = this;
        byArray = new byte[spruab2.cfr_renamed_4.cfr_renamed_1218()];
        spruab2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        spruab spruab3 = this;
        spruab3.cfr_renamed_1379(arg0, byArray);
        spruab3.cfr_renamed_1380(arg0);
        return byArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3;
        int n4 = n2;
        int n5 = 1 << 3 ^ 1;
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

    private /* synthetic */ void cfr_renamed_1379(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            int n4;
            int n5 = n4 = (0xFF & arg0[n]) + (0xFF & arg1[n]) + n2;
            arg0[n] = (byte)n5;
            n2 = (byte)(n5 >> 8);
            n3 = ++n;
        }
    }

    public spruab(sprlc sprlc2) {
        this.cfr_renamed_4 = sprlc2;
    }

    private /* synthetic */ void cfr_renamed_1380(byte[] arg0) {
        int n;
        int n2 = 1;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            int n4;
            int n5 = n4 = (0xFF & arg0[n]) + n2;
            arg0[n] = (byte)n5;
            n2 = (byte)(n5 >> 8);
            n3 = ++n;
        }
    }
}

