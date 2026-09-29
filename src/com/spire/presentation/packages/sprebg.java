/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnvf;

public class sprebg {
    public static final int[] cfr_renamed_4;

    static {
        int[] nArray = new int[11];
        nArray[0] = 0;
        nArray[1] = 101498;
        nArray[2] = 208714;
        nArray[3] = 428865;
        nArray[4] = 892039;
        nArray[5] = 1852696;
        nArray[6] = 3842630;
        nArray[7] = 7959734;
        nArray[8] = 16468416;
        nArray[9] = 34034726;
        nArray[10] = 70265242;
        cfr_renamed_4 = nArray;
    }

    public int cfr_renamed_6867(int arg0, short[] arg1, int arg2, int arg3) {
        int n;
        int n2 = 1 << arg3;
        int n3 = -(arg0 >>> 31);
        int n4 = n = 0;
        while (n4 < n2) {
            short s;
            short s2 = s = arg1[arg2 + n];
            n3 |= (arg0 += s2 * s2);
            n4 = ++n;
        }
        if (((long)(arg0 |= -(n3 >>> 31)) & 0xFFFFFFFFL) <= (long)cfr_renamed_4[arg3]) {
            return 1;
        }
        return 0;
    }

    public void cfr_renamed_6896(sprnvf arg0, short[] arg1, int arg2, int arg3) {
        int n = 1 << arg3;
        while (n > 0) {
            byte[] byArray = new byte[2];
            arg0.cfr_renamed_6804(byArray, 0, 2);
            int n2 = (byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF;
            if (n2 >= 61445) continue;
            int n3 = n2;
            while (n3 >= 12289) {
                n3 = n2 -= 12289;
            }
            int n4 = arg2++;
            --n;
            arg1[n4] = (short)n2;
        }
    }

    public void cfr_renamed_6966(sprnvf arg0, short[] arg1, int arg2, int arg3, short[] arg4, int arg5) {
        int n;
        int n2;
        int n3;
        int n4;
        short[] sArray = new short[11];
        sArray[0] = 0;
        sArray[1] = 65;
        sArray[2] = 67;
        sArray[3] = 71;
        sArray[4] = 77;
        sArray[5] = 86;
        sArray[6] = 100;
        sArray[7] = 122;
        sArray[8] = 154;
        sArray[9] = 205;
        sArray[10] = 287;
        short[] sArray2 = sArray;
        short[] sArray3 = new short[63];
        int n5 = 1 << arg3;
        int n6 = n5 << 1;
        int n7 = sArray2[arg3];
        int n8 = n5 + n7;
        int n9 = arg5;
        int n10 = n4 = 0;
        while (n10 < n8) {
            byte[] byArray = new byte[2];
            arg0.cfr_renamed_6804(byArray, 0, byArray.length);
            int n11 = n3 = (byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF;
            int n12 = n2 = n11 - (0x6002 & (n11 - 24578 >>> 31) - 1);
            int n13 = n2 = n12 - (0x6002 & (n12 - 24578 >>> 31) - 1);
            n2 = n13 - (0x3001 & (n13 - 12289 >>> 31) - 1);
            n2 |= (n3 - 61445 >>> 31) - 1;
            if (n4 < n5) {
                arg1[arg2 + n4] = (short)n2;
            } else if (n4 < n6) {
                arg4[n9 + n4 - n5] = (short)n2;
            } else {
                sArray3[n4 - n6] = (short)n2;
            }
            n10 = ++n4;
        }
        int n14 = n = 1;
        while (n14 <= n7) {
            int n15 = 0;
            int n16 = n4 = 0;
            while (n16 < n8) {
                int n17;
                short s;
                int n18;
                if (n4 < n5) {
                    n18 = 1;
                    n3 = arg2 + n4;
                    s = arg1[n3];
                    n17 = n4;
                } else if (n4 < n6) {
                    n18 = 2;
                    n3 = n9 + n4 - n5;
                    s = arg4[n3];
                    n17 = n4;
                } else {
                    n18 = 3;
                    n3 = n4 - n6;
                    s = sArray3[n3];
                    n17 = n4;
                }
                int n19 = n17 - n15;
                int n20 = (s >>> 15) - 1;
                n15 -= n20;
                if (n4 >= n) {
                    int n21;
                    int n22;
                    short s2;
                    int n23;
                    if (n4 - n < n5) {
                        n23 = 1;
                        n2 = arg2 + n4 - n;
                        s2 = arg1[n2];
                        n22 = n20;
                    } else if (n4 - n < n6) {
                        n23 = 2;
                        n2 = n9 + (n4 - n) - n5;
                        s2 = arg4[n2];
                        n22 = n20;
                    } else {
                        n23 = 3;
                        n2 = n4 - n - n6;
                        s2 = sArray3[n2];
                        n22 = n20;
                    }
                    n20 = n22 & -((n19 & n) + 511 >> 9);
                    if (n18 == 1) {
                        n21 = n23;
                        short s3 = s;
                        arg1[n3] = (short)(s3 ^ n20 & (s3 ^ s2));
                    } else if (n18 == 2) {
                        n21 = n23;
                        short s4 = s;
                        arg4[n3] = (short)(s4 ^ n20 & (s4 ^ s2));
                    } else {
                        short s5 = s;
                        sArray3[n3] = (short)(s5 ^ n20 & (s5 ^ s2));
                        n21 = n23;
                    }
                    if (n21 == 1) {
                        short s6 = s2;
                        arg1[n2] = (short)(s6 ^ n20 & (s ^ s6));
                    } else if (n23 == 2) {
                        short s7 = s2;
                        arg4[n2] = (short)(s7 ^ n20 & (s ^ s7));
                    } else {
                        short s8 = s2;
                        sArray3[n2] = (short)(s8 ^ n20 & (s ^ s8));
                    }
                }
                n16 = ++n4;
            }
            n14 = n << 1;
        }
    }

    public int cfr_renamed_6845(short[] arg0, int arg1, short[] arg2, int arg3, int arg4) {
        int n;
        int n2 = 1 << arg4;
        int n3 = 0;
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < n2) {
            short s;
            short s2 = s = arg0[arg1 + n];
            n4 |= (n3 += s2 * s2);
            short s3 = s = arg2[arg3 + n];
            n4 |= (n3 += s3 * s3);
            n5 = ++n;
        }
        if (((long)(n3 |= -(n4 >>> 31)) & 0xFFFFFFFFL) <= (long)cfr_renamed_4[arg4]) {
            return 1;
        }
        return 0;
    }
}

