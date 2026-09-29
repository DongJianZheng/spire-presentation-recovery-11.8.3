/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spratc;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruyda;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprmvk
implements sprmr {
    private int[] cfr_renamed_91;
    private final int[] cfr_renamed_0 = new int[4];
    private static final int cfr_renamed_1 = 16;
    private static final byte[] cfr_renamed_2;
    private static final int[] cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_10330(int n) {
        void arg0;
        void v0 = arg0;
        return v0 ^ this.cfr_renamed_494((int)v0, 2) ^ this.cfr_renamed_494((int)arg0, 10) ^ this.cfr_renamed_494((int)arg0, 18) ^ this.cfr_renamed_494((int)arg0, 24);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_10331(int n) {
        void arg0;
        void v0 = arg0;
        return v0 ^ this.cfr_renamed_494((int)v0, 13) ^ this.cfr_renamed_494((int)arg0, 23);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        byte[] byArray;
        if (arg1 instanceof sprtpk) {
            byArray = ((sprtpk)arg1).cfr_renamed_1521();
            if (byArray.length != 16) {
                throw new IllegalArgumentException(spruyda.cfr_renamed_9("|E\u001b(]m^}FzJ{\u000fi\u000f9\u001d0\u000fjF|\u000fcJq"));
            }
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spratc.cfr_renamed_9("5\u000f*\u00000\b8A,\u0000.\u00001\u0004(\u0004.A,\u0000/\u00129\u0005|\u00153A\u000f,hA5\u000f5\u0015|L|")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_91 = this.cfr_renamed_10332(arg0, byArray);
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915(arg0)));
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        int n;
        if (this.cfr_renamed_91 == null) {
            throw new IllegalStateException(spruyda.cfr_renamed_9("[b<\u000ff@|\u000faAa[aNdF{Jl"));
        }
        if (arg1 + 16 > arg0.length) {
            throw new sprddl(spratc.cfr_renamed_9("\b2\u0011)\u0015|\u0003)\u0007:\u0004.A(\u000e3A/\t3\u0013("));
        }
        if (arg3 + 16 > arg2.length) {
            throw new sprwjl(spruyda.cfr_renamed_9("gZ|_}[(M}InJz\u000f|@g\u000f{Gg]|"));
        }
        sprmvk sprmvk2 = this;
        sprmvk2.cfr_renamed_0[0] = sprpxe.cfr_renamed_446(arg0, arg1);
        sprmvk2.cfr_renamed_0[1] = sprpxe.cfr_renamed_446(arg0, arg1 + 4);
        sprmvk2.cfr_renamed_0[2] = sprpxe.cfr_renamed_446(arg0, arg1 + 8);
        sprmvk2.cfr_renamed_0[3] = sprpxe.cfr_renamed_446(arg0, arg1 + 12);
        int n2 = n = 0;
        while (n2 < 32) {
            sprmvk sprmvk3 = this;
            sprmvk sprmvk4 = this;
            sprmvk3.cfr_renamed_0[0] = sprmvk4.cfr_renamed_10333(this.cfr_renamed_0, sprmvk4.cfr_renamed_91[n]);
            sprmvk sprmvk5 = this;
            sprmvk sprmvk6 = this;
            sprmvk3.cfr_renamed_0[1] = sprmvk5.cfr_renamed_10334(sprmvk6.cfr_renamed_0, sprmvk6.cfr_renamed_91[n + 1]);
            sprmvk sprmvk7 = this;
            sprmvk5.cfr_renamed_0[2] = sprmvk7.cfr_renamed_10335(this.cfr_renamed_0, sprmvk7.cfr_renamed_91[n + 2]);
            sprmvk sprmvk8 = this;
            int n3 = sprmvk8.cfr_renamed_10336(this.cfr_renamed_0, sprmvk8.cfr_renamed_91[n + 3]);
            sprmvk3.cfr_renamed_0[3] = n3;
            n2 = n += 4;
        }
        sprmvk sprmvk9 = this;
        sprpxe.cfr_renamed_442(sprmvk9.cfr_renamed_0[3], arg2, arg3);
        sprpxe.cfr_renamed_442(sprmvk9.cfr_renamed_0[2], arg2, arg3 + 4);
        sprpxe.cfr_renamed_442(sprmvk9.cfr_renamed_0[1], arg2, arg3 + 8);
        sprpxe.cfr_renamed_442(sprmvk9.cfr_renamed_0[0], arg2, arg3 + 12);
        return 16;
    }

    @Override
    public String cfr_renamed_1315() {
        return spratc.cfr_renamed_9("\u000f,h");
    }

    private /* synthetic */ int cfr_renamed_10334(int[] arg0, int arg1) {
        return arg0[1] ^ this.cfr_renamed_10337(arg0[2] ^ arg0[3] ^ arg0[0] ^ arg1);
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    private /* synthetic */ int cfr_renamed_10336(int[] arg0, int arg1) {
        return arg0[3] ^ this.cfr_renamed_10337(arg0[0] ^ arg0[1] ^ arg0[2] ^ arg1);
    }

    private /* synthetic */ int cfr_renamed_10335(int[] arg0, int arg1) {
        return arg0[2] ^ this.cfr_renamed_10337(arg0[3] ^ arg0[0] ^ arg0[1] ^ arg1);
    }

    @Override
    public void cfr_renamed_41() {
    }

    static {
        byte[] byArray = new byte[256];
        byArray[0] = -42;
        byArray[1] = -112;
        byArray[2] = -23;
        byArray[3] = -2;
        byArray[4] = -52;
        byArray[5] = -31;
        byArray[6] = 61;
        byArray[7] = -73;
        byArray[8] = 22;
        byArray[9] = -74;
        byArray[10] = 20;
        byArray[11] = -62;
        byArray[12] = 40;
        byArray[13] = -5;
        byArray[14] = 44;
        byArray[15] = 5;
        byArray[16] = 43;
        byArray[17] = 103;
        byArray[18] = -102;
        byArray[19] = 118;
        byArray[20] = 42;
        byArray[21] = -66;
        byArray[22] = 4;
        byArray[23] = -61;
        byArray[24] = -86;
        byArray[25] = 68;
        byArray[26] = 19;
        byArray[27] = 38;
        byArray[28] = 73;
        byArray[29] = -122;
        byArray[30] = 6;
        byArray[31] = -103;
        byArray[32] = -100;
        byArray[33] = 66;
        byArray[34] = 80;
        byArray[35] = -12;
        byArray[36] = -111;
        byArray[37] = -17;
        byArray[38] = -104;
        byArray[39] = 122;
        byArray[40] = 51;
        byArray[41] = 84;
        byArray[42] = 11;
        byArray[43] = 67;
        byArray[44] = -19;
        byArray[45] = -49;
        byArray[46] = -84;
        byArray[47] = 98;
        byArray[48] = -28;
        byArray[49] = -77;
        byArray[50] = 28;
        byArray[51] = -87;
        byArray[52] = -55;
        byArray[53] = 8;
        byArray[54] = -24;
        byArray[55] = -107;
        byArray[56] = -128;
        byArray[57] = -33;
        byArray[58] = -108;
        byArray[59] = -6;
        byArray[60] = 117;
        byArray[61] = -113;
        byArray[62] = 63;
        byArray[63] = -90;
        byArray[64] = 71;
        byArray[65] = 7;
        byArray[66] = -89;
        byArray[67] = -4;
        byArray[68] = -13;
        byArray[69] = 115;
        byArray[70] = 23;
        byArray[71] = -70;
        byArray[72] = -125;
        byArray[73] = 89;
        byArray[74] = 60;
        byArray[75] = 25;
        byArray[76] = -26;
        byArray[77] = -123;
        byArray[78] = 79;
        byArray[79] = -88;
        byArray[80] = 104;
        byArray[81] = 107;
        byArray[82] = -127;
        byArray[83] = -78;
        byArray[84] = 113;
        byArray[85] = 100;
        byArray[86] = -38;
        byArray[87] = -117;
        byArray[88] = -8;
        byArray[89] = -21;
        byArray[90] = 15;
        byArray[91] = 75;
        byArray[92] = 112;
        byArray[93] = 86;
        byArray[94] = -99;
        byArray[95] = 53;
        byArray[96] = 30;
        byArray[97] = 36;
        byArray[98] = 14;
        byArray[99] = 94;
        byArray[100] = 99;
        byArray[101] = 88;
        byArray[102] = -47;
        byArray[103] = -94;
        byArray[104] = 37;
        byArray[105] = 34;
        byArray[106] = 124;
        byArray[107] = 59;
        byArray[108] = 1;
        byArray[109] = 33;
        byArray[110] = 120;
        byArray[111] = -121;
        byArray[112] = -44;
        byArray[113] = 0;
        byArray[114] = 70;
        byArray[115] = 87;
        byArray[116] = -97;
        byArray[117] = -45;
        byArray[118] = 39;
        byArray[119] = 82;
        byArray[120] = 76;
        byArray[121] = 54;
        byArray[122] = 2;
        byArray[123] = -25;
        byArray[124] = -96;
        byArray[125] = -60;
        byArray[126] = -56;
        byArray[127] = -98;
        byArray[128] = -22;
        byArray[129] = -65;
        byArray[130] = -118;
        byArray[131] = -46;
        byArray[132] = 64;
        byArray[133] = -57;
        byArray[134] = 56;
        byArray[135] = -75;
        byArray[136] = -93;
        byArray[137] = -9;
        byArray[138] = -14;
        byArray[139] = -50;
        byArray[140] = -7;
        byArray[141] = 97;
        byArray[142] = 21;
        byArray[143] = -95;
        byArray[144] = -32;
        byArray[145] = -82;
        byArray[146] = 93;
        byArray[147] = -92;
        byArray[148] = -101;
        byArray[149] = 52;
        byArray[150] = 26;
        byArray[151] = 85;
        byArray[152] = -83;
        byArray[153] = -109;
        byArray[154] = 50;
        byArray[155] = 48;
        byArray[156] = -11;
        byArray[157] = -116;
        byArray[158] = -79;
        byArray[159] = -29;
        byArray[160] = 29;
        byArray[161] = -10;
        byArray[162] = -30;
        byArray[163] = 46;
        byArray[164] = -126;
        byArray[165] = 102;
        byArray[166] = -54;
        byArray[167] = 96;
        byArray[168] = -64;
        byArray[169] = 41;
        byArray[170] = 35;
        byArray[171] = -85;
        byArray[172] = 13;
        byArray[173] = 83;
        byArray[174] = 78;
        byArray[175] = 111;
        byArray[176] = -43;
        byArray[177] = -37;
        byArray[178] = 55;
        byArray[179] = 69;
        byArray[180] = -34;
        byArray[181] = -3;
        byArray[182] = -114;
        byArray[183] = 47;
        byArray[184] = 3;
        byArray[185] = -1;
        byArray[186] = 106;
        byArray[187] = 114;
        byArray[188] = 109;
        byArray[189] = 108;
        byArray[190] = 91;
        byArray[191] = 81;
        byArray[192] = -115;
        byArray[193] = 27;
        byArray[194] = -81;
        byArray[195] = -110;
        byArray[196] = -69;
        byArray[197] = -35;
        byArray[198] = -68;
        byArray[199] = 127;
        byArray[200] = 17;
        byArray[201] = -39;
        byArray[202] = 92;
        byArray[203] = 65;
        byArray[204] = 31;
        byArray[205] = 16;
        byArray[206] = 90;
        byArray[207] = -40;
        byArray[208] = 10;
        byArray[209] = -63;
        byArray[210] = 49;
        byArray[211] = -120;
        byArray[212] = -91;
        byArray[213] = -51;
        byArray[214] = 123;
        byArray[215] = -67;
        byArray[216] = 45;
        byArray[217] = 116;
        byArray[218] = -48;
        byArray[219] = 18;
        byArray[220] = -72;
        byArray[221] = -27;
        byArray[222] = -76;
        byArray[223] = -80;
        byArray[224] = -119;
        byArray[225] = 105;
        byArray[226] = -105;
        byArray[227] = 74;
        byArray[228] = 12;
        byArray[229] = -106;
        byArray[230] = 119;
        byArray[231] = 126;
        byArray[232] = 101;
        byArray[233] = -71;
        byArray[234] = -15;
        byArray[235] = 9;
        byArray[236] = -59;
        byArray[237] = 110;
        byArray[238] = -58;
        byArray[239] = -124;
        byArray[240] = 24;
        byArray[241] = -16;
        byArray[242] = 125;
        byArray[243] = -20;
        byArray[244] = 58;
        byArray[245] = -36;
        byArray[246] = 77;
        byArray[247] = 32;
        byArray[248] = 121;
        byArray[249] = -18;
        byArray[250] = 95;
        byArray[251] = 62;
        byArray[252] = -41;
        byArray[253] = -53;
        byArray[254] = 57;
        byArray[255] = 72;
        cfr_renamed_2 = byArray;
        int[] nArray = new int[32];
        nArray[0] = 462357;
        nArray[1] = 472066609;
        nArray[2] = 943670861;
        nArray[3] = 1415275113;
        nArray[4] = 1886879365;
        nArray[5] = -1936483679;
        nArray[6] = -1464879427;
        nArray[7] = -993275175;
        nArray[8] = -521670923;
        nArray[9] = -66909679;
        nArray[10] = 404694573;
        nArray[11] = 876298825;
        nArray[12] = 1347903077;
        nArray[13] = 1819507329;
        nArray[14] = -2003855715;
        nArray[15] = -1532251463;
        nArray[16] = -1060647211;
        nArray[17] = -589042959;
        nArray[18] = -117504499;
        nArray[19] = 337322537;
        nArray[20] = 808926789;
        nArray[21] = 1280531041;
        nArray[22] = 1752135293;
        nArray[23] = -2071227751;
        nArray[24] = -1599623499;
        nArray[25] = -1128019247;
        nArray[26] = -656414995;
        nArray[27] = -184876535;
        nArray[28] = 269950501;
        nArray[29] = 741554753;
        nArray[30] = 1213159005;
        nArray[31] = 1684763257;
        cfr_renamed_3 = nArray;
        int[] nArray2 = new int[4];
        nArray2[0] = -1548633402;
        nArray2[1] = 1453994832;
        nArray2[2] = 1736282519;
        nArray2[3] = -1301273892;
        cfr_renamed_4 = nArray2;
    }

    private /* synthetic */ int cfr_renamed_10338(int arg0) {
        sprmvk sprmvk2 = this;
        return sprmvk2.cfr_renamed_10331(sprmvk2.cfr_renamed_10339(arg0));
    }

    private /* synthetic */ int cfr_renamed_10333(int[] arg0, int arg1) {
        return arg0[0] ^ this.cfr_renamed_10337(arg0[1] ^ arg0[2] ^ arg0[3] ^ arg1);
    }

    private /* synthetic */ int cfr_renamed_10337(int arg0) {
        sprmvk sprmvk2 = this;
        return sprmvk2.cfr_renamed_10330(sprmvk2.cfr_renamed_10339(arg0));
    }

    private /* synthetic */ int cfr_renamed_10339(int arg0) {
        int n = cfr_renamed_2[arg0 >> 24 & 0xFF] & 0xFF;
        int n2 = cfr_renamed_2[arg0 >> 16 & 0xFF] & 0xFF;
        int n3 = cfr_renamed_2[arg0 >> 8 & 0xFF] & 0xFF;
        int n4 = cfr_renamed_2[arg0 & 0xFF] & 0xFF;
        return n << 24 | n2 << 16 | n3 << 8 | n4;
    }

    private /* synthetic */ int[] cfr_renamed_10332(boolean arg0, byte[] arg1) {
        int[] nArray = new int[32];
        int[] nArray2 = new int[]{sprpxe.cfr_renamed_446(arg1, 0), sprpxe.cfr_renamed_446(arg1, 4), sprpxe.cfr_renamed_446(arg1, 8), sprpxe.cfr_renamed_446(arg1, 12)};
        int[] nArray3 = new int[]{nArray2[0] ^ cfr_renamed_4[0], nArray2[1] ^ cfr_renamed_4[1], nArray2[2] ^ cfr_renamed_4[2], nArray2[3] ^ cfr_renamed_4[3]};
        if (arg0) {
            int n;
            nArray[0] = nArray3[0] ^ this.cfr_renamed_10338(nArray3[1] ^ nArray3[2] ^ nArray3[3] ^ cfr_renamed_3[0]);
            nArray[1] = nArray3[1] ^ this.cfr_renamed_10338(nArray3[2] ^ nArray3[3] ^ nArray[0] ^ cfr_renamed_3[1]);
            nArray[2] = nArray3[2] ^ this.cfr_renamed_10338(nArray3[3] ^ nArray[0] ^ nArray[1] ^ cfr_renamed_3[2]);
            nArray[3] = nArray3[3] ^ this.cfr_renamed_10338(nArray[0] ^ nArray[1] ^ nArray[2] ^ cfr_renamed_3[3]);
            int n2 = n = 4;
            while (n2 < 32) {
                nArray[++n] = nArray[n - 4] ^ this.cfr_renamed_10338(nArray[n - 3] ^ nArray[n - 2] ^ nArray[n - 1] ^ cfr_renamed_3[n]);
                n2 = n;
            }
        } else {
            int n;
            nArray[31] = nArray3[0] ^ this.cfr_renamed_10338(nArray3[1] ^ nArray3[2] ^ nArray3[3] ^ cfr_renamed_3[0]);
            nArray[30] = nArray3[1] ^ this.cfr_renamed_10338(nArray3[2] ^ nArray3[3] ^ nArray[31] ^ cfr_renamed_3[1]);
            nArray[29] = nArray3[2] ^ this.cfr_renamed_10338(nArray3[3] ^ nArray[31] ^ nArray[30] ^ cfr_renamed_3[2]);
            nArray[28] = nArray3[3] ^ this.cfr_renamed_10338(nArray[31] ^ nArray[30] ^ nArray[29] ^ cfr_renamed_3[3]);
            int n3 = n = 27;
            while (n3 >= 0) {
                nArray[--n] = nArray[n + 4] ^ this.cfr_renamed_10338(nArray[n + 3] ^ nArray[n + 2] ^ nArray[n + 1] ^ cfr_renamed_3[31 - n]);
                n3 = n;
            }
        }
        return nArray;
    }

    private /* synthetic */ int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> -arg1;
    }
}

