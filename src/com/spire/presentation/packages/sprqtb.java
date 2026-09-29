/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraie;
import com.spire.presentation.packages.sprdkb;
import com.spire.presentation.packages.sprekb;
import com.spire.presentation.packages.sprfpb;
import com.spire.presentation.packages.sprktb;
import com.spire.presentation.packages.sprlxg;
import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprrlb;
import java.math.BigInteger;

public class sprqtb {
    public static final byte[][] cfr_renamed_152;
    private static final BigInteger cfr_renamed_112;
    private static final BigInteger cfr_renamed_119;
    public static final byte[][] cfr_renamed_91;
    public static final sprfpb[] cfr_renamed_0;
    private static final BigInteger cfr_renamed_1;
    public static final byte cfr_renamed_2 = 16;
    public static final byte cfr_renamed_3 = 4;
    public static final sprfpb[] cfr_renamed_4;

    public static int cfr_renamed_1839(BigInteger arg0) {
        if (arg0 != null) {
            if (arg0.equals(sprpb.cfr_renamed_4)) {
                return 1;
            }
            if (arg0.equals(sprpb.cfr_renamed_2)) {
                return 2;
            }
        }
        throw new IllegalArgumentException(sprlxg.cfr_renamed_9("(\u001ahy/\\!Y4U2\u0013`W5I4\u001a\"_`\b`U2\u001at"));
    }

    public static byte cfr_renamed_1840(sprktb arg0) {
        if (!arg0.cfr_renamed_1841()) {
            throw new IllegalArgumentException(spraie.cfr_renamed_9("\u0015%{\u00014(7#/0{).8-/{b\u001a\b\u0018cwj\u000f\u0004\u001a\f{'.&/#+&2):>2%5j5%/j+%(92(7/"));
        }
        if (arg0.cfr_renamed_1778().cfr_renamed_805()) {
            return -1;
        }
        return 1;
    }

    public static BigInteger[] cfr_renamed_1842(sprktb arg0) {
        if (!arg0.cfr_renamed_1841()) {
            throw new IllegalArgumentException(sprlxg.cfr_renamed_9("3S`S3\u001a$_&S._$\u001a&U2\u001a\u000bU\"V)N:\u001a#O2L%I`U.V9"));
        }
        sprktb sprktb2 = arg0;
        int n = sprktb2.cfr_renamed_1186();
        int n2 = sprktb2.cfr_renamed_1778().cfr_renamed_1779().intValue();
        byte by = sprktb2.cfr_renamed_1780();
        int n3 = sprqtb.cfr_renamed_1839(sprktb2.cfr_renamed_1843());
        int n4 = n + 3 - n2;
        BigInteger[] bigIntegerArray = sprqtb.cfr_renamed_1844(by, n4, false);
        if (by == 1) {
            bigIntegerArray[0] = bigIntegerArray[0].negate();
            bigIntegerArray[1] = bigIntegerArray[1].negate();
        }
        BigInteger bigInteger = sprpb.cfr_renamed_0.add(bigIntegerArray[1]).shiftRight(n3);
        BigInteger bigInteger2 = sprpb.cfr_renamed_0.add(bigIntegerArray[0]).shiftRight(n3).negate();
        BigInteger[] bigIntegerArray2 = new BigInteger[2];
        bigIntegerArray2[0] = bigInteger;
        bigIntegerArray2[1] = bigInteger2;
        return bigIntegerArray2;
    }

    public static sprdkb cfr_renamed_1845(sprdkb arg0, BigInteger arg1) {
        sprktb sprktb2 = (sprktb)arg0.cfr_renamed_1769();
        int n = sprktb2.cfr_renamed_1186();
        byte by = (byte)sprktb2.cfr_renamed_1778().cfr_renamed_1779().intValue();
        byte by2 = sprktb2.cfr_renamed_1780();
        BigInteger[] bigIntegerArray = sprktb2.cfr_renamed_1781();
        sprfpb sprfpb2 = sprqtb.cfr_renamed_1782(arg1, n, by, bigIntegerArray, by2, (byte)10);
        return sprqtb.cfr_renamed_1846(arg0, sprfpb2);
    }

