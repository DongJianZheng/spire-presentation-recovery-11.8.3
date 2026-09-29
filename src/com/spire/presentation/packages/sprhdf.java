/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartTextArea;
import com.spire.presentation.packages.sprnvn;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqlh;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;
import java.security.SecureRandom;

public final class sprhdf {
    private static final BigInteger cfr_renamed_119;
    public static final BigInteger cfr_renamed_91;
    public static final BigInteger cfr_renamed_0;
    private static final BigInteger cfr_renamed_1;
    public static final BigInteger cfr_renamed_2;
    private static final int cfr_renamed_3;
    private static final int cfr_renamed_4 = 1000;

    public static byte[] cfr_renamed_514(BigInteger arg0) {
        byte[] byArray = arg0.toByteArray();
        if (byArray[0] == 0 && byArray.length != 1) {
            byte[] byArray2 = new byte[byArray.length - 1];
            System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
            return byArray2;
        }
        return byArray;
    }

    public static void cfr_renamed_5224(BigInteger arg0, byte[] arg1, int arg2, int arg3) {
        byte[] byArray = arg0.toByteArray();
        if (byArray.length == arg3) {
            System.arraycopy(byArray, 0, arg1, arg2, arg3);
            return;
        }
        int n = byArray[0] == 0 && byArray.length != 1 ? 1 : 0;
        int n2 = byArray.length - n;
        if (n2 > arg3) {
            throw new IllegalArgumentException(sprnvn.cfr_renamed_9("ufg|bstv&~c|afn2cjewcvcv&ti`&dg~sw"));
        }
        int n3 = arg3 - n2;
        int n4 = arg2;
        sproze.cfr_renamed_5214(arg1, n4, n4 + n3, (byte)0);
        System.arraycopy(byArray, n, arg1, arg2 + n3, n2);
    }

    public static int cfr_renamed_5225(BigInteger arg0) {
        if (arg0.bitLength() > 31) {
            throw new ArithmeticException(ChartTextArea.cfr_renamed_9("9k\u001cK\u0015v\u001ee\u001ep[m\u000ev[m\u001d\"\u0012l\u000f\"\tc\u0015e\u001e"));
        }
        return arg0.intValue();
    }

    public static long cfr_renamed_5226(BigInteger arg0) {
        if (arg0.bitLength() > 63) {
            throw new ArithmeticException(sprnvn.cfr_renamed_9("D{a[hfcuc`&}sf&}`2j}hu&`g|aw"));
        }
        return arg0.longValue();
    }

    public static byte cfr_renamed_5227(BigInteger arg0) {
        if (arg0.bitLength() > 7) {
            throw new ArithmeticException(ChartTextArea.cfr_renamed_9("9k\u001cK\u0015v\u001ee\u001ep[m\u000ev[m\u001d\"\u0012l\u000f\"\tc\u0015e\u001e"));
        }
        return arg0.byteValue();
    }

    public static short cfr_renamed_5228(BigInteger arg0) {
        if (arg0.bitLength() > 15) {
            throw new ArithmeticException(sprnvn.cfr_renamed_9("PouO|rwawt2igr2it&{hf&`g|aw"));
        }
        return arg0.shortValue();
    }

    public static int cfr_renamed_5229(BigInteger arg0) {
        if (arg0.equals(cfr_renamed_0)) {
            return 1;
        }
        return (arg0.bitLength() + 7) / 8;
    }

    public static BigInteger cfr_renamed_515(byte[] arg0) {
        return new BigInteger(1, arg0);
    }

    public static BigInteger cfr_renamed_5230(int arg0, SecureRandom arg1) {
        return new BigInteger(1, sprhdf.cfr_renamed_5231(arg0, arg1));
    }

    public static BigInteger cfr_renamed_511(byte[] arg0, int arg1, int arg2) {
        byte[] byArray = arg0;
        if (arg1 != 0 || arg2 != arg0.length) {
            byArray = new byte[arg2];
            System.arraycopy(arg0, arg1, byArray, 0, arg2);
        }
        return new BigInteger(1, byArray);
    }

