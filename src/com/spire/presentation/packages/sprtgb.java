/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgaa;
import com.spire.presentation.packages.sprdra;
import com.spire.presentation.packages.sprrhn;
import com.spire.presentation.packages.sprsma;
import com.spire.presentation.packages.sprzma;
import java.math.BigInteger;

public final class sprtgb {
    private static final BigInteger cfr_renamed_3 = BigInteger.valueOf(0L);
    private static final BigInteger cfr_renamed_4 = BigInteger.valueOf(1L);

    private /* synthetic */ sprtgb() {
    }

    public static sprsma cfr_renamed_1355(int arg0, int arg1, byte[] arg2) {
        int n;
        if (arg0 < arg1) {
            throw new IllegalArgumentException(sprbgaa.cfr_renamed_9("74e4-"));
        }
        BigInteger bigInteger = new BigInteger(1, arg2);
        BigInteger bigInteger2 = sprzma.cfr_renamed_920(arg0, arg1);
        if (bigInteger.compareTo(bigInteger2) >= 0) {
            throw new IllegalArgumentException(sprrhn.cfr_renamed_9("fo@nGdG!MtNcFs\u0003uLn\u0003mBsDd\r"));
        }
        sprsma sprsma2 = new sprsma(arg0);
        int n2 = arg0;
        int n3 = arg1;
        int n4 = n = 0;
        while (n4 < arg0) {
            BigInteger bigInteger3 = bigInteger2.multiply(BigInteger.valueOf(n2 - n3));
            long l = n2;
            --n2;
            bigInteger2 = bigInteger3.divide(BigInteger.valueOf(l));
            if (bigInteger2.compareTo(bigInteger) <= 0) {
                sprsma2.cfr_renamed_949(n);
                bigInteger = bigInteger.subtract(bigInteger2);
                bigInteger2 = n2 == --n3 ? cfr_renamed_4 : bigInteger2.multiply(BigInteger.valueOf(n3 + 1)).divide(BigInteger.valueOf(n2 - n3));
            }
            n4 = ++n;
        }
        return sprsma2;
    }

    public static byte[] cfr_renamed_1362(int arg0, int arg1, sprsma arg2) {
        int n;
        if (arg2.cfr_renamed_806() != arg0 || arg2.cfr_renamed_961() != arg1) {
            throw new IllegalArgumentException(sprbgaa.cfr_renamed_9("/q:`6fy|8gyc+{7syx<z>`146fy|8y4}7syc<}>|-"));
        }
        int[] nArray = arg2.cfr_renamed_959();
        BigInteger bigInteger = sprzma.cfr_renamed_920(arg0, arg1);
        BigInteger bigInteger2 = cfr_renamed_3;
        int n2 = arg0;
        int n3 = arg1;
        int n4 = n = 0;
        while (n4 < arg0) {
            BigInteger bigInteger3 = bigInteger.multiply(BigInteger.valueOf(n2 - n3));
            long l = n2;
            --n2;
            bigInteger = bigInteger3.divide(BigInteger.valueOf(l));
            int n5 = n >> 5;
            if ((nArray[n5] & 1 << (n & 0x1F)) != 0) {
                bigInteger2 = bigInteger2.add(bigInteger);
                bigInteger = n2 == --n3 ? cfr_renamed_4 : bigInteger.multiply(BigInteger.valueOf(n3 + 1)).divide(BigInteger.valueOf(n2 - n3));
            }
            n4 = ++n;
        }
        return sprdra.cfr_renamed_1126(bigInteger2);
    }

    public static byte[] cfr_renamed_1365(int arg0, int arg1, byte[] arg2) {
        int n;
        int n2;
        int n3;
        byte[] byArray;
        if (arg0 < arg1) {
            throw new IllegalArgumentException(sprrhn.cfr_renamed_9("M!\u001f!W"));
        }
        BigInteger bigInteger = sprzma.cfr_renamed_920(arg0, arg1);
        int n4 = bigInteger.bitLength() - 1;
        int n5 = n4 >> 3;
        int n6 = n4 & 7;
        if (n6 == 0) {
            n6 = 8;
            --n5;
        }
        int n7 = arg0 >> 3;
        int n8 = arg0 & 7;
        if (n8 == 0) {
            n8 = 8;
            --n7;
        }
        if (arg2.length < (byArray = new byte[n7 + 1]).length) {
            System.arraycopy(arg2, 0, byArray, 0, arg2.length);
            int n9 = n3 = arg2.length;
            while (n9 < byArray.length) {
                byArray[n3++] = 0;
                n9 = n3;
            }
        } else {
            System.arraycopy(arg2, 0, byArray, 0, n7);
            n3 = (1 << n8) - 1;
            int n10 = n7;
            byArray[n10] = (byte)(n3 & arg2[n10]);
        }
        BigInteger bigInteger2 = cfr_renamed_3;
        int n11 = arg0;
        int n12 = arg1;
        int n13 = n2 = 0;
        while (n13 < arg0) {
            BigInteger bigInteger3 = new BigInteger(Integer.toString(n11 - n12));
            String string = Integer.toString(n11);
            --n11;
            bigInteger = bigInteger.multiply(bigInteger3).divide(new BigInteger(string));
            int n14 = n2 >>> 3;
            n = n2 & 7;
            if ((byte)((n = 1 << n) & byArray[n14]) != 0) {
                bigInteger2 = bigInteger2.add(bigInteger);
                bigInteger = n11 == --n12 ? cfr_renamed_4 : bigInteger.multiply(new BigInteger(Integer.toString(n12 + 1))).divide(new BigInteger(Integer.toString(n11 - n12)));
            }
            n13 = ++n2;
        }
        byte[] byArray2 = new byte[n5 + 1];
        byte[] byArray3 = bigInteger2.toByteArray();
        if (byArray3.length < byArray2.length) {
            System.arraycopy(byArray3, 0, byArray2, 0, byArray3.length);
            int n15 = n = byArray3.length;
            while (n15 < byArray2.length) {
                byArray2[n++] = 0;
                n15 = n;
            }
        } else {
            System.arraycopy(byArray3, 0, byArray2, 0, n5);
            int n16 = n5;
            byArray2[n16] = (byte)((1 << n6) - 1 & byArray3[n16]);
        }
        return byArray2;
    }
}