    public static sprekb cfr_renamed_1384(byte arg0, sprekb arg1, sprekb arg2) {
        sprekb sprekb2 = arg1;
        sprekb sprekb3 = sprekb2.cfr_renamed_1847(sprekb2);
        sprekb sprekb4 = sprekb2.cfr_renamed_1847(arg2);
        sprekb sprekb5 = arg2;
        sprekb sprekb6 = sprekb5.cfr_renamed_1847(sprekb5).cfr_renamed_979(1);
        if (arg0 == 1) {
            sprekb sprekb7 = sprekb3.cfr_renamed_1848(sprekb4).cfr_renamed_1848(sprekb6);
            return sprekb7;
        }
        if (arg0 == -1) {
            sprekb sprekb8 = sprekb3.cfr_renamed_1849(sprekb4).cfr_renamed_1848(sprekb6);
            return sprekb8;
        }
        throw new IllegalArgumentException(spraie.cfr_renamed_9("6?{'.9/j9/{{{%)jv{"));
    }

    /*
     * WARNING - void declaration
     */
    public static sprfpb cfr_renamed_1850(sprekb sprekb2, sprekb sprekb3, byte by) {
        BigInteger bigInteger;
        sprekb sprekb4;
        sprekb sprekb5;
        sprekb sprekb6;
        sprekb sprekb7;
        void arg1;
        void arg2;
        sprekb arg0;
        int n = arg0.cfr_renamed_1851();
        if (sprekb3.cfr_renamed_1851() != n) {
            throw new IllegalArgumentException(sprlxg.cfr_renamed_9("V!W\"^!\n`[.^`V!W\"^!\u000b`^/\u001a.U4\u001a([6_`I!W%\u001a3Y!V%"));
        }
        if (arg2 != true && arg2 != -1) {
            throw new IllegalArgumentException(spraie.cfr_renamed_9("6?{'.9/j9/{{{%)jv{"));
        }
        sprekb sprekb8 = arg0;
        BigInteger bigInteger2 = sprekb8.cfr_renamed_802();
        BigInteger bigInteger3 = arg1.cfr_renamed_802();
        sprekb sprekb9 = sprekb8.cfr_renamed_1852(bigInteger2);
        sprekb sprekb10 = arg1.cfr_renamed_1852(bigInteger3);
        sprekb sprekb11 = sprekb9;
        sprekb sprekb12 = sprekb11.cfr_renamed_1848(sprekb11);
        if (arg2 == true) {
            sprekb12 = sprekb12.cfr_renamed_1848(sprekb10);
            sprekb7 = sprekb10;
        } else {
            sprekb12 = sprekb12.cfr_renamed_1849(sprekb10);
            sprekb7 = sprekb10;
        }
        sprekb sprekb13 = sprekb7.cfr_renamed_1848(sprekb10).cfr_renamed_1848(sprekb10);
        sprekb sprekb14 = sprekb13.cfr_renamed_1848(sprekb10);
        if (arg2 == true) {
            sprekb sprekb15 = sprekb9;
            sprekb6 = sprekb15.cfr_renamed_1849(sprekb13);
            sprekb5 = sprekb15.cfr_renamed_1848(sprekb14);
        } else {
            sprekb sprekb16 = sprekb9;
            sprekb6 = sprekb16.cfr_renamed_1848(sprekb13);
            sprekb5 = sprekb16.cfr_renamed_1849(sprekb14);
        }
        int n2 = 0;
        byte by2 = 0;
        if (sprekb12.cfr_renamed_1853(sprpb.cfr_renamed_0) >= 0) {
            if (sprekb6.cfr_renamed_1853(cfr_renamed_112) < 0) {
                by2 = arg2;
                sprekb4 = sprekb12;
            } else {
                n2 = 1;
                sprekb4 = sprekb12;
            }
        } else {
            if (sprekb5.cfr_renamed_1853(sprpb.cfr_renamed_4) >= 0) {
                by2 = arg2;
            }
            sprekb4 = sprekb12;
        }
        if (sprekb4.cfr_renamed_1853(cfr_renamed_112) < 0) {
            if (sprekb6.cfr_renamed_1853(sprpb.cfr_renamed_0) >= 0) {
                by2 = (byte)(-arg2);
                bigInteger = bigInteger2;
            } else {
                n2 = -1;
                bigInteger = bigInteger2;
            }
        } else {
            if (sprekb5.cfr_renamed_1853(cfr_renamed_1) < 0) {
                by2 = (byte)(-arg2);
            }
            bigInteger = bigInteger2;
        }
        BigInteger bigInteger4 = bigInteger.add(BigInteger.valueOf(n2));
        BigInteger bigInteger5 = bigInteger3.add(BigInteger.valueOf(by2));
        return new sprfpb(bigInteger4, bigInteger5);
    }

