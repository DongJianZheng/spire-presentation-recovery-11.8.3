/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprkoe;

public abstract class sprkuh {
    public byte[] cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public int cfr_renamed_4;

    public abstract sprbj cfr_renamed_1518(int var1, int var2);

    public abstract sprbj cfr_renamed_249(int var1);

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1515(byte[] byArray, byte[] byArray2, int n) {
        void arg1;
        void arg0;
        sprkuh sprkuh2 = this;
        this.cfr_renamed_3 = arg0;
        sprkuh2.cfr_renamed_2 = arg1;
        sprkuh2.cfr_renamed_4 = n;
    }

    public abstract sprbj cfr_renamed_1523(int var1);

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3;
        int cfr_ignored_0 = 1 << 3 ^ 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 1;
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

    public static byte[] cfr_renamed_1516(char[] arg0) {
        if (arg0 != null && arg0.length > 0) {
            int n;
            byte[] byArray = new byte[(arg0.length + 1) * 2];
            int n2 = n = 0;
            while (n2 != arg0.length) {
                byArray[n * 2] = (byte)(arg0[n] >>> 8);
                int n3 = n * 2 + 1;
                byte by = (byte)arg0[n];
                byArray[n3] = by;
                n2 = ++n;
            }
            return byArray;
        }
        return new byte[0];
    }

    public static byte[] cfr_renamed_1606(char[] arg0) {
        if (arg0 != null) {
            int n;
            byte[] byArray = new byte[arg0.length];
            int n2 = n = 0;
            while (n2 != byArray.length) {
                int n3 = n++;
                byArray[n3] = (byte)arg0[n3];
                n2 = n;
            }
            return byArray;
        }
        return new byte[0];
    }

    public static byte[] cfr_renamed_2400(char[] arg0) {
        if (arg0 != null) {
            return sprkoe.cfr_renamed_432(arg0);
        }
        return new byte[0];
    }

    public byte[] cfr_renamed_1477() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_1601() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1478() {
        return this.cfr_renamed_4;
    }
}

