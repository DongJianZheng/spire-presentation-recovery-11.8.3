/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjuf;
import com.spire.presentation.packages.sprrdg;

public class sprtag {
    public static final short[] cfr_renamed_3;
    public static final short[] cfr_renamed_4;

    public static short[] cfr_renamed_6997(short[] arg0) {
        int n;
        short[] sArray = new short[256];
        System.arraycopy(arg0, 0, sArray, 0, sArray.length);
        int n2 = 1;
        int n3 = n = 128;
        while (n3 >= 2) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < 256) {
                int n6;
                short s = cfr_renamed_3[n2];
                ++n2;
                int n7 = n4;
                while (n7 < n4 + n) {
                    short s2 = sprtag.cfr_renamed_7014(s, sArray[n6 + n]);
                    int n8 = n6;
                    sArray[n8 + n] = (short)(sArray[n6] - s2);
                    short s3 = (short)(sArray[n6] + s2);
                    sArray[n8] = s3;
                    n7 = ++n6;
                }
                n5 = n6 + n;
            }
            n3 = n >> 1;
        }
        return sArray;
    }

    static {
        short[] sArray = new short[128];
        sArray[0] = 2285;
        sArray[1] = 2571;
        sArray[2] = 2970;
        sArray[3] = 1812;
        sArray[4] = 1493;
        sArray[5] = 1422;
        sArray[6] = 287;
        sArray[7] = 202;
        sArray[8] = 3158;
        sArray[9] = 622;
        sArray[10] = 1577;
        sArray[11] = 182;
        sArray[12] = 962;
        sArray[13] = 2127;
        sArray[14] = 1855;
        sArray[15] = 1468;
        sArray[16] = 573;
        sArray[17] = 2004;
        sArray[18] = 264;
        sArray[19] = 383;
        sArray[20] = 2500;
        sArray[21] = 1458;
        sArray[22] = 1727;
        sArray[23] = 3199;
        sArray[24] = 2648;
        sArray[25] = 1017;
        sArray[26] = 732;
        sArray[27] = 608;
        sArray[28] = 1787;
        sArray[29] = 411;
        sArray[30] = 3124;
        sArray[31] = 1758;
        sArray[32] = 1223;
        sArray[33] = 652;
        sArray[34] = 2777;
        sArray[35] = 1015;
        sArray[36] = 2036;
        sArray[37] = 1491;
        sArray[38] = 3047;
        sArray[39] = 1785;
        sArray[40] = 516;
        sArray[41] = 3321;
        sArray[42] = 3009;
        sArray[43] = 2663;
        sArray[44] = 1711;
        sArray[45] = 2167;
        sArray[46] = 126;
        sArray[47] = 1469;
        sArray[48] = 2476;
        sArray[49] = 3239;
        sArray[50] = 3058;
        sArray[51] = 830;
        sArray[52] = 107;
        sArray[53] = 1908;
        sArray[54] = 3082;
        sArray[55] = 2378;
        sArray[56] = 2931;
        sArray[57] = 961;
        sArray[58] = 1821;
        sArray[59] = 2604;
        sArray[60] = 448;
        sArray[61] = 2264;
        sArray[62] = 677;
        sArray[63] = 2054;
        sArray[64] = 2226;
        sArray[65] = 430;
        sArray[66] = 555;
        sArray[67] = 843;
        sArray[68] = 2078;
        sArray[69] = 871;
        sArray[70] = 1550;
        sArray[71] = 105;
        sArray[72] = 422;
        sArray[73] = 587;
        sArray[74] = 177;
        sArray[75] = 3094;
        sArray[76] = 3038;
        sArray[77] = 2869;
        sArray[78] = 1574;
        sArray[79] = 1653;
        sArray[80] = 3083;
        sArray[81] = 778;
        sArray[82] = 1159;
        sArray[83] = 3182;
        sArray[84] = 2552;
        sArray[85] = 1483;
        sArray[86] = 2727;
        sArray[87] = 1119;
        sArray[88] = 1739;
        sArray[89] = 644;
        sArray[90] = 2457;
        sArray[91] = 349;
        sArray[92] = 418;
        sArray[93] = 329;
        sArray[94] = 3173;
        sArray[95] = 3254;
        sArray[96] = 817;
        sArray[97] = 1097;
        sArray[98] = 603;
        sArray[99] = 610;
        sArray[100] = 1322;
        sArray[101] = 2044;
        sArray[102] = 1864;
        sArray[103] = 384;
        sArray[104] = 2114;
        sArray[105] = 3193;
        sArray[106] = 1218;
        sArray[107] = 1994;
        sArray[108] = 2455;
        sArray[109] = 220;
        sArray[110] = 2142;
        sArray[111] = 1670;
        sArray[112] = 2144;
        sArray[113] = 1799;
        sArray[114] = 2051;
        sArray[115] = 794;
        sArray[116] = 1819;
        sArray[117] = 2475;
        sArray[118] = 2459;
        sArray[119] = 478;
        sArray[120] = 3221;
        sArray[121] = 3021;
        sArray[122] = 996;
        sArray[123] = 991;
        sArray[124] = 958;
        sArray[125] = 1869;
        sArray[126] = 1522;
        sArray[127] = 1628;
        cfr_renamed_3 = sArray;
        short[] sArray2 = new short[128];
        sArray2[0] = 1701;
        sArray2[1] = 1807;
        sArray2[2] = 1460;
        sArray2[3] = 2371;
        sArray2[4] = 2338;
        sArray2[5] = 2333;
        sArray2[6] = 308;
        sArray2[7] = 108;
        sArray2[8] = 2851;
        sArray2[9] = 870;
        sArray2[10] = 854;
        sArray2[11] = 1510;
        sArray2[12] = 2535;
        sArray2[13] = 1278;
        sArray2[14] = 1530;
        sArray2[15] = 1185;
        sArray2[16] = 1659;
        sArray2[17] = 1187;
        sArray2[18] = 3109;
        sArray2[19] = 874;
        sArray2[20] = 1335;
        sArray2[21] = 2111;
        sArray2[22] = 136;
        sArray2[23] = 1215;
        sArray2[24] = 2945;
        sArray2[25] = 1465;
        sArray2[26] = 1285;
        sArray2[27] = 2007;
        sArray2[28] = 2719;
        sArray2[29] = 2726;
        sArray2[30] = 2232;
        sArray2[31] = 2512;
        sArray2[32] = 75;
        sArray2[33] = 156;
        sArray2[34] = 3000;
        sArray2[35] = 2911;
        sArray2[36] = 2980;
        sArray2[37] = 872;
        sArray2[38] = 2685;
        sArray2[39] = 1590;
        sArray2[40] = 2210;
        sArray2[41] = 602;
        sArray2[42] = 1846;
        sArray2[43] = 777;
        sArray2[44] = 147;
        sArray2[45] = 2170;
        sArray2[46] = 2551;
        sArray2[47] = 246;
        sArray2[48] = 1676;
        sArray2[49] = 1755;
        sArray2[50] = 460;
        sArray2[51] = 291;
        sArray2[52] = 235;
        sArray2[53] = 3152;
        sArray2[54] = 2742;
        sArray2[55] = 2907;
        sArray2[56] = 3224;
        sArray2[57] = 1779;
        sArray2[58] = 2458;
        sArray2[59] = 1251;
        sArray2[60] = 2486;
        sArray2[61] = 2774;
        sArray2[62] = 2899;
        sArray2[63] = 1103;
        sArray2[64] = 1275;
        sArray2[65] = 2652;
        sArray2[66] = 1065;
        sArray2[67] = 2881;
        sArray2[68] = 725;
        sArray2[69] = 1508;
        sArray2[70] = 2368;
        sArray2[71] = 398;
        sArray2[72] = 951;
        sArray2[73] = 247;
        sArray2[74] = 1421;
        sArray2[75] = 3222;
        sArray2[76] = 2499;
        sArray2[77] = 271;
        sArray2[78] = 90;
        sArray2[79] = 853;
        sArray2[80] = 1860;
        sArray2[81] = 3203;
        sArray2[82] = 1162;
        sArray2[83] = 1618;
        sArray2[84] = 666;
        sArray2[85] = 320;
        sArray2[86] = 8;
        sArray2[87] = 2813;
        sArray2[88] = 1544;
        sArray2[89] = 282;
        sArray2[90] = 1838;
        sArray2[91] = 1293;
        sArray2[92] = 2314;
        sArray2[93] = 552;
        sArray2[94] = 2677;
        sArray2[95] = 2106;
        sArray2[96] = 1571;
        sArray2[97] = 205;
        sArray2[98] = 2918;
        sArray2[99] = 1542;
        sArray2[100] = 2721;
        sArray2[101] = 2597;
        sArray2[102] = 2312;
        sArray2[103] = 681;
        sArray2[104] = 130;
        sArray2[105] = 1602;
        sArray2[106] = 1871;
        sArray2[107] = 829;
        sArray2[108] = 2946;
        sArray2[109] = 3065;
        sArray2[110] = 1325;
        sArray2[111] = 2756;
        sArray2[112] = 1861;
        sArray2[113] = 1474;
        sArray2[114] = 1202;
        sArray2[115] = 2367;
        sArray2[116] = 3147;
        sArray2[117] = 1752;
        sArray2[118] = 2707;
        sArray2[119] = 171;
        sArray2[120] = 3127;
        sArray2[121] = 3042;
        sArray2[122] = 1907;
        sArray2[123] = 1836;
        sArray2[124] = 1517;
        sArray2[125] = 359;
        sArray2[126] = 758;
        sArray2[127] = 1441;
        cfr_renamed_4 = sArray2;
    }

    public static short cfr_renamed_7014(short arg0, short arg1) {
        return sprrdg.cfr_renamed_6972(arg0 * arg1);
    }

    public static short[] cfr_renamed_6998(short[] arg0) {
        int n;
        int n2;
        short[] sArray = new short[256];
        System.arraycopy(arg0, 0, sArray, 0, 256);
        int n3 = 0;
        int n4 = n2 = 2;
        while (n4 <= 128) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < 256) {
                short s = cfr_renamed_4[n3];
                ++n3;
                int n7 = n5;
                while (n7 < n5 + n2) {
                    short[] sArray2 = sArray;
                    short s2 = sArray2[n];
                    int n8 = n;
                    sArray[n8] = sprrdg.cfr_renamed_6974((short)(s2 + sArray[n8 + n2]));
                    sArray[n + n2] = (short)(s2 - sArray[n + n2]);
                    int n9 = n + n2;
                    short s3 = sprtag.cfr_renamed_7014(s, sArray[n + n2]);
                    sArray2[n9] = s3;
                    n7 = ++n;
                }
                n6 = n + n2;
            }
            n4 = n2 << 1;
        }
        int n10 = n = 0;
        while (n10 < 256) {
            sArray[++n] = sprtag.cfr_renamed_7014(sArray[n], cfr_renamed_4[127]);
            n10 = n;
        }
        return sArray;
    }

    public static void cfr_renamed_7008(sprjuf arg0, int arg1, short arg2, short arg3, short arg4, short arg5, short arg6) {
        short s = sprtag.cfr_renamed_7014(arg3, arg5);
        s = sprtag.cfr_renamed_7014(s, arg6);
        s = (short)(s + sprtag.cfr_renamed_7014(arg2, arg4));
        sprjuf sprjuf2 = arg0;
        sprjuf2.cfr_renamed_6987(arg1, s);
        short s2 = sprtag.cfr_renamed_7014(arg2, arg5);
        s2 = (short)(s2 + sprtag.cfr_renamed_7014(arg3, arg4));
        sprjuf2.cfr_renamed_6987(arg1 + 1, s2);
    }
}

