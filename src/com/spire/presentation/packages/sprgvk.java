/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawc;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzgg;

public class sprgvk
implements sprvv,
sprhx {
    private static final byte[] cfr_renamed_86;
    private sprgvk cfr_renamed_152;
    private final int[] cfr_renamed_112;
    private final int[] cfr_renamed_119;
    private static final byte[] cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private int cfr_renamed_1;
    private final int[] cfr_renamed_2;
    private static final short[] cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10277(byte[] byArray, byte[] byArray2) {
        int n;
        void arg1;
        void arg0;
        sprgvk sprgvk2 = this;
        sprgvk2.cfr_renamed_10276(sprgvk2.cfr_renamed_112, (byte[])arg0, (byte[])arg1);
        sprgvk2.cfr_renamed_119[0] = 0;
        sprgvk2.cfr_renamed_119[1] = 0;
        int n2 = n = 32;
        while (n2 > 0) {
            sprgvk sprgvk3 = this;
            sprgvk3.cfr_renamed_10278();
            sprgvk3.cfr_renamed_10279(sprgvk3.cfr_renamed_10280() >>> 1);
            n2 = --n;
        }
        sprgvk sprgvk4 = this;
        sprgvk4.cfr_renamed_10278();
        sprgvk4.cfr_renamed_10280();
        this.cfr_renamed_10281();
    }

    static {
        byte[] byArray = new byte[256];
        byArray[0] = 62;
        byArray[1] = 114;
        byArray[2] = 91;
        byArray[3] = 71;
        byArray[4] = -54;
        byArray[5] = -32;
        byArray[6] = 0;
        byArray[7] = 51;
        byArray[8] = 4;
        byArray[9] = -47;
        byArray[10] = 84;
        byArray[11] = -104;
        byArray[12] = 9;
        byArray[13] = -71;
        byArray[14] = 109;
        byArray[15] = -53;
        byArray[16] = 123;
        byArray[17] = 27;
        byArray[18] = -7;
        byArray[19] = 50;
        byArray[20] = -81;
        byArray[21] = -99;
        byArray[22] = 106;
        byArray[23] = -91;
        byArray[24] = -72;
        byArray[25] = 45;
        byArray[26] = -4;
        byArray[27] = 29;
        byArray[28] = 8;
        byArray[29] = 83;
        byArray[30] = 3;
        byArray[31] = -112;
        byArray[32] = 77;
        byArray[33] = 78;
        byArray[34] = -124;
        byArray[35] = -103;
        byArray[36] = -28;
        byArray[37] = -50;
        byArray[38] = -39;
        byArray[39] = -111;
        byArray[40] = -35;
        byArray[41] = -74;
        byArray[42] = -123;
        byArray[43] = 72;
        byArray[44] = -117;
        byArray[45] = 41;
        byArray[46] = 110;
        byArray[47] = -84;
        byArray[48] = -51;
        byArray[49] = -63;
        byArray[50] = -8;
        byArray[51] = 30;
        byArray[52] = 115;
        byArray[53] = 67;
        byArray[54] = 105;
        byArray[55] = -58;
        byArray[56] = -75;
        byArray[57] = -67;
        byArray[58] = -3;
        byArray[59] = 57;
        byArray[60] = 99;
        byArray[61] = 32;
        byArray[62] = -44;
        byArray[63] = 56;
        byArray[64] = 118;
        byArray[65] = 125;
        byArray[66] = -78;
        byArray[67] = -89;
        byArray[68] = -49;
        byArray[69] = -19;
        byArray[70] = 87;
        byArray[71] = -59;
        byArray[72] = -13;
        byArray[73] = 44;
        byArray[74] = -69;
        byArray[75] = 20;
        byArray[76] = 33;
        byArray[77] = 6;
        byArray[78] = 85;
        byArray[79] = -101;
        byArray[80] = -29;
        byArray[81] = -17;
        byArray[82] = 94;
        byArray[83] = 49;
        byArray[84] = 79;
        byArray[85] = 127;
        byArray[86] = 90;
        byArray[87] = -92;
        byArray[88] = 13;
        byArray[89] = -126;
        byArray[90] = 81;
        byArray[91] = 73;
        byArray[92] = 95;
        byArray[93] = -70;
        byArray[94] = 88;
        byArray[95] = 28;
        byArray[96] = 74;
        byArray[97] = 22;
        byArray[98] = -43;
        byArray[99] = 23;
        byArray[100] = -88;
        byArray[101] = -110;
        byArray[102] = 36;
        byArray[103] = 31;
        byArray[104] = -116;
        byArray[105] = -1;
        byArray[106] = -40;
        byArray[107] = -82;
        byArray[108] = 46;
        byArray[109] = 1;
        byArray[110] = -45;
        byArray[111] = -83;
        byArray[112] = 59;
        byArray[113] = 75;
        byArray[114] = -38;
        byArray[115] = 70;
        byArray[116] = -21;
        byArray[117] = -55;
        byArray[118] = -34;
        byArray[119] = -102;
        byArray[120] = -113;
        byArray[121] = -121;
        byArray[122] = -41;
        byArray[123] = 58;
        byArray[124] = -128;
        byArray[125] = 111;
        byArray[126] = 47;
        byArray[127] = -56;
        byArray[128] = -79;
        byArray[129] = -76;
        byArray[130] = 55;
        byArray[131] = -9;
        byArray[132] = 10;
        byArray[133] = 34;
        byArray[134] = 19;
        byArray[135] = 40;
        byArray[136] = 124;
        byArray[137] = -52;
        byArray[138] = 60;
        byArray[139] = -119;
        byArray[140] = -57;
        byArray[141] = -61;
        byArray[142] = -106;
        byArray[143] = 86;
        byArray[144] = 7;
        byArray[145] = -65;
        byArray[146] = 126;
        byArray[147] = -16;
        byArray[148] = 11;
        byArray[149] = 43;
        byArray[150] = -105;
        byArray[151] = 82;
        byArray[152] = 53;
        byArray[153] = 65;
        byArray[154] = 121;
        byArray[155] = 97;
        byArray[156] = -90;
        byArray[157] = 76;
        byArray[158] = 16;
        byArray[159] = -2;
        byArray[160] = -68;
        byArray[161] = 38;
        byArray[162] = -107;
        byArray[163] = -120;
        byArray[164] = -118;
        byArray[165] = -80;
        byArray[166] = -93;
        byArray[167] = -5;
        byArray[168] = -64;
        byArray[169] = 24;
        byArray[170] = -108;
        byArray[171] = -14;
        byArray[172] = -31;
        byArray[173] = -27;
        byArray[174] = -23;
        byArray[175] = 93;
        byArray[176] = -48;
        byArray[177] = -36;
        byArray[178] = 17;
        byArray[179] = 102;
        byArray[180] = 100;
        byArray[181] = 92;
        byArray[182] = -20;
        byArray[183] = 89;
        byArray[184] = 66;
        byArray[185] = 117;
        byArray[186] = 18;
        byArray[187] = -11;
        byArray[188] = 116;
        byArray[189] = -100;
        byArray[190] = -86;
        byArray[191] = 35;
        byArray[192] = 14;
        byArray[193] = -122;
        byArray[194] = -85;
        byArray[195] = -66;
        byArray[196] = 42;
        byArray[197] = 2;
        byArray[198] = -25;
        byArray[199] = 103;
        byArray[200] = -26;
        byArray[201] = 68;
        byArray[202] = -94;
        byArray[203] = 108;
        byArray[204] = -62;
        byArray[205] = -109;
        byArray[206] = -97;
        byArray[207] = -15;
        byArray[208] = -10;
        byArray[209] = -6;
        byArray[210] = 54;
        byArray[211] = -46;
        byArray[212] = 80;
        byArray[213] = 104;
        byArray[214] = -98;
        byArray[215] = 98;
        byArray[216] = 113;
        byArray[217] = 21;
        byArray[218] = 61;
        byArray[219] = -42;
        byArray[220] = 64;
        byArray[221] = -60;
        byArray[222] = -30;
        byArray[223] = 15;
        byArray[224] = -114;
        byArray[225] = -125;
        byArray[226] = 119;
        byArray[227] = 107;
        byArray[228] = 37;
        byArray[229] = 5;
        byArray[230] = 63;
        byArray[231] = 12;
        byArray[232] = 48;
        byArray[233] = -22;
        byArray[234] = 112;
        byArray[235] = -73;
        byArray[236] = -95;
        byArray[237] = -24;
        byArray[238] = -87;
        byArray[239] = 101;
        byArray[240] = -115;
        byArray[241] = 39;
        byArray[242] = 26;
        byArray[243] = -37;
        byArray[244] = -127;
        byArray[245] = -77;
        byArray[246] = -96;
        byArray[247] = -12;
        byArray[248] = 69;
        byArray[249] = 122;
        byArray[250] = 25;
        byArray[251] = -33;
        byArray[252] = -18;
        byArray[253] = 120;
        byArray[254] = 52;
        byArray[255] = 96;
        cfr_renamed_91 = byArray;
        byte[] byArray2 = new byte[256];
        byArray2[0] = 85;
        byArray2[1] = -62;
        byArray2[2] = 99;
        byArray2[3] = 113;
        byArray2[4] = 59;
        byArray2[5] = -56;
        byArray2[6] = 71;
        byArray2[7] = -122;
        byArray2[8] = -97;
        byArray2[9] = 60;
        byArray2[10] = -38;
        byArray2[11] = 91;
        byArray2[12] = 41;
        byArray2[13] = -86;
        byArray2[14] = -3;
        byArray2[15] = 119;
        byArray2[16] = -116;
        byArray2[17] = -59;
        byArray2[18] = -108;
        byArray2[19] = 12;
        byArray2[20] = -90;
        byArray2[21] = 26;
        byArray2[22] = 19;
        byArray2[23] = 0;
        byArray2[24] = -29;
        byArray2[25] = -88;
        byArray2[26] = 22;
        byArray2[27] = 114;
        byArray2[28] = 64;
        byArray2[29] = -7;
        byArray2[30] = -8;
        byArray2[31] = 66;
        byArray2[32] = 68;
        byArray2[33] = 38;
        byArray2[34] = 104;
        byArray2[35] = -106;
        byArray2[36] = -127;
        byArray2[37] = -39;
        byArray2[38] = 69;
        byArray2[39] = 62;
        byArray2[40] = 16;
        byArray2[41] = 118;
        byArray2[42] = -58;
        byArray2[43] = -89;
        byArray2[44] = -117;
        byArray2[45] = 57;
        byArray2[46] = 67;
        byArray2[47] = -31;
        byArray2[48] = 58;
        byArray2[49] = -75;
        byArray2[50] = 86;
        byArray2[51] = 42;
        byArray2[52] = -64;
        byArray2[53] = 109;
        byArray2[54] = -77;
        byArray2[55] = 5;
        byArray2[56] = 34;
        byArray2[57] = 102;
        byArray2[58] = -65;
        byArray2[59] = -36;
        byArray2[60] = 11;
        byArray2[61] = -6;
        byArray2[62] = 98;
        byArray2[63] = 72;
        byArray2[64] = -35;
        byArray2[65] = 32;
        byArray2[66] = 17;
        byArray2[67] = 6;
        byArray2[68] = 54;
        byArray2[69] = -55;
        byArray2[70] = -63;
        byArray2[71] = -49;
        byArray2[72] = -10;
        byArray2[73] = 39;
        byArray2[74] = 82;
        byArray2[75] = -69;
        byArray2[76] = 105;
        byArray2[77] = -11;
        byArray2[78] = -44;
        byArray2[79] = -121;
        byArray2[80] = 127;
        byArray2[81] = -124;
        byArray2[82] = 76;
        byArray2[83] = -46;
        byArray2[84] = -100;
        byArray2[85] = 87;
        byArray2[86] = -92;
        byArray2[87] = -68;
        byArray2[88] = 79;
        byArray2[89] = -102;
        byArray2[90] = -33;
        byArray2[91] = -2;
        byArray2[92] = -42;
        byArray2[93] = -115;
        byArray2[94] = 122;
        byArray2[95] = -21;
        byArray2[96] = 43;
        byArray2[97] = 83;
        byArray2[98] = -40;
        byArray2[99] = 92;
        byArray2[100] = -95;
        byArray2[101] = 20;
        byArray2[102] = 23;
        byArray2[103] = -5;
        byArray2[104] = 35;
        byArray2[105] = -43;
        byArray2[106] = 125;
        byArray2[107] = 48;
        byArray2[108] = 103;
        byArray2[109] = 115;
        byArray2[110] = 8;
        byArray2[111] = 9;
        byArray2[112] = -18;
        byArray2[113] = -73;
        byArray2[114] = 112;
        byArray2[115] = 63;
        byArray2[116] = 97;
        byArray2[117] = -78;
        byArray2[118] = 25;
        byArray2[119] = -114;
        byArray2[120] = 78;
        byArray2[121] = -27;
        byArray2[122] = 75;
        byArray2[123] = -109;
        byArray2[124] = -113;
        byArray2[125] = 93;
        byArray2[126] = -37;
        byArray2[127] = -87;
        byArray2[128] = -83;
        byArray2[129] = -15;
        byArray2[130] = -82;
        byArray2[131] = 46;
        byArray2[132] = -53;
        byArray2[133] = 13;
        byArray2[134] = -4;
        byArray2[135] = -12;
        byArray2[136] = 45;
        byArray2[137] = 70;
        byArray2[138] = 110;
        byArray2[139] = 29;
        byArray2[140] = -105;
        byArray2[141] = -24;
        byArray2[142] = -47;
        byArray2[143] = -23;
        byArray2[144] = 77;
        byArray2[145] = 55;
        byArray2[146] = -91;
        byArray2[147] = 117;
        byArray2[148] = 94;
        byArray2[149] = -125;
        byArray2[150] = -98;
        byArray2[151] = -85;
        byArray2[152] = -126;
        byArray2[153] = -99;
        byArray2[154] = -71;
        byArray2[155] = 28;
        byArray2[156] = -32;
        byArray2[157] = -51;
        byArray2[158] = 73;
        byArray2[159] = -119;
        byArray2[160] = 1;
        byArray2[161] = -74;
        byArray2[162] = -67;
        byArray2[163] = 88;
        byArray2[164] = 36;
        byArray2[165] = -94;
        byArray2[166] = 95;
        byArray2[167] = 56;
        byArray2[168] = 120;
        byArray2[169] = -103;
        byArray2[170] = 21;
        byArray2[171] = -112;
        byArray2[172] = 80;
        byArray2[173] = -72;
        byArray2[174] = -107;
        byArray2[175] = -28;
        byArray2[176] = -48;
        byArray2[177] = -111;
        byArray2[178] = -57;
        byArray2[179] = -50;
        byArray2[180] = -19;
        byArray2[181] = 15;
        byArray2[182] = -76;
        byArray2[183] = 111;
        byArray2[184] = -96;
        byArray2[185] = -52;
        byArray2[186] = -16;
        byArray2[187] = 2;
        byArray2[188] = 74;
        byArray2[189] = 121;
        byArray2[190] = -61;
        byArray2[191] = -34;
        byArray2[192] = -93;
        byArray2[193] = -17;
        byArray2[194] = -22;
        byArray2[195] = 81;
        byArray2[196] = -26;
        byArray2[197] = 107;
        byArray2[198] = 24;
        byArray2[199] = -20;
        byArray2[200] = 27;
        byArray2[201] = 44;
        byArray2[202] = -128;
        byArray2[203] = -9;
        byArray2[204] = 116;
        byArray2[205] = -25;
        byArray2[206] = -1;
        byArray2[207] = 33;
        byArray2[208] = 90;
        byArray2[209] = 106;
        byArray2[210] = 84;
        byArray2[211] = 30;
        byArray2[212] = 65;
        byArray2[213] = 49;
        byArray2[214] = -110;
        byArray2[215] = 53;
        byArray2[216] = -60;
        byArray2[217] = 51;
        byArray2[218] = 7;
        byArray2[219] = 10;
        byArray2[220] = -70;
        byArray2[221] = 126;
        byArray2[222] = 14;
        byArray2[223] = 52;
        byArray2[224] = -120;
        byArray2[225] = -79;
        byArray2[226] = -104;
        byArray2[227] = 124;
        byArray2[228] = -13;
        byArray2[229] = 61;
        byArray2[230] = 96;
        byArray2[231] = 108;
        byArray2[232] = 123;
        byArray2[233] = -54;
        byArray2[234] = -45;
        byArray2[235] = 31;
        byArray2[236] = 50;
        byArray2[237] = 101;
        byArray2[238] = 4;
        byArray2[239] = 40;
        byArray2[240] = 100;
        byArray2[241] = -66;
        byArray2[242] = -123;
        byArray2[243] = -101;
        byArray2[244] = 47;
        byArray2[245] = 89;
        byArray2[246] = -118;
        byArray2[247] = -41;
        byArray2[248] = -80;
        byArray2[249] = 37;
        byArray2[250] = -84;
        byArray2[251] = -81;
        byArray2[252] = 18;
        byArray2[253] = 3;
        byArray2[254] = -30;
        byArray2[255] = -14;
        cfr_renamed_86 = byArray2;
        short[] sArray = new short[16];
        sArray[0] = 17623;
        sArray[1] = 9916;
        sArray[2] = 25195;
        sArray[3] = 4958;
        sArray[4] = 22409;
        sArray[5] = 13794;
        sArray[6] = 28981;
        sArray[7] = 2479;
        sArray[8] = 19832;
        sArray[9] = 12051;
        sArray[10] = 27588;
        sArray[11] = 6897;
        sArray[12] = 24102;
        sArray[13] = 15437;
        sArray[14] = 30874;
        sArray[15] = 18348;
        cfr_renamed_3 = sArray;
    }

    public void cfr_renamed_10276(int[] arg0, byte[] arg1, byte[] arg2) {
        if (arg1 == null || arg1.length != 16) {
            throw new IllegalArgumentException(sprzgg.cfr_renamed_9("!\u0014\u000bQ\u0019\u0014\u000fR@\u0005V\u0014\u0002M\u0014Q\u0013\u0014\tG@Z\u0005Q\u0004Q\u0004"));
        }
        if (arg2 == null || arg2.length != 16) {
            throw new IllegalArgumentException(sprawc.cfr_renamed_9("@M!jW\u0003nE!\u00127\u0003cZuFr\u0003hP!MdFeFe"));
        }
        sprgvk sprgvk2 = this;
        sprgvk2.cfr_renamed_112[0] = sprgvk.cfr_renamed_10282(arg1[0], cfr_renamed_3[0], arg2[0]);
        sprgvk2.cfr_renamed_112[1] = sprgvk.cfr_renamed_10282(arg1[1], cfr_renamed_3[1], arg2[1]);
        sprgvk2.cfr_renamed_112[2] = sprgvk.cfr_renamed_10282(arg1[2], cfr_renamed_3[2], arg2[2]);
        sprgvk2.cfr_renamed_112[3] = sprgvk.cfr_renamed_10282(arg1[3], cfr_renamed_3[3], arg2[3]);
        sprgvk2.cfr_renamed_112[4] = sprgvk.cfr_renamed_10282(arg1[4], cfr_renamed_3[4], arg2[4]);
        sprgvk2.cfr_renamed_112[5] = sprgvk.cfr_renamed_10282(arg1[5], cfr_renamed_3[5], arg2[5]);
        sprgvk2.cfr_renamed_112[6] = sprgvk.cfr_renamed_10282(arg1[6], cfr_renamed_3[6], arg2[6]);
        sprgvk2.cfr_renamed_112[7] = sprgvk.cfr_renamed_10282(arg1[7], cfr_renamed_3[7], arg2[7]);
        sprgvk2.cfr_renamed_112[8] = sprgvk.cfr_renamed_10282(arg1[8], cfr_renamed_3[8], arg2[8]);
        sprgvk2.cfr_renamed_112[9] = sprgvk.cfr_renamed_10282(arg1[9], cfr_renamed_3[9], arg2[9]);
        sprgvk2.cfr_renamed_112[10] = sprgvk.cfr_renamed_10282(arg1[10], cfr_renamed_3[10], arg2[10]);
        sprgvk2.cfr_renamed_112[11] = sprgvk.cfr_renamed_10282(arg1[11], cfr_renamed_3[11], arg2[11]);
        sprgvk2.cfr_renamed_112[12] = sprgvk.cfr_renamed_10282(arg1[12], cfr_renamed_3[12], arg2[12]);
        sprgvk2.cfr_renamed_112[13] = sprgvk.cfr_renamed_10282(arg1[13], cfr_renamed_3[13], arg2[13]);
        sprgvk2.cfr_renamed_112[14] = sprgvk.cfr_renamed_10282(arg1[14], cfr_renamed_3[14], arg2[14]);
        sprgvk2.cfr_renamed_112[15] = sprgvk.cfr_renamed_10282(arg1[15], cfr_renamed_3[15], arg2[15]);
    }

    @Override
    public void cfr_renamed_41() {
        if (this.cfr_renamed_152 != null) {
            sprgvk sprgvk2 = this;
            sprgvk2.cfr_renamed_5183(sprgvk2.cfr_renamed_152);
        }
    }

    public int cfr_renamed_10275() {
        return 2047;
    }

    public static int cfr_renamed_10283(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> 32 - arg1;
    }

    public int cfr_renamed_10284() {
        if (this.cfr_renamed_4++ >= this.cfr_renamed_10275()) {
            throw new IllegalStateException(sprzgg.cfr_renamed_9("4[\u000f\u0014\rA\u0003\\@P\u0001@\u0001\u0014\u0010F\u000fW\u0005G\u0013Q\u0004\u0014\u0002M@G\tZ\u0007X\u0005\u007f\u0005MO}6"));
        }
        sprgvk sprgvk2 = this;
        sprgvk2.cfr_renamed_10278();
        int n = sprgvk2.cfr_renamed_10280() ^ this.cfr_renamed_2[3];
        sprgvk2.cfr_renamed_10281();
        return n;
    }

    private /* synthetic */ void cfr_renamed_10279(int arg0) {
        sprgvk sprgvk2 = this;
        int n = sprgvk2.cfr_renamed_112[0];
        int n2 = sprgvk.cfr_renamed_10285(sprgvk2.cfr_renamed_112[0], 8);
        n = sprgvk2.cfr_renamed_10286(n, n2);
        n2 = sprgvk.cfr_renamed_10285(sprgvk2.cfr_renamed_112[4], 20);
        n = sprgvk2.cfr_renamed_10286(n, n2);
        n2 = sprgvk.cfr_renamed_10285(sprgvk2.cfr_renamed_112[10], 21);
        n = sprgvk2.cfr_renamed_10286(n, n2);
        n2 = sprgvk.cfr_renamed_10285(sprgvk2.cfr_renamed_112[13], 17);
        n = sprgvk2.cfr_renamed_10286(n, n2);
        n2 = sprgvk.cfr_renamed_10285(sprgvk2.cfr_renamed_112[15], 15);
        n = sprgvk2.cfr_renamed_10286(n, n2);
        n = sprgvk2.cfr_renamed_10286(n, arg0);
        sprgvk2.cfr_renamed_112[0] = this.cfr_renamed_112[1];
        sprgvk2.cfr_renamed_112[1] = this.cfr_renamed_112[2];
        sprgvk2.cfr_renamed_112[2] = this.cfr_renamed_112[3];
        sprgvk2.cfr_renamed_112[3] = this.cfr_renamed_112[4];
        sprgvk2.cfr_renamed_112[4] = this.cfr_renamed_112[5];
        sprgvk2.cfr_renamed_112[5] = this.cfr_renamed_112[6];
        sprgvk2.cfr_renamed_112[6] = this.cfr_renamed_112[7];
        sprgvk2.cfr_renamed_112[7] = this.cfr_renamed_112[8];
        sprgvk2.cfr_renamed_112[8] = this.cfr_renamed_112[9];
        sprgvk2.cfr_renamed_112[9] = this.cfr_renamed_112[10];
        sprgvk2.cfr_renamed_112[10] = this.cfr_renamed_112[11];
        sprgvk2.cfr_renamed_112[11] = this.cfr_renamed_112[12];
        sprgvk2.cfr_renamed_112[12] = this.cfr_renamed_112[13];
        sprgvk2.cfr_renamed_112[13] = this.cfr_renamed_112[14];
        sprgvk2.cfr_renamed_112[14] = this.cfr_renamed_112[15];
        sprgvk2.cfr_renamed_112[15] = n;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        if (this.cfr_renamed_152 == null) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprawc.cfr_renamed_9("\u0003oLu\u0003hMhWhBmJrFe")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprzgg.cfr_renamed_9("]\u000eD\u0015@@V\u0015R\u0006Q\u0012\u0014\u0014[\u000f\u0014\u0013\\\u000fF\u0014"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(sprawc.cfr_renamed_9("nVuStW!AtEgFs\u0003uLn\u0003rKnQu"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = n + arg4;
            byte by = this.cfr_renamed_3243(arg0[n + arg1]);
            arg3[n3] = by;
            n2 = ++n;
        }
        return arg2;
    }

    private static /* synthetic */ int cfr_renamed_10285(int arg0, int arg1) {
        return (arg0 << arg1 | arg0 >>> 31 - arg1) & Integer.MAX_VALUE;
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprgvk sprgvk2 = (sprgvk)arg0;
        System.arraycopy(sprgvk2.cfr_renamed_112, 0, this.cfr_renamed_112, 0, this.cfr_renamed_112.length);
        System.arraycopy(sprgvk2.cfr_renamed_119, 0, this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
        System.arraycopy(sprgvk2.cfr_renamed_2, 0, this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
        System.arraycopy(sprgvk2.cfr_renamed_0, 0, this.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        sprgvk sprgvk3 = this;
        sprgvk sprgvk4 = sprgvk2;
        this.cfr_renamed_1 = sprgvk4.cfr_renamed_1;
        sprgvk3.cfr_renamed_4 = sprgvk4.cfr_renamed_4;
        sprgvk3.cfr_renamed_152 = sprgvk2;
    }

    private /* synthetic */ void cfr_renamed_10278() {
        sprgvk sprgvk2 = this;
        sprgvk2.cfr_renamed_2[0] = (this.cfr_renamed_112[15] & 0x7FFF8000) << 1 | this.cfr_renamed_112[14] & 0xFFFF;
        sprgvk sprgvk3 = this;
        sprgvk2.cfr_renamed_2[1] = (sprgvk3.cfr_renamed_112[11] & 0xFFFF) << 16 | this.cfr_renamed_112[9] >>> 15;
        sprgvk3.cfr_renamed_2[2] = (this.cfr_renamed_112[7] & 0xFFFF) << 16 | this.cfr_renamed_112[5] >>> 15;
        sprgvk2.cfr_renamed_2[3] = (this.cfr_renamed_112[2] & 0xFFFF) << 16 | this.cfr_renamed_112[0] >>> 15;
    }

    private static /* synthetic */ int cfr_renamed_10287(int arg0) {
        int n = arg0;
        return n ^ sprgvk.cfr_renamed_10283(n, 2) ^ sprgvk.cfr_renamed_10283(arg0, 10) ^ sprgvk.cfr_renamed_10283(arg0, 18) ^ sprgvk.cfr_renamed_10283(arg0, 24);
    }

    public int cfr_renamed_10280() {
        sprgvk sprgvk2 = this;
        sprgvk sprgvk3 = this;
        int n = (sprgvk2.cfr_renamed_2[0] ^ sprgvk3.cfr_renamed_119[0]) + this.cfr_renamed_119[1];
        int n2 = sprgvk2.cfr_renamed_119[0] + this.cfr_renamed_2[1];
        int n3 = sprgvk3.cfr_renamed_119[1] ^ this.cfr_renamed_2[2];
        int n4 = sprgvk.cfr_renamed_10287(n2 << 16 | n3 >>> 16);
        int n5 = sprgvk.cfr_renamed_10288(n3 << 16 | n2 >>> 16);
        sprgvk2.cfr_renamed_119[0] = sprgvk.cfr_renamed_10289(cfr_renamed_91[n4 >>> 24], cfr_renamed_86[n4 >>> 16 & 0xFF], cfr_renamed_91[n4 >>> 8 & 0xFF], cfr_renamed_86[n4 & 0xFF]);
        sprgvk2.cfr_renamed_119[1] = sprgvk.cfr_renamed_10289(cfr_renamed_91[n5 >>> 24], cfr_renamed_86[n5 >>> 16 & 0xFF], cfr_renamed_91[n5 >>> 8 & 0xFF], cfr_renamed_86[n5 & 0xFF]);
        return n;
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        if (this.cfr_renamed_1 == 0) {
            this.cfr_renamed_10290();
        }
        sprgvk sprgvk2 = this;
        byte by = (byte)(this.cfr_renamed_0[sprgvk2.cfr_renamed_1] ^ arg0);
        this.cfr_renamed_1 = (sprgvk2.cfr_renamed_1 + 1) % 4;
        return by;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprzgg.cfr_renamed_9(":A\u0003\u0019Q\u0006X");
    }

    private static /* synthetic */ int cfr_renamed_10282(byte arg0, short arg1, byte arg2) {
        return (arg0 & 0xFF) << 23 | (arg1 & 0xFFFF) << 8 | arg2 & 0xFF;
    }

    private /* synthetic */ void cfr_renamed_10290() {
        sprgvk.cfr_renamed_10108(this.cfr_renamed_10284(), this.cfr_renamed_0, 0);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_10108(int n, byte[] byArray, int n2) {
        int arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2] = (byte)(arg0 >> 24);
        arg1[v1 + true] = (byte)(arg0 >> 16);
        v0[v1 + 2] = (byte)(arg0 >> 8);
        v0[n2 + 3] = (byte)arg0;
    }

    private /* synthetic */ int cfr_renamed_10286(int arg0, int arg1) {
        int n = arg0 + arg1;
        return (n & Integer.MAX_VALUE) + (n >>> 31);
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprgvk(this);
    }

    private static /* synthetic */ int cfr_renamed_10289(byte arg0, byte arg1, byte arg2, byte arg3) {
        return (arg0 & 0xFF) << 24 | (arg1 & 0xFF) << 16 | (arg2 & 0xFF) << 8 | arg3 & 0xFF;
    }

    private /* synthetic */ void cfr_renamed_10281() {
        sprgvk sprgvk2 = this;
        int n = sprgvk2.cfr_renamed_112[0];
        int n2 = sprgvk.cfr_renamed_10285(sprgvk2.cfr_renamed_112[0], 8);
        n = sprgvk2.cfr_renamed_10286(n, n2);
        n2 = sprgvk.cfr_renamed_10285(sprgvk2.cfr_renamed_112[4], 20);
        n = sprgvk2.cfr_renamed_10286(n, n2);
        n2 = sprgvk.cfr_renamed_10285(sprgvk2.cfr_renamed_112[10], 21);
        n = sprgvk2.cfr_renamed_10286(n, n2);
        n2 = sprgvk.cfr_renamed_10285(sprgvk2.cfr_renamed_112[13], 17);
        n = sprgvk2.cfr_renamed_10286(n, n2);
        n2 = sprgvk.cfr_renamed_10285(sprgvk2.cfr_renamed_112[15], 15);
        n = sprgvk2.cfr_renamed_10286(n, n2);
        sprgvk2.cfr_renamed_112[0] = this.cfr_renamed_112[1];
        sprgvk2.cfr_renamed_112[1] = this.cfr_renamed_112[2];
        sprgvk2.cfr_renamed_112[2] = this.cfr_renamed_112[3];
        sprgvk2.cfr_renamed_112[3] = this.cfr_renamed_112[4];
        sprgvk2.cfr_renamed_112[4] = this.cfr_renamed_112[5];
        sprgvk2.cfr_renamed_112[5] = this.cfr_renamed_112[6];
        sprgvk2.cfr_renamed_112[6] = this.cfr_renamed_112[7];
        sprgvk2.cfr_renamed_112[7] = this.cfr_renamed_112[8];
        sprgvk2.cfr_renamed_112[8] = this.cfr_renamed_112[9];
        sprgvk2.cfr_renamed_112[9] = this.cfr_renamed_112[10];
        sprgvk2.cfr_renamed_112[10] = this.cfr_renamed_112[11];
        sprgvk2.cfr_renamed_112[11] = this.cfr_renamed_112[12];
        sprgvk2.cfr_renamed_112[12] = this.cfr_renamed_112[13];
        sprgvk2.cfr_renamed_112[13] = this.cfr_renamed_112[14];
        sprgvk2.cfr_renamed_112[14] = this.cfr_renamed_112[15];
        sprgvk2.cfr_renamed_112[15] = n;
    }

    private static /* synthetic */ int cfr_renamed_10288(int arg0) {
        int n = arg0;
        return n ^ sprgvk.cfr_renamed_10283(n, 8) ^ sprgvk.cfr_renamed_10283(arg0, 14) ^ sprgvk.cfr_renamed_10283(arg0, 22) ^ sprgvk.cfr_renamed_10283(arg0, 30);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprbj sprbj2;
        sprbj sprbj3 = arg1;
        byte[] byArray = null;
        byte[] byArray2 = null;
        if (sprbj3 instanceof sprkpk) {
            sprbj2 = (sprkpk)sprbj3;
            byArray2 = sprbj2.cfr_renamed_1205();
            sprbj3 = sprbj2.cfr_renamed_284();
        }
        if (sprbj3 instanceof sprtpk) {
            sprbj2 = (sprtpk)sprbj3;
            byArray = ((sprtpk)sprbj2).cfr_renamed_1521();
        }
        sprgvk sprgvk2 = this;
        sprgvk2.cfr_renamed_1 = 0;
        sprgvk2.cfr_renamed_4 = 0;
        this.cfr_renamed_10277(byArray, byArray2);
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), byArray.length * 8, arg1, arg0 ? spriil.cfr_renamed_3 : spriil.cfr_renamed_152));
        this.cfr_renamed_152 = (sprgvk)this.cfr_renamed_461();
    }

    public sprgvk(sprgvk sprgvk2) {
        sprgvk sprgvk3 = this;
        this.cfr_renamed_112 = new int[16];
        sprgvk3.cfr_renamed_119 = new int[2];
        sprgvk3.cfr_renamed_2 = new int[4];
        this.cfr_renamed_0 = new byte[4];
        this.cfr_renamed_5183(sprgvk2);
    }

    public sprgvk() {
        sprgvk sprgvk2 = this;
        sprgvk sprgvk3 = this;
        sprgvk3.cfr_renamed_112 = new int[16];
        sprgvk3.cfr_renamed_119 = new int[2];
        sprgvk2.cfr_renamed_2 = new int[4];
        sprgvk2.cfr_renamed_0 = new byte[4];
    }
}

