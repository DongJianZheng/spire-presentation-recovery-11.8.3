/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprqne {
    private static final byte cfr_renamed_31 = 2;
    private static final byte cfr_renamed_272 = 1;
    private static final byte cfr_renamed_145 = 48;
    private static final byte cfr_renamed_114 = 9;
    private static final byte[] cfr_renamed_96;
    private static final byte cfr_renamed_105 = 64;
    private static final byte cfr_renamed_137 = 4;
    private static final byte cfr_renamed_79 = 3;
    private static final byte cfr_renamed_107 = 8;
    private static final byte cfr_renamed_132 = -2;
    private static final byte cfr_renamed_102 = 32;
    private static final byte cfr_renamed_93 = 16;
    private static final byte cfr_renamed_86 = 0;
    private static final byte cfr_renamed_152 = 10;
    private static final short[] cfr_renamed_112;
    private static final byte cfr_renamed_119 = 7;
    private static final byte cfr_renamed_91 = 6;
    private static final byte cfr_renamed_0 = 80;
    private static final byte cfr_renamed_1 = -1;
    private static final byte cfr_renamed_2 = 0;
    private static final byte cfr_renamed_3 = 96;
    private static final byte cfr_renamed_4 = 5;

    static {
        int n;
        cfr_renamed_112 = new short[128];
        cfr_renamed_96 = new byte[112];
        byte[] byArray = new byte[128];
        sprqne.cfr_renamed_5214(byArray, 0, 15, (byte)1);
        sprqne.cfr_renamed_5214(byArray, 16, 31, (byte)2);
        sprqne.cfr_renamed_5214(byArray, 32, 63, (byte)3);
        sprqne.cfr_renamed_5214(byArray, 64, 65, (byte)0);
        sprqne.cfr_renamed_5214(byArray, 66, 95, (byte)4);
        sprqne.cfr_renamed_5214(byArray, 96, 96, (byte)5);
        sprqne.cfr_renamed_5214(byArray, 97, 108, (byte)6);
        sprqne.cfr_renamed_5214(byArray, 109, 109, (byte)7);
        sprqne.cfr_renamed_5214(byArray, 110, 111, (byte)6);
        sprqne.cfr_renamed_5214(byArray, 112, 112, (byte)8);
        sprqne.cfr_renamed_5214(byArray, 113, 115, (byte)9);
        sprqne.cfr_renamed_5214(byArray, 116, 116, (byte)10);
        sprqne.cfr_renamed_5214(byArray, 117, 127, (byte)0);
        sprqne.cfr_renamed_5214(cfr_renamed_96, 0, cfr_renamed_96.length - 1, (byte)-2);
        sprqne.cfr_renamed_5214(cfr_renamed_96, 8, 11, (byte)-1);
        sprqne.cfr_renamed_5214(cfr_renamed_96, 24, 27, (byte)0);
        sprqne.cfr_renamed_5214(cfr_renamed_96, 40, 43, (byte)16);
        sprqne.cfr_renamed_5214(cfr_renamed_96, 58, 59, (byte)0);
        sprqne.cfr_renamed_5214(cfr_renamed_96, 72, 73, (byte)0);
        sprqne.cfr_renamed_5214(cfr_renamed_96, 89, 91, (byte)16);
        sprqne.cfr_renamed_5214(cfr_renamed_96, 104, 104, (byte)16);
        byte[] byArray2 = new byte[11];
        byArray2[0] = 0;
        byArray2[1] = 0;
        byArray2[2] = 0;
        byArray2[3] = 0;
        byArray2[4] = 31;
        byArray2[5] = 15;
        byArray2[6] = 15;
        byArray2[7] = 15;
        byArray2[8] = 7;
        byArray2[9] = 7;
        byArray2[10] = 7;
        byte[] byArray3 = byArray2;
        byte[] byArray4 = new byte[11];
        byArray4[0] = -2;
        byArray4[1] = -2;
        byArray4[2] = -2;
        byArray4[3] = -2;
        byArray4[4] = 0;
        byArray4[5] = 48;
        byArray4[6] = 16;
        byArray4[7] = 64;
        byArray4[8] = 80;
        byArray4[9] = 32;
        byArray4[10] = 96;
        byte[] byArray5 = byArray4;
        int n2 = n = 0;
        while (n2 < 128) {
            byte by = byArray[n];
            int n3 = n & byArray3[by];
            byte by2 = byArray5[by];
            sprqne.cfr_renamed_112[n++] = (short)(n3 << 8 | by2);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_5147(byte[] byArray, char[] cArray) {
        void arg1;
        byte[] arg0;
        return sprqne.cfr_renamed_5149(arg0, 0, arg0.length, (char[])arg1);
    }

    public static int cfr_renamed_5149(byte[] arg0, int arg1, int arg2, char[] arg3) {
        int n = arg1;
        int n2 = 0;
        int n3 = arg1 + arg2;
        block0: while (true) {
            int n4 = n;
            while (n4 < n3) {
                byte by;
                byte by2 = arg0[n];
                ++n;
                if (by2 >= 0) {
                    if (n2 >= arg3.length) {
                        return -1;
                    }
                    arg3[n2++] = (char)by2;
                    n4 = n;
                    continue;
                }
                short s = cfr_renamed_112[by2 & 0x7F];
                int n5 = s >>> 8;
                byte by3 = (byte)s;
                while (by3 >= 0) {
                    if (n >= n3) {
                        return -1;
                    }
                    by2 = arg0[n];
                    ++n;
                    n5 = n5 << 6 | by2 & 0x3F;
                    by3 = cfr_renamed_96[by + ((by2 & 0xFF) >>> 4)];
                }
                if (by == -2) {
                    return -1;
                }
                if (n5 <= 65535) {
                    if (n2 >= arg3.length) {
                        return -1;
                    }
                    arg3[n2++] = (char)n5;
                    continue block0;
                }
                if (n2 >= arg3.length - 1) {
                    return -1;
                }
                arg3[n2++] = (char)(55232 + (n5 >>> 10));
                arg3[n2++] = (char)(0xDC00 | n5 & 0x3FF);
                continue block0;
            }
            break;
        }
        return n2;
    }

    private static /* synthetic */ void cfr_renamed_5214(byte[] arg0, int arg1, int arg2, byte arg3) {
        int n;
        int n2 = n = arg1;
        while (n2 <= arg2) {
            arg0[n++] = arg3;
            n2 = n;
        }
    }
}

