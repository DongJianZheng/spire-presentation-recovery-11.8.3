/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprdrh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhuh;
import com.spire.presentation.packages.sprlql;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmoh;
import com.spire.presentation.packages.sprqsh;
import com.spire.presentation.packages.spryth;
import java.math.BigInteger;

public class spravh {
    private static final BigInteger cfr_renamed_112;
    public static final sprmoh[] cfr_renamed_119;
    public static final byte[][] cfr_renamed_91;
    private static final BigInteger cfr_renamed_0;
    private static final BigInteger cfr_renamed_1;
    public static final byte[][] cfr_renamed_2;
    public static final sprmoh[] cfr_renamed_3;
    public static final byte cfr_renamed_4 = 4;

    public static BigInteger cfr_renamed_1785(byte arg0, int arg1) {
        if (arg1 == 4) {
            if (arg0 == 1) {
                return BigInteger.valueOf(6L);
            }
            return BigInteger.valueOf(10L);
        }
        BigInteger[] bigIntegerArray = spravh.cfr_renamed_1844(arg0, arg1, false);
        BigInteger bigInteger = sprck.cfr_renamed_0.setBit(arg1);
        BigInteger bigInteger2 = bigIntegerArray[1].modInverse(bigInteger);
        return bigIntegerArray[0].shiftLeft(1).multiply(bigInteger2).mod(bigInteger);
    }

    public static int cfr_renamed_1839(BigInteger arg0) {
        if (arg0 != null) {
            if (arg0.equals(sprck.cfr_renamed_1)) {
                return 1;
            }
            if (arg0.equals(sprck.cfr_renamed_2)) {
                return 2;
            }
        }
        throw new IllegalArgumentException(spryth.cfr_renamed_9("t14Rsw}rh~n8<|ibh1~t<#<~n1("));
    }

    public static sprmoh cfr_renamed_8633(sprqsh arg0, BigInteger arg1, byte arg2, byte arg3, byte arg4) {
        Object object;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        sprqsh sprqsh2;
        BigInteger bigInteger3;
        sprqsh sprqsh3 = arg0;
        int n = sprqsh3.cfr_renamed_1938();
        BigInteger[] bigIntegerArray = sprqsh3.cfr_renamed_1781();
        if (arg3 == 1) {
            bigInteger3 = bigIntegerArray[0].add(bigIntegerArray[1]);
            sprqsh2 = arg0;
        } else {
            bigInteger3 = bigIntegerArray[0].subtract(bigIntegerArray[1]);
            sprqsh2 = arg0;
        }
        if (sprqsh2.cfr_renamed_1841()) {
            bigInteger2 = sprck.cfr_renamed_4.shiftLeft(n).add(sprck.cfr_renamed_4).subtract(arg0.cfr_renamed_1932().multiply(arg0.cfr_renamed_1843()));
            bigInteger = arg1;
        } else {
            object = spravh.cfr_renamed_1844(arg3, n, true);
            bigInteger2 = object[1];
            bigInteger = arg1;
        }
        object = spravh.cfr_renamed_1856(bigInteger, bigIntegerArray[0], bigInteger2, arg2, n, arg4);
        BigInteger bigInteger4 = arg1;
        sprhuh sprhuh2 = spravh.cfr_renamed_1856(bigInteger4, bigIntegerArray[1], bigInteger2, arg2, n, arg4);
        sprmoh sprmoh2 = spravh.cfr_renamed_8684((sprhuh)object, sprhuh2, arg3);
        BigInteger bigInteger5 = bigInteger4.subtract(bigInteger3.multiply(sprmoh2.cfr_renamed_3)).subtract(bigIntegerArray[1].multiply(sprmoh2.cfr_renamed_4).shiftLeft(1));
        BigInteger bigInteger6 = bigIntegerArray[1].multiply(sprmoh2.cfr_renamed_3).subtract(bigIntegerArray[0].multiply(sprmoh2.cfr_renamed_4));
        return new sprmoh(bigInteger5, bigInteger6);
    }