    public static byte[] cfr_renamed_1854(byte arg0, sprfpb arg1) {
        Object object;
        if (arg0 != 1 && arg0 != -1) {
            throw new IllegalArgumentException(sprlxg.cfr_renamed_9("W5\u001a-O3N`X%\u001aq\u001a/H`\u0017q"));
        }
        int n = sprqtb.cfr_renamed_1855(arg0, arg1).bitLength();
        int n2 = n > 30 ? n + 4 : 34;
        byte[] byArray = new byte[n2];
        int n3 = 0;
        int n4 = 0;
        sprfpb sprfpb2 = arg1;
        BigInteger bigInteger = sprfpb2.cfr_renamed_3;
        BigInteger bigInteger2 = sprfpb2.cfr_renamed_4;
        BigInteger bigInteger3 = bigInteger;
        while (!bigInteger3.equals(sprpb.cfr_renamed_1) || !bigInteger2.equals(sprpb.cfr_renamed_1)) {
            Object object2;
            BigInteger bigInteger4;
            if (bigInteger.testBit(0)) {
                int n5;
                byArray[n3] = (byte)sprpb.cfr_renamed_4.subtract(bigInteger.subtract(bigInteger2.shiftLeft(1)).mod(sprpb.cfr_renamed_2)).intValue();
                if (byArray[n3] == 1) {
                    bigInteger = bigInteger.clearBit(0);
                    n5 = n3;
                } else {
                    bigInteger = bigInteger.add(sprpb.cfr_renamed_0);
                    n5 = n3;
                }
                n4 = n5;
                bigInteger4 = bigInteger;
            } else {
                byArray[n3] = 0;
                bigInteger4 = bigInteger;
            }
            object = bigInteger4;
            BigInteger bigInteger5 = bigInteger.shiftRight(1);
            if (arg0 == 1) {
                bigInteger = bigInteger2.add(bigInteger5);
                object2 = object;
            } else {
                bigInteger = bigInteger2.subtract(bigInteger5);
                object2 = object;
            }
            ++n3;
            bigInteger2 = ((BigInteger)object2).shiftRight(1).negate();
            bigInteger3 = bigInteger;
        }
        Object object3 = object = (Object)new byte[++n4];
        System.arraycopy(byArray, 0, object3, 0, n4);
        return object3;
    }

    public static sprfpb cfr_renamed_1782(BigInteger arg0, int arg1, byte arg2, BigInteger[] arg3, byte arg4, byte arg5) {
        byte by;
        BigInteger bigInteger;
        if (arg4 == 1) {
            bigInteger = arg3[0].add(arg3[1]);
            by = arg4;
        } else {
            bigInteger = arg3[0].subtract(arg3[1]);
            by = arg4;
        }
        BigInteger bigInteger2 = sprqtb.cfr_renamed_1844(by, arg1, true)[1];
        BigInteger bigInteger3 = arg0;
        sprekb sprekb2 = sprqtb.cfr_renamed_1856(bigInteger3, arg3[0], bigInteger2, arg2, arg1, arg5);
        sprekb sprekb3 = sprqtb.cfr_renamed_1856(bigInteger3, arg3[1], bigInteger2, arg2, arg1, arg5);
        sprfpb sprfpb2 = sprqtb.cfr_renamed_1850(sprekb2, sprekb3, arg4);
        BigInteger bigInteger4 = bigInteger3.subtract(bigInteger.multiply(sprfpb2.cfr_renamed_3)).subtract(BigInteger.valueOf(2L).multiply(arg3[1]).multiply(sprfpb2.cfr_renamed_4));
        BigInteger bigInteger5 = arg3[1].multiply(sprfpb2.cfr_renamed_3).subtract(arg3[0].multiply(sprfpb2.cfr_renamed_4));
        return new sprfpb(bigInteger4, bigInteger5);
    }

