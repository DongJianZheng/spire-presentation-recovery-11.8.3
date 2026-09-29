/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprbfc;
import com.spire.presentation.packages.sprhlp;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprxvo {
    @sprtea
    public static final int cfr_renamed_1 = 8;
    private static Object cfr_renamed_2;
    private static byte[] cfr_renamed_3;
    private static spralq cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @sprtea
    public static byte[] cfr_renamed_13333(sprhlp arg0) {
        String string = sprxvo.cfr_renamed_18018(arg0);
        Object object = cfr_renamed_2;
        // MONITORENTER : object
        byte[] byArray = (byte[])cfr_renamed_4.get(string);
        // MONITOREXIT : object
        if (byArray != null) return byArray;
        object = cfr_renamed_2;
        // MONITORENTER : object
        byArray = (byte[])cfr_renamed_4.get(string);
        if (byArray == null) {
            byArray = sprxvo.cfr_renamed_18019(arg0);
            cfr_renamed_4.put(string, byArray);
        }
        // MONITOREXIT : object
        return byArray;
    }

    static {
        cfr_renamed_4 = new spralq();
        cfr_renamed_2 = new Object();
        byte[] byArray = new byte[424];
        byArray[0] = 0;
        byArray[1] = 0;
        byArray[2] = 0;
        byArray[3] = 0;
        byArray[4] = 0;
        byArray[5] = 0;
        byArray[6] = 0;
        byArray[7] = -1;
        byArray[8] = -128;
        byArray[9] = -128;
        byArray[10] = -128;
        byArray[11] = -128;
        byArray[12] = -128;
        byArray[13] = -128;
        byArray[14] = -128;
        byArray[15] = -128;
        byArray[16] = 1;
        byArray[17] = 2;
        byArray[18] = 4;
        byArray[19] = 8;
        byArray[20] = 16;
        byArray[21] = 32;
        byArray[22] = 64;
        byArray[23] = -128;
        byArray[24] = -128;
        byArray[25] = 64;
        byArray[26] = 32;
        byArray[27] = 16;
        byArray[28] = 8;
        byArray[29] = 4;
        byArray[30] = 2;
        byArray[31] = 1;
        byArray[32] = -128;
        byArray[33] = -128;
        byArray[34] = -128;
        byArray[35] = -128;
        byArray[36] = -128;
        byArray[37] = -128;
        byArray[38] = -128;
        byArray[39] = -1;
        byArray[40] = -127;
        byArray[41] = 66;
        byArray[42] = 36;
        byArray[43] = 24;
        byArray[44] = 24;
        byArray[45] = 36;
        byArray[46] = 66;
        byArray[47] = -127;
        byArray[48] = 0;
        byArray[49] = 0;
        byArray[50] = 0;
        byArray[51] = 8;
        byArray[52] = 0;
        byArray[53] = 0;
        byArray[54] = 0;
        byArray[55] = -128;
        byArray[56] = 0;
        byArray[57] = 8;
        byArray[58] = 0;
        byArray[59] = -128;
        byArray[60] = 0;
        byArray[61] = 8;
        byArray[62] = 0;
        byArray[63] = -128;
        byArray[64] = 0;
        byArray[65] = 34;
        byArray[66] = 0;
        byArray[67] = -120;
        byArray[68] = 0;
        byArray[69] = 34;
        byArray[70] = 0;
        byArray[71] = -120;
        byArray[72] = 34;
        byArray[73] = -120;
        byArray[74] = 34;
        byArray[75] = -120;
        byArray[76] = 34;
        byArray[77] = -120;
        byArray[78] = 34;
        byArray[79] = -120;
        byArray[80] = 17;
        byArray[81] = -86;
        byArray[82] = 68;
        byArray[83] = -86;
        byArray[84] = 17;
        byArray[85] = -86;
        byArray[86] = 68;
        byArray[87] = -86;
        byArray[88] = 21;
        byArray[89] = -86;
        byArray[90] = 85;
        byArray[91] = -86;
        byArray[92] = 81;
        byArray[93] = -86;
        byArray[94] = 85;
        byArray[95] = -86;
        byArray[96] = 85;
        byArray[97] = -86;
        byArray[98] = 85;
        byArray[99] = -86;
        byArray[100] = 85;
        byArray[101] = -86;
        byArray[102] = 85;
        byArray[103] = -86;
        byArray[104] = 85;
        byArray[105] = -69;
        byArray[106] = 85;
        byArray[107] = -18;
        byArray[108] = 85;
        byArray[109] = -69;
        byArray[110] = 85;
        byArray[111] = -18;
        byArray[112] = -35;
        byArray[113] = 119;
        byArray[114] = -35;
        byArray[115] = 119;
        byArray[116] = -35;
        byArray[117] = 119;
        byArray[118] = -35;
        byArray[119] = 119;
        byArray[120] = -1;
        byArray[121] = -35;
        byArray[122] = -1;
        byArray[123] = 119;
        byArray[124] = -1;
        byArray[125] = -35;
        byArray[126] = -1;
        byArray[127] = 119;
        byArray[128] = -1;
        byArray[129] = -2;
        byArray[130] = -1;
        byArray[131] = -17;
        byArray[132] = -1;
        byArray[133] = -2;
        byArray[134] = -1;
        byArray[135] = -17;
        byArray[136] = 127;
        byArray[137] = -1;
        byArray[138] = -1;
        byArray[139] = -1;
        byArray[140] = -9;
        byArray[141] = -1;
        byArray[142] = -1;
        byArray[143] = -1;
        byArray[144] = 17;
        byArray[145] = 34;
        byArray[146] = 68;
        byArray[147] = -120;
        byArray[148] = 17;
        byArray[149] = 34;
        byArray[150] = 68;
        byArray[151] = -120;
        byArray[152] = -120;
        byArray[153] = 68;
        byArray[154] = 34;
        byArray[155] = 17;
        byArray[156] = -120;
        byArray[157] = 68;
        byArray[158] = 34;
        byArray[159] = 17;
        byArray[160] = -103;
        byArray[161] = 51;
        byArray[162] = 102;
        byArray[163] = -52;
        byArray[164] = -103;
        byArray[165] = 51;
        byArray[166] = 102;
        byArray[167] = -52;
        byArray[168] = -103;
        byArray[169] = -52;
        byArray[170] = 102;
        byArray[171] = 51;
        byArray[172] = -103;
        byArray[173] = -52;
        byArray[174] = 102;
        byArray[175] = 51;
        byArray[176] = -125;
        byArray[177] = 7;
        byArray[178] = 14;
        byArray[179] = 28;
        byArray[180] = 56;
        byArray[181] = 112;
        byArray[182] = -32;
        byArray[183] = -63;
        byArray[184] = -63;
        byArray[185] = -32;
        byArray[186] = 112;
        byArray[187] = 56;
        byArray[188] = 28;
        byArray[189] = 14;
        byArray[190] = 7;
        byArray[191] = -125;
        byArray[192] = -120;
        byArray[193] = -120;
        byArray[194] = -120;
        byArray[195] = -120;
        byArray[196] = -120;
        byArray[197] = -120;
        byArray[198] = -120;
        byArray[199] = -120;
        byArray[200] = 0;
        byArray[201] = 0;
        byArray[202] = 0;
        byArray[203] = -1;
        byArray[204] = 0;
        byArray[205] = 0;
        byArray[206] = 0;
        byArray[207] = -1;
        byArray[208] = 85;
        byArray[209] = 85;
        byArray[210] = 85;
        byArray[211] = 85;
        byArray[212] = 85;
        byArray[213] = 85;
        byArray[214] = 85;
        byArray[215] = 85;
        byArray[216] = 0;
        byArray[217] = -1;
        byArray[218] = 0;
        byArray[219] = -1;
        byArray[220] = 0;
        byArray[221] = -1;
        byArray[222] = 0;
        byArray[223] = -1;
        byArray[224] = -52;
        byArray[225] = -52;
        byArray[226] = -52;
        byArray[227] = -52;
        byArray[228] = -52;
        byArray[229] = -52;
        byArray[230] = -52;
        byArray[231] = -52;
        byArray[232] = 0;
        byArray[233] = 0;
        byArray[234] = -1;
        byArray[235] = -1;
        byArray[236] = 0;
        byArray[237] = 0;
        byArray[238] = -1;
        byArray[239] = -1;
        byArray[240] = 0;
        byArray[241] = 0;
        byArray[242] = 17;
        byArray[243] = 34;
        byArray[244] = 68;
        byArray[245] = -120;
        byArray[246] = 0;
        byArray[247] = 0;
        byArray[248] = 0;
        byArray[249] = 0;
        byArray[250] = -120;
        byArray[251] = 68;
        byArray[252] = 34;
        byArray[253] = 17;
        byArray[254] = 0;
        byArray[255] = 0;
        byArray[256] = 0;
        byArray[257] = 0;
        byArray[258] = 0;
        byArray[259] = 15;
        byArray[260] = 0;
        byArray[261] = 0;
        byArray[262] = 0;
        byArray[263] = -16;
        byArray[264] = 8;
        byArray[265] = 8;
        byArray[266] = 8;
        byArray[267] = 8;
        byArray[268] = -128;
        byArray[269] = -128;
        byArray[270] = -128;
        byArray[271] = -128;
        byArray[272] = 4;
        byArray[273] = 32;
        byArray[274] = 1;
        byArray[275] = 16;
        byArray[276] = 2;
        byArray[277] = 64;
        byArray[278] = 8;
        byArray[279] = -128;
        byArray[280] = -115;
        byArray[281] = 12;
        byArray[282] = -64;
        byArray[283] = -40;
        byArray[284] = 27;
        byArray[285] = 3;
        byArray[286] = 48;
        byArray[287] = -79;
        byArray[288] = 24;
        byArray[289] = 36;
        byArray[290] = 66;
        byArray[291] = -127;
        byArray[292] = 24;
        byArray[293] = 36;
        byArray[294] = 66;
        byArray[295] = -127;
        byArray[296] = -64;
        byArray[297] = 37;
        byArray[298] = 24;
        byArray[299] = 0;
        byArray[300] = -64;
        byArray[301] = 37;
        byArray[302] = 24;
        byArray[303] = 0;
        byArray[304] = -127;
        byArray[305] = 66;
        byArray[306] = 36;
        byArray[307] = 24;
        byArray[308] = 8;
        byArray[309] = 4;
        byArray[310] = 2;
        byArray[311] = 1;
        byArray[312] = 8;
        byArray[313] = 8;
        byArray[314] = 8;
        byArray[315] = -1;
        byArray[316] = -128;
        byArray[317] = -128;
        byArray[318] = -128;
        byArray[319] = -1;
        byArray[320] = 81;
        byArray[321] = 34;
        byArray[322] = 20;
        byArray[323] = -120;
        byArray[324] = 69;
        byArray[325] = 34;
        byArray[326] = 84;
        byArray[327] = -120;
        byArray[328] = -16;
        byArray[329] = -16;
        byArray[330] = -16;
        byArray[331] = -16;
        byArray[332] = 85;
        byArray[333] = -86;
        byArray[334] = 85;
        byArray[335] = -86;
        byArray[336] = -128;
        byArray[337] = 1;
        byArray[338] = -128;
        byArray[339] = 0;
        byArray[340] = 16;
        byArray[341] = 8;
        byArray[342] = 16;
        byArray[343] = 0;
        byArray[344] = 0;
        byArray[345] = -128;
        byArray[346] = 0;
        byArray[347] = -128;
        byArray[348] = 0;
        byArray[349] = -128;
        byArray[350] = 0;
        byArray[351] = -86;
        byArray[352] = 0;
        byArray[353] = 34;
        byArray[354] = 0;
        byArray[355] = 8;
        byArray[356] = 0;
        byArray[357] = 34;
        byArray[358] = 0;
        byArray[359] = -128;
        byArray[360] = 1;
        byArray[361] = 1;
        byArray[362] = 2;
        byArray[363] = 12;
        byArray[364] = 48;
        byArray[365] = 72;
        byArray[366] = -124;
        byArray[367] = 3;
        byArray[368] = -103;
        byArray[369] = -1;
        byArray[370] = 102;
        byArray[371] = -1;
        byArray[372] = -103;
        byArray[373] = -1;
        byArray[374] = 102;
        byArray[375] = -1;
        byArray[376] = -8;
        byArray[377] = -8;
        byArray[378] = -104;
        byArray[379] = 119;
        byArray[380] = -113;
        byArray[381] = -113;
        byArray[382] = -119;
        byArray[383] = 119;
        byArray[384] = -120;
        byArray[385] = -120;
        byArray[386] = -120;
        byArray[387] = -1;
        byArray[388] = -120;
        byArray[389] = -120;
        byArray[390] = -120;
        byArray[391] = -1;
        byArray[392] = -103;
        byArray[393] = 102;
        byArray[394] = 102;
        byArray[395] = -103;
        byArray[396] = -103;
        byArray[397] = 102;
        byArray[398] = 102;
        byArray[399] = -103;
        byArray[400] = 15;
        byArray[401] = 15;
        byArray[402] = 15;
        byArray[403] = 15;
        byArray[404] = -16;
        byArray[405] = -16;
        byArray[406] = -16;
        byArray[407] = -16;
        byArray[408] = 1;
        byArray[409] = -126;
        byArray[410] = 68;
        byArray[411] = 40;
        byArray[412] = 16;
        byArray[413] = 40;
        byArray[414] = 68;
        byArray[415] = -126;
        byArray[416] = 0;
        byArray[417] = 16;
        byArray[418] = 56;
        byArray[419] = 124;
        byArray[420] = -2;
        byArray[421] = 124;
        byArray[422] = 56;
        byArray[423] = 16;
        cfr_renamed_3 = byArray;
    }

    private static /* synthetic */ String cfr_renamed_18018(sprhlp arg0) {
        Object[] objectArray = new Object[3];
        objectArray[0] = arg0.cfr_renamed_12678();
        objectArray[1] = arg0.cfr_renamed_12676().cfr_renamed_13088();
        objectArray[2] = arg0.cfr_renamed_12675().cfr_renamed_13088();
        return sprraia.cfr_renamed_11562(sprbfc.cfr_renamed_9("h-nf\"'K`h/)En"), objectArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ byte[] cfr_renamed_18019(sprhlp arg0) {
        byte[] byArray = new byte[8];
        System.arraycopy(cfr_renamed_3, arg0.cfr_renamed_12678() * 8, byArray, 0, 8);
        sprvyo sprvyo2 = new sprvyo(8, 8);
        try {
            sprpdja sprpdja2;
            int n;
            int n2 = n = 0;
            while (n2 < 8) {
                int n3;
                int n4 = n3 = 0;
                while (n4 < 8) {
                    sprwbp sprwbp2 = (byArray[n] & 0xFF & 128 >> n3) > 0 ? arg0.cfr_renamed_12675() : arg0.cfr_renamed_12676();
                    sprvyo2.cfr_renamed_14006(n3++, 7 - n, sprwbp2);
                    n4 = n3;
                }
                n2 = ++n;
            }
            sprpdja sprpdja3 = sprpdja2 = new sprpdja();
            sprvyo2.cfr_renamed_12641(sprpdja3, 6);
            byte[] byArray2 = sprmvo.cfr_renamed_12452(sprpdja3);
            return byArray2;
        }
        finally {
            if (sprvyo2 != null) {
                sprvyo2.cfr_renamed_11665();
            }
        }
    }

    private /* synthetic */ sprxvo() {
    }
}

