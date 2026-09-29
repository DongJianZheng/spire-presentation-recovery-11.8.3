/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprkop;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprybl;

public final class sprsel
implements sprpl,
sprhx {
    private long[] cfr_renamed_82;
    private short[] cfr_renamed_126;
    private static final int cfr_renamed_88 = 32;
    private static final long[] cfr_renamed_31;
    private static final long[] cfr_renamed_272;
    private static final int cfr_renamed_145 = 64;
    private byte[] cfr_renamed_114;
    private static final long[] cfr_renamed_96;
    private final long[] cfr_renamed_105;
    private static final long[] cfr_renamed_137;
    private static final int cfr_renamed_79 = 285;
    private static final long[] cfr_renamed_107;
    private long[] cfr_renamed_132;
    private static final int cfr_renamed_102 = 10;
    private long[] cfr_renamed_93;
    private static final int cfr_renamed_86 = 64;
    private long[] cfr_renamed_152;
    private static final short[] cfr_renamed_112;
    private static final int[] cfr_renamed_119;
    private int cfr_renamed_91;
    private long[] cfr_renamed_0;
    private static final long[] cfr_renamed_1;
    private static final long[] cfr_renamed_2;
    private static final long[] cfr_renamed_3;
    private final spriil cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1221(byte by) {
        void arg0;
        sprsel sprsel2 = this;
        this.cfr_renamed_114[sprsel2.cfr_renamed_91] = arg0;
        if (++sprsel2.cfr_renamed_91 == this.cfr_renamed_114.length) {
            sprsel sprsel3 = this;
            sprsel3.cfr_renamed_3753(sprsel3.cfr_renamed_114, 0);
        }
        this.cfr_renamed_3755();
    }

    public sprsel(sprsel sprsel2) {
        sprsel sprsel3 = this;
        sprsel sprsel4 = this;
        sprsel sprsel5 = this;
        sprsel sprsel6 = this;
        sprsel sprsel7 = this;
        this.cfr_renamed_105 = new long[11];
        sprsel7.cfr_renamed_114 = new byte[64];
        sprsel7.cfr_renamed_91 = 0;
        sprsel6.cfr_renamed_126 = new short[32];
        sprsel6.cfr_renamed_93 = new long[8];
        sprsel5.cfr_renamed_152 = new long[8];
        sprsel5.cfr_renamed_0 = new long[8];
        sprsel4.cfr_renamed_132 = new long[8];
        sprsel4.cfr_renamed_82 = new long[8];
        sprsel3.cfr_renamed_4 = sprsel2.cfr_renamed_4;
        sprsel3.cfr_renamed_5183(sprsel2);
        sprsel sprsel8 = this;
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprsel8, sprsel3.cfr_renamed_1218(), sprsel8.cfr_renamed_4));
    }

    @Override
    public void cfr_renamed_41() {
        sprsel sprsel2 = this;
        sprsel2.cfr_renamed_91 = 0;
        sproze.cfr_renamed_528(sprsel2.cfr_renamed_126, (short)0);
        sproze.cfr_renamed_492(sprsel2.cfr_renamed_114, (byte)0);
        sproze.cfr_renamed_516(sprsel2.cfr_renamed_93, 0L);
        sproze.cfr_renamed_516(sprsel2.cfr_renamed_152, 0L);
        sproze.cfr_renamed_516(sprsel2.cfr_renamed_0, 0L);
        sproze.cfr_renamed_516(sprsel2.cfr_renamed_132, 0L);
        sproze.cfr_renamed_516(sprsel2.cfr_renamed_82, 0L);
    }

    @Override
    public int cfr_renamed_3248() {
        return 64;
    }

    public void cfr_renamed_3473() {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            sprsel sprsel2 = this;
            int n3 = n;
            sprsel sprsel3 = this;
            int n4 = n++;
            long l = sprsel3.cfr_renamed_93[n4];
            sprsel3.cfr_renamed_152[n4] = l;
            sprsel2.cfr_renamed_82[n3] = sprsel2.cfr_renamed_132[n3] ^ l;
            n2 = n;
        }
        int n5 = n = 1;
        while (n5 <= 10) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < 8) {
                sprsel sprsel4 = this;
                sprsel4.cfr_renamed_0[n6] = 0L;
                int n8 = n6;
                sprsel4.cfr_renamed_0[n8] = sprsel4.cfr_renamed_0[n8] ^ cfr_renamed_272[(int)(this.cfr_renamed_152[n6 - 0 & 7] >>> 56) & 0xFF];
                int n9 = n6;
                sprsel4.cfr_renamed_0[n9] = sprsel4.cfr_renamed_0[n9] ^ cfr_renamed_31[(int)(this.cfr_renamed_152[n6 - 1 & 7] >>> 48) & 0xFF];
                int n10 = n6;
                sprsel4.cfr_renamed_0[n10] = sprsel4.cfr_renamed_0[n10] ^ cfr_renamed_2[(int)(this.cfr_renamed_152[n6 - 2 & 7] >>> 40) & 0xFF];
                int n11 = n6;
                sprsel4.cfr_renamed_0[n11] = sprsel4.cfr_renamed_0[n11] ^ cfr_renamed_107[(int)(this.cfr_renamed_152[n6 - 3 & 7] >>> 32) & 0xFF];
                int n12 = n6;
                sprsel4.cfr_renamed_0[n12] = sprsel4.cfr_renamed_0[n12] ^ cfr_renamed_96[(int)(this.cfr_renamed_152[n6 - 4 & 7] >>> 24) & 0xFF];
                int n13 = n6;
                sprsel4.cfr_renamed_0[n13] = sprsel4.cfr_renamed_0[n13] ^ cfr_renamed_1[(int)(this.cfr_renamed_152[n6 - 5 & 7] >>> 16) & 0xFF];
                int n14 = n6;
                sprsel4.cfr_renamed_0[n14] = sprsel4.cfr_renamed_0[n14] ^ cfr_renamed_3[(int)(this.cfr_renamed_152[n6 - 6 & 7] >>> 8) & 0xFF];
                int n15 = n6;
                long l = sprsel4.cfr_renamed_0[n15] ^ cfr_renamed_137[(int)this.cfr_renamed_152[n6 - 7 & 7] & 0xFF];
                sprsel4.cfr_renamed_0[n15] = l;
                n7 = ++n6;
            }
            System.arraycopy(this.cfr_renamed_0, 0, this.cfr_renamed_152, 0, this.cfr_renamed_152.length);
            long[] lArray = this.cfr_renamed_152;
            lArray[0] = lArray[0] ^ this.cfr_renamed_105[n];
            int n16 = n6 = 0;
            while (n16 < 8) {
                sprsel sprsel5 = this;
                sprsel sprsel6 = this;
                sprsel5.cfr_renamed_0[n6] = sprsel6.cfr_renamed_152[n6];
                int n17 = n6;
                sprsel6.cfr_renamed_0[n17] = sprsel6.cfr_renamed_0[n17] ^ cfr_renamed_272[(int)(this.cfr_renamed_82[n6 - 0 & 7] >>> 56) & 0xFF];
                int n18 = n6;
                sprsel5.cfr_renamed_0[n18] = sprsel5.cfr_renamed_0[n18] ^ cfr_renamed_31[(int)(this.cfr_renamed_82[n6 - 1 & 7] >>> 48) & 0xFF];
                int n19 = n6;
                sprsel5.cfr_renamed_0[n19] = sprsel5.cfr_renamed_0[n19] ^ cfr_renamed_2[(int)(this.cfr_renamed_82[n6 - 2 & 7] >>> 40) & 0xFF];
                int n20 = n6;
                sprsel5.cfr_renamed_0[n20] = sprsel5.cfr_renamed_0[n20] ^ cfr_renamed_107[(int)(this.cfr_renamed_82[n6 - 3 & 7] >>> 32) & 0xFF];
                int n21 = n6;
                sprsel5.cfr_renamed_0[n21] = sprsel5.cfr_renamed_0[n21] ^ cfr_renamed_96[(int)(this.cfr_renamed_82[n6 - 4 & 7] >>> 24) & 0xFF];
                int n22 = n6;
                sprsel5.cfr_renamed_0[n22] = sprsel5.cfr_renamed_0[n22] ^ cfr_renamed_1[(int)(this.cfr_renamed_82[n6 - 5 & 7] >>> 16) & 0xFF];
                int n23 = n6;
                sprsel5.cfr_renamed_0[n23] = sprsel5.cfr_renamed_0[n23] ^ cfr_renamed_3[(int)(this.cfr_renamed_82[n6 - 6 & 7] >>> 8) & 0xFF];
                int n24 = n6;
                long l = sprsel5.cfr_renamed_0[n24] ^ cfr_renamed_137[(int)this.cfr_renamed_82[n6 - 7 & 7] & 0xFF];
                sprsel5.cfr_renamed_0[n24] = l;
                n16 = ++n6;
            }
            System.arraycopy(this.cfr_renamed_0, 0, this.cfr_renamed_82, 0, this.cfr_renamed_82.length);
            n5 = ++n;
        }
        int n25 = n = 0;
        while (n25 < 8) {
            int n26 = n;
            long l = this.cfr_renamed_93[n26] ^ (this.cfr_renamed_82[n] ^ this.cfr_renamed_132[n]);
            this.cfr_renamed_93[n26] = l;
            n25 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3753(byte[] byArray, int n) {
        sprsel sprsel2 = this;
        sprpxe.cfr_renamed_455(this.cfr_renamed_114, 0, this.cfr_renamed_132);
        sprsel2.cfr_renamed_3473();
        sprsel2.cfr_renamed_91 = 0;
        sproze.cfr_renamed_492(sprsel2.cfr_renamed_114, (byte)0);
    }

    @Override
    public int cfr_renamed_1218() {
        return 64;
    }

    private static /* synthetic */ int cfr_renamed_10473(int arg0) {
        return arg0 << 1 ^ -(arg0 >>> 7) & 0x11D;
    }

    static {
        int n;
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
        cfr_renamed_119 = nArray;
        cfr_renamed_272 = new long[256];
        cfr_renamed_31 = new long[256];
        cfr_renamed_2 = new long[256];
        cfr_renamed_107 = new long[256];
        cfr_renamed_96 = new long[256];
        cfr_renamed_1 = new long[256];
        cfr_renamed_3 = new long[256];
        cfr_renamed_137 = new long[256];
        cfr_renamed_112 = new short[32];
        sprsel.cfr_renamed_112[31] = 8;
        int n2 = n = 0;
        while (n2 < 256) {
            int n3 = cfr_renamed_119[n];
            int n4 = sprsel.cfr_renamed_10473(n3);
            int n5 = sprsel.cfr_renamed_10473(n4);
            int n6 = n5 ^ n3;
            int n7 = sprsel.cfr_renamed_10473(n5);
            int n8 = n7 ^ n3;
            int n9 = n3;
            sprsel.cfr_renamed_272[n] = sprsel.cfr_renamed_3757(n9, n9, n5, n9, n7, n6, n4, n8);
            int n10 = n3;
            sprsel.cfr_renamed_31[n] = sprsel.cfr_renamed_3757(n8, n10, n10, n5, n10, n7, n6, n4);
            int n11 = n3;
            sprsel.cfr_renamed_2[n] = sprsel.cfr_renamed_3757(n4, n8, n11, n11, n5, n11, n7, n6);
            int n12 = n3;
            sprsel.cfr_renamed_107[n] = sprsel.cfr_renamed_3757(n6, n4, n8, n12, n12, n5, n12, n7);
            int n13 = n3;
            sprsel.cfr_renamed_96[n] = sprsel.cfr_renamed_3757(n7, n6, n4, n8, n13, n13, n5, n13);
            int n14 = n3;
            sprsel.cfr_renamed_1[n] = sprsel.cfr_renamed_3757(n3, n7, n6, n4, n8, n14, n14, n5);
            int n15 = n3;
            sprsel.cfr_renamed_3[n] = sprsel.cfr_renamed_3757(n5, n3, n7, n6, n4, n8, n15, n15);
            int n16 = n3;
            sprsel.cfr_renamed_137[n++] = sprsel.cfr_renamed_3757(n16, n5, n16, n7, n6, n4, n8, n3);
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprsel sprsel2 = (sprsel)arg0;
        System.arraycopy(sprsel2.cfr_renamed_105, 0, this.cfr_renamed_105, 0, this.cfr_renamed_105.length);
        System.arraycopy(sprsel2.cfr_renamed_114, 0, this.cfr_renamed_114, 0, this.cfr_renamed_114.length);
        sprsel sprsel3 = sprsel2;
        this.cfr_renamed_91 = sprsel3.cfr_renamed_91;
        System.arraycopy(sprsel3.cfr_renamed_126, 0, this.cfr_renamed_126, 0, this.cfr_renamed_126.length);
        System.arraycopy(sprsel2.cfr_renamed_93, 0, this.cfr_renamed_93, 0, this.cfr_renamed_93.length);
        System.arraycopy(sprsel2.cfr_renamed_152, 0, this.cfr_renamed_152, 0, this.cfr_renamed_152.length);
        System.arraycopy(sprsel2.cfr_renamed_0, 0, this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        System.arraycopy(sprsel2.cfr_renamed_132, 0, this.cfr_renamed_132, 0, this.cfr_renamed_132.length);
        System.arraycopy(sprsel2.cfr_renamed_82, 0, this.cfr_renamed_82, 0, this.cfr_renamed_82.length);
    }

    private static /* synthetic */ long cfr_renamed_3757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        return (long)arg0 << 56 ^ (long)arg1 << 48 ^ (long)arg2 << 40 ^ (long)arg3 << 32 ^ (long)arg4 << 24 ^ (long)arg5 << 16 ^ (long)arg6 << 8 ^ (long)arg7;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprsel sprsel2 = this;
        sprsel2.cfr_renamed_3120();
        sprpxe.cfr_renamed_441(sprsel2.cfr_renamed_93, arg0, arg1);
        sprsel2.cfr_renamed_41();
        return sprsel2.cfr_renamed_1218();
    }

    /*
     * WARNING - void declaration
     */
    public sprsel(spriil spriil2) {
        void arg0;
        int n;
        sprsel sprsel2 = this;
        sprsel sprsel3 = this;
        sprsel sprsel4 = this;
        this.cfr_renamed_105 = new long[11];
        sprsel4.cfr_renamed_114 = new byte[64];
        sprsel4.cfr_renamed_91 = 0;
        sprsel3.cfr_renamed_126 = new short[32];
        sprsel3.cfr_renamed_93 = new long[8];
        sprsel2.cfr_renamed_152 = new long[8];
        sprsel2.cfr_renamed_0 = new long[8];
        this.cfr_renamed_132 = new long[8];
        this.cfr_renamed_82 = new long[8];
        this.cfr_renamed_105[0] = 0L;
        int n2 = n = 1;
        while (n2 <= 10) {
            int n3 = 8 * (n - 1);
            this.cfr_renamed_105[n++] = cfr_renamed_272[n3] & 0xFF00000000000000L ^ cfr_renamed_31[n3 + 1] & 0xFF000000000000L ^ cfr_renamed_2[n3 + 2] & 0xFF0000000000L ^ cfr_renamed_107[n3 + 3] & 0xFF00000000L ^ cfr_renamed_96[n3 + 4] & 0xFF000000L ^ cfr_renamed_1[n3 + 5] & 0xFF0000L ^ cfr_renamed_3[n3 + 6] & 0xFF00L ^ cfr_renamed_137[n3 + 7] & 0xFFL;
            n2 = n;
        }
        sprsel sprsel5 = this;
        sprsel5.cfr_renamed_4 = arg0;
        sprybl.cfr_renamed_9170(sprhel.cfr_renamed_10472(sprsel5, sprsel5.cfr_renamed_1218(), (spriil)arg0));
    }

    @Override
    public String cfr_renamed_1315() {
        return sprkop.cfr_renamed_9("{:E @\"C=@");
    }

    private /* synthetic */ void cfr_renamed_3120() {
        sprsel sprsel2 = this;
        byte[] byArray = sprsel2.cfr_renamed_3758();
        sprsel sprsel3 = this;
        byte[] byArray2 = sprsel2.cfr_renamed_114;
        int n = sprsel3.cfr_renamed_91++;
        byArray2[n] = (byte)(byArray2[n] | 0x80);
        if (sprsel3.cfr_renamed_91 == this.cfr_renamed_114.length) {
            sprsel sprsel4 = this;
            sprsel4.cfr_renamed_3753(sprsel4.cfr_renamed_114, 0);
        }
        if (this.cfr_renamed_91 > 32) {
            sprsel sprsel5 = this;
            while (sprsel5.cfr_renamed_91 != 0) {
                sprsel sprsel6 = this;
                sprsel5 = sprsel6;
                sprsel6.cfr_renamed_1221((byte)0);
            }
        }
        sprsel sprsel7 = this;
        while (sprsel7.cfr_renamed_91 <= 32) {
            sprsel sprsel8 = this;
            sprsel7 = sprsel8;
            sprsel8.cfr_renamed_1221((byte)0);
        }
        System.arraycopy(byArray, 0, this.cfr_renamed_114, 32, byArray.length);
        sprsel sprsel9 = this;
        sprsel9.cfr_renamed_3753(sprsel9.cfr_renamed_114, 0);
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprsel(this);
    }

    public sprsel() {
        this(spriil.cfr_renamed_0);
    }

    private /* synthetic */ byte[] cfr_renamed_3758() {
        int n;
        byte[] byArray = new byte[32];
        int n2 = n = 0;
        while (n2 < byArray.length) {
            int n3 = n++;
            byArray[n3] = (byte)(this.cfr_renamed_126[n3] & 0xFF);
            n2 = n;
        }
        return byArray;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n = arg2;
        while (n > 0) {
            this.cfr_renamed_1221(arg0[arg1++]);
            n = --arg2;
        }
    }

    private /* synthetic */ void cfr_renamed_3755() {
        int n;
        int n2 = 0;
        int n3 = n = this.cfr_renamed_126.length - 1;
        while (n3 >= 0) {
            sprsel sprsel2 = this;
            int n4 = (sprsel2.cfr_renamed_126[n] & 0xFF) + cfr_renamed_112[n] + n2;
            n2 = n4 >>> 8;
            sprsel2.cfr_renamed_126[n--] = (short)(n4 & 0xFF);
            n3 = n;
        }
    }
}

