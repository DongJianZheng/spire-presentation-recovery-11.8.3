/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprnraa;
import com.spire.presentation.packages.sprovm;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprqdn {
    private static long[] cfr_renamed_4;

    public static long cfr_renamed_12094(spreen arg0, int arg1) {
        if (arg0 == null) {
            throw new NullPointerException("stream");
        }
        long l = 0L;
        int n = arg1;
        int n2 = (int)(arg0.cfr_renamed_806() - arg0.cfr_renamed_3274());
        if (n2 < arg1 || arg1 < 0) {
            throw new IllegalArgumentException(sprnraa.cfr_renamed_9("n?L?S;J;L~P?S;\u0004~R;P9J6"));
        }
        byte[] byArray = new byte[Math.min(n2, 4096)];
        int n3 = n;
        while (n3 > 0) {
            int n4 = Math.min(n, 4096);
            int n5 = arg0.cfr_renamed_11556(byArray, 0, n4);
            if (n5 == 0) {
                throw new sprovm(sprpch.cfr_renamed_9("\td(*#lly8x)k!*>o-i$o("));
            }
            l = sprqdn.cfr_renamed_12085(byArray, 0, n5, l);
            n3 = n - n5;
        }
        return l;
    }

    public static long cfr_renamed_12085(byte[] arg0, int arg1, int arg2, long arg3) {
        if (arg0 == null) {
            throw new NullPointerException(sprnraa.cfr_renamed_9("\\+X8[,"));
        }
        arg3 = (arg3 ^ 0xFFFFFFFFFFFFFFFFL) & 0xFFFFFFFFL;
        int n = arg1;
        int n2 = arg1 + arg2;
        int n3 = n;
        while (n3 < n2) {
            long l = cfr_renamed_4[(int)((arg3 ^ (long)arg0[n]) & 0xFFL)];
            arg3 = arg3 >> 8 ^ l;
            n3 = ++n;
        }
        return (arg3 ^ 0xFFFFFFFFFFFFFFFFL) & 0xFFFFFFFFL;
    }

    static {
        long[] lArray = new long[256];
        lArray[0] = 0L;
        lArray[1] = 1996959894L;
        lArray[2] = 3993919788L;
        lArray[3] = 2567524794L;
        lArray[4] = 124634137L;
        lArray[5] = 1886057615L;
        lArray[6] = 3915621685L;
        lArray[7] = 2657392035L;
        lArray[8] = 249268274L;
        lArray[9] = 2044508324L;
        lArray[10] = 3772115230L;
        lArray[11] = 2547177864L;
        lArray[12] = 162941995L;
        lArray[13] = 2125561021L;
        lArray[14] = 3887607047L;
        lArray[15] = 2428444049L;
        lArray[16] = 498536548L;
        lArray[17] = 1789927666L;
        lArray[18] = 4089016648L;
        lArray[19] = 2227061214L;
        lArray[20] = 450548861L;
        lArray[21] = 1843258603L;
        lArray[22] = 4107580753L;
        lArray[23] = 2211677639L;
        lArray[24] = 325883990L;
        lArray[25] = 1684777152L;
        lArray[26] = 4251122042L;
        lArray[27] = 2321926636L;
        lArray[28] = 335633487L;
        lArray[29] = 1661365465L;
        lArray[30] = 4195302755L;
        lArray[31] = 2366115317L;
        lArray[32] = 997073096L;
        lArray[33] = 1281953886L;
        lArray[34] = 3579855332L;
        lArray[35] = 2724688242L;
        lArray[36] = 1006888145L;
        lArray[37] = 1258607687L;
        lArray[38] = 3524101629L;
        lArray[39] = 2768942443L;
        lArray[40] = 901097722L;
        lArray[41] = 1119000684L;
        lArray[42] = 3686517206L;
        lArray[43] = 2898065728L;
        lArray[44] = 853044451L;
        lArray[45] = 1172266101L;
        lArray[46] = 3705015759L;
        lArray[47] = 2882616665L;
        lArray[48] = 651767980L;
        lArray[49] = 1373503546L;
        lArray[50] = 3369554304L;
        lArray[51] = 3218104598L;
        lArray[52] = 565507253L;
        lArray[53] = 1454621731L;
        lArray[54] = 3485111705L;
        lArray[55] = 3099436303L;
        lArray[56] = 671266974L;
        lArray[57] = 1594198024L;
        lArray[58] = 3322730930L;
        lArray[59] = 2970347812L;
        lArray[60] = 795835527L;
        lArray[61] = 1483230225L;
        lArray[62] = 3244367275L;
        lArray[63] = 3060149565L;
        lArray[64] = 1994146192L;
        lArray[65] = 31158534L;
        lArray[66] = 2563907772L;
        lArray[67] = 4023717930L;
        lArray[68] = 1907459465L;
        lArray[69] = 112637215L;
        lArray[70] = 2680153253L;
        lArray[71] = 3904427059L;
        lArray[72] = 2013776290L;
        lArray[73] = 251722036L;
        lArray[74] = 2517215374L;
        lArray[75] = 3775830040L;
        lArray[76] = 2137656763L;
        lArray[77] = 141376813L;
        lArray[78] = 2439277719L;
        lArray[79] = 3865271297L;
        lArray[80] = 1802195444L;
        lArray[81] = 476864866L;
        lArray[82] = 2238001368L;
        lArray[83] = 4066508878L;
        lArray[84] = 1812370925L;
        lArray[85] = 453092731L;
        lArray[86] = 2181625025L;
        lArray[87] = 4111451223L;
        lArray[88] = 1706088902L;
        lArray[89] = 314042704L;
        lArray[90] = 2344532202L;
        lArray[91] = 4240017532L;
        lArray[92] = 1658658271L;
        lArray[93] = 366619977L;
        lArray[94] = 2362670323L;
        lArray[95] = 4224994405L;
        lArray[96] = 1303535960L;
        lArray[97] = 984961486L;
        lArray[98] = 2747007092L;
        lArray[99] = 3569037538L;
        lArray[100] = 1256170817L;
        lArray[101] = 1037604311L;
        lArray[102] = 2765210733L;
        lArray[103] = 3554079995L;
        lArray[104] = 1131014506L;
        lArray[105] = 879679996L;
        lArray[106] = 2909243462L;
        lArray[107] = 3663771856L;
        lArray[108] = 1141124467L;
        lArray[109] = 855842277L;
        lArray[110] = 2852801631L;
        lArray[111] = 3708648649L;
        lArray[112] = 1342533948L;
        lArray[113] = 654459306L;
        lArray[114] = 3188396048L;
        lArray[115] = 3373015174L;
        lArray[116] = 1466479909L;
        lArray[117] = 544179635L;
        lArray[118] = 3110523913L;
        lArray[119] = 3462522015L;
        lArray[120] = 1591671054L;
        lArray[121] = 702138776L;
        lArray[122] = 2966460450L;
        lArray[123] = 3352799412L;
        lArray[124] = 1504918807L;
        lArray[125] = 783551873L;
        lArray[126] = 3082640443L;
        lArray[127] = 3233442989L;
        lArray[128] = 3988292384L;
        lArray[129] = 2596254646L;
        lArray[130] = 62317068L;
        lArray[131] = 1957810842L;
        lArray[132] = 3939845945L;
        lArray[133] = 2647816111L;
        lArray[134] = 81470997L;
        lArray[135] = 1943803523L;
        lArray[136] = 3814918930L;
        lArray[137] = 2489596804L;
        lArray[138] = 225274430L;
        lArray[139] = 2053790376L;
        lArray[140] = 3826175755L;
        lArray[141] = 2466906013L;
        lArray[142] = 167816743L;
        lArray[143] = 2097651377L;
        lArray[144] = 4027552580L;
        lArray[145] = 2265490386L;
        lArray[146] = 503444072L;
        lArray[147] = 1762050814L;
        lArray[148] = 4150417245L;
        lArray[149] = 2154129355L;
        lArray[150] = 426522225L;
        lArray[151] = 1852507879L;
        lArray[152] = 4275313526L;
        lArray[153] = 2312317920L;
        lArray[154] = 282753626L;
        lArray[155] = 1742555852L;
        lArray[156] = 4189708143L;
        lArray[157] = 2394877945L;
        lArray[158] = 397917763L;
        lArray[159] = 1622183637L;
        lArray[160] = 3604390888L;
        lArray[161] = 2714866558L;
        lArray[162] = 953729732L;
        lArray[163] = 1340076626L;
        lArray[164] = 3518719985L;
        lArray[165] = 2797360999L;
        lArray[166] = 1068828381L;
        lArray[167] = 1219638859L;
        lArray[168] = 3624741850L;
        lArray[169] = 2936675148L;
        lArray[170] = 906185462L;
        lArray[171] = 1090812512L;
        lArray[172] = 3747672003L;
        lArray[173] = 2825379669L;
        lArray[174] = 829329135L;
        lArray[175] = 1181335161L;
        lArray[176] = 3412177804L;
        lArray[177] = 3160834842L;
        lArray[178] = 628085408L;
        lArray[179] = 1382605366L;
        lArray[180] = 3423369109L;
        lArray[181] = 3138078467L;
        lArray[182] = 570562233L;
        lArray[183] = 1426400815L;
        lArray[184] = 3317316542L;
        lArray[185] = 2998733608L;
        lArray[186] = 733239954L;
        lArray[187] = 1555261956L;
        lArray[188] = 3268935591L;
        lArray[189] = 3050360625L;
        lArray[190] = 752459403L;
        lArray[191] = 1541320221L;
        lArray[192] = 2607071920L;
        lArray[193] = 3965973030L;
        lArray[194] = 1969922972L;
        lArray[195] = 40735498L;
        lArray[196] = 2617837225L;
        lArray[197] = 3943577151L;
        lArray[198] = 1913087877L;
        lArray[199] = 83908371L;
        lArray[200] = 2512341634L;
        lArray[201] = 3803740692L;
        lArray[202] = 2075208622L;
        lArray[203] = 213261112L;
        lArray[204] = 2463272603L;
        lArray[205] = 3855990285L;
        lArray[206] = 2094854071L;
        lArray[207] = 198958881L;
        lArray[208] = 2262029012L;
        lArray[209] = 4057260610L;
        lArray[210] = 1759359992L;
        lArray[211] = 534414190L;
        lArray[212] = 2176718541L;
        lArray[213] = 4139329115L;
        lArray[214] = 1873836001L;
        lArray[215] = 414664567L;
        lArray[216] = 2282248934L;
        lArray[217] = 4279200368L;
        lArray[218] = 1711684554L;
        lArray[219] = 285281116L;
        lArray[220] = 2405801727L;
        lArray[221] = 4167216745L;
        lArray[222] = 1634467795L;
        lArray[223] = 376229701L;
        lArray[224] = 2685067896L;
        lArray[225] = 3608007406L;
        lArray[226] = 1308918612L;
        lArray[227] = 956543938L;
        lArray[228] = 2808555105L;
        lArray[229] = 3495958263L;
        lArray[230] = 1231636301L;
        lArray[231] = 1047427035L;
        lArray[232] = 2932959818L;
        lArray[233] = 3654703836L;
        lArray[234] = 1088359270L;
        lArray[235] = 936918000L;
        lArray[236] = 2847714899L;
        lArray[237] = 3736837829L;
        lArray[238] = 1202900863L;
        lArray[239] = 817233897L;
        lArray[240] = 3183342108L;
        lArray[241] = 3401237130L;
        lArray[242] = 1404277552L;
        lArray[243] = 615818150L;
        lArray[244] = 3134207493L;
        lArray[245] = 3453421203L;
        lArray[246] = 1423857449L;
        lArray[247] = 601450431L;
        lArray[248] = 3009837614L;
        lArray[249] = 3294710456L;
        lArray[250] = 1567103746L;
        lArray[251] = 711928724L;
        lArray[252] = 3020668471L;
        lArray[253] = 3272380065L;
        lArray[254] = 1510334235L;
        lArray[255] = 755167117L;
        cfr_renamed_4 = lArray;
    }

    public static long[] cfr_renamed_12095(long arg0) {
        long l;
        long[] lArray = new long[256];
        long l2 = l = 0L;
        while ((l2 & 0xFFFFFFFFL) < 256L) {
            long l3;
            long l4 = l;
            long l5 = l3 = 8L;
            while ((l5 & 0xFFFFFFFFL) >= 1L) {
                long l6;
                if ((l4 & 0xFFFFFFFFL & 1L) != 0L) {
                    l4 = (l4 & 0xFFFFFFFFL) >> 1 ^ arg0 & 0xFFFFFFFFL;
                    l6 = l3;
                } else {
                    l4 = (l4 & 0xFFFFFFFFL) >> 1;
                    l6 = l3;
                }
                l5 = l6 - 1L;
            }
            lArray[(int)l] = l4;
            l2 = l + 1L;
        }
        return lArray;
    }
}

