/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public abstract class sprlnh {
    public static void cfr_renamed_8711(int[] arg0, int arg1, byte[] arg2) {
        int n;
        int[] nArray = new int[arg0.length * 2];
        int n2 = arg0[arg0.length - 1] >> 31;
        int n3 = arg0.length;
        int n4 = nArray.length;
        while (--n3 >= 0) {
            n = arg0[n3];
            int n5 = --n4;
            nArray[n5] = n >>> 16 | n2 << 16;
            nArray[--n4] = n2 = n;
        }
        n2 = 32 - arg1;
        n3 = 0;
        n4 = 0;
        int n6 = n = 0;
        while (n6 < nArray.length) {
            int n7 = nArray[n];
            int n8 = n3;
            while (n8 < 16) {
                int n9 = n7 >>> n3;
                if ((n9 & 1) == n4) {
                    n8 = ++n3;
                    continue;
                }
                int n10 = (n9 | 1) << n2;
                n4 = n10 >>> 31;
                int n11 = n3;
                arg2[(n << 4) + n11] = (byte)(n10 >> n2);
                n8 = n11 + arg1;
            }
            n6 = ++n;
            n3 -= 16;
        }
    }
}

