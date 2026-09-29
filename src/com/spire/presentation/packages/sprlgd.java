/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprvrz;

public class sprlgd
implements sprko,
sprrj {
    private int cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private int cfr_renamed_91;
    private static final int cfr_renamed_0 = 16;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private static final byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3858(sprlgd arg0) {
        System.arraycopy(arg0.cfr_renamed_2, 0, this.cfr_renamed_2, 0, arg0.cfr_renamed_2.length);
        sprlgd sprlgd2 = arg0;
        this.cfr_renamed_4 = sprlgd2.cfr_renamed_4;
        System.arraycopy(sprlgd2.cfr_renamed_119, 0, this.cfr_renamed_119, 0, arg0.cfr_renamed_119.length);
        sprlgd sprlgd3 = arg0;
        this.cfr_renamed_91 = sprlgd3.cfr_renamed_91;
        System.arraycopy(sprlgd3.cfr_renamed_1, 0, this.cfr_renamed_1, 0, arg0.cfr_renamed_1.length);
        this.cfr_renamed_112 = arg0.cfr_renamed_112;
    }

    public void cfr_renamed_3859(byte[] arg0) {
        int n;
        byte by = this.cfr_renamed_1[15];
        int n2 = n = 0;
        while (n2 < 16) {
            sprlgd sprlgd2 = this;
            int n3 = n;
            sprlgd2.cfr_renamed_1[n3] = (byte)(sprlgd2.cfr_renamed_1[n3] ^ cfr_renamed_3[(arg0[n] ^ by) & 0xFF]);
            by = sprlgd2.cfr_renamed_1[n++];
            n2 = n;
        }
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        int n;
        byte by = (byte)(this.cfr_renamed_119.length - this.cfr_renamed_91);
        int n2 = n = this.cfr_renamed_91;
        while (n2 < this.cfr_renamed_119.length) {
            this.cfr_renamed_119[n++] = by;
            n2 = n;
        }
        sprlgd sprlgd2 = this;
        sprlgd2.cfr_renamed_3859(sprlgd2.cfr_renamed_119);
        sprlgd2.cfr_renamed_3860(sprlgd2.cfr_renamed_119);
        sprlgd2.cfr_renamed_3860(sprlgd2.cfr_renamed_1);
        System.arraycopy(sprlgd2.cfr_renamed_2, this.cfr_renamed_4, arg0, arg1, 16);
        sprlgd2.cfr_renamed_41();
        return 16;
    }

    public sprlgd() {
        this.cfr_renamed_2 = new byte[48];
        this.cfr_renamed_119 = new byte[16];
        this.cfr_renamed_1 = new byte[16];
        this.cfr_renamed_41();
    }

    public void cfr_renamed_3860(byte[] arg0) {
        int n;
        int n2;
        int n3 = n2 = 0;
        while (n3 < 16) {
            sprlgd sprlgd2 = this;
            sprlgd2.cfr_renamed_2[n2 + 16] = arg0[n2];
            int n4 = n2 + 32;
            byte by = (byte)(arg0[n2] ^ this.cfr_renamed_2[n2]);
            sprlgd2.cfr_renamed_2[n4] = by;
            n3 = ++n2;
        }
        n2 = 0;
        int n5 = n = 0;
        while (n5 < 18) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < 48) {
                int n8 = n6++;
                byte by = (byte)(this.cfr_renamed_2[n8] ^ cfr_renamed_3[n2]);
                this.cfr_renamed_2[n8] = by;
                n2 = by;
                n2 = by & 0xFF;
                n7 = n6;
            }
            int n9 = n2 + n;
            n2 = n9 % 256;
            n5 = ++n;
        }
    }

    public sprlgd(sprlgd sprlgd2) {
        sprlgd sprlgd3 = this;
        sprlgd3.cfr_renamed_2 = new byte[48];
        sprlgd3.cfr_renamed_119 = new byte[16];
        this.cfr_renamed_1 = new byte[16];
        this.cfr_renamed_3858(sprlgd2);
    }

    @Override
    public String cfr_renamed_1315() {
        return sprvrz.cfr_renamed_9("\u0017Oh");
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprlgd sprlgd2 = (sprlgd)arg0;
        this.cfr_renamed_3858(sprlgd2);
    }

    @Override
    public int cfr_renamed_1218() {
        return 16;
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        this.cfr_renamed_4 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_2.length) {
            this.cfr_renamed_2[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_91 = 0;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_119.length) {
            this.cfr_renamed_119[n++] = 0;
            n3 = n;
        }
        this.cfr_renamed_112 = 0;
        int n4 = n = 0;
        while (n4 != this.cfr_renamed_1.length) {
            this.cfr_renamed_1[n++] = 0;
            n4 = n;
        }
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        sprlgd sprlgd2 = this;
        while (sprlgd2.cfr_renamed_91 != 0 && arg2 > 0) {
            sprlgd sprlgd3 = this;
            sprlgd2 = sprlgd3;
            sprlgd3.cfr_renamed_1221(arg0[arg1++]);
            --arg2;
        }
        int n = arg2;
        while (n > 16) {
            sprlgd sprlgd4 = this;
            System.arraycopy(arg0, arg1, sprlgd4.cfr_renamed_119, 0, 16);
            sprlgd sprlgd5 = this;
            sprlgd5.cfr_renamed_3859(sprlgd5.cfr_renamed_119);
            sprlgd5.cfr_renamed_3860(sprlgd4.cfr_renamed_119);
            arg1 += 16;
            n = arg2 -= 16;
        }
        int n2 = arg2;
        while (n2 > 0) {
            this.cfr_renamed_1221(arg0[arg1++]);
            n2 = --arg2;
        }
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprlgd(this);
    }

    static {
        byte[] byArray = new byte[256];
        byArray[0] = 41;
        byArray[1] = 46;
        byArray[2] = 67;
        byArray[3] = -55;
        byArray[4] = -94;
        byArray[5] = -40;
        byArray[6] = 124;
        byArray[7] = 1;
        byArray[8] = 61;
        byArray[9] = 54;
        byArray[10] = 84;
        byArray[11] = -95;
        byArray[12] = -20;
        byArray[13] = -16;
        byArray[14] = 6;
        byArray[15] = 19;
        byArray[16] = 98;
        byArray[17] = -89;
        byArray[18] = 5;
        byArray[19] = -13;
        byArray[20] = -64;
        byArray[21] = -57;
        byArray[22] = 115;
        byArray[23] = -116;
        byArray[24] = -104;
        byArray[25] = -109;
        byArray[26] = 43;
        byArray[27] = -39;
        byArray[28] = -68;
        byArray[29] = 76;
        byArray[30] = -126;
        byArray[31] = -54;
        byArray[32] = 30;
        byArray[33] = -101;
        byArray[34] = 87;
        byArray[35] = 60;
        byArray[36] = -3;
        byArray[37] = -44;
        byArray[38] = -32;
        byArray[39] = 22;
        byArray[40] = 103;
        byArray[41] = 66;
        byArray[42] = 111;
        byArray[43] = 24;
        byArray[44] = -118;
        byArray[45] = 23;
        byArray[46] = -27;
        byArray[47] = 18;
        byArray[48] = -66;
        byArray[49] = 78;
        byArray[50] = -60;
        byArray[51] = -42;
        byArray[52] = -38;
        byArray[53] = -98;
        byArray[54] = -34;
        byArray[55] = 73;
        byArray[56] = -96;
        byArray[57] = -5;
        byArray[58] = -11;
        byArray[59] = -114;
        byArray[60] = -69;
        byArray[61] = 47;
        byArray[62] = -18;
        byArray[63] = 122;
        byArray[64] = -87;
        byArray[65] = 104;
        byArray[66] = 121;
        byArray[67] = -111;
        byArray[68] = 21;
        byArray[69] = -78;
        byArray[70] = 7;
        byArray[71] = 63;
        byArray[72] = -108;
        byArray[73] = -62;
        byArray[74] = 16;
        byArray[75] = -119;
        byArray[76] = 11;
        byArray[77] = 34;
        byArray[78] = 95;
        byArray[79] = 33;
        byArray[80] = -128;
        byArray[81] = 127;
        byArray[82] = 93;
        byArray[83] = -102;
        byArray[84] = 90;
        byArray[85] = -112;
        byArray[86] = 50;
        byArray[87] = 39;
        byArray[88] = 53;
        byArray[89] = 62;
        byArray[90] = -52;
        byArray[91] = -25;
        byArray[92] = -65;
        byArray[93] = -9;
        byArray[94] = -105;
        byArray[95] = 3;
        byArray[96] = -1;
        byArray[97] = 25;
        byArray[98] = 48;
        byArray[99] = -77;
        byArray[100] = 72;
        byArray[101] = -91;
        byArray[102] = -75;
        byArray[103] = -47;
        byArray[104] = -41;
        byArray[105] = 94;
        byArray[106] = -110;
        byArray[107] = 42;
        byArray[108] = -84;
        byArray[109] = 86;
        byArray[110] = -86;
        byArray[111] = -58;
        byArray[112] = 79;
        byArray[113] = -72;
        byArray[114] = 56;
        byArray[115] = -46;
        byArray[116] = -106;
        byArray[117] = -92;
        byArray[118] = 125;
        byArray[119] = -74;
        byArray[120] = 118;
        byArray[121] = -4;
        byArray[122] = 107;
        byArray[123] = -30;
        byArray[124] = -100;
        byArray[125] = 116;
        byArray[126] = 4;
        byArray[127] = -15;
        byArray[128] = 69;
        byArray[129] = -99;
        byArray[130] = 112;
        byArray[131] = 89;
        byArray[132] = 100;
        byArray[133] = 113;
        byArray[134] = -121;
        byArray[135] = 32;
        byArray[136] = -122;
        byArray[137] = 91;
        byArray[138] = -49;
        byArray[139] = 101;
        byArray[140] = -26;
        byArray[141] = 45;
        byArray[142] = -88;
        byArray[143] = 2;
        byArray[144] = 27;
        byArray[145] = 96;
        byArray[146] = 37;
        byArray[147] = -83;
        byArray[148] = -82;
        byArray[149] = -80;
        byArray[150] = -71;
        byArray[151] = -10;
        byArray[152] = 28;
        byArray[153] = 70;
        byArray[154] = 97;
        byArray[155] = 105;
        byArray[156] = 52;
        byArray[157] = 64;
        byArray[158] = 126;
        byArray[159] = 15;
        byArray[160] = 85;
        byArray[161] = 71;
        byArray[162] = -93;
        byArray[163] = 35;
        byArray[164] = -35;
        byArray[165] = 81;
        byArray[166] = -81;
        byArray[167] = 58;
        byArray[168] = -61;
        byArray[169] = 92;
        byArray[170] = -7;
        byArray[171] = -50;
        byArray[172] = -70;
        byArray[173] = -59;
        byArray[174] = -22;
        byArray[175] = 38;
        byArray[176] = 44;
        byArray[177] = 83;
        byArray[178] = 13;
        byArray[179] = 110;
        byArray[180] = -123;
        byArray[181] = 40;
        byArray[182] = -124;
        byArray[183] = 9;
        byArray[184] = -45;
        byArray[185] = -33;
        byArray[186] = -51;
        byArray[187] = -12;
        byArray[188] = 65;
        byArray[189] = -127;
        byArray[190] = 77;
        byArray[191] = 82;
        byArray[192] = 106;
        byArray[193] = -36;
        byArray[194] = 55;
        byArray[195] = -56;
        byArray[196] = 108;
        byArray[197] = -63;
        byArray[198] = -85;
        byArray[199] = -6;
        byArray[200] = 36;
        byArray[201] = -31;
        byArray[202] = 123;
        byArray[203] = 8;
        byArray[204] = 12;
        byArray[205] = -67;
        byArray[206] = -79;
        byArray[207] = 74;
        byArray[208] = 120;
        byArray[209] = -120;
        byArray[210] = -107;
        byArray[211] = -117;
        byArray[212] = -29;
        byArray[213] = 99;
        byArray[214] = -24;
        byArray[215] = 109;
        byArray[216] = -23;
        byArray[217] = -53;
        byArray[218] = -43;
        byArray[219] = -2;
        byArray[220] = 59;
        byArray[221] = 0;
        byArray[222] = 29;
        byArray[223] = 57;
        byArray[224] = -14;
        byArray[225] = -17;
        byArray[226] = -73;
        byArray[227] = 14;
        byArray[228] = 102;
        byArray[229] = 88;
        byArray[230] = -48;
        byArray[231] = -28;
        byArray[232] = -90;
        byArray[233] = 119;
        byArray[234] = 114;
        byArray[235] = -8;
        byArray[236] = -21;
        byArray[237] = 117;
        byArray[238] = 75;
        byArray[239] = 10;
        byArray[240] = 49;
        byArray[241] = 68;
        byArray[242] = 80;
        byArray[243] = -76;
        byArray[244] = -113;
        byArray[245] = -19;
        byArray[246] = 31;
        byArray[247] = 26;
        byArray[248] = -37;
        byArray[249] = -103;
        byArray[250] = -115;
        byArray[251] = 51;
        byArray[252] = -97;
        byArray[253] = 17;
        byArray[254] = -125;
        byArray[255] = 20;
        cfr_renamed_3 = byArray;
    }

    @Override
    public int cfr_renamed_3248() {
        return 16;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_119[this.cfr_renamed_91++] = arg0;
        if (this.cfr_renamed_91 == 16) {
            sprlgd sprlgd2 = this;
            sprlgd sprlgd3 = this;
            sprlgd3.cfr_renamed_3859(sprlgd3.cfr_renamed_119);
            sprlgd2.cfr_renamed_3860(sprlgd2.cfr_renamed_119);
            sprlgd2.cfr_renamed_91 = 0;
        }
    }
}

