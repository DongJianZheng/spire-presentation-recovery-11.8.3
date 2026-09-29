/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprrgq;
import com.spire.presentation.packages.sprtcea;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprxkl
implements sprmr {
    private static final int[] cfr_renamed_86;
    private static final byte[] cfr_renamed_152;
    private int cfr_renamed_112;
    private int[] cfr_renamed_119;
    private int[] cfr_renamed_91;
    private static final int cfr_renamed_0 = 16;
    private boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 255;

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_3723(int n, int[] nArray, int n2, int[] nArray2, int n3) {
        void arg4;
        int arg0;
        void arg2;
        void arg1;
        void arg3;
        void v0 = arg3;
        void v1 = arg3;
        v1[2 + arg4] = arg1[0 + arg2] << arg0 | arg1[1 + arg2] >>> 32 - arg0;
        v1[3 + arg4] = arg1[1 + arg2] << arg0 | arg1[2 + arg2] >>> 32 - arg0;
        v0[0 + arg4] = arg1[2 + arg2] << arg0 | arg1[3 + arg2] >>> 32 - arg0;
        v0[1 + arg4] = arg1[3 + arg2] << arg0 | arg1[0 + arg2] >>> 32 - arg0;
        void v2 = arg1;
        arg1[0 + arg2] = arg3[2 + arg4];
        v2[1 + arg2] = arg3[3 + arg4];
        nArray[2 + arg2] = arg3[0 + arg4];
        v2[3 + arg2] = arg3[1 + arg4];
    }

    private /* synthetic */ int cfr_renamed_3712(int arg0) {
        return this.cfr_renamed_3716(cfr_renamed_152[arg0], 7) & 0xFF;
    }

    private /* synthetic */ byte cfr_renamed_3716(byte arg0, int arg1) {
        return (byte)(arg0 << arg1 | (arg0 & 0xFF) >>> 8 - arg1);
    }

    static {
        int[] nArray = new int[12];
        nArray[0] = -1600231809;
        nArray[1] = 1003262091;
        nArray[2] = -1233459112;
        nArray[3] = 1286239154;
        nArray[4] = -957401297;
        nArray[5] = -380665154;
        nArray[6] = 1426019237;
        nArray[7] = -237801700;
        nArray[8] = 283453434;
        nArray[9] = -563598051;
        nArray[10] = -1336506174;
        nArray[11] = -1276722691;
        cfr_renamed_86 = nArray;
        byte[] byArray = new byte[256];
        byArray[0] = 112;
        byArray[1] = -126;
        byArray[2] = 44;
        byArray[3] = -20;
        byArray[4] = -77;
        byArray[5] = 39;
        byArray[6] = -64;
        byArray[7] = -27;
        byArray[8] = -28;
        byArray[9] = -123;
        byArray[10] = 87;
        byArray[11] = 53;
        byArray[12] = -22;
        byArray[13] = 12;
        byArray[14] = -82;
        byArray[15] = 65;
        byArray[16] = 35;
        byArray[17] = -17;
        byArray[18] = 107;
        byArray[19] = -109;
        byArray[20] = 69;
        byArray[21] = 25;
        byArray[22] = -91;
        byArray[23] = 33;
        byArray[24] = -19;
        byArray[25] = 14;
        byArray[26] = 79;
        byArray[27] = 78;
        byArray[28] = 29;
        byArray[29] = 101;
        byArray[30] = -110;
        byArray[31] = -67;
        byArray[32] = -122;
        byArray[33] = -72;
        byArray[34] = -81;
        byArray[35] = -113;
        byArray[36] = 124;
        byArray[37] = -21;
        byArray[38] = 31;
        byArray[39] = -50;
        byArray[40] = 62;
        byArray[41] = 48;
        byArray[42] = -36;
        byArray[43] = 95;
        byArray[44] = 94;
        byArray[45] = -59;
        byArray[46] = 11;
        byArray[47] = 26;
        byArray[48] = -90;
        byArray[49] = -31;
        byArray[50] = 57;
        byArray[51] = -54;
        byArray[52] = -43;
        byArray[53] = 71;
        byArray[54] = 93;
        byArray[55] = 61;
        byArray[56] = -39;
        byArray[57] = 1;
        byArray[58] = 90;
        byArray[59] = -42;
        byArray[60] = 81;
        byArray[61] = 86;
        byArray[62] = 108;
        byArray[63] = 77;
        byArray[64] = -117;
        byArray[65] = 13;
        byArray[66] = -102;
        byArray[67] = 102;
        byArray[68] = -5;
        byArray[69] = -52;
        byArray[70] = -80;
        byArray[71] = 45;
        byArray[72] = 116;
        byArray[73] = 18;
        byArray[74] = 43;
        byArray[75] = 32;
        byArray[76] = -16;
        byArray[77] = -79;
        byArray[78] = -124;
        byArray[79] = -103;
        byArray[80] = -33;
        byArray[81] = 76;
        byArray[82] = -53;
        byArray[83] = -62;
        byArray[84] = 52;
        byArray[85] = 126;
        byArray[86] = 118;
        byArray[87] = 5;
        byArray[88] = 109;
        byArray[89] = -73;
        byArray[90] = -87;
        byArray[91] = 49;
        byArray[92] = -47;
        byArray[93] = 23;
        byArray[94] = 4;
        byArray[95] = -41;
        byArray[96] = 20;
        byArray[97] = 88;
        byArray[98] = 58;
        byArray[99] = 97;
        byArray[100] = -34;
        byArray[101] = 27;
        byArray[102] = 17;
        byArray[103] = 28;
        byArray[104] = 50;
        byArray[105] = 15;
        byArray[106] = -100;
        byArray[107] = 22;
        byArray[108] = 83;
        byArray[109] = 24;
        byArray[110] = -14;
        byArray[111] = 34;
        byArray[112] = -2;
        byArray[113] = 68;
        byArray[114] = -49;
        byArray[115] = -78;
        byArray[116] = -61;
        byArray[117] = -75;
        byArray[118] = 122;
        byArray[119] = -111;
        byArray[120] = 36;
        byArray[121] = 8;
        byArray[122] = -24;
        byArray[123] = -88;
        byArray[124] = 96;
        byArray[125] = -4;
        byArray[126] = 105;
        byArray[127] = 80;
        byArray[128] = -86;
        byArray[129] = -48;
        byArray[130] = -96;
        byArray[131] = 125;
        byArray[132] = -95;
        byArray[133] = -119;
        byArray[134] = 98;
        byArray[135] = -105;
        byArray[136] = 84;
        byArray[137] = 91;
        byArray[138] = 30;
        byArray[139] = -107;
        byArray[140] = -32;
        byArray[141] = -1;
        byArray[142] = 100;
        byArray[143] = -46;
        byArray[144] = 16;
        byArray[145] = -60;
        byArray[146] = 0;
        byArray[147] = 72;
        byArray[148] = -93;
        byArray[149] = -9;
        byArray[150] = 117;
        byArray[151] = -37;
        byArray[152] = -118;
        byArray[153] = 3;
        byArray[154] = -26;
        byArray[155] = -38;
        byArray[156] = 9;
        byArray[157] = 63;
        byArray[158] = -35;
        byArray[159] = -108;
        byArray[160] = -121;
        byArray[161] = 92;
        byArray[162] = -125;
        byArray[163] = 2;
        byArray[164] = -51;
        byArray[165] = 74;
        byArray[166] = -112;
        byArray[167] = 51;
        byArray[168] = 115;
        byArray[169] = 103;
        byArray[170] = -10;
        byArray[171] = -13;
        byArray[172] = -99;
        byArray[173] = 127;
        byArray[174] = -65;
        byArray[175] = -30;
        byArray[176] = 82;
        byArray[177] = -101;
        byArray[178] = -40;
        byArray[179] = 38;
        byArray[180] = -56;
        byArray[181] = 55;
        byArray[182] = -58;
        byArray[183] = 59;
        byArray[184] = -127;
        byArray[185] = -106;
        byArray[186] = 111;
        byArray[187] = 75;
        byArray[188] = 19;
        byArray[189] = -66;
        byArray[190] = 99;
        byArray[191] = 46;
        byArray[192] = -23;
        byArray[193] = 121;
        byArray[194] = -89;
        byArray[195] = -116;
        byArray[196] = -97;
        byArray[197] = 110;
        byArray[198] = -68;
        byArray[199] = -114;
        byArray[200] = 41;
        byArray[201] = -11;
        byArray[202] = -7;
        byArray[203] = -74;
        byArray[204] = 47;
        byArray[205] = -3;
        byArray[206] = -76;
        byArray[207] = 89;
        byArray[208] = 120;
        byArray[209] = -104;
        byArray[210] = 6;
        byArray[211] = 106;
        byArray[212] = -25;
        byArray[213] = 70;
        byArray[214] = 113;
        byArray[215] = -70;
        byArray[216] = -44;
        byArray[217] = 37;
        byArray[218] = -85;
        byArray[219] = 66;
        byArray[220] = -120;
        byArray[221] = -94;
        byArray[222] = -115;
        byArray[223] = -6;
        byArray[224] = 114;
        byArray[225] = 7;
        byArray[226] = -71;
        byArray[227] = 85;
        byArray[228] = -8;
        byArray[229] = -18;
        byArray[230] = -84;
        byArray[231] = 10;
        byArray[232] = 54;
        byArray[233] = 73;
        byArray[234] = 42;
        byArray[235] = 104;
        byArray[236] = 60;
        byArray[237] = 56;
        byArray[238] = -15;
        byArray[239] = -92;
        byArray[240] = 64;
        byArray[241] = 40;
        byArray[242] = -45;
        byArray[243] = 123;
        byArray[244] = -69;
        byArray[245] = -55;
        byArray[246] = 67;
        byArray[247] = -63;
        byArray[248] = 21;
        byArray[249] = -29;
        byArray[250] = -83;
        byArray[251] = -12;
        byArray[252] = 119;
        byArray[253] = -57;
        byArray[254] = -128;
        byArray[255] = -98;
        cfr_renamed_152 = byArray;
    }

    private /* synthetic */ void cfr_renamed_3718(int arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 4) {
            int n3 = arg0;
            arg1[3 - n + arg2] = (byte)n3;
            arg0 = n3 >>> 8;
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (!(arg1 instanceof sprtpk)) {
            throw new IllegalArgumentException(sprtcea.cfr_renamed_9("{9x.4$}:d;qw_2m\u0007u%u:q#q%42l'q4`2py"));
        }
        this.cfr_renamed_3709(arg0, ((sprtpk)arg1).cfr_renamed_1521());
        this.cfr_renamed_1 = true;
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), this.cfr_renamed_10429(), arg1, sprlrk.cfr_renamed_9915(arg0)));
    }

    private /* synthetic */ int cfr_renamed_3711(int arg0) {
        return cfr_renamed_152[this.cfr_renamed_3716((byte)arg0, 1) & 0xFF] & 0xFF;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprrgq.cfr_renamed_9("x(V,W%R(");
    }

    private /* synthetic */ void cfr_renamed_3710(int[] arg0, int[] arg1, int arg2) {
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        int[] nArray3 = arg0;
        int[] nArray4 = arg0;
        int n = arg0[0] ^ arg1[0 + arg2];
        int n2 = this.cfr_renamed_3711(n & 0xFF);
        n2 |= this.cfr_renamed_3712(n >>> 8 & 0xFF) << 8;
        n2 |= this.cfr_renamed_3713(n >>> 16 & 0xFF) << 16;
        n2 |= (cfr_renamed_152[n >>> 24 & 0xFF] & 0xFF) << 24;
        int n3 = arg0[1] ^ arg1[1 + arg2];
        int n4 = cfr_renamed_152[n3 & 0xFF] & 0xFF;
        n4 |= this.cfr_renamed_3711(n3 >>> 8 & 0xFF) << 8;
        n4 |= this.cfr_renamed_3712(n3 >>> 16 & 0xFF) << 16;
        n4 |= this.cfr_renamed_3713(n3 >>> 24 & 0xFF) << 24;
        n4 = sprxkl.cfr_renamed_3714(n4, 8);
        n2 ^= n4;
        n4 = sprxkl.cfr_renamed_3714(n4, 8) ^ n2;
        n2 = sprxkl.cfr_renamed_3715(n2, 8) ^ n4;
        nArray4[2] = nArray4[2] ^ (sprxkl.cfr_renamed_3714(n4, 16) ^ n2);
        nArray3[3] = nArray3[3] ^ sprxkl.cfr_renamed_3714(n2, 8);
        n = arg0[2] ^ arg1[2 + arg2];
        n2 = this.cfr_renamed_3711(n & 0xFF);
        n2 |= this.cfr_renamed_3712(n >>> 8 & 0xFF) << 8;
        n2 |= this.cfr_renamed_3713(n >>> 16 & 0xFF) << 16;
        n2 |= (cfr_renamed_152[n >>> 24 & 0xFF] & 0xFF) << 24;
        n3 = arg0[3] ^ arg1[3 + arg2];
        n4 = cfr_renamed_152[n3 & 0xFF] & 0xFF;
        n4 |= this.cfr_renamed_3711(n3 >>> 8 & 0xFF) << 8;
        n4 |= this.cfr_renamed_3712(n3 >>> 16 & 0xFF) << 16;
        n4 |= this.cfr_renamed_3713(n3 >>> 24 & 0xFF) << 24;
        n4 = sprxkl.cfr_renamed_3714(n4, 8);
        n2 ^= n4;
        n4 = sprxkl.cfr_renamed_3714(n4, 8) ^ n2;
        n2 = sprxkl.cfr_renamed_3715(n2, 8) ^ n4;
        nArray2[0] = nArray2[0] ^ (sprxkl.cfr_renamed_3714(n4, 16) ^ n2);
        nArray[1] = nArray[1] ^ sprxkl.cfr_renamed_3714(n2, 8);
    }

    public sprxkl() {
        sprxkl sprxkl2 = this;
        sprxkl sprxkl3 = this;
        sprxkl3.cfr_renamed_1 = false;
        sprxkl3.cfr_renamed_119 = new int[96];
        sprxkl2.cfr_renamed_91 = new int[8];
        sprxkl2.cfr_renamed_3 = new int[12];
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), this.cfr_renamed_10429()));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3717(int[] nArray, int[] nArray2, int n) {
        void arg2;
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        v1[1] = v1[1] ^ sprxkl.cfr_renamed_3714(arg0[0] & arg1[0 + arg2], 1);
        v1[0] = v1[0] ^ (arg1[1 + arg2] | arg0[1]);
        v0[2] = v0[2] ^ (arg1[3 + arg2] | arg0[3]);
        v0[3] = v0[3] ^ sprxkl.cfr_renamed_3714(arg1[2 + arg2] & arg0[2], 1);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_3724(int n, int[] nArray, int n2, int[] nArray2, int n3) {
        void arg4;
        int arg0;
        void arg2;
        void arg1;
        void arg3;
        void v0 = arg3;
        void v1 = arg3;
        v1[2 + arg4] = arg1[1 + arg2] << arg0 - 32 | arg1[2 + arg2] >>> 64 - arg0;
        v1[3 + arg4] = arg1[2 + arg2] << arg0 - 32 | arg1[3 + arg2] >>> 64 - arg0;
        v0[0 + arg4] = arg1[3 + arg2] << arg0 - 32 | arg1[0 + arg2] >>> 64 - arg0;
        v0[1 + arg4] = arg1[0 + arg2] << arg0 - 32 | arg1[1 + arg2] >>> 64 - arg0;
        void v2 = arg1;
        arg1[0 + arg2] = arg3[2 + arg4];
        v2[1 + arg2] = arg3[3 + arg4];
        nArray[2 + arg2] = arg3[0 + arg4];
        v2[3 + arg2] = arg3[1 + arg4];
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_3722(int n, int[] nArray, int n2, int[] nArray2, int n3) {
        void arg4;
        int arg0;
        void arg2;
        void arg1;
        void arg3;
        void v0 = arg3;
        void v1 = arg3;
        v1[0 + arg4] = arg1[0 + arg2] << arg0 | arg1[1 + arg2] >>> 32 - arg0;
        v1[1 + arg4] = arg1[1 + arg2] << arg0 | arg1[2 + arg2] >>> 32 - arg0;
        v0[2 + arg4] = arg1[2 + arg2] << arg0 | arg1[3 + arg2] >>> 32 - arg0;
        v0[3 + arg4] = arg1[3 + arg2] << arg0 | arg1[0 + arg2] >>> 32 - arg0;
        void v2 = arg1;
        arg1[0 + arg2] = arg3[0 + arg4];
        v2[1 + arg2] = arg3[1 + arg4];
        nArray[2 + arg2] = arg3[2 + arg4];
        v2[3 + arg2] = arg3[3 + arg4];
    }

    @Override
    public void cfr_renamed_41() {
    }

    private /* synthetic */ int cfr_renamed_3720(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        int[] nArray = new int[4];
        int n2 = n = 0;
        while (n2 < 4) {
            int n3 = n;
            int n4 = this.cfr_renamed_3721(arg0, arg1 + n * 4) ^ this.cfr_renamed_91[n3];
            nArray[n3] = n4;
            n2 = ++n;
        }
        sprxkl sprxkl2 = this;
        int[] nArray2 = nArray;
        int[] nArray3 = nArray;
        sprxkl sprxkl3 = this;
        sprxkl sprxkl4 = this;
        sprxkl sprxkl5 = this;
        sprxkl sprxkl6 = this;
        sprxkl sprxkl7 = this;
        sprxkl sprxkl8 = this;
        sprxkl sprxkl9 = this;
        sprxkl sprxkl10 = this;
        sprxkl10.cfr_renamed_3710(nArray, sprxkl10.cfr_renamed_119, 0);
        sprxkl9.cfr_renamed_3710(nArray, sprxkl9.cfr_renamed_119, 4);
        sprxkl8.cfr_renamed_3710(nArray, sprxkl9.cfr_renamed_119, 8);
        sprxkl7.cfr_renamed_3717(nArray, sprxkl8.cfr_renamed_3, 0);
        sprxkl7.cfr_renamed_3710(nArray, sprxkl7.cfr_renamed_119, 12);
        sprxkl6.cfr_renamed_3710(nArray, sprxkl6.cfr_renamed_119, 16);
        sprxkl5.cfr_renamed_3710(nArray, sprxkl6.cfr_renamed_119, 20);
        sprxkl4.cfr_renamed_3717(nArray, sprxkl5.cfr_renamed_3, 4);
        sprxkl4.cfr_renamed_3710(nArray, sprxkl4.cfr_renamed_119, 24);
        sprxkl3.cfr_renamed_3710(nArray, sprxkl3.cfr_renamed_119, 28);
        this.cfr_renamed_3710(nArray2, sprxkl3.cfr_renamed_119, 32);
        int[] nArray4 = nArray;
        int[] nArray5 = nArray;
        nArray[2] = nArray[2] ^ this.cfr_renamed_91[4];
        nArray4[3] = nArray4[3] ^ this.cfr_renamed_91[5];
        nArray5[0] = nArray5[0] ^ this.cfr_renamed_91[6];
        nArray3[1] = nArray3[1] ^ this.cfr_renamed_91[7];
        sprxkl2.cfr_renamed_3718(nArray2[2], arg2, arg3);
        sprxkl2.cfr_renamed_3718(nArray[3], arg2, arg3 + 4);
        this.cfr_renamed_3718(nArray[0], arg2, arg3 + 8);
        this.cfr_renamed_3718(nArray[1], arg2, arg3 + 12);
        return 16;
    }

    private /* synthetic */ int cfr_renamed_10429() {
        return this.cfr_renamed_112 * 8;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws IllegalStateException {
        if (!this.cfr_renamed_1) {
            throw new IllegalStateException(sprtcea.cfr_renamed_9("\u0014u:q;x>uw}$49{#4>z>`>u;}-q3"));
        }
        if (arg1 + 16 > arg0.length) {
            throw new sprddl(sprrgq.cfr_renamed_9("R'K<OiY<]/^;\u001b=T&\u001b:S&I="));
        }
        if (arg3 + 16 > arg2.length) {
            throw new sprwjl(sprtcea.cfr_renamed_9("8a#d\"`wv\"r1q%4#{84$|8f#"));
        }
        if (this.cfr_renamed_112 == 16) {
            return this.cfr_renamed_3720(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3725(arg0, arg1, arg2, arg3);
    }

    private static /* synthetic */ int cfr_renamed_3714(int arg0, int arg1) {
        return (arg0 << arg1) + (arg0 >>> 32 - arg1);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_3719(int n, int[] nArray, int n2, int[] nArray2, int n3) {
        void arg4;
        int arg0;
        void arg2;
        void arg1;
        void arg3;
        void v0 = arg3;
        void v1 = arg3;
        v1[0 + arg4] = arg1[1 + arg2] << arg0 - 32 | arg1[2 + arg2] >>> 64 - arg0;
        v1[1 + arg4] = arg1[2 + arg2] << arg0 - 32 | arg1[3 + arg2] >>> 64 - arg0;
        v0[2 + arg4] = arg1[3 + arg2] << arg0 - 32 | arg1[0 + arg2] >>> 64 - arg0;
        v0[3 + arg4] = arg1[0 + arg2] << arg0 - 32 | arg1[1 + arg2] >>> 64 - arg0;
        void v2 = arg1;
        arg1[0 + arg2] = arg3[0 + arg4];
        v2[1 + arg2] = arg3[1 + arg4];
        nArray[2 + arg2] = arg3[2 + arg4];
        v2[3 + arg2] = arg3[3 + arg4];
    }

    private /* synthetic */ int cfr_renamed_3713(int arg0) {
        return this.cfr_renamed_3716(cfr_renamed_152[arg0], 1) & 0xFF;
    }

    private /* synthetic */ int cfr_renamed_3725(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        int[] nArray = new int[4];
        int n2 = n = 0;
        while (n2 < 4) {
            int n3 = n;
            int n4 = this.cfr_renamed_3721(arg0, arg1 + n * 4) ^ this.cfr_renamed_91[n3];
            nArray[n3] = n4;
            n2 = ++n;
        }
        sprxkl sprxkl2 = this;
        int[] nArray2 = nArray;
        int[] nArray3 = nArray;
        sprxkl sprxkl3 = this;
        sprxkl sprxkl4 = this;
        sprxkl sprxkl5 = this;
        sprxkl sprxkl6 = this;
        sprxkl sprxkl7 = this;
        sprxkl sprxkl8 = this;
        sprxkl sprxkl9 = this;
        sprxkl sprxkl10 = this;
        sprxkl sprxkl11 = this;
        sprxkl sprxkl12 = this;
        sprxkl sprxkl13 = this;
        sprxkl13.cfr_renamed_3710(nArray, sprxkl13.cfr_renamed_119, 0);
        sprxkl12.cfr_renamed_3710(nArray, sprxkl12.cfr_renamed_119, 4);
        sprxkl11.cfr_renamed_3710(nArray, sprxkl12.cfr_renamed_119, 8);
        sprxkl10.cfr_renamed_3717(nArray, sprxkl11.cfr_renamed_3, 0);
        sprxkl10.cfr_renamed_3710(nArray, sprxkl10.cfr_renamed_119, 12);
        sprxkl9.cfr_renamed_3710(nArray, sprxkl9.cfr_renamed_119, 16);
        sprxkl8.cfr_renamed_3710(nArray, sprxkl9.cfr_renamed_119, 20);
        sprxkl7.cfr_renamed_3717(nArray, sprxkl8.cfr_renamed_3, 4);
        sprxkl7.cfr_renamed_3710(nArray, sprxkl7.cfr_renamed_119, 24);
        sprxkl6.cfr_renamed_3710(nArray, sprxkl6.cfr_renamed_119, 28);
        sprxkl5.cfr_renamed_3710(nArray, sprxkl6.cfr_renamed_119, 32);
        sprxkl4.cfr_renamed_3717(nArray, sprxkl5.cfr_renamed_3, 8);
        sprxkl4.cfr_renamed_3710(nArray, sprxkl4.cfr_renamed_119, 36);
        sprxkl3.cfr_renamed_3710(nArray, sprxkl3.cfr_renamed_119, 40);
        this.cfr_renamed_3710(nArray2, sprxkl3.cfr_renamed_119, 44);
        int[] nArray4 = nArray;
        int[] nArray5 = nArray;
        nArray[2] = nArray[2] ^ this.cfr_renamed_91[4];
        nArray4[3] = nArray4[3] ^ this.cfr_renamed_91[5];
        nArray5[0] = nArray5[0] ^ this.cfr_renamed_91[6];
        nArray3[1] = nArray3[1] ^ this.cfr_renamed_91[7];
        sprxkl2.cfr_renamed_3718(nArray2[2], arg2, arg3);
        sprxkl2.cfr_renamed_3718(nArray[3], arg2, arg3 + 4);
        this.cfr_renamed_3718(nArray[0], arg2, arg3 + 8);
        this.cfr_renamed_3718(nArray[1], arg2, arg3 + 12);
        return 16;
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    private /* synthetic */ int cfr_renamed_3721(byte[] arg0, int arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < 4) {
            byte by = arg0[n + arg1];
            n2 = (n2 << 8) + (by & 0xFF);
            n3 = ++n;
        }
        return n2;
    }

    private static /* synthetic */ int cfr_renamed_3715(int arg0, int arg1) {
        return (arg0 >>> arg1) + (arg0 << 32 - arg1);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_3709(boolean bl, byte[] byArray) {
        int n;
        void arg1;
        void arg0;
        sprxkl sprxkl2 = this;
        sprxkl2.cfr_renamed_2 = arg0;
        int[] nArray = new int[8];
        int[] nArray2 = new int[4];
        int[] nArray3 = new int[4];
        int[] nArray4 = new int[4];
        sprxkl2.cfr_renamed_112 = ((void)arg1).length;
        switch (((void)arg1).length) {
            case 16: {
                nArray[0] = this.cfr_renamed_3721((byte[])arg1, 0);
                nArray[1] = this.cfr_renamed_3721((byte[])arg1, 4);
                nArray[2] = this.cfr_renamed_3721((byte[])arg1, 8);
                nArray[3] = this.cfr_renamed_3721((byte[])arg1, 12);
                nArray[7] = 0;
                nArray[6] = 0;
                nArray[5] = 0;
                nArray[4] = 0;
                break;
            }
            case 24: {
                nArray[0] = this.cfr_renamed_3721((byte[])arg1, 0);
                nArray[1] = this.cfr_renamed_3721((byte[])arg1, 4);
                nArray[2] = this.cfr_renamed_3721((byte[])arg1, 8);
                nArray[3] = this.cfr_renamed_3721((byte[])arg1, 12);
                nArray[4] = this.cfr_renamed_3721((byte[])arg1, 16);
                nArray[5] = this.cfr_renamed_3721((byte[])arg1, 20);
                nArray[6] = ~nArray[4];
                nArray[7] = ~nArray[5];
                break;
            }
            case 32: {
                nArray[0] = this.cfr_renamed_3721((byte[])arg1, 0);
                nArray[1] = this.cfr_renamed_3721((byte[])arg1, 4);
                nArray[2] = this.cfr_renamed_3721((byte[])arg1, 8);
                nArray[3] = this.cfr_renamed_3721((byte[])arg1, 12);
                nArray[4] = this.cfr_renamed_3721((byte[])arg1, 16);
                nArray[5] = this.cfr_renamed_3721((byte[])arg1, 20);
                nArray[6] = this.cfr_renamed_3721((byte[])arg1, 24);
                nArray[7] = this.cfr_renamed_3721((byte[])arg1, 28);
                break;
            }
            default: {
                throw new IllegalArgumentException(sprrgq.cfr_renamed_9("P,BiH A,HiZ;^iT'W0\u001bx\rf\t}\u0014z\tiY0O,Hg"));
            }
        }
        int n2 = n = 0;
        while (n2 < 4) {
            int n3 = n;
            int n4 = nArray[n] ^ nArray[n3 + 4];
            nArray2[n3] = n4;
            n2 = ++n;
        }
        this.cfr_renamed_3710(nArray2, cfr_renamed_86, 0);
        int n5 = n = 0;
        while (n5 < 4) {
            int n6 = n;
            int n7 = nArray2[n6] ^ nArray[n];
            nArray2[n6] = n7;
            n5 = ++n;
        }
        sprxkl sprxkl3 = this;
        sprxkl3.cfr_renamed_3710(nArray2, cfr_renamed_86, 4);
        if (sprxkl3.cfr_renamed_112 == 16) {
            sprxkl sprxkl4 = this;
            if (arg0 != false) {
                sprxkl4.cfr_renamed_91[0] = nArray[0];
                sprxkl sprxkl5 = this;
                sprxkl sprxkl6 = this;
                sprxkl sprxkl7 = this;
                sprxkl sprxkl8 = this;
                this.cfr_renamed_91[1] = nArray[1];
                sprxkl8.cfr_renamed_91[2] = nArray[2];
                sprxkl8.cfr_renamed_91[3] = nArray[3];
                sprxkl.cfr_renamed_3722(15, nArray, 0, this.cfr_renamed_119, 4);
                sprxkl.cfr_renamed_3722(30, nArray, 0, this.cfr_renamed_119, 12);
                sprxkl.cfr_renamed_3722(15, nArray, 0, nArray4, 0);
                sprxkl8.cfr_renamed_119[18] = nArray4[2];
                sprxkl7.cfr_renamed_119[19] = nArray4[3];
                sprxkl.cfr_renamed_3722(17, nArray, 0, this.cfr_renamed_3, 4);
                sprxkl.cfr_renamed_3722(17, nArray, 0, this.cfr_renamed_119, 24);
                sprxkl.cfr_renamed_3722(17, nArray, 0, this.cfr_renamed_119, 32);
                sprxkl6.cfr_renamed_119[0] = nArray2[0];
                sprxkl7.cfr_renamed_119[1] = nArray2[1];
                sprxkl6.cfr_renamed_119[2] = nArray2[2];
                sprxkl5.cfr_renamed_119[3] = nArray2[3];
                sprxkl.cfr_renamed_3722(15, nArray2, 0, this.cfr_renamed_119, 8);
                sprxkl.cfr_renamed_3722(15, nArray2, 0, this.cfr_renamed_3, 0);
                sprxkl.cfr_renamed_3722(15, nArray2, 0, nArray4, 0);
                sprxkl5.cfr_renamed_119[16] = nArray4[0];
                sprxkl5.cfr_renamed_119[17] = nArray4[1];
                sprxkl.cfr_renamed_3722(15, nArray2, 0, this.cfr_renamed_119, 20);
                sprxkl.cfr_renamed_3719(34, nArray2, 0, this.cfr_renamed_119, 28);
                sprxkl.cfr_renamed_3722(17, nArray2, 0, this.cfr_renamed_91, 4);
                return;
            }
            sprxkl4.cfr_renamed_91[4] = nArray[0];
            sprxkl sprxkl9 = this;
            sprxkl sprxkl10 = this;
            sprxkl sprxkl11 = this;
            sprxkl sprxkl12 = this;
            this.cfr_renamed_91[5] = nArray[1];
            sprxkl12.cfr_renamed_91[6] = nArray[2];
            sprxkl12.cfr_renamed_91[7] = nArray[3];
            sprxkl.cfr_renamed_3723(15, nArray, 0, this.cfr_renamed_119, 28);
            sprxkl.cfr_renamed_3723(30, nArray, 0, this.cfr_renamed_119, 20);
            sprxkl.cfr_renamed_3723(15, nArray, 0, nArray4, 0);
            sprxkl12.cfr_renamed_119[16] = nArray4[0];
            sprxkl11.cfr_renamed_119[17] = nArray4[1];
            sprxkl.cfr_renamed_3723(17, nArray, 0, this.cfr_renamed_3, 0);
            sprxkl.cfr_renamed_3723(17, nArray, 0, this.cfr_renamed_119, 8);
            sprxkl.cfr_renamed_3723(17, nArray, 0, this.cfr_renamed_119, 0);
            sprxkl10.cfr_renamed_119[34] = nArray2[0];
            sprxkl11.cfr_renamed_119[35] = nArray2[1];
            sprxkl10.cfr_renamed_119[32] = nArray2[2];
            sprxkl9.cfr_renamed_119[33] = nArray2[3];
            sprxkl.cfr_renamed_3723(15, nArray2, 0, this.cfr_renamed_119, 24);
            sprxkl.cfr_renamed_3723(15, nArray2, 0, this.cfr_renamed_3, 4);
            sprxkl.cfr_renamed_3723(15, nArray2, 0, nArray4, 0);
            sprxkl9.cfr_renamed_119[18] = nArray4[2];
            sprxkl9.cfr_renamed_119[19] = nArray4[3];
            sprxkl.cfr_renamed_3723(15, nArray2, 0, this.cfr_renamed_119, 12);
            sprxkl.cfr_renamed_3724(34, nArray2, 0, this.cfr_renamed_119, 4);
            sprxkl.cfr_renamed_3722(17, nArray2, 0, this.cfr_renamed_91, 0);
            return;
        }
        int n8 = n = 0;
        while (n8 < 4) {
            int n9 = n;
            int n10 = nArray2[n] ^ nArray[n9 + 4];
            nArray3[n9] = n10;
            n8 = ++n;
        }
        this.cfr_renamed_3710(nArray3, cfr_renamed_86, 8);
        sprxkl sprxkl13 = this;
        if (arg0 != false) {
            sprxkl13.cfr_renamed_91[0] = nArray[0];
            sprxkl sprxkl14 = this;
            sprxkl sprxkl15 = this;
            sprxkl sprxkl16 = this;
            sprxkl sprxkl17 = this;
            sprxkl sprxkl18 = this;
            sprxkl18.cfr_renamed_91[1] = nArray[1];
            sprxkl18.cfr_renamed_91[2] = nArray[2];
            sprxkl17.cfr_renamed_91[3] = nArray[3];
            sprxkl.cfr_renamed_3719(45, nArray, 0, this.cfr_renamed_119, 16);
            sprxkl.cfr_renamed_3722(15, nArray, 0, this.cfr_renamed_3, 4);
            sprxkl.cfr_renamed_3722(17, nArray, 0, this.cfr_renamed_119, 32);
            sprxkl.cfr_renamed_3719(34, nArray, 0, this.cfr_renamed_119, 44);
            sprxkl.cfr_renamed_3722(15, nArray, 4, this.cfr_renamed_119, 4);
            sprxkl.cfr_renamed_3722(15, nArray, 4, this.cfr_renamed_3, 0);
            sprxkl.cfr_renamed_3722(30, nArray, 4, this.cfr_renamed_119, 24);
            sprxkl.cfr_renamed_3719(34, nArray, 4, this.cfr_renamed_119, 36);
            sprxkl.cfr_renamed_3722(15, nArray2, 0, this.cfr_renamed_119, 8);
            sprxkl.cfr_renamed_3722(30, nArray2, 0, this.cfr_renamed_119, 20);
            sprxkl16.cfr_renamed_3[8] = nArray2[1];
            sprxkl17.cfr_renamed_3[9] = nArray2[2];
            sprxkl16.cfr_renamed_3[10] = nArray2[3];
            sprxkl15.cfr_renamed_3[11] = nArray2[0];
            sprxkl.cfr_renamed_3719(49, nArray2, 0, this.cfr_renamed_119, 40);
            sprxkl14.cfr_renamed_119[0] = nArray3[0];
            sprxkl15.cfr_renamed_119[1] = nArray3[1];
            sprxkl14.cfr_renamed_119[2] = nArray3[2];
            sprxkl14.cfr_renamed_119[3] = nArray3[3];
            sprxkl.cfr_renamed_3722(30, nArray3, 0, this.cfr_renamed_119, 12);
            sprxkl.cfr_renamed_3722(30, nArray3, 0, this.cfr_renamed_119, 28);
            sprxkl.cfr_renamed_3719(51, nArray3, 0, this.cfr_renamed_91, 4);
            return;
        }
        sprxkl13.cfr_renamed_91[4] = nArray[0];
        sprxkl sprxkl19 = this;
        sprxkl sprxkl20 = this;
        sprxkl sprxkl21 = this;
        sprxkl sprxkl22 = this;
        sprxkl sprxkl23 = this;
        sprxkl23.cfr_renamed_91[5] = nArray[1];
        sprxkl23.cfr_renamed_91[6] = nArray[2];
        sprxkl22.cfr_renamed_91[7] = nArray[3];
        sprxkl.cfr_renamed_3724(45, nArray, 0, this.cfr_renamed_119, 28);
        sprxkl.cfr_renamed_3723(15, nArray, 0, this.cfr_renamed_3, 4);
        sprxkl.cfr_renamed_3723(17, nArray, 0, this.cfr_renamed_119, 12);
        sprxkl.cfr_renamed_3724(34, nArray, 0, this.cfr_renamed_119, 0);
        sprxkl.cfr_renamed_3723(15, nArray, 4, this.cfr_renamed_119, 40);
        sprxkl.cfr_renamed_3723(15, nArray, 4, this.cfr_renamed_3, 8);
        sprxkl.cfr_renamed_3723(30, nArray, 4, this.cfr_renamed_119, 20);
        sprxkl.cfr_renamed_3724(34, nArray, 4, this.cfr_renamed_119, 8);
        sprxkl.cfr_renamed_3723(15, nArray2, 0, this.cfr_renamed_119, 36);
        sprxkl.cfr_renamed_3723(30, nArray2, 0, this.cfr_renamed_119, 24);
        sprxkl21.cfr_renamed_3[2] = nArray2[1];
        sprxkl22.cfr_renamed_3[3] = nArray2[2];
        sprxkl21.cfr_renamed_3[0] = nArray2[3];
        sprxkl20.cfr_renamed_3[1] = nArray2[0];
        sprxkl.cfr_renamed_3724(49, nArray2, 0, this.cfr_renamed_119, 4);
        sprxkl19.cfr_renamed_119[46] = nArray3[0];
        sprxkl20.cfr_renamed_119[47] = nArray3[1];
        sprxkl19.cfr_renamed_119[44] = nArray3[2];
        sprxkl19.cfr_renamed_119[45] = nArray3[3];
        sprxkl.cfr_renamed_3723(30, nArray3, 0, this.cfr_renamed_119, 32);
        sprxkl.cfr_renamed_3723(30, nArray3, 0, this.cfr_renamed_119, 16);
        sprxkl.cfr_renamed_3719(51, nArray3, 0, this.cfr_renamed_91, 0);
    }
}

