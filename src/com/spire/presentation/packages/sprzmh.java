/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcca;
import com.spire.presentation.packages.sprevh;
import com.spire.presentation.packages.sprggh;
import com.spire.presentation.packages.sprhch;
import com.spire.presentation.packages.sprlnh;
import com.spire.presentation.packages.sprnhh;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprpuh;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprveh;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprwfh;
import com.spire.presentation.packages.sprxgh;
import com.spire.presentation.packages.spryxaa;
import java.security.SecureRandom;

public abstract class sprzmh {
    public static final int cfr_renamed_185 = 57;
    public static final int spr\ufe34 = 114;
    private static final int cfr_renamed_82 = 57;
    private static final int cfr_renamed_126 = 57;
    private static final int[] cfr_renamed_88;
    private static final int[] cfr_renamed_31;
    private static final int cfr_renamed_272 = 5;
    private static final int cfr_renamed_145 = 5;
    private static final byte[] cfr_renamed_114;
    private static final int cfr_renamed_96 = 18;
    private static final int cfr_renamed_105 = 5;
    private static int[] cfr_renamed_137;
    private static final int[] cfr_renamed_79;
    private static final int cfr_renamed_107 = 7;
    private static sprwfh[] cfr_renamed_132;
    private static final int cfr_renamed_102 = 14;
    private static final int[] cfr_renamed_93;
    public static final int cfr_renamed_86 = 64;
    private static sprwfh[] cfr_renamed_152;
    private static final int cfr_renamed_112 = 15;
    private static final int cfr_renamed_119 = 450;
    private static final int cfr_renamed_91 = 16;
    public static final int cfr_renamed_0 = 57;
    private static final int[] cfr_renamed_1;
    private static final int cfr_renamed_2 = 14;
    private static final Object cfr_renamed_3;
    private static final int cfr_renamed_4 = -39081;

    private static /* synthetic */ void cfr_renamed_8733(int arg0, int arg1, sprwfh arg2) {
        int n;
        int n2 = arg0 * 16 * 2 * 16;
        int n3 = n = 0;
        while (n3 < 16) {
            int n4 = (n ^ arg1) - 1 >> 31;
            int n5 = n2;
            sprggh.cfr_renamed_8734(n4, cfr_renamed_137, n5, arg2.cfr_renamed_4, 0);
            int n6 = n2 += 16;
            n2 += 16;
            sprggh.cfr_renamed_8734(n4, cfr_renamed_137, n6, arg2.cfr_renamed_3, 0);
            n3 = ++n;
        }
    }

    public static void cfr_renamed_8735(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        sprud sprud2 = sprzmh.cfr_renamed_8736();
        byte[] byArray = new byte[114];
        sprud sprud3 = sprud2;
        sprud3.cfr_renamed_1197(arg0, arg1, 57);
        sprud3.cfr_renamed_1199(byArray, 0, byArray.length);
        byte[] byArray2 = new byte[57];
        sprzmh.cfr_renamed_8737(byArray, 0, byArray2);
        sprzmh.cfr_renamed_8738(byArray2, arg2, arg3);
    }

    public static boolean cfr_renamed_8739(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5, int arg6) {
        byte by = 1;
        return sprzmh.cfr_renamed_8740(arg0, arg1, arg2, arg3, arg4, by, arg5, arg6, 64);
    }

    private static /* synthetic */ byte[] cfr_renamed_8741(byte[] arg0, byte[] arg1, byte[] arg2) {
        int[] nArray = new int[28];
        sprhch.cfr_renamed_8720(arg0, nArray);
        int[] nArray2 = new int[14];
        sprhch.cfr_renamed_8720(arg1, nArray2);
        int[] nArray3 = new int[14];
        sprhch.cfr_renamed_8720(arg2, nArray3);
        sprvih.cfr_renamed_1749(14, nArray2, nArray3, nArray);
        byte[] byArray = new byte[114];
        sprpuh.cfr_renamed_8719(nArray, 0, nArray.length, byArray, 0);
        return sprhch.cfr_renamed_8721(byArray);
    }

    private static /* synthetic */ int cfr_renamed_8742(sprwfh arg0) {
        int[] nArray = sprggh.cfr_renamed_1631();
        int[] nArray2 = sprggh.cfr_renamed_1631();
        int[] nArray3 = sprggh.cfr_renamed_1631();
        sprwfh sprwfh2 = arg0;
        sprggh.cfr_renamed_8743(sprwfh2.cfr_renamed_4, nArray2);
        sprggh.cfr_renamed_8743(sprwfh2.cfr_renamed_3, nArray3);
        int[] nArray4 = nArray2;
        sprggh.cfr_renamed_1636(nArray4, nArray3, nArray);
        sprggh.cfr_renamed_1654(nArray4, nArray3, nArray2);
        sprggh.cfr_renamed_8744(nArray, 39081, nArray);
        sprggh.cfr_renamed_8745(nArray);
        sprggh.cfr_renamed_1654(nArray, nArray2, nArray);
        sprggh.cfr_renamed_8746(nArray);
        return sprggh.cfr_renamed_1660(nArray);
    }

    static {
        byte[] byArray = new byte[8];
        byArray[0] = 83;
        byArray[1] = 105;
        byArray[2] = 103;
        byArray[3] = 69;
        byArray[4] = 100;
        byArray[5] = 52;
        byArray[6] = 52;
        byArray[7] = 56;
        cfr_renamed_114 = byArray;
        int[] nArray = new int[14];
        nArray[0] = -1;
        nArray[1] = -1;
        nArray[2] = -1;
        nArray[3] = -1;
        nArray[4] = -1;
        nArray[5] = -1;
        nArray[6] = -1;
        nArray[7] = -2;
        nArray[8] = -1;
        nArray[9] = -1;
        nArray[10] = -1;
        nArray[11] = -1;
        nArray[12] = -1;
        nArray[13] = -1;
        cfr_renamed_79 = nArray;
        int[] nArray2 = new int[16];
        nArray2[0] = 118276190;
        nArray2[1] = 40534716;
        nArray2[2] = 9670182;
        nArray2[3] = 135141552;
        nArray2[4] = 85017403;
        nArray2[5] = 259173222;
        nArray2[6] = 68333082;
        nArray2[7] = 171784774;
        nArray2[8] = 174973732;
        nArray2[9] = 15824510;
        nArray2[10] = 73756743;
        nArray2[11] = 57518561;
        nArray2[12] = 94773951;
        nArray2[13] = 248652241;
        nArray2[14] = 107736333;
        nArray2[15] = 82941708;
        cfr_renamed_93 = nArray2;
        int[] nArray3 = new int[16];
        nArray3[0] = 36764180;
        nArray3[1] = 8885695;
        nArray3[2] = 130592152;
        nArray3[3] = 20104429;
        nArray3[4] = 163904957;
        nArray3[5] = 30304195;
        nArray3[6] = 121295871;
        nArray3[7] = 5901357;
        nArray3[8] = 125344798;
        nArray3[9] = 171541512;
        nArray3[10] = 175338348;
        nArray3[11] = 209069246;
        nArray3[12] = 3626697;
        nArray3[13] = 38307682;
        nArray3[14] = 24032956;
        nArray3[15] = 110359655;
        cfr_renamed_1 = nArray3;
        int[] nArray4 = new int[16];
        nArray4[0] = 110141154;
        nArray4[1] = 30892124;
        nArray4[2] = 160820362;
        nArray4[3] = 264558960;
        nArray4[4] = 217232225;
        nArray4[5] = 47722141;
        nArray4[6] = 19029845;
        nArray4[7] = 8326902;
        nArray4[8] = 183409749;
        nArray4[9] = 170134547;
        nArray4[10] = 90340180;
        nArray4[11] = 222600478;
        nArray4[12] = 61097333;
        nArray4[13] = 7431335;
        nArray4[14] = 198491505;
        nArray4[15] = 102372861;
        cfr_renamed_31 = nArray4;
        int[] nArray5 = new int[16];
        nArray5[0] = 221945828;
        nArray5[1] = 50763449;
        nArray5[2] = 132637478;
        nArray5[3] = 109250759;
        nArray5[4] = 216053960;
        nArray5[5] = 61612587;
        nArray5[6] = 50649998;
        nArray5[7] = 138339097;
        nArray5[8] = 98949899;
        nArray5[9] = 248139835;
        nArray5[10] = 186410297;
        nArray5[11] = 126520782;
        nArray5[12] = 47339196;
        nArray5[13] = 78164062;
        nArray5[14] = 198835543;
        nArray5[15] = 169622712;
        cfr_renamed_88 = nArray5;
        cfr_renamed_3 = new Object();
        cfr_renamed_132 = null;
        cfr_renamed_152 = null;
        cfr_renamed_137 = null;
    }

