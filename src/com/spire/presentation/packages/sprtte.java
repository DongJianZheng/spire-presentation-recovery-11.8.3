/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprtte {
    public static int[] cfr_renamed_3;
    public int cfr_renamed_4;

    public void cfr_renamed_4945() {
        this.cfr_renamed_4 = -1;
    }

    public void cfr_renamed_4946(int arg0) {
        int n = this.cfr_renamed_4 >> 24 ^ arg0;
        if (n < 0) {
            n = 256 + n;
        }
        this.cfr_renamed_4 = this.cfr_renamed_4 << 8 ^ cfr_renamed_3[n];
    }

    public int cfr_renamed_4947() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_4948(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public sprtte() {
        sprtte sprtte2 = this;
        sprtte2.cfr_renamed_4945();
    }

    static {
        int[] nArray = new int[256];
        nArray[0] = 0;
        nArray[1] = 79764919;
        nArray[2] = 159529838;
        nArray[3] = 222504665;
        nArray[4] = 319059676;
        nArray[5] = 398814059;
        nArray[6] = 445009330;
        nArray[7] = 507990021;
        nArray[8] = 638119352;
        nArray[9] = 583659535;
        nArray[10] = 797628118;
        nArray[11] = 726387553;
        nArray[12] = 890018660;
        nArray[13] = 835552979;
        nArray[14] = 1015980042;
        nArray[15] = 944750013;
        nArray[16] = 1276238704;
        nArray[17] = 1221641927;
        nArray[18] = 1167319070;
        nArray[19] = 1095957929;
        nArray[20] = 1595256236;
        nArray[21] = 1540665371;
        nArray[22] = 1452775106;
        nArray[23] = 1381403509;
        nArray[24] = 1780037320;
        nArray[25] = 1859660671;
        nArray[26] = 1671105958;
        nArray[27] = 1733955601;
        nArray[28] = 2031960084;
        nArray[29] = 2111593891;
        nArray[30] = 1889500026;
        nArray[31] = 1952343757;
        nArray[32] = -1742489888;
        nArray[33] = -1662866601;
        nArray[34] = -1851683442;
        nArray[35] = -1788833735;
        nArray[36] = -1960329156;
        nArray[37] = -1880695413;
        nArray[38] = -2103051438;
        nArray[39] = -2040207643;
        nArray[40] = -1104454824;
        nArray[41] = -1159051537;
        nArray[42] = -1213636554;
        nArray[43] = -1284997759;
        nArray[44] = -1389417084;
        nArray[45] = -1444007885;
        nArray[46] = -1532160278;
        nArray[47] = -1603531939;
        nArray[48] = -734892656;
        nArray[49] = -789352409;
        nArray[50] = -575645954;
        nArray[51] = -646886583;
        nArray[52] = -952755380;
        nArray[53] = -1007220997;
        nArray[54] = -827056094;
        nArray[55] = -898286187;
        nArray[56] = -231047128;
        nArray[57] = -151282273;
        nArray[58] = -71779514;
        nArray[59] = -8804623;
        nArray[60] = -515967244;
        nArray[61] = -436212925;
        nArray[62] = -390279782;
        nArray[63] = -327299027;
        nArray[64] = 881225847;
        nArray[65] = 809987520;
        nArray[66] = 1023691545;
        nArray[67] = 969234094;
        nArray[68] = 662832811;
        nArray[69] = 591600412;
        nArray[70] = 771767749;
        nArray[71] = 717299826;
        nArray[72] = 311336399;
        nArray[73] = 374308984;
        nArray[74] = 453813921;
        nArray[75] = 533576470;
        nArray[76] = 25881363;
        nArray[77] = 88864420;
        nArray[78] = 134795389;
        nArray[79] = 214552010;
        nArray[80] = 2023205639;
        nArray[81] = 2086057648;
        nArray[82] = 1897238633;
        nArray[83] = 1976864222;
        nArray[84] = 1804852699;
        nArray[85] = 1867694188;
        nArray[86] = 1645340341;
        nArray[87] = 1724971778;
        nArray[88] = 1587496639;
        nArray[89] = 1516133128;
        nArray[90] = 1461550545;
        nArray[91] = 1406951526;
        nArray[92] = 1302016099;
        nArray[93] = 1230646740;
        nArray[94] = 1142491917;
        nArray[95] = 1087903418;
        nArray[96] = -1398421865;
        nArray[97] = -1469785312;
        nArray[98] = -1524105735;
        nArray[99] = -1578704818;
        nArray[100] = -1079922613;
        nArray[101] = -1151291908;
        nArray[102] = -1239184603;
        nArray[103] = -1293773166;
        nArray[104] = -1968362705;
        nArray[105] = -1905510760;
        nArray[106] = -2094067647;
        nArray[107] = -2014441994;
        nArray[108] = -1716953613;
        nArray[109] = -1654112188;
        nArray[110] = -1876203875;
        nArray[111] = -1796572374;
        nArray[112] = -525066777;
        nArray[113] = -462094256;
        nArray[114] = -382327159;
        nArray[115] = -302564546;
        nArray[116] = -206542021;
        nArray[117] = -143559028;
        nArray[118] = -97365931;
        nArray[119] = -17609246;
        nArray[120] = -960696225;
        nArray[121] = -1031934488;
        nArray[122] = -817968335;
        nArray[123] = -872425850;
        nArray[124] = -709327229;
        nArray[125] = -780559564;
        nArray[126] = -600130067;
        nArray[127] = -654598054;
        nArray[128] = 1762451694;
        nArray[129] = 1842216281;
        nArray[130] = 1619975040;
        nArray[131] = 1682949687;
        nArray[132] = 2047383090;
        nArray[133] = 2127137669;
        nArray[134] = 1938468188;
        nArray[135] = 2001449195;
        nArray[136] = 1325665622;
        nArray[137] = 1271206113;
        nArray[138] = 1183200824;
        nArray[139] = 1111960463;
        nArray[140] = 1543535498;
        nArray[141] = 1489069629;
        nArray[142] = 1434599652;
        nArray[143] = 1363369299;
        nArray[144] = 622672798;
        nArray[145] = 568075817;
        nArray[146] = 748617968;
        nArray[147] = 677256519;
        nArray[148] = 907627842;
        nArray[149] = 853037301;
        nArray[150] = 1067152940;
        nArray[151] = 995781531;
        nArray[152] = 51762726;
        nArray[153] = 131386257;
        nArray[154] = 177728840;
        nArray[155] = 240578815;
        nArray[156] = 269590778;
        nArray[157] = 349224269;
        nArray[158] = 429104020;
        nArray[159] = 491947555;
        nArray[160] = -248556018;
        nArray[161] = -168932423;
        nArray[162] = -122852000;
        nArray[163] = -60002089;
        nArray[164] = -500490030;
        nArray[165] = -420856475;
        nArray[166] = -341238852;
        nArray[167] = -278395381;
        nArray[168] = -685261898;
        nArray[169] = -739858943;
        nArray[170] = -559578920;
        nArray[171] = -630940305;
        nArray[172] = -1004286614;
        nArray[173] = -1058877219;
        nArray[174] = -845023740;
        nArray[175] = -916395085;
        nArray[176] = -1119974018;
        nArray[177] = -1174433591;
        nArray[178] = -1262701040;
        nArray[179] = -1333941337;
        nArray[180] = -1371866206;
        nArray[181] = -1426332139;
        nArray[182] = -1481064244;
        nArray[183] = -1552294533;
        nArray[184] = -1690935098;
        nArray[185] = -1611170447;
        nArray[186] = -1833673816;
        nArray[187] = -1770699233;
        nArray[188] = -2009983462;
        nArray[189] = -1930228819;
        nArray[190] = -2119160460;
        nArray[191] = -2056179517;
        nArray[192] = 1569362073;
        nArray[193] = 1498123566;
        nArray[194] = 1409854455;
        nArray[195] = 1355396672;
        nArray[196] = 1317987909;
        nArray[197] = 1246755826;
        nArray[198] = 1192025387;
        nArray[199] = 1137557660;
        nArray[200] = 2072149281;
        nArray[201] = 2135122070;
        nArray[202] = 1912620623;
        nArray[203] = 1992383480;
        nArray[204] = 1753615357;
        nArray[205] = 1816598090;
        nArray[206] = 1627664531;
        nArray[207] = 1707420964;
        nArray[208] = 295390185;
        nArray[209] = 358241886;
        nArray[210] = 404320391;
        nArray[211] = 483945776;
        nArray[212] = 43990325;
        nArray[213] = 106832002;
        nArray[214] = 186451547;
        nArray[215] = 266083308;
        nArray[216] = 932423249;
        nArray[217] = 861060070;
        nArray[218] = 1041341759;
        nArray[219] = 986742920;
        nArray[220] = 613929101;
        nArray[221] = 542559546;
        nArray[222] = 756411363;
        nArray[223] = 701822548;
        nArray[224] = -978770311;
        nArray[225] = -1050133554;
        nArray[226] = -869589737;
        nArray[227] = -924188512;
        nArray[228] = -693284699;
        nArray[229] = -764654318;
        nArray[230] = -550540341;
        nArray[231] = -605129092;
        nArray[232] = -475935807;
        nArray[233] = -413084042;
        nArray[234] = -366743377;
        nArray[235] = -287118056;
        nArray[236] = -257573603;
        nArray[237] = -194731862;
        nArray[238] = -114850189;
        nArray[239] = -35218492;
        nArray[240] = -1984365303;
        nArray[241] = -1921392450;
        nArray[242] = -2143631769;
        nArray[243] = -2063868976;
        nArray[244] = -1698919467;
        nArray[245] = -1635936670;
        nArray[246] = -1824608069;
        nArray[247] = -1744851700;
        nArray[248] = -1347415887;
        nArray[249] = -1418654458;
        nArray[250] = -1506661409;
        nArray[251] = -1561119128;
        nArray[252] = -1129027987;
        nArray[253] = -1200260134;
        nArray[254] = -1254728445;
        nArray[255] = -1309196108;
        cfr_renamed_3 = nArray;
    }

    public int cfr_renamed_4949() {
        return ~this.cfr_renamed_4;
    }
}