    static {
        cfr_renamed_0 = BigInteger.valueOf(0L);
        cfr_renamed_2 = BigInteger.valueOf(1L);
        cfr_renamed_91 = BigInteger.valueOf(2L);
        cfr_renamed_1 = BigInteger.valueOf(3L);
        cfr_renamed_119 = new BigInteger(ChartTextArea.cfr_renamed_9("C3H:\u001e:\u001a2\u001da\u001d1\u001a6\u001e:OcL5JfO2\u001dfH2NfLdOc\u001a7B1K4\u001f5I7Jf\u001e7OfB:\u001adCd\u001e;N5I;\u001a3\u001d5HfC;Hd\u001a6I6\u0018fIg\u001faC4H4\u001a4\u00181I:NgK0I`KgH:M4\u001a7M7\u001agC3K:\u001eg\u001f:N;Ja\u001f6\u001dgCfIa\u001e:M3M7\u001a;L:\u001f5J;\u001e`\u001d4O5\u001d1M0\u001f1Hd\u0018cI;\u0018fJ5Bd\u00196I6K3\u0018`\u001adHf\u001d2\u00184J6K7MdBaCdHa\u001dfN3\u001e6L6\u001ad\u00194\u0019aM;L6\u001d5Cf\u0019:\u001a`\u001a:\u001e;\u001e7J5\u001df\u001efM7C7B3\u001a`L7K0\u0019fO3C6B6M0\u001d"), 16);
        cfr_renamed_3 = BigInteger.valueOf(743L).bitLength();
    }

    private static /* synthetic */ byte[] cfr_renamed_5231(int arg0, SecureRandom arg1) throws IllegalArgumentException {
        if (arg0 < 1) {
            throw new IllegalArgumentException(sprnvn.cfr_renamed_9("d{r^c|afn2kguf&pc2gf&~csuf&#"));
        }
        int n = (arg0 + 7) / 8;
        byte[] byArray = new byte[n];
        arg1.nextBytes(byArray);
        int n2 = 8 * n - arg0;
        byArray[0] = (byte)(byArray[0] & (byte)(255 >>> n2));
        return byArray;
    }

    public static BigInteger cfr_renamed_513(BigInteger arg0, BigInteger arg1, SecureRandom arg2) {
        int n;
        int n2 = arg0.compareTo(arg1);
        if (n2 >= 0) {
            if (n2 > 0) {
                throw new IllegalArgumentException(ChartTextArea.cfr_renamed_9("\\o\u0012l\\\"\u0016c\u0002\"\u0015m\u000f\"\u0019g[e\tg\u001av\u001ep[v\u0013c\u0015\"\\o\u001az\\"));
            }
            return arg0;
        }
        if (arg0.bitLength() > arg1.bitLength() / 2) {
            return sprhdf.cfr_renamed_513(cfr_renamed_0, arg1.subtract(arg0), arg2).add(arg0);
        }
        int n3 = n = 0;
        while (n3 < 1000) {
            BigInteger bigInteger = sprhdf.cfr_renamed_5230(arg1.bitLength(), arg2);
            if (bigInteger.compareTo(arg0) >= 0 && bigInteger.compareTo(arg1) <= 0) {
                return bigInteger;
            }
            n3 = ++n;
        }
        return sprhdf.cfr_renamed_5230(arg1.subtract(arg0).bitLength() - 1, arg2).add(arg0);
    }

    public static byte[] cfr_renamed_512(int arg0, BigInteger arg1) {
        byte[] byArray = arg1.toByteArray();
        if (byArray.length == arg0) {
            return byArray;
        }
        int n = byArray[0] == 0 && byArray.length != 1 ? 1 : 0;
        int n2 = byArray.length - n;
        if (n2 > arg0) {
            throw new IllegalArgumentException(sprnvn.cfr_renamed_9("ufg|bstv&~c|afn2cjewcvcv&ti`&dg~sw"));
        }
        byte[] byArray2 = new byte[arg0];
        System.arraycopy(byArray, n, byArray2, byArray2.length - n2, n2);
        return byArray2;
    }

