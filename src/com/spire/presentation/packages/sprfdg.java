/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprptf;
import com.spire.presentation.packages.sprvtf;

public class sprfdg {
    public static final int cfr_renamed_91 = 4;
    public static final int cfr_renamed_0 = 67;
    public static final int cfr_renamed_1 = 16;
    public static final int cfr_renamed_2 = 7;
    public static final int cfr_renamed_3 = 2144;
    public static final int cfr_renamed_4 = 64;

    private static /* synthetic */ void cfr_renamed_6044(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 != arg2) {
            int n3 = n + arg1;
            arg0[n3] = 0;
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_6045(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        void arg1;
        byte[] arg0;
        sprfdg.cfr_renamed_6044(arg0, (int)arg1, 2144);
        sprvtf.cfr_renamed_6046(arg0, n, 2144L, (byte[])arg2, (int)arg3);
    }

    public static void cfr_renamed_6047(sprptf arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, int arg7) {
        int n;
        int n2;
        int n3 = n2 = 0;
        while (n3 < 32) {
            int n4 = n2 + arg2;
            byte by = arg3[n2 + arg4];
            arg1[n4] = by;
            n3 = ++n2;
        }
        int n5 = n = 0;
        while (n5 < arg7 && n < 16) {
            arg0.cfr_renamed_6048(arg1, arg2, arg1, arg2, arg5, arg6 + n++ * 32);
            n5 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6049(sprptf sprptf2, byte[] byArray, int n, byte[] byArray2, int n2, byte[] byArray3, int n3) {
        int n4;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        sprfdg.cfr_renamed_6045((byte[])arg1, (int)arg2, (byte[])arg3, (int)arg4);
        int n5 = n4 = 0;
        while (n5 < 67) {
            void arg6;
            void arg5;
            void arg0;
            void v1 = arg1;
            sprfdg.cfr_renamed_6047((sprptf)arg0, (byte[])v1, (int)(arg2 + ++n4 * 32), (byte[])v1, (int)(arg2 + n4 * 32), (byte[])arg5, (int)arg6, 15);
            n5 = n4;
        }
    }

    public void cfr_renamed_6050(sprptf arg0, byte[] arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5) {
        int n;
        int[] nArray = new int[67];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 64) {
            int n4 = n;
            nArray[n4] = arg4[n4 / 2] & 0xF;
            nArray[n + 1] = (arg4[n / 2] & 0xFF) >>> 4;
            n2 += 15 - nArray[n];
            int n5 = nArray[n + 1];
            n2 += 15 - n5;
            n3 = n += 2;
        }
        int n6 = n;
        while (n6 < 67) {
            int n7 = n2;
            nArray[n] = n7 & 0xF;
            n2 = n7 >>> 4;
            n6 = ++n;
        }
        int n8 = n = 0;
        while (n8 < 67) {
            sprfdg.cfr_renamed_6047(arg0, arg1, n * 32, arg2, arg3 + n * 32, arg5, nArray[n] * 32, 15 - nArray[n++]);
            n8 = n;
        }
    }

    public void cfr_renamed_6051(sprptf arg0, byte[] arg1, int arg2, byte[] arg3, byte[] arg4, byte[] arg5) {
        int n;
        int[] nArray = new int[67];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 64) {
            int n4 = n;
            nArray[n4] = arg3[n4 / 2] & 0xF;
            nArray[n + 1] = (arg3[n / 2] & 0xFF) >>> 4;
            n2 += 15 - nArray[n];
            int n5 = nArray[n + 1];
            n2 += 15 - n5;
            n3 = n += 2;
        }
        int n6 = n;
        while (n6 < 67) {
            int n7 = n2;
            nArray[n] = n7 & 0xF;
            n2 = n7 >>> 4;
            n6 = ++n;
        }
        sprfdg.cfr_renamed_6045(arg1, arg2, arg4, 0);
        int n8 = n = 0;
        while (n8 < 67) {
            sprfdg.cfr_renamed_6047(arg0, arg1, arg2 + n * 32, arg1, arg2 + n * 32, arg5, 0, nArray[n++]);
            n8 = n;
        }
    }
}

