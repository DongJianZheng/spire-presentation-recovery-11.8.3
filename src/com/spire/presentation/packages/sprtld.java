/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraiaa;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.spreym;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;

public final class sprtld
implements sprff {
    private static final int cfr_renamed_1228 = 9;
    private static final int cfr_renamed_1260 = 0;
    private static final int cfr_renamed_499 = 1;
    private static final int cfr_renamed_135 = 16;
    private int cfr_renamed_956;
    private int[] cfr_renamed_952;
    private static final int cfr_renamed_728 = 40;
    private boolean cfr_renamed_128;
    private int[] cfr_renamed_957;
    private static final int cfr_renamed_314 = 0;
    private static final int cfr_renamed_951 = 0;
    private static final int cfr_renamed_84 = 1;
    private static final int cfr_renamed_723 = 1;
    private static final int cfr_renamed_1226 = 256;
    private int[] cfr_renamed_287;
    private static final int cfr_renamed_724 = 0;
    private byte[] cfr_renamed_953;
    private static final int cfr_renamed_133 = 8;
    private static final int cfr_renamed_185 = 0;
    private static final int spr\ufe34 = 0;
    private static final int cfr_renamed_82 = 0;
    private static final int cfr_renamed_126 = 0x2020202;
    private static final int cfr_renamed_88 = 16;
    private static final int cfr_renamed_31 = 333;
    private static final int cfr_renamed_272 = 1;
    private int[] cfr_renamed_145;
    private int[] cfr_renamed_114;
    private static final int cfr_renamed_96 = 1;
    private static final int cfr_renamed_105 = 1;
    private static final int cfr_renamed_137 = 1;
    private static final int cfr_renamed_79 = 1;
    private static final int cfr_renamed_107 = 1;
    private static final int cfr_renamed_132 = 90;
    private static final int cfr_renamed_102 = 361;
    private static final int cfr_renamed_93 = 0;
    private static final int cfr_renamed_86 = 180;
    private static final int cfr_renamed_152 = 0x1010101;
    private static final int cfr_renamed_112 = 0;
    private static final int cfr_renamed_119 = 16;
    private int[] cfr_renamed_91;
    private static final int cfr_renamed_0 = 0;
    private static final int cfr_renamed_1 = 4;
    private static final byte[][] cfr_renamed_2;
    private static final int cfr_renamed_3 = 1;
    private static final int cfr_renamed_4 = 0;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3541(int n) {
        void arg0;
        void v0 = arg0;
        return v0 ^ this.cfr_renamed_3542((int)v0) ^ this.cfr_renamed_3543((int)arg0);
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    public sprtld() {
        int n;
        sprtld sprtld2 = this;
        sprtld sprtld3 = this;
        sprtld sprtld4 = this;
        this.cfr_renamed_128 = false;
        sprtld4.cfr_renamed_287 = new int[256];
        sprtld4.cfr_renamed_114 = new int[256];
        sprtld3.cfr_renamed_952 = new int[256];
        sprtld3.cfr_renamed_91 = new int[256];
        sprtld2.cfr_renamed_956 = 0;
        sprtld2.cfr_renamed_953 = null;
        int[] nArray = new int[2];
        int[] nArray2 = new int[2];
        int[] nArray3 = new int[2];
        int n2 = n = 0;
        while (n2 < 256) {
            int n3;
            nArray[0] = n3 = cfr_renamed_2[0][n] & 0xFF;
            nArray2[0] = this.cfr_renamed_3544(n3) & 0xFF;
            nArray3[0] = this.cfr_renamed_3541(n3) & 0xFF;
            nArray[1] = n3 = cfr_renamed_2[1][n] & 0xFF;
            nArray2[1] = this.cfr_renamed_3544(n3) & 0xFF;
            sprtld sprtld5 = this;
            nArray3[1] = sprtld5.cfr_renamed_3541(n3) & 0xFF;
            sprtld sprtld6 = this;
            sprtld6.cfr_renamed_287[n] = nArray[1] | nArray2[1] << 8 | nArray3[1] << 16 | nArray3[1] << 24;
            sprtld6.cfr_renamed_114[n] = nArray3[0] | nArray3[0] << 8 | nArray2[0] << 16 | nArray[0] << 24;
            sprtld6.cfr_renamed_952[n] = nArray2[1] | nArray3[1] << 8 | nArray[1] << 16 | nArray3[1] << 24;
            sprtld5.cfr_renamed_91[n++] = nArray2[0] | nArray[0] << 8 | nArray3[0] << 16 | nArray2[0] << 24;
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3396(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        sprtld sprtld2 = this;
        int n4 = this.cfr_renamed_3545(byArray, n) ^ sprtld2.cfr_renamed_957[4];
        sprtld sprtld3 = this;
        int n5 = sprtld2.cfr_renamed_3545(byArray, n + 4) ^ sprtld3.cfr_renamed_957[5];
        sprtld sprtld4 = this;
        int n6 = sprtld3.cfr_renamed_3545(byArray, n + 8) ^ sprtld4.cfr_renamed_957[6];
        int n7 = sprtld4.cfr_renamed_3545(byArray, (int)(arg1 + 12)) ^ this.cfr_renamed_957[7];
        int n8 = 39;
        int n9 = n3 = 0;
        while (n9 < 16) {
            sprtld sprtld5 = this;
            int n10 = sprtld5.cfr_renamed_3546(n4);
            int n11 = sprtld5.cfr_renamed_3547(n5);
            sprtld sprtld6 = this;
            int n12 = n7 ^ n10 + 2 * n11 + sprtld6.cfr_renamed_957[n8];
            n7 = n12;
            int n13 = (n6 << 1 | n6 >>> 31) ^ n10 + n11 + this.cfr_renamed_957[--n8];
            n6 = n13;
            n7 = n7 >>> 1 | n7 << 31;
            n10 = sprtld6.cfr_renamed_3546(n6);
            n11 = sprtld5.cfr_renamed_3547(n7);
            int n14 = n5 ^ n10 + 2 * n11 + this.cfr_renamed_957[--n8];
            n5 = n14;
            int n15 = (n4 << 1 | n4 >>> 31) ^ n10 + n11 + this.cfr_renamed_957[--n8];
            --n8;
            n4 = n15;
            n5 = n5 >>> 1 | n5 << 31;
            n9 = n3 += 2;
        }
        sprtld sprtld7 = this;
        sprtld7.cfr_renamed_3548(n6 ^ sprtld7.cfr_renamed_957[0], (byte[])arg2, (int)arg3);
        sprtld sprtld8 = this;
        sprtld8.cfr_renamed_3548(n7 ^ sprtld8.cfr_renamed_957[1], (byte[])arg2, (int)(arg3 + 4));
        sprtld sprtld9 = this;
        sprtld9.cfr_renamed_3548(n4 ^ sprtld9.cfr_renamed_957[2], (byte[])arg2, (int)(arg3 + 8));
        this.cfr_renamed_3548(n5 ^ this.cfr_renamed_957[3], (byte[])arg2, (int)(arg3 + 12));
    }

    private /* synthetic */ int cfr_renamed_3545(byte[] arg0, int arg1) {
        return arg0[arg1] & 0xFF | (arg0[arg1 + 1] & 0xFF) << 8 | (arg0[arg1 + 2] & 0xFF) << 16 | (arg0[arg1 + 3] & 0xFF) << 24;
    }

    private /* synthetic */ int cfr_renamed_3549(int arg0) {
        return arg0 >>> 24 & 0xFF;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3544(int n) {
        void arg0;
        void v0 = arg0;
        return v0 ^ this.cfr_renamed_3543((int)v0);
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_953 == null) {
            throw new IllegalStateException(spraiaa.cfr_renamed_9("\u0011-*<,)-z+51z,4,.,;)36?!"));
        }
        if (arg1 + 16 > arg0.length) {
            throw new sprjkd(spreym.cfr_renamed_9("*g3|7)!|%o&{c},fcz+f1}"));
        }
        if (arg3 + 16 > arg2.length) {
            throw new spreid(spraiaa.cfr_renamed_9("*/1*0.e80<#?7z15*z62*(1"));
        }
        if (this.cfr_renamed_128) {
            this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        } else {
            this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
        }
        return 16;
    }

    private /* synthetic */ int cfr_renamed_3550(int arg0, int arg1) {
        int n;
        int n2 = arg1;
        int n3 = n = 0;
        while (n3 < 4) {
            n2 = this.cfr_renamed_3551(n2);
            n3 = ++n;
        }
        n2 ^= arg0;
        int n4 = n = 0;
        while (n4 < 4) {
            n2 = this.cfr_renamed_3551(n2);
            n4 = ++n;
        }
        return n2;
    }

    private /* synthetic */ int cfr_renamed_3551(int arg0) {
        int n;
        int n2 = (n << 1 ^ (((n = arg0 >>> 24 & 0xFF) & 0x80) != 0 ? 333 : 0)) & 0xFF;
        int n3 = n >>> 1 ^ ((n & 1) != 0 ? 166 : 0) ^ n2;
        return arg0 << 8 ^ n3 << 24 ^ n2 << 16 ^ n3 << 8 ^ n;
    }

    @Override
    public void cfr_renamed_41() {
        if (this.cfr_renamed_953 != null) {
            sprtld sprtld2 = this;
            sprtld2.cfr_renamed_2402(sprtld2.cfr_renamed_953);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_3552(int n, int[] nArray) {
        void arg1;
        void arg0;
        sprtld sprtld2 = this;
        sprtld sprtld3 = this;
        int n2 = sprtld3.cfr_renamed_3553((int)arg0);
        int n3 = sprtld3.cfr_renamed_3075((int)arg0);
        int n4 = sprtld2.cfr_renamed_3554((int)arg0);
        int n5 = sprtld2.cfr_renamed_3549((int)arg0);
        void v2 = arg1;
        void var7_7 = v2[0];
        void var8_8 = v2[1];
        void var9_9 = v2[2];
        int n6 = nArray[3];
        int n7 = 0;
        switch (sprtld2.cfr_renamed_956 & 3) {
            case 1: {
                return this.cfr_renamed_287[cfr_renamed_2[0][n2] & 0xFF ^ this.cfr_renamed_3553((int)var7_7)] ^ this.cfr_renamed_114[cfr_renamed_2[0][n3] & 0xFF ^ this.cfr_renamed_3075((int)var7_7)] ^ this.cfr_renamed_952[cfr_renamed_2[1][n4] & 0xFF ^ this.cfr_renamed_3554((int)var7_7)] ^ this.cfr_renamed_91[cfr_renamed_2[1][n5] & 0xFF ^ this.cfr_renamed_3549((int)var7_7)];
            }
            case 0: {
                n2 = cfr_renamed_2[1][n2] & 0xFF ^ this.cfr_renamed_3553(n6);
                n3 = cfr_renamed_2[0][n3] & 0xFF ^ this.cfr_renamed_3075(n6);
                n4 = cfr_renamed_2[0][n4] & 0xFF ^ this.cfr_renamed_3554(n6);
                n5 = cfr_renamed_2[1][n5] & 0xFF ^ this.cfr_renamed_3549(n6);
            }
            case 3: {
                n2 = cfr_renamed_2[1][n2] & 0xFF ^ this.cfr_renamed_3553((int)var9_9);
                n3 = cfr_renamed_2[1][n3] & 0xFF ^ this.cfr_renamed_3075((int)var9_9);
                n4 = cfr_renamed_2[0][n4] & 0xFF ^ this.cfr_renamed_3554((int)var9_9);
                n5 = cfr_renamed_2[0][n5] & 0xFF ^ this.cfr_renamed_3549((int)var9_9);
            }
            case 2: {
                return this.cfr_renamed_287[cfr_renamed_2[0][cfr_renamed_2[0][n2] & 0xFF ^ this.cfr_renamed_3553((int)var8_8)] & 0xFF ^ this.cfr_renamed_3553((int)var7_7)] ^ this.cfr_renamed_114[cfr_renamed_2[0][cfr_renamed_2[1][n3] & 0xFF ^ this.cfr_renamed_3075((int)var8_8)] & 0xFF ^ this.cfr_renamed_3075((int)var7_7)] ^ this.cfr_renamed_952[cfr_renamed_2[1][cfr_renamed_2[0][n4] & 0xFF ^ this.cfr_renamed_3554((int)var8_8)] & 0xFF ^ this.cfr_renamed_3554((int)var7_7)] ^ this.cfr_renamed_91[cfr_renamed_2[1][cfr_renamed_2[1][n5] & 0xFF ^ this.cfr_renamed_3549((int)var8_8)] & 0xFF ^ this.cfr_renamed_3549((int)var7_7)];
            }
        }
        return n7;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        int[] nArray = new int[4];
        int[] nArray2 = new int[4];
        int[] nArray3 = new int[4];
        this.cfr_renamed_957 = new int[40];
        if (this.cfr_renamed_956 < 1) {
            throw new IllegalArgumentException(spreym.cfr_renamed_9("\bl:)0`9lce&z0)7a\"gc?w)!`7z"));
        }
        if (this.cfr_renamed_956 > 4) {
            throw new IllegalArgumentException(spraiaa.cfr_renamed_9("\u000e?<z63??e6$(\"?7z12$4ehple8,.6"));
        }
        int n5 = n4 = 0;
        while (n5 < this.cfr_renamed_956) {
            n3 = n4 * 8;
            int n6 = n4;
            nArray[n6] = this.cfr_renamed_3545(arg0, n3);
            sprtld sprtld2 = this;
            nArray2[n6] = sprtld2.cfr_renamed_3545(arg0, n3 + 4);
            int n7 = sprtld2.cfr_renamed_956 - 1 - n4;
            int n8 = this.cfr_renamed_3550(nArray[n4], nArray2[n4]);
            nArray3[n7] = n8;
            n5 = ++n4;
        }
        int n9 = n2 = 0;
        while (n9 < 20) {
            n4 = n2 * 0x2020202;
            sprtld sprtld3 = this;
            n3 = sprtld3.cfr_renamed_3552(n4, nArray);
            int n10 = sprtld3.cfr_renamed_3552(n4 + 0x1010101, nArray2);
            n10 = n10 << 8 | n10 >>> 24;
            sprtld3.cfr_renamed_957[n2 * 2] = n3 += n10;
            int n11 = n2 * 2 + 1;
            sprtld3.cfr_renamed_957[n11] = (n3 += n10) << 9 | n3 >>> 23;
            n9 = ++n2;
        }
        n2 = nArray3[0];
        int n12 = nArray3[1];
        int n13 = nArray3[2];
        int n14 = nArray3[3];
        this.cfr_renamed_145 = new int[1024];
        int n15 = n = 0;
        while (n15 < 256) {
            int n16;
            int n17 = n16 = n;
            int n18 = n16;
            int n19 = n16;
            switch (this.cfr_renamed_956 & 3) {
                case 1: {
                    sprtld sprtld4 = this;
                    sprtld4.cfr_renamed_145[n * 2] = this.cfr_renamed_287[cfr_renamed_2[0][n19] & 0xFF ^ this.cfr_renamed_3553(n2)];
                    sprtld sprtld5 = this;
                    sprtld4.cfr_renamed_145[n * 2 + 1] = sprtld5.cfr_renamed_114[cfr_renamed_2[0][n18] & 0xFF ^ this.cfr_renamed_3075(n2)];
                    sprtld5.cfr_renamed_145[n * 2 + 512] = this.cfr_renamed_952[cfr_renamed_2[1][n17] & 0xFF ^ this.cfr_renamed_3554(n2)];
                    sprtld4.cfr_renamed_145[n * 2 + 513] = this.cfr_renamed_91[cfr_renamed_2[1][n16] & 0xFF ^ this.cfr_renamed_3549(n2)];
                    break;
                }
                case 0: {
                    n19 = cfr_renamed_2[1][n19] & 0xFF ^ this.cfr_renamed_3553(n14);
                    n18 = cfr_renamed_2[0][n18] & 0xFF ^ this.cfr_renamed_3075(n14);
                    n17 = cfr_renamed_2[0][n17] & 0xFF ^ this.cfr_renamed_3554(n14);
                    n16 = cfr_renamed_2[1][n16] & 0xFF ^ this.cfr_renamed_3549(n14);
                }
                case 3: {
                    n19 = cfr_renamed_2[1][n19] & 0xFF ^ this.cfr_renamed_3553(n13);
                    n18 = cfr_renamed_2[1][n18] & 0xFF ^ this.cfr_renamed_3075(n13);
                    n17 = cfr_renamed_2[0][n17] & 0xFF ^ this.cfr_renamed_3554(n13);
                    n16 = cfr_renamed_2[0][n16] & 0xFF ^ this.cfr_renamed_3549(n13);
                }
                case 2: {
                    sprtld sprtld6 = this;
                    sprtld6.cfr_renamed_145[n * 2] = this.cfr_renamed_287[cfr_renamed_2[0][cfr_renamed_2[0][n19] & 0xFF ^ this.cfr_renamed_3553(n12)] & 0xFF ^ this.cfr_renamed_3553(n2)];
                    sprtld sprtld7 = this;
                    sprtld6.cfr_renamed_145[n * 2 + 1] = sprtld7.cfr_renamed_114[cfr_renamed_2[0][cfr_renamed_2[1][n18] & 0xFF ^ this.cfr_renamed_3075(n12)] & 0xFF ^ this.cfr_renamed_3075(n2)];
                    sprtld7.cfr_renamed_145[n * 2 + 512] = this.cfr_renamed_952[cfr_renamed_2[1][cfr_renamed_2[0][n17] & 0xFF ^ this.cfr_renamed_3554(n12)] & 0xFF ^ this.cfr_renamed_3554(n2)];
                    sprtld6.cfr_renamed_145[n * 2 + 513] = this.cfr_renamed_91[cfr_renamed_2[1][cfr_renamed_2[1][n16] & 0xFF ^ this.cfr_renamed_3549(n12)] & 0xFF ^ this.cfr_renamed_3549(n2)];
                    break;
                }
            }
            n15 = ++n;
        }
        return;
    }

    private /* synthetic */ int cfr_renamed_3553(int arg0) {
        return arg0 & 0xFF;
    }

    private /* synthetic */ int cfr_renamed_3075(int arg0) {
        return arg0 >>> 8 & 0xFF;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3548(int n, byte[] byArray, int n2) {
        void arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2] = (byte)arg0;
        arg1[v1 + true] = (byte)(arg0 >> 8);
        v0[v1 + 2] = (byte)(arg0 >> 16);
        v0[n2 + 3] = (byte)(arg0 >> 24);
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg1 instanceof sprnld) {
            sprtld sprtld2 = this;
            sprtld2.cfr_renamed_128 = arg0;
            sprtld2.cfr_renamed_953 = ((sprnld)arg1).cfr_renamed_1521();
            this.cfr_renamed_956 = this.cfr_renamed_953.length / 8;
            sprtld sprtld3 = this;
            sprtld3.cfr_renamed_2402(sprtld3.cfr_renamed_953);
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spreym.cfr_renamed_9("`-\u007f\"e*mcy\"{\"d&}&{cy\"z0l')7fc]4f%`0ac`-`7)n)")).append(arg1.getClass().getName()).toString());
    }

    private /* synthetic */ int cfr_renamed_3543(int arg0) {
        return arg0 >> 2 ^ ((arg0 & 2) != 0 ? 180 : 0) ^ ((arg0 & 1) != 0 ? 90 : 0);
    }

    private /* synthetic */ int cfr_renamed_3547(int arg0) {
        return this.cfr_renamed_145[0 + 2 * (arg0 >>> 24 & 0xFF)] ^ this.cfr_renamed_145[1 + 2 * (arg0 & 0xFF)] ^ this.cfr_renamed_145[512 + 2 * (arg0 >>> 8 & 0xFF)] ^ this.cfr_renamed_145[513 + 2 * (arg0 >>> 16 & 0xFF)];
    }

    @Override
    public String cfr_renamed_1315() {
        return spraiaa.cfr_renamed_9("\u0011-*<,)-");
    }

    static {
        byte[][] byArrayArray = new byte[2][];
        byte[] byArray = new byte[256];
        byArray[0] = -87;
        byArray[1] = 103;
        byArray[2] = -77;
        byArray[3] = -24;
        byArray[4] = 4;
        byArray[5] = -3;
        byArray[6] = -93;
        byArray[7] = 118;
        byArray[8] = -102;
        byArray[9] = -110;
        byArray[10] = -128;
        byArray[11] = 120;
        byArray[12] = -28;
        byArray[13] = -35;
        byArray[14] = -47;
        byArray[15] = 56;
        byArray[16] = 13;
        byArray[17] = -58;
        byArray[18] = 53;
        byArray[19] = -104;
        byArray[20] = 24;
        byArray[21] = -9;
        byArray[22] = -20;
        byArray[23] = 108;
        byArray[24] = 67;
        byArray[25] = 117;
        byArray[26] = 55;
        byArray[27] = 38;
        byArray[28] = -6;
        byArray[29] = 19;
        byArray[30] = -108;
        byArray[31] = 72;
        byArray[32] = -14;
        byArray[33] = -48;
        byArray[34] = -117;
        byArray[35] = 48;
        byArray[36] = -124;
        byArray[37] = 84;
        byArray[38] = -33;
        byArray[39] = 35;
        byArray[40] = 25;
        byArray[41] = 91;
        byArray[42] = 61;
        byArray[43] = 89;
        byArray[44] = -13;
        byArray[45] = -82;
        byArray[46] = -94;
        byArray[47] = -126;
        byArray[48] = 99;
        byArray[49] = 1;
        byArray[50] = -125;
        byArray[51] = 46;
        byArray[52] = -39;
        byArray[53] = 81;
        byArray[54] = -101;
        byArray[55] = 124;
        byArray[56] = -90;
        byArray[57] = -21;
        byArray[58] = -91;
        byArray[59] = -66;
        byArray[60] = 22;
        byArray[61] = 12;
        byArray[62] = -29;
        byArray[63] = 97;
        byArray[64] = -64;
        byArray[65] = -116;
        byArray[66] = 58;
        byArray[67] = -11;
        byArray[68] = 115;
        byArray[69] = 44;
        byArray[70] = 37;
        byArray[71] = 11;
        byArray[72] = -69;
        byArray[73] = 78;
        byArray[74] = -119;
        byArray[75] = 107;
        byArray[76] = 83;
        byArray[77] = 106;
        byArray[78] = -76;
        byArray[79] = -15;
        byArray[80] = -31;
        byArray[81] = -26;
        byArray[82] = -67;
        byArray[83] = 69;
        byArray[84] = -30;
        byArray[85] = -12;
        byArray[86] = -74;
        byArray[87] = 102;
        byArray[88] = -52;
        byArray[89] = -107;
        byArray[90] = 3;
        byArray[91] = 86;
        byArray[92] = -44;
        byArray[93] = 28;
        byArray[94] = 30;
        byArray[95] = -41;
        byArray[96] = -5;
        byArray[97] = -61;
        byArray[98] = -114;
        byArray[99] = -75;
        byArray[100] = -23;
        byArray[101] = -49;
        byArray[102] = -65;
        byArray[103] = -70;
        byArray[104] = -22;
        byArray[105] = 119;
        byArray[106] = 57;
        byArray[107] = -81;
        byArray[108] = 51;
        byArray[109] = -55;
        byArray[110] = 98;
        byArray[111] = 113;
        byArray[112] = -127;
        byArray[113] = 121;
        byArray[114] = 9;
        byArray[115] = -83;
        byArray[116] = 36;
        byArray[117] = -51;
        byArray[118] = -7;
        byArray[119] = -40;
        byArray[120] = -27;
        byArray[121] = -59;
        byArray[122] = -71;
        byArray[123] = 77;
        byArray[124] = 68;
        byArray[125] = 8;
        byArray[126] = -122;
        byArray[127] = -25;
        byArray[128] = -95;
        byArray[129] = 29;
        byArray[130] = -86;
        byArray[131] = -19;
        byArray[132] = 6;
        byArray[133] = 112;
        byArray[134] = -78;
        byArray[135] = -46;
        byArray[136] = 65;
        byArray[137] = 123;
        byArray[138] = -96;
        byArray[139] = 17;
        byArray[140] = 49;
        byArray[141] = -62;
        byArray[142] = 39;
        byArray[143] = -112;
        byArray[144] = 32;
        byArray[145] = -10;
        byArray[146] = 96;
        byArray[147] = -1;
        byArray[148] = -106;
        byArray[149] = 92;
        byArray[150] = -79;
        byArray[151] = -85;
        byArray[152] = -98;
        byArray[153] = -100;
        byArray[154] = 82;
        byArray[155] = 27;
        byArray[156] = 95;
        byArray[157] = -109;
        byArray[158] = 10;
        byArray[159] = -17;
        byArray[160] = -111;
        byArray[161] = -123;
        byArray[162] = 73;
        byArray[163] = -18;
        byArray[164] = 45;
        byArray[165] = 79;
        byArray[166] = -113;
        byArray[167] = 59;
        byArray[168] = 71;
        byArray[169] = -121;
        byArray[170] = 109;
        byArray[171] = 70;
        byArray[172] = -42;
        byArray[173] = 62;
        byArray[174] = 105;
        byArray[175] = 100;
        byArray[176] = 42;
        byArray[177] = -50;
        byArray[178] = -53;
        byArray[179] = 47;
        byArray[180] = -4;
        byArray[181] = -105;
        byArray[182] = 5;
        byArray[183] = 122;
        byArray[184] = -84;
        byArray[185] = 127;
        byArray[186] = -43;
        byArray[187] = 26;
        byArray[188] = 75;
        byArray[189] = 14;
        byArray[190] = -89;
        byArray[191] = 90;
        byArray[192] = 40;
        byArray[193] = 20;
        byArray[194] = 63;
        byArray[195] = 41;
        byArray[196] = -120;
        byArray[197] = 60;
        byArray[198] = 76;
        byArray[199] = 2;
        byArray[200] = -72;
        byArray[201] = -38;
        byArray[202] = -80;
        byArray[203] = 23;
        byArray[204] = 85;
        byArray[205] = 31;
        byArray[206] = -118;
        byArray[207] = 125;
        byArray[208] = 87;
        byArray[209] = -57;
        byArray[210] = -115;
        byArray[211] = 116;
        byArray[212] = -73;
        byArray[213] = -60;
        byArray[214] = -97;
        byArray[215] = 114;
        byArray[216] = 126;
        byArray[217] = 21;
        byArray[218] = 34;
        byArray[219] = 18;
        byArray[220] = 88;
        byArray[221] = 7;
        byArray[222] = -103;
        byArray[223] = 52;
        byArray[224] = 110;
        byArray[225] = 80;
        byArray[226] = -34;
        byArray[227] = 104;
        byArray[228] = 101;
        byArray[229] = -68;
        byArray[230] = -37;
        byArray[231] = -8;
        byArray[232] = -56;
        byArray[233] = -88;
        byArray[234] = 43;
        byArray[235] = 64;
        byArray[236] = -36;
        byArray[237] = -2;
        byArray[238] = 50;
        byArray[239] = -92;
        byArray[240] = -54;
        byArray[241] = 16;
        byArray[242] = 33;
        byArray[243] = -16;
        byArray[244] = -45;
        byArray[245] = 93;
        byArray[246] = 15;
        byArray[247] = 0;
        byArray[248] = 111;
        byArray[249] = -99;
        byArray[250] = 54;
        byArray[251] = 66;
        byArray[252] = 74;
        byArray[253] = 94;
        byArray[254] = -63;
        byArray[255] = -32;
        byArrayArray[0] = byArray;
        byte[] byArray2 = new byte[256];
        byArray2[0] = 117;
        byArray2[1] = -13;
        byArray2[2] = -58;
        byArray2[3] = -12;
        byArray2[4] = -37;
        byArray2[5] = 123;
        byArray2[6] = -5;
        byArray2[7] = -56;
        byArray2[8] = 74;
        byArray2[9] = -45;
        byArray2[10] = -26;
        byArray2[11] = 107;
        byArray2[12] = 69;
        byArray2[13] = 125;
        byArray2[14] = -24;
        byArray2[15] = 75;
        byArray2[16] = -42;
        byArray2[17] = 50;
        byArray2[18] = -40;
        byArray2[19] = -3;
        byArray2[20] = 55;
        byArray2[21] = 113;
        byArray2[22] = -15;
        byArray2[23] = -31;
        byArray2[24] = 48;
        byArray2[25] = 15;
        byArray2[26] = -8;
        byArray2[27] = 27;
        byArray2[28] = -121;
        byArray2[29] = -6;
        byArray2[30] = 6;
        byArray2[31] = 63;
        byArray2[32] = 94;
        byArray2[33] = -70;
        byArray2[34] = -82;
        byArray2[35] = 91;
        byArray2[36] = -118;
        byArray2[37] = 0;
        byArray2[38] = -68;
        byArray2[39] = -99;
        byArray2[40] = 109;
        byArray2[41] = -63;
        byArray2[42] = -79;
        byArray2[43] = 14;
        byArray2[44] = -128;
        byArray2[45] = 93;
        byArray2[46] = -46;
        byArray2[47] = -43;
        byArray2[48] = -96;
        byArray2[49] = -124;
        byArray2[50] = 7;
        byArray2[51] = 20;
        byArray2[52] = -75;
        byArray2[53] = -112;
        byArray2[54] = 44;
        byArray2[55] = -93;
        byArray2[56] = -78;
        byArray2[57] = 115;
        byArray2[58] = 76;
        byArray2[59] = 84;
        byArray2[60] = -110;
        byArray2[61] = 116;
        byArray2[62] = 54;
        byArray2[63] = 81;
        byArray2[64] = 56;
        byArray2[65] = -80;
        byArray2[66] = -67;
        byArray2[67] = 90;
        byArray2[68] = -4;
        byArray2[69] = 96;
        byArray2[70] = 98;
        byArray2[71] = -106;
        byArray2[72] = 108;
        byArray2[73] = 66;
        byArray2[74] = -9;
        byArray2[75] = 16;
        byArray2[76] = 124;
        byArray2[77] = 40;
        byArray2[78] = 39;
        byArray2[79] = -116;
        byArray2[80] = 19;
        byArray2[81] = -107;
        byArray2[82] = -100;
        byArray2[83] = -57;
        byArray2[84] = 36;
        byArray2[85] = 70;
        byArray2[86] = 59;
        byArray2[87] = 112;
        byArray2[88] = -54;
        byArray2[89] = -29;
        byArray2[90] = -123;
        byArray2[91] = -53;
        byArray2[92] = 17;
        byArray2[93] = -48;
        byArray2[94] = -109;
        byArray2[95] = -72;
        byArray2[96] = -90;
        byArray2[97] = -125;
        byArray2[98] = 32;
        byArray2[99] = -1;
        byArray2[100] = -97;
        byArray2[101] = 119;
        byArray2[102] = -61;
        byArray2[103] = -52;
        byArray2[104] = 3;
        byArray2[105] = 111;
        byArray2[106] = 8;
        byArray2[107] = -65;
        byArray2[108] = 64;
        byArray2[109] = -25;
        byArray2[110] = 43;
        byArray2[111] = -30;
        byArray2[112] = 121;
        byArray2[113] = 12;
        byArray2[114] = -86;
        byArray2[115] = -126;
        byArray2[116] = 65;
        byArray2[117] = 58;
        byArray2[118] = -22;
        byArray2[119] = -71;
        byArray2[120] = -28;
        byArray2[121] = -102;
        byArray2[122] = -92;
        byArray2[123] = -105;
        byArray2[124] = 126;
        byArray2[125] = -38;
        byArray2[126] = 122;
        byArray2[127] = 23;
        byArray2[128] = 102;
        byArray2[129] = -108;
        byArray2[130] = -95;
        byArray2[131] = 29;
        byArray2[132] = 61;
        byArray2[133] = -16;
        byArray2[134] = -34;
        byArray2[135] = -77;
        byArray2[136] = 11;
        byArray2[137] = 114;
        byArray2[138] = -89;
        byArray2[139] = 28;
        byArray2[140] = -17;
        byArray2[141] = -47;
        byArray2[142] = 83;
        byArray2[143] = 62;
        byArray2[144] = -113;
        byArray2[145] = 51;
        byArray2[146] = 38;
        byArray2[147] = 95;
        byArray2[148] = -20;
        byArray2[149] = 118;
        byArray2[150] = 42;
        byArray2[151] = 73;
        byArray2[152] = -127;
        byArray2[153] = -120;
        byArray2[154] = -18;
        byArray2[155] = 33;
        byArray2[156] = -60;
        byArray2[157] = 26;
        byArray2[158] = -21;
        byArray2[159] = -39;
        byArray2[160] = -59;
        byArray2[161] = 57;
        byArray2[162] = -103;
        byArray2[163] = -51;
        byArray2[164] = -83;
        byArray2[165] = 49;
        byArray2[166] = -117;
        byArray2[167] = 1;
        byArray2[168] = 24;
        byArray2[169] = 35;
        byArray2[170] = -35;
        byArray2[171] = 31;
        byArray2[172] = 78;
        byArray2[173] = 45;
        byArray2[174] = -7;
        byArray2[175] = 72;
        byArray2[176] = 79;
        byArray2[177] = -14;
        byArray2[178] = 101;
        byArray2[179] = -114;
        byArray2[180] = 120;
        byArray2[181] = 92;
        byArray2[182] = 88;
        byArray2[183] = 25;
        byArray2[184] = -115;
        byArray2[185] = -27;
        byArray2[186] = -104;
        byArray2[187] = 87;
        byArray2[188] = 103;
        byArray2[189] = 127;
        byArray2[190] = 5;
        byArray2[191] = 100;
        byArray2[192] = -81;
        byArray2[193] = 99;
        byArray2[194] = -74;
        byArray2[195] = -2;
        byArray2[196] = -11;
        byArray2[197] = -73;
        byArray2[198] = 60;
        byArray2[199] = -91;
        byArray2[200] = -50;
        byArray2[201] = -23;
        byArray2[202] = 104;
        byArray2[203] = 68;
        byArray2[204] = -32;
        byArray2[205] = 77;
        byArray2[206] = 67;
        byArray2[207] = 105;
        byArray2[208] = 41;
        byArray2[209] = 46;
        byArray2[210] = -84;
        byArray2[211] = 21;
        byArray2[212] = 89;
        byArray2[213] = -88;
        byArray2[214] = 10;
        byArray2[215] = -98;
        byArray2[216] = 110;
        byArray2[217] = 71;
        byArray2[218] = -33;
        byArray2[219] = 52;
        byArray2[220] = 53;
        byArray2[221] = 106;
        byArray2[222] = -49;
        byArray2[223] = -36;
        byArray2[224] = 34;
        byArray2[225] = -55;
        byArray2[226] = -64;
        byArray2[227] = -101;
        byArray2[228] = -119;
        byArray2[229] = -44;
        byArray2[230] = -19;
        byArray2[231] = -85;
        byArray2[232] = 18;
        byArray2[233] = -94;
        byArray2[234] = 13;
        byArray2[235] = 82;
        byArray2[236] = -69;
        byArray2[237] = 2;
        byArray2[238] = 47;
        byArray2[239] = -87;
        byArray2[240] = -41;
        byArray2[241] = 97;
        byArray2[242] = 30;
        byArray2[243] = -76;
        byArray2[244] = 80;
        byArray2[245] = 4;
        byArray2[246] = -10;
        byArray2[247] = -62;
        byArray2[248] = 22;
        byArray2[249] = 37;
        byArray2[250] = -122;
        byArray2[251] = 86;
        byArray2[252] = 85;
        byArray2[253] = 9;
        byArray2[254] = -66;
        byArray2[255] = -111;
        byArrayArray[1] = byArray2;
        cfr_renamed_2 = byArrayArray;
    }

    private /* synthetic */ int cfr_renamed_3546(int arg0) {
        return this.cfr_renamed_145[0 + 2 * (arg0 & 0xFF)] ^ this.cfr_renamed_145[1 + 2 * (arg0 >>> 8 & 0xFF)] ^ this.cfr_renamed_145[512 + 2 * (arg0 >>> 16 & 0xFF)] ^ this.cfr_renamed_145[513 + 2 * (arg0 >>> 24 & 0xFF)];
    }

    private /* synthetic */ int cfr_renamed_3542(int arg0) {
        return arg0 >> 1 ^ ((arg0 & 1) != 0 ? 180 : 0);
    }

    private /* synthetic */ int cfr_renamed_3554(int arg0) {
        return arg0 >>> 16 & 0xFF;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        sprtld sprtld2 = this;
        int n4 = this.cfr_renamed_3545(byArray, n) ^ sprtld2.cfr_renamed_957[0];
        sprtld sprtld3 = this;
        int n5 = sprtld2.cfr_renamed_3545(byArray, n + 4) ^ sprtld3.cfr_renamed_957[1];
        sprtld sprtld4 = this;
        int n6 = sprtld3.cfr_renamed_3545(byArray, n + 8) ^ sprtld4.cfr_renamed_957[2];
        int n7 = sprtld4.cfr_renamed_3545(byArray, (int)(arg1 + 12)) ^ this.cfr_renamed_957[3];
        int n8 = 8;
        int n9 = n3 = 0;
        while (n9 < 16) {
            sprtld sprtld5 = this;
            int n10 = sprtld5.cfr_renamed_3546(n4);
            int n11 = sprtld5.cfr_renamed_3547(n5);
            sprtld sprtld6 = this;
            int n12 = n6 ^ n10 + n11 + sprtld6.cfr_renamed_957[n8];
            n6 = n12;
            n6 = n12 >>> 1 | n6 << 31;
            int n13 = (n7 << 1 | n7 >>> 31) ^ n10 + 2 * n11 + this.cfr_renamed_957[++n8];
            n7 = n13;
            n10 = sprtld6.cfr_renamed_3546(n6);
            n11 = sprtld5.cfr_renamed_3547(n7);
            int n14 = n4 ^ n10 + n11 + this.cfr_renamed_957[++n8];
            n4 = n14;
            n4 = n14 >>> 1 | n4 << 31;
            int n15 = (n5 << 1 | n5 >>> 31) ^ n10 + 2 * n11 + this.cfr_renamed_957[++n8];
            ++n8;
            n5 = n15;
            n9 = n3 += 2;
        }
        sprtld sprtld7 = this;
        sprtld7.cfr_renamed_3548(n6 ^ sprtld7.cfr_renamed_957[4], (byte[])arg2, (int)arg3);
        sprtld sprtld8 = this;
        sprtld8.cfr_renamed_3548(n7 ^ sprtld8.cfr_renamed_957[5], (byte[])arg2, (int)(arg3 + 4));
        sprtld sprtld9 = this;
        sprtld9.cfr_renamed_3548(n4 ^ sprtld9.cfr_renamed_957[6], (byte[])arg2, (int)(arg3 + 8));
        this.cfr_renamed_3548(n5 ^ this.cfr_renamed_957[7], (byte[])arg2, (int)(arg3 + 12));
    }
}

