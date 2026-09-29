/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprhok;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprnfo;
import com.spire.presentation.packages.sprnmy;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprpzk
implements sprmr {
    private boolean cfr_renamed_1;
    private static final int cfr_renamed_2 = 8;
    private static byte[] cfr_renamed_3;
    private int[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = ((arg0[arg1 + 7] & 0xFF) << 8) + (arg0[arg1 + 6] & 0xFF);
        int n3 = ((arg0[arg1 + 5] & 0xFF) << 8) + (arg0[arg1 + 4] & 0xFF);
        int n4 = ((arg0[arg1 + 3] & 0xFF) << 8) + (arg0[arg1 + 2] & 0xFF);
        int n5 = ((arg0[arg1 + 1] & 0xFF) << 8) + (arg0[arg1 + 0] & 0xFF);
        int n6 = n = 60;
        while (n6 >= 44) {
            sprpzk sprpzk2 = this;
            n2 = sprpzk2.cfr_renamed_3638(n2, 11) - ((n5 & ~n3) + (n4 & n3) + this.cfr_renamed_4[n + 3]);
            sprpzk sprpzk3 = this;
            n3 = sprpzk2.cfr_renamed_3638(n3, 13) - ((n2 & ~n4) + (n5 & n4) + sprpzk3.cfr_renamed_4[n + 2]);
            n4 = sprpzk3.cfr_renamed_3638(n4, 14) - ((n3 & ~n5) + (n2 & n5) + this.cfr_renamed_4[n + 1]);
            int n7 = this.cfr_renamed_4[n];
            n5 = sprpzk2.cfr_renamed_3638(n5, 15) - ((n4 & ~n2) + (n3 & n2) + n7);
            n6 = n -= 4;
        }
        n2 -= this.cfr_renamed_4[n3 & 0x3F];
        n3 -= this.cfr_renamed_4[n4 & 0x3F];
        n4 -= this.cfr_renamed_4[n5 & 0x3F];
        n5 -= this.cfr_renamed_4[n2 & 0x3F];
        int n8 = n = 40;
        while (n8 >= 20) {
            sprpzk sprpzk4 = this;
            n2 = sprpzk4.cfr_renamed_3638(n2, 11) - ((n5 & ~n3) + (n4 & n3) + this.cfr_renamed_4[n + 3]);
            sprpzk sprpzk5 = this;
            n3 = sprpzk4.cfr_renamed_3638(n3, 13) - ((n2 & ~n4) + (n5 & n4) + sprpzk5.cfr_renamed_4[n + 2]);
            n4 = sprpzk5.cfr_renamed_3638(n4, 14) - ((n3 & ~n5) + (n2 & n5) + this.cfr_renamed_4[n + 1]);
            int n9 = this.cfr_renamed_4[n];
            n5 = sprpzk4.cfr_renamed_3638(n5, 15) - ((n4 & ~n2) + (n3 & n2) + n9);
            n8 = n -= 4;
        }
        n2 -= this.cfr_renamed_4[n3 & 0x3F];
        n3 -= this.cfr_renamed_4[n4 & 0x3F];
        n4 -= this.cfr_renamed_4[n5 & 0x3F];
        n5 -= this.cfr_renamed_4[n2 & 0x3F];
        int n10 = n = 16;
        while (n10 >= 0) {
            sprpzk sprpzk6 = this;
            n2 = sprpzk6.cfr_renamed_3638(n2, 11) - ((n5 & ~n3) + (n4 & n3) + this.cfr_renamed_4[n + 3]);
            sprpzk sprpzk7 = this;
            n3 = sprpzk6.cfr_renamed_3638(n3, 13) - ((n2 & ~n4) + (n5 & n4) + sprpzk7.cfr_renamed_4[n + 2]);
            n4 = sprpzk7.cfr_renamed_3638(n4, 14) - ((n3 & ~n5) + (n2 & n5) + this.cfr_renamed_4[n + 1]);
            int n11 = this.cfr_renamed_4[n];
            n5 = sprpzk6.cfr_renamed_3638(n5, 15) - ((n4 & ~n2) + (n3 & n2) + n11);
            n10 = n -= 4;
        }
        int n12 = arg3;
        int n13 = arg3;
        int n14 = arg3;
        arg2[n14 + 0] = (byte)n5;
        arg2[n14 + 1] = (byte)(n5 >> 8);
        arg2[arg3 + 2] = (byte)n4;
        arg2[n13 + 3] = (byte)(n4 >> 8);
        arg2[n13 + 4] = (byte)n3;
        arg2[arg3 + 5] = (byte)(n3 >> 8);
        arg2[n12 + 6] = (byte)n2;
        arg2[n12 + 7] = (byte)(n2 >> 8);
    }

    @Override
    public String cfr_renamed_1315() {
        return "RC2";
    }

    @Override
    public void cfr_renamed_41() {
    }

    private /* synthetic */ int[] cfr_renamed_3639(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3;
        int n4;
        int[] nArray = new int[128];
        int n5 = n4 = 0;
        while (n5 != arg0.length) {
            int n6 = n4++;
            nArray[n6] = arg0[n6] & 0xFF;
            n5 = n4;
        }
        n4 = arg0.length;
        if (n4 < 128) {
            n3 = 0;
            n2 = nArray[n4 - 1];
            do {
                int n7 = n2 + nArray[n3];
                ++n3;
                n2 = cfr_renamed_3[n7 & 0xFF] & 0xFF;
                nArray[n4++] = n2;
            } while (n4 < 128);
        }
        n4 = arg1 + 7 >> 3;
        nArray[128 - n4] = n2 = cfr_renamed_3[nArray[128 - n4] & 255 >> (7 & -arg1)] & 0xFF;
        int n8 = n3 = 128 - n4 - 1;
        while (n8 >= 0) {
            n2 = cfr_renamed_3[n2 ^ nArray[n3 + n4]] & 0xFF;
            nArray[n3--] = n2;
            n8 = n3;
        }
        int[] nArray2 = new int[64];
        int n9 = n = 0;
        while (n9 != nArray2.length) {
            int n10 = n;
            int n11 = nArray[2 * n10] + (nArray[2 * n + 1] << 8);
            nArray2[n10] = n11;
            n9 = ++n;
        }
        return nArray2;
    }

    static {
        byte[] byArray = new byte[256];
        byArray[0] = -39;
        byArray[1] = 120;
        byArray[2] = -7;
        byArray[3] = -60;
        byArray[4] = 25;
        byArray[5] = -35;
        byArray[6] = -75;
        byArray[7] = -19;
        byArray[8] = 40;
        byArray[9] = -23;
        byArray[10] = -3;
        byArray[11] = 121;
        byArray[12] = 74;
        byArray[13] = -96;
        byArray[14] = -40;
        byArray[15] = -99;
        byArray[16] = -58;
        byArray[17] = 126;
        byArray[18] = 55;
        byArray[19] = -125;
        byArray[20] = 43;
        byArray[21] = 118;
        byArray[22] = 83;
        byArray[23] = -114;
        byArray[24] = 98;
        byArray[25] = 76;
        byArray[26] = 100;
        byArray[27] = -120;
        byArray[28] = 68;
        byArray[29] = -117;
        byArray[30] = -5;
        byArray[31] = -94;
        byArray[32] = 23;
        byArray[33] = -102;
        byArray[34] = 89;
        byArray[35] = -11;
        byArray[36] = -121;
        byArray[37] = -77;
        byArray[38] = 79;
        byArray[39] = 19;
        byArray[40] = 97;
        byArray[41] = 69;
        byArray[42] = 109;
        byArray[43] = -115;
        byArray[44] = 9;
        byArray[45] = -127;
        byArray[46] = 125;
        byArray[47] = 50;
        byArray[48] = -67;
        byArray[49] = -113;
        byArray[50] = 64;
        byArray[51] = -21;
        byArray[52] = -122;
        byArray[53] = -73;
        byArray[54] = 123;
        byArray[55] = 11;
        byArray[56] = -16;
        byArray[57] = -107;
        byArray[58] = 33;
        byArray[59] = 34;
        byArray[60] = 92;
        byArray[61] = 107;
        byArray[62] = 78;
        byArray[63] = -126;
        byArray[64] = 84;
        byArray[65] = -42;
        byArray[66] = 101;
        byArray[67] = -109;
        byArray[68] = -50;
        byArray[69] = 96;
        byArray[70] = -78;
        byArray[71] = 28;
        byArray[72] = 115;
        byArray[73] = 86;
        byArray[74] = -64;
        byArray[75] = 20;
        byArray[76] = -89;
        byArray[77] = -116;
        byArray[78] = -15;
        byArray[79] = -36;
        byArray[80] = 18;
        byArray[81] = 117;
        byArray[82] = -54;
        byArray[83] = 31;
        byArray[84] = 59;
        byArray[85] = -66;
        byArray[86] = -28;
        byArray[87] = -47;
        byArray[88] = 66;
        byArray[89] = 61;
        byArray[90] = -44;
        byArray[91] = 48;
        byArray[92] = -93;
        byArray[93] = 60;
        byArray[94] = -74;
        byArray[95] = 38;
        byArray[96] = 111;
        byArray[97] = -65;
        byArray[98] = 14;
        byArray[99] = -38;
        byArray[100] = 70;
        byArray[101] = 105;
        byArray[102] = 7;
        byArray[103] = 87;
        byArray[104] = 39;
        byArray[105] = -14;
        byArray[106] = 29;
        byArray[107] = -101;
        byArray[108] = -68;
        byArray[109] = -108;
        byArray[110] = 67;
        byArray[111] = 3;
        byArray[112] = -8;
        byArray[113] = 17;
        byArray[114] = -57;
        byArray[115] = -10;
        byArray[116] = -112;
        byArray[117] = -17;
        byArray[118] = 62;
        byArray[119] = -25;
        byArray[120] = 6;
        byArray[121] = -61;
        byArray[122] = -43;
        byArray[123] = 47;
        byArray[124] = -56;
        byArray[125] = 102;
        byArray[126] = 30;
        byArray[127] = -41;
        byArray[128] = 8;
        byArray[129] = -24;
        byArray[130] = -22;
        byArray[131] = -34;
        byArray[132] = -128;
        byArray[133] = 82;
        byArray[134] = -18;
        byArray[135] = -9;
        byArray[136] = -124;
        byArray[137] = -86;
        byArray[138] = 114;
        byArray[139] = -84;
        byArray[140] = 53;
        byArray[141] = 77;
        byArray[142] = 106;
        byArray[143] = 42;
        byArray[144] = -106;
        byArray[145] = 26;
        byArray[146] = -46;
        byArray[147] = 113;
        byArray[148] = 90;
        byArray[149] = 21;
        byArray[150] = 73;
        byArray[151] = 116;
        byArray[152] = 75;
        byArray[153] = -97;
        byArray[154] = -48;
        byArray[155] = 94;
        byArray[156] = 4;
        byArray[157] = 24;
        byArray[158] = -92;
        byArray[159] = -20;
        byArray[160] = -62;
        byArray[161] = -32;
        byArray[162] = 65;
        byArray[163] = 110;
        byArray[164] = 15;
        byArray[165] = 81;
        byArray[166] = -53;
        byArray[167] = -52;
        byArray[168] = 36;
        byArray[169] = -111;
        byArray[170] = -81;
        byArray[171] = 80;
        byArray[172] = -95;
        byArray[173] = -12;
        byArray[174] = 112;
        byArray[175] = 57;
        byArray[176] = -103;
        byArray[177] = 124;
        byArray[178] = 58;
        byArray[179] = -123;
        byArray[180] = 35;
        byArray[181] = -72;
        byArray[182] = -76;
        byArray[183] = 122;
        byArray[184] = -4;
        byArray[185] = 2;
        byArray[186] = 54;
        byArray[187] = 91;
        byArray[188] = 37;
        byArray[189] = 85;
        byArray[190] = -105;
        byArray[191] = 49;
        byArray[192] = 45;
        byArray[193] = 93;
        byArray[194] = -6;
        byArray[195] = -104;
        byArray[196] = -29;
        byArray[197] = -118;
        byArray[198] = -110;
        byArray[199] = -82;
        byArray[200] = 5;
        byArray[201] = -33;
        byArray[202] = 41;
        byArray[203] = 16;
        byArray[204] = 103;
        byArray[205] = 108;
        byArray[206] = -70;
        byArray[207] = -55;
        byArray[208] = -45;
        byArray[209] = 0;
        byArray[210] = -26;
        byArray[211] = -49;
        byArray[212] = -31;
        byArray[213] = -98;
        byArray[214] = -88;
        byArray[215] = 44;
        byArray[216] = 99;
        byArray[217] = 22;
        byArray[218] = 1;
        byArray[219] = 63;
        byArray[220] = 88;
        byArray[221] = -30;
        byArray[222] = -119;
        byArray[223] = -87;
        byArray[224] = 13;
        byArray[225] = 56;
        byArray[226] = 52;
        byArray[227] = 27;
        byArray[228] = -85;
        byArray[229] = 51;
        byArray[230] = -1;
        byArray[231] = -80;
        byArray[232] = -69;
        byArray[233] = 72;
        byArray[234] = 12;
        byArray[235] = 95;
        byArray[236] = -71;
        byArray[237] = -79;
        byArray[238] = -51;
        byArray[239] = 46;
        byArray[240] = -59;
        byArray[241] = -13;
        byArray[242] = -37;
        byArray[243] = 71;
        byArray[244] = -27;
        byArray[245] = -91;
        byArray[246] = -100;
        byArray[247] = 119;
        byArray[248] = 10;
        byArray[249] = -90;
        byArray[250] = 32;
        byArray[251] = 104;
        byArray[252] = -2;
        byArray[253] = 127;
        byArray[254] = -63;
        byArray[255] = -83;
        cfr_renamed_3 = byArray;
    }

    private /* synthetic */ void cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = ((arg0[arg1 + 7] & 0xFF) << 8) + (arg0[arg1 + 6] & 0xFF);
        int n3 = ((arg0[arg1 + 5] & 0xFF) << 8) + (arg0[arg1 + 4] & 0xFF);
        int n4 = ((arg0[arg1 + 3] & 0xFF) << 8) + (arg0[arg1 + 2] & 0xFF);
        int n5 = ((arg0[arg1 + 1] & 0xFF) << 8) + (arg0[arg1 + 0] & 0xFF);
        int n6 = n = 0;
        while (n6 <= 16) {
            sprpzk sprpzk2 = this;
            sprpzk sprpzk3 = this;
            n5 = sprpzk3.cfr_renamed_3638(n5 + (n4 & ~n2) + (n3 & n2) + sprpzk3.cfr_renamed_4[n], 1);
            sprpzk sprpzk4 = this;
            n4 = sprpzk2.cfr_renamed_3638(n4 + (n3 & ~n5) + (n2 & n5) + sprpzk4.cfr_renamed_4[n + 1], 2);
            n3 = sprpzk4.cfr_renamed_3638(n3 + (n2 & ~n4) + (n5 & n4) + this.cfr_renamed_4[n + 2], 3);
            int n7 = n2 + (n5 & ~n3) + (n4 & n3) + this.cfr_renamed_4[n + 3];
            n2 = sprpzk2.cfr_renamed_3638(n7, 5);
            n6 = n += 4;
        }
        n3 += this.cfr_renamed_4[(n4 += this.cfr_renamed_4[(n5 += this.cfr_renamed_4[n2 & 0x3F]) & 0x3F]) & 0x3F];
        n2 += this.cfr_renamed_4[n3 & 0x3F];
        int n8 = n = 20;
        while (n8 <= 40) {
            sprpzk sprpzk5 = this;
            sprpzk sprpzk6 = this;
            n5 = sprpzk6.cfr_renamed_3638(n5 + (n4 & ~n2) + (n3 & n2) + sprpzk6.cfr_renamed_4[n], 1);
            sprpzk sprpzk7 = this;
            n4 = sprpzk5.cfr_renamed_3638(n4 + (n3 & ~n5) + (n2 & n5) + sprpzk7.cfr_renamed_4[n + 1], 2);
            n3 = sprpzk7.cfr_renamed_3638(n3 + (n2 & ~n4) + (n5 & n4) + this.cfr_renamed_4[n + 2], 3);
            int n9 = n2 + (n5 & ~n3) + (n4 & n3) + this.cfr_renamed_4[n + 3];
            n2 = sprpzk5.cfr_renamed_3638(n9, 5);
            n8 = n += 4;
        }
        n3 += this.cfr_renamed_4[(n4 += this.cfr_renamed_4[(n5 += this.cfr_renamed_4[n2 & 0x3F]) & 0x3F]) & 0x3F];
        n2 += this.cfr_renamed_4[n3 & 0x3F];
        int n10 = n = 44;
        while (n10 < 64) {
            sprpzk sprpzk8 = this;
            sprpzk sprpzk9 = this;
            n5 = sprpzk9.cfr_renamed_3638(n5 + (n4 & ~n2) + (n3 & n2) + sprpzk9.cfr_renamed_4[n], 1);
            sprpzk sprpzk10 = this;
            n4 = sprpzk8.cfr_renamed_3638(n4 + (n3 & ~n5) + (n2 & n5) + sprpzk10.cfr_renamed_4[n + 1], 2);
            n3 = sprpzk10.cfr_renamed_3638(n3 + (n2 & ~n4) + (n5 & n4) + this.cfr_renamed_4[n + 2], 3);
            int n11 = n2 + (n5 & ~n3) + (n4 & n3) + this.cfr_renamed_4[n + 3];
            n2 = sprpzk8.cfr_renamed_3638(n11, 5);
            n10 = n += 4;
        }
        int n12 = arg3;
        int n13 = arg3;
        int n14 = arg3;
        arg2[n14 + 0] = (byte)n5;
        arg2[n14 + 1] = (byte)(n5 >> 8);
        arg2[arg3 + 2] = (byte)n4;
        arg2[n13 + 3] = (byte)(n4 >> 8);
        arg2[n13 + 4] = (byte)n3;
        arg2[arg3 + 5] = (byte)(n3 >> 8);
        arg2[n12 + 6] = (byte)n2;
        arg2[n12 + 7] = (byte)(n2 >> 8);
    }

    private /* synthetic */ int cfr_renamed_3638(int arg0, int arg1) {
        return (arg0 &= 0xFFFF) << arg1 | arg0 >> 16 - arg1;
    }

    @Override
    public final int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprnfo.cfr_renamed_9("KK+(|f~awm9fv|9awamaxdp{|l"));
        }
        if (arg1 + 8 > arg0.length) {
            throw new sprddl(sprnmy.cfr_renamed_9("\u0006O\u001fT\u001b\u0001\rT\tG\nSOU\u0000NOR\u0007N\u001dU"));
        }
        if (arg3 + 8 > arg2.length) {
            throw new sprwjl(sprnfo.cfr_renamed_9("gl|i}m({}\u007fn|z9|vg9{qgk|"));
        }
        if (this.cfr_renamed_1) {
            this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        } else {
            this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
        }
        return 8;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        byte[] byArray;
        void arg1;
        void arg0;
        this.cfr_renamed_1 = arg0;
        if (sprbj2 instanceof sprhok) {
            sprhok sprhok2;
            sprhok sprhok3 = sprhok2 = (sprhok)arg1;
            this.cfr_renamed_4 = this.cfr_renamed_3639(sprhok3.cfr_renamed_1521(), sprhok2.cfr_renamed_3344());
            byArray = sprhok3.cfr_renamed_1521();
        } else if (arg1 instanceof sprtpk) {
            byArray = ((sprtpk)arg1).cfr_renamed_1521();
            this.cfr_renamed_4 = this.cfr_renamed_3639(byArray, byArray.length * 8);
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprnmy.cfr_renamed_9("H\u0001W\u000eM\u0006EOQ\u000eS\u000eL\nU\nSOQ\u000eR\u001cD\u000b\u0001\u001bNOs,\u0013OH\u0001H\u001b\u0001B\u0001")).append(arg1.getClass().getName()).toString());
        }
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), byArray.length * 8, arg1, sprlrk.cfr_renamed_9915((boolean)arg0)));
    }

    @Override
    public int cfr_renamed_1195() {
        return 8;
    }
}

