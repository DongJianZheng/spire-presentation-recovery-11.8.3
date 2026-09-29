/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkpp;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;

@sprtea
public class sprbro {
    private long cfr_renamed_112;
    private long cfr_renamed_119;
    private long cfr_renamed_91;
    private static int[] cfr_renamed_0;
    private static final long cfr_renamed_1 = 770703360L;
    public static sprbro cfr_renamed_2;
    private static int[] cfr_renamed_3;
    private long cfr_renamed_4;

    public long cfr_renamed_18472() {
        return this.cfr_renamed_91;
    }

    public long cfr_renamed_18470() {
        return this.cfr_renamed_112;
    }

    @sprtea
    public boolean cfr_renamed_18545(int arg0) {
        long l;
        int n = sprbro.cfr_renamed_18600(arg0);
        if (n == -1) {
            return false;
        }
        if (n < 32) {
            l = this.cfr_renamed_112;
        } else if (n < 64) {
            n -= 32;
            l = this.cfr_renamed_4;
        } else if (n < 96) {
            n -= 64;
            l = this.cfr_renamed_91;
        } else {
            n -= 96;
            l = this.cfr_renamed_119;
        }
        long l2 = 1L << n & 0xFFFFFFFFL;
        return (l & 0xFFFFFFFFL & (l2 & 0xFFFFFFFFL)) == (l2 & 0xFFFFFFFFL);
    }

    public long cfr_renamed_18473() {
        return this.cfr_renamed_119;
    }

    public boolean equals(Object arg0) {
        if (sprriia.cfr_renamed_15321(null, arg0)) {
            return false;
        }
        if (sprriia.cfr_renamed_15321(this, arg0)) {
            return true;
        }
        if (arg0.getClass() != this.getClass()) {
            return false;
        }
        return this.cfr_renamed_18601((sprbro)arg0);
    }