    private static /* synthetic */ void cfr_renamed_8747(sprxgh arg0, sprxgh arg1, sprnhh arg2) {
        sprnhh sprnhh2 = arg2;
        int[] nArray = sprnhh2.cfr_renamed_112;
        int[] nArray2 = sprnhh2.cfr_renamed_91;
        int[] nArray3 = sprnhh2.cfr_renamed_2;
        int[] nArray4 = sprnhh2.cfr_renamed_1;
        int[] nArray5 = sprnhh2.cfr_renamed_0;
        int[] nArray6 = sprnhh2.cfr_renamed_4;
        int[] nArray7 = sprnhh2.cfr_renamed_119;
        int[] nArray8 = sprnhh2.cfr_renamed_3;
        sprxgh sprxgh2 = arg0;
        sprggh.cfr_renamed_1636(sprxgh2.cfr_renamed_2, arg1.cfr_renamed_2, nArray);
        sprggh.cfr_renamed_8743(nArray, nArray2);
        sprggh.cfr_renamed_1636(sprxgh2.cfr_renamed_3, arg1.cfr_renamed_3, nArray3);
        sprggh.cfr_renamed_1636(sprxgh2.cfr_renamed_4, arg1.cfr_renamed_4, nArray4);
        sprggh.cfr_renamed_1636(nArray3, nArray4, nArray5);
        sprggh.cfr_renamed_8744(nArray5, 39081, nArray5);
        sprggh.cfr_renamed_1654(nArray2, nArray5, nArray6);
        sprggh.cfr_renamed_1641(nArray2, nArray5, nArray7);
        sprggh.cfr_renamed_1654(arg0.cfr_renamed_4, arg0.cfr_renamed_3, nArray8);
        sprggh.cfr_renamed_1654(arg1.cfr_renamed_4, arg1.cfr_renamed_3, nArray5);
        int[] nArray9 = nArray8;
        int[] nArray10 = nArray8;
        sprggh.cfr_renamed_1636(nArray10, nArray5, nArray10);
        sprggh.cfr_renamed_1654(nArray4, nArray3, nArray2);
        sprggh.cfr_renamed_1641(nArray4, nArray3, nArray5);
        sprggh.cfr_renamed_8748(nArray2);
        sprggh.cfr_renamed_1641(nArray9, nArray2, nArray8);
        sprggh.cfr_renamed_1636(nArray9, nArray, nArray8);
        sprggh.cfr_renamed_1636(nArray5, nArray, nArray5);
        sprxgh sprxgh3 = arg1;
        sprggh.cfr_renamed_1636(nArray6, nArray8, sprxgh3.cfr_renamed_3);
        sprggh.cfr_renamed_1636(nArray5, nArray7, sprxgh3.cfr_renamed_4);
        sprggh.cfr_renamed_1636(nArray6, nArray7, arg1.cfr_renamed_2);
    }

    private static /* synthetic */ void cfr_renamed_8749(byte[] arg0, sprxgh arg1, sprxgh arg2) {
        int[] nArray = new int[15];
        sprhch.cfr_renamed_8720(arg0, nArray);
        sprhch.cfr_renamed_8723(449, nArray, nArray);
        sprxgh sprxgh2 = new sprxgh(null);
        sprnhh sprnhh2 = new sprnhh(null);
        sprxgh sprxgh3 = arg1;
        int[] nArray2 = sprzmh.cfr_renamed_8750(sprxgh3, 8, sprnhh2);
        sprxgh sprxgh4 = arg2;
        sprzmh.cfr_renamed_8751(nArray2, sprxgh4);
        sprzmh.cfr_renamed_8747(sprxgh3, sprxgh4, sprnhh2);
        int n = 111;
        block0: while (true) {
            int n2;
            sprzmh.cfr_renamed_8752(nArray, n, nArray2, sprxgh2);
            sprzmh.cfr_renamed_8747(sprxgh2, arg2, sprnhh2);
            if (--n < 0) {
                return;
            }
            int n3 = n2 = 0;
            while (true) {
                if (n3 >= 4) continue block0;
                sprzmh.cfr_renamed_8753(arg2, sprnhh2);
                n3 = ++n2;
            }
            break;
        }
    }

    public static boolean cfr_renamed_8754(byte[] arg0, int arg1) {
        byte[] byArray = sprzmh.cfr_renamed_8755(arg0, arg1, 57);
        if (!sprzmh.cfr_renamed_8739(byArray)) {
            return false;
        }
        sprwfh sprwfh2 = new sprwfh(null);
        return sprzmh.cfr_renamed_8756(byArray, false, sprwfh2);
    }