    public static sprdkb[] cfr_renamed_1788(sprdkb arg0, byte arg1) {
        int n;
        byte[][] byArray;
        sprrlb[] sprrlbArray = new sprdkb[16];
        sprrlbArray[1] = arg0;
        int n2 = (arg1 == 0 ? (byArray = cfr_renamed_91) : (byArray = cfr_renamed_152)).length;
        int n3 = n = 3;
        while (n3 < n2) {
            int n4 = n;
            sprrlbArray[n4] = sprqtb.cfr_renamed_1857(arg0, byArray[n]);
            n3 = n4 + 2;
        }
        arg0.cfr_renamed_1769().cfr_renamed_1805(sprrlbArray);
        return sprrlbArray;
    }

    public static sprdkb cfr_renamed_1857(sprdkb arg0, byte[] arg1) {
        int n;
        sprdkb sprdkb2 = (sprdkb)((sprktb)arg0.cfr_renamed_1769()).cfr_renamed_1770();
        int n2 = n = arg1.length - 1;
        while (n2 >= 0) {
            sprdkb2 = sprqtb.cfr_renamed_1790(sprdkb2);
            if (arg1[n] == 1) {
                sprdkb2 = sprdkb2.cfr_renamed_1791(arg0);
            } else if (arg1[n] == -1) {
                sprdkb2 = sprdkb2.cfr_renamed_1792(arg0);
            }
            n2 = --n;
        }
        return sprdkb2;
    }

    public static sprdkb cfr_renamed_1846(sprdkb arg0, sprfpb arg1) {
        byte[] byArray = sprqtb.cfr_renamed_1854(((sprktb)arg0.cfr_renamed_1769()).cfr_renamed_1780(), arg1);
        return sprqtb.cfr_renamed_1857(arg0, byArray);
    }

    public static sprdkb cfr_renamed_1790(sprdkb arg0) {
        return arg0.cfr_renamed_1858();
    }

    public static BigInteger cfr_renamed_1785(byte arg0, int arg1) {
        if (arg1 == 4) {
            if (arg0 == 1) {
                return BigInteger.valueOf(6L);
            }
            return BigInteger.valueOf(10L);
        }
        BigInteger[] bigIntegerArray = sprqtb.cfr_renamed_1844(arg0, arg1, false);
        BigInteger bigInteger = sprpb.cfr_renamed_1.setBit(arg1);
        BigInteger bigInteger2 = bigIntegerArray[1].modInverse(bigInteger);
        return sprpb.cfr_renamed_4.multiply(bigIntegerArray[0]).multiply(bigInteger2).mod(bigInteger);
    }

    public static sprekb cfr_renamed_1856(BigInteger arg0, BigInteger arg1, BigInteger arg2, byte arg3, int arg4, int arg5) {
        int n = (arg4 + 5) / 2 + arg5;
        BigInteger bigInteger = arg0.shiftRight(arg4 - n - 2 + arg3);
        BigInteger bigInteger2 = arg1.multiply(bigInteger);
        BigInteger bigInteger3 = bigInteger2.shiftRight(arg4);
        BigInteger bigInteger4 = bigInteger2.add(arg2.multiply(bigInteger3));
        BigInteger bigInteger5 = bigInteger4.shiftRight(n - arg5);
        if (bigInteger4.testBit(n - arg5 - 1)) {
            bigInteger5 = bigInteger5.add(sprpb.cfr_renamed_0);
        }
        return new sprekb(bigInteger5, arg5);
    }

