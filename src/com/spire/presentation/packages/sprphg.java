/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public abstract class sprphg {
    public final int cfr_renamed_1;
    public final int cfr_renamed_2;
    private static final long[] cfr_renamed_3;
    public final int cfr_renamed_4;

    static {
        long[] lArray = new long[6];
        lArray[0] = 0x5555555555555555L;
        lArray[1] = 0x3333333333333333L;
        lArray[2] = 0xF0F0F0F0F0F0F0FL;
        lArray[3] = 0xFF00FF00FF00FFL;
        lArray[4] = 0xFFFF0000FFFFL;
        lArray[5] = 0xFFFFFFFFL;
        cfr_renamed_3 = lArray;
    }

    public abstract void cfr_renamed_7164(short[] var1, byte[] var2);

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_7184(long[] lArray, long[] lArray2, int n) {
        long l;
        long l2;
        long l3;
        void var8_7;
        void var7_6;
        int n2;
        long l4;
        long[] arg0;
        void arg1;
        void arg2;
        void v0 = arg2;
        System.arraycopy(arg1, (int)v0, arg0, (int)v0, 64);
        int n3 = 5;
        do {
            l4 = cfr_renamed_3[n3];
            n2 = 1 << n3;
            void v1 = arg2;
            while (v1 < arg2 + 64) {
                void v2 = var7_6;
                while (v2 < var7_6 + n2) {
                    long[] lArray3 = arg0;
                    long[] lArray4 = arg0;
                    l3 = lArray3[var8_7 + false];
                    l2 = lArray4[var8_7 + true];
                    l = lArray3[var8_7 + 2];
                    long l5 = lArray4[var8_7 + 3];
                    long l6 = lArray3[var8_7 + n2 + false];
                    long l7 = lArray4[var8_7 + n2 + true];
                    long l8 = lArray3[var8_7 + n2 + 2];
                    long l9 = lArray4[var8_7 + n2 + 3];
                    long l10 = (l3 >>> n2 ^ l6) & l4;
                    long l11 = (l2 >>> n2 ^ l7) & l4;
                    long l12 = (l >>> n2 ^ l8) & l4;
                    long l13 = (l5 >>> n2 ^ l9) & l4;
                    lArray3[var8_7 + false] = l3 ^ l10 << n2;
                    lArray4[var8_7 + true] = l2 ^ l11 << n2;
                    lArray3[var8_7 + 2] = l ^ l12 << n2;
                    lArray4[var8_7 + 3] = l5 ^ l13 << n2;
                    lArray3[var8_7 + n2 + false] = l6 ^ l10;
                    lArray4[var8_7 + n2 + true] = l7 ^ l11;
                    lArray3[var8_7 + n2 + 2] = l8 ^ l12;
                    void v5 = var8_7 + n2 + 3;
                    lArray4[v5] = l9 ^ l13;
                    v2 = var8_7 += 4;
                }
                v1 = var7_6 + n2 * 2;
            }
        } while (--n3 >= 2);
        do {
            l4 = cfr_renamed_3[n3];
            n2 = 1 << n3;
            void v6 = arg2;
            while (v6 < arg2 + 64) {
                void v7 = var7_6;
                while (v7 < var7_6 + n2) {
                    long[] lArray5 = arg0;
                    long[] lArray6 = arg0;
                    l3 = lArray5[var8_7 + false];
                    l2 = lArray6[var8_7 + n2];
                    l = (l3 >>> n2 ^ l2) & l4;
                    lArray5[var8_7 + false] = l3 ^ l << n2;
                    void v10 = var8_7 + n2;
                    lArray6[v10] = l2 ^ l;
                    v7 = ++var8_7;
                }
                v6 = var7_6 + n2 * 2;
            }
        } while (--n3 >= 0);
    }

    /*
     * WARNING - void declaration
     */
    public sprphg(int n, int n2, int n3) {
        void arg1;
        void arg0;
        sprphg sprphg2 = this;
        this.cfr_renamed_1 = arg0;
        sprphg2.cfr_renamed_2 = arg1;
        sprphg2.cfr_renamed_4 = n3;
    }

    public static void cfr_renamed_7185(long[] arg0, long[] arg1) {
        sprphg.cfr_renamed_7184(arg0, arg1, 0);
    }
}

