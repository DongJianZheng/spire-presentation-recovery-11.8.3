/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprjbz;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprstq;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;

public class sprwbl
implements sprmr {
    private final byte[] cfr_renamed_152;
    private static final byte[] cfr_renamed_112;
    private byte[][] cfr_renamed_119;
    private int cfr_renamed_91;
    private boolean cfr_renamed_0;
    public static final int cfr_renamed_1 = 16;
    private byte[][] cfr_renamed_2;
    private int cfr_renamed_3;
    private static final byte[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_10379(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = cfr_renamed_4[this.cfr_renamed_10380(arg0[n])];
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_10381(byte[] arg0, byte[] arg1, byte[] arg2) {
        sprwbl sprwbl2 = this;
        byte[] byArray = sprwbl2.cfr_renamed_10382(arg0, arg1);
        sprwbl2.cfr_renamed_10383(byArray, arg2);
        System.arraycopy(arg1, 0, arg2, 0, this.cfr_renamed_3);
        System.arraycopy(byArray, 0, arg1, 0, this.cfr_renamed_3);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        if (arg1 instanceof sprtpk) {
            this.cfr_renamed_0 = arg0;
            this.cfr_renamed_10384(((sprtpk)arg1).cfr_renamed_1521());
            return;
        }
        if (arg1 != null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprstq.cfr_renamed_9("1#.,4$<m(,*,5(,(*m(,+>=)x97m\u001f\u0002\u000b\u0019kyi\u007f\u0007\u007fh|mm1#19x`x")).append(arg1.getClass().getName()).toString());
        }
    }

    private /* synthetic */ byte[] cfr_renamed_10382(byte[] arg0, byte[] arg1) {
        byte[] byArray = sproze.cfr_renamed_523(arg0, arg0.length);
        sprwbl sprwbl2 = this;
        sprwbl2.cfr_renamed_10383(byArray, arg1);
        sprwbl2.cfr_renamed_10385(byArray);
        this.cfr_renamed_10386(byArray);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10387(byte[] byArray, int n) {
        void arg1;
        void arg0;
        void v0 = arg0;
        sproze.cfr_renamed_3408((byte[])v0);
        v0[15] = (byte)arg1;
        this.cfr_renamed_10386((byte[])v0);
    }

    public sprwbl() {
        sprwbl sprwbl2 = this;
        byte[] byArray = new byte[16];
        byArray[0] = -108;
        byArray[1] = 32;
        byArray[2] = -123;
        byArray[3] = 16;
        byArray[4] = -62;
        byArray[5] = -64;
        byArray[6] = 1;
        byArray[7] = -5;
        byArray[8] = 1;
        byArray[9] = -64;
        byArray[10] = -62;
        byArray[11] = 16;
        byArray[12] = -123;
        byArray[13] = 32;
        byArray[14] = -108;
        byArray[15] = 1;
        sprwbl2.cfr_renamed_152 = byArray;
        sprwbl2.cfr_renamed_91 = 32;
        this.cfr_renamed_3 = this.cfr_renamed_91 / 2;
        this.cfr_renamed_2 = null;
        this.cfr_renamed_119 = sprwbl.cfr_renamed_10388();
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprjbz.cfr_renamed_9("m\u0016y\r\u0019m\u001bkuk\u001ah\u001fyO7M0D<\n7E-\n0D0^0K5C*O="));
        }
        if (arg1 + 16 > arg0.length) {
            throw new sprddl(sprstq.cfr_renamed_9("$6=-9x/-+>(*m,\"7m+%7?,"));
        }
        if (arg3 + 16 > arg2.length) {
            throw new sprwjl(sprjbz.cfr_renamed_9("6_-Z,^yH,L?O+\n-E6\n*B6X-"));
        }
        this.cfr_renamed_10389(arg0, arg1, arg2, arg3);
        return 16;
    }

    private /* synthetic */ void cfr_renamed_10390(byte[] arg0) {
        byte by = this.cfr_renamed_10391(arg0);
        System.arraycopy(arg0, 0, arg0, 1, 15);
        arg0[0] = by;
    }

    private /* synthetic */ void cfr_renamed_10389(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        byte[] byArray;
        byte[] byArray2 = new byte[16];
        System.arraycopy(arg0, arg1, byArray2, 0, 16);
        if (this.cfr_renamed_0) {
            int n;
            int n2 = n = 0;
            while (n2 < 9) {
                sprwbl sprwbl2 = this;
                byte[] byArray3 = sprwbl2.cfr_renamed_10382(sprwbl2.cfr_renamed_2[n], byArray2);
                byArray2 = sproze.cfr_renamed_523(byArray3, 16);
                n2 = ++n;
            }
            this.cfr_renamed_10383(byArray2, this.cfr_renamed_2[9]);
            byArray = byArray2;
        } else {
            int n;
            int n3 = n = 9;
            while (n3 > 0) {
                sprwbl sprwbl3 = this;
                byte[] byArray4 = sprwbl3.cfr_renamed_10392(sprwbl3.cfr_renamed_2[n], byArray2);
                byArray2 = sproze.cfr_renamed_523(byArray4, 16);
                n3 = --n;
            }
            this.cfr_renamed_10383(byArray2, this.cfr_renamed_2[0]);
            byArray = byArray2;
        }
        System.arraycopy(byArray, 0, arg2, arg3, 16);
    }

    private /* synthetic */ void cfr_renamed_10386(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 16) {
            this.cfr_renamed_10390(arg0);
            n2 = ++n;
        }
    }

    private /* synthetic */ int cfr_renamed_10380(byte arg0) {
        return arg0 & 0xFF;
    }

    private /* synthetic */ void cfr_renamed_10393(byte[] arg0) {
        byte[] byArray = new byte[16];
        System.arraycopy(arg0, 1, byArray, 0, 15);
        byArray[15] = arg0[0];
        byte by = this.cfr_renamed_10391(byArray);
        byte[] byArray2 = arg0;
        System.arraycopy(arg0, 1, byArray2, 0, 15);
        byArray2[15] = by;
    }

    private /* synthetic */ void cfr_renamed_10383(byte[] arg0, byte[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(arg0[n3] ^ arg1[n]);
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    static {
        byte[] byArray = new byte[256];
        byArray[0] = -4;
        byArray[1] = -18;
        byArray[2] = -35;
        byArray[3] = 17;
        byArray[4] = -49;
        byArray[5] = 110;
        byArray[6] = 49;
        byArray[7] = 22;
        byArray[8] = -5;
        byArray[9] = -60;
        byArray[10] = -6;
        byArray[11] = -38;
        byArray[12] = 35;
        byArray[13] = -59;
        byArray[14] = 4;
        byArray[15] = 77;
        byArray[16] = -23;
        byArray[17] = 119;
        byArray[18] = -16;
        byArray[19] = -37;
        byArray[20] = -109;
        byArray[21] = 46;
        byArray[22] = -103;
        byArray[23] = -70;
        byArray[24] = 23;
        byArray[25] = 54;
        byArray[26] = -15;
        byArray[27] = -69;
        byArray[28] = 20;
        byArray[29] = -51;
        byArray[30] = 95;
        byArray[31] = -63;
        byArray[32] = -7;
        byArray[33] = 24;
        byArray[34] = 101;
        byArray[35] = 90;
        byArray[36] = -30;
        byArray[37] = 92;
        byArray[38] = -17;
        byArray[39] = 33;
        byArray[40] = -127;
        byArray[41] = 28;
        byArray[42] = 60;
        byArray[43] = 66;
        byArray[44] = -117;
        byArray[45] = 1;
        byArray[46] = -114;
        byArray[47] = 79;
        byArray[48] = 5;
        byArray[49] = -124;
        byArray[50] = 2;
        byArray[51] = -82;
        byArray[52] = -29;
        byArray[53] = 106;
        byArray[54] = -113;
        byArray[55] = -96;
        byArray[56] = 6;
        byArray[57] = 11;
        byArray[58] = -19;
        byArray[59] = -104;
        byArray[60] = 127;
        byArray[61] = -44;
        byArray[62] = -45;
        byArray[63] = 31;
        byArray[64] = -21;
        byArray[65] = 52;
        byArray[66] = 44;
        byArray[67] = 81;
        byArray[68] = -22;
        byArray[69] = -56;
        byArray[70] = 72;
        byArray[71] = -85;
        byArray[72] = -14;
        byArray[73] = 42;
        byArray[74] = 104;
        byArray[75] = -94;
        byArray[76] = -3;
        byArray[77] = 58;
        byArray[78] = -50;
        byArray[79] = -52;
        byArray[80] = -75;
        byArray[81] = 112;
        byArray[82] = 14;
        byArray[83] = 86;
        byArray[84] = 8;
        byArray[85] = 12;
        byArray[86] = 118;
        byArray[87] = 18;
        byArray[88] = -65;
        byArray[89] = 114;
        byArray[90] = 19;
        byArray[91] = 71;
        byArray[92] = -100;
        byArray[93] = -73;
        byArray[94] = 93;
        byArray[95] = -121;
        byArray[96] = 21;
        byArray[97] = -95;
        byArray[98] = -106;
        byArray[99] = 41;
        byArray[100] = 16;
        byArray[101] = 123;
        byArray[102] = -102;
        byArray[103] = -57;
        byArray[104] = -13;
        byArray[105] = -111;
        byArray[106] = 120;
        byArray[107] = 111;
        byArray[108] = -99;
        byArray[109] = -98;
        byArray[110] = -78;
        byArray[111] = -79;
        byArray[112] = 50;
        byArray[113] = 117;
        byArray[114] = 25;
        byArray[115] = 61;
        byArray[116] = -1;
        byArray[117] = 53;
        byArray[118] = -118;
        byArray[119] = 126;
        byArray[120] = 109;
        byArray[121] = 84;
        byArray[122] = -58;
        byArray[123] = -128;
        byArray[124] = -61;
        byArray[125] = -67;
        byArray[126] = 13;
        byArray[127] = 87;
        byArray[128] = -33;
        byArray[129] = -11;
        byArray[130] = 36;
        byArray[131] = -87;
        byArray[132] = 62;
        byArray[133] = -88;
        byArray[134] = 67;
        byArray[135] = -55;
        byArray[136] = -41;
        byArray[137] = 121;
        byArray[138] = -42;
        byArray[139] = -10;
        byArray[140] = 124;
        byArray[141] = 34;
        byArray[142] = -71;
        byArray[143] = 3;
        byArray[144] = -32;
        byArray[145] = 15;
        byArray[146] = -20;
        byArray[147] = -34;
        byArray[148] = 122;
        byArray[149] = -108;
        byArray[150] = -80;
        byArray[151] = -68;
        byArray[152] = -36;
        byArray[153] = -24;
        byArray[154] = 40;
        byArray[155] = 80;
        byArray[156] = 78;
        byArray[157] = 51;
        byArray[158] = 10;
        byArray[159] = 74;
        byArray[160] = -89;
        byArray[161] = -105;
        byArray[162] = 96;
        byArray[163] = 115;
        byArray[164] = 30;
        byArray[165] = 0;
        byArray[166] = 98;
        byArray[167] = 68;
        byArray[168] = 26;
        byArray[169] = -72;
        byArray[170] = 56;
        byArray[171] = -126;
        byArray[172] = 100;
        byArray[173] = -97;
        byArray[174] = 38;
        byArray[175] = 65;
        byArray[176] = -83;
        byArray[177] = 69;
        byArray[178] = 70;
        byArray[179] = -110;
        byArray[180] = 39;
        byArray[181] = 94;
        byArray[182] = 85;
        byArray[183] = 47;
        byArray[184] = -116;
        byArray[185] = -93;
        byArray[186] = -91;
        byArray[187] = 125;
        byArray[188] = 105;
        byArray[189] = -43;
        byArray[190] = -107;
        byArray[191] = 59;
        byArray[192] = 7;
        byArray[193] = 88;
        byArray[194] = -77;
        byArray[195] = 64;
        byArray[196] = -122;
        byArray[197] = -84;
        byArray[198] = 29;
        byArray[199] = -9;
        byArray[200] = 48;
        byArray[201] = 55;
        byArray[202] = 107;
        byArray[203] = -28;
        byArray[204] = -120;
        byArray[205] = -39;
        byArray[206] = -25;
        byArray[207] = -119;
        byArray[208] = -31;
        byArray[209] = 27;
        byArray[210] = -125;
        byArray[211] = 73;
        byArray[212] = 76;
        byArray[213] = 63;
        byArray[214] = -8;
        byArray[215] = -2;
        byArray[216] = -115;
        byArray[217] = 83;
        byArray[218] = -86;
        byArray[219] = -112;
        byArray[220] = -54;
        byArray[221] = -40;
        byArray[222] = -123;
        byArray[223] = 97;
        byArray[224] = 32;
        byArray[225] = 113;
        byArray[226] = 103;
        byArray[227] = -92;
        byArray[228] = 45;
        byArray[229] = 43;
        byArray[230] = 9;
        byArray[231] = 91;
        byArray[232] = -53;
        byArray[233] = -101;
        byArray[234] = 37;
        byArray[235] = -48;
        byArray[236] = -66;
        byArray[237] = -27;
        byArray[238] = 108;
        byArray[239] = 82;
        byArray[240] = 89;
        byArray[241] = -90;
        byArray[242] = 116;
        byArray[243] = -46;
        byArray[244] = -26;
        byArray[245] = -12;
        byArray[246] = -76;
        byArray[247] = -64;
        byArray[248] = -47;
        byArray[249] = 102;
        byArray[250] = -81;
        byArray[251] = -62;
        byArray[252] = 57;
        byArray[253] = 75;
        byArray[254] = 99;
        byArray[255] = -74;
        cfr_renamed_112 = byArray;
        byte[] byArray2 = new byte[256];
        byArray2[0] = -91;
        byArray2[1] = 45;
        byArray2[2] = 50;
        byArray2[3] = -113;
        byArray2[4] = 14;
        byArray2[5] = 48;
        byArray2[6] = 56;
        byArray2[7] = -64;
        byArray2[8] = 84;
        byArray2[9] = -26;
        byArray2[10] = -98;
        byArray2[11] = 57;
        byArray2[12] = 85;
        byArray2[13] = 126;
        byArray2[14] = 82;
        byArray2[15] = -111;
        byArray2[16] = 100;
        byArray2[17] = 3;
        byArray2[18] = 87;
        byArray2[19] = 90;
        byArray2[20] = 28;
        byArray2[21] = 96;
        byArray2[22] = 7;
        byArray2[23] = 24;
        byArray2[24] = 33;
        byArray2[25] = 114;
        byArray2[26] = -88;
        byArray2[27] = -47;
        byArray2[28] = 41;
        byArray2[29] = -58;
        byArray2[30] = -92;
        byArray2[31] = 63;
        byArray2[32] = -32;
        byArray2[33] = 39;
        byArray2[34] = -115;
        byArray2[35] = 12;
        byArray2[36] = -126;
        byArray2[37] = -22;
        byArray2[38] = -82;
        byArray2[39] = -76;
        byArray2[40] = -102;
        byArray2[41] = 99;
        byArray2[42] = 73;
        byArray2[43] = -27;
        byArray2[44] = 66;
        byArray2[45] = -28;
        byArray2[46] = 21;
        byArray2[47] = -73;
        byArray2[48] = -56;
        byArray2[49] = 6;
        byArray2[50] = 112;
        byArray2[51] = -99;
        byArray2[52] = 65;
        byArray2[53] = 117;
        byArray2[54] = 25;
        byArray2[55] = -55;
        byArray2[56] = -86;
        byArray2[57] = -4;
        byArray2[58] = 77;
        byArray2[59] = -65;
        byArray2[60] = 42;
        byArray2[61] = 115;
        byArray2[62] = -124;
        byArray2[63] = -43;
        byArray2[64] = -61;
        byArray2[65] = -81;
        byArray2[66] = 43;
        byArray2[67] = -122;
        byArray2[68] = -89;
        byArray2[69] = -79;
        byArray2[70] = -78;
        byArray2[71] = 91;
        byArray2[72] = 70;
        byArray2[73] = -45;
        byArray2[74] = -97;
        byArray2[75] = -3;
        byArray2[76] = -44;
        byArray2[77] = 15;
        byArray2[78] = -100;
        byArray2[79] = 47;
        byArray2[80] = -101;
        byArray2[81] = 67;
        byArray2[82] = -17;
        byArray2[83] = -39;
        byArray2[84] = 121;
        byArray2[85] = -74;
        byArray2[86] = 83;
        byArray2[87] = 127;
        byArray2[88] = -63;
        byArray2[89] = -16;
        byArray2[90] = 35;
        byArray2[91] = -25;
        byArray2[92] = 37;
        byArray2[93] = 94;
        byArray2[94] = -75;
        byArray2[95] = 30;
        byArray2[96] = -94;
        byArray2[97] = -33;
        byArray2[98] = -90;
        byArray2[99] = -2;
        byArray2[100] = -84;
        byArray2[101] = 34;
        byArray2[102] = -7;
        byArray2[103] = -30;
        byArray2[104] = 74;
        byArray2[105] = -68;
        byArray2[106] = 53;
        byArray2[107] = -54;
        byArray2[108] = -18;
        byArray2[109] = 120;
        byArray2[110] = 5;
        byArray2[111] = 107;
        byArray2[112] = 81;
        byArray2[113] = -31;
        byArray2[114] = 89;
        byArray2[115] = -93;
        byArray2[116] = -14;
        byArray2[117] = 113;
        byArray2[118] = 86;
        byArray2[119] = 17;
        byArray2[120] = 106;
        byArray2[121] = -119;
        byArray2[122] = -108;
        byArray2[123] = 101;
        byArray2[124] = -116;
        byArray2[125] = -69;
        byArray2[126] = 119;
        byArray2[127] = 60;
        byArray2[128] = 123;
        byArray2[129] = 40;
        byArray2[130] = -85;
        byArray2[131] = -46;
        byArray2[132] = 49;
        byArray2[133] = -34;
        byArray2[134] = -60;
        byArray2[135] = 95;
        byArray2[136] = -52;
        byArray2[137] = -49;
        byArray2[138] = 118;
        byArray2[139] = 44;
        byArray2[140] = -72;
        byArray2[141] = -40;
        byArray2[142] = 46;
        byArray2[143] = 54;
        byArray2[144] = -37;
        byArray2[145] = 105;
        byArray2[146] = -77;
        byArray2[147] = 20;
        byArray2[148] = -107;
        byArray2[149] = -66;
        byArray2[150] = 98;
        byArray2[151] = -95;
        byArray2[152] = 59;
        byArray2[153] = 22;
        byArray2[154] = 102;
        byArray2[155] = -23;
        byArray2[156] = 92;
        byArray2[157] = 108;
        byArray2[158] = 109;
        byArray2[159] = -83;
        byArray2[160] = 55;
        byArray2[161] = 97;
        byArray2[162] = 75;
        byArray2[163] = -71;
        byArray2[164] = -29;
        byArray2[165] = -70;
        byArray2[166] = -15;
        byArray2[167] = -96;
        byArray2[168] = -123;
        byArray2[169] = -125;
        byArray2[170] = -38;
        byArray2[171] = 71;
        byArray2[172] = -59;
        byArray2[173] = -80;
        byArray2[174] = 51;
        byArray2[175] = -6;
        byArray2[176] = -106;
        byArray2[177] = 111;
        byArray2[178] = 110;
        byArray2[179] = -62;
        byArray2[180] = -10;
        byArray2[181] = 80;
        byArray2[182] = -1;
        byArray2[183] = 93;
        byArray2[184] = -87;
        byArray2[185] = -114;
        byArray2[186] = 23;
        byArray2[187] = 27;
        byArray2[188] = -105;
        byArray2[189] = 125;
        byArray2[190] = -20;
        byArray2[191] = 88;
        byArray2[192] = -9;
        byArray2[193] = 31;
        byArray2[194] = -5;
        byArray2[195] = 124;
        byArray2[196] = 9;
        byArray2[197] = 13;
        byArray2[198] = 122;
        byArray2[199] = 103;
        byArray2[200] = 69;
        byArray2[201] = -121;
        byArray2[202] = -36;
        byArray2[203] = -24;
        byArray2[204] = 79;
        byArray2[205] = 29;
        byArray2[206] = 78;
        byArray2[207] = 4;
        byArray2[208] = -21;
        byArray2[209] = -8;
        byArray2[210] = -13;
        byArray2[211] = 62;
        byArray2[212] = 61;
        byArray2[213] = -67;
        byArray2[214] = -118;
        byArray2[215] = -120;
        byArray2[216] = -35;
        byArray2[217] = -51;
        byArray2[218] = 11;
        byArray2[219] = 19;
        byArray2[220] = -104;
        byArray2[221] = 2;
        byArray2[222] = -109;
        byArray2[223] = -128;
        byArray2[224] = -112;
        byArray2[225] = -48;
        byArray2[226] = 36;
        byArray2[227] = 52;
        byArray2[228] = -53;
        byArray2[229] = -19;
        byArray2[230] = -12;
        byArray2[231] = -50;
        byArray2[232] = -103;
        byArray2[233] = 16;
        byArray2[234] = 68;
        byArray2[235] = 64;
        byArray2[236] = -110;
        byArray2[237] = 58;
        byArray2[238] = 1;
        byArray2[239] = 38;
        byArray2[240] = 18;
        byArray2[241] = 26;
        byArray2[242] = 72;
        byArray2[243] = 104;
        byArray2[244] = -11;
        byArray2[245] = -127;
        byArray2[246] = -117;
        byArray2[247] = -57;
        byArray2[248] = -42;
        byArray2[249] = 32;
        byArray2[250] = 10;
        byArray2[251] = 8;
        byArray2[252] = 0;
        byArray2[253] = 76;
        byArray2[254] = -41;
        byArray2[255] = 116;
        cfr_renamed_4 = byArray2;
    }

    private /* synthetic */ void cfr_renamed_10384(byte[] arg0) {
        int n;
        int n2;
        int n3;
        if (arg0.length != this.cfr_renamed_91) {
            throw new IllegalArgumentException(sprstq.cfr_renamed_9("\u0006=4x!=#?90m1#.,4$<cx\u0006=4x#=(<>x97m:(x~jm:4,(x`x\u007fm{x/19yly"));
        }
        this.cfr_renamed_2 = new byte[10][];
        int n4 = n3 = 0;
        while (n4 < 10) {
            this.cfr_renamed_2[n3++] = new byte[this.cfr_renamed_3];
            n4 = n3;
        }
        sprwbl sprwbl2 = this;
        byte[] byArray = new byte[sprwbl2.cfr_renamed_3];
        byte[] byArray2 = new byte[sprwbl2.cfr_renamed_3];
        int n5 = n2 = 0;
        while (n5 < this.cfr_renamed_3) {
            int n6 = n2;
            byte by = arg0[n2];
            byArray[n6] = by;
            this.cfr_renamed_2[0][n6] = by;
            int n7 = n2;
            byte by2 = arg0[n2 + this.cfr_renamed_3];
            byArray2[n7] = by2;
            this.cfr_renamed_2[1][n7] = by2;
            n5 = ++n2;
        }
        byte[] byArray3 = new byte[this.cfr_renamed_3];
        int n8 = n = 1;
        while (n8 < 5) {
            int n9;
            int n10 = n9 = 1;
            while (n10 <= 8) {
                sprwbl sprwbl3 = this;
                int n11 = 8 * (n - 1) + n9;
                sprwbl3.cfr_renamed_10387(byArray3, n11);
                sprwbl3.cfr_renamed_10381(byArray3, byArray, byArray2);
                n10 = ++n9;
            }
            System.arraycopy(byArray, 0, this.cfr_renamed_2[2 * n], 0, this.cfr_renamed_3);
            System.arraycopy(byArray2, 0, this.cfr_renamed_2[2 * ++n + 1], 0, this.cfr_renamed_3);
            n8 = n;
        }
    }

    private static /* synthetic */ byte cfr_renamed_10394(byte arg0, byte arg1) {
        int n;
        byte by = 0;
        int n2 = n = 0;
        while (n2 < 8 && arg0 != 0 && arg1 != 0) {
            if ((arg1 & 1) != 0) {
                by = (byte)(by ^ arg0);
            }
            byte by2 = (byte)(arg0 & 0x80);
            arg0 = (byte)(arg0 << 1);
            if (by2 != 0) {
                arg0 = (byte)(arg0 ^ 0xC3);
            }
            arg1 = (byte)(arg1 >> 1);
            n2 = n = (int)((byte)(n + 1));
        }
        return by;
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    @Override
    public void cfr_renamed_41() {
    }

    private static /* synthetic */ byte[][] cfr_renamed_10388() {
        int n;
        byte[][] byArrayArray = new byte[256][];
        int n2 = n = 0;
        while (n2 < 256) {
            int n3;
            byArrayArray[n] = new byte[256];
            int n4 = n3 = 0;
            while (n4 < 256) {
                int n5 = n3++;
                byArrayArray[n][n5] = sprwbl.cfr_renamed_10394((byte)n, (byte)n5);
                n4 = n3;
            }
            n2 = ++n;
        }
        return byArrayArray;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprjbz.cfr_renamed_9("\u001ee\n~j\u001eh\u0018\u0006\u0018i\u001bl");
    }

    private /* synthetic */ void cfr_renamed_10385(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = cfr_renamed_112[this.cfr_renamed_10380(arg0[n])];
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_10395(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 16) {
            this.cfr_renamed_10393(arg0);
            n2 = ++n;
        }
    }

    private /* synthetic */ byte cfr_renamed_10391(byte[] arg0) {
        int n;
        byte by = arg0[15];
        int n2 = n = 14;
        while (n2 >= 0) {
            sprwbl sprwbl2 = this;
            byte by2 = this.cfr_renamed_119[this.cfr_renamed_10380(arg0[n])][sprwbl2.cfr_renamed_10380(sprwbl2.cfr_renamed_152[n])];
            by = (byte)(by ^ by2);
            n2 = --n;
        }
        return by;
    }

    private /* synthetic */ byte[] cfr_renamed_10392(byte[] arg0, byte[] arg1) {
        byte[] byArray = sproze.cfr_renamed_523(arg0, arg0.length);
        sprwbl sprwbl2 = this;
        sprwbl2.cfr_renamed_10383(byArray, arg1);
        sprwbl2.cfr_renamed_10395(byArray);
        this.cfr_renamed_10379(byArray);
        return byArray;
    }
}