    public static byte[] cfr_renamed_1786(byte arg0, sprfpb arg1, byte arg2, BigInteger arg3, BigInteger arg4, sprfpb[] arg5) {
        if (arg0 != 1 && arg0 != -1) {
            throw new IllegalArgumentException(spraie.cfr_renamed_9("6?{'.9/j9/{{{%)jv{"));
        }
        int n = sprqtb.cfr_renamed_1855(arg0, arg1).bitLength();
        int n2 = n > 30 ? n + 4 + arg2 : 34 + arg2;
        byte[] byArray = new byte[n2];
        BigInteger bigInteger = arg3.shiftRight(1);
        sprfpb sprfpb2 = arg1;
        BigInteger bigInteger2 = sprfpb2.cfr_renamed_3;
        BigInteger bigInteger3 = sprfpb2.cfr_renamed_4;
        int n3 = 0;
        BigInteger bigInteger4 = bigInteger2;
        while (!bigInteger4.equals(sprpb.cfr_renamed_1) || !bigInteger3.equals(sprpb.cfr_renamed_1)) {
            BigInteger bigInteger5;
            BigInteger bigInteger6;
            if (bigInteger2.testBit(0)) {
                byte by;
                byte[] byArray2;
                bigInteger6 = bigInteger2.add(bigInteger3.multiply(arg4)).mod(arg3);
                if (bigInteger6.compareTo(bigInteger) >= 0) {
                    byArray2 = byArray;
                    by = (byte)bigInteger6.subtract(arg3).intValue();
                } else {
                    by = (byte)bigInteger6.intValue();
                    byArray2 = byArray;
                }
                byArray2[n3] = by;
                boolean bl = true;
                if (by < 0) {
                    bl = false;
                    by = -by;
                }
                BigInteger bigInteger7 = bigInteger2;
                if (bl) {
                    bigInteger2 = bigInteger7.subtract(arg5[by].cfr_renamed_3);
                    bigInteger3 = bigInteger3.subtract(arg5[by].cfr_renamed_4);
                } else {
                    bigInteger2 = bigInteger7.add(arg5[by].cfr_renamed_3);
                    bigInteger3 = bigInteger3.add(arg5[by].cfr_renamed_4);
                }
            } else {
                byArray[n3] = 0;
            }
            bigInteger6 = bigInteger2;
            if (arg0 == 1) {
                bigInteger2 = bigInteger3.add(bigInteger2.shiftRight(1));
                bigInteger5 = bigInteger6;
            } else {
                bigInteger2 = bigInteger3.subtract(bigInteger2.shiftRight(1));
                bigInteger5 = bigInteger6;
            }
            ++n3;
            bigInteger3 = bigInteger5.shiftRight(1).negate();
            bigInteger4 = bigInteger2;
        }
        return byArray;
    }

    public static BigInteger[] cfr_renamed_1844(byte arg0, int arg1, boolean arg2) {
        int n;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (arg0 != 1 && arg0 != -1) {
            throw new IllegalArgumentException(sprlxg.cfr_renamed_9("W5\u001a-O3N`X%\u001aq\u001a/H`\u0017q"));
        }
        if (arg2) {
            bigInteger2 = sprpb.cfr_renamed_4;
            bigInteger = BigInteger.valueOf(arg0);
        } else {
            bigInteger2 = sprpb.cfr_renamed_1;
            bigInteger = sprpb.cfr_renamed_0;
        }
        int n2 = n = 1;
        while (n2 < arg1) {
            BigInteger bigInteger3 = null;
            BigInteger bigInteger4 = (arg0 == 1 ? (bigInteger3 = bigInteger) : (bigInteger3 = bigInteger.negate())).subtract(bigInteger2.shiftLeft(1));
            bigInteger2 = bigInteger;
            bigInteger = bigInteger4;
            n2 = ++n;
        }
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger2;
        bigIntegerArray[1] = bigInteger;
        BigInteger[] bigIntegerArray2 = bigIntegerArray;
        return bigIntegerArray;
    }

