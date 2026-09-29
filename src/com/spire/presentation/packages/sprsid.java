/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sproxfa;
import com.spire.presentation.packages.sprriq;
import com.spire.presentation.packages.sprt;

public class sprsid
implements sprff {
    private int cfr_renamed_107;
    private static final byte[] cfr_renamed_132;
    private static final byte[] cfr_renamed_102;
    private static final int cfr_renamed_93 = 0x7F7F7F7F;
    private int[][] cfr_renamed_86 = null;
    private static final int cfr_renamed_152 = 16;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private static final int[] cfr_renamed_91;
    private int cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    private static final int cfr_renamed_3 = -2139062144;
    private static final int cfr_renamed_4 = 27;

    @Override
    public String cfr_renamed_1315() {
        return sprriq.cfr_renamed_9("Os]");
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg1 instanceof sprnld) {
            this.cfr_renamed_86 = this.cfr_renamed_3728(((sprnld)arg1).cfr_renamed_1521(), arg0);
            this.cfr_renamed_1 = arg0;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sproxfa.cfr_renamed_9("\u000em\u0011b\u000bj\u0003#\u0017b\u0015b\nf\u0013f\u0015#\u0017b\u0014p\u0002gGw\b#&F4#\u000em\u000ewG.G")).append(arg1.getClass().getName()).toString());
    }

    @Override
    public void cfr_renamed_41() {
    }

    private /* synthetic */ void cfr_renamed_3622(byte[] arg0, int arg1) {
        int n = arg1;
        sprsid sprsid2 = this;
        sprsid sprsid3 = this;
        sprsid sprsid4 = this;
        sprsid sprsid5 = this;
        sprsid sprsid6 = this;
        int n2 = arg0[n] & 0xFF;
        sprsid6.cfr_renamed_0 = n2;
        int n3 = arg0[++n] & 0xFF;
        sprsid6.cfr_renamed_0 |= n3 << 8;
        int n4 = arg0[++n] & 0xFF;
        sprsid6.cfr_renamed_0 |= n4 << 16;
        int n5 = arg0[++n] << 24;
        sprsid5.cfr_renamed_0 |= n5;
        int n6 = arg0[++n] & 0xFF;
        this.cfr_renamed_112 = n6;
        int n7 = arg0[++n] & 0xFF;
        sprsid5.cfr_renamed_112 |= n7 << 8;
        int n8 = arg0[++n] & 0xFF;
        this.cfr_renamed_112 |= n8 << 16;
        int n9 = arg0[++n] << 24;
        sprsid4.cfr_renamed_112 |= n9;
        int n10 = arg0[++n] & 0xFF;
        this.cfr_renamed_119 = n10;
        int n11 = arg0[++n] & 0xFF;
        sprsid4.cfr_renamed_119 |= n11 << 8;
        int n12 = arg0[++n] & 0xFF;
        this.cfr_renamed_119 |= n12 << 16;
        int n13 = arg0[++n] << 24;
        sprsid3.cfr_renamed_119 |= n13;
        int n14 = arg0[++n] & 0xFF;
        sprsid2.cfr_renamed_107 = n14;
        int n15 = arg0[++n] & 0xFF;
        sprsid3.cfr_renamed_107 |= n15 << 8;
        int n16 = arg0[++n] & 0xFF;
        sprsid2.cfr_renamed_107 |= n16 << 16;
        int n17 = arg0[++n] << 24;
        ++n;
        sprsid2.cfr_renamed_107 |= n17;
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    private static /* synthetic */ int cfr_renamed_3729(int arg0) {
        return (arg0 & 0x7F7F7F7F) << 1 ^ ((arg0 & 0x80808080) >>> 7) * 27;
    }

    private /* synthetic */ void cfr_renamed_3631(byte[] arg0, int arg1) {
        int n = arg1;
        byte[] byArray = arg0;
        byte[] byArray2 = arg0;
        byArray[n++] = (byte)this.cfr_renamed_0;
        byArray2[n++] = (byte)(this.cfr_renamed_0 >> 8);
        byArray[n++] = (byte)(this.cfr_renamed_0 >> 16);
        byArray2[n++] = (byte)(this.cfr_renamed_0 >> 24);
        byArray[n++] = (byte)this.cfr_renamed_112;
        byArray2[n++] = (byte)(this.cfr_renamed_112 >> 8);
        byArray[n++] = (byte)(this.cfr_renamed_112 >> 16);
        byArray2[n++] = (byte)(this.cfr_renamed_112 >> 24);
        byArray[n++] = (byte)this.cfr_renamed_119;
        byArray2[n++] = (byte)(this.cfr_renamed_119 >> 8);
        byArray[n++] = (byte)(this.cfr_renamed_119 >> 16);
        byArray2[n++] = (byte)(this.cfr_renamed_119 >> 24);
        byArray[n++] = (byte)this.cfr_renamed_107;
        byArray2[n++] = (byte)(this.cfr_renamed_107 >> 8);
        byArray[n++] = (byte)(this.cfr_renamed_107 >> 16);
        byArray2[n++] = (byte)(this.cfr_renamed_107 >> 24);
    }

    static {
        byte[] byArray = new byte[256];
        byArray[0] = 99;
        byArray[1] = 124;
        byArray[2] = 119;
        byArray[3] = 123;
        byArray[4] = -14;
        byArray[5] = 107;
        byArray[6] = 111;
        byArray[7] = -59;
        byArray[8] = 48;
        byArray[9] = 1;
        byArray[10] = 103;
        byArray[11] = 43;
        byArray[12] = -2;
        byArray[13] = -41;
        byArray[14] = -85;
        byArray[15] = 118;
        byArray[16] = -54;
        byArray[17] = -126;
        byArray[18] = -55;
        byArray[19] = 125;
        byArray[20] = -6;
        byArray[21] = 89;
        byArray[22] = 71;
        byArray[23] = -16;
        byArray[24] = -83;
        byArray[25] = -44;
        byArray[26] = -94;
        byArray[27] = -81;
        byArray[28] = -100;
        byArray[29] = -92;
        byArray[30] = 114;
        byArray[31] = -64;
        byArray[32] = -73;
        byArray[33] = -3;
        byArray[34] = -109;
        byArray[35] = 38;
        byArray[36] = 54;
        byArray[37] = 63;
        byArray[38] = -9;
        byArray[39] = -52;
        byArray[40] = 52;
        byArray[41] = -91;
        byArray[42] = -27;
        byArray[43] = -15;
        byArray[44] = 113;
        byArray[45] = -40;
        byArray[46] = 49;
        byArray[47] = 21;
        byArray[48] = 4;
        byArray[49] = -57;
        byArray[50] = 35;
        byArray[51] = -61;
        byArray[52] = 24;
        byArray[53] = -106;
        byArray[54] = 5;
        byArray[55] = -102;
        byArray[56] = 7;
        byArray[57] = 18;
        byArray[58] = -128;
        byArray[59] = -30;
        byArray[60] = -21;
        byArray[61] = 39;
        byArray[62] = -78;
        byArray[63] = 117;
        byArray[64] = 9;
        byArray[65] = -125;
        byArray[66] = 44;
        byArray[67] = 26;
        byArray[68] = 27;
        byArray[69] = 110;
        byArray[70] = 90;
        byArray[71] = -96;
        byArray[72] = 82;
        byArray[73] = 59;
        byArray[74] = -42;
        byArray[75] = -77;
        byArray[76] = 41;
        byArray[77] = -29;
        byArray[78] = 47;
        byArray[79] = -124;
        byArray[80] = 83;
        byArray[81] = -47;
        byArray[82] = 0;
        byArray[83] = -19;
        byArray[84] = 32;
        byArray[85] = -4;
        byArray[86] = -79;
        byArray[87] = 91;
        byArray[88] = 106;
        byArray[89] = -53;
        byArray[90] = -66;
        byArray[91] = 57;
        byArray[92] = 74;
        byArray[93] = 76;
        byArray[94] = 88;
        byArray[95] = -49;
        byArray[96] = -48;
        byArray[97] = -17;
        byArray[98] = -86;
        byArray[99] = -5;
        byArray[100] = 67;
        byArray[101] = 77;
        byArray[102] = 51;
        byArray[103] = -123;
        byArray[104] = 69;
        byArray[105] = -7;
        byArray[106] = 2;
        byArray[107] = 127;
        byArray[108] = 80;
        byArray[109] = 60;
        byArray[110] = -97;
        byArray[111] = -88;
        byArray[112] = 81;
        byArray[113] = -93;
        byArray[114] = 64;
        byArray[115] = -113;
        byArray[116] = -110;
        byArray[117] = -99;
        byArray[118] = 56;
        byArray[119] = -11;
        byArray[120] = -68;
        byArray[121] = -74;
        byArray[122] = -38;
        byArray[123] = 33;
        byArray[124] = 16;
        byArray[125] = -1;
        byArray[126] = -13;
        byArray[127] = -46;
        byArray[128] = -51;
        byArray[129] = 12;
        byArray[130] = 19;
        byArray[131] = -20;
        byArray[132] = 95;
        byArray[133] = -105;
        byArray[134] = 68;
        byArray[135] = 23;
        byArray[136] = -60;
        byArray[137] = -89;
        byArray[138] = 126;
        byArray[139] = 61;
        byArray[140] = 100;
        byArray[141] = 93;
        byArray[142] = 25;
        byArray[143] = 115;
        byArray[144] = 96;
        byArray[145] = -127;
        byArray[146] = 79;
        byArray[147] = -36;
        byArray[148] = 34;
        byArray[149] = 42;
        byArray[150] = -112;
        byArray[151] = -120;
        byArray[152] = 70;
        byArray[153] = -18;
        byArray[154] = -72;
        byArray[155] = 20;
        byArray[156] = -34;
        byArray[157] = 94;
        byArray[158] = 11;
        byArray[159] = -37;
        byArray[160] = -32;
        byArray[161] = 50;
        byArray[162] = 58;
        byArray[163] = 10;
        byArray[164] = 73;
        byArray[165] = 6;
        byArray[166] = 36;
        byArray[167] = 92;
        byArray[168] = -62;
        byArray[169] = -45;
        byArray[170] = -84;
        byArray[171] = 98;
        byArray[172] = -111;
        byArray[173] = -107;
        byArray[174] = -28;
        byArray[175] = 121;
        byArray[176] = -25;
        byArray[177] = -56;
        byArray[178] = 55;
        byArray[179] = 109;
        byArray[180] = -115;
        byArray[181] = -43;
        byArray[182] = 78;
        byArray[183] = -87;
        byArray[184] = 108;
        byArray[185] = 86;
        byArray[186] = -12;
        byArray[187] = -22;
        byArray[188] = 101;
        byArray[189] = 122;
        byArray[190] = -82;
        byArray[191] = 8;
        byArray[192] = -70;
        byArray[193] = 120;
        byArray[194] = 37;
        byArray[195] = 46;
        byArray[196] = 28;
        byArray[197] = -90;
        byArray[198] = -76;
        byArray[199] = -58;
        byArray[200] = -24;
        byArray[201] = -35;
        byArray[202] = 116;
        byArray[203] = 31;
        byArray[204] = 75;
        byArray[205] = -67;
        byArray[206] = -117;
        byArray[207] = -118;
        byArray[208] = 112;
        byArray[209] = 62;
        byArray[210] = -75;
        byArray[211] = 102;
        byArray[212] = 72;
        byArray[213] = 3;
        byArray[214] = -10;
        byArray[215] = 14;
        byArray[216] = 97;
        byArray[217] = 53;
        byArray[218] = 87;
        byArray[219] = -71;
        byArray[220] = -122;
        byArray[221] = -63;
        byArray[222] = 29;
        byArray[223] = -98;
        byArray[224] = -31;
        byArray[225] = -8;
        byArray[226] = -104;
        byArray[227] = 17;
        byArray[228] = 105;
        byArray[229] = -39;
        byArray[230] = -114;
        byArray[231] = -108;
        byArray[232] = -101;
        byArray[233] = 30;
        byArray[234] = -121;
        byArray[235] = -23;
        byArray[236] = -50;
        byArray[237] = 85;
        byArray[238] = 40;
        byArray[239] = -33;
        byArray[240] = -116;
        byArray[241] = -95;
        byArray[242] = -119;
        byArray[243] = 13;
        byArray[244] = -65;
        byArray[245] = -26;
        byArray[246] = 66;
        byArray[247] = 104;
        byArray[248] = 65;
        byArray[249] = -103;
        byArray[250] = 45;
        byArray[251] = 15;
        byArray[252] = -80;
        byArray[253] = 84;
        byArray[254] = -69;
        byArray[255] = 22;
        cfr_renamed_102 = byArray;
        byte[] byArray2 = new byte[256];
        byArray2[0] = 82;
        byArray2[1] = 9;
        byArray2[2] = 106;
        byArray2[3] = -43;
        byArray2[4] = 48;
        byArray2[5] = 54;
        byArray2[6] = -91;
        byArray2[7] = 56;
        byArray2[8] = -65;
        byArray2[9] = 64;
        byArray2[10] = -93;
        byArray2[11] = -98;
        byArray2[12] = -127;
        byArray2[13] = -13;
        byArray2[14] = -41;
        byArray2[15] = -5;
        byArray2[16] = 124;
        byArray2[17] = -29;
        byArray2[18] = 57;
        byArray2[19] = -126;
        byArray2[20] = -101;
        byArray2[21] = 47;
        byArray2[22] = -1;
        byArray2[23] = -121;
        byArray2[24] = 52;
        byArray2[25] = -114;
        byArray2[26] = 67;
        byArray2[27] = 68;
        byArray2[28] = -60;
        byArray2[29] = -34;
        byArray2[30] = -23;
        byArray2[31] = -53;
        byArray2[32] = 84;
        byArray2[33] = 123;
        byArray2[34] = -108;
        byArray2[35] = 50;
        byArray2[36] = -90;
        byArray2[37] = -62;
        byArray2[38] = 35;
        byArray2[39] = 61;
        byArray2[40] = -18;
        byArray2[41] = 76;
        byArray2[42] = -107;
        byArray2[43] = 11;
        byArray2[44] = 66;
        byArray2[45] = -6;
        byArray2[46] = -61;
        byArray2[47] = 78;
        byArray2[48] = 8;
        byArray2[49] = 46;
        byArray2[50] = -95;
        byArray2[51] = 102;
        byArray2[52] = 40;
        byArray2[53] = -39;
        byArray2[54] = 36;
        byArray2[55] = -78;
        byArray2[56] = 118;
        byArray2[57] = 91;
        byArray2[58] = -94;
        byArray2[59] = 73;
        byArray2[60] = 109;
        byArray2[61] = -117;
        byArray2[62] = -47;
        byArray2[63] = 37;
        byArray2[64] = 114;
        byArray2[65] = -8;
        byArray2[66] = -10;
        byArray2[67] = 100;
        byArray2[68] = -122;
        byArray2[69] = 104;
        byArray2[70] = -104;
        byArray2[71] = 22;
        byArray2[72] = -44;
        byArray2[73] = -92;
        byArray2[74] = 92;
        byArray2[75] = -52;
        byArray2[76] = 93;
        byArray2[77] = 101;
        byArray2[78] = -74;
        byArray2[79] = -110;
        byArray2[80] = 108;
        byArray2[81] = 112;
        byArray2[82] = 72;
        byArray2[83] = 80;
        byArray2[84] = -3;
        byArray2[85] = -19;
        byArray2[86] = -71;
        byArray2[87] = -38;
        byArray2[88] = 94;
        byArray2[89] = 21;
        byArray2[90] = 70;
        byArray2[91] = 87;
        byArray2[92] = -89;
        byArray2[93] = -115;
        byArray2[94] = -99;
        byArray2[95] = -124;
        byArray2[96] = -112;
        byArray2[97] = -40;
        byArray2[98] = -85;
        byArray2[99] = 0;
        byArray2[100] = -116;
        byArray2[101] = -68;
        byArray2[102] = -45;
        byArray2[103] = 10;
        byArray2[104] = -9;
        byArray2[105] = -28;
        byArray2[106] = 88;
        byArray2[107] = 5;
        byArray2[108] = -72;
        byArray2[109] = -77;
        byArray2[110] = 69;
        byArray2[111] = 6;
        byArray2[112] = -48;
        byArray2[113] = 44;
        byArray2[114] = 30;
        byArray2[115] = -113;
        byArray2[116] = -54;
        byArray2[117] = 63;
        byArray2[118] = 15;
        byArray2[119] = 2;
        byArray2[120] = -63;
        byArray2[121] = -81;
        byArray2[122] = -67;
        byArray2[123] = 3;
        byArray2[124] = 1;
        byArray2[125] = 19;
        byArray2[126] = -118;
        byArray2[127] = 107;
        byArray2[128] = 58;
        byArray2[129] = -111;
        byArray2[130] = 17;
        byArray2[131] = 65;
        byArray2[132] = 79;
        byArray2[133] = 103;
        byArray2[134] = -36;
        byArray2[135] = -22;
        byArray2[136] = -105;
        byArray2[137] = -14;
        byArray2[138] = -49;
        byArray2[139] = -50;
        byArray2[140] = -16;
        byArray2[141] = -76;
        byArray2[142] = -26;
        byArray2[143] = 115;
        byArray2[144] = -106;
        byArray2[145] = -84;
        byArray2[146] = 116;
        byArray2[147] = 34;
        byArray2[148] = -25;
        byArray2[149] = -83;
        byArray2[150] = 53;
        byArray2[151] = -123;
        byArray2[152] = -30;
        byArray2[153] = -7;
        byArray2[154] = 55;
        byArray2[155] = -24;
        byArray2[156] = 28;
        byArray2[157] = 117;
        byArray2[158] = -33;
        byArray2[159] = 110;
        byArray2[160] = 71;
        byArray2[161] = -15;
        byArray2[162] = 26;
        byArray2[163] = 113;
        byArray2[164] = 29;
        byArray2[165] = 41;
        byArray2[166] = -59;
        byArray2[167] = -119;
        byArray2[168] = 111;
        byArray2[169] = -73;
        byArray2[170] = 98;
        byArray2[171] = 14;
        byArray2[172] = -86;
        byArray2[173] = 24;
        byArray2[174] = -66;
        byArray2[175] = 27;
        byArray2[176] = -4;
        byArray2[177] = 86;
        byArray2[178] = 62;
        byArray2[179] = 75;
        byArray2[180] = -58;
        byArray2[181] = -46;
        byArray2[182] = 121;
        byArray2[183] = 32;
        byArray2[184] = -102;
        byArray2[185] = -37;
        byArray2[186] = -64;
        byArray2[187] = -2;
        byArray2[188] = 120;
        byArray2[189] = -51;
        byArray2[190] = 90;
        byArray2[191] = -12;
        byArray2[192] = 31;
        byArray2[193] = -35;
        byArray2[194] = -88;
        byArray2[195] = 51;
        byArray2[196] = -120;
        byArray2[197] = 7;
        byArray2[198] = -57;
        byArray2[199] = 49;
        byArray2[200] = -79;
        byArray2[201] = 18;
        byArray2[202] = 16;
        byArray2[203] = 89;
        byArray2[204] = 39;
        byArray2[205] = -128;
        byArray2[206] = -20;
        byArray2[207] = 95;
        byArray2[208] = 96;
        byArray2[209] = 81;
        byArray2[210] = 127;
        byArray2[211] = -87;
        byArray2[212] = 25;
        byArray2[213] = -75;
        byArray2[214] = 74;
        byArray2[215] = 13;
        byArray2[216] = 45;
        byArray2[217] = -27;
        byArray2[218] = 122;
        byArray2[219] = -97;
        byArray2[220] = -109;
        byArray2[221] = -55;
        byArray2[222] = -100;
        byArray2[223] = -17;
        byArray2[224] = -96;
        byArray2[225] = -32;
        byArray2[226] = 59;
        byArray2[227] = 77;
        byArray2[228] = -82;
        byArray2[229] = 42;
        byArray2[230] = -11;
        byArray2[231] = -80;
        byArray2[232] = -56;
        byArray2[233] = -21;
        byArray2[234] = -69;
        byArray2[235] = 60;
        byArray2[236] = -125;
        byArray2[237] = 83;
        byArray2[238] = -103;
        byArray2[239] = 97;
        byArray2[240] = 23;
        byArray2[241] = 43;
        byArray2[242] = 4;
        byArray2[243] = 126;
        byArray2[244] = -70;
        byArray2[245] = 119;
        byArray2[246] = -42;
        byArray2[247] = 38;
        byArray2[248] = -31;
        byArray2[249] = 105;
        byArray2[250] = 20;
        byArray2[251] = 99;
        byArray2[252] = 85;
        byArray2[253] = 33;
        byArray2[254] = 12;
        byArray2[255] = 125;
        cfr_renamed_132 = byArray2;
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
    }

    private static /* synthetic */ int cfr_renamed_3730(int arg0) {
        int n;
        int n2 = n = sprsid.cfr_renamed_3729(arg0);
        return n2 ^ sprsid.cfr_renamed_3731(arg0 ^ n2, 8) ^ sprsid.cfr_renamed_3731(arg0, 16) ^ sprsid.cfr_renamed_3731(arg0, 24);
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_86 == null) {
            throw new IllegalStateException(sprriq.cfr_renamed_9("wKe.S`QgXk\u0016`Yz\u0016gXgBgWb_}Sj"));
        }
        if (arg1 + 16 > arg0.length) {
            throw new sprjkd(sproxfa.cfr_renamed_9("j\ts\u0012wGa\u0012e\u0001f\u0015#\u0013l\b#\u0014k\bq\u0013"));
        }
        if (arg3 + 16 > arg2.length) {
            throw new spreid(sprriq.cfr_renamed_9("aCzF{B.T{PhS|\u0016zYa\u0016}^aDz"));
        }
        if (this.cfr_renamed_1) {
            sprsid sprsid2 = this;
            sprsid sprsid3 = this;
            sprsid3.cfr_renamed_3622(arg0, arg1);
            sprsid2.cfr_renamed_3732(sprsid3.cfr_renamed_86);
            sprsid2.cfr_renamed_3631(arg2, arg3);
        } else {
            sprsid sprsid4 = this;
            sprsid4.cfr_renamed_3622(arg0, arg1);
            sprsid4.cfr_renamed_3733(sprsid4.cfr_renamed_86);
            this.cfr_renamed_3631(arg2, arg3);
        }
        return 16;
    }

    private static /* synthetic */ int cfr_renamed_3731(int arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << -arg1;
    }

    private /* synthetic */ int[][] cfr_renamed_3728(byte[] arg0, boolean arg1) {
        int n;
        int n2;
        int n3 = arg0.length / 4;
        if (n3 != 4 && n3 != 6 && n3 != 8 || n3 * 4 != arg0.length) {
            throw new IllegalArgumentException(sproxfa.cfr_renamed_9("H\u0002zGo\u0002m\u0000w\u000f#\tl\u0013#V1_,V:U,U6Q#\u0005j\u0013pI"));
        }
        this.cfr_renamed_2 = n3 + 6;
        int[][] nArray = new int[this.cfr_renamed_2 + 1][4];
        int n4 = 0;
        int n5 = n2 = 0;
        while (n5 < arg0.length) {
            int n6 = arg0[n2] & 0xFF | (arg0[n2 + 1] & 0xFF) << 8 | (arg0[n2 + 2] & 0xFF) << 16 | arg0[n2 + 3] << 24;
            nArray[n4 >> 2][n4 & 3] = n6;
            ++n4;
            n5 = n2 += 4;
        }
        int n7 = this.cfr_renamed_2 + 1 << 2;
        int n8 = n2 = n3;
        while (n8 < n7) {
            int[][] nArray2;
            n = nArray[n2 - 1 >> 2][n2 - 1 & 3];
            if (n2 % n3 == 0) {
                n = sprsid.cfr_renamed_3734(sprsid.cfr_renamed_3731(n, 8)) ^ cfr_renamed_91[n2 / n3 - 1];
                nArray2 = nArray;
            } else {
                if (n3 > 6 && n2 % n3 == 4) {
                    n = sprsid.cfr_renamed_3734(n);
                }
                nArray2 = nArray;
            }
            int[] nArray3 = nArray2[n2 >> 2];
            int n9 = n2 & 3;
            int n10 = nArray[n2 - n3 >> 2][n2 - n3 & 3] ^ n;
            nArray3[n9] = n10;
            n8 = ++n2;
        }
        if (!arg1) {
            int n11 = n = 1;
            while (n11 < this.cfr_renamed_2) {
                int n12 = n2 = 0;
                while (n12 < 4) {
                    int n13 = n2++;
                    nArray[n][n13] = sprsid.cfr_renamed_3735(nArray[n][n13]);
                    n12 = n2;
                }
                n11 = ++n;
            }
        }
        return nArray;
    }

    private /* synthetic */ void cfr_renamed_3732(int[][] arg0) {
        int n;
        int n2;
        int n3;
        sprsid sprsid2 = this;
        int n4 = sprsid2.cfr_renamed_0 ^ arg0[0][0];
        int n5 = sprsid2.cfr_renamed_112 ^ arg0[0][1];
        int n6 = sprsid2.cfr_renamed_119 ^ arg0[0][2];
        int n7 = 1;
        int n8 = sprsid2.cfr_renamed_107 ^ arg0[0][3];
        int n9 = n7;
        while (n9 < this.cfr_renamed_2 - 1) {
            n3 = sprsid.cfr_renamed_3730(cfr_renamed_102[n4 & 0xFF] & 0xFF ^ (cfr_renamed_102[n5 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n6 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n8 >> 24 & 0xFF] << 24) ^ arg0[n7][0];
            n2 = sprsid.cfr_renamed_3730(cfr_renamed_102[n5 & 0xFF] & 0xFF ^ (cfr_renamed_102[n6 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n8 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n4 >> 24 & 0xFF] << 24) ^ arg0[n7][1];
            n = sprsid.cfr_renamed_3730(cfr_renamed_102[n6 & 0xFF] & 0xFF ^ (cfr_renamed_102[n8 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n4 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n5 >> 24 & 0xFF] << 24) ^ arg0[n7][2];
            int[] nArray = arg0[n7];
            n8 = sprsid.cfr_renamed_3730(cfr_renamed_102[n8 & 0xFF] & 0xFF ^ (cfr_renamed_102[n4 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n5 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n6 >> 24 & 0xFF] << 24) ^ nArray[3];
            n4 = sprsid.cfr_renamed_3730(cfr_renamed_102[n3 & 0xFF] & 0xFF ^ (cfr_renamed_102[n2 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n8 >> 24 & 0xFF] << 24) ^ arg0[++n7][0];
            n5 = sprsid.cfr_renamed_3730(cfr_renamed_102[n2 & 0xFF] & 0xFF ^ (cfr_renamed_102[n >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n8 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n3 >> 24 & 0xFF] << 24) ^ arg0[n7][1];
            n6 = sprsid.cfr_renamed_3730(cfr_renamed_102[n & 0xFF] & 0xFF ^ (cfr_renamed_102[n8 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n3 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n2 >> 24 & 0xFF] << 24) ^ arg0[n7][2];
            int[] nArray2 = arg0[n7];
            n8 = sprsid.cfr_renamed_3730(cfr_renamed_102[n8 & 0xFF] & 0xFF ^ (cfr_renamed_102[n3 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n2 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n >> 24 & 0xFF] << 24) ^ nArray2[3];
            n9 = ++n7;
        }
        n3 = sprsid.cfr_renamed_3730(cfr_renamed_102[n4 & 0xFF] & 0xFF ^ (cfr_renamed_102[n5 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n6 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n8 >> 24 & 0xFF] << 24) ^ arg0[n7][0];
        n2 = sprsid.cfr_renamed_3730(cfr_renamed_102[n5 & 0xFF] & 0xFF ^ (cfr_renamed_102[n6 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n8 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n4 >> 24 & 0xFF] << 24) ^ arg0[n7][1];
        n = sprsid.cfr_renamed_3730(cfr_renamed_102[n6 & 0xFF] & 0xFF ^ (cfr_renamed_102[n8 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n4 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n5 >> 24 & 0xFF] << 24) ^ arg0[n7][2];
        int[] nArray = arg0[n7];
        n8 = sprsid.cfr_renamed_3730(cfr_renamed_102[n8 & 0xFF] & 0xFF ^ (cfr_renamed_102[n4 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n5 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n6 >> 24 & 0xFF] << 24) ^ nArray[3];
        sprsid sprsid3 = this;
        sprsid3.cfr_renamed_0 = cfr_renamed_102[n3 & 0xFF] & 0xFF ^ (cfr_renamed_102[n2 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n8 >> 24 & 0xFF] << 24 ^ arg0[++n7][0];
        sprsid3.cfr_renamed_112 = cfr_renamed_102[n2 & 0xFF] & 0xFF ^ (cfr_renamed_102[n >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n8 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n3 >> 24 & 0xFF] << 24 ^ arg0[n7][1];
        sprsid3.cfr_renamed_119 = cfr_renamed_102[n & 0xFF] & 0xFF ^ (cfr_renamed_102[n8 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n3 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n2 >> 24 & 0xFF] << 24 ^ arg0[n7][2];
        sprsid3.cfr_renamed_107 = cfr_renamed_102[n8 & 0xFF] & 0xFF ^ (cfr_renamed_102[n3 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_102[n2 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_102[n >> 24 & 0xFF] << 24 ^ arg0[n7][3];
    }

    private static /* synthetic */ int cfr_renamed_3734(int arg0) {
        return cfr_renamed_102[arg0 & 0xFF] & 0xFF | (cfr_renamed_102[arg0 >> 8 & 0xFF] & 0xFF) << 8 | (cfr_renamed_102[arg0 >> 16 & 0xFF] & 0xFF) << 16 | cfr_renamed_102[arg0 >> 24 & 0xFF] << 24;
    }

    private static /* synthetic */ int cfr_renamed_3735(int arg0) {
        int n = sprsid.cfr_renamed_3729(arg0);
        int n2 = sprsid.cfr_renamed_3729(n);
        int n3 = sprsid.cfr_renamed_3729(n2);
        int n4 = arg0 ^ n3;
        return n ^ n2 ^ n3 ^ sprsid.cfr_renamed_3731(n ^ n4, 8) ^ sprsid.cfr_renamed_3731(n2 ^ n4, 16) ^ sprsid.cfr_renamed_3731(n4, 24);
    }

    private /* synthetic */ void cfr_renamed_3733(int[][] arg0) {
        int n;
        int n2;
        int n3;
        sprsid sprsid2 = this;
        int n4 = sprsid2.cfr_renamed_0 ^ arg0[this.cfr_renamed_2][0];
        sprsid sprsid3 = this;
        int n5 = sprsid2.cfr_renamed_112 ^ arg0[sprsid3.cfr_renamed_2][1];
        int n6 = sprsid3.cfr_renamed_119 ^ arg0[this.cfr_renamed_2][2];
        int n7 = sprsid2.cfr_renamed_2 - 1;
        int n8 = sprsid2.cfr_renamed_107 ^ arg0[this.cfr_renamed_2][3];
        int n9 = n7;
        while (n9 > 1) {
            n3 = sprsid.cfr_renamed_3735(cfr_renamed_132[n4 & 0xFF] & 0xFF ^ (cfr_renamed_132[n8 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n6 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n5 >> 24 & 0xFF] << 24) ^ arg0[n7][0];
            n2 = sprsid.cfr_renamed_3735(cfr_renamed_132[n5 & 0xFF] & 0xFF ^ (cfr_renamed_132[n4 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n8 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n6 >> 24 & 0xFF] << 24) ^ arg0[n7][1];
            n = sprsid.cfr_renamed_3735(cfr_renamed_132[n6 & 0xFF] & 0xFF ^ (cfr_renamed_132[n5 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n4 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n8 >> 24 & 0xFF] << 24) ^ arg0[n7][2];
            int[] nArray = arg0[n7];
            n8 = sprsid.cfr_renamed_3735(cfr_renamed_132[n8 & 0xFF] & 0xFF ^ (cfr_renamed_132[n6 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n5 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n4 >> 24 & 0xFF] << 24) ^ nArray[3];
            n4 = sprsid.cfr_renamed_3735(cfr_renamed_132[n3 & 0xFF] & 0xFF ^ (cfr_renamed_132[n8 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n2 >> 24 & 0xFF] << 24) ^ arg0[--n7][0];
            n5 = sprsid.cfr_renamed_3735(cfr_renamed_132[n2 & 0xFF] & 0xFF ^ (cfr_renamed_132[n3 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n8 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n >> 24 & 0xFF] << 24) ^ arg0[n7][1];
            n6 = sprsid.cfr_renamed_3735(cfr_renamed_132[n & 0xFF] & 0xFF ^ (cfr_renamed_132[n2 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n3 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n8 >> 24 & 0xFF] << 24) ^ arg0[n7][2];
            int[] nArray2 = arg0[n7];
            n8 = sprsid.cfr_renamed_3735(cfr_renamed_132[n8 & 0xFF] & 0xFF ^ (cfr_renamed_132[n >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n2 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n3 >> 24 & 0xFF] << 24) ^ nArray2[3];
            n9 = --n7;
        }
        n3 = sprsid.cfr_renamed_3735(cfr_renamed_132[n4 & 0xFF] & 0xFF ^ (cfr_renamed_132[n8 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n6 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n5 >> 24 & 0xFF] << 24) ^ arg0[n7][0];
        n2 = sprsid.cfr_renamed_3735(cfr_renamed_132[n5 & 0xFF] & 0xFF ^ (cfr_renamed_132[n4 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n8 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n6 >> 24 & 0xFF] << 24) ^ arg0[n7][1];
        n = sprsid.cfr_renamed_3735(cfr_renamed_132[n6 & 0xFF] & 0xFF ^ (cfr_renamed_132[n5 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n4 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n8 >> 24 & 0xFF] << 24) ^ arg0[n7][2];
        n8 = sprsid.cfr_renamed_3735(cfr_renamed_132[n8 & 0xFF] & 0xFF ^ (cfr_renamed_132[n6 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n5 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n4 >> 24 & 0xFF] << 24) ^ arg0[n7][3];
        sprsid sprsid4 = this;
        sprsid4.cfr_renamed_0 = cfr_renamed_132[n3 & 0xFF] & 0xFF ^ (cfr_renamed_132[n8 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n2 >> 24 & 0xFF] << 24 ^ arg0[0][0];
        sprsid4.cfr_renamed_112 = cfr_renamed_132[n2 & 0xFF] & 0xFF ^ (cfr_renamed_132[n3 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n8 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n >> 24 & 0xFF] << 24 ^ arg0[0][1];
        sprsid4.cfr_renamed_119 = cfr_renamed_132[n & 0xFF] & 0xFF ^ (cfr_renamed_132[n2 >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n3 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n8 >> 24 & 0xFF] << 24 ^ arg0[0][2];
        sprsid4.cfr_renamed_107 = cfr_renamed_132[n8 & 0xFF] & 0xFF ^ (cfr_renamed_132[n >> 8 & 0xFF] & 0xFF) << 8 ^ (cfr_renamed_132[n2 >> 16 & 0xFF] & 0xFF) << 16 ^ cfr_renamed_132[n3 >> 24 & 0xFF] << 24 ^ arg0[0][3];
    }
}

