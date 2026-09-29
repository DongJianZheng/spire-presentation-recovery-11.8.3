/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazf;
import com.spire.presentation.packages.sprbwf;
import com.spire.presentation.packages.sprfwf;
import com.spire.presentation.packages.spriuf;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprpxe;

public class sprcbg {
    public static void cfr_renamed_6403(short[] arg0) {
        short[] sArray = arg0;
        spriuf.cfr_renamed_6404(sArray);
        spriuf.cfr_renamed_6405(arg0, sprfwf.cfr_renamed_2);
        spriuf.cfr_renamed_6406(sArray, sprfwf.cfr_renamed_4);
    }

    public static void cfr_renamed_6407(byte[] arg0, short[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 256) {
            int n3;
            int n4 = 4 * n;
            short s = sprcbg.cfr_renamed_6408(arg1[n4 + 0]);
            short s2 = sprcbg.cfr_renamed_6408(arg1[n4 + 1]);
            short s3 = sprcbg.cfr_renamed_6408(arg1[n4 + 2]);
            short s4 = sprcbg.cfr_renamed_6408(arg1[n4 + 3]);
            int n5 = n3 = 7 * n;
            int n6 = n3;
            arg0[n3 + 0] = (byte)s;
            arg0[n6 + 1] = (byte)(s >> 8 | s2 << 6);
            arg0[n6 + 2] = (byte)(s2 >> 2);
            arg0[n3 + 3] = (byte)(s2 >> 10 | s3 << 4);
            arg0[n5 + 4] = (byte)(s3 >> 4);
            arg0[n5 + 5] = (byte)(s3 >> 12 | s4 << 2);
            arg0[n3 + 6] = (byte)(s4 >> 6);
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6409(short[] arg0, byte[] arg1) {
        sprnil sprnil2 = new sprnil(128);
        sprnil2.cfr_renamed_1197(arg1, 0, arg1.length);
        int n = 0;
        block0: while (true) {
            byte[] byArray = new byte[256];
            sprnil2.cfr_renamed_6410(byArray, 0, byArray.length);
            int n2 = 0;
            int n3 = n2;
            while (true) {
                if (n3 >= byArray.length) continue block0;
                int n4 = byArray[n2] & 0xFF | (byArray[n2 + 1] & 0xFF) << 8;
                if (n4 < 61445) {
                    arg0[n++] = (short)n4;
                    if (n == 1024) {
                        return;
                    }
                }
                n3 = n2 += 2;
            }
            break;
        }
    }

    public static void cfr_renamed_6411(short[] arg0, short[] arg1, short[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 1024) {
            int n3 = n;
            short s = sprbwf.cfr_renamed_6402((short)(arg0[n] + arg1[n3]));
            arg2[n3] = s;
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6412(short[] arg0, byte[] arg1, byte arg2) {
        int n;
        byte[] byArray = new byte[8];
        byArray[0] = arg2;
        byte[] byArray2 = new byte[4096];
        sprazf.cfr_renamed_6413(arg1, byArray, byArray2, 0, byArray2.length);
        int n2 = n = 0;
        while (n2 < 1024) {
            int n3;
            int n4 = sprpxe.cfr_renamed_446(byArray2, n * 4);
            int n5 = 0;
            int n6 = n3 = 0;
            while (n6 < 8) {
                int n7 = n4 >> n3;
                n5 += n7 & 0x1010101;
                n6 = ++n3;
            }
            n3 = (n5 >>> 24) + (n5 >>> 0) & 0xFF;
            int n8 = (n5 >>> 16) + (n5 >>> 8) & 0xFF;
            arg0[n++] = (short)(n3 + 12289 - n8);
            n2 = n;
        }
    }

    public static void cfr_renamed_6414(short[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < 256) {
            int n3;
            int n4 = 7 * n;
            int n5 = arg1[n4 + 0] & 0xFF;
            int n6 = arg1[n4 + 1] & 0xFF;
            int n7 = arg1[n4 + 2] & 0xFF;
            int n8 = arg1[n4 + 3] & 0xFF;
            int n9 = arg1[n4 + 4] & 0xFF;
            int n10 = arg1[n4 + 5] & 0xFF;
            int n11 = arg1[n4 + 6] & 0xFF;
            int n12 = n3 = 4 * n;
            arg0[n3 + 0] = (short)(n5 | (n6 & 0x3F) << 8);
            arg0[n12 + 1] = (short)(n6 >>> 6 | n7 << 2 | (n8 & 0xF) << 10);
            arg0[n12 + 2] = (short)(n8 >>> 4 | n9 << 4 | (n10 & 3) << 12);
            arg0[n3 + 3] = (short)(n10 >>> 2 | n11 << 6);
            n2 = ++n;
        }
    }

    public static void cfr_renamed_6415(short[] arg0, short[] arg1, short[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 1024) {
            int n3 = arg0[n] & 0xFFFF;
            int n4 = arg1[n] & 0xFFFF;
            short s = sprbwf.cfr_renamed_6401(3186 * n4);
            arg2[n++] = sprbwf.cfr_renamed_6401(n3 * (s & 0xFFFF));
            n2 = n;
        }
    }

    private static /* synthetic */ short cfr_renamed_6408(short arg0) {
        int n = sprbwf.cfr_renamed_6402(arg0);
        int n2 = n - 12289;
        int n3 = n2 >> 31;
        int n4 = n2;
        n = n4 ^ (n ^ n4) & n3;
        return (short)n;
    }

    public static void cfr_renamed_6416(short[] arg0) {
        spriuf.cfr_renamed_6406(arg0, sprfwf.cfr_renamed_1);
        spriuf.cfr_renamed_6405(arg0, sprfwf.cfr_renamed_3);
    }
}