    public static sprdrh cfr_renamed_8685(sprdrh arg0, sprdrh arg1, byte[] arg2) {
        int n;
        sprdrh sprdrh2 = (sprdrh)arg0.cfr_renamed_1769().cfr_renamed_1770();
        int n2 = 0;
        int n3 = n = arg2.length - 1;
        while (n3 >= 0) {
            ++n2;
            byte by = arg2[n];
            if (by != 0) {
                sprdrh2 = sprdrh2.cfr_renamed_8629(n2);
                n2 = 0;
                sprdrh sprdrh3 = by > 0 ? arg0 : arg1;
                sprdrh2 = (sprdrh)sprdrh2.cfr_renamed_8630(sprdrh3);
            }
            n3 = --n;
        }
        if (n2 > 0) {
            sprdrh2 = sprdrh2.cfr_renamed_8629(n2);
        }
        return sprdrh2;
    }

    public static byte[] cfr_renamed_8686(byte arg0, sprmoh arg1) {
        Object object;
        if (arg0 != 1 && arg0 != -1) {
            throw new IllegalArgumentException(sprlql.cfr_renamed_9("\nhGp\u0012n\u0013=\u0005xG,Gr\u0015=J,"));
        }
        int n = spravh.cfr_renamed_8687(arg0, arg1).bitLength();
        int n2 = n > 30 ? n + 4 : 34;
        byte[] byArray = new byte[n2];
        int n3 = 0;
        int n4 = 0;
        sprmoh sprmoh2 = arg1;
        BigInteger bigInteger = sprmoh2.cfr_renamed_3;
        BigInteger bigInteger2 = sprmoh2.cfr_renamed_4;
        BigInteger bigInteger3 = bigInteger;
        while (!bigInteger3.equals(sprck.cfr_renamed_0) || !bigInteger2.equals(sprck.cfr_renamed_0)) {
            Object object2;
            BigInteger bigInteger4;
            if (bigInteger.testBit(0)) {
                int n5;
                byArray[n3] = (byte)sprck.cfr_renamed_1.subtract(bigInteger.subtract(bigInteger2.shiftLeft(1)).mod(sprck.cfr_renamed_2)).intValue();
                if (byArray[n3] == 1) {
                    bigInteger = bigInteger.clearBit(0);
                    n5 = n3;
                } else {
                    bigInteger = bigInteger.add(sprck.cfr_renamed_4);
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

    public static sprdrh cfr_renamed_8688(sprdrh arg0, sprmoh arg1) {
        sprqsh sprqsh2 = (sprqsh)arg0.cfr_renamed_1769();
        sprdrh sprdrh2 = (sprdrh)arg0.cfr_renamed_1773();
        byte[] byArray = spravh.cfr_renamed_8686(spravh.cfr_renamed_8689(sprqsh2.cfr_renamed_1778()), arg1);
        return spravh.cfr_renamed_8685(arg0, sprdrh2, byArray);
    }

    public static sprdrh[] cfr_renamed_8690(sprdrh arg0, byte arg1) {
        int n;
        sprdrh sprdrh2 = (sprdrh)arg0.cfr_renamed_1773();
        byte[][] byArray = arg1 == 0 ? cfr_renamed_91 : cfr_renamed_2;
        spreuh[] spreuhArray = new sprdrh[byArray.length + 1 >>> 1];
        spreuhArray[0] = arg0;
        int n2 = byArray.length;
        int n3 = n = 3;
        while (n3 < n2) {
            int n4 = n >>> 1;
            sprdrh sprdrh3 = spravh.cfr_renamed_8685(arg0, sprdrh2, byArray[n]);
            spreuhArray[n4] = sprdrh3;
            n3 = n += 2;
        }
        arg0.cfr_renamed_1769().cfr_renamed_8691(spreuhArray);
        return spreuhArray;
    }

    public static byte cfr_renamed_8632(int arg0) {
        return (byte)(arg0 == 0 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    public static sprmoh cfr_renamed_8684(sprhuh sprhuh2, sprhuh sprhuh3, byte by) {
        BigInteger bigInteger;
        sprhuh sprhuh4;
        sprhuh sprhuh5;
        sprhuh sprhuh6;
        sprhuh sprhuh7;
        void arg1;
        void arg2;
        sprhuh arg0;
        int n = arg0.cfr_renamed_1851();
        if (sprhuh3.cfr_renamed_1851() != n) {
            throw new IllegalArgumentException(spryth.cfr_renamed_9("}}|~u}!<pru<}}|~u} <us1r~h1tpjt<b}|y1or}}y"));
        }
        if (arg2 != true && arg2 != -1) {
            throw new IllegalArgumentException(sprlql.cfr_renamed_9("\nhGp\u0012n\u0013=\u0005xG,Gr\u0015=J,"));
        }
        sprhuh sprhuh8 = arg0;
        BigInteger bigInteger2 = sprhuh8.cfr_renamed_802();
        BigInteger bigInteger3 = arg1.cfr_renamed_802();
        sprhuh sprhuh9 = sprhuh8.cfr_renamed_1852(bigInteger2);
        sprhuh sprhuh10 = arg1.cfr_renamed_1852(bigInteger3);
        sprhuh sprhuh11 = sprhuh9;
        sprhuh sprhuh12 = sprhuh11.cfr_renamed_8692(sprhuh11);
        if (arg2 == true) {
            sprhuh12 = sprhuh12.cfr_renamed_8692(sprhuh10);
            sprhuh7 = sprhuh10;
        } else {
            sprhuh12 = sprhuh12.cfr_renamed_8693(sprhuh10);
            sprhuh7 = sprhuh10;
        }
        sprhuh sprhuh13 = sprhuh7.cfr_renamed_8692(sprhuh10).cfr_renamed_8692(sprhuh10);
        sprhuh sprhuh14 = sprhuh13.cfr_renamed_8692(sprhuh10);
        if (arg2 == true) {
            sprhuh sprhuh15 = sprhuh9;
            sprhuh6 = sprhuh15.cfr_renamed_8693(sprhuh13);
            sprhuh5 = sprhuh15.cfr_renamed_8692(sprhuh14);
        } else {
            sprhuh sprhuh16 = sprhuh9;
            sprhuh6 = sprhuh16.cfr_renamed_8692(sprhuh13);
            sprhuh5 = sprhuh16.cfr_renamed_8693(sprhuh14);
        }
        int n2 = 0;
        byte by2 = 0;
        if (sprhuh12.cfr_renamed_1853(sprck.cfr_renamed_4) >= 0) {
            if (sprhuh6.cfr_renamed_1853(cfr_renamed_0) < 0) {
                by2 = arg2;
                sprhuh4 = sprhuh12;
            } else {
                n2 = 1;
                sprhuh4 = sprhuh12;
            }
        } else {
            if (sprhuh5.cfr_renamed_1853(sprck.cfr_renamed_1) >= 0) {
                by2 = arg2;
            }
            sprhuh4 = sprhuh12;
        }
        if (sprhuh4.cfr_renamed_1853(cfr_renamed_0) < 0) {
            if (sprhuh6.cfr_renamed_1853(sprck.cfr_renamed_4) >= 0) {
                by2 = (byte)(-arg2);
                bigInteger = bigInteger2;
            } else {
                n2 = -1;
                bigInteger = bigInteger2;
            }
        } else {
            if (sprhuh5.cfr_renamed_1853(cfr_renamed_112) < 0) {
                by2 = (byte)(-arg2);
            }
            bigInteger = bigInteger2;
        }
        BigInteger bigInteger4 = bigInteger.add(BigInteger.valueOf(n2));
        BigInteger bigInteger5 = bigInteger3.add(BigInteger.valueOf(by2));
        return new sprmoh(bigInteger4, bigInteger5);
    }

    public static BigInteger[] cfr_renamed_8694(sprqsh arg0) {
        if (!arg0.cfr_renamed_1841()) {
            throw new IllegalArgumentException(spryth.cfr_renamed_9("ox<xo1xtzxrtx1z~n1W~~}uef1\u007fdngyb<~r}e"));
        }
        return spravh.cfr_renamed_8695(arg0.cfr_renamed_1938(), arg0.cfr_renamed_1778().cfr_renamed_1779().intValue(), arg0.cfr_renamed_1843());
    }

    public static BigInteger cfr_renamed_8687(byte arg0, sprmoh arg1) {
        sprmoh sprmoh2 = arg1;
        BigInteger bigInteger = sprmoh2.cfr_renamed_3.multiply(sprmoh2.cfr_renamed_3);
        if (arg0 == 1) {
            return arg1.cfr_renamed_4.shiftLeft(1).add(arg1.cfr_renamed_3).multiply(arg1.cfr_renamed_4).add(bigInteger);
        }
        if (arg0 == -1) {
            return arg1.cfr_renamed_4.shiftLeft(1).subtract(arg1.cfr_renamed_3).multiply(arg1.cfr_renamed_4).add(bigInteger);
        }
        throw new IllegalArgumentException(sprlql.cfr_renamed_9("\nhGp\u0012n\u0013=\u0005xG,Gr\u0015=J,"));
    }

    static {
        cfr_renamed_0 = sprck.cfr_renamed_4.negate();
        cfr_renamed_112 = sprck.cfr_renamed_1.negate();
        cfr_renamed_1 = sprck.cfr_renamed_91.negate();
        sprmoh[] sprmohArray = new sprmoh[16];
        sprmohArray[0] = null;
        sprmohArray[1] = new sprmoh(sprck.cfr_renamed_4, sprck.cfr_renamed_0);
        sprmohArray[2] = null;
        sprmohArray[3] = new sprmoh(cfr_renamed_1, cfr_renamed_0);
        sprmohArray[4] = null;
        sprmohArray[5] = new sprmoh(cfr_renamed_0, cfr_renamed_0);
        sprmohArray[6] = null;
        sprmohArray[7] = new sprmoh(sprck.cfr_renamed_4, cfr_renamed_0);
        sprmohArray[8] = null;
        sprmohArray[9] = new sprmoh(cfr_renamed_0, sprck.cfr_renamed_4);
        sprmohArray[10] = null;
        sprmohArray[11] = new sprmoh(sprck.cfr_renamed_4, sprck.cfr_renamed_4);
        sprmohArray[12] = null;
        sprmohArray[13] = new sprmoh(sprck.cfr_renamed_91, sprck.cfr_renamed_4);
        sprmohArray[14] = null;
        sprmohArray[15] = new sprmoh(cfr_renamed_0, sprck.cfr_renamed_0);
        cfr_renamed_119 = sprmohArray;
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
        sprmoh[] sprmohArray2 = new sprmoh[16];
        sprmohArray2[0] = null;
        sprmohArray2[1] = new sprmoh(sprck.cfr_renamed_4, sprck.cfr_renamed_0);
        sprmohArray2[2] = null;
        sprmohArray2[3] = new sprmoh(cfr_renamed_1, sprck.cfr_renamed_4);
        sprmohArray2[4] = null;
        sprmohArray2[5] = new sprmoh(cfr_renamed_0, sprck.cfr_renamed_4);
        sprmohArray2[6] = null;
        sprmohArray2[7] = new sprmoh(sprck.cfr_renamed_4, sprck.cfr_renamed_4);
        sprmohArray2[8] = null;
        sprmohArray2[9] = new sprmoh(cfr_renamed_0, cfr_renamed_0);
        sprmohArray2[10] = null;
        sprmohArray2[11] = new sprmoh(sprck.cfr_renamed_4, cfr_renamed_0);
        sprmohArray2[12] = null;
        sprmohArray2[13] = new sprmoh(sprck.cfr_renamed_91, cfr_renamed_0);
        sprmohArray2[14] = null;
        sprmohArray2[15] = new sprmoh(cfr_renamed_0, sprck.cfr_renamed_0);
        cfr_renamed_3 = sprmohArray2;
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
        cfr_renamed_2 = byArrayArray2;
    }

    public static byte cfr_renamed_8689(sprlsh arg0) {
        return (byte)(arg0.cfr_renamed_805() ? -1 : 1);
    }

    public static sprhuh cfr_renamed_8696(byte arg0, sprhuh arg1, sprhuh arg2) {
        sprhuh sprhuh2 = arg1;
        sprhuh sprhuh3 = sprhuh2.cfr_renamed_8697(sprhuh2);
        sprhuh sprhuh4 = sprhuh2.cfr_renamed_8697(arg2);
        sprhuh sprhuh5 = arg2;
        sprhuh sprhuh6 = sprhuh5.cfr_renamed_8697(sprhuh5).cfr_renamed_979(1);
        if (arg0 == 1) {
            sprhuh sprhuh7 = sprhuh3.cfr_renamed_8692(sprhuh4).cfr_renamed_8692(sprhuh6);
            return sprhuh7;
        }
        if (arg0 == -1) {
            sprhuh sprhuh8 = sprhuh3.cfr_renamed_8693(sprhuh4).cfr_renamed_8692(sprhuh6);
            return sprhuh8;
        }
        throw new IllegalArgumentException(spryth.cfr_renamed_9("|i1qdoe<sy1-1sc<<-"));
    }

    public static byte cfr_renamed_8698(sprqsh arg0) {
        if (!arg0.cfr_renamed_1841()) {
            throw new IllegalArgumentException(sprlql.cfr_renamed_9(")rGV\b\u007f\u000bt\u0013gG~\u0012o\u0011xG5&_$4K=3S&[Gp\u0012q\u0013t\u0017q\u000e~\u0006i\u000er\t=\tr\u0013=\u0017r\u0014n\u000e\u007f\u000bx"));
        }
        if (arg0.cfr_renamed_1778().cfr_renamed_805()) {
            return -1;
        }
        return 1;
    }

    public static byte[] cfr_renamed_8626(byte arg0, sprmoh arg1, int arg2, int arg3, sprmoh[] arg4) {
        if (arg0 != 1 && arg0 != -1) {
            throw new IllegalArgumentException(spryth.cfr_renamed_9("|i1qdoe<sy1-1sc<<-"));
        }
        int n = spravh.cfr_renamed_8687(arg0, arg1).bitLength();
        int n2 = n > 30 ? n + 4 + arg2 : 34 + arg2;
        byte[] byArray = new byte[n2];
        int n3 = (1 << arg2) - 1;
        int n4 = 32 - arg2;
        sprmoh sprmoh2 = arg1;
        BigInteger bigInteger = sprmoh2.cfr_renamed_3;
        BigInteger bigInteger2 = sprmoh2.cfr_renamed_4;
        int n5 = 0;
        BigInteger bigInteger3 = bigInteger;
        while (bigInteger3.bitLength() > 62 || bigInteger2.bitLength() > 62) {
            BigInteger bigInteger4;
            if (bigInteger.testBit(0)) {
                BigInteger bigInteger5 = bigInteger;
                int n6 = bigInteger5.intValue() + bigInteger2.intValue() * arg3;
                int n7 = n6 & n3;
                byArray[n5] = (byte)(n6 << n4 >> n4);
                bigInteger = bigInteger5.subtract(arg4[n7].cfr_renamed_3);
                bigInteger2 = bigInteger2.subtract(arg4[n7].cfr_renamed_4);
            }
            ++n5;
            BigInteger bigInteger6 = bigInteger.shiftRight(1);
            if (arg0 == 1) {
                bigInteger = bigInteger2.add(bigInteger6);
                bigInteger4 = bigInteger6;
            } else {
                bigInteger = bigInteger2.subtract(bigInteger6);
                bigInteger4 = bigInteger6;
            }
            bigInteger2 = bigInteger4.negate();
            bigInteger3 = bigInteger;
        }
        long l = sprhdf.cfr_renamed_5226(bigInteger);
        long l2 = sprhdf.cfr_renamed_5226(bigInteger2);
        long l3 = l;
        while ((l3 | l2) != 0L) {
            long l4;
            if ((l & 1L) != 0L) {
                int n8 = (int)l + (int)l2 * arg3;
                int n9 = n8 & n3;
                byArray[n5] = (byte)(n8 << n4 >> n4);
                l -= (long)arg4[n9].cfr_renamed_3.intValue();
                l2 -= (long)arg4[n9].cfr_renamed_4.intValue();
            }
            ++n5;
            long l5 = l >> 1;
            if (arg0 == 1) {
                l = l2 + l5;
                l4 = l5;
            } else {
                l = l2 - l5;
                l4 = l5;
            }
            l2 = -l4;
            l3 = l;
        }
        return byArray;
    }

    public static sprhuh cfr_renamed_1856(BigInteger arg0, BigInteger arg1, BigInteger arg2, byte arg3, int arg4, int arg5) {
        int n = (arg4 + 5) / 2 + arg5;
        BigInteger bigInteger = arg0.shiftRight(arg4 - n - 2 + arg3);
        BigInteger bigInteger2 = arg1.multiply(bigInteger);
        BigInteger bigInteger3 = bigInteger2.shiftRight(arg4);
        BigInteger bigInteger4 = bigInteger2.add(arg2.multiply(bigInteger3));
        BigInteger bigInteger5 = bigInteger4.shiftRight(n - arg5);
        if (bigInteger4.testBit(n - arg5 - 1)) {
            bigInteger5 = bigInteger5.add(sprck.cfr_renamed_4);
        }
        return new sprhuh(bigInteger5, arg5);
    }

    public static BigInteger[] cfr_renamed_8695(int arg0, int arg1, BigInteger arg2) {
        byte by = spravh.cfr_renamed_8632(arg1);
        int n = spravh.cfr_renamed_1839(arg2);
        int n2 = arg0 + 3 - arg1;
        BigInteger[] bigIntegerArray = spravh.cfr_renamed_1844(by, n2, false);
        if (by == 1) {
            bigIntegerArray[0] = bigIntegerArray[0].negate();
            bigIntegerArray[1] = bigIntegerArray[1].negate();
        }
        BigInteger bigInteger = sprck.cfr_renamed_4.add(bigIntegerArray[1]).shiftRight(n);
        BigInteger bigInteger2 = sprck.cfr_renamed_4.add(bigIntegerArray[0]).shiftRight(n).negate();
        BigInteger[] bigIntegerArray2 = new BigInteger[2];
        bigIntegerArray2[0] = bigInteger;
        bigIntegerArray2[1] = bigInteger2;
        return bigIntegerArray2;
    }

    public static sprdrh cfr_renamed_8699(sprdrh arg0, BigInteger arg1) {
        sprqsh sprqsh2;
        sprqsh sprqsh3 = sprqsh2 = (sprqsh)arg0.cfr_renamed_1769();
        int n = sprqsh3.cfr_renamed_1778().cfr_renamed_1779().intValue();
        byte by = spravh.cfr_renamed_8632(n);
        sprmoh sprmoh2 = spravh.cfr_renamed_8633(sprqsh3, arg1, (byte)n, by, (byte)10);
        return spravh.cfr_renamed_8688(arg0, sprmoh2);
    }

    public static sprdrh cfr_renamed_8700(sprdrh arg0) {
        return arg0.cfr_renamed_1858();
    }

    public static BigInteger[] cfr_renamed_1844(byte arg0, int arg1, boolean arg2) {
        int n;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (arg0 != 1 && arg0 != -1) {
            throw new IllegalArgumentException(sprlql.cfr_renamed_9("\nhGp\u0012n\u0013=\u0005xG,Gr\u0015=J,"));
        }
        if (arg2) {
            bigInteger2 = sprck.cfr_renamed_1;
            bigInteger = BigInteger.valueOf(arg0);
        } else {
            bigInteger2 = sprck.cfr_renamed_0;
            bigInteger = sprck.cfr_renamed_4;
        }
        int n2 = n = 1;
        while (n2 < arg1) {
            BigInteger bigInteger3 = bigInteger;
            if (arg0 < 0) {
                bigInteger3 = bigInteger3.negate();
            }
            BigInteger bigInteger4 = bigInteger3.subtract(bigInteger2.shiftLeft(1));
            bigInteger2 = bigInteger;
            bigInteger = bigInteger4;
            n2 = ++n;
        }
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = bigInteger2;
        bigIntegerArray[1] = bigInteger;
        return bigIntegerArray;
    }
}