    static {
        cfr_renamed_112 = sprpb.cfr_renamed_0.negate();
        cfr_renamed_1 = sprpb.cfr_renamed_4.negate();
        cfr_renamed_119 = sprpb.cfr_renamed_3.negate();
        sprfpb[] sprfpbArray = new sprfpb[9];
        sprfpbArray[0] = null;
        sprfpbArray[1] = new sprfpb(sprpb.cfr_renamed_0, sprpb.cfr_renamed_1);
        sprfpbArray[2] = null;
        sprfpbArray[3] = new sprfpb(cfr_renamed_119, cfr_renamed_112);
        sprfpbArray[4] = null;
        sprfpbArray[5] = new sprfpb(cfr_renamed_112, cfr_renamed_112);
        sprfpbArray[6] = null;
        sprfpbArray[7] = new sprfpb(sprpb.cfr_renamed_0, cfr_renamed_112);
        sprfpbArray[8] = null;
        cfr_renamed_4 = sprfpbArray;
        byte[][] byArrayArray = new byte[8][];
        byArrayArray[0] = null;
        byte[] byArray = new byte[1];
        byArray[0] = 1;
        byArrayArray[1] = byArray;
        byArrayArray[2] = null;
        byte[] byArray2 = new byte[3];
        byArray2[0] = -1;
        byArray2[1] = 0;
        byArray2[2] = 1;
        byArrayArray[3] = byArray2;
        byArrayArray[4] = null;
        byte[] byArray3 = new byte[3];
        byArray3[0] = 1;
        byArray3[1] = 0;
        byArray3[2] = 1;
        byArrayArray[5] = byArray3;
        byArrayArray[6] = null;
        byte[] byArray4 = new byte[4];
        byArray4[0] = -1;
        byArray4[1] = 0;
        byArray4[2] = 0;
        byArray4[3] = 1;
        byArrayArray[7] = byArray4;
        cfr_renamed_91 = byArrayArray;
        sprfpb[] sprfpbArray2 = new sprfpb[9];
        sprfpbArray2[0] = null;
        sprfpbArray2[1] = new sprfpb(sprpb.cfr_renamed_0, sprpb.cfr_renamed_1);
        sprfpbArray2[2] = null;
        sprfpbArray2[3] = new sprfpb(cfr_renamed_119, sprpb.cfr_renamed_0);
        sprfpbArray2[4] = null;
        sprfpbArray2[5] = new sprfpb(cfr_renamed_112, sprpb.cfr_renamed_0);
        sprfpbArray2[6] = null;
        sprfpbArray2[7] = new sprfpb(sprpb.cfr_renamed_0, sprpb.cfr_renamed_0);
        sprfpbArray2[8] = null;
        cfr_renamed_0 = sprfpbArray2;
        byte[][] byArrayArray2 = new byte[8][];
        byArrayArray2[0] = null;
        byte[] byArray5 = new byte[1];
        byArray5[0] = 1;
        byArrayArray2[1] = byArray5;
        byArrayArray2[2] = null;
        byte[] byArray6 = new byte[3];
        byArray6[0] = -1;
        byArray6[1] = 0;
        byArray6[2] = 1;
        byArrayArray2[3] = byArray6;
        byArrayArray2[4] = null;
        byte[] byArray7 = new byte[3];
        byArray7[0] = 1;
        byArray7[1] = 0;
        byArray7[2] = 1;
        byArrayArray2[5] = byArray7;
        byArrayArray2[6] = null;
        byte[] byArray8 = new byte[4];
        byArray8[0] = -1;
        byArray8[1] = 0;
        byArray8[2] = 0;
        byArray8[3] = -1;
        byArrayArray2[7] = byArray8;
        cfr_renamed_152 = byArrayArray2;
    }

    /*
     * WARNING - void declaration
     */
    public static BigInteger cfr_renamed_1855(byte by, sprfpb sprfpb2) {
        byte arg0;
        void arg1;
        sprfpb sprfpb3 = sprfpb2;
        void v1 = arg1;
        BigInteger bigInteger = sprfpb3.cfr_renamed_3.multiply(v1.cfr_renamed_3);
        BigInteger bigInteger2 = sprfpb3.cfr_renamed_3.multiply(arg1.cfr_renamed_4);
        BigInteger bigInteger3 = v1.cfr_renamed_4.multiply(arg1.cfr_renamed_4).shiftLeft(1);
        if (arg0 == 1) {
            BigInteger bigInteger4 = bigInteger.add(bigInteger2).add(bigInteger3);
            return bigInteger4;
        }
        if (arg0 == -1) {
            BigInteger bigInteger5 = bigInteger.subtract(bigInteger2).add(bigInteger3);
            return bigInteger5;
        }
        throw new IllegalArgumentException(spraie.cfr_renamed_9("6?{'.9/j9/{{{%)jv{"));
    }
}

