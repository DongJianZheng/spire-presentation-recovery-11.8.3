/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawc;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtth;
import com.spire.presentation.packages.sprwuh;
import com.spire.presentation.packages.sprxcja;
import java.math.BigInteger;
import java.security.SecureRandom;

public abstract class sprwoh {
    private static final BigInteger cfr_renamed_1 = BigInteger.valueOf(1L);
    public static final int cfr_renamed_2 = 211;
    private static final BigInteger cfr_renamed_3;
    private static final BigInteger cfr_renamed_4;

    private static /* synthetic */ boolean cfr_renamed_8609(long arg0) {
        int n;
        if (arg0 >>> 32 != 0L) {
            throw new IllegalArgumentException(sprxcja.cfr_renamed_9("\u0019h0djm#l#ujd2b/d.d."));
        }
        if (arg0 <= 5L) {
            return arg0 == 2L || arg0 == 3L || arg0 == 5L;
        }
        if ((arg0 & 1L) == 0L || arg0 % 3L == 0L || arg0 % 5L == 0L) {
            return false;
        }
        long[] lArray = new long[8];
        lArray[0] = 1L;
        lArray[1] = 7L;
        lArray[2] = 11L;
        lArray[3] = 13L;
        lArray[4] = 17L;
        lArray[5] = 19L;
        lArray[6] = 23L;
        lArray[7] = 29L;
        long[] lArray2 = lArray;
        long l = 0L;
        int n2 = n = 1;
        while (true) {
            if (n2 < lArray2.length) {
                long l2 = l + lArray2[n];
                if (arg0 % l2 == 0L) {
                    return arg0 < 30L;
                }
                n2 = ++n;
                continue;
            }
            if ((l += 30L) * l >= arg0) {
                return true;
            }
            n2 = n = 0;
        }
    }

    private static /* synthetic */ void cfr_renamed_8610(byte[] arg0, int arg1) {
        int n = arg0.length;
        int n2 = arg1;
        while (n2 > 0 && --n >= 0) {
            int n3 = arg1 += arg0[n] & 0xFF;
            arg0[n] = (byte)n3;
            n2 = arg1 = n3 >>> 8;
        }
    }

