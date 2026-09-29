/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprlfg;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprplc;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprcwk
implements sprmr {
    private int[] cfr_renamed_119;
    private int[] cfr_renamed_91;
    public static final int cfr_renamed_0 = 8;
    private int[] cfr_renamed_1;
    private int[] cfr_renamed_2;
    private boolean cfr_renamed_3;
    public static short[] cfr_renamed_4;

    public int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = (arg0[arg1 + 0] << 8) + (arg0[arg1 + 1] & 0xFF);
        int n3 = (arg0[arg1 + 2] << 8) + (arg0[arg1 + 3] & 0xFF);
        int n4 = (arg0[arg1 + 4] << 8) + (arg0[arg1 + 5] & 0xFF);
        int n5 = (arg0[arg1 + 6] << 8) + (arg0[arg1 + 7] & 0xFF);
        int n6 = 31;
        int n7 = n = 0;
        while (n7 < 2) {
            int n8;
            int n9;
            int n10 = n9 = 0;
            while (n10 < 8) {
                n8 = n4;
                n4 = n5;
                n5 = n2;
                n2 = this.cfr_renamed_3568(n6, n3);
                n3 = n2 ^ n8 ^ n6-- + 1;
                n10 = ++n9;
            }
            int n11 = n9 = 0;
            while (n11 < 8) {
                n8 = n4;
                n4 = n5;
                n5 = n3 ^ n2 ^ n6 + 1;
                int n12 = this.cfr_renamed_3568(n6, n3);
                --n6;
                n2 = n12;
                n3 = n8;
                n11 = ++n9;
            }
            n7 = ++n;
        }
        int n13 = arg3;
        int n14 = arg3;
        int n15 = arg3;
        arg2[n15 + 0] = (byte)(n2 >> 8);
        arg2[n15 + 1] = (byte)n2;
        arg2[arg3 + 2] = (byte)(n3 >> 8);
        arg2[n14 + 3] = (byte)n3;
        arg2[n14 + 4] = (byte)(n4 >> 8);
        arg2[arg3 + 5] = (byte)n4;
        arg2[n13 + 6] = (byte)(n5 >> 8);
        arg2[n13 + 7] = (byte)n5;
        return 8;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        int n;
        if (!(arg1 instanceof sprtpk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprplc.cfr_renamed_9("\u000f#\u0010,\n$\u0002m\u0016,\u0014,\u000b(\u0012(\u0014m\u0016,\u0015>\u0003)F9\tm5\u0006/\u001d,\f%\u0006F$\b$\u0012mKm")).append(arg1.getClass().getName()).toString());
        }
        byte[] byArray = ((sprtpk)arg1).cfr_renamed_1521();
        sprcwk sprcwk2 = this;
        sprcwk sprcwk3 = this;
        this.cfr_renamed_3 = arg0;
        sprcwk3.cfr_renamed_2 = new int[32];
        sprcwk3.cfr_renamed_1 = new int[32];
        sprcwk2.cfr_renamed_91 = new int[32];
        sprcwk2.cfr_renamed_119 = new int[32];
        int n2 = n = 0;
        while (n2 < 32) {
            sprcwk sprcwk4 = this;
            int n3 = n;
            sprcwk4.cfr_renamed_2[n3] = byArray[n3 * 4 % 10] & 0xFF;
            int n4 = n;
            sprcwk4.cfr_renamed_1[n4] = byArray[(n4 * 4 + 1) % 10] & 0xFF;
            int n5 = n;
            sprcwk4.cfr_renamed_91[n5] = byArray[(n5 * 4 + 2) % 10] & 0xFF;
            int n6 = n++;
            sprcwk4.cfr_renamed_119[n6] = byArray[(n6 * 4 + 3) % 10] & 0xFF;
            n2 = n;
        }
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 80, arg1, this.cfr_renamed_10343()));
    }

    private /* synthetic */ spriil cfr_renamed_10343() {
        if (this.cfr_renamed_2 == null) {
            return spriil.cfr_renamed_0;
        }
        if (this.cfr_renamed_3) {
            return spriil.cfr_renamed_3;
        }
        return spriil.cfr_renamed_152;
    }

    public int cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = (arg0[arg1 + 0] << 8) + (arg0[arg1 + 1] & 0xFF);
        int n3 = (arg0[arg1 + 2] << 8) + (arg0[arg1 + 3] & 0xFF);
        int n4 = (arg0[arg1 + 4] << 8) + (arg0[arg1 + 5] & 0xFF);
        int n5 = (arg0[arg1 + 6] << 8) + (arg0[arg1 + 7] & 0xFF);
        int n6 = 0;
        int n7 = n = 0;
        while (n7 < 2) {
            int n8;
            int n9;
            int n10 = n9 = 0;
            while (n10 < 8) {
                n8 = n5;
                n5 = n4;
                n4 = n3;
                n3 = this.cfr_renamed_3567(n6, n2);
                n2 = n3 ^ n8 ^ n6++ + 1;
                n10 = ++n9;
            }
            int n11 = n9 = 0;
            while (n11 < 8) {
                n8 = n5;
                n5 = n4;
                n4 = n2 ^ n3 ^ n6 + 1;
                int n12 = this.cfr_renamed_3567(n6, n2);
                ++n6;
                n3 = n12;
                n2 = n8;
                n11 = ++n9;
            }
            n7 = ++n;
        }
        int n13 = arg3;
        int n14 = arg3;
        int n15 = arg3;
        arg2[n15 + 0] = (byte)(n2 >> 8);
        arg2[n15 + 1] = (byte)n2;
        arg2[arg3 + 2] = (byte)(n3 >> 8);
        arg2[n14 + 3] = (byte)n3;
        arg2[n14 + 4] = (byte)(n4 >> 8);
        arg2[arg3 + 5] = (byte)n4;
        arg2[n13 + 6] = (byte)(n5 >> 8);
        arg2[n13 + 7] = (byte)n5;
        return 8;
    }

    @Override
    public void cfr_renamed_41() {
    }

    private /* synthetic */ int cfr_renamed_3568(int arg0, int arg1) {
        int n = arg1 & 0xFF;
        int n2 = arg1 >> 8 & 0xFF;
        int n3 = cfr_renamed_4[n2 ^ this.cfr_renamed_119[arg0]] ^ n;
        int n4 = cfr_renamed_4[n3 ^ this.cfr_renamed_91[arg0]] ^ n2;
        int n5 = cfr_renamed_4[n4 ^ this.cfr_renamed_1[arg0]] ^ n3;
        return ((cfr_renamed_4[n5 ^ this.cfr_renamed_2[arg0]] ^ n4) << 8) + n5;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_1 == null) {
            throw new IllegalStateException(sprlfg.cfr_renamed_9("Q9K\"H3A9\"\u0017l\u0015k\u001cgRl\u001dvRk\u001ck\u0006k\u0013n\u001bq\u0017f"));
        }
        if (arg1 + 8 > arg0.length) {
            throw new sprddl(sprplc.cfr_renamed_9("\u000f#\u00168\u0012m\u00048\u0000+\u0003?F9\t\"F>\u000e\"\u00149"));
        }
        if (arg3 + 8 > arg2.length) {
            throw new sprwjl(sprlfg.cfr_renamed_9("m\u0007v\u0002w\u0006\"\u0010w\u0014d\u0017pRv\u001dmRq\u001am\u0000v"));
        }
        if (this.cfr_renamed_3) {
            this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        } else {
            this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
        }
        return 8;
    }

    public sprcwk() {
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 80));
    }

    private /* synthetic */ int cfr_renamed_3567(int arg0, int arg1) {
        int n = arg1 >> 8 & 0xFF;
        int n2 = arg1 & 0xFF;
        int n3 = cfr_renamed_4[n2 ^ this.cfr_renamed_2[arg0]] ^ n;
        int n4 = cfr_renamed_4[n3 ^ this.cfr_renamed_1[arg0]] ^ n2;
        int n5 = cfr_renamed_4[n4 ^ this.cfr_renamed_91[arg0]] ^ n3;
        int n6 = cfr_renamed_4[n5 ^ this.cfr_renamed_119[arg0]] ^ n4;
        return (n5 << 8) + n6;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprplc.cfr_renamed_9("5\u0006/\u001d,\f%\u0006");
    }

    static {
        short[] sArray = new short[256];
        sArray[0] = 163;
        sArray[1] = 215;
        sArray[2] = 9;
        sArray[3] = 131;
        sArray[4] = 248;
        sArray[5] = 72;
        sArray[6] = 246;
        sArray[7] = 244;
        sArray[8] = 179;
        sArray[9] = 33;
        sArray[10] = 21;
        sArray[11] = 120;
        sArray[12] = 153;
        sArray[13] = 177;
        sArray[14] = 175;
        sArray[15] = 249;
        sArray[16] = 231;
        sArray[17] = 45;
        sArray[18] = 77;
        sArray[19] = 138;
        sArray[20] = 206;
        sArray[21] = 76;
        sArray[22] = 202;
        sArray[23] = 46;
        sArray[24] = 82;
        sArray[25] = 149;
        sArray[26] = 217;
        sArray[27] = 30;
        sArray[28] = 78;
        sArray[29] = 56;
        sArray[30] = 68;
        sArray[31] = 40;
        sArray[32] = 10;
        sArray[33] = 223;
        sArray[34] = 2;
        sArray[35] = 160;
        sArray[36] = 23;
        sArray[37] = 241;
        sArray[38] = 96;
        sArray[39] = 104;
        sArray[40] = 18;
        sArray[41] = 183;
        sArray[42] = 122;
        sArray[43] = 195;
        sArray[44] = 233;
        sArray[45] = 250;
        sArray[46] = 61;
        sArray[47] = 83;
        sArray[48] = 150;
        sArray[49] = 132;
        sArray[50] = 107;
        sArray[51] = 186;
        sArray[52] = 242;
        sArray[53] = 99;
        sArray[54] = 154;
        sArray[55] = 25;
        sArray[56] = 124;
        sArray[57] = 174;
        sArray[58] = 229;
        sArray[59] = 245;
        sArray[60] = 247;
        sArray[61] = 22;
        sArray[62] = 106;
        sArray[63] = 162;
        sArray[64] = 57;
        sArray[65] = 182;
        sArray[66] = 123;
        sArray[67] = 15;
        sArray[68] = 193;
        sArray[69] = 147;
        sArray[70] = 129;
        sArray[71] = 27;
        sArray[72] = 238;
        sArray[73] = 180;
        sArray[74] = 26;
        sArray[75] = 234;
        sArray[76] = 208;
        sArray[77] = 145;
        sArray[78] = 47;
        sArray[79] = 184;
        sArray[80] = 85;
        sArray[81] = 185;
        sArray[82] = 218;
        sArray[83] = 133;
        sArray[84] = 63;
        sArray[85] = 65;
        sArray[86] = 191;
        sArray[87] = 224;
        sArray[88] = 90;
        sArray[89] = 88;
        sArray[90] = 128;
        sArray[91] = 95;
        sArray[92] = 102;
        sArray[93] = 11;
        sArray[94] = 216;
        sArray[95] = 144;
        sArray[96] = 53;
        sArray[97] = 213;
        sArray[98] = 192;
        sArray[99] = 167;
        sArray[100] = 51;
        sArray[101] = 6;
        sArray[102] = 101;
        sArray[103] = 105;
        sArray[104] = 69;
        sArray[105] = 0;
        sArray[106] = 148;
        sArray[107] = 86;
        sArray[108] = 109;
        sArray[109] = 152;
        sArray[110] = 155;
        sArray[111] = 118;
        sArray[112] = 151;
        sArray[113] = 252;
        sArray[114] = 178;
        sArray[115] = 194;
        sArray[116] = 176;
        sArray[117] = 254;
        sArray[118] = 219;
        sArray[119] = 32;
        sArray[120] = 225;
        sArray[121] = 235;
        sArray[122] = 214;
        sArray[123] = 228;
        sArray[124] = 221;
        sArray[125] = 71;
        sArray[126] = 74;
        sArray[127] = 29;
        sArray[128] = 66;
        sArray[129] = 237;
        sArray[130] = 158;
        sArray[131] = 110;
        sArray[132] = 73;
        sArray[133] = 60;
        sArray[134] = 205;
        sArray[135] = 67;
        sArray[136] = 39;
        sArray[137] = 210;
        sArray[138] = 7;
        sArray[139] = 212;
        sArray[140] = 222;
        sArray[141] = 199;
        sArray[142] = 103;
        sArray[143] = 24;
        sArray[144] = 137;
        sArray[145] = 203;
        sArray[146] = 48;
        sArray[147] = 31;
        sArray[148] = 141;
        sArray[149] = 198;
        sArray[150] = 143;
        sArray[151] = 170;
        sArray[152] = 200;
        sArray[153] = 116;
        sArray[154] = 220;
        sArray[155] = 201;
        sArray[156] = 93;
        sArray[157] = 92;
        sArray[158] = 49;
        sArray[159] = 164;
        sArray[160] = 112;
        sArray[161] = 136;
        sArray[162] = 97;
        sArray[163] = 44;
        sArray[164] = 159;
        sArray[165] = 13;
        sArray[166] = 43;
        sArray[167] = 135;
        sArray[168] = 80;
        sArray[169] = 130;
        sArray[170] = 84;
        sArray[171] = 100;
        sArray[172] = 38;
        sArray[173] = 125;
        sArray[174] = 3;
        sArray[175] = 64;
        sArray[176] = 52;
        sArray[177] = 75;
        sArray[178] = 28;
        sArray[179] = 115;
        sArray[180] = 209;
        sArray[181] = 196;
        sArray[182] = 253;
        sArray[183] = 59;
        sArray[184] = 204;
        sArray[185] = 251;
        sArray[186] = 127;
        sArray[187] = 171;
        sArray[188] = 230;
        sArray[189] = 62;
        sArray[190] = 91;
        sArray[191] = 165;
        sArray[192] = 173;
        sArray[193] = 4;
        sArray[194] = 35;
        sArray[195] = 156;
        sArray[196] = 20;
        sArray[197] = 81;
        sArray[198] = 34;
        sArray[199] = 240;
        sArray[200] = 41;
        sArray[201] = 121;
        sArray[202] = 113;
        sArray[203] = 126;
        sArray[204] = 255;
        sArray[205] = 140;
        sArray[206] = 14;
        sArray[207] = 226;
        sArray[208] = 12;
        sArray[209] = 239;
        sArray[210] = 188;
        sArray[211] = 114;
        sArray[212] = 117;
        sArray[213] = 111;
        sArray[214] = 55;
        sArray[215] = 161;
        sArray[216] = 236;
        sArray[217] = 211;
        sArray[218] = 142;
        sArray[219] = 98;
        sArray[220] = 139;
        sArray[221] = 134;
        sArray[222] = 16;
        sArray[223] = 232;
        sArray[224] = 8;
        sArray[225] = 119;
        sArray[226] = 17;
        sArray[227] = 190;
        sArray[228] = 146;
        sArray[229] = 79;
        sArray[230] = 36;
        sArray[231] = 197;
        sArray[232] = 50;
        sArray[233] = 54;
        sArray[234] = 157;
        sArray[235] = 207;
        sArray[236] = 243;
        sArray[237] = 166;
        sArray[238] = 187;
        sArray[239] = 172;
        sArray[240] = 94;
        sArray[241] = 108;
        sArray[242] = 169;
        sArray[243] = 19;
        sArray[244] = 87;
        sArray[245] = 37;
        sArray[246] = 181;
        sArray[247] = 227;
        sArray[248] = 189;
        sArray[249] = 168;
        sArray[250] = 58;
        sArray[251] = 1;
        sArray[252] = 5;
        sArray[253] = 89;
        sArray[254] = 42;
        sArray[255] = 70;
        cfr_renamed_4 = sArray;
    }

    @Override
    public int cfr_renamed_1195() {
        return 8;
    }
}