    public int hashCode() {
        int n = (int)(this.cfr_renamed_112 & 0xFFFFFFFFL);
        n = n * 397 ^ (int)(this.cfr_renamed_4 & 0xFFFFFFFFL);
        n = n * 397 ^ (int)(this.cfr_renamed_91 & 0xFFFFFFFFL);
        n = n * 397 ^ (int)(this.cfr_renamed_119 & 0xFFFFFFFFL);
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprbro(long l, long l2, long l3, long l4) {
        void arg2;
        void arg1;
        void arg0;
        sprbro sprbro2 = this;
        sprbro sprbro3 = this;
        sprbro3.cfr_renamed_112 = arg0;
        sprbro3.cfr_renamed_4 = arg1;
        sprbro2.cfr_renamed_91 = arg2;
        sprbro2.cfr_renamed_119 = l4;
    }

    static {
        cfr_renamed_2 = new sprbro(0L, 0L, 0L, 0L);
        int[] nArray = new int[338];
        nArray[0] = 0;
        nArray[1] = 127;
        nArray[2] = 128;
        nArray[3] = 255;
        nArray[4] = 256;
        nArray[5] = 383;
        nArray[6] = 384;
        nArray[7] = 591;
        nArray[8] = 592;
        nArray[9] = 687;
        nArray[10] = 688;
        nArray[11] = 767;
        nArray[12] = 768;
        nArray[13] = 879;
        nArray[14] = 880;
        nArray[15] = 1023;
        nArray[16] = 1024;
        nArray[17] = 1279;
        nArray[18] = 1280;
        nArray[19] = 1327;
        nArray[20] = 1328;
        nArray[21] = 1423;
        nArray[22] = 1424;
        nArray[23] = 1535;
        nArray[24] = 1536;
        nArray[25] = 1791;
        nArray[26] = 1792;
        nArray[27] = 1871;
        nArray[28] = 1872;
        nArray[29] = 1919;
        nArray[30] = 1920;
        nArray[31] = 1983;
        nArray[32] = 1984;
        nArray[33] = 2047;
        nArray[34] = 2304;
        nArray[35] = 2431;
        nArray[36] = 2432;
        nArray[37] = 2559;
        nArray[38] = 2560;
        nArray[39] = 2687;
        nArray[40] = 2688;
        nArray[41] = 2815;
        nArray[42] = 2816;
        nArray[43] = 2943;
        nArray[44] = 2944;
        nArray[45] = 3071;
        nArray[46] = 3072;
        nArray[47] = 3199;
        nArray[48] = 3200;
        nArray[49] = 3327;
        nArray[50] = 3328;
        nArray[51] = 3455;
        nArray[52] = 3456;
        nArray[53] = 3583;
        nArray[54] = 3584;
        nArray[55] = 3711;
        nArray[56] = 3712;
        nArray[57] = 3839;
        nArray[58] = 3840;
        nArray[59] = 4095;
        nArray[60] = 4096;
        nArray[61] = 4255;
        nArray[62] = 4256;
        nArray[63] = 4351;
        nArray[64] = 4352;
        nArray[65] = 4607;
        nArray[66] = 4608;
        nArray[67] = 4991;
        nArray[68] = 4992;
        nArray[69] = 5023;
        nArray[70] = 5024;
        nArray[71] = 5119;
        nArray[72] = 5120;
        nArray[73] = 5759;
        nArray[74] = 5760;
        nArray[75] = 5791;
        nArray[76] = 5792;
        nArray[77] = 5887;
        nArray[78] = 5888;
        nArray[79] = 5919;
        nArray[80] = 5920;
        nArray[81] = 5951;
        nArray[82] = 5952;
        nArray[83] = 5983;
        nArray[84] = 5984;
        nArray[85] = 6015;
        nArray[86] = 6016;
        nArray[87] = 6143;
        nArray[88] = 6144;
        nArray[89] = 6319;
        nArray[90] = 6400;
        nArray[91] = 6479;
        nArray[92] = 6480;
        nArray[93] = 6527;
        nArray[94] = 6528;
        nArray[95] = 6623;
        nArray[96] = 6624;
        nArray[97] = 6655;
        nArray[98] = 6656;
        nArray[99] = 6687;
        nArray[100] = 6912;
        nArray[101] = 7039;
        nArray[102] = 7040;
        nArray[103] = 7103;
        nArray[104] = 7168;
        nArray[105] = 7247;
        nArray[106] = 7248;
        nArray[107] = 7295;
        nArray[108] = 7424;
        nArray[109] = 7551;
        nArray[110] = 7552;
        nArray[111] = 7615;
        nArray[112] = 7616;
        nArray[113] = 7679;
        nArray[114] = 7680;
        nArray[115] = 7935;
        nArray[116] = 7936;
        nArray[117] = 8191;
        nArray[118] = 8192;
        nArray[119] = 8303;
        nArray[120] = 8304;
        nArray[121] = 8351;
        nArray[122] = 8352;
        nArray[123] = 8399;
        nArray[124] = 8400;
        nArray[125] = 8447;
        nArray[126] = 8448;
        nArray[127] = 8527;
        nArray[128] = 8528;
        nArray[129] = 8591;
        nArray[130] = 8592;
        nArray[131] = 8703;
        nArray[132] = 8704;
        nArray[133] = 8959;
        nArray[134] = 8960;
        nArray[135] = 9215;
        nArray[136] = 9216;
        nArray[137] = 9279;
        nArray[138] = 9280;
        nArray[139] = 9311;
        nArray[140] = 9312;
        nArray[141] = 9471;
        nArray[142] = 9472;
        nArray[143] = 9599;
        nArray[144] = 9600;
        nArray[145] = 9631;
        nArray[146] = 9632;
        nArray[147] = 9727;
        nArray[148] = 9728;
        nArray[149] = 9983;
        nArray[150] = 9984;
        nArray[151] = 10175;
        nArray[152] = 10176;
        nArray[153] = 10223;
        nArray[154] = 10224;
        nArray[155] = 10239;
        nArray[156] = 10240;
        nArray[157] = 10495;
        nArray[158] = 10496;
        nArray[159] = 10623;
        nArray[160] = 10624;
        nArray[161] = 10751;
        nArray[162] = 10752;
        nArray[163] = 11007;
        nArray[164] = 11008;
        nArray[165] = 11263;
        nArray[166] = 11264;
        nArray[167] = 11359;
        nArray[168] = 11360;
        nArray[169] = 11391;
        nArray[170] = 11392;
        nArray[171] = 11519;
        nArray[172] = 11520;
        nArray[173] = 11567;
        nArray[174] = 11568;
        nArray[175] = 11647;
        nArray[176] = 11648;
        nArray[177] = 11743;
        nArray[178] = 11744;
        nArray[179] = 11775;
        nArray[180] = 11776;
        nArray[181] = 11903;
        nArray[182] = 11904;
        nArray[183] = 12031;
        nArray[184] = 12032;
        nArray[185] = 12255;
        nArray[186] = 12272;
        nArray[187] = 12287;
        nArray[188] = 12288;
        nArray[189] = 12351;
        nArray[190] = 12352;
        nArray[191] = 12447;
        nArray[192] = 12448;
        nArray[193] = 12543;
        nArray[194] = 12544;
        nArray[195] = 12591;
        nArray[196] = 12592;
        nArray[197] = 12687;
        nArray[198] = 12688;
        nArray[199] = 12703;
        nArray[200] = 12704;
        nArray[201] = 12735;
        nArray[202] = 12736;
        nArray[203] = 12783;
        nArray[204] = 12784;
        nArray[205] = 12799;
        nArray[206] = 12800;
        nArray[207] = 13055;
        nArray[208] = 13056;
        nArray[209] = 13311;
        nArray[210] = 13312;
        nArray[211] = 19903;
        nArray[212] = 19904;
        nArray[213] = 19967;
        nArray[214] = 19968;
        nArray[215] = 40959;
        nArray[216] = 40960;
        nArray[217] = 42127;
        nArray[218] = 42128;
        nArray[219] = 42191;
        nArray[220] = 42240;
        nArray[221] = 42559;
        nArray[222] = 42560;
        nArray[223] = 42655;
        nArray[224] = 42752;
        nArray[225] = 42783;
        nArray[226] = 42784;
        nArray[227] = 43007;
        nArray[228] = 43008;
        nArray[229] = 43055;
        nArray[230] = 43072;
        nArray[231] = 43135;
        nArray[232] = 43136;
        nArray[233] = 43231;
        nArray[234] = 43264;
        nArray[235] = 43311;
        nArray[236] = 43312;
        nArray[237] = 43359;
        nArray[238] = 43520;
        nArray[239] = 43615;
        nArray[240] = 44032;
        nArray[241] = 55215;
        nArray[242] = 55296;
        nArray[243] = 57343;
        nArray[244] = 57344;
        nArray[245] = 63743;
        nArray[246] = 63744;
        nArray[247] = 64255;
        nArray[248] = 64256;
        nArray[249] = 64335;
        nArray[250] = 64336;
        nArray[251] = 65023;
        nArray[252] = 65024;
        nArray[253] = 65039;
        nArray[254] = 65040;
        nArray[255] = 65055;
        nArray[256] = 65056;
        nArray[257] = 65071;
        nArray[258] = 65072;
        nArray[259] = 65103;
        nArray[260] = 65104;
        nArray[261] = 65135;
        nArray[262] = 65136;
        nArray[263] = 65279;
        nArray[264] = 65280;
        nArray[265] = 65519;
        nArray[266] = 65520;
        nArray[267] = 65535;
        nArray[268] = 65536;
        nArray[269] = 65663;
        nArray[270] = 65664;
        nArray[271] = 65791;
        nArray[272] = 65792;
        nArray[273] = 65855;
        nArray[274] = 65856;
        nArray[275] = 65935;
        nArray[276] = 65936;
        nArray[277] = 65999;
        nArray[278] = 66000;
        nArray[279] = 66047;
        nArray[280] = 66176;
        nArray[281] = 66207;
        nArray[282] = 66208;
        nArray[283] = 66271;
        nArray[284] = 66304;
        nArray[285] = 66351;
        nArray[286] = 66352;
        nArray[287] = 66383;
        nArray[288] = 66432;
        nArray[289] = 66463;
        nArray[290] = 66464;
        nArray[291] = 66527;
        nArray[292] = 66560;
        nArray[293] = 66639;
        nArray[294] = 66640;
        nArray[295] = 66687;
        nArray[296] = 66688;
        nArray[297] = 66735;
        nArray[298] = 67584;
        nArray[299] = 67647;
        nArray[300] = 67840;
        nArray[301] = 67871;
        nArray[302] = 67872;
        nArray[303] = 67903;
        nArray[304] = 68096;
        nArray[305] = 68191;
        nArray[306] = 73728;
        nArray[307] = 74751;
        nArray[308] = 74752;
        nArray[309] = 74879;
        nArray[310] = 118784;
        nArray[311] = 119039;
        nArray[312] = 119040;
        nArray[313] = 119295;
        nArray[314] = 119296;
        nArray[315] = 119375;
        nArray[316] = 119552;
        nArray[317] = 119647;
        nArray[318] = 119648;
        nArray[319] = 119679;
        nArray[320] = 119808;
        nArray[321] = 120831;
        nArray[322] = 126976;
        nArray[323] = 127023;
        nArray[324] = 127024;
        nArray[325] = 127135;
        nArray[326] = 131072;
        nArray[327] = 173791;
        nArray[328] = 194560;
        nArray[329] = 195103;
        nArray[330] = 917504;
        nArray[331] = 917631;
        nArray[332] = 917760;
        nArray[333] = 917999;
        nArray[334] = 1044480;
        nArray[335] = 1048573;
        nArray[336] = 0x100000;
        nArray[337] = 1114109;
        cfr_renamed_0 = nArray;
        int[] nArray2 = new int[169];
        nArray2[0] = 0;
        nArray2[1] = 1;
        nArray2[2] = 2;
        nArray2[3] = 3;
        nArray2[4] = 4;
        nArray2[5] = 5;
        nArray2[6] = 6;
        nArray2[7] = 7;
        nArray2[8] = 9;
        nArray2[9] = 9;
        nArray2[10] = 10;
        nArray2[11] = 11;
        nArray2[12] = 13;
        nArray2[13] = 71;
        nArray2[14] = 13;
        nArray2[15] = 72;
        nArray2[16] = 14;
        nArray2[17] = 15;
        nArray2[18] = 16;
        nArray2[19] = 17;
        nArray2[20] = 18;
        nArray2[21] = 19;
        nArray2[22] = 20;
        nArray2[23] = 21;
        nArray2[24] = 22;
        nArray2[25] = 23;
        nArray2[26] = 73;
        nArray2[27] = 24;
        nArray2[28] = 25;
        nArray2[29] = 70;
        nArray2[30] = 74;
        nArray2[31] = 26;
        nArray2[32] = 28;
        nArray2[33] = 75;
        nArray2[34] = 75;
        nArray2[35] = 76;
        nArray2[36] = 77;
        nArray2[37] = 78;
        nArray2[38] = 79;
        nArray2[39] = 84;
        nArray2[40] = 84;
        nArray2[41] = 84;
        nArray2[42] = 84;
        nArray2[43] = 80;
        nArray2[44] = 81;
        nArray2[45] = 93;
        nArray2[46] = 94;
        nArray2[47] = 95;
        nArray2[48] = 80;
        nArray2[49] = 96;
        nArray2[50] = 27;
        nArray2[51] = 112;
        nArray2[52] = 113;
        nArray2[53] = 114;
        nArray2[54] = 4;
        nArray2[55] = 4;
        nArray2[56] = 6;
        nArray2[57] = 29;
        nArray2[58] = 30;
        nArray2[59] = 31;
        nArray2[60] = 32;
        nArray2[61] = 33;
        nArray2[62] = 34;
        nArray2[63] = 35;
        nArray2[64] = 36;
        nArray2[65] = 37;
        nArray2[66] = 38;
        nArray2[67] = 39;
        nArray2[68] = 40;
        nArray2[69] = 41;
        nArray2[70] = 42;
        nArray2[71] = 43;
        nArray2[72] = 44;
        nArray2[73] = 45;
        nArray2[74] = 46;
        nArray2[75] = 47;
        nArray2[76] = 38;
        nArray2[77] = 37;
        nArray2[78] = 82;
        nArray2[79] = 37;
        nArray2[80] = 38;
        nArray2[81] = 38;
        nArray2[82] = 37;
        nArray2[83] = 97;
        nArray2[84] = 29;
        nArray2[85] = 8;
        nArray2[86] = 26;
        nArray2[87] = 98;
        nArray2[88] = 75;
        nArray2[89] = 9;
        nArray2[90] = 31;
        nArray2[91] = 59;
        nArray2[92] = 59;
        nArray2[93] = 59;
        nArray2[94] = 48;
        nArray2[95] = 49;
        nArray2[96] = 50;
        nArray2[97] = 51;
        nArray2[98] = 52;
        nArray2[99] = 59;
        nArray2[100] = 51;
        nArray2[101] = 61;
        nArray2[102] = 50;
        nArray2[103] = 54;
        nArray2[104] = 55;
        nArray2[105] = 59;
        nArray2[106] = 99;
        nArray2[107] = 59;
        nArray2[108] = 83;
        nArray2[109] = 83;
        nArray2[110] = 12;
        nArray2[111] = 9;
        nArray2[112] = 5;
        nArray2[113] = 29;
        nArray2[114] = 100;
        nArray2[115] = 53;
        nArray2[116] = 115;
        nArray2[117] = 116;
        nArray2[118] = 117;
        nArray2[119] = 118;
        nArray2[120] = 56;
        nArray2[121] = 57;
        nArray2[122] = 60;
        nArray2[123] = 61;
        nArray2[124] = 62;
        nArray2[125] = 63;
        nArray2[126] = 91;
        nArray2[127] = 65;
        nArray2[128] = 64;
        nArray2[129] = 65;
        nArray2[130] = 66;
        nArray2[131] = 67;
        nArray2[132] = 68;
        nArray2[133] = 69;
        nArray2[134] = 101;
        nArray2[135] = 101;
        nArray2[136] = 101;
        nArray2[137] = 102;
        nArray2[138] = 119;
        nArray2[139] = 120;
        nArray2[140] = 121;
        nArray2[141] = 121;
        nArray2[142] = 85;
        nArray2[143] = 86;
        nArray2[144] = 103;
        nArray2[145] = 104;
        nArray2[146] = 87;
        nArray2[147] = 105;
        nArray2[148] = 106;
        nArray2[149] = 107;
        nArray2[150] = 58;
        nArray2[151] = 121;
        nArray2[152] = 108;
        nArray2[153] = 110;
        nArray2[154] = 110;
        nArray2[155] = 88;
        nArray2[156] = 88;
        nArray2[157] = 88;
        nArray2[158] = 109;
        nArray2[159] = 111;
        nArray2[160] = 89;
        nArray2[161] = 122;
        nArray2[162] = 122;
        nArray2[163] = 59;
        nArray2[164] = 61;
        nArray2[165] = 92;
        nArray2[166] = 91;
        nArray2[167] = 90;
        nArray2[168] = 90;
        cfr_renamed_3 = nArray2;
    }

    @sprtea
    public boolean cfr_renamed_13751() {
        return sproup.cfr_renamed_18602(this.cfr_renamed_4, 770703360L);
    }

    public long cfr_renamed_18471() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_18601(sprbro arg0) {
        return this.cfr_renamed_112 == arg0.cfr_renamed_112 && this.cfr_renamed_4 == arg0.cfr_renamed_4 && this.cfr_renamed_91 == arg0.cfr_renamed_91 && this.cfr_renamed_119 == arg0.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprbro(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprbro sprbro2 = this;
        void v1 = arg0;
        void v2 = arg1;
        this.cfr_renamed_112 = sprtzja.cfr_renamed_12136((byte[])arg0, (int)v2);
        this.cfr_renamed_4 = sprtzja.cfr_renamed_12136((byte[])v1, (int)(v2 + 4));
        sprbro2.cfr_renamed_91 = sprtzja.cfr_renamed_12136((byte[])v1, (int)(arg1 + 8));
        sprbro2.cfr_renamed_119 = sprtzja.cfr_renamed_12136(byArray, (int)(arg1 + 12));
    }

    private static /* synthetic */ int cfr_renamed_18600(int arg0) {
        int n;
        int n2 = sprkpp.cfr_renamed_18603(cfr_renamed_0, 0, cfr_renamed_0.length, arg0);
        if (n2 >= 0) {
            int n3 = n2 / 2;
            return cfr_renamed_3[n3];
        }
        if (n2 < 0 && (n = ~n2) < cfr_renamed_0.length) {
            boolean bl;
            int n4 = n / 2;
            boolean bl2 = n % 2 == 0;
            boolean bl3 = bl = bl2 && n > 0 && cfr_renamed_0[n] - cfr_renamed_0[n - 1] > 1;
            if (!bl) {
                return cfr_renamed_3[n4];
            }
        }
        return -1;
    }
}

