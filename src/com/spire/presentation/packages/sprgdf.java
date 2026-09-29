/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdwk;
import com.spire.presentation.packages.sproeb;

public class sprgdf {
    public byte[] cfr_renamed_1375(byte[][] arg0) {
        int n;
        byte[] byArray = new byte[arg0.length * arg0[0].length];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg0.length) {
            System.arraycopy(arg0[n], 0, byArray, n2, arg0[n].length);
            byte[] byArray2 = arg0[n];
            n2 += byArray2.length;
            n3 = ++n;
        }
        return byArray;
    }

    public int cfr_renamed_1373(byte[] arg0) {
        return arg0[0] & 0xFF | (arg0[1] & 0xFF) << 8 | (arg0[2] & 0xFF) << 16 | (arg0[3] & 0xFF) << 24;
    }

    public int cfr_renamed_1366(int arg0) {
        int n;
        int n2 = 1;
        int n3 = n = 2;
        while (n3 < arg0) {
            ++n2;
            n3 = n <<= 1;
        }
        return n2;
    }

    public int cfr_renamed_1378(byte[] arg0, int arg1) {
        return arg0[arg1] & 0xFF | (arg0[++arg1] & 0xFF) << 8 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 24;
    }

    public void cfr_renamed_1372(String arg0, byte[][] arg1) {
        int n;
        System.out.println(arg0);
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg1.length) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < arg1[0].length) {
                StringBuilder stringBuilder = new StringBuilder().append(n2).append(sproeb.cfr_renamed_9("}?"));
                ++n2;
                System.out.println(stringBuilder.append(arg1[n][n4]).toString());
                n5 = ++n4;
            }
            n3 = ++n;
        }
    }

    public boolean cfr_renamed_1374(int arg0) {
        int n;
        int n2 = n = 1;
        while (n2 < arg0) {
            n2 = n << 1;
        }
        return arg0 == n;
    }

    public void cfr_renamed_1376(String arg0, byte[] arg1) {
        int n;
        System.out.println(arg0);
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg1.length) {
            StringBuilder stringBuilder = new StringBuilder().append(n2).append(sprdwk.cfr_renamed_9("\n\u000f"));
            ++n2;
            System.out.println(stringBuilder.append(arg1[n]).toString());
            n3 = ++n;
        }
    }

    public byte[] cfr_renamed_1377(int arg0) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[4];
        byArray[0] = (byte)(arg0 & 0xFF);
        byArray[1] = (byte)(arg0 >> 8 & 0xFF);
        byArray2[2] = (byte)(arg0 >> 16 & 0xFF);
        byArray[3] = (byte)(arg0 >> 24 & 0xFF);
        return byArray2;
    }
}

