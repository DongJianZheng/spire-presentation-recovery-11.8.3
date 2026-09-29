/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjyk;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprzra;

public final class sprted
implements sprko,
sprrj {
    private static final long[] cfr_renamed_126;
    private long[] cfr_renamed_88;
    private static final int cfr_renamed_31 = 64;
    private final long[] cfr_renamed_272;
    private long[] cfr_renamed_145;
    private static final long[] cfr_renamed_114;
    private long[] cfr_renamed_96;
    private byte[] cfr_renamed_105;
    private static final int cfr_renamed_137 = 285;
    private static final int cfr_renamed_79 = 32;
    private long[] cfr_renamed_107;
    private int cfr_renamed_132;
    private long[] cfr_renamed_102;
    private static final int cfr_renamed_93 = 64;
    private static final long[] cfr_renamed_86;
    private static final long[] cfr_renamed_152;
    private static final int cfr_renamed_112 = 10;
    private static final short[] cfr_renamed_119;
    private static final int[] cfr_renamed_91;
    private short[] cfr_renamed_0;
    private static final long[] cfr_renamed_1;
    private static final long[] cfr_renamed_2;
    private static final long[] cfr_renamed_3;
    private static final long[] cfr_renamed_4;

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprted sprted2 = (sprted)arg0;
        System.arraycopy(sprted2.cfr_renamed_272, 0, this.cfr_renamed_272, 0, this.cfr_renamed_272.length);
        System.arraycopy(sprted2.cfr_renamed_105, 0, this.cfr_renamed_105, 0, this.cfr_renamed_105.length);
        sprted sprted3 = sprted2;
        this.cfr_renamed_132 = sprted3.cfr_renamed_132;
        System.arraycopy(sprted3.cfr_renamed_0, 0, this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        System.arraycopy(sprted2.cfr_renamed_145, 0, this.cfr_renamed_145, 0, this.cfr_renamed_145.length);
        System.arraycopy(sprted2.cfr_renamed_96, 0, this.cfr_renamed_96, 0, this.cfr_renamed_96.length);
        System.arraycopy(sprted2.cfr_renamed_107, 0, this.cfr_renamed_107, 0, this.cfr_renamed_107.length);
        System.arraycopy(sprted2.cfr_renamed_88, 0, this.cfr_renamed_88, 0, this.cfr_renamed_88.length);
        System.arraycopy(sprted2.cfr_renamed_102, 0, this.cfr_renamed_102, 0, this.cfr_renamed_102.length);
    }

    private /* synthetic */ void cfr_renamed_3753(byte[] arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_102.length) {
            sprted sprted2 = this;
            int n3 = n++;
            this.cfr_renamed_88[n3] = sprted2.cfr_renamed_3754(sprted2.cfr_renamed_105, n3 * 8);
            n2 = n;
        }
        this.cfr_renamed_3473();
        this.cfr_renamed_132 = 0;
        sprzra.cfr_renamed_492(this.cfr_renamed_105, (byte)0);
    }

    private /* synthetic */ void cfr_renamed_3755() {
        int n;
        int n2 = 0;
        int n3 = n = this.cfr_renamed_0.length - 1;
        while (n3 >= 0) {
            sprted sprted2 = this;
            int n4 = (sprted2.cfr_renamed_0[n] & 0xFF) + cfr_renamed_119[n] + n2;
            n2 = n4 >>> 8;
            sprted2.cfr_renamed_0[n--] = (short)(n4 & 0xFF);
            n3 = n;
        }
    }

    @Override
    public void cfr_renamed_41() {
        sprted sprted2 = this;
        sprted2.cfr_renamed_132 = 0;
        sprzra.cfr_renamed_528(sprted2.cfr_renamed_0, (short)0);
        sprzra.cfr_renamed_492(sprted2.cfr_renamed_105, (byte)0);
        sprzra.cfr_renamed_516(sprted2.cfr_renamed_145, 0L);
        sprzra.cfr_renamed_516(sprted2.cfr_renamed_96, 0L);
        sprzra.cfr_renamed_516(sprted2.cfr_renamed_107, 0L);
        sprzra.cfr_renamed_516(sprted2.cfr_renamed_88, 0L);
        sprzra.cfr_renamed_516(sprted2.cfr_renamed_102, 0L);
    }

    static {
        int[] nArray = new int[256];
        nArray[0] = 24;
        nArray[1] = 35;
        nArray[2] = 198;
        nArray[3] = 232;
        nArray[4] = 135;
        nArray[5] = 184;
        nArray[6] = 1;
        nArray[7] = 79;
        nArray[8] = 54;
        nArray[9] = 166;
        nArray[10] = 210;
        nArray[11] = 245;
        nArray[12] = 121;
        nArray[13] = 111;
        nArray[14] = 145;
        nArray[15] = 82;
        nArray[16] = 96;
        nArray[17] = 188;
        nArray[18] = 155;
        nArray[19] = 142;
        nArray[20] = 163;
        nArray[21] = 12;
        nArray[22] = 123;
        nArray[23] = 53;
        nArray[24] = 29;
        nArray[25] = 224;
        nArray[26] = 215;
        nArray[27] = 194;
        nArray[28] = 46;
        nArray[29] = 75;
        nArray[30] = 254;
        nArray[31] = 87;
        nArray[32] = 21;
        nArray[33] = 119;
        nArray[34] = 55;
        nArray[35] = 229;
        nArray[36] = 159;
        nArray[37] = 240;
        nArray[38] = 74;
        nArray[39] = 218;
        nArray[40] = 88;
        nArray[41] = 201;
        nArray[42] = 41;
        nArray[43] = 10;
        nArray[44] = 177;
        nArray[45] = 160;
        nArray[46] = 107;
        nArray[47] = 133;
        nArray[48] = 189;
        nArray[49] = 93;
        nArray[50] = 16;
        nArray[51] = 244;
        nArray[52] = 203;
        nArray[53] = 62;
        nArray[54] = 5;
        nArray[55] = 103;
        nArray[56] = 228;
        nArray[57] = 39;
        nArray[58] = 65;
        nArray[59] = 139;
        nArray[60] = 167;
        nArray[61] = 125;
        nArray[62] = 149;
        nArray[63] = 216;
        nArray[64] = 251;
        nArray[65] = 238;
        nArray[66] = 124;
        nArray[67] = 102;
        nArray[68] = 221;
        nArray[69] = 23;
        nArray[70] = 71;
        nArray[71] = 158;
        nArray[72] = 202;
        nArray[73] = 45;
        nArray[74] = 191;
        nArray[75] = 7;
        nArray[76] = 173;
        nArray[77] = 90;
        nArray[78] = 131;
        nArray[79] = 51;
        nArray[80] = 99;
        nArray[81] = 2;
        nArray[82] = 170;
        nArray[83] = 113;
        nArray[84] = 200;
        nArray[85] = 25;
        nArray[86] = 73;
        nArray[87] = 217;
        nArray[88] = 242;
        nArray[89] = 227;
        nArray[90] = 91;
        nArray[91] = 136;
        nArray[92] = 154;
        nArray[93] = 38;
        nArray[94] = 50;
        nArray[95] = 176;
        nArray[96] = 233;
        nArray[97] = 15;
        nArray[98] = 213;
        nArray[99] = 128;
        nArray[100] = 190;
        nArray[101] = 205;
        nArray[102] = 52;
        nArray[103] = 72;
        nArray[104] = 255;
        nArray[105] = 122;
        nArray[106] = 144;
        nArray[107] = 95;
        nArray[108] = 32;
        nArray[109] = 104;
        nArray[110] = 26;
        nArray[111] = 174;
        nArray[112] = 180;
        nArray[113] = 84;
        nArray[114] = 147;
        nArray[115] = 34;
        nArray[116] = 100;
        nArray[117] = 241;
        nArray[118] = 115;
        nArray[119] = 18;
        nArray[120] = 64;
        nArray[121] = 8;
        nArray[122] = 195;
        nArray[123] = 236;
        nArray[124] = 219;
        nArray[125] = 161;
        nArray[126] = 141;
        nArray[127] = 61;
        nArray[128] = 151;
        nArray[129] = 0;
        nArray[130] = 207;
        nArray[131] = 43;
        nArray[132] = 118;
        nArray[133] = 130;
        nArray[134] = 214;
        nArray[135] = 27;
        nArray[136] = 181;
        nArray[137] = 175;
        nArray[138] = 106;
        nArray[139] = 80;
        nArray[140] = 69;
        nArray[141] = 243;
        nArray[142] = 48;
        nArray[143] = 239;
        nArray[144] = 63;
        nArray[145] = 85;
        nArray[146] = 162;
        nArray[147] = 234;
        nArray[148] = 101;
        nArray[149] = 186;
        nArray[150] = 47;
        nArray[151] = 192;
        nArray[152] = 222;
        nArray[153] = 28;
        nArray[154] = 253;
        nArray[155] = 77;
        nArray[156] = 146;
        nArray[157] = 117;
        nArray[158] = 6;
        nArray[159] = 138;
        nArray[160] = 178;
        nArray[161] = 230;
        nArray[162] = 14;
        nArray[163] = 31;
        nArray[164] = 98;
        nArray[165] = 212;
        nArray[166] = 168;
        nArray[167] = 150;
        nArray[168] = 249;
        nArray[169] = 197;
        nArray[170] = 37;
        nArray[171] = 89;
        nArray[172] = 132;
        nArray[173] = 114;
        nArray[174] = 57;
        nArray[175] = 76;
        nArray[176] = 94;
        nArray[177] = 120;
        nArray[178] = 56;
        nArray[179] = 140;
        nArray[180] = 209;
        nArray[181] = 165;
        nArray[182] = 226;
        nArray[183] = 97;
        nArray[184] = 179;
        nArray[185] = 33;
        nArray[186] = 156;
        nArray[187] = 30;
        nArray[188] = 67;
        nArray[189] = 199;
        nArray[190] = 252;
        nArray[191] = 4;
        nArray[192] = 81;
        nArray[193] = 153;
        nArray[194] = 109;
        nArray[195] = 13;
        nArray[196] = 250;
        nArray[197] = 223;
        nArray[198] = 126;
        nArray[199] = 36;
        nArray[200] = 59;
        nArray[201] = 171;
        nArray[202] = 206;
        nArray[203] = 17;
        nArray[204] = 143;
        nArray[205] = 78;
        nArray[206] = 183;
        nArray[207] = 235;
        nArray[208] = 60;
        nArray[209] = 129;
        nArray[210] = 148;
        nArray[211] = 247;
        nArray[212] = 185;
        nArray[213] = 19;
        nArray[214] = 44;
        nArray[215] = 211;
        nArray[216] = 231;
        nArray[217] = 110;
        nArray[218] = 196;
        nArray[219] = 3;
        nArray[220] = 86;
        nArray[221] = 68;
        nArray[222] = 127;
        nArray[223] = 169;
        nArray[224] = 42;
        nArray[225] = 187;
        nArray[226] = 193;
        nArray[227] = 83;
        nArray[228] = 220;
        nArray[229] = 11;
        nArray[230] = 157;
        nArray[231] = 108;
        nArray[232] = 49;
        nArray[233] = 116;
        nArray[234] = 246;
        nArray[235] = 70;
        nArray[236] = 172;
        nArray[237] = 137;
        nArray[238] = 20;
        nArray[239] = 225;
        nArray[240] = 22;
        nArray[241] = 58;
        nArray[242] = 105;
        nArray[243] = 9;
        nArray[244] = 112;
        nArray[245] = 182;
        nArray[246] = 208;
        nArray[247] = 237;
        nArray[248] = 204;
        nArray[249] = 66;
        nArray[250] = 152;
        nArray[251] = 164;
        nArray[252] = 40;
        nArray[253] = 92;
        nArray[254] = 248;
        nArray[255] = 134;
        cfr_renamed_91 = nArray;
        cfr_renamed_152 = new long[256];
        cfr_renamed_126 = new long[256];
        cfr_renamed_4 = new long[256];
        cfr_renamed_2 = new long[256];
        cfr_renamed_114 = new long[256];
        cfr_renamed_3 = new long[256];
        cfr_renamed_1 = new long[256];
        cfr_renamed_86 = new long[256];
        cfr_renamed_119 = new short[32];
        sprted.cfr_renamed_119[31] = 8;
    }

    public sprted(sprted sprted2) {
        sprted sprted3 = this;
        sprted sprted4 = this;
        sprted sprted5 = this;
        sprted sprted6 = this;
        sprted6.cfr_renamed_272 = new long[11];
        sprted6.cfr_renamed_105 = new byte[64];
        sprted5.cfr_renamed_132 = 0;
        sprted5.cfr_renamed_0 = new short[32];
        sprted4.cfr_renamed_145 = new long[8];
        sprted4.cfr_renamed_96 = new long[8];
        sprted3.cfr_renamed_107 = new long[8];
        sprted3.cfr_renamed_88 = new long[8];
        this.cfr_renamed_102 = new long[8];
        this.cfr_renamed_462(sprted2);
    }

    private /* synthetic */ void cfr_renamed_3756(long arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            int n3 = arg2 + n;
            byte by = (byte)(arg0 >> 56 - n * 8 & 0xFFL);
            arg1[n3] = by;
            n2 = ++n;
        }
    }

    private /* synthetic */ long cfr_renamed_3757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        return (long)arg0 << 56 ^ (long)arg1 << 48 ^ (long)arg2 << 40 ^ (long)arg3 << 32 ^ (long)arg4 << 24 ^ (long)arg5 << 16 ^ (long)arg6 << 8 ^ (long)arg7;
    }

    private /* synthetic */ byte[] cfr_renamed_3758() {
        int n;
        byte[] byArray = new byte[32];
        int n2 = n = 0;
        while (n2 < byArray.length) {
            int n3 = n++;
            byArray[n3] = (byte)(this.cfr_renamed_0[n3] & 0xFF);
            n2 = n;
        }
        return byArray;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprjyk.cfr_renamed_9("y(G2B0A/B");
    }

    public void cfr_renamed_3473() {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            sprted sprted2 = this;
            int n3 = n;
            sprted sprted3 = this;
            int n4 = n++;
            long l = sprted3.cfr_renamed_145[n4];
            sprted3.cfr_renamed_96[n4] = l;
            sprted2.cfr_renamed_102[n3] = sprted2.cfr_renamed_88[n3] ^ l;
            n2 = n;
        }
        int n5 = n = 1;
        while (n5 <= 10) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < 8) {
                sprted sprted4 = this;
                sprted4.cfr_renamed_107[n6] = 0L;
                int n8 = n6;
                sprted4.cfr_renamed_107[n8] = sprted4.cfr_renamed_107[n8] ^ cfr_renamed_152[(int)(this.cfr_renamed_96[n6 - 0 & 7] >>> 56) & 0xFF];
                int n9 = n6;
                sprted4.cfr_renamed_107[n9] = sprted4.cfr_renamed_107[n9] ^ cfr_renamed_126[(int)(this.cfr_renamed_96[n6 - 1 & 7] >>> 48) & 0xFF];
                int n10 = n6;
                sprted4.cfr_renamed_107[n10] = sprted4.cfr_renamed_107[n10] ^ cfr_renamed_4[(int)(this.cfr_renamed_96[n6 - 2 & 7] >>> 40) & 0xFF];
                int n11 = n6;
                sprted4.cfr_renamed_107[n11] = sprted4.cfr_renamed_107[n11] ^ cfr_renamed_2[(int)(this.cfr_renamed_96[n6 - 3 & 7] >>> 32) & 0xFF];
                int n12 = n6;
                sprted4.cfr_renamed_107[n12] = sprted4.cfr_renamed_107[n12] ^ cfr_renamed_114[(int)(this.cfr_renamed_96[n6 - 4 & 7] >>> 24) & 0xFF];
                int n13 = n6;
                sprted4.cfr_renamed_107[n13] = sprted4.cfr_renamed_107[n13] ^ cfr_renamed_3[(int)(this.cfr_renamed_96[n6 - 5 & 7] >>> 16) & 0xFF];
                int n14 = n6;
                sprted4.cfr_renamed_107[n14] = sprted4.cfr_renamed_107[n14] ^ cfr_renamed_1[(int)(this.cfr_renamed_96[n6 - 6 & 7] >>> 8) & 0xFF];
                int n15 = n6;
                long l = sprted4.cfr_renamed_107[n15] ^ cfr_renamed_86[(int)this.cfr_renamed_96[n6 - 7 & 7] & 0xFF];
                sprted4.cfr_renamed_107[n15] = l;
                n7 = ++n6;
            }
            System.arraycopy(this.cfr_renamed_107, 0, this.cfr_renamed_96, 0, this.cfr_renamed_96.length);
            long[] lArray = this.cfr_renamed_96;
            lArray[0] = lArray[0] ^ this.cfr_renamed_272[n];
            int n16 = n6 = 0;
            while (n16 < 8) {
                sprted sprted5 = this;
                sprted sprted6 = this;
                sprted5.cfr_renamed_107[n6] = sprted6.cfr_renamed_96[n6];
                int n17 = n6;
                sprted6.cfr_renamed_107[n17] = sprted6.cfr_renamed_107[n17] ^ cfr_renamed_152[(int)(this.cfr_renamed_102[n6 - 0 & 7] >>> 56) & 0xFF];
                int n18 = n6;
                sprted5.cfr_renamed_107[n18] = sprted5.cfr_renamed_107[n18] ^ cfr_renamed_126[(int)(this.cfr_renamed_102[n6 - 1 & 7] >>> 48) & 0xFF];
                int n19 = n6;
                sprted5.cfr_renamed_107[n19] = sprted5.cfr_renamed_107[n19] ^ cfr_renamed_4[(int)(this.cfr_renamed_102[n6 - 2 & 7] >>> 40) & 0xFF];
                int n20 = n6;
                sprted5.cfr_renamed_107[n20] = sprted5.cfr_renamed_107[n20] ^ cfr_renamed_2[(int)(this.cfr_renamed_102[n6 - 3 & 7] >>> 32) & 0xFF];
                int n21 = n6;
                sprted5.cfr_renamed_107[n21] = sprted5.cfr_renamed_107[n21] ^ cfr_renamed_114[(int)(this.cfr_renamed_102[n6 - 4 & 7] >>> 24) & 0xFF];
                int n22 = n6;
                sprted5.cfr_renamed_107[n22] = sprted5.cfr_renamed_107[n22] ^ cfr_renamed_3[(int)(this.cfr_renamed_102[n6 - 5 & 7] >>> 16) & 0xFF];
                int n23 = n6;
                sprted5.cfr_renamed_107[n23] = sprted5.cfr_renamed_107[n23] ^ cfr_renamed_1[(int)(this.cfr_renamed_102[n6 - 6 & 7] >>> 8) & 0xFF];
                int n24 = n6;
                long l = sprted5.cfr_renamed_107[n24] ^ cfr_renamed_86[(int)this.cfr_renamed_102[n6 - 7 & 7] & 0xFF];
                sprted5.cfr_renamed_107[n24] = l;
                n16 = ++n6;
            }
            System.arraycopy(this.cfr_renamed_107, 0, this.cfr_renamed_102, 0, this.cfr_renamed_102.length);
            n5 = ++n;
        }
        int n25 = n = 0;
        while (n25 < 8) {
            int n26 = n;
            long l = this.cfr_renamed_145[n26] ^ (this.cfr_renamed_102[n] ^ this.cfr_renamed_88[n]);
            this.cfr_renamed_145[n26] = l;
            n25 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        int n2;
        this.cfr_renamed_3120();
        int n3 = n2 = 0;
        while (n3 < 8) {
            void arg1;
            void arg0;
            sprted sprted2 = this;
            sprted2.cfr_renamed_3756(sprted2.cfr_renamed_145[n2], (byte[])arg0, (int)(arg1 + n2++ * 8));
            n3 = n2;
        }
        sprted sprted3 = this;
        sprted3.cfr_renamed_41();
        return sprted3.cfr_renamed_1218();
    }

    private /* synthetic */ int cfr_renamed_3759(int arg0) {
        int n = arg0;
        if ((long)n >= 256L) {
            n ^= 0x11D;
        }
        return n;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n = arg2;
        while (n > 0) {
            this.cfr_renamed_1221(arg0[arg1++]);
            n = --arg2;
        }
    }

    @Override
    public int cfr_renamed_1218() {
        return 64;
    }

    public sprted() {
        int n;
        int n2;
        sprted sprted2 = this;
        sprted sprted3 = this;
        sprted sprted4 = this;
        sprted sprted5 = this;
        this.cfr_renamed_272 = new long[11];
        sprted5.cfr_renamed_105 = new byte[64];
        sprted5.cfr_renamed_132 = 0;
        sprted4.cfr_renamed_0 = new short[32];
        sprted4.cfr_renamed_145 = new long[8];
        sprted3.cfr_renamed_96 = new long[8];
        sprted3.cfr_renamed_107 = new long[8];
        sprted2.cfr_renamed_88 = new long[8];
        sprted2.cfr_renamed_102 = new long[8];
        int n3 = n2 = 0;
        while (n3 < 256) {
            n = cfr_renamed_91[n2];
            sprted sprted6 = this;
            int n4 = sprted6.cfr_renamed_3759(n << 1);
            int n5 = sprted6.cfr_renamed_3759(n4 << 1);
            int n6 = n5 ^ n;
            int n7 = sprted6.cfr_renamed_3759(n5 << 1);
            int n8 = n7 ^ n;
            int n9 = n;
            sprted.cfr_renamed_152[n2] = this.cfr_renamed_3757(n9, n9, n5, n9, n7, n6, n4, n8);
            int n10 = n;
            sprted.cfr_renamed_126[n2] = this.cfr_renamed_3757(n8, n10, n10, n5, n10, n7, n6, n4);
            int n11 = n;
            sprted.cfr_renamed_4[n2] = this.cfr_renamed_3757(n4, n8, n11, n11, n5, n11, n7, n6);
            int n12 = n;
            sprted.cfr_renamed_2[n2] = this.cfr_renamed_3757(n6, n4, n8, n12, n12, n5, n12, n7);
            int n13 = n;
            sprted.cfr_renamed_114[n2] = this.cfr_renamed_3757(n7, n6, n4, n8, n13, n13, n5, n13);
            int n14 = n;
            sprted.cfr_renamed_3[n2] = this.cfr_renamed_3757(n, n7, n6, n4, n8, n14, n14, n5);
            int n15 = n;
            sprted.cfr_renamed_1[n2] = this.cfr_renamed_3757(n5, n, n7, n6, n4, n8, n15, n15);
            int n16 = n;
            sprted.cfr_renamed_86[n2++] = this.cfr_renamed_3757(n16, n5, n16, n7, n6, n4, n8, n);
            n3 = n2;
        }
        this.cfr_renamed_272[0] = 0L;
        int n17 = n2 = 1;
        while (n17 <= 10) {
            n = 8 * (n2 - 1);
            this.cfr_renamed_272[n2++] = cfr_renamed_152[n] & 0xFF00000000000000L ^ cfr_renamed_126[n + 1] & 0xFF000000000000L ^ cfr_renamed_4[n + 2] & 0xFF0000000000L ^ cfr_renamed_2[n + 3] & 0xFF00000000L ^ cfr_renamed_114[n + 4] & 0xFF000000L ^ cfr_renamed_3[n + 5] & 0xFF0000L ^ cfr_renamed_1[n + 6] & 0xFF00L ^ cfr_renamed_86[n + 7] & 0xFFL;
            n17 = n2;
        }
    }

    private /* synthetic */ long cfr_renamed_3754(byte[] arg0, int arg1) {
        return ((long)arg0[arg1 + 0] & 0xFFL) << 56 | ((long)arg0[arg1 + 1] & 0xFFL) << 48 | ((long)arg0[arg1 + 2] & 0xFFL) << 40 | ((long)arg0[arg1 + 3] & 0xFFL) << 32 | ((long)arg0[arg1 + 4] & 0xFFL) << 24 | ((long)arg0[arg1 + 5] & 0xFFL) << 16 | ((long)arg0[arg1 + 6] & 0xFFL) << 8 | (long)arg0[arg1 + 7] & 0xFFL;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1221(byte by) {
        void arg0;
        sprted sprted2 = this;
        sprted sprted3 = this;
        sprted2.cfr_renamed_105[sprted3.cfr_renamed_132] = arg0;
        ++sprted2.cfr_renamed_132;
        if (sprted3.cfr_renamed_132 == this.cfr_renamed_105.length) {
            sprted sprted4 = this;
            sprted4.cfr_renamed_3753(sprted4.cfr_renamed_105, 0);
        }
        this.cfr_renamed_3755();
    }

    @Override
    public int cfr_renamed_3248() {
        return 64;
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprted(this);
    }

    private /* synthetic */ void cfr_renamed_3120() {
        sprted sprted2 = this;
        byte[] byArray = sprted2.cfr_renamed_3758();
        int n = this.cfr_renamed_132++;
        sprted2.cfr_renamed_105[n] = (byte)(sprted2.cfr_renamed_105[n] | 0x80);
        sprted sprted3 = this;
        if (sprted3.cfr_renamed_132 == sprted3.cfr_renamed_105.length) {
            sprted sprted4 = this;
            sprted4.cfr_renamed_3753(sprted4.cfr_renamed_105, 0);
        }
        if (this.cfr_renamed_132 > 32) {
            sprted sprted5 = this;
            while (sprted5.cfr_renamed_132 != 0) {
                sprted sprted6 = this;
                sprted5 = sprted6;
                sprted6.cfr_renamed_1221((byte)0);
            }
        }
        sprted sprted7 = this;
        while (sprted7.cfr_renamed_132 <= 32) {
            sprted sprted8 = this;
            sprted7 = sprted8;
            sprted8.cfr_renamed_1221((byte)0);
        }
        System.arraycopy(byArray, 0, this.cfr_renamed_105, 32, byArray.length);
        sprted sprted9 = this;
        sprted9.cfr_renamed_3753(sprted9.cfr_renamed_105, 0);
    }
}

