/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprae;
import com.spire.presentation.packages.spraid;
import com.spire.presentation.packages.sprbfd;
import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprcmf;
import com.spire.presentation.packages.sprcre;
import com.spire.presentation.packages.sprded;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprdkd;
import com.spire.presentation.packages.sprdn;
import com.spire.presentation.packages.sprfhe;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.spried;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spripd;
import com.spire.presentation.packages.sprkkd;
import com.spire.presentation.packages.sprknd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqmd;
import com.spire.presentation.packages.sprrld;
import com.spire.presentation.packages.sprskea;
import com.spire.presentation.packages.sprsmd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtfe;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwed;
import com.spire.presentation.packages.sprwfd;
import com.spire.presentation.packages.sprxdd;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryn;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class sprcvd {
    private static final short[] cfr_renamed_0;
    public static final Map cfr_renamed_1;
    public static final Map cfr_renamed_2;
    public static final Map cfr_renamed_3;
    private static final short[] cfr_renamed_4;

    public static sprxdd cfr_renamed_4059(sprtzd arg0) throws sprlqd {
        sprgnd sprgnd2;
        if (sprdg.cfr_renamed_287.equals(arg0) || sprdg.cfr_renamed_152.equals(arg0) || sprdg.cfr_renamed_102.equals(arg0)) {
            sprgnd2 = new sprgnd(new sprqmd());
        } else if (sprm.cfr_renamed_1262.equals(arg0)) {
            sprgnd2 = new sprgnd(new sprrld());
        } else if (sprdh.cfr_renamed_102.equals(arg0)) {
            sprgnd2 = new sprgnd(new sprbfd());
        } else if (sprm.cfr_renamed_1435.equals(arg0)) {
            sprgnd2 = new sprgnd(new sprsmd());
        } else {
            throw new sprlqd(new StringBuilder().insert(0, sprskea.cfr_renamed_9("xEuJtP;V~GtCuMhA;GrTsAi\u001e;")).append(arg0).toString());
        }
        return new sprknd(sprgnd2, new sprwfd());
    }

    public sprwed cfr_renamed_4208(sprtzd arg0, SecureRandom arg1) throws sprlqd {
        if (sprdg.cfr_renamed_287.equals(arg0)) {
            return this.cfr_renamed_4209(arg1, 128);
        }
        if (sprdg.cfr_renamed_152.equals(arg0)) {
            return this.cfr_renamed_4209(arg1, 192);
        }
        if (sprdg.cfr_renamed_102.equals(arg0)) {
            return this.cfr_renamed_4209(arg1, 256);
        }
        if (sprm.cfr_renamed_1262.equals(arg0)) {
            spried spried2;
            spried spried3 = spried2 = new spried();
            spried3.cfr_renamed_1222(new sprccb(arg1, 192));
            return spried3;
        }
        if (sprae.cfr_renamed_3.equals(arg0)) {
            return this.cfr_renamed_4209(arg1, 128);
        }
        if (sprae.cfr_renamed_1.equals(arg0)) {
            return this.cfr_renamed_4209(arg1, 192);
        }
        if (sprae.cfr_renamed_2.equals(arg0)) {
            return this.cfr_renamed_4209(arg1, 256);
        }
        if (sprdn.cfr_renamed_0.equals(arg0)) {
            return this.cfr_renamed_4209(arg1, 128);
        }
        if (spripd.cfr_renamed_96.equals(arg0)) {
            return this.cfr_renamed_4209(arg1, 128);
        }
        if (sprdh.cfr_renamed_102.equals(arg0)) {
            sprded sprded2 = new sprded();
            sprded2.cfr_renamed_1222(new sprccb(arg1, 64));
            return sprded2;
        }
        if (sprm.cfr_renamed_185.equals(arg0)) {
            return this.cfr_renamed_4209(arg1, 128);
        }
        throw new sprlqd(new StringBuilder().insert(0, sprcmf.cfr_renamed_9("p\\}S|I3Ov^|Z}T`X3^zM{Xa\u00073")).append(arg0).toString());
    }

    public String cfr_renamed_4061(sprtzd arg0) {
        String string = (String)cfr_renamed_3.get(arg0);
        if (string == null) {
            return arg0.cfr_renamed_19();
        }
        return string;
    }

    public static Object cfr_renamed_4210(boolean arg0, sprt arg1, sprije arg2) throws sprlqd {
        sprtzd sprtzd2 = arg2.cfr_renamed_593();
        if (sprtzd2.equals(sprm.cfr_renamed_185)) {
            sprdkd sprdkd2 = new sprdkd();
            sprdkd2.cfr_renamed_1217(arg0, arg1);
            return sprdkd2;
        }
        sprije sprije2 = arg2;
        sprxdd sprxdd2 = sprcvd.cfr_renamed_4059(sprije2.cfr_renamed_593());
        sprvva sprvva2 = sprije2.cfr_renamed_284().cfr_renamed_119();
        if (sprvva2 != null && !(sprvva2 instanceof sprcre)) {
            if (sprtzd2.equals(spripd.cfr_renamed_145) || sprtzd2.equals(spripd.cfr_renamed_1226) || sprtzd2.equals(spripd.spr\ufe34) || sprtzd2.equals(spripd.cfr_renamed_88) || sprtzd2.equals(spripd.cfr_renamed_105) || sprtzd2.equals(spripd.cfr_renamed_114) || sprtzd2.equals(spripd.cfr_renamed_272) || sprtzd2.equals(spripd.cfr_renamed_79) || sprtzd2.equals(spripd.cfr_renamed_86) || sprtzd2.equals(sprdh.cfr_renamed_102)) {
                sprxdd sprxdd3 = sprxdd2;
                sprxdd3.cfr_renamed_1217(arg0, new sprnjd(arg1, sprxue.cfr_renamed_23(sprvva2).cfr_renamed_186()));
                return sprxdd3;
            }
            if (sprtzd2.equals(spripd.cfr_renamed_96)) {
                sprtfe sprtfe2 = sprtfe.cfr_renamed_23(sprvva2);
                sprxdd sprxdd4 = sprxdd2;
                sprxdd4.cfr_renamed_1217(arg0, new sprnjd(arg1, sprtfe2.cfr_renamed_1205()));
                return sprxdd4;
            }
            if (sprtzd2.equals(spripd.cfr_renamed_2)) {
                sprfhe sprfhe2 = sprfhe.cfr_renamed_23(sprvva2);
                sprxdd2.cfr_renamed_1217(arg0, new sprnjd(new sprkkd(((sprnld)arg1).cfr_renamed_1521(), cfr_renamed_4[sprfhe2.cfr_renamed_4211().intValue()]), sprfhe2.cfr_renamed_1205()));
                return sprxdd2;
            }
            throw new sprlqd(sprskea.cfr_renamed_9("xEuJtP;IzPxL;TzVzI~P~Vh"));
        }
        if (sprtzd2.equals(spripd.cfr_renamed_145) || sprtzd2.equals(spripd.cfr_renamed_1226) || sprtzd2.equals(spripd.cfr_renamed_96)) {
            sprxdd sprxdd5 = sprxdd2;
            sprxdd5.cfr_renamed_1217(arg0, new sprnjd(arg1, new byte[8]));
            return sprxdd5;
        }
        sprxdd sprxdd6 = sprxdd2;
        sprxdd6.cfr_renamed_1217(arg0, arg1);
        return sprxdd6;
    }

    static {
        cfr_renamed_3 = new HashMap();
        cfr_renamed_2 = new HashMap();
        cfr_renamed_1 = new HashMap();
        cfr_renamed_3.put(spripd.cfr_renamed_145, sprcmf.cfr_renamed_9("yVnVyV"));
        cfr_renamed_3.put(spripd.spr\ufe34, sprskea.cfr_renamed_9("ZaH"));
        cfr_renamed_3.put(spripd.cfr_renamed_88, sprcmf.cfr_renamed_9("Rx@"));
        cfr_renamed_3.put(spripd.cfr_renamed_105, sprskea.cfr_renamed_9("ZaH"));
        cfr_renamed_2.put(spripd.cfr_renamed_145, sprcmf.cfr_renamed_9("Wx@xWx<~Q~<mX~@\bC\\wYzSt"));
        cfr_renamed_2.put(spripd.spr\ufe34, sprskea.cfr_renamed_9("e^w4gYg4tPgH\u0011KE\u007f@rJ|"));
        cfr_renamed_2.put(spripd.cfr_renamed_88, sprcmf.cfr_renamed_9("|Vn<~Q~<mX~@\bC\\wYzSt"));
        cfr_renamed_2.put(spripd.cfr_renamed_105, sprskea.cfr_renamed_9("e^w4gYg4tPgH\u0011KE\u007f@rJ|"));
        cfr_renamed_2.put(new sprtzd(sprm.cfr_renamed_1510.cfr_renamed_19()), sprcmf.cfr_renamed_9("o@|<xP\u007f<mX~@\fC\\wYzSt"));
        cfr_renamed_2.put(spripd.cfr_renamed_96, sprskea.cfr_renamed_9("gZwO\u00114gYg4tPgH\u0011KE\u007f@rJ|"));
        cfr_renamed_2.put(spripd.cfr_renamed_114, sprcmf.cfr_renamed_9("P\\~X\u007fQz\\<~Q~<mX~@\bC\\wYzSt"));
        cfr_renamed_2.put(spripd.cfr_renamed_272, sprskea.cfr_renamed_9("XEvAwHrE4gYg4tPgH\u0011KE\u007f@rJ|"));
        cfr_renamed_2.put(spripd.cfr_renamed_79, sprcmf.cfr_renamed_9("P\\~X\u007fQz\\<~Q~<mX~@\bC\\wYzSt"));
        cfr_renamed_2.put(spripd.cfr_renamed_86, sprskea.cfr_renamed_9("Ha^`4gYg4tPgH\u0011KE\u007f@rJ|"));
        cfr_renamed_1.put(spripd.cfr_renamed_145, sprcmf.cfr_renamed_9("Wx@xWx^\\p"));
        cfr_renamed_1.put(spripd.spr\ufe34, sprskea.cfr_renamed_9("e^wVEx"));
        cfr_renamed_1.put(spripd.cfr_renamed_88, sprcmf.cfr_renamed_9("|Vn^\\p"));
        cfr_renamed_1.put(spripd.cfr_renamed_105, sprskea.cfr_renamed_9("e^wVEx"));
        cfr_renamed_1.put(spripd.cfr_renamed_2, sprcmf.cfr_renamed_9("oP\u000f^\\p"));
        short[] sArray = new short[256];
        sArray[0] = 189;
        sArray[1] = 86;
        sArray[2] = 234;
        sArray[3] = 242;
        sArray[4] = 162;
        sArray[5] = 241;
        sArray[6] = 172;
        sArray[7] = 42;
        sArray[8] = 176;
        sArray[9] = 147;
        sArray[10] = 209;
        sArray[11] = 156;
        sArray[12] = 27;
        sArray[13] = 51;
        sArray[14] = 253;
        sArray[15] = 208;
        sArray[16] = 48;
        sArray[17] = 4;
        sArray[18] = 182;
        sArray[19] = 220;
        sArray[20] = 125;
        sArray[21] = 223;
        sArray[22] = 50;
        sArray[23] = 75;
        sArray[24] = 247;
        sArray[25] = 203;
        sArray[26] = 69;
        sArray[27] = 155;
        sArray[28] = 49;
        sArray[29] = 187;
        sArray[30] = 33;
        sArray[31] = 90;
        sArray[32] = 65;
        sArray[33] = 159;
        sArray[34] = 225;
        sArray[35] = 217;
        sArray[36] = 74;
        sArray[37] = 77;
        sArray[38] = 158;
        sArray[39] = 218;
        sArray[40] = 160;
        sArray[41] = 104;
        sArray[42] = 44;
        sArray[43] = 195;
        sArray[44] = 39;
        sArray[45] = 95;
        sArray[46] = 128;
        sArray[47] = 54;
        sArray[48] = 62;
        sArray[49] = 238;
        sArray[50] = 251;
        sArray[51] = 149;
        sArray[52] = 26;
        sArray[53] = 254;
        sArray[54] = 206;
        sArray[55] = 168;
        sArray[56] = 52;
        sArray[57] = 169;
        sArray[58] = 19;
        sArray[59] = 240;
        sArray[60] = 166;
        sArray[61] = 63;
        sArray[62] = 216;
        sArray[63] = 12;
        sArray[64] = 120;
        sArray[65] = 36;
        sArray[66] = 175;
        sArray[67] = 35;
        sArray[68] = 82;
        sArray[69] = 193;
        sArray[70] = 103;
        sArray[71] = 23;
        sArray[72] = 245;
        sArray[73] = 102;
        sArray[74] = 144;
        sArray[75] = 231;
        sArray[76] = 232;
        sArray[77] = 7;
        sArray[78] = 184;
        sArray[79] = 96;
        sArray[80] = 72;
        sArray[81] = 230;
        sArray[82] = 30;
        sArray[83] = 83;
        sArray[84] = 243;
        sArray[85] = 146;
        sArray[86] = 164;
        sArray[87] = 114;
        sArray[88] = 140;
        sArray[89] = 8;
        sArray[90] = 21;
        sArray[91] = 110;
        sArray[92] = 134;
        sArray[93] = 0;
        sArray[94] = 132;
        sArray[95] = 250;
        sArray[96] = 244;
        sArray[97] = 127;
        sArray[98] = 138;
        sArray[99] = 66;
        sArray[100] = 25;
        sArray[101] = 246;
        sArray[102] = 219;
        sArray[103] = 205;
        sArray[104] = 20;
        sArray[105] = 141;
        sArray[106] = 80;
        sArray[107] = 18;
        sArray[108] = 186;
        sArray[109] = 60;
        sArray[110] = 6;
        sArray[111] = 78;
        sArray[112] = 236;
        sArray[113] = 179;
        sArray[114] = 53;
        sArray[115] = 17;
        sArray[116] = 161;
        sArray[117] = 136;
        sArray[118] = 142;
        sArray[119] = 43;
        sArray[120] = 148;
        sArray[121] = 153;
        sArray[122] = 183;
        sArray[123] = 113;
        sArray[124] = 116;
        sArray[125] = 211;
        sArray[126] = 228;
        sArray[127] = 191;
        sArray[128] = 58;
        sArray[129] = 222;
        sArray[130] = 150;
        sArray[131] = 14;
        sArray[132] = 188;
        sArray[133] = 10;
        sArray[134] = 237;
        sArray[135] = 119;
        sArray[136] = 252;
        sArray[137] = 55;
        sArray[138] = 107;
        sArray[139] = 3;
        sArray[140] = 121;
        sArray[141] = 137;
        sArray[142] = 98;
        sArray[143] = 198;
        sArray[144] = 215;
        sArray[145] = 192;
        sArray[146] = 210;
        sArray[147] = 124;
        sArray[148] = 106;
        sArray[149] = 139;
        sArray[150] = 34;
        sArray[151] = 163;
        sArray[152] = 91;
        sArray[153] = 5;
        sArray[154] = 93;
        sArray[155] = 2;
        sArray[156] = 117;
        sArray[157] = 213;
        sArray[158] = 97;
        sArray[159] = 227;
        sArray[160] = 24;
        sArray[161] = 143;
        sArray[162] = 85;
        sArray[163] = 81;
        sArray[164] = 173;
        sArray[165] = 31;
        sArray[166] = 11;
        sArray[167] = 94;
        sArray[168] = 133;
        sArray[169] = 229;
        sArray[170] = 194;
        sArray[171] = 87;
        sArray[172] = 99;
        sArray[173] = 202;
        sArray[174] = 61;
        sArray[175] = 108;
        sArray[176] = 180;
        sArray[177] = 197;
        sArray[178] = 204;
        sArray[179] = 112;
        sArray[180] = 178;
        sArray[181] = 145;
        sArray[182] = 89;
        sArray[183] = 13;
        sArray[184] = 71;
        sArray[185] = 32;
        sArray[186] = 200;
        sArray[187] = 79;
        sArray[188] = 88;
        sArray[189] = 224;
        sArray[190] = 1;
        sArray[191] = 226;
        sArray[192] = 22;
        sArray[193] = 56;
        sArray[194] = 196;
        sArray[195] = 111;
        sArray[196] = 59;
        sArray[197] = 15;
        sArray[198] = 101;
        sArray[199] = 70;
        sArray[200] = 190;
        sArray[201] = 126;
        sArray[202] = 45;
        sArray[203] = 123;
        sArray[204] = 130;
        sArray[205] = 249;
        sArray[206] = 64;
        sArray[207] = 181;
        sArray[208] = 29;
        sArray[209] = 115;
        sArray[210] = 248;
        sArray[211] = 235;
        sArray[212] = 38;
        sArray[213] = 199;
        sArray[214] = 135;
        sArray[215] = 151;
        sArray[216] = 37;
        sArray[217] = 84;
        sArray[218] = 177;
        sArray[219] = 40;
        sArray[220] = 170;
        sArray[221] = 152;
        sArray[222] = 157;
        sArray[223] = 165;
        sArray[224] = 100;
        sArray[225] = 109;
        sArray[226] = 122;
        sArray[227] = 212;
        sArray[228] = 16;
        sArray[229] = 129;
        sArray[230] = 68;
        sArray[231] = 239;
        sArray[232] = 73;
        sArray[233] = 214;
        sArray[234] = 174;
        sArray[235] = 46;
        sArray[236] = 221;
        sArray[237] = 118;
        sArray[238] = 92;
        sArray[239] = 47;
        sArray[240] = 167;
        sArray[241] = 28;
        sArray[242] = 201;
        sArray[243] = 9;
        sArray[244] = 105;
        sArray[245] = 154;
        sArray[246] = 131;
        sArray[247] = 207;
        sArray[248] = 41;
        sArray[249] = 57;
        sArray[250] = 185;
        sArray[251] = 233;
        sArray[252] = 76;
        sArray[253] = 255;
        sArray[254] = 67;
        sArray[255] = 171;
        cfr_renamed_0 = sArray;
        short[] sArray2 = new short[256];
        sArray2[0] = 93;
        sArray2[1] = 190;
        sArray2[2] = 155;
        sArray2[3] = 139;
        sArray2[4] = 17;
        sArray2[5] = 153;
        sArray2[6] = 110;
        sArray2[7] = 77;
        sArray2[8] = 89;
        sArray2[9] = 243;
        sArray2[10] = 133;
        sArray2[11] = 166;
        sArray2[12] = 63;
        sArray2[13] = 183;
        sArray2[14] = 131;
        sArray2[15] = 197;
        sArray2[16] = 228;
        sArray2[17] = 115;
        sArray2[18] = 107;
        sArray2[19] = 58;
        sArray2[20] = 104;
        sArray2[21] = 90;
        sArray2[22] = 192;
        sArray2[23] = 71;
        sArray2[24] = 160;
        sArray2[25] = 100;
        sArray2[26] = 52;
        sArray2[27] = 12;
        sArray2[28] = 241;
        sArray2[29] = 208;
        sArray2[30] = 82;
        sArray2[31] = 165;
        sArray2[32] = 185;
        sArray2[33] = 30;
        sArray2[34] = 150;
        sArray2[35] = 67;
        sArray2[36] = 65;
        sArray2[37] = 216;
        sArray2[38] = 212;
        sArray2[39] = 44;
        sArray2[40] = 219;
        sArray2[41] = 248;
        sArray2[42] = 7;
        sArray2[43] = 119;
        sArray2[44] = 42;
        sArray2[45] = 202;
        sArray2[46] = 235;
        sArray2[47] = 239;
        sArray2[48] = 16;
        sArray2[49] = 28;
        sArray2[50] = 22;
        sArray2[51] = 13;
        sArray2[52] = 56;
        sArray2[53] = 114;
        sArray2[54] = 47;
        sArray2[55] = 137;
        sArray2[56] = 193;
        sArray2[57] = 249;
        sArray2[58] = 128;
        sArray2[59] = 196;
        sArray2[60] = 109;
        sArray2[61] = 174;
        sArray2[62] = 48;
        sArray2[63] = 61;
        sArray2[64] = 206;
        sArray2[65] = 32;
        sArray2[66] = 99;
        sArray2[67] = 254;
        sArray2[68] = 230;
        sArray2[69] = 26;
        sArray2[70] = 199;
        sArray2[71] = 184;
        sArray2[72] = 80;
        sArray2[73] = 232;
        sArray2[74] = 36;
        sArray2[75] = 23;
        sArray2[76] = 252;
        sArray2[77] = 37;
        sArray2[78] = 111;
        sArray2[79] = 187;
        sArray2[80] = 106;
        sArray2[81] = 163;
        sArray2[82] = 68;
        sArray2[83] = 83;
        sArray2[84] = 217;
        sArray2[85] = 162;
        sArray2[86] = 1;
        sArray2[87] = 171;
        sArray2[88] = 188;
        sArray2[89] = 182;
        sArray2[90] = 31;
        sArray2[91] = 152;
        sArray2[92] = 238;
        sArray2[93] = 154;
        sArray2[94] = 167;
        sArray2[95] = 45;
        sArray2[96] = 79;
        sArray2[97] = 158;
        sArray2[98] = 142;
        sArray2[99] = 172;
        sArray2[100] = 224;
        sArray2[101] = 198;
        sArray2[102] = 73;
        sArray2[103] = 70;
        sArray2[104] = 41;
        sArray2[105] = 244;
        sArray2[106] = 148;
        sArray2[107] = 138;
        sArray2[108] = 175;
        sArray2[109] = 225;
        sArray2[110] = 91;
        sArray2[111] = 195;
        sArray2[112] = 179;
        sArray2[113] = 123;
        sArray2[114] = 87;
        sArray2[115] = 209;
        sArray2[116] = 124;
        sArray2[117] = 156;
        sArray2[118] = 237;
        sArray2[119] = 135;
        sArray2[120] = 64;
        sArray2[121] = 140;
        sArray2[122] = 226;
        sArray2[123] = 203;
        sArray2[124] = 147;
        sArray2[125] = 20;
        sArray2[126] = 201;
        sArray2[127] = 97;
        sArray2[128] = 46;
        sArray2[129] = 229;
        sArray2[130] = 204;
        sArray2[131] = 246;
        sArray2[132] = 94;
        sArray2[133] = 168;
        sArray2[134] = 92;
        sArray2[135] = 214;
        sArray2[136] = 117;
        sArray2[137] = 141;
        sArray2[138] = 98;
        sArray2[139] = 149;
        sArray2[140] = 88;
        sArray2[141] = 105;
        sArray2[142] = 118;
        sArray2[143] = 161;
        sArray2[144] = 74;
        sArray2[145] = 181;
        sArray2[146] = 85;
        sArray2[147] = 9;
        sArray2[148] = 120;
        sArray2[149] = 51;
        sArray2[150] = 130;
        sArray2[151] = 215;
        sArray2[152] = 221;
        sArray2[153] = 121;
        sArray2[154] = 245;
        sArray2[155] = 27;
        sArray2[156] = 11;
        sArray2[157] = 222;
        sArray2[158] = 38;
        sArray2[159] = 33;
        sArray2[160] = 40;
        sArray2[161] = 116;
        sArray2[162] = 4;
        sArray2[163] = 151;
        sArray2[164] = 86;
        sArray2[165] = 223;
        sArray2[166] = 60;
        sArray2[167] = 240;
        sArray2[168] = 55;
        sArray2[169] = 57;
        sArray2[170] = 220;
        sArray2[171] = 255;
        sArray2[172] = 6;
        sArray2[173] = 164;
        sArray2[174] = 234;
        sArray2[175] = 66;
        sArray2[176] = 8;
        sArray2[177] = 218;
        sArray2[178] = 180;
        sArray2[179] = 113;
        sArray2[180] = 176;
        sArray2[181] = 207;
        sArray2[182] = 18;
        sArray2[183] = 122;
        sArray2[184] = 78;
        sArray2[185] = 250;
        sArray2[186] = 108;
        sArray2[187] = 29;
        sArray2[188] = 132;
        sArray2[189] = 0;
        sArray2[190] = 200;
        sArray2[191] = 127;
        sArray2[192] = 145;
        sArray2[193] = 69;
        sArray2[194] = 170;
        sArray2[195] = 43;
        sArray2[196] = 194;
        sArray2[197] = 177;
        sArray2[198] = 143;
        sArray2[199] = 213;
        sArray2[200] = 186;
        sArray2[201] = 242;
        sArray2[202] = 173;
        sArray2[203] = 25;
        sArray2[204] = 178;
        sArray2[205] = 103;
        sArray2[206] = 54;
        sArray2[207] = 247;
        sArray2[208] = 15;
        sArray2[209] = 10;
        sArray2[210] = 146;
        sArray2[211] = 125;
        sArray2[212] = 227;
        sArray2[213] = 157;
        sArray2[214] = 233;
        sArray2[215] = 144;
        sArray2[216] = 62;
        sArray2[217] = 35;
        sArray2[218] = 39;
        sArray2[219] = 102;
        sArray2[220] = 19;
        sArray2[221] = 236;
        sArray2[222] = 129;
        sArray2[223] = 21;
        sArray2[224] = 189;
        sArray2[225] = 34;
        sArray2[226] = 191;
        sArray2[227] = 159;
        sArray2[228] = 126;
        sArray2[229] = 169;
        sArray2[230] = 81;
        sArray2[231] = 75;
        sArray2[232] = 76;
        sArray2[233] = 251;
        sArray2[234] = 2;
        sArray2[235] = 211;
        sArray2[236] = 112;
        sArray2[237] = 134;
        sArray2[238] = 49;
        sArray2[239] = 231;
        sArray2[240] = 59;
        sArray2[241] = 5;
        sArray2[242] = 3;
        sArray2[243] = 84;
        sArray2[244] = 96;
        sArray2[245] = 72;
        sArray2[246] = 101;
        sArray2[247] = 24;
        sArray2[248] = 210;
        sArray2[249] = 205;
        sArray2[250] = 95;
        sArray2[251] = 50;
        sArray2[252] = 136;
        sArray2[253] = 14;
        sArray2[254] = 53;
        sArray2[255] = 253;
        cfr_renamed_4 = sArray2;
    }

    private /* synthetic */ sprwed cfr_renamed_4209(SecureRandom arg0, int arg1) {
        sprwed sprwed2;
        sprwed sprwed3 = sprwed2 = new sprwed();
        sprwed3.cfr_renamed_1222(new sprccb(arg0, arg1));
        return sprwed3;
    }

    public sprije cfr_renamed_4212(sprtzd arg0, sprt arg1, SecureRandom arg2) throws sprlqd {
        if (arg0.equals(spripd.spr\ufe34) || arg0.equals(spripd.cfr_renamed_88) || arg0.equals(spripd.cfr_renamed_105) || arg0.equals(spripd.cfr_renamed_114) || arg0.equals(spripd.cfr_renamed_272) || arg0.equals(spripd.cfr_renamed_79) || arg0.equals(spripd.cfr_renamed_86)) {
            byte[] byArray = new byte[16];
            arg2.nextBytes(byArray);
            return new sprije(arg0, new sprlqe(byArray));
        }
        if (arg0.equals(spripd.cfr_renamed_145) || arg0.equals(spripd.cfr_renamed_1226) || arg0.equals(sprdh.cfr_renamed_102)) {
            byte[] byArray = new byte[8];
            arg2.nextBytes(byArray);
            return new sprije(arg0, new sprlqe(byArray));
        }
        if (arg0.equals(spripd.cfr_renamed_96)) {
            byte[] byArray = new byte[8];
            arg2.nextBytes(byArray);
            sprtfe sprtfe2 = new sprtfe(byArray, ((sprnld)arg1).cfr_renamed_1521().length * 8);
            return new sprije(arg0, sprtfe2);
        }
        if (arg0.equals(sprm.cfr_renamed_185)) {
            return new sprije(arg0, sprume.cfr_renamed_3);
        }
        throw new sprlqd(sprskea.cfr_renamed_9("nJzFwA;Pt\u0004vEoGs\u0004zH|KiMoLv"));
    }

    public static spryn cfr_renamed_4040(sprtzd arg0) throws sprlqd {
        if (sprdg.cfr_renamed_287.equals(arg0) || sprdg.cfr_renamed_152.equals(arg0) || sprdg.cfr_renamed_102.equals(arg0)) {
            return new spraid(new sprqmd());
        }
        if (sprm.cfr_renamed_1262.equals(arg0)) {
            return new spraid(new sprrld());
        }
        if (sprdh.cfr_renamed_102.equals(arg0)) {
            return new spraid(new sprbfd());
        }
        if (sprm.cfr_renamed_1435.equals(arg0)) {
            return new spraid(new sprsmd());
        }
        throw new sprlqd(new StringBuilder().insert(0, sprcmf.cfr_renamed_9("^rS}Rg\u001daXpRtSzNv\u001ddOrMcXa\u00073")).append(arg0).toString());
    }
}