    private static /* synthetic */ void cfr_renamed_8757(sprwfh arg0, sprxgh arg1) {
        sprwfh sprwfh2 = arg0;
        sprggh.cfr_renamed_8546(sprwfh2.cfr_renamed_4, 0, arg1.cfr_renamed_3, 0);
        sprxgh sprxgh2 = arg1;
        sprggh.cfr_renamed_8546(sprwfh2.cfr_renamed_3, 0, sprxgh2.cfr_renamed_4, 0);
        sprggh.cfr_renamed_8758(sprxgh2.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean cfr_renamed_8756(byte[] byArray, boolean bl, sprwfh sprwfh2) {
        void arg1;
        void arg2;
        byte[] arg0;
        int n = (arg0[56] & 0x80) >>> 7;
        sprggh.cfr_renamed_8720(arg0, sprwfh2.cfr_renamed_3);
        int[] nArray = sprggh.cfr_renamed_1631();
        int[] nArray2 = sprggh.cfr_renamed_1631();
        sprggh.cfr_renamed_8743(arg2.cfr_renamed_3, nArray);
        int[] nArray3 = nArray;
        int[] nArray4 = nArray;
        sprggh.cfr_renamed_8744(nArray3, 39081, nArray2);
        sprggh.cfr_renamed_2027(nArray3, nArray4);
        sprggh.cfr_renamed_8759(nArray4);
        sprggh.cfr_renamed_8759(nArray2);
        if (!sprggh.cfr_renamed_8760(nArray, nArray2, arg2.cfr_renamed_4)) {
            return false;
        }
        sprggh.cfr_renamed_8746(arg2.cfr_renamed_4);
        if (n == 1 && sprggh.cfr_renamed_8761(arg2.cfr_renamed_4)) {
            return false;
        }
        if ((arg1 ^ (n != (arg2.cfr_renamed_4[0] & 1) ? 1 : 0)) != 0) {
            void v2 = arg2;
            sprggh.cfr_renamed_2027(arg2.cfr_renamed_4, v2.cfr_renamed_4);
            sprggh.cfr_renamed_8746(v2.cfr_renamed_4);
        }
        return true;
    }

    private static /* synthetic */ byte[] cfr_renamed_8755(byte[] arg0, int arg1, int arg2) {
        byte[] byArray = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        return byArray;
    }

    private static /* synthetic */ boolean cfr_renamed_8762(sprwfh arg0) {
        sprxgh sprxgh2;
        sprxgh sprxgh3 = sprxgh2 = new sprxgh(null);
        sprzmh.cfr_renamed_8763(arg0, sprxgh3);
        return sprzmh.cfr_renamed_8764(sprxgh3);
    }

    private static /* synthetic */ void cfr_renamed_8765(boolean arg0, sprxgh arg1, sprxgh arg2, sprnhh arg3) {
        sprxgh sprxgh2;
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        sprnhh sprnhh2 = arg3;
        int[] nArray5 = sprnhh2.cfr_renamed_112;
        int[] nArray6 = sprnhh2.cfr_renamed_91;
        int[] nArray7 = sprnhh2.cfr_renamed_2;
        int[] nArray8 = sprnhh2.cfr_renamed_1;
        int[] nArray9 = sprnhh2.cfr_renamed_0;
        int[] nArray10 = sprnhh2.cfr_renamed_4;
        int[] nArray11 = sprnhh2.cfr_renamed_119;
        int[] nArray12 = sprnhh2.cfr_renamed_3;
        if (arg0) {
            nArray4 = nArray9;
            nArray3 = nArray6;
            nArray2 = nArray11;
            nArray = nArray10;
            sprxgh sprxgh3 = arg1;
            sprxgh2 = sprxgh3;
            sprggh.cfr_renamed_1641(arg1.cfr_renamed_4, sprxgh3.cfr_renamed_3, nArray12);
        } else {
            nArray4 = nArray6;
            nArray3 = nArray9;
            nArray2 = nArray10;
            nArray = nArray11;
            sprxgh sprxgh4 = arg1;
            sprxgh2 = sprxgh4;
            sprggh.cfr_renamed_1654(arg1.cfr_renamed_4, sprxgh4.cfr_renamed_3, nArray12);
        }
        sprggh.cfr_renamed_1636(sprxgh2.cfr_renamed_2, arg2.cfr_renamed_2, nArray5);
        sprxgh sprxgh5 = arg1;
        sprggh.cfr_renamed_8743(nArray5, nArray6);
        sprggh.cfr_renamed_1636(sprxgh5.cfr_renamed_3, arg2.cfr_renamed_3, nArray7);
        sprggh.cfr_renamed_1636(sprxgh5.cfr_renamed_4, arg2.cfr_renamed_4, nArray8);
        sprggh.cfr_renamed_1636(nArray7, nArray8, nArray9);
        int[] nArray13 = nArray9;
        sprggh.cfr_renamed_8744(nArray13, 39081, nArray13);
        sprggh.cfr_renamed_1654(nArray6, nArray9, nArray2);
        sprggh.cfr_renamed_1641(nArray6, nArray9, nArray);
        sprggh.cfr_renamed_1654(arg2.cfr_renamed_4, arg2.cfr_renamed_3, nArray9);
        int[] nArray14 = nArray12;
        sprggh.cfr_renamed_1636(nArray12, nArray9, nArray12);
        sprggh.cfr_renamed_1654(nArray8, nArray7, nArray4);
        sprggh.cfr_renamed_1641(nArray8, nArray7, nArray3);
        sprggh.cfr_renamed_8748(nArray4);
        sprggh.cfr_renamed_1641(nArray14, nArray6, nArray12);
        sprggh.cfr_renamed_1636(nArray14, nArray5, nArray12);
        sprggh.cfr_renamed_1636(nArray9, nArray5, nArray9);
        sprxgh sprxgh6 = arg2;
        sprggh.cfr_renamed_1636(nArray10, nArray12, sprxgh6.cfr_renamed_3);
        sprggh.cfr_renamed_1636(nArray9, nArray11, sprxgh6.cfr_renamed_4);
        sprggh.cfr_renamed_1636(nArray10, nArray11, arg2.cfr_renamed_2);
    }

    private static /* synthetic */ void cfr_renamed_8752(int[] arg0, int arg1, int[] arg2, sprxgh arg3) {
        int n = sprzmh.cfr_renamed_8766(arg0, arg1);
        int n2 = n >>> 3 ^ 1;
        int n3 = (n ^ -n2) & 7;
        int n4 = 0;
        int n5 = 0;
        int n6 = n4;
        while (n6 < 8) {
            int n7 = (n4 ^ n3) - 1 >> 31;
            int n8 = n5;
            sprggh.cfr_renamed_8734(n7, arg2, n8, arg3.cfr_renamed_3, 0);
            sprggh.cfr_renamed_8734(n7, arg2, n5 += 16, arg3.cfr_renamed_4, 0);
            int n9 = n5 += 16;
            n5 += 16;
            sprggh.cfr_renamed_8734(n7, arg2, n9, arg3.cfr_renamed_2, 0);
            n6 = ++n4;
        }
        sprggh.cfr_renamed_8767(n2, arg3.cfr_renamed_3);
    }

    private static /* synthetic */ boolean cfr_renamed_8768(byte[] arg0) {
        if ((arg0[56] & 0x7F) != 0) {
            return false;
        }
        if (sprpuh.cfr_renamed_8727(arg0, 52) != cfr_renamed_79[13]) {
            return true;
        }
        int[] nArray = new int[14];
        sprpuh.cfr_renamed_8722(arg0, 0, nArray, 0, 14);
        return !sprvih.cfr_renamed_1683(14, nArray, cfr_renamed_79);
    }

    public static sprud cfr_renamed_8769() {
        return sprzmh.cfr_renamed_8736();
    }

    public static boolean cfr_renamed_8770(byte[] arg0, int arg1) {
        byte[] byArray = sprzmh.cfr_renamed_8755(arg0, arg1, 57);
        if (!sprzmh.cfr_renamed_8739(byArray)) {
            return false;
        }
        sprwfh sprwfh2 = new sprwfh(null);
        if (!sprzmh.cfr_renamed_8756(byArray, false, sprwfh2)) {
            return false;
        }
        return sprzmh.cfr_renamed_8762(sprwfh2);
    }

    public static boolean cfr_renamed_8771(byte[] arg0, int arg1, sprveh arg2, byte[] arg3, byte[] arg4, int arg5, int arg6) {
        byte by = 0;
        return sprzmh.cfr_renamed_8772(arg0, arg1, arg2, arg3, by, arg4, arg5, arg6);
    }

    private static /* synthetic */ void cfr_renamed_8773(sprxgh arg0, sprxgh arg1) {
        sprxgh sprxgh2 = arg0;
        sprggh.cfr_renamed_8546(sprxgh2.cfr_renamed_3, 0, arg1.cfr_renamed_3, 0);
        sprggh.cfr_renamed_8546(sprxgh2.cfr_renamed_4, 0, arg1.cfr_renamed_4, 0);
        sprggh.cfr_renamed_8546(sprxgh2.cfr_renamed_2, 0, arg1.cfr_renamed_2, 0);
    }

    private static /* synthetic */ void cfr_renamed_8774(int[] arg0, int[] arg1, sprwfh arg2, int[] arg3, sprwfh arg4, sprxgh arg5) {
        sprzmh.cfr_renamed_8775();
        byte[] byArray = new byte[450];
        byte[] byArray2 = new byte[225];
        byte[] byArray3 = new byte[225];
        sprlnh.cfr_renamed_8711(arg0, 7, byArray);
        sprlnh.cfr_renamed_8711(arg1, 5, byArray2);
        sprlnh.cfr_renamed_8711(arg3, 5, byArray3);
        int n = 8;
        sprxgh[] sprxghArray = new sprxgh[8];
        sprxgh[] sprxghArray2 = new sprxgh[n];
        sprnhh sprnhh2 = new sprnhh(null);
        sprzmh.cfr_renamed_8776(arg2, sprxghArray, 0, n, sprnhh2);
        sprzmh.cfr_renamed_8776(arg4, sprxghArray2, 0, n, sprnhh2);
        sprzmh.cfr_renamed_8777(arg5);
        int n2 = 225;
        while (--n2 >= 0) {
            int n3;
            int n4;
            int n5;
            byte by = byArray[n2];
            if (by != 0) {
                n5 = by >> 1 ^ by >> 31;
                sprzmh.cfr_renamed_8778(by < 0, cfr_renamed_132[n5], arg5, sprnhh2);
            }
            if ((n5 = byArray[225 + n2]) != 0) {
                n4 = n5 >> 1 ^ n5 >> 31;
                sprzmh.cfr_renamed_8778(n5 < 0, cfr_renamed_152[n4], arg5, sprnhh2);
            }
            if ((n4 = byArray2[n2]) != 0) {
                sprxgh[] sprxghArray3;
                boolean bl;
                n3 = n4 >> 1 ^ n4 >> 31;
                if (n4 < 0) {
                    bl = true;
                    sprxghArray3 = sprxghArray;
                } else {
                    bl = false;
                    sprxghArray3 = sprxghArray;
                }
                sprzmh.cfr_renamed_8765(bl, sprxghArray3[n3], arg5, sprnhh2);
            }
            if ((n3 = byArray3[n2]) != 0) {
                sprxgh[] sprxghArray4;
                boolean bl;
                int n6 = n3 >> 1 ^ n3 >> 31;
                if (n3 < 0) {
                    bl = true;
                    sprxghArray4 = sprxghArray2;
                } else {
                    bl = false;
                    sprxghArray4 = sprxghArray2;
                }
                sprzmh.cfr_renamed_8765(bl, sprxghArray4[n6], arg5, sprnhh2);
            }
            sprzmh.cfr_renamed_8753(arg5, sprnhh2);
        }
        sprzmh.cfr_renamed_8753(arg5, sprnhh2);
    }

    private static /* synthetic */ void cfr_renamed_8779(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte arg5, byte[] arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        if (!sprzmh.cfr_renamed_8780(arg4)) {
            throw new IllegalArgumentException(spryxaa.cfr_renamed_9("^1E"));
        }
        sprud sprud2 = sprzmh.cfr_renamed_8736();
        byte[] byArray = new byte[114];
        sprud sprud3 = sprud2;
        sprud3.cfr_renamed_1197(arg0, arg1, 57);
        sprud3.cfr_renamed_1199(byArray, 0, byArray.length);
        byte[] byArray2 = new byte[57];
        sprzmh.cfr_renamed_8737(byArray, 0, byArray2);
        sprzmh.cfr_renamed_8781(sprud2, byArray, byArray2, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_8781(sprud sprud2, byte[] byArray, byte[] byArray2, byte[] byArray3, int n, byte[] byArray4, byte by, byte[] byArray5, int n2, int n3, byte[] byArray6, int n4) {
        void arg11;
        void arg10;
        void arg2;
        void arg4;
        void arg3;
        void arg9;
        void arg8;
        void arg7;
        void arg1;
        void arg5;
        void arg6;
        sprud arg0;
        sprud sprud3 = arg0;
        sprud sprud4 = arg0;
        sprzmh.cfr_renamed_8782(sprud4, (byte)arg6, (byte[])arg5);
        sprud4.cfr_renamed_1197((byte[])arg1, 57, 57);
        sprud3.cfr_renamed_1197((byte[])arg7, (int)arg8, (int)arg9);
        sprud3.cfr_renamed_1199(byArray, 0, ((void)arg1).length);
        byte[] byArray7 = sprhch.cfr_renamed_8721((byte[])arg1);
        byte[] byArray8 = new byte[57];
        sprzmh.cfr_renamed_8738(byArray7, byArray8, 0);
        sprud sprud5 = arg0;
        sprud sprud6 = arg0;
        sprzmh.cfr_renamed_8782(sprud6, (byte)arg6, (byte[])arg5);
        sprud6.cfr_renamed_1197(byArray8, 0, 57);
        sprud5.cfr_renamed_1197((byte[])arg3, (int)arg4, 57);
        sprud5.cfr_renamed_1197((byte[])arg7, (int)arg8, (int)arg9);
        void v4 = arg1;
        arg0.cfr_renamed_1199((byte[])v4, 0, ((void)v4).length);
        byte[] byArray9 = sprhch.cfr_renamed_8721((byte[])arg1);
        byte[] byArray10 = sprzmh.cfr_renamed_8741(byArray7, byArray9, (byte[])arg2);
        System.arraycopy(byArray8, 0, arg10, (int)arg11, 57);
        System.arraycopy(byArray10, 0, arg10, (int)(arg11 + 57), 57);
    }

    private static /* synthetic */ int cfr_renamed_8783(sprxgh arg0, byte[] arg1, int arg2) {
        sprwfh sprwfh2;
        sprwfh sprwfh3 = sprwfh2 = new sprwfh(null);
        sprzmh.cfr_renamed_8784(arg0, sprwfh3);
        int n = sprzmh.cfr_renamed_8742(sprwfh2);
        sprzmh.cfr_renamed_8785(sprwfh3, arg1, arg2);
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void cfr_renamed_8775() {
        Object object = cfr_renamed_3;
        synchronized (object) {
            int n;
            sprxgh sprxgh2;
            int n2;
            block16: {
                if (cfr_renamed_137 == null) break block16;
                return;
            }
            int n3 = 32;
            int n4 = 80;
            int n5 = n3 * 2 + n4;
            sprxgh[] sprxghArray = new sprxgh[n5];
            sprnhh sprnhh2 = new sprnhh(null);
            sprwfh sprwfh2 = new sprwfh(null);
            sprggh.cfr_renamed_8546(cfr_renamed_93, 0, sprwfh2.cfr_renamed_4, 0);
            sprggh.cfr_renamed_8546(cfr_renamed_1, 0, sprwfh2.cfr_renamed_3, 0);
            sprwfh sprwfh3 = sprwfh2;
            sprzmh.cfr_renamed_8776(sprwfh3, sprxghArray, 0, n3, sprnhh2);
            sprwfh sprwfh4 = new sprwfh(null);
            sprggh.cfr_renamed_8546(cfr_renamed_31, 0, sprwfh4.cfr_renamed_4, 0);
            sprggh.cfr_renamed_8546(cfr_renamed_88, 0, sprwfh4.cfr_renamed_3, 0);
            int n6 = n3;
            sprzmh.cfr_renamed_8776(sprwfh4, sprxghArray, n6, n6, sprnhh2);
            sprxgh sprxgh3 = new sprxgh(null);
            sprzmh.cfr_renamed_8757(sprwfh3, sprxgh3);
            int n7 = n3 * 2;
            sprxgh[] sprxghArray2 = new sprxgh[5];
            int n8 = n2 = 0;
            while (n8 < 5) {
                sprxghArray2[n2++] = new sprxgh(null);
                n8 = n2;
            }
            int n9 = n2 = 0;
            while (n9 < 5) {
                int n10;
                int n11;
                int n12 = n7++;
                sprxgh sprxgh4 = new sprxgh(null);
                sprxghArray[n12] = sprxgh4;
                sprxgh2 = sprxgh4;
                int n13 = n11 = 0;
                while (n13 < 5) {
                    sprxgh sprxgh5;
                    sprxgh sprxgh6 = sprxgh3;
                    if (n11 == 0) {
                        sprzmh.cfr_renamed_8773(sprxgh6, sprxgh2);
                        sprxgh5 = sprxgh3;
                    } else {
                        sprzmh.cfr_renamed_8747(sprxgh6, sprxgh2, sprnhh2);
                        sprxgh5 = sprxgh3;
                    }
                    sprzmh.cfr_renamed_8753(sprxgh5, sprnhh2);
                    sprzmh.cfr_renamed_8773(sprxgh3, sprxghArray2[n11]);
                    if (n2 + n11 != 8) {
                        int n14 = n10 = 1;
                        while (n14 < 18) {
                            sprzmh.cfr_renamed_8753(sprxgh3, sprnhh2);
                            n14 = ++n10;
                        }
                    }
                    n13 = ++n11;
                }
                sprxgh sprxgh7 = sprxgh2;
                sprggh.cfr_renamed_2027(sprxgh7.cfr_renamed_3, sprxgh7.cfr_renamed_3);
                int n15 = n11 = 0;
                while (n15 < 4) {
                    int n16;
                    n10 = 1 << n11;
                    int n17 = n16 = 0;
                    while (n17 < n10) {
                        sprxghArray[n7] = new sprxgh(null);
                        sprzmh.cfr_renamed_8773(sprxghArray[n7 - n10], sprxghArray[n7]);
                        sprzmh.cfr_renamed_8747(sprxghArray2[n11], sprxghArray[n7], sprnhh2);
                        ++n7;
                        n17 = ++n16;
                    }
                    n15 = ++n11;
                }
                n9 = ++n2;
            }
            sprzmh.cfr_renamed_8786(sprxghArray);
            cfr_renamed_132 = new sprwfh[n3];
            int n18 = n2 = 0;
            while (n18 < n3) {
                sprxgh2 = sprxghArray[n2];
                sprwfh sprwfh5 = sprzmh.cfr_renamed_132[n2] = new sprwfh(null);
                sprxgh sprxgh8 = sprxgh2;
                sprwfh sprwfh6 = sprwfh5;
                sprggh.cfr_renamed_1636(sprxgh8.cfr_renamed_3, sprxgh8.cfr_renamed_2, sprwfh6.cfr_renamed_4);
                sprggh.cfr_renamed_8746(sprwfh6.cfr_renamed_4);
                sprwfh sprwfh7 = sprwfh5;
                sprggh.cfr_renamed_1636(sprxgh8.cfr_renamed_4, sprxgh2.cfr_renamed_2, sprwfh7.cfr_renamed_3);
                sprggh.cfr_renamed_8746(sprwfh7.cfr_renamed_3);
                n18 = ++n2;
            }
            cfr_renamed_152 = new sprwfh[n3];
            int n19 = n2 = 0;
            while (n19 < n3) {
                sprxgh2 = sprxghArray[n3 + n2];
                sprwfh sprwfh8 = sprzmh.cfr_renamed_152[n2] = new sprwfh(null);
                sprxgh sprxgh9 = sprxgh2;
                sprwfh sprwfh9 = sprwfh8;
                sprggh.cfr_renamed_1636(sprxgh9.cfr_renamed_3, sprxgh9.cfr_renamed_2, sprwfh9.cfr_renamed_4);
                sprggh.cfr_renamed_8746(sprwfh9.cfr_renamed_4);
                sprwfh sprwfh10 = sprwfh8;
                sprggh.cfr_renamed_1636(sprxgh9.cfr_renamed_4, sprxgh2.cfr_renamed_2, sprwfh10.cfr_renamed_3);
                sprggh.cfr_renamed_8746(sprwfh10.cfr_renamed_3);
                n19 = ++n2;
            }
            cfr_renamed_137 = sprggh.cfr_renamed_8787(n4 * 2);
            n2 = 0;
            int n20 = n = n3 * 2;
            while (n20 < n5) {
                sprxgh sprxgh10;
                sprxgh sprxgh11 = sprxgh10 = sprxghArray[n];
                sprggh.cfr_renamed_1636(sprxgh10.cfr_renamed_3, sprxgh11.cfr_renamed_2, sprxgh10.cfr_renamed_3);
                sprggh.cfr_renamed_8746(sprxgh10.cfr_renamed_3);
                sprxgh sprxgh12 = sprxgh10;
                sprggh.cfr_renamed_1636(sprxgh11.cfr_renamed_4, sprxgh12.cfr_renamed_2, sprxgh12.cfr_renamed_4);
                sprggh.cfr_renamed_8746(sprxgh10.cfr_renamed_4);
                sprggh.cfr_renamed_8546(sprxgh10.cfr_renamed_3, 0, cfr_renamed_137, n2);
                sprggh.cfr_renamed_8546(sprxgh10.cfr_renamed_4, 0, cfr_renamed_137, n2 += 16);
                n20 = ++n;
                n2 += 16;
            }
            return;
        }
    }

    private static /* synthetic */ void cfr_renamed_8753(sprxgh arg0, sprnhh arg1) {
        sprnhh sprnhh2 = arg1;
        int[] nArray = sprnhh2.cfr_renamed_91;
        int[] nArray2 = sprnhh2.cfr_renamed_2;
        int[] nArray3 = sprnhh2.cfr_renamed_1;
        int[] nArray4 = sprnhh2.cfr_renamed_0;
        int[] nArray5 = sprnhh2.cfr_renamed_3;
        int[] nArray6 = sprnhh2.cfr_renamed_112;
        sprxgh sprxgh2 = arg0;
        sprxgh sprxgh3 = arg0;
        sprggh.cfr_renamed_1654(sprxgh3.cfr_renamed_3, arg0.cfr_renamed_4, nArray);
        sprggh.cfr_renamed_8743(nArray, nArray);
        sprggh.cfr_renamed_8743(sprxgh3.cfr_renamed_3, nArray2);
        sprggh.cfr_renamed_8743(sprxgh2.cfr_renamed_4, nArray3);
        sprggh.cfr_renamed_1654(nArray2, nArray3, nArray4);
        sprggh.cfr_renamed_8748(nArray4);
        sprggh.cfr_renamed_8743(sprxgh2.cfr_renamed_2, nArray5);
        sprggh.cfr_renamed_1654(nArray5, nArray5, nArray5);
        sprggh.cfr_renamed_8748(nArray5);
        sprggh.cfr_renamed_1641(nArray4, nArray5, nArray6);
        sprxgh sprxgh4 = arg0;
        sprggh.cfr_renamed_1641(nArray, nArray4, nArray);
        sprggh.cfr_renamed_1641(nArray2, nArray3, nArray2);
        sprggh.cfr_renamed_1636(nArray, nArray6, sprxgh4.cfr_renamed_3);
        sprggh.cfr_renamed_1636(nArray4, nArray2, sprxgh4.cfr_renamed_4);
        sprggh.cfr_renamed_1636(nArray4, sprnhh2.cfr_renamed_112, arg0.cfr_renamed_2);
    }

    private static /* synthetic */ void cfr_renamed_8751(int[] arg0, sprxgh arg1) {
        int n = 336;
        int[] nArray = arg0;
        int n2 = n;
        sprggh.cfr_renamed_8546(nArray, n2, arg1.cfr_renamed_3, 0);
        sprggh.cfr_renamed_8546(arg0, n += 16, arg1.cfr_renamed_4, 0);
        sprggh.cfr_renamed_8546(nArray, n += 16, arg1.cfr_renamed_2, 0);
    }

    private static /* synthetic */ int[] cfr_renamed_8750(sprxgh arg0, int arg1, sprnhh arg2) {
        sprxgh sprxgh2 = new sprxgh(null);
        sprzmh.cfr_renamed_8773(arg0, sprxgh2);
        sprxgh sprxgh3 = new sprxgh(null);
        sprxgh sprxgh4 = sprxgh2;
        sprxgh sprxgh5 = sprxgh4;
        sprxgh sprxgh6 = sprxgh3;
        sprzmh.cfr_renamed_8773(sprxgh4, sprxgh6);
        sprzmh.cfr_renamed_8753(sprxgh6, arg2);
        int[] nArray = sprggh.cfr_renamed_8787(arg1 * 3);
        int n = 0;
        int n2 = 0;
        while (true) {
            sprggh.cfr_renamed_8546(sprxgh5.cfr_renamed_3, 0, nArray, n);
            sprxgh sprxgh7 = sprxgh2;
            sprggh.cfr_renamed_8546(sprxgh7.cfr_renamed_4, 0, nArray, n += 16);
            sprggh.cfr_renamed_8546(sprxgh7.cfr_renamed_2, 0, nArray, n += 16);
            n += 16;
            if (++n2 == arg1) {
                return nArray;
            }
            sprzmh.cfr_renamed_8747(sprxgh3, sprxgh2, arg2);
            sprxgh5 = sprxgh2;
        }
    }

    private static /* synthetic */ void cfr_renamed_8786(sprxgh[] arg0) {
        int n = arg0.length;
        int[] nArray = sprggh.cfr_renamed_8787(n);
        int[] nArray2 = sprggh.cfr_renamed_1631();
        sprggh.cfr_renamed_8546(arg0[0].cfr_renamed_2, 0, nArray2, 0);
        sprggh.cfr_renamed_8546(nArray2, 0, nArray, 0);
        int n2 = 0;
        while (++n2 < n) {
            sprggh.cfr_renamed_1636(nArray2, arg0[n2].cfr_renamed_2, nArray2);
            sprggh.cfr_renamed_8546(nArray2, 0, nArray, n2 * 16);
        }
        sprggh.cfr_renamed_8788(nArray2, nArray2);
        int[] nArray3 = sprggh.cfr_renamed_1631();
        int n3 = --n2;
        while (n3 > 0) {
            int n4 = n2--;
            int n5 = n2;
            n3 = n5;
            sprggh.cfr_renamed_8546(nArray, n5 * 16, nArray3, 0);
            sprggh.cfr_renamed_1636(nArray3, nArray2, nArray3);
            sprggh.cfr_renamed_1636(nArray2, arg0[n4].cfr_renamed_2, nArray2);
            sprggh.cfr_renamed_8546(nArray3, 0, arg0[n4].cfr_renamed_2, 0);
        }
        sprggh.cfr_renamed_8546(nArray2, 0, arg0[0].cfr_renamed_2, 0);
    }

    private static /* synthetic */ void cfr_renamed_8738(byte[] arg0, byte[] arg1, int arg2) {
        sprxgh sprxgh2 = new sprxgh(null);
        sprzmh.cfr_renamed_8789(arg0, sprxgh2);
        if (0 == sprzmh.cfr_renamed_8783(sprxgh2, arg1, arg2)) {
            throw new IllegalStateException();
        }
    }

    private static /* synthetic */ sprud cfr_renamed_8736() {
        return new sprnil(256);
    }

    private static /* synthetic */ void cfr_renamed_8790(byte[] arg0, int arg1, byte[] arg2, byte arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        if (!sprzmh.cfr_renamed_8780(arg2)) {
            throw new IllegalArgumentException(sprbcca.cfr_renamed_9("z!a"));
        }
        sprud sprud2 = sprzmh.cfr_renamed_8736();
        byte[] byArray = new byte[114];
        sprud sprud3 = sprud2;
        sprud3.cfr_renamed_1197(arg0, arg1, 57);
        sprud3.cfr_renamed_1199(byArray, 0, byArray.length);
        byte[] byArray2 = new byte[57];
        sprzmh.cfr_renamed_8737(byArray, 0, byArray2);
        byte[] byArray3 = new byte[57];
        sprzmh.cfr_renamed_8738(byArray2, byArray3, 0);
        sprzmh.cfr_renamed_8781(sprud2, byArray, byArray2, byArray3, 0, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static void cfr_renamed_8791(byte[] arg0, int arg1, byte[] arg2, sprud arg3, byte[] arg4, int arg5) {
        byte[] byArray = new byte[64];
        if (64 != arg3.cfr_renamed_1199(byArray, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        byte by = 1;
        sprzmh.cfr_renamed_8790(arg0, arg1, arg2, by, byArray, 0, byArray.length, arg4, arg5);
    }

    private static /* synthetic */ void cfr_renamed_8776(sprwfh arg0, sprxgh[] arg1, int arg2, int arg3, sprnhh arg4) {
        int n;
        sprxgh sprxgh2;
        sprxgh sprxgh3 = sprxgh2 = new sprxgh(null);
        sprzmh.cfr_renamed_8757(arg0, sprxgh3);
        sprzmh.cfr_renamed_8753(sprxgh3, arg4);
        arg1[arg2] = new sprxgh(null);
        sprzmh.cfr_renamed_8757(arg0, arg1[arg2]);
        int n2 = n = 1;
        while (n2 < arg3) {
            sprxgh[] sprxghArray = arg1;
            sprxghArray[arg2 + n] = new sprxgh(null);
            sprzmh.cfr_renamed_8773(arg1[arg2 + n - 1], arg1[arg2 + n]);
            int n3 = arg2 + n;
            sprzmh.cfr_renamed_8747(sprxgh2, sprxghArray[n3], arg4);
            n2 = ++n;
        }
    }

    private static /* synthetic */ boolean cfr_renamed_8780(byte[] arg0) {
        return arg0 != null && arg0.length < 256;
    }

    public static void cfr_renamed_8792(sprevh arg0, byte[] arg1, int arg2, int[] arg3, int[] arg4) {
        if (null == arg0) {
            throw new NullPointerException(spryxaa.cfr_renamed_9("i-T6\u001d(X1U*YeT6\u001d*S)De[*OeH6Xe_<\u001d\u001d\tq\u0005"));
        }
        byte[] byArray = new byte[57];
        sprzmh.cfr_renamed_8737(arg1, arg2, byArray);
        sprxgh sprxgh2 = new sprxgh(null);
        sprzmh.cfr_renamed_8789(byArray, sprxgh2);
        if (0 == sprzmh.cfr_renamed_8793(sprxgh2)) {
            throw new IllegalStateException();
        }
        sprxgh sprxgh3 = sprxgh2;
        sprggh.cfr_renamed_8546(sprxgh3.cfr_renamed_3, 0, arg3, 0);
        sprggh.cfr_renamed_8546(sprxgh3.cfr_renamed_4, 0, arg4, 0);
    }

    private static /* synthetic */ boolean cfr_renamed_8740(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte arg5, byte[] arg6, int arg7, int arg8) {
        if (!sprzmh.cfr_renamed_8780(arg4)) {
            throw new IllegalArgumentException(sprbcca.cfr_renamed_9("z!a"));
        }
        byte[] byArray = sprzmh.cfr_renamed_8755(arg0, arg1, 57);
        byte[] byArray2 = sprzmh.cfr_renamed_8755(arg0, arg1 + 57, 57);
        byte[] byArray3 = sprzmh.cfr_renamed_8755(arg2, arg3, 57);
        if (!sprzmh.cfr_renamed_8768(byArray)) {
            return false;
        }
        int[] nArray = new int[14];
        if (!sprhch.cfr_renamed_8724(byArray2, nArray)) {
            return false;
        }
        if (!sprzmh.cfr_renamed_8739(byArray3)) {
            return false;
        }
        sprwfh sprwfh2 = new sprwfh(null);
        if (!sprzmh.cfr_renamed_8756(byArray, true, sprwfh2)) {
            return false;
        }
        sprwfh sprwfh3 = new sprwfh(null);
        if (!sprzmh.cfr_renamed_8756(byArray3, true, sprwfh3)) {
            return false;
        }
        sprud sprud2 = sprzmh.cfr_renamed_8736();
        byte[] byArray4 = new byte[114];
        sprud sprud3 = sprud2;
        sprud sprud4 = sprud2;
        sprzmh.cfr_renamed_8782(sprud2, arg5, arg4);
        sprud4.cfr_renamed_1197(byArray, 0, 57);
        sprud4.cfr_renamed_1197(byArray3, 0, 57);
        sprud3.cfr_renamed_1197(arg6, arg7, arg8);
        sprud3.cfr_renamed_1199(byArray4, 0, byArray4.length);
        byte[] byArray5 = sprhch.cfr_renamed_8721(byArray4);
        int[] nArray2 = new int[14];
        sprhch.cfr_renamed_8720(byArray5, nArray2);
        int[] nArray3 = new int[8];
        int[] nArray4 = new int[8];
        sprhch.cfr_renamed_8726(nArray2, nArray3, nArray4);
        int[] nArray5 = nArray;
        sprhch.cfr_renamed_8718(nArray, nArray4, nArray5);
        sprxgh sprxgh2 = new sprxgh(null);
        sprzmh.cfr_renamed_8774(nArray5, nArray3, sprwfh3, nArray4, sprwfh2, sprxgh2);
        return sprzmh.cfr_renamed_8764(sprxgh2);
    }

    public static void cfr_renamed_8794(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        byte by = 1;
        sprzmh.cfr_renamed_8779(arg0, arg1, arg2, arg3, arg4, by, arg5, arg6, 64, arg7, arg8);
    }

    private static /* synthetic */ void cfr_renamed_8789(byte[] arg0, sprxgh arg1) {
        int n;
        sprzmh.cfr_renamed_8775();
        int[] nArray = new int[15];
        sprhch.cfr_renamed_8720(arg0, nArray);
        sprhch.cfr_renamed_8723(450, nArray, nArray);
        sprwfh sprwfh2 = new sprwfh(null);
        sprnhh sprnhh2 = new sprnhh(null);
        sprzmh.cfr_renamed_8777(arg1);
        int n2 = n = 17;
        while (true) {
            int n3;
            int n4 = n2;
            int n5 = n3 = 0;
            while (n5 < 5) {
                int n6;
                int n7;
                int n8 = 0;
                int n9 = n7 = 0;
                while (n9 < 5) {
                    n6 = nArray[n4 >>> 5] >>> (n4 & 0x1F);
                    n8 &= ~(1 << n7);
                    n4 += 18;
                    n8 ^= n6 << n7;
                    n9 = ++n7;
                }
                n7 = n8 >>> 4 & 1;
                n6 = (n8 ^ -n7) & 0xF;
                sprzmh.cfr_renamed_8733(n3, n6, sprwfh2);
                sprggh.cfr_renamed_8767(n7, sprwfh2.cfr_renamed_4);
                sprzmh.cfr_renamed_8795(sprwfh2, arg1, sprnhh2);
                n5 = ++n3;
            }
            if (--n < 0) {
                return;
            }
            sprzmh.cfr_renamed_8753(arg1, sprnhh2);
            n2 = n;
        }
    }

    private static /* synthetic */ void cfr_renamed_8795(sprwfh arg0, sprxgh arg1, sprnhh arg2) {
        sprnhh sprnhh2 = arg2;
        int[] nArray = sprnhh2.cfr_renamed_91;
        int[] nArray2 = sprnhh2.cfr_renamed_2;
        int[] nArray3 = sprnhh2.cfr_renamed_1;
        int[] nArray4 = sprnhh2.cfr_renamed_0;
        int[] nArray5 = sprnhh2.cfr_renamed_4;
        int[] nArray6 = sprnhh2.cfr_renamed_119;
        int[] nArray7 = sprnhh2.cfr_renamed_3;
        sprxgh sprxgh2 = arg1;
        sprggh.cfr_renamed_8743(sprxgh2.cfr_renamed_2, nArray);
        sprwfh sprwfh2 = arg0;
        sprggh.cfr_renamed_1636(sprwfh2.cfr_renamed_4, arg1.cfr_renamed_3, nArray2);
        sprggh.cfr_renamed_1636(sprwfh2.cfr_renamed_3, arg1.cfr_renamed_4, nArray3);
        sprggh.cfr_renamed_1636(nArray2, nArray3, nArray4);
        sprggh.cfr_renamed_8744(nArray4, 39081, nArray4);
        sprggh.cfr_renamed_1654(nArray, nArray4, nArray5);
        sprggh.cfr_renamed_1641(nArray, nArray4, nArray6);
        sprggh.cfr_renamed_1654(arg0.cfr_renamed_3, arg0.cfr_renamed_4, nArray7);
        sprggh.cfr_renamed_1654(sprxgh2.cfr_renamed_4, arg1.cfr_renamed_3, nArray4);
        sprggh.cfr_renamed_1636(nArray7, nArray4, nArray7);
        sprggh.cfr_renamed_1654(nArray3, nArray2, nArray);
        sprggh.cfr_renamed_1641(nArray3, nArray2, nArray4);
        sprggh.cfr_renamed_8748(nArray);
        sprggh.cfr_renamed_1641(nArray7, nArray, nArray7);
        sprggh.cfr_renamed_1636(nArray7, sprxgh2.cfr_renamed_2, nArray7);
        sprggh.cfr_renamed_1636(nArray4, arg1.cfr_renamed_2, nArray4);
        sprxgh sprxgh3 = arg1;
        sprggh.cfr_renamed_1636(nArray5, nArray7, sprxgh3.cfr_renamed_3);
        sprggh.cfr_renamed_1636(nArray4, nArray6, sprxgh3.cfr_renamed_4);
        sprggh.cfr_renamed_1636(nArray5, nArray6, arg1.cfr_renamed_2);
    }

    public static void cfr_renamed_8796(byte[] arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, byte[] arg5, int arg6) {
        byte by = 1;
        sprzmh.cfr_renamed_8790(arg0, arg1, arg2, by, arg3, arg4, 64, arg5, arg6);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8797(sprveh sprveh2, byte[] byArray, int n) {
        void arg2;
        void arg1;
        sprveh arg0;
        sprggh.cfr_renamed_8798(arg0.cfr_renamed_4, 16, (byte[])arg1, (int)arg2);
        byArray[arg2 + 57 - true] = (byte)((arg0.cfr_renamed_4[0] & 1) << 7);
    }

    private static /* synthetic */ int cfr_renamed_8766(int[] arg0, int arg1) {
        int n = arg1 >>> 3;
        int n2 = (arg1 & 7) << 2;
        return arg0[n] >>> n2 & 0xF;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_8785(sprwfh sprwfh2, byte[] byArray, int n) {
        void arg2;
        sprwfh arg0;
        void arg1;
        void v0 = arg1;
        sprggh.cfr_renamed_8799(arg0.cfr_renamed_3, (byte[])v0, (int)arg2);
        v0[n + 57 - 1] = (byte)((arg0.cfr_renamed_4[0] & 1) << 7);
    }

    public static void cfr_renamed_8800(SecureRandom arg0, byte[] arg1) {
        if (arg1.length != 57) {
            throw new IllegalArgumentException("k");
        }
        arg0.nextBytes(arg1);
    }

    private static /* synthetic */ boolean cfr_renamed_8739(byte[] arg0) {
        int n;
        int n2;
        if ((arg0[56] & 0x7F) != 0) {
            return false;
        }
        int n3 = n2 = sprpuh.cfr_renamed_8727(arg0, 52);
        int n4 = n2 ^ cfr_renamed_79[13];
        int n5 = n = 12;
        while (n5 > 0) {
            int n6 = sprpuh.cfr_renamed_8727(arg0, n * 4);
            if (n4 == 0 && n6 + Integer.MIN_VALUE > cfr_renamed_79[n] + Integer.MIN_VALUE) {
                return false;
            }
            n3 |= n6;
            int n7 = cfr_renamed_79[n];
            n4 |= n6 ^ n7;
            n5 = --n;
        }
        n = sprpuh.cfr_renamed_8727(arg0, 0);
        if (n3 == 0 && n + Integer.MIN_VALUE <= -2147483647) {
            return false;
        }
        return n4 != 0 || n + Integer.MIN_VALUE < cfr_renamed_79[0] - 1 + Integer.MIN_VALUE;
    }

    public static sprveh cfr_renamed_8801(byte[] arg0, int arg1) {
        byte[] byArray = sprzmh.cfr_renamed_8755(arg0, arg1, 57);
        if (!sprzmh.cfr_renamed_8739(byArray)) {
            return null;
        }
        sprwfh sprwfh2 = new sprwfh(null);
        if (!sprzmh.cfr_renamed_8756(byArray, false, sprwfh2)) {
            return null;
        }
        if (!sprzmh.cfr_renamed_8762(sprwfh2)) {
            return null;
        }
        return sprzmh.cfr_renamed_8802(sprwfh2);
    }

    public static boolean cfr_renamed_8803(byte[] arg0, int arg1, sprveh arg2, byte[] arg3, byte[] arg4, int arg5) {
        byte by = 1;
        return sprzmh.cfr_renamed_8772(arg0, arg1, arg2, arg3, by, arg4, arg5, 64);
    }

    public static sprveh cfr_renamed_8804(byte[] arg0, int arg1) {
        sprud sprud2 = sprzmh.cfr_renamed_8736();
        byte[] byArray = new byte[114];
        sprud sprud3 = sprud2;
        sprud3.cfr_renamed_1197(arg0, arg1, 57);
        sprud3.cfr_renamed_1199(byArray, 0, byArray.length);
        byte[] byArray2 = new byte[57];
        sprzmh.cfr_renamed_8737(byArray, 0, byArray2);
        sprxgh sprxgh2 = new sprxgh(null);
        sprzmh.cfr_renamed_8789(byArray2, sprxgh2);
        sprwfh sprwfh2 = new sprwfh(null);
        sprzmh.cfr_renamed_8784(sprxgh2, sprwfh2);
        if (0 == sprzmh.cfr_renamed_8742(sprwfh2)) {
            throw new IllegalStateException();
        }
        return sprzmh.cfr_renamed_8802(sprwfh2);
    }

    private static /* synthetic */ void cfr_renamed_8784(sprxgh arg0, sprwfh arg1) {
        sprwfh sprwfh2 = arg1;
        sprggh.cfr_renamed_8805(arg0.cfr_renamed_2, sprwfh2.cfr_renamed_3);
        sprwfh sprwfh3 = arg1;
        sprggh.cfr_renamed_1636(arg1.cfr_renamed_3, arg0.cfr_renamed_3, sprwfh3.cfr_renamed_4);
        sprggh.cfr_renamed_1636(sprwfh3.cfr_renamed_3, arg0.cfr_renamed_4, arg1.cfr_renamed_3);
        sprggh.cfr_renamed_8746(sprwfh2.cfr_renamed_4);
        sprggh.cfr_renamed_8746(sprwfh2.cfr_renamed_3);
    }

    private static /* synthetic */ void cfr_renamed_8777(sprxgh arg0) {
        sprxgh sprxgh2 = arg0;
        sprggh.cfr_renamed_1643(sprxgh2.cfr_renamed_3);
        sprggh.cfr_renamed_8758(sprxgh2.cfr_renamed_4);
        sprggh.cfr_renamed_8758(sprxgh2.cfr_renamed_2);
    }

    private static /* synthetic */ int cfr_renamed_8793(sprxgh arg0) {
        int[] nArray;
        int[] nArray2 = sprggh.cfr_renamed_1631();
        int[] nArray3 = sprggh.cfr_renamed_1631();
        int[] nArray4 = sprggh.cfr_renamed_1631();
        int[] nArray5 = nArray = sprggh.cfr_renamed_1631();
        sprxgh sprxgh2 = arg0;
        sprggh.cfr_renamed_8743(sprxgh2.cfr_renamed_3, nArray3);
        sprggh.cfr_renamed_8743(sprxgh2.cfr_renamed_4, nArray4);
        sprggh.cfr_renamed_8743(sprxgh2.cfr_renamed_2, nArray);
        int[] nArray6 = nArray3;
        sprggh.cfr_renamed_1636(nArray3, nArray4, nArray2);
        sprggh.cfr_renamed_1654(nArray3, nArray4, nArray6);
        sprggh.cfr_renamed_1636(nArray3, nArray5, nArray6);
        sprggh.cfr_renamed_8743(nArray5, nArray);
        int[] nArray7 = nArray2;
        sprggh.cfr_renamed_8744(nArray2, 39081, nArray2);
        sprggh.cfr_renamed_1641(nArray2, nArray, nArray7);
        sprggh.cfr_renamed_1654(nArray2, nArray3, nArray7);
        sprggh.cfr_renamed_8746(nArray2);
        return sprggh.cfr_renamed_1660(nArray2);
    }

    private static /* synthetic */ boolean cfr_renamed_8772(byte[] arg0, int arg1, sprveh arg2, byte[] arg3, byte arg4, byte[] arg5, int arg6, int arg7) {
        if (!sprzmh.cfr_renamed_8780(arg3)) {
            throw new IllegalArgumentException(spryxaa.cfr_renamed_9("^1E"));
        }
        byte[] byArray = sprzmh.cfr_renamed_8755(arg0, arg1, 57);
        byte[] byArray2 = sprzmh.cfr_renamed_8755(arg0, arg1 + 57, 57);
        if (!sprzmh.cfr_renamed_8768(byArray)) {
            return false;
        }
        int[] nArray = new int[14];
        if (!sprhch.cfr_renamed_8724(byArray2, nArray)) {
            return false;
        }
        sprwfh sprwfh2 = new sprwfh(null);
        if (!sprzmh.cfr_renamed_8756(byArray, true, sprwfh2)) {
            return false;
        }
        sprwfh sprwfh3 = new sprwfh(null);
        sprveh sprveh2 = arg2;
        sprggh.cfr_renamed_2027(sprveh2.cfr_renamed_4, sprwfh3.cfr_renamed_4);
        sprggh.cfr_renamed_8546(sprveh2.cfr_renamed_4, 16, sprwfh3.cfr_renamed_3, 0);
        byte[] byArray3 = new byte[57];
        sprzmh.cfr_renamed_8797(sprveh2, byArray3, 0);
        sprud sprud2 = sprzmh.cfr_renamed_8736();
        byte[] byArray4 = new byte[114];
        sprud sprud3 = sprud2;
        sprud sprud4 = sprud2;
        sprzmh.cfr_renamed_8782(sprud2, arg4, arg3);
        sprud4.cfr_renamed_1197(byArray, 0, 57);
        sprud4.cfr_renamed_1197(byArray3, 0, 57);
        sprud3.cfr_renamed_1197(arg5, arg6, arg7);
        sprud3.cfr_renamed_1199(byArray4, 0, byArray4.length);
        byte[] byArray5 = sprhch.cfr_renamed_8721(byArray4);
        int[] nArray2 = new int[14];
        sprhch.cfr_renamed_8720(byArray5, nArray2);
        int[] nArray3 = new int[8];
        int[] nArray4 = new int[8];
        sprhch.cfr_renamed_8726(nArray2, nArray3, nArray4);
        int[] nArray5 = nArray;
        sprhch.cfr_renamed_8718(nArray, nArray4, nArray5);
        sprxgh sprxgh2 = new sprxgh(null);
        sprzmh.cfr_renamed_8774(nArray5, nArray3, sprwfh3, nArray4, sprwfh2, sprxgh2);
        return sprzmh.cfr_renamed_8764(sprxgh2);
    }

    private static /* synthetic */ sprveh cfr_renamed_8802(sprwfh arg0) {
        int[] nArray = new int[32];
        sprwfh sprwfh2 = arg0;
        sprggh.cfr_renamed_8546(sprwfh2.cfr_renamed_4, 0, nArray, 0);
        sprggh.cfr_renamed_8546(sprwfh2.cfr_renamed_3, 0, nArray, 16);
        return new sprveh(nArray);
    }

    private static /* synthetic */ void cfr_renamed_8778(boolean arg0, sprwfh arg1, sprxgh arg2, sprnhh arg3) {
        sprxgh sprxgh2;
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        sprnhh sprnhh2 = arg3;
        int[] nArray5 = sprnhh2.cfr_renamed_91;
        int[] nArray6 = sprnhh2.cfr_renamed_2;
        int[] nArray7 = sprnhh2.cfr_renamed_1;
        int[] nArray8 = sprnhh2.cfr_renamed_0;
        int[] nArray9 = sprnhh2.cfr_renamed_4;
        int[] nArray10 = sprnhh2.cfr_renamed_119;
        int[] nArray11 = sprnhh2.cfr_renamed_3;
        if (arg0) {
            nArray4 = nArray8;
            nArray3 = nArray5;
            nArray2 = nArray10;
            nArray = nArray9;
            sprxgh2 = arg2;
            sprwfh sprwfh2 = arg1;
            sprggh.cfr_renamed_1641(sprwfh2.cfr_renamed_3, sprwfh2.cfr_renamed_4, nArray11);
        } else {
            nArray4 = nArray5;
            nArray3 = nArray8;
            nArray2 = nArray9;
            nArray = nArray10;
            sprxgh2 = arg2;
            sprwfh sprwfh3 = arg1;
            sprggh.cfr_renamed_1654(sprwfh3.cfr_renamed_3, sprwfh3.cfr_renamed_4, nArray11);
        }
        sprggh.cfr_renamed_8743(sprxgh2.cfr_renamed_2, nArray5);
        sprwfh sprwfh4 = arg1;
        sprggh.cfr_renamed_1636(sprwfh4.cfr_renamed_4, arg2.cfr_renamed_3, nArray6);
        sprggh.cfr_renamed_1636(sprwfh4.cfr_renamed_3, arg2.cfr_renamed_4, nArray7);
        sprggh.cfr_renamed_1636(nArray6, nArray7, nArray8);
        int[] nArray12 = nArray8;
        sprggh.cfr_renamed_8744(nArray12, 39081, nArray12);
        sprggh.cfr_renamed_1654(nArray5, nArray8, nArray2);
        sprggh.cfr_renamed_1641(nArray5, nArray8, nArray);
        sprxgh sprxgh3 = arg2;
        sprggh.cfr_renamed_1654(arg2.cfr_renamed_4, sprxgh3.cfr_renamed_3, nArray8);
        sprggh.cfr_renamed_1636(nArray11, nArray8, nArray11);
        sprggh.cfr_renamed_1654(nArray7, nArray6, nArray4);
        sprggh.cfr_renamed_1641(nArray7, nArray6, nArray3);
        sprggh.cfr_renamed_8748(nArray4);
        sprggh.cfr_renamed_1641(nArray11, nArray5, nArray11);
        sprggh.cfr_renamed_1636(nArray11, sprxgh3.cfr_renamed_2, nArray11);
        sprggh.cfr_renamed_1636(nArray8, arg2.cfr_renamed_2, nArray8);
        sprxgh sprxgh4 = arg2;
        sprggh.cfr_renamed_1636(nArray9, nArray11, sprxgh4.cfr_renamed_3);
        sprggh.cfr_renamed_1636(nArray8, nArray10, sprxgh4.cfr_renamed_4);
        sprggh.cfr_renamed_1636(nArray9, nArray10, arg2.cfr_renamed_2);
    }

    public static void cfr_renamed_8806(byte[] arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        byte by = 0;
        sprzmh.cfr_renamed_8790(arg0, arg1, arg2, by, arg3, arg4, arg5, arg6, arg7);
    }

    public static boolean cfr_renamed_8807(byte[] arg0, int arg1, sprveh arg2, byte[] arg3, sprud arg4) {
        byte[] byArray = new byte[64];
        if (64 != arg4.cfr_renamed_1199(byArray, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        byte by = 1;
        return sprzmh.cfr_renamed_8772(arg0, arg1, arg2, arg3, by, byArray, 0, byArray.length);
    }

    public static void cfr_renamed_8808(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, sprud arg5, byte[] arg6, int arg7) {
        byte[] byArray = new byte[64];
        if (64 != arg5.cfr_renamed_1199(byArray, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        byte by = 1;
        sprzmh.cfr_renamed_8779(arg0, arg1, arg2, arg3, arg4, by, byArray, 0, byArray.length, arg6, arg7);
    }

    private static /* synthetic */ void cfr_renamed_8782(sprud arg0, byte arg1, byte[] arg2) {
        int n = cfr_renamed_114.length;
        byte[] byArray = new byte[n + 2 + arg2.length];
        System.arraycopy(cfr_renamed_114, 0, byArray, 0, n);
        byArray[n] = arg1;
        byArray[n + 1] = (byte)arg2.length;
        System.arraycopy(arg2, 0, byArray, n + 2, arg2.length);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
    }

    public static void cfr_renamed_8809(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        byte by = 0;
        sprzmh.cfr_renamed_8779(arg0, arg1, arg2, arg3, arg4, by, arg5, arg6, arg7, arg8, arg9);
    }

    public static sprveh cfr_renamed_8810(byte[] arg0, int arg1) {
        byte[] byArray = sprzmh.cfr_renamed_8755(arg0, arg1, 57);
        if (!sprzmh.cfr_renamed_8739(byArray)) {
            return null;
        }
        sprwfh sprwfh2 = new sprwfh(null);
        if (!sprzmh.cfr_renamed_8756(byArray, false, sprwfh2)) {
            return null;
        }
        return sprzmh.cfr_renamed_8802(sprwfh2);
    }

    private static /* synthetic */ void cfr_renamed_8737(byte[] arg0, int arg1, byte[] arg2) {
        System.arraycopy(arg0, arg1, arg2, 0, 56);
        byte[] byArray = arg2;
        byte[] byArray2 = arg2;
        byArray[0] = (byte)(byArray[0] & 0xFC);
        byArray2[55] = (byte)(byArray2[55] | 0x80);
        arg2[56] = 0;
    }

    public static boolean cfr_renamed_8811(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7) {
        byte by = 0;
        return sprzmh.cfr_renamed_8740(arg0, arg1, arg2, arg3, arg4, by, arg5, arg6, arg7);
    }

    private static /* synthetic */ void cfr_renamed_8763(sprwfh arg0, sprxgh arg1) {
        byte[] byArray = new byte[447];
        sprhch.cfr_renamed_8725(5, byArray);
        int n = 8;
        sprxgh[] sprxghArray = new sprxgh[8];
        sprnhh sprnhh2 = new sprnhh(null);
        byte[] byArray2 = byArray;
        sprzmh.cfr_renamed_8776(arg0, sprxghArray, 0, n, sprnhh2);
        sprzmh.cfr_renamed_8777(arg1);
        int n2 = 446;
        while (true) {
            byte by;
            if ((by = byArray2[n2]) != 0) {
                sprxgh[] sprxghArray2;
                boolean bl;
                int n3 = by >> 1 ^ by >> 31;
                if (by < 0) {
                    bl = true;
                    sprxghArray2 = sprxghArray;
                } else {
                    bl = false;
                    sprxghArray2 = sprxghArray;
                }
                sprzmh.cfr_renamed_8765(bl, sprxghArray2[n3], arg1, sprnhh2);
            }
            if (--n2 < 0) {
                return;
            }
            sprzmh.cfr_renamed_8753(arg1, sprnhh2);
            byArray2 = byArray;
        }
    }

    private static /* synthetic */ boolean cfr_renamed_8764(sprxgh arg0) {
        sprxgh sprxgh2 = arg0;
        sprggh.cfr_renamed_8746(sprxgh2.cfr_renamed_3);
        sprggh.cfr_renamed_8746(sprxgh2.cfr_renamed_4);
        sprggh.cfr_renamed_8746(sprxgh2.cfr_renamed_2);
        if (sprggh.cfr_renamed_8761(sprxgh2.cfr_renamed_3)) {
            sprxgh sprxgh3 = arg0;
            if (sprggh.cfr_renamed_8812(sprxgh3.cfr_renamed_4, sprxgh3.cfr_renamed_2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean cfr_renamed_8813(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, sprud arg5) {
        byte[] byArray = new byte[64];
        if (64 != arg5.cfr_renamed_1199(byArray, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        byte by = 1;
        return sprzmh.cfr_renamed_8740(arg0, arg1, arg2, arg3, arg4, by, byArray, 0, byArray.length);
    }
}