    private static /* synthetic */ void cfr_renamed_8611(BigInteger arg0, String arg1) {
        if (arg0 == null || arg0.signum() < 1 || arg0.bitLength() < 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprawc.cfr_renamed_9("&")).append(arg1).append(sprxcja.cfr_renamed_9("m!'t9ujc/!$n$,$t&mj`$ej?w!x")).toString());
        }
    }

    private static /* synthetic */ sprwuh cfr_renamed_8612(sprgf arg0, int arg1, byte[] arg2) {
        BigInteger bigInteger;
        int n = arg0.cfr_renamed_1218();
        if (arg1 < 33) {
            int n2 = 0;
            byte[] byArray = new byte[n];
            byte[] byArray2 = new byte[n];
            do {
                sprwoh.cfr_renamed_8613(arg0, arg2, byArray, 0);
                sprwoh.cfr_renamed_8610(arg2, 1);
                sprwoh.cfr_renamed_8613(arg0, arg2, byArray2, 0);
                sprwoh.cfr_renamed_8610(arg2, 1);
                int n3 = sprwoh.cfr_renamed_8614(byArray) ^ sprwoh.cfr_renamed_8614(byArray2);
                n3 &= -1 >>> 32 - arg1;
                ++n2;
                long l = (long)(n3 |= 1 << arg1 - 1 | 1) & 0xFFFFFFFFL;
                if (!sprwoh.cfr_renamed_8609(l)) continue;
                return new sprwuh(BigInteger.valueOf(l), arg2, n2, null);
            } while (n2 <= 4 * arg1);
            throw new IllegalStateException(sprawc.cfr_renamed_9("wnL!N`Mx\u0003hWdQ`WhLoP!Jo\u0003RK`Td\u000eUBxOnQ!q`MeLl|QQhNd\u0003SLtWhMd"));
        }
        sprgf sprgf2 = arg0;
        sprwuh sprwuh2 = sprwoh.cfr_renamed_8612(sprgf2, (arg1 + 3) / 2, arg2);
        BigInteger bigInteger2 = sprwuh2.cfr_renamed_8615();
        arg2 = sprwuh2.cfr_renamed_8616();
        int n4 = sprwuh2.cfr_renamed_8617();
        int n5 = 8 * n;
        int n6 = (arg1 - 1) / n5;
        int n7 = n4;
        BigInteger bigInteger3 = sprwoh.cfr_renamed_8618(sprgf2, arg2, n6 + 1);
        bigInteger3 = bigInteger3.mod(cfr_renamed_1.shiftLeft(arg1 - 1)).setBit(arg1 - 1);
        BigInteger bigInteger4 = bigInteger2.shiftLeft(1);
        BigInteger bigInteger5 = bigInteger3.subtract(cfr_renamed_1).divide(bigInteger4).add(cfr_renamed_1).shiftLeft(1);
        int n8 = 0;
        BigInteger bigInteger6 = bigInteger = bigInteger5.multiply(bigInteger2).add(cfr_renamed_1);
        while (true) {
            if (bigInteger6.bitLength() > arg1) {
                bigInteger5 = cfr_renamed_1.shiftLeft(arg1 - 1).subtract(cfr_renamed_1).divide(bigInteger4).add(cfr_renamed_1).shiftLeft(1);
                bigInteger = bigInteger5.multiply(bigInteger2).add(cfr_renamed_1);
            }
            ++n4;
            if (!sprwoh.cfr_renamed_8619(bigInteger)) {
                BigInteger bigInteger7 = sprwoh.cfr_renamed_8618(arg0, arg2, n6 + 1);
                bigInteger7 = bigInteger7.mod(bigInteger.subtract(cfr_renamed_3)).add(cfr_renamed_4);
                bigInteger5 = bigInteger5.add(BigInteger.valueOf(n8));
                n8 = 0;
                BigInteger bigInteger8 = bigInteger7.modPow(bigInteger5, bigInteger);
                if (bigInteger.gcd(bigInteger8.subtract(cfr_renamed_1)).equals(cfr_renamed_1) && bigInteger8.modPow(bigInteger2, bigInteger).equals(cfr_renamed_1)) {
                    return new sprwuh(bigInteger, arg2, n4, null);
                }
            } else {
                sprwoh.cfr_renamed_8610(arg2, n6 + 1);
            }
            if (n4 >= 4 * arg1 + n7) {
                throw new IllegalStateException(sprxcja.cfr_renamed_9("U%njl+o3!#u/s+u#n$rjh$!\u0019i+v/,\u001e`3m%sjS+o.n'^\u001as#l/!\u0018n?u#o/"));
            }
            n8 += 2;
            bigInteger6 = bigInteger.add(bigInteger4);
        }
    }

    static {
        cfr_renamed_4 = BigInteger.valueOf(2L);
        cfr_renamed_3 = BigInteger.valueOf(3L);
    }

    private static /* synthetic */ boolean cfr_renamed_8619(BigInteger arg0) {
        int n = 223092870;
        int n2 = arg0.mod(BigInteger.valueOf(n)).intValue();
        if (n2 % 2 == 0 || n2 % 3 == 0 || n2 % 5 == 0 || n2 % 7 == 0 || n2 % 11 == 0 || n2 % 13 == 0 || n2 % 17 == 0 || n2 % 19 == 0 || n2 % 23 == 0) {
            return true;
        }
        n = 58642669;
        n2 = arg0.mod(BigInteger.valueOf(n)).intValue();
        if (n2 % 29 == 0 || n2 % 31 == 0 || n2 % 37 == 0 || n2 % 41 == 0 || n2 % 43 == 0) {
            return true;
        }
        n = 600662303;
        n2 = arg0.mod(BigInteger.valueOf(n)).intValue();
        if (n2 % 47 == 0 || n2 % 53 == 0 || n2 % 59 == 0 || n2 % 61 == 0 || n2 % 67 == 0) {
            return true;
        }
        n = 33984931;
        n2 = arg0.mod(BigInteger.valueOf(n)).intValue();
        if (n2 % 71 == 0 || n2 % 73 == 0 || n2 % 79 == 0 || n2 % 83 == 0) {
            return true;
        }
        n = 89809099;
        n2 = arg0.mod(BigInteger.valueOf(n)).intValue();
        if (n2 % 89 == 0 || n2 % 97 == 0 || n2 % 101 == 0 || n2 % 103 == 0) {
            return true;
        }
        n = 167375713;
        n2 = arg0.mod(BigInteger.valueOf(n)).intValue();
        if (n2 % 107 == 0 || n2 % 109 == 0 || n2 % 113 == 0 || n2 % 127 == 0) {
            return true;
        }
        n = 371700317;
        n2 = arg0.mod(BigInteger.valueOf(n)).intValue();
        if (n2 % 131 == 0 || n2 % 137 == 0 || n2 % 139 == 0 || n2 % 149 == 0) {
            return true;
        }
        n = 645328247;
        n2 = arg0.mod(BigInteger.valueOf(n)).intValue();
        if (n2 % 151 == 0 || n2 % 157 == 0 || n2 % 163 == 0 || n2 % 167 == 0) {
            return true;
        }
        n = 1070560157;
        n2 = arg0.mod(BigInteger.valueOf(n)).intValue();
        if (n2 % 173 == 0 || n2 % 179 == 0 || n2 % 181 == 0 || n2 % 191 == 0) {
            return true;
        }
        n = 1596463769;
        n2 = arg0.mod(BigInteger.valueOf(n)).intValue();
        return n2 % 193 == 0 || n2 % 197 == 0 || n2 % 199 == 0 || n2 % 211 == 0;
    }

    public static boolean cfr_renamed_7262(BigInteger arg0) {
        BigInteger bigInteger = arg0;
        sprwoh.cfr_renamed_8611(bigInteger, sprawc.cfr_renamed_9("bBoGhG`Wd"));
        return sprwoh.cfr_renamed_8619(bigInteger);
    }

    private static /* synthetic */ BigInteger cfr_renamed_8618(sprgf arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = arg0.cfr_renamed_1218();
        int n3 = arg2 * n2;
        byte[] byArray = new byte[n3];
        int n4 = n = 0;
        while (n4 < arg2) {
            sprwoh.cfr_renamed_8613(arg0, arg1, byArray, n3 -= n2);
            sprwoh.cfr_renamed_8610(arg1, 1);
            n4 = ++n;
        }
        return new BigInteger(1, byArray);
    }

    private static /* synthetic */ boolean cfr_renamed_8620(BigInteger arg0, BigInteger arg1, BigInteger arg2, int arg3, BigInteger arg4) {
        int n;
        BigInteger bigInteger = arg4.modPow(arg2, arg0);
        if (bigInteger.equals(cfr_renamed_1) || bigInteger.equals(arg1)) {
            return true;
        }
        boolean bl = false;
        int n2 = n = 1;
        while (n2 < arg3) {
            if ((bigInteger = bigInteger.modPow(cfr_renamed_4, arg0)).equals(arg1)) {
                bl = true;
                return true;
            }
            if (bigInteger.equals(cfr_renamed_1)) {
                return false;
            }
            n2 = ++n;
        }
        return bl;
    }

    public static boolean cfr_renamed_8621(BigInteger arg0, BigInteger arg1) {
        BigInteger bigInteger = arg0;
        sprwoh.cfr_renamed_8611(bigInteger, sprxcja.cfr_renamed_9(")`$e#e+u/"));
        BigInteger bigInteger2 = arg1;
        sprwoh.cfr_renamed_8611(bigInteger2, "base");
        if (bigInteger2.compareTo(bigInteger.subtract(cfr_renamed_1)) >= 0) {
            throw new IllegalArgumentException(sprawc.cfr_renamed_9("\u0004cBrF&\u0003lVrW!Ad\u0003=\u0003)\u0004bBoGhG`Wd\u0004!\u000e!\u0012("));
        }
        if (arg0.bitLength() == 2) {
            return true;
        }
        BigInteger bigInteger3 = arg0;
        BigInteger bigInteger4 = bigInteger3.subtract(cfr_renamed_1);
        int n = bigInteger4.getLowestSetBit();
        BigInteger bigInteger5 = bigInteger4.shiftRight(n);
        return sprwoh.cfr_renamed_8620(bigInteger3, bigInteger4, bigInteger5, n, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean cfr_renamed_7263(BigInteger bigInteger, SecureRandom secureRandom, int n) {
        int n2;
        void arg2;
        BigInteger arg0;
        sprwoh.cfr_renamed_8611(arg0, sprxcja.cfr_renamed_9(")`$e#e+u/"));
        if (secureRandom == null) {
            throw new IllegalArgumentException(sprawc.cfr_renamed_9("&Q`MeLl\u0004!@`MoLu\u0003cF!MtOm"));
        }
        if (arg2 < true) {
            throw new IllegalArgumentException(sprxcja.cfr_renamed_9("&#u/s+u#n$rm!'t9ujc/!t!z"));
        }
        if (arg0.bitLength() == 2) {
            return true;
        }
        if (!arg0.testBit(0)) {
            return false;
        }
        BigInteger bigInteger2 = arg0;
        BigInteger bigInteger3 = bigInteger2.subtract(cfr_renamed_1);
        BigInteger bigInteger4 = bigInteger2.subtract(cfr_renamed_4);
        BigInteger bigInteger5 = bigInteger3;
        int n3 = bigInteger5.getLowestSetBit();
        BigInteger bigInteger6 = bigInteger5.shiftRight(n3);
        int n4 = n2 = 0;
        while (n4 < arg2) {
            void arg1;
            BigInteger bigInteger7 = sprhdf.cfr_renamed_513(cfr_renamed_4, bigInteger4, (SecureRandom)arg1);
            if (!sprwoh.cfr_renamed_8620(bigInteger2, bigInteger3, bigInteger6, n3, bigInteger7)) {
                return false;
            }
            n4 = ++n2;
        }
        return true;
    }

    public static sprwuh cfr_renamed_8622(sprgf arg0, int arg1, byte[] arg2) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprawc.cfr_renamed_9("&K`Pi\u0004!@`MoLu\u0003cF!MtOm"));
        }
        if (arg1 < 2) {
            throw new IllegalArgumentException(sprxcja.cfr_renamed_9("mm/o-u\"&jl?r>!(dj?w!x"));
        }
        if (arg2 == null || arg2.length == 0) {
            throw new IllegalArgumentException(sprawc.cfr_renamed_9("&JoStWRFdG&\u0003bBoMnW!Ad\u0003oVmO!Ls\u0003dNqWx"));
        }
        return sprwoh.cfr_renamed_8612(arg0, arg1, sproze.cfr_renamed_158(arg2));
    }

    private static /* synthetic */ int cfr_renamed_8614(byte[] arg0) {
        int n;
        int n2 = 0;
        int n3 = Math.min(4, arg0.length);
        int n4 = n = 0;
        while (n4 < n3) {
            int n5 = arg0[arg0.length - (n + 1)] & 0xFF;
            int n6 = 8 * n;
            n2 |= n5 << n6;
            n4 = ++n;
        }
        return n2;
    }

    private static /* synthetic */ void cfr_renamed_8613(sprgf arg0, byte[] arg1, byte[] arg2, int arg3) {
        arg0.cfr_renamed_1197(arg1, 0, arg1.length);
        arg0.cfr_renamed_1219(arg2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    public static sprtth cfr_renamed_7257(BigInteger bigInteger, SecureRandom secureRandom, int n) {
        int n2;
        void arg2;
        BigInteger arg0;
        sprwoh.cfr_renamed_8611(arg0, sprxcja.cfr_renamed_9(")`$e#e+u/"));
        if (secureRandom == null) {
            throw new IllegalArgumentException(sprawc.cfr_renamed_9("&Q`MeLl\u0004!@`MoLu\u0003cF!MtOm"));
        }
        if (arg2 < true) {
            throw new IllegalArgumentException(sprxcja.cfr_renamed_9("&#u/s+u#n$rm!'t9ujc/!t!z"));
        }
        if (arg0.bitLength() == 2) {
            return sprtth.cfr_renamed_2413();
        }
        if (!arg0.testBit(0)) {
            return sprtth.cfr_renamed_8623(cfr_renamed_4);
        }
        BigInteger bigInteger2 = arg0;
        BigInteger bigInteger3 = bigInteger2.subtract(cfr_renamed_1);
        BigInteger bigInteger4 = bigInteger2.subtract(cfr_renamed_4);
        BigInteger bigInteger5 = bigInteger3;
        int n3 = bigInteger5.getLowestSetBit();
        BigInteger bigInteger6 = bigInteger5.shiftRight(n3);
        int n4 = n2 = 0;
        while (n4 < arg2) {
            void arg1;
            BigInteger bigInteger7 = sprhdf.cfr_renamed_513(cfr_renamed_4, bigInteger4, (SecureRandom)arg1);
            BigInteger bigInteger8 = bigInteger7.gcd(bigInteger2);
            if (bigInteger8.compareTo(cfr_renamed_1) > 0) {
                return sprtth.cfr_renamed_8623(bigInteger8);
            }
            BigInteger bigInteger9 = bigInteger7.modPow(bigInteger6, bigInteger2);
            if (!bigInteger9.equals(cfr_renamed_1) && !bigInteger9.equals(bigInteger3)) {
                boolean bl;
                BigInteger bigInteger10;
                block13: {
                    int n5;
                    boolean bl2 = false;
                    bigInteger10 = bigInteger9;
                    int n6 = n5 = 1;
                    while (n6 < n3) {
                        if ((bigInteger9 = bigInteger9.modPow(cfr_renamed_4, bigInteger2)).equals(bigInteger3)) {
                            bl = bl2 = true;
                            break block13;
                        }
                        if (bigInteger9.equals(cfr_renamed_1)) {
                            bl = bl2;
                            break block13;
                        }
                        bigInteger10 = bigInteger9;
                        n6 = ++n5;
                    }
                    bl = bl2;
                }
                if (!bl) {
                    if (!bigInteger9.equals(cfr_renamed_1) && !(bigInteger9 = (bigInteger10 = bigInteger9).modPow(cfr_renamed_4, bigInteger2)).equals(cfr_renamed_1)) {
                        bigInteger10 = bigInteger9;
                    }
                    if ((bigInteger8 = bigInteger10.subtract(cfr_renamed_1).gcd(bigInteger2)).compareTo(cfr_renamed_1) > 0) {
                        return sprtth.cfr_renamed_8623(bigInteger8);
                    }
                    return sprtth.cfr_renamed_2444();
                }
            }
            n4 = ++n2;
        }
        return sprtth.cfr_renamed_2413();
    }
}

