/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrz;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprjyc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;

public class sprxhd
implements sprff {
    private long cfr_renamed_272;
    public static byte[][] cfr_renamed_145;
    private static final byte[] cfr_renamed_114;
    private byte[] cfr_renamed_96;
    private byte[] cfr_renamed_105;
    private static final int cfr_renamed_137 = 64;
    private static final int cfr_renamed_79 = 14;
    private long cfr_renamed_107;
    private long cfr_renamed_132;
    private static final byte[] cfr_renamed_102;
    private boolean cfr_renamed_93;
    private long cfr_renamed_86;
    private int cfr_renamed_152;
    private long[][] cfr_renamed_112;
    private int cfr_renamed_119;
    private static final int[] cfr_renamed_91;
    private static final byte[] cfr_renamed_0;
    private long cfr_renamed_1;
    private int cfr_renamed_2;
    public static byte[][] cfr_renamed_3;
    private static final byte[] cfr_renamed_4;

    private /* synthetic */ byte cfr_renamed_3615(int arg0) {
        if (arg0 >= 0) {
            return cfr_renamed_114[104 + arg0];
        }
        return 0;
    }

    public sprxhd() {
        this(128);
    }

    private /* synthetic */ void cfr_renamed_3616(long[][] arg0) {
        int n;
        sprxhd sprxhd2 = this;
        sprxhd sprxhd3 = this;
        sprxhd2.cfr_renamed_3617(arg0[sprxhd3.cfr_renamed_152]);
        sprxhd3.cfr_renamed_3618(cfr_renamed_0);
        sprxhd2.cfr_renamed_3619(sprxhd2.cfr_renamed_105);
        int n2 = n = sprxhd2.cfr_renamed_152 - 1;
        while (n2 > 0) {
            sprxhd sprxhd4 = this;
            sprxhd4.cfr_renamed_3617(arg0[n]);
            sprxhd4.cfr_renamed_3620();
            sprxhd4.cfr_renamed_3618(cfr_renamed_0);
            sprxhd4.cfr_renamed_3619(sprxhd4.cfr_renamed_105);
            n2 = --n;
        }
        this.cfr_renamed_3617(arg0[0]);
    }

    private /* synthetic */ void cfr_renamed_3618(byte[] arg0) {
        sprxhd sprxhd2 = this;
        sprxhd2.cfr_renamed_132 = sprxhd2.cfr_renamed_3621(sprxhd2.cfr_renamed_132, arg0);
        sprxhd2.cfr_renamed_272 = sprxhd2.cfr_renamed_3621(sprxhd2.cfr_renamed_272, arg0);
        sprxhd2.cfr_renamed_107 = sprxhd2.cfr_renamed_3621(sprxhd2.cfr_renamed_107, arg0);
        sprxhd2.cfr_renamed_86 = sprxhd2.cfr_renamed_3621(sprxhd2.cfr_renamed_86, arg0);
    }

    static {
        byte[] byArray = new byte[256];
        byArray[0] = 0;
        byArray[1] = 0;
        byArray[2] = 25;
        byArray[3] = 1;
        byArray[4] = 50;
        byArray[5] = 2;
        byArray[6] = 26;
        byArray[7] = -58;
        byArray[8] = 75;
        byArray[9] = -57;
        byArray[10] = 27;
        byArray[11] = 104;
        byArray[12] = 51;
        byArray[13] = -18;
        byArray[14] = -33;
        byArray[15] = 3;
        byArray[16] = 100;
        byArray[17] = 4;
        byArray[18] = -32;
        byArray[19] = 14;
        byArray[20] = 52;
        byArray[21] = -115;
        byArray[22] = -127;
        byArray[23] = -17;
        byArray[24] = 76;
        byArray[25] = 113;
        byArray[26] = 8;
        byArray[27] = -56;
        byArray[28] = -8;
        byArray[29] = 105;
        byArray[30] = 28;
        byArray[31] = -63;
        byArray[32] = 125;
        byArray[33] = -62;
        byArray[34] = 29;
        byArray[35] = -75;
        byArray[36] = -7;
        byArray[37] = -71;
        byArray[38] = 39;
        byArray[39] = 106;
        byArray[40] = 77;
        byArray[41] = -28;
        byArray[42] = -90;
        byArray[43] = 114;
        byArray[44] = -102;
        byArray[45] = -55;
        byArray[46] = 9;
        byArray[47] = 120;
        byArray[48] = 101;
        byArray[49] = 47;
        byArray[50] = -118;
        byArray[51] = 5;
        byArray[52] = 33;
        byArray[53] = 15;
        byArray[54] = -31;
        byArray[55] = 36;
        byArray[56] = 18;
        byArray[57] = -16;
        byArray[58] = -126;
        byArray[59] = 69;
        byArray[60] = 53;
        byArray[61] = -109;
        byArray[62] = -38;
        byArray[63] = -114;
        byArray[64] = -106;
        byArray[65] = -113;
        byArray[66] = -37;
        byArray[67] = -67;
        byArray[68] = 54;
        byArray[69] = -48;
        byArray[70] = -50;
        byArray[71] = -108;
        byArray[72] = 19;
        byArray[73] = 92;
        byArray[74] = -46;
        byArray[75] = -15;
        byArray[76] = 64;
        byArray[77] = 70;
        byArray[78] = -125;
        byArray[79] = 56;
        byArray[80] = 102;
        byArray[81] = -35;
        byArray[82] = -3;
        byArray[83] = 48;
        byArray[84] = -65;
        byArray[85] = 6;
        byArray[86] = -117;
        byArray[87] = 98;
        byArray[88] = -77;
        byArray[89] = 37;
        byArray[90] = -30;
        byArray[91] = -104;
        byArray[92] = 34;
        byArray[93] = -120;
        byArray[94] = -111;
        byArray[95] = 16;
        byArray[96] = 126;
        byArray[97] = 110;
        byArray[98] = 72;
        byArray[99] = -61;
        byArray[100] = -93;
        byArray[101] = -74;
        byArray[102] = 30;
        byArray[103] = 66;
        byArray[104] = 58;
        byArray[105] = 107;
        byArray[106] = 40;
        byArray[107] = 84;
        byArray[108] = -6;
        byArray[109] = -123;
        byArray[110] = 61;
        byArray[111] = -70;
        byArray[112] = 43;
        byArray[113] = 121;
        byArray[114] = 10;
        byArray[115] = 21;
        byArray[116] = -101;
        byArray[117] = -97;
        byArray[118] = 94;
        byArray[119] = -54;
        byArray[120] = 78;
        byArray[121] = -44;
        byArray[122] = -84;
        byArray[123] = -27;
        byArray[124] = -13;
        byArray[125] = 115;
        byArray[126] = -89;
        byArray[127] = 87;
        byArray[128] = -81;
        byArray[129] = 88;
        byArray[130] = -88;
        byArray[131] = 80;
        byArray[132] = -12;
        byArray[133] = -22;
        byArray[134] = -42;
        byArray[135] = 116;
        byArray[136] = 79;
        byArray[137] = -82;
        byArray[138] = -23;
        byArray[139] = -43;
        byArray[140] = -25;
        byArray[141] = -26;
        byArray[142] = -83;
        byArray[143] = -24;
        byArray[144] = 44;
        byArray[145] = -41;
        byArray[146] = 117;
        byArray[147] = 122;
        byArray[148] = -21;
        byArray[149] = 22;
        byArray[150] = 11;
        byArray[151] = -11;
        byArray[152] = 89;
        byArray[153] = -53;
        byArray[154] = 95;
        byArray[155] = -80;
        byArray[156] = -100;
        byArray[157] = -87;
        byArray[158] = 81;
        byArray[159] = -96;
        byArray[160] = 127;
        byArray[161] = 12;
        byArray[162] = -10;
        byArray[163] = 111;
        byArray[164] = 23;
        byArray[165] = -60;
        byArray[166] = 73;
        byArray[167] = -20;
        byArray[168] = -40;
        byArray[169] = 67;
        byArray[170] = 31;
        byArray[171] = 45;
        byArray[172] = -92;
        byArray[173] = 118;
        byArray[174] = 123;
        byArray[175] = -73;
        byArray[176] = -52;
        byArray[177] = -69;
        byArray[178] = 62;
        byArray[179] = 90;
        byArray[180] = -5;
        byArray[181] = 96;
        byArray[182] = -79;
        byArray[183] = -122;
        byArray[184] = 59;
        byArray[185] = 82;
        byArray[186] = -95;
        byArray[187] = 108;
        byArray[188] = -86;
        byArray[189] = 85;
        byArray[190] = 41;
        byArray[191] = -99;
        byArray[192] = -105;
        byArray[193] = -78;
        byArray[194] = -121;
        byArray[195] = -112;
        byArray[196] = 97;
        byArray[197] = -66;
        byArray[198] = -36;
        byArray[199] = -4;
        byArray[200] = -68;
        byArray[201] = -107;
        byArray[202] = -49;
        byArray[203] = -51;
        byArray[204] = 55;
        byArray[205] = 63;
        byArray[206] = 91;
        byArray[207] = -47;
        byArray[208] = 83;
        byArray[209] = 57;
        byArray[210] = -124;
        byArray[211] = 60;
        byArray[212] = 65;
        byArray[213] = -94;
        byArray[214] = 109;
        byArray[215] = 71;
        byArray[216] = 20;
        byArray[217] = 42;
        byArray[218] = -98;
        byArray[219] = 93;
        byArray[220] = 86;
        byArray[221] = -14;
        byArray[222] = -45;
        byArray[223] = -85;
        byArray[224] = 68;
        byArray[225] = 17;
        byArray[226] = -110;
        byArray[227] = -39;
        byArray[228] = 35;
        byArray[229] = 32;
        byArray[230] = 46;
        byArray[231] = -119;
        byArray[232] = -76;
        byArray[233] = 124;
        byArray[234] = -72;
        byArray[235] = 38;
        byArray[236] = 119;
        byArray[237] = -103;
        byArray[238] = -29;
        byArray[239] = -91;
        byArray[240] = 103;
        byArray[241] = 74;
        byArray[242] = -19;
        byArray[243] = -34;
        byArray[244] = -59;
        byArray[245] = 49;
        byArray[246] = -2;
        byArray[247] = 24;
        byArray[248] = 13;
        byArray[249] = 99;
        byArray[250] = -116;
        byArray[251] = -128;
        byArray[252] = -64;
        byArray[253] = -9;
        byArray[254] = 112;
        byArray[255] = 7;
        cfr_renamed_4 = byArray;
        byte[] byArray2 = new byte[511];
        byArray2[0] = 0;
        byArray2[1] = 3;
        byArray2[2] = 5;
        byArray2[3] = 15;
        byArray2[4] = 17;
        byArray2[5] = 51;
        byArray2[6] = 85;
        byArray2[7] = -1;
        byArray2[8] = 26;
        byArray2[9] = 46;
        byArray2[10] = 114;
        byArray2[11] = -106;
        byArray2[12] = -95;
        byArray2[13] = -8;
        byArray2[14] = 19;
        byArray2[15] = 53;
        byArray2[16] = 95;
        byArray2[17] = -31;
        byArray2[18] = 56;
        byArray2[19] = 72;
        byArray2[20] = -40;
        byArray2[21] = 115;
        byArray2[22] = -107;
        byArray2[23] = -92;
        byArray2[24] = -9;
        byArray2[25] = 2;
        byArray2[26] = 6;
        byArray2[27] = 10;
        byArray2[28] = 30;
        byArray2[29] = 34;
        byArray2[30] = 102;
        byArray2[31] = -86;
        byArray2[32] = -27;
        byArray2[33] = 52;
        byArray2[34] = 92;
        byArray2[35] = -28;
        byArray2[36] = 55;
        byArray2[37] = 89;
        byArray2[38] = -21;
        byArray2[39] = 38;
        byArray2[40] = 106;
        byArray2[41] = -66;
        byArray2[42] = -39;
        byArray2[43] = 112;
        byArray2[44] = -112;
        byArray2[45] = -85;
        byArray2[46] = -26;
        byArray2[47] = 49;
        byArray2[48] = 83;
        byArray2[49] = -11;
        byArray2[50] = 4;
        byArray2[51] = 12;
        byArray2[52] = 20;
        byArray2[53] = 60;
        byArray2[54] = 68;
        byArray2[55] = -52;
        byArray2[56] = 79;
        byArray2[57] = -47;
        byArray2[58] = 104;
        byArray2[59] = -72;
        byArray2[60] = -45;
        byArray2[61] = 110;
        byArray2[62] = -78;
        byArray2[63] = -51;
        byArray2[64] = 76;
        byArray2[65] = -44;
        byArray2[66] = 103;
        byArray2[67] = -87;
        byArray2[68] = -32;
        byArray2[69] = 59;
        byArray2[70] = 77;
        byArray2[71] = -41;
        byArray2[72] = 98;
        byArray2[73] = -90;
        byArray2[74] = -15;
        byArray2[75] = 8;
        byArray2[76] = 24;
        byArray2[77] = 40;
        byArray2[78] = 120;
        byArray2[79] = -120;
        byArray2[80] = -125;
        byArray2[81] = -98;
        byArray2[82] = -71;
        byArray2[83] = -48;
        byArray2[84] = 107;
        byArray2[85] = -67;
        byArray2[86] = -36;
        byArray2[87] = 127;
        byArray2[88] = -127;
        byArray2[89] = -104;
        byArray2[90] = -77;
        byArray2[91] = -50;
        byArray2[92] = 73;
        byArray2[93] = -37;
        byArray2[94] = 118;
        byArray2[95] = -102;
        byArray2[96] = -75;
        byArray2[97] = -60;
        byArray2[98] = 87;
        byArray2[99] = -7;
        byArray2[100] = 16;
        byArray2[101] = 48;
        byArray2[102] = 80;
        byArray2[103] = -16;
        byArray2[104] = 11;
        byArray2[105] = 29;
        byArray2[106] = 39;
        byArray2[107] = 105;
        byArray2[108] = -69;
        byArray2[109] = -42;
        byArray2[110] = 97;
        byArray2[111] = -93;
        byArray2[112] = -2;
        byArray2[113] = 25;
        byArray2[114] = 43;
        byArray2[115] = 125;
        byArray2[116] = -121;
        byArray2[117] = -110;
        byArray2[118] = -83;
        byArray2[119] = -20;
        byArray2[120] = 47;
        byArray2[121] = 113;
        byArray2[122] = -109;
        byArray2[123] = -82;
        byArray2[124] = -23;
        byArray2[125] = 32;
        byArray2[126] = 96;
        byArray2[127] = -96;
        byArray2[128] = -5;
        byArray2[129] = 22;
        byArray2[130] = 58;
        byArray2[131] = 78;
        byArray2[132] = -46;
        byArray2[133] = 109;
        byArray2[134] = -73;
        byArray2[135] = -62;
        byArray2[136] = 93;
        byArray2[137] = -25;
        byArray2[138] = 50;
        byArray2[139] = 86;
        byArray2[140] = -6;
        byArray2[141] = 21;
        byArray2[142] = 63;
        byArray2[143] = 65;
        byArray2[144] = -61;
        byArray2[145] = 94;
        byArray2[146] = -30;
        byArray2[147] = 61;
        byArray2[148] = 71;
        byArray2[149] = -55;
        byArray2[150] = 64;
        byArray2[151] = -64;
        byArray2[152] = 91;
        byArray2[153] = -19;
        byArray2[154] = 44;
        byArray2[155] = 116;
        byArray2[156] = -100;
        byArray2[157] = -65;
        byArray2[158] = -38;
        byArray2[159] = 117;
        byArray2[160] = -97;
        byArray2[161] = -70;
        byArray2[162] = -43;
        byArray2[163] = 100;
        byArray2[164] = -84;
        byArray2[165] = -17;
        byArray2[166] = 42;
        byArray2[167] = 126;
        byArray2[168] = -126;
        byArray2[169] = -99;
        byArray2[170] = -68;
        byArray2[171] = -33;
        byArray2[172] = 122;
        byArray2[173] = -114;
        byArray2[174] = -119;
        byArray2[175] = -128;
        byArray2[176] = -101;
        byArray2[177] = -74;
        byArray2[178] = -63;
        byArray2[179] = 88;
        byArray2[180] = -24;
        byArray2[181] = 35;
        byArray2[182] = 101;
        byArray2[183] = -81;
        byArray2[184] = -22;
        byArray2[185] = 37;
        byArray2[186] = 111;
        byArray2[187] = -79;
        byArray2[188] = -56;
        byArray2[189] = 67;
        byArray2[190] = -59;
        byArray2[191] = 84;
        byArray2[192] = -4;
        byArray2[193] = 31;
        byArray2[194] = 33;
        byArray2[195] = 99;
        byArray2[196] = -91;
        byArray2[197] = -12;
        byArray2[198] = 7;
        byArray2[199] = 9;
        byArray2[200] = 27;
        byArray2[201] = 45;
        byArray2[202] = 119;
        byArray2[203] = -103;
        byArray2[204] = -80;
        byArray2[205] = -53;
        byArray2[206] = 70;
        byArray2[207] = -54;
        byArray2[208] = 69;
        byArray2[209] = -49;
        byArray2[210] = 74;
        byArray2[211] = -34;
        byArray2[212] = 121;
        byArray2[213] = -117;
        byArray2[214] = -122;
        byArray2[215] = -111;
        byArray2[216] = -88;
        byArray2[217] = -29;
        byArray2[218] = 62;
        byArray2[219] = 66;
        byArray2[220] = -58;
        byArray2[221] = 81;
        byArray2[222] = -13;
        byArray2[223] = 14;
        byArray2[224] = 18;
        byArray2[225] = 54;
        byArray2[226] = 90;
        byArray2[227] = -18;
        byArray2[228] = 41;
        byArray2[229] = 123;
        byArray2[230] = -115;
        byArray2[231] = -116;
        byArray2[232] = -113;
        byArray2[233] = -118;
        byArray2[234] = -123;
        byArray2[235] = -108;
        byArray2[236] = -89;
        byArray2[237] = -14;
        byArray2[238] = 13;
        byArray2[239] = 23;
        byArray2[240] = 57;
        byArray2[241] = 75;
        byArray2[242] = -35;
        byArray2[243] = 124;
        byArray2[244] = -124;
        byArray2[245] = -105;
        byArray2[246] = -94;
        byArray2[247] = -3;
        byArray2[248] = 28;
        byArray2[249] = 36;
        byArray2[250] = 108;
        byArray2[251] = -76;
        byArray2[252] = -57;
        byArray2[253] = 82;
        byArray2[254] = -10;
        byArray2[255] = 1;
        byArray2[256] = 3;
        byArray2[257] = 5;
        byArray2[258] = 15;
        byArray2[259] = 17;
        byArray2[260] = 51;
        byArray2[261] = 85;
        byArray2[262] = -1;
        byArray2[263] = 26;
        byArray2[264] = 46;
        byArray2[265] = 114;
        byArray2[266] = -106;
        byArray2[267] = -95;
        byArray2[268] = -8;
        byArray2[269] = 19;
        byArray2[270] = 53;
        byArray2[271] = 95;
        byArray2[272] = -31;
        byArray2[273] = 56;
        byArray2[274] = 72;
        byArray2[275] = -40;
        byArray2[276] = 115;
        byArray2[277] = -107;
        byArray2[278] = -92;
        byArray2[279] = -9;
        byArray2[280] = 2;
        byArray2[281] = 6;
        byArray2[282] = 10;
        byArray2[283] = 30;
        byArray2[284] = 34;
        byArray2[285] = 102;
        byArray2[286] = -86;
        byArray2[287] = -27;
        byArray2[288] = 52;
        byArray2[289] = 92;
        byArray2[290] = -28;
        byArray2[291] = 55;
        byArray2[292] = 89;
        byArray2[293] = -21;
        byArray2[294] = 38;
        byArray2[295] = 106;
        byArray2[296] = -66;
        byArray2[297] = -39;
        byArray2[298] = 112;
        byArray2[299] = -112;
        byArray2[300] = -85;
        byArray2[301] = -26;
        byArray2[302] = 49;
        byArray2[303] = 83;
        byArray2[304] = -11;
        byArray2[305] = 4;
        byArray2[306] = 12;
        byArray2[307] = 20;
        byArray2[308] = 60;
        byArray2[309] = 68;
        byArray2[310] = -52;
        byArray2[311] = 79;
        byArray2[312] = -47;
        byArray2[313] = 104;
        byArray2[314] = -72;
        byArray2[315] = -45;
        byArray2[316] = 110;
        byArray2[317] = -78;
        byArray2[318] = -51;
        byArray2[319] = 76;
        byArray2[320] = -44;
        byArray2[321] = 103;
        byArray2[322] = -87;
        byArray2[323] = -32;
        byArray2[324] = 59;
        byArray2[325] = 77;
        byArray2[326] = -41;
        byArray2[327] = 98;
        byArray2[328] = -90;
        byArray2[329] = -15;
        byArray2[330] = 8;
        byArray2[331] = 24;
        byArray2[332] = 40;
        byArray2[333] = 120;
        byArray2[334] = -120;
        byArray2[335] = -125;
        byArray2[336] = -98;
        byArray2[337] = -71;
        byArray2[338] = -48;
        byArray2[339] = 107;
        byArray2[340] = -67;
        byArray2[341] = -36;
        byArray2[342] = 127;
        byArray2[343] = -127;
        byArray2[344] = -104;
        byArray2[345] = -77;
        byArray2[346] = -50;
        byArray2[347] = 73;
        byArray2[348] = -37;
        byArray2[349] = 118;
        byArray2[350] = -102;
        byArray2[351] = -75;
        byArray2[352] = -60;
        byArray2[353] = 87;
        byArray2[354] = -7;
        byArray2[355] = 16;
        byArray2[356] = 48;
        byArray2[357] = 80;
        byArray2[358] = -16;
        byArray2[359] = 11;
        byArray2[360] = 29;
        byArray2[361] = 39;
        byArray2[362] = 105;
        byArray2[363] = -69;
        byArray2[364] = -42;
        byArray2[365] = 97;
        byArray2[366] = -93;
        byArray2[367] = -2;
        byArray2[368] = 25;
        byArray2[369] = 43;
        byArray2[370] = 125;
        byArray2[371] = -121;
        byArray2[372] = -110;
        byArray2[373] = -83;
        byArray2[374] = -20;
        byArray2[375] = 47;
        byArray2[376] = 113;
        byArray2[377] = -109;
        byArray2[378] = -82;
        byArray2[379] = -23;
        byArray2[380] = 32;
        byArray2[381] = 96;
        byArray2[382] = -96;
        byArray2[383] = -5;
        byArray2[384] = 22;
        byArray2[385] = 58;
        byArray2[386] = 78;
        byArray2[387] = -46;
        byArray2[388] = 109;
        byArray2[389] = -73;
        byArray2[390] = -62;
        byArray2[391] = 93;
        byArray2[392] = -25;
        byArray2[393] = 50;
        byArray2[394] = 86;
        byArray2[395] = -6;
        byArray2[396] = 21;
        byArray2[397] = 63;
        byArray2[398] = 65;
        byArray2[399] = -61;
        byArray2[400] = 94;
        byArray2[401] = -30;
        byArray2[402] = 61;
        byArray2[403] = 71;
        byArray2[404] = -55;
        byArray2[405] = 64;
        byArray2[406] = -64;
        byArray2[407] = 91;
        byArray2[408] = -19;
        byArray2[409] = 44;
        byArray2[410] = 116;
        byArray2[411] = -100;
        byArray2[412] = -65;
        byArray2[413] = -38;
        byArray2[414] = 117;
        byArray2[415] = -97;
        byArray2[416] = -70;
        byArray2[417] = -43;
        byArray2[418] = 100;
        byArray2[419] = -84;
        byArray2[420] = -17;
        byArray2[421] = 42;
        byArray2[422] = 126;
        byArray2[423] = -126;
        byArray2[424] = -99;
        byArray2[425] = -68;
        byArray2[426] = -33;
        byArray2[427] = 122;
        byArray2[428] = -114;
        byArray2[429] = -119;
        byArray2[430] = -128;
        byArray2[431] = -101;
        byArray2[432] = -74;
        byArray2[433] = -63;
        byArray2[434] = 88;
        byArray2[435] = -24;
        byArray2[436] = 35;
        byArray2[437] = 101;
        byArray2[438] = -81;
        byArray2[439] = -22;
        byArray2[440] = 37;
        byArray2[441] = 111;
        byArray2[442] = -79;
        byArray2[443] = -56;
        byArray2[444] = 67;
        byArray2[445] = -59;
        byArray2[446] = 84;
        byArray2[447] = -4;
        byArray2[448] = 31;
        byArray2[449] = 33;
        byArray2[450] = 99;
        byArray2[451] = -91;
        byArray2[452] = -12;
        byArray2[453] = 7;
        byArray2[454] = 9;
        byArray2[455] = 27;
        byArray2[456] = 45;
        byArray2[457] = 119;
        byArray2[458] = -103;
        byArray2[459] = -80;
        byArray2[460] = -53;
        byArray2[461] = 70;
        byArray2[462] = -54;
        byArray2[463] = 69;
        byArray2[464] = -49;
        byArray2[465] = 74;
        byArray2[466] = -34;
        byArray2[467] = 121;
        byArray2[468] = -117;
        byArray2[469] = -122;
        byArray2[470] = -111;
        byArray2[471] = -88;
        byArray2[472] = -29;
        byArray2[473] = 62;
        byArray2[474] = 66;
        byArray2[475] = -58;
        byArray2[476] = 81;
        byArray2[477] = -13;
        byArray2[478] = 14;
        byArray2[479] = 18;
        byArray2[480] = 54;
        byArray2[481] = 90;
        byArray2[482] = -18;
        byArray2[483] = 41;
        byArray2[484] = 123;
        byArray2[485] = -115;
        byArray2[486] = -116;
        byArray2[487] = -113;
        byArray2[488] = -118;
        byArray2[489] = -123;
        byArray2[490] = -108;
        byArray2[491] = -89;
        byArray2[492] = -14;
        byArray2[493] = 13;
        byArray2[494] = 23;
        byArray2[495] = 57;
        byArray2[496] = 75;
        byArray2[497] = -35;
        byArray2[498] = 124;
        byArray2[499] = -124;
        byArray2[500] = -105;
        byArray2[501] = -94;
        byArray2[502] = -3;
        byArray2[503] = 28;
        byArray2[504] = 36;
        byArray2[505] = 108;
        byArray2[506] = -76;
        byArray2[507] = -57;
        byArray2[508] = 82;
        byArray2[509] = -10;
        byArray2[510] = 1;
        cfr_renamed_114 = byArray2;
        byte[] byArray3 = new byte[256];
        byArray3[0] = 99;
        byArray3[1] = 124;
        byArray3[2] = 119;
        byArray3[3] = 123;
        byArray3[4] = -14;
        byArray3[5] = 107;
        byArray3[6] = 111;
        byArray3[7] = -59;
        byArray3[8] = 48;
        byArray3[9] = 1;
        byArray3[10] = 103;
        byArray3[11] = 43;
        byArray3[12] = -2;
        byArray3[13] = -41;
        byArray3[14] = -85;
        byArray3[15] = 118;
        byArray3[16] = -54;
        byArray3[17] = -126;
        byArray3[18] = -55;
        byArray3[19] = 125;
        byArray3[20] = -6;
        byArray3[21] = 89;
        byArray3[22] = 71;
        byArray3[23] = -16;
        byArray3[24] = -83;
        byArray3[25] = -44;
        byArray3[26] = -94;
        byArray3[27] = -81;
        byArray3[28] = -100;
        byArray3[29] = -92;
        byArray3[30] = 114;
        byArray3[31] = -64;
        byArray3[32] = -73;
        byArray3[33] = -3;
        byArray3[34] = -109;
        byArray3[35] = 38;
        byArray3[36] = 54;
        byArray3[37] = 63;
        byArray3[38] = -9;
        byArray3[39] = -52;
        byArray3[40] = 52;
        byArray3[41] = -91;
        byArray3[42] = -27;
        byArray3[43] = -15;
        byArray3[44] = 113;
        byArray3[45] = -40;
        byArray3[46] = 49;
        byArray3[47] = 21;
        byArray3[48] = 4;
        byArray3[49] = -57;
        byArray3[50] = 35;
        byArray3[51] = -61;
        byArray3[52] = 24;
        byArray3[53] = -106;
        byArray3[54] = 5;
        byArray3[55] = -102;
        byArray3[56] = 7;
        byArray3[57] = 18;
        byArray3[58] = -128;
        byArray3[59] = -30;
        byArray3[60] = -21;
        byArray3[61] = 39;
        byArray3[62] = -78;
        byArray3[63] = 117;
        byArray3[64] = 9;
        byArray3[65] = -125;
        byArray3[66] = 44;
        byArray3[67] = 26;
        byArray3[68] = 27;
        byArray3[69] = 110;
        byArray3[70] = 90;
        byArray3[71] = -96;
        byArray3[72] = 82;
        byArray3[73] = 59;
        byArray3[74] = -42;
        byArray3[75] = -77;
        byArray3[76] = 41;
        byArray3[77] = -29;
        byArray3[78] = 47;
        byArray3[79] = -124;
        byArray3[80] = 83;
        byArray3[81] = -47;
        byArray3[82] = 0;
        byArray3[83] = -19;
        byArray3[84] = 32;
        byArray3[85] = -4;
        byArray3[86] = -79;
        byArray3[87] = 91;
        byArray3[88] = 106;
        byArray3[89] = -53;
        byArray3[90] = -66;
        byArray3[91] = 57;
        byArray3[92] = 74;
        byArray3[93] = 76;
        byArray3[94] = 88;
        byArray3[95] = -49;
        byArray3[96] = -48;
        byArray3[97] = -17;
        byArray3[98] = -86;
        byArray3[99] = -5;
        byArray3[100] = 67;
        byArray3[101] = 77;
        byArray3[102] = 51;
        byArray3[103] = -123;
        byArray3[104] = 69;
        byArray3[105] = -7;
        byArray3[106] = 2;
        byArray3[107] = 127;
        byArray3[108] = 80;
        byArray3[109] = 60;
        byArray3[110] = -97;
        byArray3[111] = -88;
        byArray3[112] = 81;
        byArray3[113] = -93;
        byArray3[114] = 64;
        byArray3[115] = -113;
        byArray3[116] = -110;
        byArray3[117] = -99;
        byArray3[118] = 56;
        byArray3[119] = -11;
        byArray3[120] = -68;
        byArray3[121] = -74;
        byArray3[122] = -38;
        byArray3[123] = 33;
        byArray3[124] = 16;
        byArray3[125] = -1;
        byArray3[126] = -13;
        byArray3[127] = -46;
        byArray3[128] = -51;
        byArray3[129] = 12;
        byArray3[130] = 19;
        byArray3[131] = -20;
        byArray3[132] = 95;
        byArray3[133] = -105;
        byArray3[134] = 68;
        byArray3[135] = 23;
        byArray3[136] = -60;
        byArray3[137] = -89;
        byArray3[138] = 126;
        byArray3[139] = 61;
        byArray3[140] = 100;
        byArray3[141] = 93;
        byArray3[142] = 25;
        byArray3[143] = 115;
        byArray3[144] = 96;
        byArray3[145] = -127;
        byArray3[146] = 79;
        byArray3[147] = -36;
        byArray3[148] = 34;
        byArray3[149] = 42;
        byArray3[150] = -112;
        byArray3[151] = -120;
        byArray3[152] = 70;
        byArray3[153] = -18;
        byArray3[154] = -72;
        byArray3[155] = 20;
        byArray3[156] = -34;
        byArray3[157] = 94;
        byArray3[158] = 11;
        byArray3[159] = -37;
        byArray3[160] = -32;
        byArray3[161] = 50;
        byArray3[162] = 58;
        byArray3[163] = 10;
        byArray3[164] = 73;
        byArray3[165] = 6;
        byArray3[166] = 36;
        byArray3[167] = 92;
        byArray3[168] = -62;
        byArray3[169] = -45;
        byArray3[170] = -84;
        byArray3[171] = 98;
        byArray3[172] = -111;
        byArray3[173] = -107;
        byArray3[174] = -28;
        byArray3[175] = 121;
        byArray3[176] = -25;
        byArray3[177] = -56;
        byArray3[178] = 55;
        byArray3[179] = 109;
        byArray3[180] = -115;
        byArray3[181] = -43;
        byArray3[182] = 78;
        byArray3[183] = -87;
        byArray3[184] = 108;
        byArray3[185] = 86;
        byArray3[186] = -12;
        byArray3[187] = -22;
        byArray3[188] = 101;
        byArray3[189] = 122;
        byArray3[190] = -82;
        byArray3[191] = 8;
        byArray3[192] = -70;
        byArray3[193] = 120;
        byArray3[194] = 37;
        byArray3[195] = 46;
        byArray3[196] = 28;
        byArray3[197] = -90;
        byArray3[198] = -76;
        byArray3[199] = -58;
        byArray3[200] = -24;
        byArray3[201] = -35;
        byArray3[202] = 116;
        byArray3[203] = 31;
        byArray3[204] = 75;
        byArray3[205] = -67;
        byArray3[206] = -117;
        byArray3[207] = -118;
        byArray3[208] = 112;
        byArray3[209] = 62;
        byArray3[210] = -75;
        byArray3[211] = 102;
        byArray3[212] = 72;
        byArray3[213] = 3;
        byArray3[214] = -10;
        byArray3[215] = 14;
        byArray3[216] = 97;
        byArray3[217] = 53;
        byArray3[218] = 87;
        byArray3[219] = -71;
        byArray3[220] = -122;
        byArray3[221] = -63;
        byArray3[222] = 29;
        byArray3[223] = -98;
        byArray3[224] = -31;
        byArray3[225] = -8;
        byArray3[226] = -104;
        byArray3[227] = 17;
        byArray3[228] = 105;
        byArray3[229] = -39;
        byArray3[230] = -114;
        byArray3[231] = -108;
        byArray3[232] = -101;
        byArray3[233] = 30;
        byArray3[234] = -121;
        byArray3[235] = -23;
        byArray3[236] = -50;
        byArray3[237] = 85;
        byArray3[238] = 40;
        byArray3[239] = -33;
        byArray3[240] = -116;
        byArray3[241] = -95;
        byArray3[242] = -119;
        byArray3[243] = 13;
        byArray3[244] = -65;
        byArray3[245] = -26;
        byArray3[246] = 66;
        byArray3[247] = 104;
        byArray3[248] = 65;
        byArray3[249] = -103;
        byArray3[250] = 45;
        byArray3[251] = 15;
        byArray3[252] = -80;
        byArray3[253] = 84;
        byArray3[254] = -69;
        byArray3[255] = 22;
        cfr_renamed_102 = byArray3;
        byte[] byArray4 = new byte[256];
        byArray4[0] = 82;
        byArray4[1] = 9;
        byArray4[2] = 106;
        byArray4[3] = -43;
        byArray4[4] = 48;
        byArray4[5] = 54;
        byArray4[6] = -91;
        byArray4[7] = 56;
        byArray4[8] = -65;
        byArray4[9] = 64;
        byArray4[10] = -93;
        byArray4[11] = -98;
        byArray4[12] = -127;
        byArray4[13] = -13;
        byArray4[14] = -41;
        byArray4[15] = -5;
        byArray4[16] = 124;
        byArray4[17] = -29;
        byArray4[18] = 57;
        byArray4[19] = -126;
        byArray4[20] = -101;
        byArray4[21] = 47;
        byArray4[22] = -1;
        byArray4[23] = -121;
        byArray4[24] = 52;
        byArray4[25] = -114;
        byArray4[26] = 67;
        byArray4[27] = 68;
        byArray4[28] = -60;
        byArray4[29] = -34;
        byArray4[30] = -23;
        byArray4[31] = -53;
        byArray4[32] = 84;
        byArray4[33] = 123;
        byArray4[34] = -108;
        byArray4[35] = 50;
        byArray4[36] = -90;
        byArray4[37] = -62;
        byArray4[38] = 35;
        byArray4[39] = 61;
        byArray4[40] = -18;
        byArray4[41] = 76;
        byArray4[42] = -107;
        byArray4[43] = 11;
        byArray4[44] = 66;
        byArray4[45] = -6;
        byArray4[46] = -61;
        byArray4[47] = 78;
        byArray4[48] = 8;
        byArray4[49] = 46;
        byArray4[50] = -95;
        byArray4[51] = 102;
        byArray4[52] = 40;
        byArray4[53] = -39;
        byArray4[54] = 36;
        byArray4[55] = -78;
        byArray4[56] = 118;
        byArray4[57] = 91;
        byArray4[58] = -94;
        byArray4[59] = 73;
        byArray4[60] = 109;
        byArray4[61] = -117;
        byArray4[62] = -47;
        byArray4[63] = 37;
        byArray4[64] = 114;
        byArray4[65] = -8;
        byArray4[66] = -10;
        byArray4[67] = 100;
        byArray4[68] = -122;
        byArray4[69] = 104;
        byArray4[70] = -104;
        byArray4[71] = 22;
        byArray4[72] = -44;
        byArray4[73] = -92;
        byArray4[74] = 92;
        byArray4[75] = -52;
        byArray4[76] = 93;
        byArray4[77] = 101;
        byArray4[78] = -74;
        byArray4[79] = -110;
        byArray4[80] = 108;
        byArray4[81] = 112;
        byArray4[82] = 72;
        byArray4[83] = 80;
        byArray4[84] = -3;
        byArray4[85] = -19;
        byArray4[86] = -71;
        byArray4[87] = -38;
        byArray4[88] = 94;
        byArray4[89] = 21;
        byArray4[90] = 70;
        byArray4[91] = 87;
        byArray4[92] = -89;
        byArray4[93] = -115;
        byArray4[94] = -99;
        byArray4[95] = -124;
        byArray4[96] = -112;
        byArray4[97] = -40;
        byArray4[98] = -85;
        byArray4[99] = 0;
        byArray4[100] = -116;
        byArray4[101] = -68;
        byArray4[102] = -45;
        byArray4[103] = 10;
        byArray4[104] = -9;
        byArray4[105] = -28;
        byArray4[106] = 88;
        byArray4[107] = 5;
        byArray4[108] = -72;
        byArray4[109] = -77;
        byArray4[110] = 69;
        byArray4[111] = 6;
        byArray4[112] = -48;
        byArray4[113] = 44;
        byArray4[114] = 30;
        byArray4[115] = -113;
        byArray4[116] = -54;
        byArray4[117] = 63;
        byArray4[118] = 15;
        byArray4[119] = 2;
        byArray4[120] = -63;
        byArray4[121] = -81;
        byArray4[122] = -67;
        byArray4[123] = 3;
        byArray4[124] = 1;
        byArray4[125] = 19;
        byArray4[126] = -118;
        byArray4[127] = 107;
        byArray4[128] = 58;
        byArray4[129] = -111;
        byArray4[130] = 17;
        byArray4[131] = 65;
        byArray4[132] = 79;
        byArray4[133] = 103;
        byArray4[134] = -36;
        byArray4[135] = -22;
        byArray4[136] = -105;
        byArray4[137] = -14;
        byArray4[138] = -49;
        byArray4[139] = -50;
        byArray4[140] = -16;
        byArray4[141] = -76;
        byArray4[142] = -26;
        byArray4[143] = 115;
        byArray4[144] = -106;
        byArray4[145] = -84;
        byArray4[146] = 116;
        byArray4[147] = 34;
        byArray4[148] = -25;
        byArray4[149] = -83;
        byArray4[150] = 53;
        byArray4[151] = -123;
        byArray4[152] = -30;
        byArray4[153] = -7;
        byArray4[154] = 55;
        byArray4[155] = -24;
        byArray4[156] = 28;
        byArray4[157] = 117;
        byArray4[158] = -33;
        byArray4[159] = 110;
        byArray4[160] = 71;
        byArray4[161] = -15;
        byArray4[162] = 26;
        byArray4[163] = 113;
        byArray4[164] = 29;
        byArray4[165] = 41;
        byArray4[166] = -59;
        byArray4[167] = -119;
        byArray4[168] = 111;
        byArray4[169] = -73;
        byArray4[170] = 98;
        byArray4[171] = 14;
        byArray4[172] = -86;
        byArray4[173] = 24;
        byArray4[174] = -66;
        byArray4[175] = 27;
        byArray4[176] = -4;
        byArray4[177] = 86;
        byArray4[178] = 62;
        byArray4[179] = 75;
        byArray4[180] = -58;
        byArray4[181] = -46;
        byArray4[182] = 121;
        byArray4[183] = 32;
        byArray4[184] = -102;
        byArray4[185] = -37;
        byArray4[186] = -64;
        byArray4[187] = -2;
        byArray4[188] = 120;
        byArray4[189] = -51;
        byArray4[190] = 90;
        byArray4[191] = -12;
        byArray4[192] = 31;
        byArray4[193] = -35;
        byArray4[194] = -88;
        byArray4[195] = 51;
        byArray4[196] = -120;
        byArray4[197] = 7;
        byArray4[198] = -57;
        byArray4[199] = 49;
        byArray4[200] = -79;
        byArray4[201] = 18;
        byArray4[202] = 16;
        byArray4[203] = 89;
        byArray4[204] = 39;
        byArray4[205] = -128;
        byArray4[206] = -20;
        byArray4[207] = 95;
        byArray4[208] = 96;
        byArray4[209] = 81;
        byArray4[210] = 127;
        byArray4[211] = -87;
        byArray4[212] = 25;
        byArray4[213] = -75;
        byArray4[214] = 74;
        byArray4[215] = 13;
        byArray4[216] = 45;
        byArray4[217] = -27;
        byArray4[218] = 122;
        byArray4[219] = -97;
        byArray4[220] = -109;
        byArray4[221] = -55;
        byArray4[222] = -100;
        byArray4[223] = -17;
        byArray4[224] = -96;
        byArray4[225] = -32;
        byArray4[226] = 59;
        byArray4[227] = 77;
        byArray4[228] = -82;
        byArray4[229] = 42;
        byArray4[230] = -11;
        byArray4[231] = -80;
        byArray4[232] = -56;
        byArray4[233] = -21;
        byArray4[234] = -69;
        byArray4[235] = 60;
        byArray4[236] = -125;
        byArray4[237] = 83;
        byArray4[238] = -103;
        byArray4[239] = 97;
        byArray4[240] = 23;
        byArray4[241] = 43;
        byArray4[242] = 4;
        byArray4[243] = 126;
        byArray4[244] = -70;
        byArray4[245] = 119;
        byArray4[246] = -42;
        byArray4[247] = 38;
        byArray4[248] = -31;
        byArray4[249] = 105;
        byArray4[250] = 20;
        byArray4[251] = 99;
        byArray4[252] = 85;
        byArray4[253] = 33;
        byArray4[254] = 12;
        byArray4[255] = 125;
        cfr_renamed_0 = byArray4;
        int[] nArray = new int[30];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 4;
        nArray[3] = 8;
        nArray[4] = 16;
        nArray[5] = 32;
        nArray[6] = 64;
        nArray[7] = 128;
        nArray[8] = 27;
        nArray[9] = 54;
        nArray[10] = 108;
        nArray[11] = 216;
        nArray[12] = 171;
        nArray[13] = 77;
        nArray[14] = 154;
        nArray[15] = 47;
        nArray[16] = 94;
        nArray[17] = 188;
        nArray[18] = 99;
        nArray[19] = 198;
        nArray[20] = 151;
        nArray[21] = 53;
        nArray[22] = 106;
        nArray[23] = 212;
        nArray[24] = 179;
        nArray[25] = 125;
        nArray[26] = 250;
        nArray[27] = 239;
        nArray[28] = 197;
        nArray[29] = 145;
        cfr_renamed_91 = nArray;
        byte[][] byArrayArray = new byte[5][];
        byte[] byArray5 = new byte[4];
        byArray5[0] = 0;
        byArray5[1] = 8;
        byArray5[2] = 16;
        byArray5[3] = 24;
        byArrayArray[0] = byArray5;
        byte[] byArray6 = new byte[4];
        byArray6[0] = 0;
        byArray6[1] = 8;
        byArray6[2] = 16;
        byArray6[3] = 24;
        byArrayArray[1] = byArray6;
        byte[] byArray7 = new byte[4];
        byArray7[0] = 0;
        byArray7[1] = 8;
        byArray7[2] = 16;
        byArray7[3] = 24;
        byArrayArray[2] = byArray7;
        byte[] byArray8 = new byte[4];
        byArray8[0] = 0;
        byArray8[1] = 8;
        byArray8[2] = 16;
        byArray8[3] = 32;
        byArrayArray[3] = byArray8;
        byte[] byArray9 = new byte[4];
        byArray9[0] = 0;
        byArray9[1] = 8;
        byArray9[2] = 24;
        byArray9[3] = 32;
        byArrayArray[4] = byArray9;
        cfr_renamed_3 = byArrayArray;
        byte[][] byArrayArray2 = new byte[5][];
        byte[] byArray10 = new byte[4];
        byArray10[0] = 0;
        byArray10[1] = 24;
        byArray10[2] = 16;
        byArray10[3] = 8;
        byArrayArray2[0] = byArray10;
        byte[] byArray11 = new byte[4];
        byArray11[0] = 0;
        byArray11[1] = 32;
        byArray11[2] = 24;
        byArray11[3] = 16;
        byArrayArray2[1] = byArray11;
        byte[] byArray12 = new byte[4];
        byArray12[0] = 0;
        byArray12[1] = 40;
        byArray12[2] = 32;
        byArray12[3] = 24;
        byArrayArray2[2] = byArray12;
        byte[] byArray13 = new byte[4];
        byArray13[0] = 0;
        byArray13[1] = 48;
        byArray13[2] = 40;
        byArray13[3] = 24;
        byArrayArray2[3] = byArray13;
        byte[] byArray14 = new byte[4];
        byArray14[0] = 0;
        byArray14[1] = 56;
        byArray14[2] = 40;
        byArray14[3] = 32;
        byArrayArray2[4] = byArray14;
        cfr_renamed_145 = byArrayArray2;
    }

    private /* synthetic */ void cfr_renamed_3622(byte[] arg0, int arg1) {
        int n;
        int n2 = arg1;
        sprxhd sprxhd2 = this;
        int n3 = arg0[n2] & 0xFF;
        this.cfr_renamed_132 = n3;
        int n4 = arg0[++n2] & 0xFF;
        this.cfr_renamed_272 = n4;
        int n5 = arg0[++n2] & 0xFF;
        sprxhd2.cfr_renamed_107 = n5;
        int n6 = arg0[++n2] & 0xFF;
        ++n2;
        sprxhd2.cfr_renamed_86 = n6;
        int n7 = n = 8;
        while (n7 != this.cfr_renamed_2) {
            sprxhd sprxhd3 = this;
            int n8 = arg0[n2] & 0xFF;
            sprxhd3.cfr_renamed_132 |= (long)n8 << n;
            int n9 = arg0[++n2] & 0xFF;
            sprxhd3.cfr_renamed_272 |= (long)n9 << n;
            int n10 = arg0[++n2] & 0xFF;
            sprxhd3.cfr_renamed_107 |= (long)n10 << n;
            int n11 = arg0[++n2] & 0xFF;
            ++n2;
            int n12 = n;
            sprxhd3.cfr_renamed_86 |= (long)n11 << n12;
            n7 = n += 8;
        }
    }

    private /* synthetic */ long cfr_renamed_3623(long arg0, int arg1) {
        return (arg0 >>> arg1 | arg0 << this.cfr_renamed_2 - arg1) & this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_3617(long[] arg0) {
        sprxhd sprxhd2 = this;
        sprxhd2.cfr_renamed_132 ^= arg0[0];
        sprxhd2.cfr_renamed_272 ^= arg0[1];
        sprxhd2.cfr_renamed_107 ^= arg0[2];
        sprxhd2.cfr_renamed_86 ^= arg0[3];
    }

    @Override
    public void cfr_renamed_41() {
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_2 / 2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxhd(int n) {
        void arg0;
        switch (n) {
            case 128: {
                while (false) {
                }
                sprxhd sprxhd2 = this;
                sprxhd sprxhd3 = this;
                sprxhd3.cfr_renamed_2 = 32;
                sprxhd3.cfr_renamed_1 = 0xFFFFFFFFL;
                this.cfr_renamed_96 = cfr_renamed_3[0];
                this.cfr_renamed_105 = cfr_renamed_145[0];
                break;
            }
            case 160: {
                sprxhd sprxhd2 = this;
                sprxhd sprxhd4 = this;
                sprxhd4.cfr_renamed_2 = 40;
                sprxhd4.cfr_renamed_1 = 0xFFFFFFFFFFL;
                this.cfr_renamed_96 = cfr_renamed_3[1];
                this.cfr_renamed_105 = cfr_renamed_145[1];
                break;
            }
            case 192: {
                sprxhd sprxhd2 = this;
                sprxhd sprxhd5 = this;
                sprxhd5.cfr_renamed_2 = 48;
                sprxhd5.cfr_renamed_1 = 0xFFFFFFFFFFFFL;
                this.cfr_renamed_96 = cfr_renamed_3[2];
                this.cfr_renamed_105 = cfr_renamed_145[2];
                break;
            }
            case 224: {
                sprxhd sprxhd2 = this;
                sprxhd sprxhd6 = this;
                sprxhd6.cfr_renamed_2 = 56;
                sprxhd6.cfr_renamed_1 = 0xFFFFFFFFFFFFFFL;
                this.cfr_renamed_96 = cfr_renamed_3[3];
                this.cfr_renamed_105 = cfr_renamed_145[3];
                break;
            }
            case 256: {
                sprxhd sprxhd2 = this;
                sprxhd sprxhd7 = this;
                sprxhd7.cfr_renamed_2 = 64;
                sprxhd7.cfr_renamed_1 = -1L;
                this.cfr_renamed_96 = cfr_renamed_3[4];
                this.cfr_renamed_105 = cfr_renamed_145[4];
                break;
            }
            default: {
                throw new IllegalArgumentException(sprbrz.cfr_renamed_9("N\u0002P\u0002T\u001bULY\u0000T\u000fP\u001fR\u0016^LO\u0003\u001b>R\u0006U\bZ\tW"));
            }
        }
        sprxhd2.cfr_renamed_119 = arg0;
    }

    private /* synthetic */ byte cfr_renamed_3624(int arg0) {
        if (arg0 != 0) {
            return cfr_renamed_114[25 + (cfr_renamed_4[arg0] & 0xFF)];
        }
        return 0;
    }

    @Override
    public String cfr_renamed_1315() {
        return "Rijndael";
    }

    private /* synthetic */ void cfr_renamed_3620() {
        int n;
        long l = 0L;
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            sprxhd sprxhd2 = this;
            int n3 = (int)(sprxhd2.cfr_renamed_132 >> n & 0xFFL);
            int n4 = (int)(sprxhd2.cfr_renamed_272 >> n & 0xFFL);
            int n5 = (int)(sprxhd2.cfr_renamed_107 >> n & 0xFFL);
            int n6 = (int)(sprxhd2.cfr_renamed_86 >> n & 0xFFL);
            n3 = n3 != 0 ? cfr_renamed_4[n3 & 0xFF] & 0xFF : -1;
            n4 = n4 != 0 ? cfr_renamed_4[n4 & 0xFF] & 0xFF : -1;
            n5 = n5 != 0 ? cfr_renamed_4[n5 & 0xFF] & 0xFF : -1;
            n6 = n6 != 0 ? cfr_renamed_4[n6 & 0xFF] & 0xFF : -1;
            l4 |= (long)((this.cfr_renamed_3625(n3) ^ this.cfr_renamed_3615(n4) ^ this.cfr_renamed_3626(n5) ^ this.cfr_renamed_3627(n6)) & 0xFF) << n;
            l3 |= (long)((this.cfr_renamed_3625(n4) ^ this.cfr_renamed_3615(n5) ^ this.cfr_renamed_3626(n6) ^ this.cfr_renamed_3627(n3)) & 0xFF) << n;
            l2 |= (long)((this.cfr_renamed_3625(n5) ^ this.cfr_renamed_3615(n6) ^ this.cfr_renamed_3626(n3) ^ this.cfr_renamed_3627(n4)) & 0xFF) << n;
            int n7 = n;
            l |= (long)((this.cfr_renamed_3625(n6) ^ this.cfr_renamed_3615(n3) ^ this.cfr_renamed_3626(n4) ^ this.cfr_renamed_3627(n5)) & 0xFF) << n7;
            n2 = n += 8;
        }
        sprxhd sprxhd3 = this;
        this.cfr_renamed_132 = l4;
        sprxhd3.cfr_renamed_272 = l3;
        sprxhd3.cfr_renamed_107 = l2;
        this.cfr_renamed_86 = l;
    }

    private /* synthetic */ byte cfr_renamed_3626(int arg0) {
        if (arg0 >= 0) {
            return cfr_renamed_114[238 + arg0];
        }
        return 0;
    }

    private /* synthetic */ void cfr_renamed_3628() {
        int n;
        long l = 0L;
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            sprxhd sprxhd2 = this;
            int n3 = (int)(sprxhd2.cfr_renamed_132 >> n & 0xFFL);
            int n4 = (int)(sprxhd2.cfr_renamed_272 >> n & 0xFFL);
            int n5 = (int)(sprxhd2.cfr_renamed_107 >> n & 0xFFL);
            int n6 = (int)(sprxhd2.cfr_renamed_86 >> n & 0xFFL);
            l4 |= (long)((this.cfr_renamed_3624(n3) ^ this.cfr_renamed_3629(n4) ^ n5 ^ n6) & 0xFF) << n;
            l3 |= (long)((this.cfr_renamed_3624(n4) ^ this.cfr_renamed_3629(n5) ^ n6 ^ n3) & 0xFF) << n;
            l2 |= (long)((this.cfr_renamed_3624(n5) ^ this.cfr_renamed_3629(n6) ^ n3 ^ n4) & 0xFF) << n;
            int n7 = n;
            l |= (long)((this.cfr_renamed_3624(n6) ^ this.cfr_renamed_3629(n3) ^ n4 ^ n5) & 0xFF) << n7;
            n2 = n += 8;
        }
        sprxhd sprxhd3 = this;
        this.cfr_renamed_132 = l4;
        sprxhd3.cfr_renamed_272 = l3;
        sprxhd3.cfr_renamed_107 = l2;
        this.cfr_renamed_86 = l;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg1 instanceof sprnld) {
            this.cfr_renamed_112 = this.cfr_renamed_3477(((sprnld)arg1).cfr_renamed_1521());
            this.cfr_renamed_93 = arg0;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjyc.cfr_renamed_9("QcNlTd\\-HlJlUhLhJ-HlK~]i\u0018yW-jdRc\\l]a\u0018dVdL-\u0015-")).append(arg1.getClass().getName()).toString());
    }

    private /* synthetic */ byte cfr_renamed_3629(int arg0) {
        if (arg0 != 0) {
            return cfr_renamed_114[1 + (cfr_renamed_4[arg0] & 0xFF)];
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3630(long[][] lArray) {
        int n;
        void arg0;
        this.cfr_renamed_3617((long[])arg0[0]);
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_152) {
            sprxhd sprxhd2 = this;
            sprxhd sprxhd3 = this;
            sprxhd3.cfr_renamed_3618(cfr_renamed_102);
            sprxhd3.cfr_renamed_3619(sprxhd3.cfr_renamed_96);
            sprxhd2.cfr_renamed_3628();
            sprxhd2.cfr_renamed_3617((long[])arg0[++n]);
            n2 = n;
        }
        sprxhd sprxhd4 = this;
        sprxhd4.cfr_renamed_3618(cfr_renamed_102);
        sprxhd4.cfr_renamed_3619(sprxhd4.cfr_renamed_96);
        this.cfr_renamed_3617((long[])arg0[sprxhd4.cfr_renamed_152]);
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        sprxhd sprxhd2;
        if (this.cfr_renamed_112 == null) {
            throw new IllegalStateException(sprbrz.cfr_renamed_9("i\u0005Q\u0002_\r^\u0000\u001b\tU\u000bR\u0002^LU\u0003OLR\u0002R\u0018R\rW\u0005H\t_"));
        }
        if (arg1 + this.cfr_renamed_2 / 2 > arg0.length) {
            throw new sprjkd(sprjyc.cfr_renamed_9("QcHxL-Zx^k]\u007f\u0018yWb\u0018~PbJy"));
        }
        if (arg3 + this.cfr_renamed_2 / 2 > arg2.length) {
            throw new spreid(sprbrz.cfr_renamed_9("T\u0019O\u001cN\u0018\u001b\u000eN\n]\tILO\u0003TLH\u0004T\u001eO"));
        }
        if (this.cfr_renamed_93) {
            sprxhd sprxhd3 = this;
            sprxhd2 = sprxhd3;
            sprxhd sprxhd4 = this;
            sprxhd4.cfr_renamed_3622(arg0, arg1);
            sprxhd3.cfr_renamed_3630(sprxhd4.cfr_renamed_112);
            sprxhd3.cfr_renamed_3631(arg2, arg3);
        } else {
            sprxhd2 = this;
            sprxhd sprxhd5 = this;
            sprxhd sprxhd6 = this;
            sprxhd6.cfr_renamed_3622(arg0, arg1);
            sprxhd5.cfr_renamed_3616(sprxhd6.cfr_renamed_112);
            sprxhd5.cfr_renamed_3631(arg2, arg3);
        }
        return sprxhd2.cfr_renamed_2 / 2;
    }

    private /* synthetic */ byte cfr_renamed_3625(int arg0) {
        if (arg0 >= 0) {
            return cfr_renamed_114[223 + arg0];
        }
        return 0;
    }

    private /* synthetic */ void cfr_renamed_3619(byte[] arg0) {
        sprxhd sprxhd2 = this;
        sprxhd2.cfr_renamed_272 = sprxhd2.cfr_renamed_3623(sprxhd2.cfr_renamed_272, arg0[1]);
        sprxhd2.cfr_renamed_107 = sprxhd2.cfr_renamed_3623(sprxhd2.cfr_renamed_107, arg0[2]);
        sprxhd2.cfr_renamed_86 = sprxhd2.cfr_renamed_3623(sprxhd2.cfr_renamed_86, arg0[3]);
    }

    private /* synthetic */ byte cfr_renamed_3627(int arg0) {
        if (arg0 >= 0) {
            return cfr_renamed_114[199 + arg0];
        }
        return 0;
    }

    private /* synthetic */ void cfr_renamed_3631(byte[] arg0, int arg1) {
        int n;
        int n2 = arg1;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_2) {
            byte[] byArray = arg0;
            byte[] byArray2 = arg0;
            byArray[n2++] = (byte)(this.cfr_renamed_132 >> n);
            byArray2[n2++] = (byte)(this.cfr_renamed_272 >> n);
            byArray[n2++] = (byte)(this.cfr_renamed_107 >> n);
            int n4 = n2++;
            byte by = (byte)(this.cfr_renamed_86 >> n);
            byArray2[n4] = by;
            n3 = n += 8;
        }
    }

    private /* synthetic */ long cfr_renamed_3621(long arg0, byte[] arg1) {
        int n;
        long l = 0L;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            long l2 = arg1[(int)(arg0 >> n & 0xFFL)] & 0xFF;
            int n3 = n;
            l |= l2 << n3;
            n2 = n += 8;
        }
        return l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ long[][] cfr_renamed_3477(byte[] arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = 0;
        int n7 = arg0.length * 8;
        byte[][] byArray = new byte[4][64];
        long[][] lArray = new long[15][4];
        switch (n7) {
            case 128: {
                n5 = 4;
                n4 = n7;
                break;
            }
            case 160: {
                n5 = 5;
                n4 = n7;
                break;
            }
            case 192: {
                n5 = 6;
                n4 = n7;
                break;
            }
            case 224: {
                n5 = 7;
                n4 = n7;
                break;
            }
            case 256: {
                n5 = 8;
                n4 = n7;
                break;
            }
            default: {
                throw new IllegalArgumentException(sprjyc.cfr_renamed_9("shA-ThVjLe\u0018cWy\u0018<\n5\u0017<\u000e=\u0017<\u0001?\u0017?\n9\u0017?\r;\u0018oQyK#"));
            }
        }
        this.cfr_renamed_152 = n4 >= this.cfr_renamed_119 ? n5 + 6 : this.cfr_renamed_2 / 8 + 6;
        int n8 = 0;
        int n9 = n3 = 0;
        while (n9 < arg0.length) {
            byte[] byArray2 = byArray[n3 % 4];
            int n10 = n3 / 4;
            byte by = arg0[n8];
            ++n8;
            byArray2[n10] = by;
            n9 = ++n3;
        }
        int n11 = n3 = 0;
        for (n2 = 0; n11 < n5 && n2 < (this.cfr_renamed_152 + 1) * (this.cfr_renamed_2 / 8); ++n2) {
            int n12 = n = 0;
            while (n12 < 4) {
                long[] lArray2 = lArray[n2 / (this.cfr_renamed_2 / 8)];
                int n13 = n;
                long l = lArray2[n13] | (long)(byArray[n][n3] & 0xFF) << n2 * 8 % this.cfr_renamed_2;
                lArray2[n13] = l;
                n12 = ++n;
            }
            n11 = ++n3;
        }
        block10: while (n2 < (this.cfr_renamed_152 + 1) * (this.cfr_renamed_2 / 8)) {
            int n14 = n3 = 0;
            while (n14 < 4) {
                byte[] byArray3 = byArray[n3];
                byte by = (byte)(byArray3[0] ^ cfr_renamed_102[byArray[(n3 + 1) % 4][n5 - 1] & 0xFF]);
                byArray3[0] = by;
                n14 = ++n3;
            }
            byte[] byArray4 = byArray[0];
            byte by = (byte)(byArray4[0] ^ cfr_renamed_91[n6]);
            ++n6;
            byArray4[0] = by;
            if (n5 <= 6) {
                int n15 = n3 = 1;
                while (n15 < n5) {
                    int n16 = n = 0;
                    while (n16 < 4) {
                        byte[] byArray5 = byArray[n];
                        int n17 = n3;
                        byte by2 = (byte)(byArray5[n17] ^ byArray[n][n3 - 1]);
                        byArray5[n17] = by2;
                        n16 = ++n;
                    }
                    n15 = ++n3;
                }
            } else {
                int n18 = n3 = 1;
                while (n18 < 4) {
                    int n19 = n = 0;
                    while (n19 < 4) {
                        byte[] byArray6 = byArray[n];
                        int n20 = n3;
                        byte by3 = (byte)(byArray6[n20] ^ byArray[n][n3 - 1]);
                        byArray6[n20] = by3;
                        n19 = ++n;
                    }
                    n18 = ++n3;
                }
                int n21 = n3 = 0;
                while (n21 < 4) {
                    byte[] byArray7 = byArray[n3];
                    byte by4 = (byte)(byArray7[4] ^ cfr_renamed_102[byArray[n3][3] & 0xFF]);
                    byArray7[4] = by4;
                    n21 = ++n3;
                }
                int n22 = n3 = 5;
                while (n22 < n5) {
                    int n23 = n = 0;
                    while (n23 < 4) {
                        byte[] byArray8 = byArray[n];
                        int n24 = n3;
                        byte by5 = (byte)(byArray8[n24] ^ byArray[n][n3 - 1]);
                        byArray8[n24] = by5;
                        n23 = ++n;
                    }
                    n22 = ++n3;
                }
            }
            int n25 = n3 = 0;
            while (true) {
                if (n25 >= n5 || n2 >= (this.cfr_renamed_152 + 1) * (this.cfr_renamed_2 / 8)) continue block10;
                int n26 = n = 0;
                while (n26 < 4) {
                    long[] lArray3 = lArray[n2 / (this.cfr_renamed_2 / 8)];
                    int n27 = n;
                    long l = lArray3[n27] | (long)(byArray[n][n3] & 0xFF) << n2 * 8 % this.cfr_renamed_2;
                    lArray3[n27] = l;
                    n26 = ++n;
                }
                n25 = ++n3;
                ++n2;
            }
            break;
        }
        return lArray;
    }
}