    public static BigInteger cfr_renamed_5232(BigInteger arg0, BigInteger arg1) {
        int n;
        int[] nArray;
        int[] nArray2;
        if (!arg0.testBit(0)) {
            throw new IllegalArgumentException(ChartTextArea.cfr_renamed_9("\\O\\\"\u0016w\bv[`\u001e\"\u0014f\u001f"));
        }
        if (arg0.signum() != 1) {
            throw new ArithmeticException(sprnvn.cfr_renamed_9("D{a[hfcuc`<2k}bgjgu2h}r2v}u{r{pw"));
        }
        if (arg0.equals(cfr_renamed_2)) {
            return cfr_renamed_0;
        }
        if (arg1.signum() < 0 || arg1.compareTo(arg0) >= 0) {
            arg1 = arg1.mod(arg0);
        }
        if (arg1.equals(cfr_renamed_2)) {
            return cfr_renamed_2;
        }
        int n2 = arg0.bitLength();
        int[] nArray3 = sprvih.cfr_renamed_1720(n2, arg0);
        if (!sprqlh.cfr_renamed_5233(nArray3, nArray2 = sprvih.cfr_renamed_1720(n2, arg1), nArray = sprvih.cfr_renamed_1716(n = nArray3.length))) {
            throw new ArithmeticException(ChartTextArea.cfr_renamed_9("@\u0012e2l\u000fg\u001cg\t\"\u0015m\u000f\"\u0012l\rg\tv\u0012`\u0017gU"));
        }
        return sprvih.cfr_renamed_1704(n, nArray);
    }

    public static BigInteger cfr_renamed_5234(BigInteger arg0, BigInteger arg1) {
        int n;
        int[] nArray;
        int[] nArray2;
        int n2;
        int[] nArray3;
        if (!arg0.testBit(0)) {
            throw new IllegalArgumentException(sprnvn.cfr_renamed_9("5K5&\u007fsar2dw&}bv"));
        }
        if (arg0.signum() != 1) {
            throw new ArithmeticException(ChartTextArea.cfr_renamed_9("@\u0012e2l\u000fg\u001cg\t8[o\u0014f\u000en\u000eq[l\u0014v[r\u0014q\u0012v\u0012t\u001e"));
        }
        if (arg1.signum() < 0 || arg1.compareTo(arg0) >= 0) {
            arg1 = arg1.mod(arg0);
        }
        if (0 == sprqlh.cfr_renamed_5235(nArray3 = sprvih.cfr_renamed_1720(n2 = arg0.bitLength(), arg0), nArray2 = sprvih.cfr_renamed_1720(n2, arg1), nArray = sprvih.cfr_renamed_1716(n = nArray3.length))) {
            throw new ArithmeticException(sprnvn.cfr_renamed_9("D{a[hfcuc`&|if&{hdc`r{d~c<"));
        }
        return sprvih.cfr_renamed_1704(n, nArray);
    }

    public static BigInteger cfr_renamed_5236(int arg0, int arg1, SecureRandom arg2) {
        BigInteger bigInteger;
        if (arg0 < 2) {
            throw new IllegalArgumentException(ChartTextArea.cfr_renamed_9("\u0019k\u000fN\u001el\u001cv\u0013\"G\"I"));
        }
        if (arg0 == 2) {
            if (arg2.nextInt() < 0) {
                return cfr_renamed_91;
            }
            return cfr_renamed_1;
        }
        do {
            byte[] byArray = sprhdf.cfr_renamed_5231(arg0, arg2);
            int n = 8 * byArray.length - arg0;
            byte by = (byte)(1 << 7 - n);
            byte[] byArray2 = byArray;
            byArray2[0] = (byte)(byArray2[0] | by);
            int n2 = byArray.length - 1;
            byArray2[n2] = (byte)(byArray2[n2] | 1);
            bigInteger = new BigInteger(1, byArray);
            if (arg0 <= cfr_renamed_3) continue;
            BigInteger bigInteger2 = bigInteger;
            while (!bigInteger2.gcd(cfr_renamed_119).equals(cfr_renamed_2)) {
                bigInteger2 = bigInteger.add(cfr_renamed_91);
            }
        } while (!bigInteger.isProbablePrime(arg1));
        return bigInteger;
    }
}

