/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramh;
import com.spire.presentation.packages.sprdgh;
import com.spire.presentation.packages.spreeh;
import com.spire.presentation.packages.sprfgh;
import com.spire.presentation.packages.sprflh;
import com.spire.presentation.packages.sprfmh;
import com.spire.presentation.packages.sprgbo;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprlnh;
import com.spire.presentation.packages.sprmeh;
import com.spire.presentation.packages.sprndh;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprpuh;
import com.spire.presentation.packages.sprrdaa;
import com.spire.presentation.packages.sprrmh;
import com.spire.presentation.packages.sprxfh;
import com.spire.presentation.packages.sprxlh;
import com.spire.presentation.packages.sprxuh;
import java.security.SecureRandom;

public abstract class sprjrh {
    private static final int cfr_renamed_287 = 8;
    private static final int[] cfr_renamed_724;
    private static final int[] cfr_renamed_953;
    private static final int cfr_renamed_133 = 8;
    private static final int cfr_renamed_185 = 8;
    private static final int spr\ufe34 = 6;
    private static final int[] cfr_renamed_82;
    private static spramh[] cfr_renamed_126;
    private static final int cfr_renamed_88 = 32;
    private static final int[] cfr_renamed_31;
    private static final int cfr_renamed_272 = 7;
    private static final int cfr_renamed_145 = 4;
    private static final int[] cfr_renamed_114;
    public static final int cfr_renamed_96 = 64;
    public static final int cfr_renamed_105 = 32;
    public static final int cfr_renamed_137 = 32;
    private static final int[] cfr_renamed_79;
    private static spramh[] cfr_renamed_107;
    private static final int[] cfr_renamed_132;
    private static final byte[] cfr_renamed_102;
    private static int[] cfr_renamed_93;
    public static final int cfr_renamed_86 = 64;
    private static final Object cfr_renamed_152;
    private static final int[] cfr_renamed_112;
    private static final int cfr_renamed_119 = 256;
    private static final int cfr_renamed_91 = 8;
    private static final int cfr_renamed_0 = 8;
    private static final int cfr_renamed_1 = 32;
    private static final int[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 4;
    private static final int[] cfr_renamed_4;

    public static void cfr_renamed_8800(SecureRandom arg0, byte[] arg1) {
        if (arg1.length != 32) {
            throw new IllegalArgumentException("k");
        }
        arg0.nextBytes(arg1);
    }

    public static boolean cfr_renamed_8814(byte[] arg0, int arg1, sprflh arg2, byte[] arg3, byte[] arg4, int arg5, int arg6) {
        byte by = 0;
        return sprjrh.cfr_renamed_8815(arg0, arg1, arg2, arg3, by, arg4, arg5, arg6);
    }

    private static /* synthetic */ int cfr_renamed_8816(spreeh arg0) {
        int[] nArray;
        int[] nArray2 = sprfmh.cfr_renamed_1631();
        int[] nArray3 = sprfmh.cfr_renamed_1631();
        int[] nArray4 = sprfmh.cfr_renamed_1631();
        int[] nArray5 = nArray = sprfmh.cfr_renamed_1631();
        spreeh spreeh2 = arg0;
        sprfmh.cfr_renamed_8743(spreeh2.cfr_renamed_3, nArray3);
        sprfmh.cfr_renamed_8743(spreeh2.cfr_renamed_1, nArray4);
        sprfmh.cfr_renamed_8743(spreeh2.cfr_renamed_0, nArray);
        sprfmh.cfr_renamed_1636(nArray3, nArray4, nArray2);
        int[] nArray6 = nArray4;
        sprfmh.cfr_renamed_1641(nArray4, nArray3, nArray6);
        sprfmh.cfr_renamed_1636(nArray4, nArray5, nArray6);
        sprfmh.cfr_renamed_8743(nArray5, nArray);
        int[] nArray7 = nArray2;
        sprfmh.cfr_renamed_1636(nArray2, cfr_renamed_4, nArray2);
        sprfmh.cfr_renamed_1654(nArray2, nArray, nArray7);
        sprfmh.cfr_renamed_1641(nArray2, nArray4, nArray7);
        sprfmh.cfr_renamed_8746(nArray2);
        return sprfmh.cfr_renamed_1660(nArray2);
    }

    private static /* synthetic */ int cfr_renamed_8817(spreeh arg0, byte[] arg1, int arg2) {
        sprfgh sprfgh2;
        sprfgh sprfgh3 = sprfgh2 = new sprfgh(null);
        sprjrh.cfr_renamed_8818(arg0, sprfgh3);
        int n = sprjrh.cfr_renamed_8819(sprfgh2);
        sprjrh.cfr_renamed_8820(sprfgh3, arg1, arg2);
        return n;
    }

    private static /* synthetic */ void cfr_renamed_8821(sprxfh[] arg0) {
        int n = arg0.length;
        int[] nArray = sprfmh.cfr_renamed_8787(n);
        int[] nArray2 = sprfmh.cfr_renamed_1631();
        sprfmh.cfr_renamed_8546(arg0[0].cfr_renamed_4, 0, nArray2, 0);
        sprfmh.cfr_renamed_8546(nArray2, 0, nArray, 0);
        int n2 = 0;
        while (++n2 < n) {
            sprfmh.cfr_renamed_1636(nArray2, arg0[n2].cfr_renamed_4, nArray2);
            sprfmh.cfr_renamed_8546(nArray2, 0, nArray, n2 * 10);
        }
        int[] nArray3 = nArray2;
        int[] nArray4 = nArray2;
        sprfmh.cfr_renamed_1654(nArray3, nArray4, nArray3);
        sprfmh.cfr_renamed_8788(nArray3, nArray4);
        int[] nArray5 = sprfmh.cfr_renamed_1631();
        int n3 = --n2;
        while (n3 > 0) {
            int n4 = n2--;
            int n5 = n2;
            n3 = n5;
            sprfmh.cfr_renamed_8546(nArray, n5 * 10, nArray5, 0);
            sprfmh.cfr_renamed_1636(nArray5, nArray2, nArray5);
            sprfmh.cfr_renamed_1636(nArray2, arg0[n4].cfr_renamed_4, nArray2);
            sprfmh.cfr_renamed_8546(nArray5, 0, arg0[n4].cfr_renamed_4, 0);
        }
        sprfmh.cfr_renamed_8546(nArray2, 0, arg0[0].cfr_renamed_4, 0);
    }

    public static boolean cfr_renamed_8822(byte[] arg0, int arg1, sprflh arg2, byte[] arg3, int arg4, int arg5) {
        byte[] byArray = null;
        byte by = 0;
        return sprjrh.cfr_renamed_8815(arg0, arg1, arg2, byArray, by, arg3, arg4, arg5);
    }

    private static /* synthetic */ void cfr_renamed_8790(byte[] arg0, int arg1, byte[] arg2, byte arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        if (!sprjrh.cfr_renamed_8823(arg2, arg3)) {
            throw new IllegalArgumentException(sprrdaa.cfr_renamed_9("h?s"));
        }
        sprgf sprgf2 = sprjrh.cfr_renamed_8824();
        byte[] byArray = new byte[64];
        sprgf sprgf3 = sprgf2;
        sprgf3.cfr_renamed_1197(arg0, arg1, 32);
        sprgf3.cfr_renamed_1219(byArray, 0);
        byte[] byArray2 = new byte[32];
        sprjrh.cfr_renamed_8737(byArray, 0, byArray2);
        byte[] byArray3 = new byte[32];
        sprjrh.cfr_renamed_8738(byArray2, byArray3, 0);
        sprjrh.cfr_renamed_8825(sprgf2, byArray, byArray2, byArray3, 0, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    private static /* synthetic */ byte[] cfr_renamed_8755(byte[] arg0, int arg1, int arg2) {
        byte[] byArray = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        return byArray;
    }

    public static boolean cfr_renamed_8770(byte[] arg0, int arg1) {
        byte[] byArray = sprjrh.cfr_renamed_8755(arg0, arg1, 32);
        if (!sprjrh.cfr_renamed_8739(byArray)) {
            return false;
        }
        sprfgh sprfgh2 = new sprfgh(null);
        if (!sprjrh.cfr_renamed_8826(byArray, false, sprfgh2)) {
            return false;
        }
        return sprjrh.cfr_renamed_8827(sprfgh2);
    }

    private static /* synthetic */ void cfr_renamed_8738(byte[] arg0, byte[] arg1, int arg2) {
        spreeh spreeh2 = new spreeh(null);
        sprjrh.cfr_renamed_8828(arg0, spreeh2);
        if (0 == sprjrh.cfr_renamed_8817(spreeh2, arg1, arg2)) {
            throw new IllegalStateException();
        }
    }

    private static /* synthetic */ void cfr_renamed_8829(sprfgh arg0, spreeh arg1) {
        byte[] byArray = new byte[253];
        sprndh.cfr_renamed_8725(4, byArray);
        int n = 4;
        sprrmh[] sprrmhArray = new sprrmh[4];
        sprdgh sprdgh2 = new sprdgh(null);
        byte[] byArray2 = byArray;
        sprjrh.cfr_renamed_8830(arg0, sprrmhArray, n, sprdgh2);
        sprjrh.cfr_renamed_8831(arg1);
        int n2 = 252;
        while (true) {
            byte by;
            if ((by = byArray2[n2]) != 0) {
                sprrmh[] sprrmhArray2;
                boolean bl;
                int n3 = by >> 1 ^ by >> 31;
                if (by < 0) {
                    bl = true;
                    sprrmhArray2 = sprrmhArray;
                } else {
                    bl = false;
                    sprrmhArray2 = sprrmhArray;
                }
                sprjrh.cfr_renamed_8832(bl, sprrmhArray2[n3], arg1, sprdgh2);
            }
            if (--n2 < 0) {
                return;
            }
            sprjrh.cfr_renamed_8833(arg1);
            byArray2 = byArray;
        }
    }

    public static boolean cfr_renamed_8834(byte[] arg0, int arg1, sprflh arg2, byte[] arg3, byte[] arg4, int arg5) {
        byte by = 1;
        return sprjrh.cfr_renamed_8815(arg0, arg1, arg2, arg3, by, arg4, arg5, 64);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void cfr_renamed_8775() {
        Object object = cfr_renamed_152;
        synchronized (object) {
            int n;
            sprxfh sprxfh2;
            int n2;
            int n3;
            block16: {
                if (cfr_renamed_93 == null) break block16;
                return;
            }
            int n4 = 16;
            int n5 = 64;
            int n6 = n4 * 2 + n5;
            sprxfh[] sprxfhArray = new sprxfh[n6];
            sprdgh sprdgh2 = new sprdgh(null);
            sprfgh sprfgh2 = new sprfgh(null);
            sprfmh.cfr_renamed_8546(cfr_renamed_82, 0, sprfgh2.cfr_renamed_4, 0);
            sprfmh.cfr_renamed_8546(cfr_renamed_132, 0, sprfgh2.cfr_renamed_3, 0);
            sprjrh.cfr_renamed_8835(sprfgh2, sprxfhArray, 0, n4, sprdgh2);
            sprfgh sprfgh3 = new sprfgh(null);
            sprfmh.cfr_renamed_8546(cfr_renamed_953, 0, sprfgh3.cfr_renamed_4, 0);
            sprfmh.cfr_renamed_8546(cfr_renamed_114, 0, sprfgh3.cfr_renamed_3, 0);
            int n7 = n4;
            sprjrh.cfr_renamed_8835(sprfgh3, sprxfhArray, n7, n7, sprdgh2);
            spreeh spreeh2 = new spreeh(null);
            sprfmh.cfr_renamed_8546(cfr_renamed_82, 0, spreeh2.cfr_renamed_3, 0);
            sprfmh.cfr_renamed_8546(cfr_renamed_132, 0, spreeh2.cfr_renamed_1, 0);
            spreeh spreeh3 = spreeh2;
            sprfmh.cfr_renamed_8758(spreeh3.cfr_renamed_0);
            spreeh spreeh4 = spreeh2;
            sprfmh.cfr_renamed_8546(spreeh3.cfr_renamed_3, 0, spreeh4.cfr_renamed_2, 0);
            sprfmh.cfr_renamed_8546(spreeh4.cfr_renamed_1, 0, spreeh2.cfr_renamed_4, 0);
            int n8 = n4 * 2;
            sprxfh[] sprxfhArray2 = new sprxfh[4];
            int n9 = n3 = 0;
            while (n9 < 4) {
                sprxfhArray2[n3++] = new sprxfh(null);
                n9 = n3;
            }
            sprxfh sprxfh3 = new sprxfh(null);
            int n10 = n2 = 0;
            while (n10 < 8) {
                int n11;
                int n12;
                int n13 = n8++;
                sprxfh sprxfh4 = new sprxfh(null);
                sprxfhArray[n13] = sprxfh4;
                sprxfh2 = sprxfh4;
                int n14 = n12 = 0;
                while (n14 < 4) {
                    spreeh spreeh5;
                    spreeh spreeh6 = spreeh2;
                    if (n12 == 0) {
                        sprjrh.cfr_renamed_8836(spreeh6, sprxfh2);
                        spreeh5 = spreeh2;
                    } else {
                        sprjrh.cfr_renamed_8836(spreeh6, sprxfh3);
                        spreeh5 = spreeh2;
                        sprxfh sprxfh5 = sprxfh2;
                        sprjrh.cfr_renamed_8837(sprxfh5, sprxfh3, sprxfh5, sprdgh2);
                    }
                    sprjrh.cfr_renamed_8833(spreeh5);
                    sprjrh.cfr_renamed_8836(spreeh2, sprxfhArray2[n12]);
                    if (n2 + n12 != 10) {
                        int n15 = n11 = 1;
                        while (n15 < 8) {
                            sprjrh.cfr_renamed_8833(spreeh2);
                            n15 = ++n11;
                        }
                    }
                    n14 = ++n12;
                }
                sprxfh sprxfh6 = sprxfh2;
                sprfmh.cfr_renamed_2027(sprxfh6.cfr_renamed_1, sprxfh6.cfr_renamed_1);
                sprfmh.cfr_renamed_2027(sprxfh6.cfr_renamed_3, sprxfh2.cfr_renamed_3);
                int n16 = n12 = 0;
                while (n16 < 3) {
                    int n17;
                    n11 = 1 << n12;
                    int n18 = n17 = 0;
                    while (n18 < n11) {
                        sprxfhArray[n8] = new sprxfh(null);
                        sprjrh.cfr_renamed_8837(sprxfhArray[n8 - n11], sprxfhArray2[n12], sprxfhArray[n8], sprdgh2);
                        ++n8;
                        n18 = ++n17;
                    }
                    n16 = ++n12;
                }
                n10 = ++n2;
            }
            sprjrh.cfr_renamed_8821(sprxfhArray);
            cfr_renamed_107 = new spramh[n4];
            int n19 = n2 = 0;
            while (n19 < n4) {
                sprxfh2 = sprxfhArray[n2];
                spramh spramh2 = new spramh(null);
                sprjrh.cfr_renamed_107[n2] = spramh2;
                spramh spramh3 = spramh2;
                sprxfh sprxfh7 = sprxfh2;
                sprxfh sprxfh8 = sprxfh2;
                sprfmh.cfr_renamed_1636(sprxfh7.cfr_renamed_1, sprxfh8.cfr_renamed_4, sprxfh2.cfr_renamed_1);
                sprxfh sprxfh9 = sprxfh2;
                sprfmh.cfr_renamed_1636(sprxfh7.cfr_renamed_2, sprxfh9.cfr_renamed_4, sprxfh9.cfr_renamed_2);
                spramh spramh4 = spramh3;
                sprfmh.cfr_renamed_8838(sprxfh8.cfr_renamed_2, sprxfh2.cfr_renamed_1, spramh4.cfr_renamed_4, spramh4.cfr_renamed_2);
                sprfmh.cfr_renamed_1636(sprxfh7.cfr_renamed_1, sprxfh2.cfr_renamed_2, spramh3.cfr_renamed_3);
                spramh spramh5 = spramh3;
                sprfmh.cfr_renamed_1636(spramh5.cfr_renamed_3, cfr_renamed_79, spramh3.cfr_renamed_3);
                sprfmh.cfr_renamed_8746(spramh5.cfr_renamed_2);
                sprfmh.cfr_renamed_8746(spramh2.cfr_renamed_4);
                sprfmh.cfr_renamed_8746(spramh5.cfr_renamed_3);
                n19 = ++n2;
            }
            cfr_renamed_126 = new spramh[n4];
            int n20 = n2 = 0;
            while (n20 < n4) {
                sprxfh2 = sprxfhArray[n4 + n2];
                spramh spramh6 = new spramh(null);
                sprjrh.cfr_renamed_126[n2] = spramh6;
                spramh spramh7 = spramh6;
                sprxfh sprxfh10 = sprxfh2;
                sprxfh sprxfh11 = sprxfh2;
                sprfmh.cfr_renamed_1636(sprxfh10.cfr_renamed_1, sprxfh11.cfr_renamed_4, sprxfh2.cfr_renamed_1);
                sprxfh sprxfh12 = sprxfh2;
                sprfmh.cfr_renamed_1636(sprxfh10.cfr_renamed_2, sprxfh12.cfr_renamed_4, sprxfh12.cfr_renamed_2);
                spramh spramh8 = spramh7;
                sprfmh.cfr_renamed_8838(sprxfh11.cfr_renamed_2, sprxfh2.cfr_renamed_1, spramh8.cfr_renamed_4, spramh8.cfr_renamed_2);
                sprfmh.cfr_renamed_1636(sprxfh10.cfr_renamed_1, sprxfh2.cfr_renamed_2, spramh7.cfr_renamed_3);
                spramh spramh9 = spramh7;
                sprfmh.cfr_renamed_1636(spramh9.cfr_renamed_3, cfr_renamed_79, spramh7.cfr_renamed_3);
                sprfmh.cfr_renamed_8746(spramh9.cfr_renamed_2);
                sprfmh.cfr_renamed_8746(spramh6.cfr_renamed_4);
                sprfmh.cfr_renamed_8746(spramh9.cfr_renamed_3);
                n20 = ++n2;
            }
            cfr_renamed_93 = sprfmh.cfr_renamed_8787(n5 * 3);
            spramh spramh10 = new spramh(null);
            int n21 = 0;
            int n22 = n = n4 * 2;
            while (n22 < n6) {
                sprxfh sprxfh13;
                sprxfh sprxfh14 = sprxfh13 = sprxfhArray[n];
                sprxfh sprxfh15 = sprxfh13;
                sprfmh.cfr_renamed_1636(sprxfh14.cfr_renamed_1, sprxfh15.cfr_renamed_4, sprxfh13.cfr_renamed_1);
                sprxfh sprxfh16 = sprxfh13;
                sprfmh.cfr_renamed_1636(sprxfh14.cfr_renamed_2, sprxfh16.cfr_renamed_4, sprxfh16.cfr_renamed_2);
                spramh spramh11 = spramh10;
                sprfmh.cfr_renamed_8838(sprxfh15.cfr_renamed_2, sprxfh13.cfr_renamed_1, spramh11.cfr_renamed_4, spramh11.cfr_renamed_2);
                sprfmh.cfr_renamed_1636(sprxfh14.cfr_renamed_1, sprxfh13.cfr_renamed_2, spramh10.cfr_renamed_3);
                spramh spramh12 = spramh10;
                spramh spramh13 = spramh10;
                spramh spramh14 = spramh10;
                sprfmh.cfr_renamed_1636(spramh13.cfr_renamed_3, cfr_renamed_79, spramh14.cfr_renamed_3);
                sprfmh.cfr_renamed_8746(spramh14.cfr_renamed_2);
                sprfmh.cfr_renamed_8746(spramh13.cfr_renamed_4);
                sprfmh.cfr_renamed_8746(spramh12.cfr_renamed_3);
                sprfmh.cfr_renamed_8546(spramh12.cfr_renamed_2, 0, cfr_renamed_93, n21);
                sprfmh.cfr_renamed_8546(spramh10.cfr_renamed_4, 0, cfr_renamed_93, n21 += 10);
                sprfmh.cfr_renamed_8546(spramh12.cfr_renamed_3, 0, cfr_renamed_93, n21 += 10);
                n22 = ++n;
                n21 += 10;
            }
            return;
        }
    }

    public static boolean cfr_renamed_8739(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5, int arg6) {
        byte by = 1;
        return sprjrh.cfr_renamed_8740(arg0, arg1, arg2, arg3, arg4, by, arg5, arg6, 64);
    }

    public static boolean cfr_renamed_8839(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        byte[] byArray = null;
        byte by = 0;
        return sprjrh.cfr_renamed_8740(arg0, arg1, arg2, arg3, byArray, by, arg4, arg5, arg6);
    }

    private static /* synthetic */ void cfr_renamed_8835(sprfgh arg0, sprxfh[] arg1, int arg2, int arg3, sprdgh arg4) {
        int n;
        arg1[arg2] = new sprxfh(null);
        sprjrh.cfr_renamed_8840(arg0, arg1[arg2]);
        sprxfh sprxfh2 = new sprxfh(null);
        sprjrh.cfr_renamed_8837(arg1[arg2], arg1[arg2], sprxfh2, arg4);
        int n2 = n = 1;
        while (n2 < arg3) {
            sprxfh sprxfh3 = arg1[arg2 + n - 1];
            sprxfh sprxfh4 = new sprxfh(null);
            arg1[arg2 + ++n] = sprxfh4;
            sprjrh.cfr_renamed_8837(sprxfh3, sprxfh2, sprxfh4, arg4);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_8841(sprflh sprflh2, byte[] byArray, int n) {
        void arg2;
        void arg1;
        sprflh arg0;
        sprfmh.cfr_renamed_8798(arg0.cfr_renamed_4, 10, (byte[])arg1, (int)arg2);
        void v0 = arg2 + 32 - true;
        byArray[v0] = (byte)(byArray[v0] | (arg0.cfr_renamed_4[0] & 1) << 7);
    }

    private static /* synthetic */ void cfr_renamed_8842(sprrmh arg0, spreeh arg1, sprdgh arg2) {
        spreeh spreeh2 = arg1;
        int[] nArray = spreeh2.cfr_renamed_3;
        int[] nArray2 = spreeh2.cfr_renamed_1;
        int[] nArray3 = arg2.cfr_renamed_4;
        int[] nArray4 = spreeh2.cfr_renamed_0;
        int[] nArray5 = spreeh2.cfr_renamed_2;
        int[] nArray6 = nArray;
        int[] nArray7 = nArray2;
        int[] nArray8 = spreeh2.cfr_renamed_4;
        sprfmh.cfr_renamed_8838(spreeh2.cfr_renamed_1, arg1.cfr_renamed_3, nArray2, nArray);
        sprrmh sprrmh2 = arg0;
        sprfmh.cfr_renamed_1636(nArray, sprrmh2.cfr_renamed_1, nArray);
        sprfmh.cfr_renamed_1636(nArray2, sprrmh2.cfr_renamed_2, nArray2);
        sprfmh.cfr_renamed_1636(spreeh2.cfr_renamed_2, arg1.cfr_renamed_4, nArray3);
        sprfmh.cfr_renamed_1636(nArray3, arg0.cfr_renamed_4, nArray3);
        sprfmh.cfr_renamed_1636(spreeh2.cfr_renamed_0, arg0.cfr_renamed_3, nArray4);
        sprfmh.cfr_renamed_8838(nArray2, nArray, nArray8, nArray5);
        sprfmh.cfr_renamed_8838(nArray4, nArray3, nArray7, nArray6);
        sprfmh.cfr_renamed_1636(nArray6, nArray7, arg1.cfr_renamed_0);
        sprfmh.cfr_renamed_1636(nArray6, nArray5, arg1.cfr_renamed_3);
        sprfmh.cfr_renamed_1636(nArray7, nArray8, arg1.cfr_renamed_1);
    }

    private static /* synthetic */ void cfr_renamed_8833(spreeh arg0) {
        spreeh spreeh2 = arg0;
        int[] nArray = spreeh2.cfr_renamed_3;
        int[] nArray2 = spreeh2.cfr_renamed_1;
        int[] nArray3 = spreeh2.cfr_renamed_0;
        int[] nArray4 = spreeh2.cfr_renamed_2;
        int[] nArray5 = nArray;
        int[] nArray6 = nArray2;
        int[] nArray7 = spreeh2.cfr_renamed_4;
        sprfmh.cfr_renamed_1654(spreeh2.cfr_renamed_3, arg0.cfr_renamed_1, nArray4);
        sprfmh.cfr_renamed_8743(spreeh2.cfr_renamed_3, nArray);
        sprfmh.cfr_renamed_8743(spreeh2.cfr_renamed_1, nArray2);
        sprfmh.cfr_renamed_8743(spreeh2.cfr_renamed_0, nArray3);
        int[] nArray8 = nArray4;
        int[] nArray9 = nArray3;
        sprfmh.cfr_renamed_1654(nArray9, nArray3, nArray9);
        sprfmh.cfr_renamed_8838(nArray, nArray2, nArray7, nArray6);
        sprfmh.cfr_renamed_8743(nArray4, nArray8);
        sprfmh.cfr_renamed_1641(nArray7, nArray8, nArray4);
        sprfmh.cfr_renamed_1654(nArray3, nArray6, nArray5);
        sprfmh.cfr_renamed_8748(nArray5);
        sprfmh.cfr_renamed_1636(nArray5, nArray6, arg0.cfr_renamed_0);
        sprfmh.cfr_renamed_1636(nArray5, nArray4, arg0.cfr_renamed_3);
        sprfmh.cfr_renamed_1636(nArray6, nArray7, arg0.cfr_renamed_1);
    }

    public static sprflh cfr_renamed_8810(byte[] arg0, int arg1) {
        byte[] byArray = sprjrh.cfr_renamed_8755(arg0, arg1, 32);
        if (!sprjrh.cfr_renamed_8739(byArray)) {
            return null;
        }
        sprfgh sprfgh2 = new sprfgh(null);
        if (!sprjrh.cfr_renamed_8826(byArray, false, sprfgh2)) {
            return null;
        }
        return sprjrh.cfr_renamed_8843(sprfgh2);
    }

    private static /* synthetic */ boolean cfr_renamed_8740(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte arg5, byte[] arg6, int arg7, int arg8) {
        if (!sprjrh.cfr_renamed_8823(arg4, arg5)) {
            throw new IllegalArgumentException(sprgbo.cfr_renamed_9("gM|"));
        }
        byte[] byArray = sprjrh.cfr_renamed_8755(arg0, arg1, 32);
        byte[] byArray2 = sprjrh.cfr_renamed_8755(arg0, arg1 + 32, 32);
        byte[] byArray3 = sprjrh.cfr_renamed_8755(arg2, arg3, 32);
        if (!sprjrh.cfr_renamed_8768(byArray)) {
            return false;
        }
        int[] nArray = new int[8];
        if (!sprndh.cfr_renamed_8724(byArray2, nArray)) {
            return false;
        }
        if (!sprjrh.cfr_renamed_8739(byArray3)) {
            return false;
        }
        sprfgh sprfgh2 = new sprfgh(null);
        if (!sprjrh.cfr_renamed_8826(byArray, true, sprfgh2)) {
            return false;
        }
        sprfgh sprfgh3 = new sprfgh(null);
        if (!sprjrh.cfr_renamed_8826(byArray3, true, sprfgh3)) {
            return false;
        }
        sprgf sprgf2 = sprjrh.cfr_renamed_8824();
        byte[] byArray4 = new byte[64];
        if (arg4 != null) {
            sprjrh.cfr_renamed_8844(sprgf2, arg5, arg4);
        }
        sprgf sprgf3 = sprgf2;
        sprgf2.cfr_renamed_1197(byArray, 0, 32);
        sprgf3.cfr_renamed_1197(byArray3, 0, 32);
        sprgf3.cfr_renamed_1197(arg6, arg7, arg8);
        sprgf2.cfr_renamed_1219(byArray4, 0);
        byte[] byArray5 = sprndh.cfr_renamed_8721(byArray4);
        int[] nArray2 = new int[8];
        sprndh.cfr_renamed_8720(byArray5, nArray2);
        int[] nArray3 = new int[4];
        int[] nArray4 = new int[4];
        sprndh.cfr_renamed_8726(nArray2, nArray3, nArray4);
        int[] nArray5 = nArray;
        sprndh.cfr_renamed_8731(nArray, nArray4, nArray5);
        spreeh spreeh2 = new spreeh(null);
        sprjrh.cfr_renamed_8845(nArray5, nArray3, sprfgh3, nArray4, sprfgh2, spreeh2);
        return sprjrh.cfr_renamed_8846(spreeh2);
    }

    public static void cfr_renamed_8847(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, sprgf arg5, byte[] arg6, int arg7) {
        byte[] byArray = new byte[64];
        if (64 != arg5.cfr_renamed_1219(byArray, 0)) {
            throw new IllegalArgumentException("ph");
        }
        byte by = 1;
        sprjrh.cfr_renamed_8779(arg0, arg1, arg2, arg3, arg4, by, byArray, 0, byArray.length, arg6, arg7);
    }

    private static /* synthetic */ sprflh cfr_renamed_8843(sprfgh arg0) {
        int[] nArray = new int[20];
        sprfgh sprfgh2 = arg0;
        sprfmh.cfr_renamed_8546(sprfgh2.cfr_renamed_4, 0, nArray, 0);
        sprfmh.cfr_renamed_8546(sprfgh2.cfr_renamed_3, 0, nArray, 10);
        return new sprflh(nArray);
    }

    private static /* synthetic */ int[] cfr_renamed_8848(sprfgh arg0, int arg1, sprdgh arg2) {
        sprxfh sprxfh2 = new sprxfh(null);
        sprjrh.cfr_renamed_8840(arg0, sprxfh2);
        sprxfh sprxfh3 = new sprxfh(null);
        sprxfh sprxfh4 = sprxfh2;
        sprxfh sprxfh5 = sprxfh4;
        sprjrh.cfr_renamed_8837(sprxfh4, sprxfh4, sprxfh3, arg2);
        sprrmh sprrmh2 = new sprrmh(null);
        int[] nArray = sprfmh.cfr_renamed_8787(arg1 * 4);
        int n = 0;
        int n2 = 0;
        while (true) {
            sprjrh.cfr_renamed_8849(sprxfh5, sprrmh2);
            sprrmh sprrmh3 = sprrmh2;
            sprfmh.cfr_renamed_8546(sprrmh3.cfr_renamed_1, 0, nArray, n);
            sprfmh.cfr_renamed_8546(sprrmh3.cfr_renamed_2, 0, nArray, n += 10);
            sprfmh.cfr_renamed_8546(sprrmh3.cfr_renamed_4, 0, nArray, n += 10);
            sprfmh.cfr_renamed_8546(sprrmh3.cfr_renamed_3, 0, nArray, n += 10);
            n += 10;
            if (++n2 == arg1) {
                return nArray;
            }
            sprxfh5 = sprxfh2;
            sprxfh sprxfh6 = sprxfh2;
            sprjrh.cfr_renamed_8837(sprxfh6, sprxfh3, sprxfh6, arg2);
        }
    }

    private static /* synthetic */ void cfr_renamed_8850(int[] arg0, int arg1, int[] arg2, sprrmh arg3) {
        int n = sprjrh.cfr_renamed_8766(arg0, arg1);
        int n2 = n >>> 3 ^ 1;
        int n3 = (n ^ -n2) & 7;
        int n4 = 0;
        int n5 = 0;
        int n6 = n4;
        while (n6 < 8) {
            int n7 = (n4 ^ n3) - 1 >> 31;
            int n8 = n5;
            sprfmh.cfr_renamed_8734(n7, arg2, n8, arg3.cfr_renamed_1, 0);
            sprfmh.cfr_renamed_8734(n7, arg2, n5 += 10, arg3.cfr_renamed_2, 0);
            sprfmh.cfr_renamed_8734(n7, arg2, n5 += 10, arg3.cfr_renamed_4, 0);
            int n9 = n5 += 10;
            n5 += 10;
            sprfmh.cfr_renamed_8734(n7, arg2, n9, arg3.cfr_renamed_3, 0);
            n6 = ++n4;
        }
        sprrmh sprrmh2 = arg3;
        sprfmh.cfr_renamed_8851(n2, sprrmh2.cfr_renamed_1, sprrmh2.cfr_renamed_2);
        sprfmh.cfr_renamed_8767(n2, arg3.cfr_renamed_4);
    }

    public static void cfr_renamed_8796(byte[] arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, byte[] arg5, int arg6) {
        byte by = 1;
        sprjrh.cfr_renamed_8790(arg0, arg1, arg2, by, arg3, arg4, 64, arg5, arg6);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_8840(sprfgh sprfgh2, sprxfh sprxfh2) {
        void arg1;
        sprfgh arg0;
        sprfgh sprfgh3 = arg0;
        sprfmh.cfr_renamed_8546(sprfgh3.cfr_renamed_4, 0, arg1.cfr_renamed_1, 0);
        sprfmh.cfr_renamed_8546(sprfgh3.cfr_renamed_3, 0, arg1.cfr_renamed_2, 0);
        sprfmh.cfr_renamed_8758(sprxfh2.cfr_renamed_4);
        sprfmh.cfr_renamed_1636(sprfgh3.cfr_renamed_4, arg0.cfr_renamed_3, arg1.cfr_renamed_3);
    }

    private static /* synthetic */ void cfr_renamed_8831(spreeh arg0) {
        spreeh spreeh2 = arg0;
        sprfmh.cfr_renamed_1643(spreeh2.cfr_renamed_3);
        sprfmh.cfr_renamed_8758(spreeh2.cfr_renamed_1);
        sprfmh.cfr_renamed_8758(spreeh2.cfr_renamed_0);
        sprfmh.cfr_renamed_1643(spreeh2.cfr_renamed_2);
        sprfmh.cfr_renamed_8758(spreeh2.cfr_renamed_4);
    }

    private static /* synthetic */ void cfr_renamed_8828(byte[] arg0, spreeh arg1) {
        sprjrh.cfr_renamed_8775();
        int[] nArray = new int[8];
        sprndh.cfr_renamed_8720(arg0, nArray);
        sprndh.cfr_renamed_8723(256, nArray, nArray);
        sprjrh.cfr_renamed_8852(nArray);
        spramh spramh2 = new spramh(null);
        sprdgh sprdgh2 = new sprdgh(null);
        sprjrh.cfr_renamed_8831(arg1);
        int n = 0;
        int n2 = 28;
        while (true) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 8) {
                int n5 = nArray[n3] >>> n2;
                int n6 = n5 >>> 3 & 1;
                int n7 = (n5 ^ -n6) & 7;
                spramh spramh3 = spramh2;
                sprjrh.cfr_renamed_8853(n3, n7, spramh3);
                sprfmh.cfr_renamed_8767(n ^ n6, arg1.cfr_renamed_3);
                sprfmh.cfr_renamed_8767(n ^ n6, arg1.cfr_renamed_2);
                n = n6;
                sprjrh.cfr_renamed_8854(spramh3, arg1, sprdgh2);
                n4 = ++n3;
            }
            if ((n2 -= 4) < 0) break;
            sprjrh.cfr_renamed_8833(arg1);
        }
        sprfmh.cfr_renamed_8767(n, arg1.cfr_renamed_3);
        sprfmh.cfr_renamed_8767(n, arg1.cfr_renamed_2);
    }

    private static /* synthetic */ boolean cfr_renamed_8827(sprfgh arg0) {
        spreeh spreeh2;
        spreeh spreeh3 = spreeh2 = new spreeh(null);
        sprjrh.cfr_renamed_8829(arg0, spreeh3);
        return sprjrh.cfr_renamed_8846(spreeh3);
    }

    private static /* synthetic */ void cfr_renamed_8854(spramh arg0, spreeh arg1, sprdgh arg2) {
        spreeh spreeh2 = arg1;
        int[] nArray = spreeh2.cfr_renamed_3;
        int[] nArray2 = spreeh2.cfr_renamed_1;
        int[] nArray3 = arg2.cfr_renamed_4;
        int[] nArray4 = spreeh2.cfr_renamed_2;
        int[] nArray5 = nArray;
        int[] nArray6 = nArray2;
        int[] nArray7 = spreeh2.cfr_renamed_4;
        sprfmh.cfr_renamed_8838(spreeh2.cfr_renamed_1, arg1.cfr_renamed_3, nArray2, nArray);
        spramh spramh2 = arg0;
        sprfmh.cfr_renamed_1636(nArray, spramh2.cfr_renamed_2, nArray);
        sprfmh.cfr_renamed_1636(nArray2, spramh2.cfr_renamed_4, nArray2);
        sprfmh.cfr_renamed_1636(spreeh2.cfr_renamed_2, arg1.cfr_renamed_4, nArray3);
        sprfmh.cfr_renamed_1636(nArray3, arg0.cfr_renamed_3, nArray3);
        sprfmh.cfr_renamed_8838(nArray2, nArray, nArray7, nArray4);
        sprfmh.cfr_renamed_8838(spreeh2.cfr_renamed_0, nArray3, nArray6, nArray5);
        sprfmh.cfr_renamed_1636(nArray5, nArray6, arg1.cfr_renamed_0);
        sprfmh.cfr_renamed_1636(nArray5, nArray4, arg1.cfr_renamed_3);
        sprfmh.cfr_renamed_1636(nArray6, nArray7, arg1.cfr_renamed_1);
    }

    private static /* synthetic */ void cfr_renamed_8837(sprxfh arg0, sprxfh arg1, sprxfh arg2, sprdgh arg3) {
        sprxfh sprxfh2 = arg2;
        int[] nArray = sprxfh2.cfr_renamed_1;
        int[] nArray2 = sprxfh2.cfr_renamed_2;
        sprdgh sprdgh2 = arg3;
        int[] nArray3 = sprdgh2.cfr_renamed_4;
        int[] nArray4 = sprdgh2.cfr_renamed_3;
        int[] nArray5 = nArray;
        int[] nArray6 = nArray3;
        int[] nArray7 = nArray4;
        int[] nArray8 = nArray2;
        sprxfh sprxfh3 = arg0;
        sprfmh.cfr_renamed_8838(sprxfh3.cfr_renamed_2, sprxfh3.cfr_renamed_1, nArray2, nArray);
        sprfmh.cfr_renamed_8838(arg1.cfr_renamed_2, arg1.cfr_renamed_1, nArray4, nArray3);
        sprfmh.cfr_renamed_1636(nArray, nArray3, nArray);
        sprfmh.cfr_renamed_1636(nArray2, nArray4, nArray2);
        sprxfh sprxfh4 = arg0;
        sprfmh.cfr_renamed_1636(sprxfh4.cfr_renamed_3, arg1.cfr_renamed_3, nArray3);
        sprfmh.cfr_renamed_1636(nArray3, cfr_renamed_112, nArray3);
        sprfmh.cfr_renamed_1654(sprxfh4.cfr_renamed_4, arg0.cfr_renamed_4, nArray4);
        sprfmh.cfr_renamed_1636(nArray4, arg1.cfr_renamed_4, nArray4);
        sprfmh.cfr_renamed_8838(nArray2, nArray, nArray8, nArray5);
        sprfmh.cfr_renamed_8838(nArray4, nArray3, nArray7, nArray6);
        sprfmh.cfr_renamed_1636(nArray5, nArray8, arg2.cfr_renamed_3);
        sprfmh.cfr_renamed_1636(nArray6, nArray7, arg2.cfr_renamed_4);
        sprfmh.cfr_renamed_1636(nArray5, nArray6, arg2.cfr_renamed_1);
        sprfmh.cfr_renamed_1636(nArray8, nArray7, arg2.cfr_renamed_2);
    }

    private static /* synthetic */ sprgf cfr_renamed_8824() {
        sprocl sprocl2 = new sprocl();
        if (sprocl2.cfr_renamed_1218() != 64) {
            throw new IllegalStateException();
        }
        return sprocl2;
    }

    private static /* synthetic */ void cfr_renamed_8818(spreeh arg0, sprfgh arg1) {
        sprfgh sprfgh2 = arg1;
        sprfmh.cfr_renamed_8805(arg0.cfr_renamed_0, sprfgh2.cfr_renamed_3);
        sprfgh sprfgh3 = arg1;
        sprfmh.cfr_renamed_1636(arg1.cfr_renamed_3, arg0.cfr_renamed_3, sprfgh3.cfr_renamed_4);
        sprfmh.cfr_renamed_1636(sprfgh3.cfr_renamed_3, arg0.cfr_renamed_1, arg1.cfr_renamed_3);
        sprfmh.cfr_renamed_8746(sprfgh2.cfr_renamed_4);
        sprfmh.cfr_renamed_8746(sprfgh2.cfr_renamed_3);
    }

    public static boolean cfr_renamed_8811(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7) {
        byte by = 0;
        return sprjrh.cfr_renamed_8740(arg0, arg1, arg2, arg3, arg4, by, arg5, arg6, arg7);
    }

    private static /* synthetic */ void cfr_renamed_8779(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte arg5, byte[] arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        if (!sprjrh.cfr_renamed_8823(arg4, arg5)) {
            throw new IllegalArgumentException(sprrdaa.cfr_renamed_9("h?s"));
        }
        sprgf sprgf2 = sprjrh.cfr_renamed_8824();
        byte[] byArray = new byte[64];
        sprgf sprgf3 = sprgf2;
        sprgf3.cfr_renamed_1197(arg0, arg1, 32);
        sprgf3.cfr_renamed_1219(byArray, 0);
        byte[] byArray2 = new byte[32];
        sprjrh.cfr_renamed_8737(byArray, 0, byArray2);
        sprjrh.cfr_renamed_8825(sprgf2, byArray, byArray2, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    private static /* synthetic */ byte[] cfr_renamed_8741(byte[] arg0, byte[] arg1, byte[] arg2) {
        int[] nArray = new int[16];
        sprndh.cfr_renamed_8720(arg0, nArray);
        int[] nArray2 = new int[8];
        sprndh.cfr_renamed_8720(arg1, nArray2);
        int[] nArray3 = new int[8];
        sprndh.cfr_renamed_8720(arg2, nArray3);
        sprmeh.cfr_renamed_1665(nArray2, nArray3, nArray);
        byte[] byArray = new byte[64];
        sprpuh.cfr_renamed_8719(nArray, 0, nArray.length, byArray, 0);
        return sprndh.cfr_renamed_8721(byArray);
    }

    private static /* synthetic */ void cfr_renamed_8836(spreeh arg0, sprxfh arg1) {
        spreeh spreeh2 = arg0;
        sprfmh.cfr_renamed_8546(spreeh2.cfr_renamed_3, 0, arg1.cfr_renamed_1, 0);
        sprfmh.cfr_renamed_8546(spreeh2.cfr_renamed_1, 0, arg1.cfr_renamed_2, 0);
        sprfmh.cfr_renamed_8546(spreeh2.cfr_renamed_0, 0, arg1.cfr_renamed_4, 0);
        sprfmh.cfr_renamed_1636(spreeh2.cfr_renamed_2, arg0.cfr_renamed_4, arg1.cfr_renamed_3);
    }

    private static /* synthetic */ boolean cfr_renamed_8823(byte[] arg0, byte arg1) {
        return arg0 == null && arg1 == 0 || arg0 != null && arg0.length < 256;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_8820(sprfgh sprfgh2, byte[] byArray, int n) {
        void arg2;
        sprfgh arg0;
        void arg1;
        void v0 = arg1;
        sprfmh.cfr_renamed_8799(arg0.cfr_renamed_3, (byte[])v0, (int)arg2);
        int n2 = n + 32 - 1;
        v0[n2] = (byte)(v0[n2] | (arg0.cfr_renamed_4[0] & 1) << 7);
    }

    public static void cfr_renamed_8809(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        byte by = 0;
        sprjrh.cfr_renamed_8779(arg0, arg1, arg2, arg3, arg4, by, arg5, arg6, arg7, arg8, arg9);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean cfr_renamed_8826(byte[] byArray, boolean bl, sprfgh sprfgh2) {
        void arg1;
        void arg2;
        byte[] arg0;
        int n = (arg0[31] & 0x80) >>> 7;
        sprfmh.cfr_renamed_8720(arg0, sprfgh2.cfr_renamed_3);
        int[] nArray = sprfmh.cfr_renamed_1631();
        int[] nArray2 = sprfmh.cfr_renamed_1631();
        sprfmh.cfr_renamed_8743(arg2.cfr_renamed_3, nArray);
        sprfmh.cfr_renamed_1636(cfr_renamed_4, nArray, nArray2);
        sprfmh.cfr_renamed_8745(nArray);
        sprfmh.cfr_renamed_8759(nArray2);
        if (!sprfmh.cfr_renamed_8760(nArray, nArray2, arg2.cfr_renamed_4)) {
            return false;
        }
        sprfmh.cfr_renamed_8746(arg2.cfr_renamed_4);
        if (n == 1 && sprfmh.cfr_renamed_8761(arg2.cfr_renamed_4)) {
            return false;
        }
        if ((arg1 ^ (n != (arg2.cfr_renamed_4[0] & 1) ? 1 : 0)) != 0) {
            void v0 = arg2;
            sprfmh.cfr_renamed_2027(arg2.cfr_renamed_4, v0.cfr_renamed_4);
            sprfmh.cfr_renamed_8746(v0.cfr_renamed_4);
        }
        return true;
    }

    private static /* synthetic */ void cfr_renamed_8832(boolean arg0, sprrmh arg1, spreeh arg2, sprdgh arg3) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        spreeh spreeh2 = arg2;
        int[] nArray4 = spreeh2.cfr_renamed_3;
        int[] nArray5 = spreeh2.cfr_renamed_1;
        int[] nArray6 = arg3.cfr_renamed_4;
        int[] nArray7 = spreeh2.cfr_renamed_0;
        int[] nArray8 = spreeh2.cfr_renamed_2;
        int[] nArray9 = nArray4;
        int[] nArray10 = nArray5;
        int[] nArray11 = spreeh2.cfr_renamed_4;
        if (arg0) {
            nArray3 = nArray5;
            nArray2 = nArray4;
            nArray = nArray3;
        } else {
            nArray3 = nArray4;
            nArray2 = nArray5;
            nArray = nArray3;
        }
        int[] nArray12 = nArray;
        int[] nArray13 = nArray2;
        sprrmh sprrmh2 = arg1;
        spreeh spreeh3 = arg2;
        sprfmh.cfr_renamed_8838(spreeh3.cfr_renamed_1, spreeh3.cfr_renamed_3, nArray5, nArray4);
        sprfmh.cfr_renamed_1636(nArray3, sprrmh2.cfr_renamed_1, nArray3);
        sprfmh.cfr_renamed_1636(nArray2, sprrmh2.cfr_renamed_2, nArray2);
        spreeh spreeh4 = arg2;
        sprfmh.cfr_renamed_1636(spreeh4.cfr_renamed_2, arg2.cfr_renamed_4, nArray6);
        sprfmh.cfr_renamed_1636(nArray6, arg1.cfr_renamed_4, nArray6);
        sprfmh.cfr_renamed_1636(spreeh4.cfr_renamed_0, arg1.cfr_renamed_3, nArray7);
        sprfmh.cfr_renamed_8838(nArray5, nArray4, nArray11, nArray8);
        sprfmh.cfr_renamed_8838(nArray7, nArray6, nArray13, nArray12);
        sprfmh.cfr_renamed_1636(nArray9, nArray10, arg2.cfr_renamed_0);
        sprfmh.cfr_renamed_1636(nArray9, nArray8, arg2.cfr_renamed_3);
        sprfmh.cfr_renamed_1636(nArray10, nArray11, arg2.cfr_renamed_1);
    }

    public static void cfr_renamed_8855(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        byte[] byArray = null;
        byte by = 0;
        sprjrh.cfr_renamed_8790(arg0, arg1, byArray, by, arg2, arg3, arg4, arg5, arg6);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_8849(sprxfh sprxfh2, sprrmh sprrmh2) {
        void arg1;
        sprxfh arg0;
        sprxfh sprxfh3 = sprxfh2;
        sprxfh sprxfh4 = arg0;
        void v2 = arg1;
        sprfmh.cfr_renamed_8838(sprxfh3.cfr_renamed_2, sprxfh4.cfr_renamed_1, v2.cfr_renamed_2, v2.cfr_renamed_1);
        sprfmh.cfr_renamed_1636(sprxfh3.cfr_renamed_3, cfr_renamed_112, arg1.cfr_renamed_4);
        sprfmh.cfr_renamed_1654(sprxfh4.cfr_renamed_4, arg0.cfr_renamed_4, arg1.cfr_renamed_3);
    }

    private static /* synthetic */ void cfr_renamed_8825(sprgf arg0, byte[] arg1, byte[] arg2, byte[] arg3, int arg4, byte[] arg5, byte arg6, byte[] arg7, int arg8, int arg9, byte[] arg10, int arg11) {
        if (arg5 != null) {
            sprjrh.cfr_renamed_8844(arg0, arg6, arg5);
        }
        sprgf sprgf2 = arg0;
        sprgf2.cfr_renamed_1197(arg1, 32, 32);
        sprgf2.cfr_renamed_1197(arg7, arg8, arg9);
        arg0.cfr_renamed_1219(arg1, 0);
        byte[] byArray = sprndh.cfr_renamed_8721(arg1);
        byte[] byArray2 = new byte[32];
        sprjrh.cfr_renamed_8738(byArray, byArray2, 0);
        if (arg5 != null) {
            sprjrh.cfr_renamed_8844(arg0, arg6, arg5);
        }
        sprgf sprgf3 = arg0;
        arg0.cfr_renamed_1197(byArray2, 0, 32);
        sprgf3.cfr_renamed_1197(arg3, arg4, 32);
        sprgf3.cfr_renamed_1197(arg7, arg8, arg9);
        arg0.cfr_renamed_1219(arg1, 0);
        byte[] byArray3 = sprndh.cfr_renamed_8721(arg1);
        byte[] byArray4 = sprjrh.cfr_renamed_8741(byArray, byArray3, arg2);
        System.arraycopy(byArray2, 0, arg10, arg11, 32);
        System.arraycopy(byArray4, 0, arg10, arg11 + 32, 32);
    }

    private static /* synthetic */ void cfr_renamed_8737(byte[] arg0, int arg1, byte[] arg2) {
        System.arraycopy(arg0, arg1, arg2, 0, 32);
        byte[] byArray = arg2;
        byte[] byArray2 = arg2;
        byte[] byArray3 = arg2;
        byArray[0] = (byte)(byArray[0] & 0xF8);
        byArray2[31] = (byte)(byArray2[31] & 0x7F);
        byArray3[31] = (byte)(byArray3[31] | 0x40);
    }

    public static sprflh cfr_renamed_8801(byte[] arg0, int arg1) {
        byte[] byArray = sprjrh.cfr_renamed_8755(arg0, arg1, 32);
        if (!sprjrh.cfr_renamed_8739(byArray)) {
            return null;
        }
        sprfgh sprfgh2 = new sprfgh(null);
        if (!sprjrh.cfr_renamed_8826(byArray, false, sprfgh2)) {
            return null;
        }
        if (!sprjrh.cfr_renamed_8827(sprfgh2)) {
            return null;
        }
        return sprjrh.cfr_renamed_8843(sprfgh2);
    }

    public static void cfr_renamed_8856(byte[] arg0, int arg1, byte[] arg2, sprgf arg3, byte[] arg4, int arg5) {
        byte[] byArray = new byte[64];
        if (64 != arg3.cfr_renamed_1219(byArray, 0)) {
            throw new IllegalArgumentException("ph");
        }
        byte by = 1;
        sprjrh.cfr_renamed_8790(arg0, arg1, arg2, by, byArray, 0, byArray.length, arg4, arg5);
    }

    private static /* synthetic */ boolean cfr_renamed_8846(spreeh arg0) {
        spreeh spreeh2 = arg0;
        sprfmh.cfr_renamed_8746(spreeh2.cfr_renamed_3);
        sprfmh.cfr_renamed_8746(spreeh2.cfr_renamed_1);
        sprfmh.cfr_renamed_8746(spreeh2.cfr_renamed_0);
        if (sprfmh.cfr_renamed_8761(spreeh2.cfr_renamed_3)) {
            spreeh spreeh3 = arg0;
            if (sprfmh.cfr_renamed_8812(spreeh3.cfr_renamed_1, spreeh3.cfr_renamed_0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean cfr_renamed_8754(byte[] arg0, int arg1) {
        byte[] byArray = sprjrh.cfr_renamed_8755(arg0, arg1, 32);
        if (!sprjrh.cfr_renamed_8739(byArray)) {
            return false;
        }
        sprfgh sprfgh2 = new sprfgh(null);
        return sprjrh.cfr_renamed_8826(byArray, false, sprfgh2);
    }

    public static void cfr_renamed_8857(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        byte[] byArray = null;
        byte by = 0;
        sprjrh.cfr_renamed_8779(arg0, arg1, arg2, arg3, byArray, by, arg4, arg5, arg6, arg7, arg8);
    }

    private static /* synthetic */ void cfr_renamed_8844(sprgf arg0, byte arg1, byte[] arg2) {
        int n = cfr_renamed_102.length;
        byte[] byArray = new byte[n + 2 + arg2.length];
        System.arraycopy(cfr_renamed_102, 0, byArray, 0, n);
        byArray[n] = arg1;
        byArray[n + 1] = (byte)arg2.length;
        System.arraycopy(arg2, 0, byArray, n + 2, arg2.length);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
    }

    private static /* synthetic */ void cfr_renamed_8858(boolean arg0, spramh arg1, spreeh arg2, sprdgh arg3) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        spreeh spreeh2 = arg2;
        int[] nArray4 = spreeh2.cfr_renamed_3;
        int[] nArray5 = spreeh2.cfr_renamed_1;
        int[] nArray6 = arg3.cfr_renamed_4;
        int[] nArray7 = spreeh2.cfr_renamed_2;
        int[] nArray8 = nArray4;
        int[] nArray9 = nArray5;
        int[] nArray10 = spreeh2.cfr_renamed_4;
        if (arg0) {
            nArray3 = nArray5;
            nArray2 = nArray4;
            nArray = nArray3;
        } else {
            nArray3 = nArray4;
            nArray2 = nArray5;
            nArray = nArray3;
        }
        int[] nArray11 = nArray;
        int[] nArray12 = nArray2;
        spramh spramh2 = arg1;
        spreeh spreeh3 = arg2;
        sprfmh.cfr_renamed_8838(spreeh3.cfr_renamed_1, spreeh3.cfr_renamed_3, nArray5, nArray4);
        sprfmh.cfr_renamed_1636(nArray3, spramh2.cfr_renamed_2, nArray3);
        sprfmh.cfr_renamed_1636(nArray2, spramh2.cfr_renamed_4, nArray2);
        spreeh spreeh4 = arg2;
        sprfmh.cfr_renamed_1636(spreeh4.cfr_renamed_2, spreeh4.cfr_renamed_4, nArray6);
        sprfmh.cfr_renamed_1636(nArray6, arg1.cfr_renamed_3, nArray6);
        sprfmh.cfr_renamed_8838(nArray5, nArray4, nArray10, nArray7);
        sprfmh.cfr_renamed_8838(arg2.cfr_renamed_0, nArray6, nArray12, nArray11);
        sprfmh.cfr_renamed_1636(nArray8, nArray9, arg2.cfr_renamed_0);
        sprfmh.cfr_renamed_1636(nArray8, nArray7, arg2.cfr_renamed_3);
        sprfmh.cfr_renamed_1636(nArray9, nArray10, arg2.cfr_renamed_1);
    }

    private static /* synthetic */ void cfr_renamed_8845(int[] arg0, int[] arg1, sprfgh arg2, int[] arg3, sprfgh arg4, spreeh arg5) {
        sprjrh.cfr_renamed_8775();
        byte[] byArray = new byte[256];
        byte[] byArray2 = new byte[128];
        byte[] byArray3 = new byte[128];
        sprlnh.cfr_renamed_8711(arg0, 6, byArray);
        sprlnh.cfr_renamed_8711(arg1, 4, byArray2);
        sprlnh.cfr_renamed_8711(arg3, 4, byArray3);
        int n = 4;
        sprrmh[] sprrmhArray = new sprrmh[4];
        sprrmh[] sprrmhArray2 = new sprrmh[n];
        sprdgh sprdgh2 = new sprdgh(null);
        sprjrh.cfr_renamed_8830(arg2, sprrmhArray, n, sprdgh2);
        sprjrh.cfr_renamed_8830(arg4, sprrmhArray2, n, sprdgh2);
        sprjrh.cfr_renamed_8831(arg5);
        int n2 = 128;
        while (--n2 >= 0) {
            int n3;
            int n4;
            int n5;
            byte by = byArray[n2];
            if (by != 0) {
                n5 = by >> 1 ^ by >> 31;
                sprjrh.cfr_renamed_8858(by < 0, cfr_renamed_107[n5], arg5, sprdgh2);
            }
            if ((n5 = byArray[128 + n2]) != 0) {
                n4 = n5 >> 1 ^ n5 >> 31;
                sprjrh.cfr_renamed_8858(n5 < 0, cfr_renamed_126[n4], arg5, sprdgh2);
            }
            if ((n4 = byArray2[n2]) != 0) {
                sprrmh[] sprrmhArray3;
                boolean bl;
                n3 = n4 >> 1 ^ n4 >> 31;
                if (n4 < 0) {
                    bl = true;
                    sprrmhArray3 = sprrmhArray;
                } else {
                    bl = false;
                    sprrmhArray3 = sprrmhArray;
                }
                sprjrh.cfr_renamed_8832(bl, sprrmhArray3[n3], arg5, sprdgh2);
            }
            if ((n3 = byArray3[n2]) != 0) {
                sprrmh[] sprrmhArray4;
                boolean bl;
                int n6 = n3 >> 1 ^ n3 >> 31;
                if (n3 < 0) {
                    bl = true;
                    sprrmhArray4 = sprrmhArray2;
                } else {
                    bl = false;
                    sprrmhArray4 = sprrmhArray2;
                }
                sprjrh.cfr_renamed_8832(bl, sprrmhArray4[n6], arg5, sprdgh2);
            }
            sprjrh.cfr_renamed_8833(arg5);
        }
        spreeh spreeh2 = arg5;
        sprjrh.cfr_renamed_8833(spreeh2);
        sprjrh.cfr_renamed_8833(spreeh2);
    }

    private static /* synthetic */ void cfr_renamed_8853(int arg0, int arg1, spramh arg2) {
        int n;
        int n2 = arg0 * 8 * 3 * 10;
        int n3 = n = 0;
        while (n3 < 8) {
            int n4 = (n ^ arg1) - 1 >> 31;
            int n5 = n2;
            sprfmh.cfr_renamed_8734(n4, cfr_renamed_93, n5, arg2.cfr_renamed_2, 0);
            sprfmh.cfr_renamed_8734(n4, cfr_renamed_93, n2 += 10, arg2.cfr_renamed_4, 0);
            int n6 = n2 += 10;
            n2 += 10;
            sprfmh.cfr_renamed_8734(n4, cfr_renamed_93, n6, arg2.cfr_renamed_3, 0);
            n3 = ++n;
        }
    }

    static {
        byte[] byArray = new byte[32];
        byArray[0] = 83;
        byArray[1] = 105;
        byArray[2] = 103;
        byArray[3] = 69;
        byArray[4] = 100;
        byArray[5] = 50;
        byArray[6] = 53;
        byArray[7] = 53;
        byArray[8] = 49;
        byArray[9] = 57;
        byArray[10] = 32;
        byArray[11] = 110;
        byArray[12] = 111;
        byArray[13] = 32;
        byArray[14] = 69;
        byArray[15] = 100;
        byArray[16] = 50;
        byArray[17] = 53;
        byArray[18] = 53;
        byArray[19] = 49;
        byArray[20] = 57;
        byArray[21] = 32;
        byArray[22] = 99;
        byArray[23] = 111;
        byArray[24] = 108;
        byArray[25] = 108;
        byArray[26] = 105;
        byArray[27] = 115;
        byArray[28] = 105;
        byArray[29] = 111;
        byArray[30] = 110;
        byArray[31] = 115;
        cfr_renamed_102 = byArray;
        int[] nArray = new int[8];
        nArray[0] = -19;
        nArray[1] = -1;
        nArray[2] = -1;
        nArray[3] = -1;
        nArray[4] = -1;
        nArray[5] = -1;
        nArray[6] = -1;
        nArray[7] = Integer.MAX_VALUE;
        cfr_renamed_31 = nArray;
        int[] nArray2 = new int[8];
        nArray2[0] = 1886001095;
        nArray2[1] = 1339575613;
        nArray2[2] = 1980447930;
        nArray2[3] = 258412557;
        nArray2[4] = -95215574;
        nArray2[5] = -959694548;
        nArray2[6] = 2013120334;
        nArray2[7] = 2047061138;
        cfr_renamed_724 = nArray2;
        int[] nArray3 = new int[8];
        nArray3[0] = -1886001114;
        nArray3[1] = -1339575614;
        nArray3[2] = -1980447931;
        nArray3[3] = -258412558;
        nArray3[4] = 95215573;
        nArray3[5] = 959694547;
        nArray3[6] = -2013120335;
        nArray3[7] = 100422509;
        cfr_renamed_2 = nArray3;
        int[] nArray4 = new int[10];
        nArray4[0] = 52811034;
        nArray4[1] = 25909283;
        nArray4[2] = 8072341;
        nArray4[3] = 50637101;
        nArray4[4] = 13785486;
        nArray4[5] = 30858332;
        nArray4[6] = 20483199;
        nArray4[7] = 20966410;
        nArray4[8] = 43936626;
        nArray4[9] = 4379245;
        cfr_renamed_82 = nArray4;
        int[] nArray5 = new int[10];
        nArray5[0] = 40265304;
        nArray5[1] = 0x1999999;
        nArray5[2] = 0x666666;
        nArray5[3] = 0x3333333;
        nArray5[4] = 0xCCCCCC;
        nArray5[5] = 0x2666666;
        nArray5[6] = 0x1999999;
        nArray5[7] = 0x666666;
        nArray5[8] = 0x3333333;
        nArray5[9] = 0xCCCCCC;
        cfr_renamed_132 = nArray5;
        int[] nArray6 = new int[10];
        nArray6[0] = 12052516;
        nArray6[1] = 1174424;
        nArray6[2] = 4087752;
        nArray6[3] = 38672185;
        nArray6[4] = 20040971;
        nArray6[5] = 21899680;
        nArray6[6] = 55468344;
        nArray6[7] = 20105554;
        nArray6[8] = 66708015;
        nArray6[9] = 9981791;
        cfr_renamed_953 = nArray6;
        int[] nArray7 = new int[10];
        nArray7[0] = 66430571;
        nArray7[1] = 45040722;
        nArray7[2] = 4842939;
        nArray7[3] = 15895846;
        nArray7[4] = 18981244;
        nArray7[5] = 46308410;
        nArray7[6] = 4697481;
        nArray7[7] = 8903007;
        nArray7[8] = 53646190;
        nArray7[9] = 12474675;
        cfr_renamed_114 = nArray7;
        int[] nArray8 = new int[10];
        nArray8[0] = 56195235;
        nArray8[1] = 47411844;
        nArray8[2] = 25868126;
        nArray8[3] = 40503822;
        nArray8[4] = 57364;
        nArray8[5] = 58321048;
        nArray8[6] = 30416477;
        nArray8[7] = 31930572;
        nArray8[8] = 57760639;
        nArray8[9] = 10749657;
        cfr_renamed_4 = nArray8;
        int[] nArray9 = new int[10];
        nArray9[0] = 45281625;
        nArray9[1] = 27714825;
        nArray9[2] = 18181821;
        nArray9[3] = 0xD4141D;
        nArray9[4] = 114729;
        nArray9[5] = 49533232;
        nArray9[6] = 60832955;
        nArray9[7] = 30306712;
        nArray9[8] = 48412415;
        nArray9[9] = 4722099;
        cfr_renamed_112 = nArray9;
        int[] nArray10 = new int[10];
        nArray10[0] = 23454386;
        nArray10[1] = 55429651;
        nArray10[2] = 2809210;
        nArray10[3] = 27797563;
        nArray10[4] = 229458;
        nArray10[5] = 31957600;
        nArray10[6] = 54557047;
        nArray10[7] = 27058993;
        nArray10[8] = 29715967;
        nArray10[9] = 9444199;
        cfr_renamed_79 = nArray10;
        cfr_renamed_152 = new Object();
        cfr_renamed_107 = null;
        cfr_renamed_126 = null;
        cfr_renamed_93 = null;
    }

    public static boolean cfr_renamed_8859(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, sprgf arg5) {
        byte[] byArray = new byte[64];
        if (64 != arg5.cfr_renamed_1219(byArray, 0)) {
            throw new IllegalArgumentException("ph");
        }
        byte by = 1;
        return sprjrh.cfr_renamed_8740(arg0, arg1, arg2, arg3, arg4, by, byArray, 0, byArray.length);
    }

    public static sprgf cfr_renamed_8769() {
        return sprjrh.cfr_renamed_8824();
    }

    public static void cfr_renamed_8735(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        sprgf sprgf2 = sprjrh.cfr_renamed_8824();
        byte[] byArray = new byte[64];
        sprgf sprgf3 = sprgf2;
        sprgf3.cfr_renamed_1197(arg0, arg1, 32);
        sprgf3.cfr_renamed_1219(byArray, 0);
        byte[] byArray2 = new byte[32];
        sprjrh.cfr_renamed_8737(byArray, 0, byArray2);
        sprjrh.cfr_renamed_8738(byArray2, arg2, arg3);
    }

    private static /* synthetic */ void cfr_renamed_8830(sprfgh arg0, sprrmh[] arg1, int arg2, sprdgh arg3) {
        sprxfh sprxfh2 = new sprxfh(null);
        sprjrh.cfr_renamed_8840(arg0, sprxfh2);
        sprxfh sprxfh3 = new sprxfh(null);
        sprrmh[] sprrmhArray = arg1;
        sprxfh sprxfh4 = sprxfh2;
        sprjrh.cfr_renamed_8837(sprxfh4, sprxfh4, sprxfh3, arg3);
        int n = 0;
        while (true) {
            int n2 = n;
            sprrmh sprrmh2 = new sprrmh(null);
            sprrmhArray[n] = sprrmh2;
            sprrmh sprrmh3 = sprrmh2;
            sprjrh.cfr_renamed_8849(sprxfh2, sprrmh3);
            if (++n == arg2) {
                return;
            }
            sprjrh.cfr_renamed_8837(sprxfh2, sprxfh3, sprxfh2, arg3);
            sprrmhArray = arg1;
        }
    }

    private static /* synthetic */ void cfr_renamed_8852(int[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            arg0[++n] = sprxlh.cfr_renamed_8597(arg0[n]);
            n2 = n;
        }
    }

    private static /* synthetic */ boolean cfr_renamed_8815(byte[] arg0, int arg1, sprflh arg2, byte[] arg3, byte arg4, byte[] arg5, int arg6, int arg7) {
        if (!sprjrh.cfr_renamed_8823(arg3, arg4)) {
            throw new IllegalArgumentException(sprgbo.cfr_renamed_9("gM|"));
        }
        byte[] byArray = sprjrh.cfr_renamed_8755(arg0, arg1, 32);
        byte[] byArray2 = sprjrh.cfr_renamed_8755(arg0, arg1 + 32, 32);
        if (!sprjrh.cfr_renamed_8768(byArray)) {
            return false;
        }
        int[] nArray = new int[8];
        if (!sprndh.cfr_renamed_8724(byArray2, nArray)) {
            return false;
        }
        sprfgh sprfgh2 = new sprfgh(null);
        if (!sprjrh.cfr_renamed_8826(byArray, true, sprfgh2)) {
            return false;
        }
        sprfgh sprfgh3 = new sprfgh(null);
        sprflh sprflh2 = arg2;
        sprfmh.cfr_renamed_2027(sprflh2.cfr_renamed_4, sprfgh3.cfr_renamed_4);
        sprfmh.cfr_renamed_8546(sprflh2.cfr_renamed_4, 10, sprfgh3.cfr_renamed_3, 0);
        byte[] byArray3 = new byte[32];
        sprjrh.cfr_renamed_8841(sprflh2, byArray3, 0);
        sprgf sprgf2 = sprjrh.cfr_renamed_8824();
        byte[] byArray4 = new byte[64];
        if (arg3 != null) {
            sprjrh.cfr_renamed_8844(sprgf2, arg4, arg3);
        }
        sprgf sprgf3 = sprgf2;
        sprgf2.cfr_renamed_1197(byArray, 0, 32);
        sprgf3.cfr_renamed_1197(byArray3, 0, 32);
        sprgf3.cfr_renamed_1197(arg5, arg6, arg7);
        sprgf2.cfr_renamed_1219(byArray4, 0);
        byte[] byArray5 = sprndh.cfr_renamed_8721(byArray4);
        int[] nArray2 = new int[8];
        sprndh.cfr_renamed_8720(byArray5, nArray2);
        int[] nArray3 = new int[4];
        int[] nArray4 = new int[4];
        sprndh.cfr_renamed_8726(nArray2, nArray3, nArray4);
        int[] nArray5 = nArray;
        sprndh.cfr_renamed_8731(nArray, nArray4, nArray5);
        spreeh spreeh2 = new spreeh(null);
        sprjrh.cfr_renamed_8845(nArray5, nArray3, sprfgh3, nArray4, sprfgh2, spreeh2);
        return sprjrh.cfr_renamed_8846(spreeh2);
    }

    public static boolean cfr_renamed_8860(byte[] arg0, int arg1, sprflh arg2, byte[] arg3, sprgf arg4) {
        byte[] byArray = new byte[64];
        if (64 != arg4.cfr_renamed_1219(byArray, 0)) {
            throw new IllegalArgumentException("ph");
        }
        byte by = 1;
        return sprjrh.cfr_renamed_8815(arg0, arg1, arg2, arg3, by, byArray, 0, byArray.length);
    }

    public static void cfr_renamed_8861(sprxuh arg0, byte[] arg1, int arg2, int[] arg3, int[] arg4) {
        if (null == arg0) {
            throw new NullPointerException(sprrdaa.cfr_renamed_9("_#b8+&n?c$okb8+$e'rkm$yk~8nki2+\u00139~>z2"));
        }
        byte[] byArray = new byte[32];
        sprjrh.cfr_renamed_8737(arg1, arg2, byArray);
        spreeh spreeh2 = new spreeh(null);
        sprjrh.cfr_renamed_8828(byArray, spreeh2);
        if (0 == sprjrh.cfr_renamed_8816(spreeh2)) {
            throw new IllegalStateException();
        }
        spreeh spreeh3 = spreeh2;
        sprfmh.cfr_renamed_8546(spreeh3.cfr_renamed_1, 0, arg3, 0);
        sprfmh.cfr_renamed_8546(spreeh3.cfr_renamed_0, 0, arg4, 0);
    }

    private static /* synthetic */ void cfr_renamed_8862(byte[] arg0, sprfgh arg1, spreeh arg2) {
        int[] nArray = new int[8];
        sprndh.cfr_renamed_8720(arg0, nArray);
        sprndh.cfr_renamed_8723(256, nArray, nArray);
        sprrmh sprrmh2 = new sprrmh(null);
        sprdgh sprdgh2 = new sprdgh(null);
        int[] nArray2 = sprjrh.cfr_renamed_8848(arg1, 8, sprdgh2);
        sprjrh.cfr_renamed_8831(arg2);
        int n = 63;
        block0: while (true) {
            int n2;
            sprjrh.cfr_renamed_8850(nArray, n, nArray2, sprrmh2);
            sprjrh.cfr_renamed_8842(sprrmh2, arg2, sprdgh2);
            if (--n < 0) {
                return;
            }
            int n3 = n2 = 0;
            while (true) {
                if (n3 >= 4) continue block0;
                sprjrh.cfr_renamed_8833(arg2);
                n3 = ++n2;
            }
            break;
        }
    }

    public static void cfr_renamed_8794(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        byte by = 1;
        sprjrh.cfr_renamed_8779(arg0, arg1, arg2, arg3, arg4, by, arg5, arg6, 64, arg7, arg8);
    }

    private static /* synthetic */ int cfr_renamed_8766(int[] arg0, int arg1) {
        int n = arg1 >>> 3;
        int n2 = (arg1 & 7) << 2;
        return arg0[n] >>> n2 & 0xF;
    }

    public static sprflh cfr_renamed_8804(byte[] arg0, int arg1) {
        sprgf sprgf2 = sprjrh.cfr_renamed_8824();
        byte[] byArray = new byte[64];
        sprgf sprgf3 = sprgf2;
        sprgf3.cfr_renamed_1197(arg0, arg1, 32);
        sprgf3.cfr_renamed_1219(byArray, 0);
        byte[] byArray2 = new byte[32];
        sprjrh.cfr_renamed_8737(byArray, 0, byArray2);
        spreeh spreeh2 = new spreeh(null);
        sprjrh.cfr_renamed_8828(byArray2, spreeh2);
        sprfgh sprfgh2 = new sprfgh(null);
        sprjrh.cfr_renamed_8818(spreeh2, sprfgh2);
        if (0 == sprjrh.cfr_renamed_8819(sprfgh2)) {
            throw new IllegalStateException();
        }
        return sprjrh.cfr_renamed_8843(sprfgh2);
    }

    private static /* synthetic */ boolean cfr_renamed_8739(byte[] arg0) {
        int n;
        boolean bl;
        int n2;
        int n3;
        int n4 = n3 = sprpuh.cfr_renamed_8727(arg0, 28) & Integer.MAX_VALUE;
        int n5 = n3 ^ cfr_renamed_31[7];
        int n6 = n3 ^ cfr_renamed_724[7];
        int n7 = n3 ^ cfr_renamed_2[7];
        int n8 = n2 = 6;
        while (n8 > 0) {
            int n9 = sprpuh.cfr_renamed_8727(arg0, n2 * 4);
            n4 |= n9;
            n5 |= n9 ^ cfr_renamed_31[n2];
            n6 |= n9 ^ cfr_renamed_724[n2];
            int n10 = cfr_renamed_2[n2];
            n7 |= n9 ^ n10;
            n8 = --n2;
        }
        n2 = sprpuh.cfr_renamed_8727(arg0, 0);
        if (n4 == 0 && n2 + Integer.MIN_VALUE <= -2147483647) {
            return false;
        }
        if (n5 == 0 && n2 + Integer.MIN_VALUE >= cfr_renamed_31[0] - 1 + Integer.MIN_VALUE) {
            return false;
        }
        n7 |= n2 ^ cfr_renamed_2[0];
        if ((n6 |= n2 ^ cfr_renamed_724[0]) != 0) {
            bl = true;
            n = n7;
        } else {
            bl = false;
            n = n7;
        }
        return bl & n != 0;
    }

    public static void cfr_renamed_8806(byte[] arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        byte by = 0;
        sprjrh.cfr_renamed_8790(arg0, arg1, arg2, by, arg3, arg4, arg5, arg6, arg7);
    }

    private static /* synthetic */ int cfr_renamed_8819(sprfgh arg0) {
        int[] nArray = sprfmh.cfr_renamed_1631();
        int[] nArray2 = sprfmh.cfr_renamed_1631();
        int[] nArray3 = sprfmh.cfr_renamed_1631();
        sprfgh sprfgh2 = arg0;
        sprfmh.cfr_renamed_8743(sprfgh2.cfr_renamed_4, nArray2);
        sprfmh.cfr_renamed_8743(sprfgh2.cfr_renamed_3, nArray3);
        sprfmh.cfr_renamed_1636(nArray2, nArray3, nArray);
        sprfmh.cfr_renamed_1641(nArray3, nArray2, nArray3);
        sprfmh.cfr_renamed_1636(nArray, cfr_renamed_4, nArray);
        sprfmh.cfr_renamed_8759(nArray);
        sprfmh.cfr_renamed_1641(nArray, nArray3, nArray);
        sprfmh.cfr_renamed_8746(nArray);
        return sprfmh.cfr_renamed_1660(nArray);
    }

    private static /* synthetic */ boolean cfr_renamed_8768(byte[] arg0) {
        int[] nArray;
        if ((sprpuh.cfr_renamed_8727(arg0, 28) & Integer.MAX_VALUE) < cfr_renamed_31[7]) {
            return true;
        }
        int[] nArray2 = nArray = new int[8];
        sprpuh.cfr_renamed_8722(arg0, 0, nArray2, 0, 8);
        nArray2[7] = nArray2[7] & Integer.MAX_VALUE;
        return !sprmeh.cfr_renamed_1649(nArray, cfr_renamed_31);
    }
}

