/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spri;
import com.spire.presentation.packages.sprpgm;
import com.spire.presentation.packages.sprwla;
import com.spire.presentation.packages.spryua;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprsta
extends spryua {
    private static final long[] cfr_renamed_112;
    private long[] cfr_renamed_119;
    private int cfr_renamed_91;
    private static final long[] cfr_renamed_0;
    private int cfr_renamed_1;
    private static final int cfr_renamed_2 = 64;
    private static final int[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsta(sprwla sprwla2, BigInteger bigInteger) {
        void arg0;
        sprsta sprsta2 = this;
        sprsta sprsta3 = this;
        sprsta sprsta4 = this;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = sprsta4.cfr_renamed_4.cfr_renamed_813();
        sprsta3.cfr_renamed_91 = this.cfr_renamed_4.cfr_renamed_1069();
        sprsta3.cfr_renamed_1 = arg0.cfr_renamed_1070();
        sprsta2.cfr_renamed_119 = new long[sprsta2.cfr_renamed_91];
        sprsta2.cfr_renamed_1072(bigInteger);
    }

    static {
        long[] lArray = new long[64];
        lArray[0] = 1L;
        lArray[1] = 2L;
        lArray[2] = 4L;
        lArray[3] = 8L;
        lArray[4] = 16L;
        lArray[5] = 32L;
        lArray[6] = 64L;
        lArray[7] = 128L;
        lArray[8] = 256L;
        lArray[9] = 512L;
        lArray[10] = 1024L;
        lArray[11] = 2048L;
        lArray[12] = 4096L;
        lArray[13] = 8192L;
        lArray[14] = 16384L;
        lArray[15] = 32768L;
        lArray[16] = 65536L;
        lArray[17] = 131072L;
        lArray[18] = 262144L;
        lArray[19] = 524288L;
        lArray[20] = 0x100000L;
        lArray[21] = 0x200000L;
        lArray[22] = 0x400000L;
        lArray[23] = 0x800000L;
        lArray[24] = 0x1000000L;
        lArray[25] = 0x2000000L;
        lArray[26] = 0x4000000L;
        lArray[27] = 0x8000000L;
        lArray[28] = 0x10000000L;
        lArray[29] = 0x20000000L;
        lArray[30] = 0x40000000L;
        lArray[31] = 0x80000000L;
        lArray[32] = 0x100000000L;
        lArray[33] = 0x200000000L;
        lArray[34] = 0x400000000L;
        lArray[35] = 0x800000000L;
        lArray[36] = 0x1000000000L;
        lArray[37] = 0x2000000000L;
        lArray[38] = 0x4000000000L;
        lArray[39] = 0x8000000000L;
        lArray[40] = 0x10000000000L;
        lArray[41] = 0x20000000000L;
        lArray[42] = 0x40000000000L;
        lArray[43] = 0x80000000000L;
        lArray[44] = 0x100000000000L;
        lArray[45] = 0x200000000000L;
        lArray[46] = 0x400000000000L;
        lArray[47] = 0x800000000000L;
        lArray[48] = 0x1000000000000L;
        lArray[49] = 0x2000000000000L;
        lArray[50] = 0x4000000000000L;
        lArray[51] = 0x8000000000000L;
        lArray[52] = 0x10000000000000L;
        lArray[53] = 0x20000000000000L;
        lArray[54] = 0x40000000000000L;
        lArray[55] = 0x80000000000000L;
        lArray[56] = 0x100000000000000L;
        lArray[57] = 0x200000000000000L;
        lArray[58] = 0x400000000000000L;
        lArray[59] = 0x800000000000000L;
        lArray[60] = 0x1000000000000000L;
        lArray[61] = 0x2000000000000000L;
        lArray[62] = 0x4000000000000000L;
        lArray[63] = Long.MIN_VALUE;
        cfr_renamed_112 = lArray;
        long[] lArray2 = new long[64];
        lArray2[0] = 1L;
        lArray2[1] = 3L;
        lArray2[2] = 7L;
        lArray2[3] = 15L;
        lArray2[4] = 31L;
        lArray2[5] = 63L;
        lArray2[6] = 127L;
        lArray2[7] = 255L;
        lArray2[8] = 511L;
        lArray2[9] = 1023L;
        lArray2[10] = 2047L;
        lArray2[11] = 4095L;
        lArray2[12] = 8191L;
        lArray2[13] = 16383L;
        lArray2[14] = 32767L;
        lArray2[15] = 65535L;
        lArray2[16] = 131071L;
        lArray2[17] = 262143L;
        lArray2[18] = 524287L;
        lArray2[19] = 1048575L;
        lArray2[20] = 0x1FFFFFL;
        lArray2[21] = 0x3FFFFFL;
        lArray2[22] = 0x7FFFFFL;
        lArray2[23] = 0xFFFFFFL;
        lArray2[24] = 0x1FFFFFFL;
        lArray2[25] = 0x3FFFFFFL;
        lArray2[26] = 0x7FFFFFFL;
        lArray2[27] = 0xFFFFFFFL;
        lArray2[28] = 0x1FFFFFFFL;
        lArray2[29] = 0x3FFFFFFFL;
        lArray2[30] = Integer.MAX_VALUE;
        lArray2[31] = 0xFFFFFFFFL;
        lArray2[32] = 0x1FFFFFFFFL;
        lArray2[33] = 0x3FFFFFFFFL;
        lArray2[34] = 0x7FFFFFFFFL;
        lArray2[35] = 0xFFFFFFFFFL;
        lArray2[36] = 0x1FFFFFFFFFL;
        lArray2[37] = 0x3FFFFFFFFFL;
        lArray2[38] = 0x7FFFFFFFFFL;
        lArray2[39] = 0xFFFFFFFFFFL;
        lArray2[40] = 0x1FFFFFFFFFFL;
        lArray2[41] = 0x3FFFFFFFFFFL;
        lArray2[42] = 0x7FFFFFFFFFFL;
        lArray2[43] = 0xFFFFFFFFFFFL;
        lArray2[44] = 0x1FFFFFFFFFFFL;
        lArray2[45] = 0x3FFFFFFFFFFFL;
        lArray2[46] = 0x7FFFFFFFFFFFL;
        lArray2[47] = 0xFFFFFFFFFFFFL;
        lArray2[48] = 0x1FFFFFFFFFFFFL;
        lArray2[49] = 0x3FFFFFFFFFFFFL;
        lArray2[50] = 0x7FFFFFFFFFFFFL;
        lArray2[51] = 0xFFFFFFFFFFFFFL;
        lArray2[52] = 0x1FFFFFFFFFFFFFL;
        lArray2[53] = 0x3FFFFFFFFFFFFFL;
        lArray2[54] = 0x7FFFFFFFFFFFFFL;
        lArray2[55] = 0xFFFFFFFFFFFFFFL;
        lArray2[56] = 0x1FFFFFFFFFFFFFFL;
        lArray2[57] = 0x3FFFFFFFFFFFFFFL;
        lArray2[58] = 0x7FFFFFFFFFFFFFFL;
        lArray2[59] = 0xFFFFFFFFFFFFFFFL;
        lArray2[60] = 0x1FFFFFFFFFFFFFFFL;
        lArray2[61] = 0x3FFFFFFFFFFFFFFFL;
        lArray2[62] = Long.MAX_VALUE;
        lArray2[63] = -1L;
        cfr_renamed_0 = lArray2;
        int[] nArray = new int[384];
        nArray[0] = 0;
        nArray[1] = 0;
        nArray[2] = 0;
        nArray[3] = 0;
        nArray[4] = 0;
        nArray[5] = 0;
        nArray[6] = 0;
        nArray[7] = 0;
        nArray[8] = 0;
        nArray[9] = 0;
        nArray[10] = 0;
        nArray[11] = 0;
        nArray[12] = 0;
        nArray[13] = 0;
        nArray[14] = 0;
        nArray[15] = 0;
        nArray[16] = 0;
        nArray[17] = 0;
        nArray[18] = 0;
        nArray[19] = 0;
        nArray[20] = 0;
        nArray[21] = 0;
        nArray[22] = 0;
        nArray[23] = 0;
        nArray[24] = 0;
        nArray[25] = 0;
        nArray[26] = 0;
        nArray[27] = 0;
        nArray[28] = 0;
        nArray[29] = 0;
        nArray[30] = 0;
        nArray[31] = 0;
        nArray[32] = 0;
        nArray[33] = 0;
        nArray[34] = 0;
        nArray[35] = 0;
        nArray[36] = 0;
        nArray[37] = 0;
        nArray[38] = 0;
        nArray[39] = 0;
        nArray[40] = 0;
        nArray[41] = 0;
        nArray[42] = 0;
        nArray[43] = 0;
        nArray[44] = 0;
        nArray[45] = 0;
        nArray[46] = 0;
        nArray[47] = 0;
        nArray[48] = 0;
        nArray[49] = 0;
        nArray[50] = 0;
        nArray[51] = 0;
        nArray[52] = 0;
        nArray[53] = 0;
        nArray[54] = 0;
        nArray[55] = 0;
        nArray[56] = 0;
        nArray[57] = 0;
        nArray[58] = 0;
        nArray[59] = 0;
        nArray[60] = 0;
        nArray[61] = 0;
        nArray[62] = 0;
        nArray[63] = 0;
        nArray[64] = 1;
        nArray[65] = 1;
        nArray[66] = 1;
        nArray[67] = 1;
        nArray[68] = 1;
        nArray[69] = 1;
        nArray[70] = 1;
        nArray[71] = 1;
        nArray[72] = 1;
        nArray[73] = 1;
        nArray[74] = 1;
        nArray[75] = 1;
        nArray[76] = 1;
        nArray[77] = 1;
        nArray[78] = 1;
        nArray[79] = 1;
        nArray[80] = 1;
        nArray[81] = 1;
        nArray[82] = 1;
        nArray[83] = 1;
        nArray[84] = 1;
        nArray[85] = 1;
        nArray[86] = 1;
        nArray[87] = 1;
        nArray[88] = 1;
        nArray[89] = 1;
        nArray[90] = 1;
        nArray[91] = 1;
        nArray[92] = 1;
        nArray[93] = 1;
        nArray[94] = 1;
        nArray[95] = 1;
        nArray[96] = 1;
        nArray[97] = 1;
        nArray[98] = 1;
        nArray[99] = 1;
        nArray[100] = 1;
        nArray[101] = 1;
        nArray[102] = 1;
        nArray[103] = 1;
        nArray[104] = 1;
        nArray[105] = 1;
        nArray[106] = 1;
        nArray[107] = 1;
        nArray[108] = 1;
        nArray[109] = 1;
        nArray[110] = 1;
        nArray[111] = 1;
        nArray[112] = 1;
        nArray[113] = 1;
        nArray[114] = 1;
        nArray[115] = 1;
        nArray[116] = 1;
        nArray[117] = 1;
        nArray[118] = 1;
        nArray[119] = 1;
        nArray[120] = 1;
        nArray[121] = 1;
        nArray[122] = 1;
        nArray[123] = 1;
        nArray[124] = 1;
        nArray[125] = 1;
        nArray[126] = 1;
        nArray[127] = 1;
        nArray[128] = 2;
        nArray[129] = 2;
        nArray[130] = 2;
        nArray[131] = 2;
        nArray[132] = 2;
        nArray[133] = 2;
        nArray[134] = 2;
        nArray[135] = 2;
        nArray[136] = 2;
        nArray[137] = 2;
        nArray[138] = 2;
        nArray[139] = 2;
        nArray[140] = 2;
        nArray[141] = 2;
        nArray[142] = 2;
        nArray[143] = 2;
        nArray[144] = 2;
        nArray[145] = 2;
        nArray[146] = 2;
        nArray[147] = 2;
        nArray[148] = 2;
        nArray[149] = 2;
        nArray[150] = 2;
        nArray[151] = 2;
        nArray[152] = 2;
        nArray[153] = 2;
        nArray[154] = 2;
        nArray[155] = 2;
        nArray[156] = 2;
        nArray[157] = 2;
        nArray[158] = 2;
        nArray[159] = 2;
        nArray[160] = 2;
        nArray[161] = 2;
        nArray[162] = 2;
        nArray[163] = 2;
        nArray[164] = 2;
        nArray[165] = 2;
        nArray[166] = 2;
        nArray[167] = 2;
        nArray[168] = 2;
        nArray[169] = 2;
        nArray[170] = 2;
        nArray[171] = 2;
        nArray[172] = 2;
        nArray[173] = 2;
        nArray[174] = 2;
        nArray[175] = 2;
        nArray[176] = 2;
        nArray[177] = 2;
        nArray[178] = 2;
        nArray[179] = 2;
        nArray[180] = 2;
        nArray[181] = 2;
        nArray[182] = 2;
        nArray[183] = 2;
        nArray[184] = 2;
        nArray[185] = 2;
        nArray[186] = 2;
        nArray[187] = 2;
        nArray[188] = 2;
        nArray[189] = 2;
        nArray[190] = 2;
        nArray[191] = 2;
        nArray[192] = 3;
        nArray[193] = 3;
        nArray[194] = 3;
        nArray[195] = 3;
        nArray[196] = 3;
        nArray[197] = 3;
        nArray[198] = 3;
        nArray[199] = 3;
        nArray[200] = 3;
        nArray[201] = 3;
        nArray[202] = 3;
        nArray[203] = 3;
        nArray[204] = 3;
        nArray[205] = 3;
        nArray[206] = 3;
        nArray[207] = 3;
        nArray[208] = 3;
        nArray[209] = 3;
        nArray[210] = 3;
        nArray[211] = 3;
        nArray[212] = 3;
        nArray[213] = 3;
        nArray[214] = 3;
        nArray[215] = 3;
        nArray[216] = 3;
        nArray[217] = 3;
        nArray[218] = 3;
        nArray[219] = 3;
        nArray[220] = 3;
        nArray[221] = 3;
        nArray[222] = 3;
        nArray[223] = 3;
        nArray[224] = 3;
        nArray[225] = 3;
        nArray[226] = 3;
        nArray[227] = 3;
        nArray[228] = 3;
        nArray[229] = 3;
        nArray[230] = 3;
        nArray[231] = 3;
        nArray[232] = 3;
        nArray[233] = 3;
        nArray[234] = 3;
        nArray[235] = 3;
        nArray[236] = 3;
        nArray[237] = 3;
        nArray[238] = 3;
        nArray[239] = 3;
        nArray[240] = 3;
        nArray[241] = 3;
        nArray[242] = 3;
        nArray[243] = 3;
        nArray[244] = 3;
        nArray[245] = 3;
        nArray[246] = 3;
        nArray[247] = 3;
        nArray[248] = 3;
        nArray[249] = 3;
        nArray[250] = 3;
        nArray[251] = 3;
        nArray[252] = 3;
        nArray[253] = 3;
        nArray[254] = 3;
        nArray[255] = 3;
        nArray[256] = 4;
        nArray[257] = 4;
        nArray[258] = 4;
        nArray[259] = 4;
        nArray[260] = 4;
        nArray[261] = 4;
        nArray[262] = 4;
        nArray[263] = 4;
        nArray[264] = 4;
        nArray[265] = 4;
        nArray[266] = 4;
        nArray[267] = 4;
        nArray[268] = 4;
        nArray[269] = 4;
        nArray[270] = 4;
        nArray[271] = 4;
        nArray[272] = 4;
        nArray[273] = 4;
        nArray[274] = 4;
        nArray[275] = 4;
        nArray[276] = 4;
        nArray[277] = 4;
        nArray[278] = 4;
        nArray[279] = 4;
        nArray[280] = 4;
        nArray[281] = 4;
        nArray[282] = 4;
        nArray[283] = 4;
        nArray[284] = 4;
        nArray[285] = 4;
        nArray[286] = 4;
        nArray[287] = 4;
        nArray[288] = 4;
        nArray[289] = 4;
        nArray[290] = 4;
        nArray[291] = 4;
        nArray[292] = 4;
        nArray[293] = 4;
        nArray[294] = 4;
        nArray[295] = 4;
        nArray[296] = 4;
        nArray[297] = 4;
        nArray[298] = 4;
        nArray[299] = 4;
        nArray[300] = 4;
        nArray[301] = 4;
        nArray[302] = 4;
        nArray[303] = 4;
        nArray[304] = 4;
        nArray[305] = 4;
        nArray[306] = 4;
        nArray[307] = 4;
        nArray[308] = 4;
        nArray[309] = 4;
        nArray[310] = 4;
        nArray[311] = 4;
        nArray[312] = 4;
        nArray[313] = 4;
        nArray[314] = 4;
        nArray[315] = 4;
        nArray[316] = 4;
        nArray[317] = 4;
        nArray[318] = 4;
        nArray[319] = 4;
        nArray[320] = 5;
        nArray[321] = 5;
        nArray[322] = 5;
        nArray[323] = 5;
        nArray[324] = 5;
        nArray[325] = 5;
        nArray[326] = 5;
        nArray[327] = 5;
        nArray[328] = 5;
        nArray[329] = 5;
        nArray[330] = 5;
        nArray[331] = 5;
        nArray[332] = 5;
        nArray[333] = 5;
        nArray[334] = 5;
        nArray[335] = 5;
        nArray[336] = 5;
        nArray[337] = 5;
        nArray[338] = 5;
        nArray[339] = 5;
        nArray[340] = 5;
        nArray[341] = 5;
        nArray[342] = 5;
        nArray[343] = 5;
        nArray[344] = 5;
        nArray[345] = 5;
        nArray[346] = 5;
        nArray[347] = 5;
        nArray[348] = 5;
        nArray[349] = 5;
        nArray[350] = 5;
        nArray[351] = 5;
        nArray[352] = 5;
        nArray[353] = 5;
        nArray[354] = 5;
        nArray[355] = 5;
        nArray[356] = 5;
        nArray[357] = 5;
        nArray[358] = 5;
        nArray[359] = 5;
        nArray[360] = 5;
        nArray[361] = 5;
        nArray[362] = 5;
        nArray[363] = 5;
        nArray[364] = 5;
        nArray[365] = 5;
        nArray[366] = 5;
        nArray[367] = 5;
        nArray[368] = 5;
        nArray[369] = 5;
        nArray[370] = 5;
        nArray[371] = 5;
        nArray[372] = 5;
        nArray[373] = 5;
        nArray[374] = 5;
        nArray[375] = 5;
        nArray[376] = 5;
        nArray[377] = 5;
        nArray[378] = 5;
        nArray[379] = 5;
        nArray[380] = 5;
        nArray[381] = 5;
        nArray[382] = 5;
        nArray[383] = 5;
        cfr_renamed_4 = nArray;
    }

    @Override
    public spri cfr_renamed_955(spri arg0) throws RuntimeException {
        sprsta sprsta2 = new sprsta(this);
        sprsta2.cfr_renamed_135(arg0);
        return sprsta2;
    }

    public static sprsta cfr_renamed_1021(sprwla arg0) {
        int n;
        int n2 = arg0.cfr_renamed_1069();
        long[] lArray = new long[n2];
        int n3 = n = 0;
        while (n3 < n2 - 1) {
            lArray[n++] = -1L;
            n3 = n;
        }
        lArray[n2 - 1] = cfr_renamed_0[arg0.cfr_renamed_1070() - 1];
        return new sprsta(arg0, lArray);
    }

    @Override
    public String cfr_renamed_957(int arg0) {
        String string;
        block7: {
            int n;
            long[] lArray;
            block6: {
                int n2;
                string = "";
                sprsta sprsta2 = this;
                lArray = sprsta2.cfr_renamed_1073();
                int n3 = sprsta2.cfr_renamed_1;
                if (arg0 != 2) break block6;
                int n4 = n2 = n3 - 1;
                while (n4 >= 0) {
                    string = (lArray[lArray.length - 1] & 1L << n2) == 0L ? new StringBuilder().insert(0, string).append("0").toString() : new StringBuilder().insert(0, string).append("1").toString();
                    n4 = --n2;
                }
                int n5 = n2 = lArray.length - 2;
                while (n5 >= 0) {
                    int n6;
                    int n7 = n6 = 63;
                    while (n7 >= 0) {
                        StringBuilder stringBuilder;
                        if ((lArray[n2] & cfr_renamed_112[n6]) == 0L) {
                            stringBuilder = new StringBuilder();
                            string = stringBuilder.insert(0, string).append("0").toString();
                        } else {
                            stringBuilder = new StringBuilder();
                            string = stringBuilder.insert(0, string).append("1").toString();
                        }
                        n7 = --n6;
                    }
                    n5 = --n2;
                }
                break block7;
            }
            if (arg0 != 16) break block7;
            char[] cArray = new char[16];
            cArray[0] = 48;
            cArray[1] = 49;
            cArray[2] = 50;
            cArray[3] = 51;
            cArray[4] = 52;
            cArray[5] = 53;
            cArray[6] = 54;
            cArray[7] = 55;
            cArray[8] = 56;
            cArray[9] = 57;
            cArray[10] = 97;
            cArray[11] = 98;
            cArray[12] = 99;
            cArray[13] = 100;
            cArray[14] = 101;
            cArray[15] = 102;
            char[] cArray2 = cArray;
            int n8 = n = lArray.length - 1;
            while (n8 >= 0) {
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 60) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 56) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 52) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 48) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 44) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 40) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 36) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 32) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 28) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 24) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 20) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 16) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 12) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 8) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)(lArray[n] >>> 4) & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[(int)lArray[n] & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(" ").toString();
                n8 = --n;
            }
        }
        return string;
    }

    @Override
    public BigInteger cfr_renamed_953() {
        return new BigInteger(1, this.cfr_renamed_954());
    }

    public static sprsta cfr_renamed_1060(sprwla arg0) {
        long[] lArray = new long[arg0.cfr_renamed_1069()];
        return new sprsta(arg0, lArray);
    }

    private /* synthetic */ void cfr_renamed_1074(long[] arg0) {
        System.arraycopy(arg0, 0, this.cfr_renamed_119, 0, this.cfr_renamed_91);
    }

    @Override
    public int hashCode() {
        return this.cfr_renamed_119.hashCode();
    }

    public void cfr_renamed_1075() throws ArithmeticException {
        int n;
        int n2;
        boolean bl;
        if (this.cfr_renamed_805()) {
            throw new ArithmeticException();
        }
        boolean bl2 = bl = false;
        for (n2 = 31; !bl2 && n2 >= 0; --n2) {
            if (((long)(this.cfr_renamed_3 - 1) & cfr_renamed_112[n2]) != 0L) {
                bl = true;
            }
            bl2 = bl;
        }
        spryua spryua2 = sprsta.cfr_renamed_1060((sprwla)this.cfr_renamed_4);
        sprsta sprsta2 = new sprsta(this);
        int n3 = 1;
        int n4 = n = ++n2 - 1;
        while (n4 >= 0) {
            int n5;
            spryua2 = (spryua)((spryua)sprsta2).clone();
            int n6 = n5 = 1;
            while (n6 <= n3) {
                spryua2.cfr_renamed_1040();
                n6 = ++n5;
            }
            sprsta2.cfr_renamed_135(spryua2);
            n3 <<= 1;
            if (((long)(this.cfr_renamed_3 - 1) & cfr_renamed_112[n]) != 0L) {
                sprsta sprsta3 = sprsta2;
                ++n3;
                ((spryua)sprsta3).cfr_renamed_1040();
                sprsta3.cfr_renamed_135(this);
            }
            n4 = --n;
        }
        ((spryua)sprsta2).cfr_renamed_1040();
    }

    @Override
    public int cfr_renamed_1051() {
        int n;
        int n2;
        int n3 = 0;
        int n4 = this.cfr_renamed_91 - 1;
        int n5 = n2 = 0;
        while (n5 < n4) {
            int n6 = n = 0;
            while (n6 < 64) {
                if ((this.cfr_renamed_119[n2] & cfr_renamed_112[n]) != 0L) {
                    n3 ^= 1;
                }
                n6 = ++n;
            }
            n5 = ++n2;
        }
        n2 = this.cfr_renamed_1;
        int n7 = n = 0;
        while (n7 < n2) {
            if ((this.cfr_renamed_119[n4] & cfr_renamed_112[n]) != 0L) {
                n3 ^= 1;
            }
            n7 = ++n;
        }
        return n3;
    }

    @Override
    public spryua cfr_renamed_1045() {
        sprsta sprsta2 = new sprsta(this);
        sprsta2.cfr_renamed_1046();
        return sprsta2;
    }

    @Override
    public void cfr_renamed_951(spri arg0) throws RuntimeException {
        int n;
        if (!(arg0 instanceof sprsta)) {
            throw new RuntimeException();
        }
        if (!this.cfr_renamed_4.equals(((sprsta)arg0).cfr_renamed_4)) {
            throw new RuntimeException();
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91) {
            int n3 = n;
            long l = this.cfr_renamed_119[n3] ^ ((sprsta)arg0).cfr_renamed_119[n];
            this.cfr_renamed_119[n3] = l;
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_986() {
        this.cfr_renamed_119 = new long[this.cfr_renamed_91];
    }

    public sprsta(sprsta arg0) {
        sprsta sprsta2 = this;
        this.cfr_renamed_4 = arg0.cfr_renamed_4;
        this.cfr_renamed_3 = sprsta2.cfr_renamed_4.cfr_renamed_813();
        this.cfr_renamed_91 = ((sprwla)this.cfr_renamed_4).cfr_renamed_1069();
        this.cfr_renamed_1 = ((sprwla)this.cfr_renamed_4).cfr_renamed_1070();
        sprsta sprsta3 = this;
        sprsta3.cfr_renamed_119 = new long[sprsta3.cfr_renamed_91];
        sprsta3.cfr_renamed_1074(arg0.cfr_renamed_1073());
    }

    private /* synthetic */ void cfr_renamed_1072(BigInteger arg0) {
        this.cfr_renamed_1076(arg0.toByteArray());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsta(sprwla sprwla2, long[] lArray) {
        void arg0;
        sprsta sprsta2 = this;
        void v1 = arg0;
        sprsta sprsta3 = this;
        sprsta sprsta4 = this;
        sprsta3.cfr_renamed_4 = arg0;
        sprsta3.cfr_renamed_3 = sprsta4.cfr_renamed_4.cfr_renamed_813();
        this.cfr_renamed_91 = v1.cfr_renamed_1069();
        sprsta2.cfr_renamed_1 = v1.cfr_renamed_1070();
        sprsta2.cfr_renamed_119 = lArray;
    }

    @Override
    public Object clone() {
        return new sprsta(this);
    }

    @Override
    public String toString() {
        return this.cfr_renamed_957(16);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean cfr_renamed_287() {
        int n;
        boolean bl = true;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91 - 1 && bl) {
            bl = bl && (this.cfr_renamed_119[n] & 0xFFFFFFFFFFFFFFFFL) == -1L;
            n2 = ++n;
        }
        if (!bl) return bl;
        if (!bl) return false;
        sprsta sprsta2 = this;
        if ((sprsta2.cfr_renamed_119[sprsta2.cfr_renamed_91 - 1] & cfr_renamed_0[this.cfr_renamed_1 - 1]) != cfr_renamed_0[this.cfr_renamed_1 - 1]) return false;
        return true;
    }

    @Override
    public void cfr_renamed_1040() {
        boolean bl;
        int n;
        sprsta sprsta2 = this;
        long[] lArray = sprsta2.cfr_renamed_1073();
        int n2 = sprsta2.cfr_renamed_91 - 1;
        int n3 = sprsta2.cfr_renamed_1 - 1;
        long l = cfr_renamed_112[63];
        boolean bl2 = (lArray[n2] & cfr_renamed_112[n3]) != 0L;
        int n4 = n = 0;
        while (n4 < n2) {
            bl = (lArray[n] & l) != 0L;
            lArray[n] = lArray[n] << 1;
            if (bl2) {
                int n5 = n;
                lArray[n5] = lArray[n5] ^ 1L;
            }
            bl2 = bl;
            n4 = ++n;
        }
        bl = (lArray[n2] & cfr_renamed_112[n3]) != 0L;
        lArray[n2] = lArray[n2] << 1;
        if (bl2) {
            int n6 = n2;
            lArray[n6] = lArray[n6] ^ 1L;
        }
        if (bl) {
            int n7 = n2;
            lArray[n7] = lArray[n7] ^ cfr_renamed_112[n3 + 1];
        }
        this.cfr_renamed_1074(lArray);
    }

    @Override
    public spryua cfr_renamed_1003() {
        sprsta sprsta2 = new sprsta(this);
        sprsta2.cfr_renamed_984();
        return sprsta2;
    }

    @Override
    public boolean cfr_renamed_805() {
        int n;
        boolean bl = true;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91 && bl) {
            bl = bl && (this.cfr_renamed_119[n] & 0xFFFFFFFFFFFFFFFFL) == 0L;
            n2 = ++n;
        }
        return bl;
    }

    @Override
    public boolean cfr_renamed_1012(int arg0) {
        if (arg0 < 0 || arg0 > this.cfr_renamed_3) {
            return false;
        }
        return (this.cfr_renamed_119[arg0 >>> 6] & cfr_renamed_112[arg0 & 0x3F]) != 0L;
    }

    @Override
    public void cfr_renamed_987() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91 - 1) {
            this.cfr_renamed_119[n++] = -1L;
            n2 = n;
        }
        sprsta sprsta2 = this;
        sprsta2.cfr_renamed_119[sprsta2.cfr_renamed_91 - 1] = cfr_renamed_0[this.cfr_renamed_1 - 1];
    }

    @Override
    public void cfr_renamed_984() {
        sprsta sprsta2 = this;
        sprsta2.cfr_renamed_951(sprsta.cfr_renamed_1021((sprwla)sprsta2.cfr_renamed_4));
    }

    @Override
    public boolean equals(Object arg0) {
        int n;
        if (arg0 == null || !(arg0 instanceof sprsta)) {
            return false;
        }
        sprsta sprsta2 = (sprsta)arg0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91) {
            if (this.cfr_renamed_119[n] != sprsta2.cfr_renamed_119[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    private /* synthetic */ long[] cfr_renamed_1077() {
        int n;
        long[] lArray = new long[this.cfr_renamed_119.length];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            sprsta sprsta2 = this;
            if (sprsta2.cfr_renamed_1012(sprsta2.cfr_renamed_3 - n - 1)) {
                int n3 = n >>> 6;
                lArray[n3] = lArray[n3] | cfr_renamed_112[n & 0x3F];
            }
            n2 = ++n;
        }
        return lArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprsta(sprwla sprwla2, byte[] byArray) {
        void arg0;
        sprsta sprsta2 = this;
        sprsta sprsta3 = this;
        sprsta sprsta4 = this;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = sprsta4.cfr_renamed_4.cfr_renamed_813();
        sprsta3.cfr_renamed_91 = this.cfr_renamed_4.cfr_renamed_1069();
        sprsta3.cfr_renamed_1 = arg0.cfr_renamed_1070();
        sprsta2.cfr_renamed_119 = new long[sprsta2.cfr_renamed_91];
        sprsta2.cfr_renamed_1076(byArray);
    }

    public void cfr_renamed_1078() {
        this.cfr_renamed_119 = this.cfr_renamed_1077();
    }

    private /* synthetic */ long[] cfr_renamed_1073() {
        long[] lArray = new long[this.cfr_renamed_119.length];
        System.arraycopy(this.cfr_renamed_119, 0, lArray, 0, this.cfr_renamed_119.length);
        return lArray;
    }

    @Override
    public spri cfr_renamed_952() throws ArithmeticException {
        sprsta sprsta2 = new sprsta(this);
        sprsta2.cfr_renamed_1075();
        return sprsta2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void cfr_renamed_1046() {
        v0 = this;
        var1_1 = v0.cfr_renamed_1073();
        var2_2 = v0.cfr_renamed_91 - 1;
        var3_3 = v0.cfr_renamed_1 - 1;
        var4_4 = sprsta.cfr_renamed_112[63];
        var6_5 = (var1_1[0] & 1L) != 0L;
        v1 = var8_6 = var2_2;
        while (v1 >= 0) {
            var7_7 = (var1_1[var8_6] & 1L) != 0L;
            var1_1[var8_6] = var1_1[var8_6] >>> 1;
            if (!var6_5) ** GOTO lbl19
            if (var8_6 == var2_2) {
                v2 = var7_7;
                v3 = var8_6;
                var1_1[v3] = var1_1[v3] ^ sprsta.cfr_renamed_112[var3_3];
            } else {
                v4 = var8_6;
                var1_1[v4] = var1_1[v4] ^ var4_4;
lbl19:
                // 2 sources

                v2 = var7_7;
            }
            var6_5 = v2;
            v1 = --var8_6;
        }
        this.cfr_renamed_1074(var1_1);
    }

    @Override
    public spryua cfr_renamed_1048() {
        sprsta sprsta2 = new sprsta(this);
        sprsta2.cfr_renamed_1040();
        return sprsta2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_1076(byte[] byArray) {
        void arg0;
        int n;
        this.cfr_renamed_119 = new long[this.cfr_renamed_91];
        int n2 = n = 0;
        while (n2 < ((void)arg0).length) {
            int n3 = n >>> 3;
            void v2 = arg0;
            long l = this.cfr_renamed_119[n3] | ((long)v2[((void)v2).length - 1 - n] & 0xFFL) << ((n & 7) << 3);
            this.cfr_renamed_119[n3] = l;
            n2 = ++n;
        }
    }

    @Override
    public boolean cfr_renamed_1044() {
        sprsta sprsta2 = this;
        return (sprsta2.cfr_renamed_119[sprsta2.cfr_renamed_91 - 1] & cfr_renamed_112[this.cfr_renamed_1 - 1]) != 0L;
    }

    public sprsta(sprwla arg0, SecureRandom arg1) {
        sprsta sprsta2 = this;
        sprwla sprwla2 = arg0;
        sprsta sprsta3 = this;
        sprsta2.cfr_renamed_4 = (int[])sprwla2;
        sprsta2.cfr_renamed_3 = sprsta3.cfr_renamed_4.cfr_renamed_813();
        this.cfr_renamed_91 = sprwla2.cfr_renamed_1069();
        this.cfr_renamed_1 = arg0.cfr_renamed_1070();
        this.cfr_renamed_119 = new long[this.cfr_renamed_91];
        if (this.cfr_renamed_91 > 1) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_91 - 1) {
                this.cfr_renamed_119[n++] = arg1.nextLong();
                n2 = n;
            }
            long l = arg1.nextLong();
            sprsta sprsta4 = this;
            sprsta4.cfr_renamed_119[sprsta4.cfr_renamed_91 - 1] = l >>> 64 - this.cfr_renamed_1;
            return;
        }
        sprsta sprsta5 = this;
        sprsta5.cfr_renamed_119[0] = arg1.nextLong();
        sprsta5.cfr_renamed_119[0] = this.cfr_renamed_119[0] >>> 64 - this.cfr_renamed_1;
    }

    @Override
    public spri cfr_renamed_128(spri arg0) throws RuntimeException {
        sprsta sprsta2 = new sprsta(this);
        sprsta2.cfr_renamed_951(arg0);
        return sprsta2;
    }

    @Override
    public spryua cfr_renamed_1049() throws RuntimeException {
        int n;
        if (this.cfr_renamed_1051() == 1) {
            throw new RuntimeException();
        }
        long l = cfr_renamed_112[63];
        long l2 = 0L;
        long l3 = 1L;
        long[] lArray = new long[this.cfr_renamed_91];
        long l4 = 0L;
        int n2 = 1;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_91 - 1) {
            int n4 = n2 = 1;
            while (n4 < 64) {
                if (!((cfr_renamed_112[n2] & this.cfr_renamed_119[n]) != l2 && (l4 & cfr_renamed_112[n2 - 1]) != l2 || (this.cfr_renamed_119[n] & cfr_renamed_112[n2]) == l2 && (l4 & cfr_renamed_112[n2 - 1]) == l2)) {
                    l4 ^= cfr_renamed_112[n2];
                }
                n4 = ++n2;
            }
            lArray[n] = l4;
            l4 = (l & l4) != l2 && (l3 & this.cfr_renamed_119[n + 1]) == l3 || (l & l4) == l2 && (l3 & this.cfr_renamed_119[n + 1]) == l2 ? l2 : l3;
            n3 = ++n;
        }
        sprsta sprsta2 = this;
        n = sprsta2.cfr_renamed_3 & 0x3F;
        long l5 = sprsta2.cfr_renamed_119[this.cfr_renamed_91 - 1];
        int n5 = n2 = 1;
        while (n5 < n) {
            if (!((cfr_renamed_112[n2] & l5) != l2 && (cfr_renamed_112[n2 - 1] & l4) != l2 || (cfr_renamed_112[n2] & l5) == l2 && (cfr_renamed_112[n2 - 1] & l4) == l2)) {
                l4 ^= cfr_renamed_112[n2];
            }
            n5 = ++n2;
        }
        lArray[this.cfr_renamed_91 - 1] = l4;
        return new sprsta((sprwla)this.cfr_renamed_4, lArray);
    }

    @Override
    public void cfr_renamed_135(spri arg0) throws RuntimeException {
        int n;
        if (!(arg0 instanceof sprsta)) {
            throw new RuntimeException(sprpgm.cfr_renamed_9("cCR\u000bRGRFRECX\u0017CV]R\u000bSBQMRYREC\u000bENGYRXRECJCBXE\r\u000bYDC\u000bNNC\u000b^FGGRFRECNS"));
        }
        if (!this.cfr_renamed_4.equals(((sprsta)arg0).cfr_renamed_4)) {
            throw new RuntimeException();
        }
        if (this.equals(arg0)) {
            this.cfr_renamed_1040();
            return;
        }
        long[] lArray = this.cfr_renamed_119;
        long[] lArray2 = ((sprsta)arg0).cfr_renamed_119;
        sprsta sprsta2 = this;
        long[] lArray3 = new long[sprsta2.cfr_renamed_91];
        int[][] nArray = ((sprwla)sprsta2.cfr_renamed_4).cfr_renamed_3;
        sprsta sprsta3 = this;
        int n2 = sprsta3.cfr_renamed_91 - 1;
        int n3 = sprsta3.cfr_renamed_1 - 1;
        boolean bl = false;
        long l = cfr_renamed_112[63];
        long l2 = cfr_renamed_112[n3];
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3) {
            boolean bl2;
            int n5;
            int n6;
            int n7;
            bl = false;
            int n8 = n7 = 0;
            while (n8 < this.cfr_renamed_3) {
                n6 = cfr_renamed_4[n7];
                n5 = n7 & 0x3F;
                int n9 = cfr_renamed_4[nArray[n7][0]];
                int n10 = nArray[n7][0] & 0x3F;
                if ((lArray[n6] & cfr_renamed_112[n5]) != 0L) {
                    if ((lArray2[n9] & cfr_renamed_112[n10]) != 0L) {
                        bl ^= true;
                    }
                    if (nArray[n7][1] != -1 && (lArray2[n9 = cfr_renamed_4[nArray[n7][1]]] & cfr_renamed_112[n10 = nArray[n7][1] & 0x3F]) != 0L) {
                        bl ^= true;
                    }
                }
                n8 = ++n7;
            }
            n6 = cfr_renamed_4[n];
            n5 = n & 0x3F;
            if (bl) {
                int n11 = n6;
                lArray3[n11] = lArray3[n11] ^ cfr_renamed_112[n5];
            }
            if (this.cfr_renamed_91 > 1) {
                boolean bl3;
                bl2 = (lArray[n2] & 1L) == 1L;
                int n12 = n7 = n2 - 1;
                while (n12 >= 0) {
                    bl3 = (lArray[n7] & 1L) != 0L;
                    lArray[n7] = lArray[n7] >>> 1;
                    if (bl2) {
                        int n13 = n7;
                        lArray[n13] = lArray[n13] ^ l;
                    }
                    bl2 = bl3;
                    n12 = --n7;
                }
                int n14 = n2;
                lArray[n14] = lArray[n14] >>> 1;
                if (bl2) {
                    int n15 = n2;
                    lArray[n15] = lArray[n15] ^ l2;
                }
                bl2 = (lArray2[n2] & 1L) == 1L;
                int n16 = n7 = n2 - 1;
                while (n16 >= 0) {
                    bl3 = (lArray2[n7] & 1L) != 0L;
                    lArray2[n7] = lArray2[n7] >>> 1;
                    if (bl2) {
                        int n17 = n7;
                        lArray2[n17] = lArray2[n17] ^ l;
                    }
                    bl2 = bl3;
                    n16 = --n7;
                }
                int n18 = n2;
                lArray2[n18] = lArray2[n18] >>> 1;
                if (bl2) {
                    int n19 = n2;
                    lArray2[n19] = lArray2[n19] ^ l2;
                }
            } else {
                bl2 = (lArray[0] & 1L) == 1L;
                lArray[0] = lArray[0] >>> 1;
                if (bl2) {
                    lArray[0] = lArray[0] ^ l2;
                }
                bl2 = (lArray2[0] & 1L) == 1L;
                lArray2[0] = lArray2[0] >>> 1;
                if (bl2) {
                    lArray2[0] = lArray2[0] ^ l2;
                }
            }
            n4 = ++n;
        }
        this.cfr_renamed_1074(lArray3);
    }

    @Override
    public byte[] cfr_renamed_954() {
        int n;
        int n2 = (this.cfr_renamed_3 - 1 >> 3) + 1;
        byte[] byArray = new byte[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n2 - n - 1;
            byte by = (byte)((this.cfr_renamed_119[n >>> 3] & 255L << ((n & 7) << 3)) >>> ((n & 7) << 3));
            byArray[n4] = by;
            n3 = ++n;
        }
        return byArray;
    }
}

