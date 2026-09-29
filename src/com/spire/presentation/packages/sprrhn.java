/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public class sprrhn {
    private short[] cfr_renamed_0;
    private int[] cfr_renamed_1;
    private int[] cfr_renamed_2;
    private short[] cfr_renamed_3;
    private short[] cfr_renamed_4;

    @sprtea
    public short[] cfr_renamed_13025() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public int[] cfr_renamed_13026() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public int[] cfr_renamed_13027() {
        return this.cfr_renamed_2;
    }

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        char c = '\u0001';
        int n3 = n2;
        int n4 = 4 << 3 ^ 3;
        while (n3 >= 0) {
            int n5 = n2--;
            cArray[n5] = (char)(s.charAt(n5) ^ n4);
            if (n2 < 0) break;
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ c);
            n3 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprrhn(int[] nArray, short[] sArray, int[] nArray2, short[] sArray2, short[] sArray3) {
        void arg4;
        void arg2;
        void arg1;
        void arg0;
        sprrhn sprrhn2 = this;
        sprrhn sprrhn3 = this;
        this.cfr_renamed_2 = arg0;
        sprrhn3.cfr_renamed_3 = arg1;
        sprrhn3.cfr_renamed_1 = arg2;
        sprrhn2.cfr_renamed_0 = arg4;
        sprrhn2.cfr_renamed_4 = sArray2;
    }

    @sprtea
    public short[] cfr_renamed_13028() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public short[] cfr_renamed_13029() {
        return this.cfr_renamed_3;
    }
}

