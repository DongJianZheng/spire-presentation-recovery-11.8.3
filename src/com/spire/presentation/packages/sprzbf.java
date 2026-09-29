/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkgba;
import com.spire.presentation.packages.sprmdf;
import com.spire.presentation.packages.sproze;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class sprzbf {
    private static final int[] cfr_renamed_0;
    private static final int[] cfr_renamed_1;
    private static final int[] cfr_renamed_2;
    private static final int[] cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    public static int[] cfr_renamed_720(InputStream arg0, int arg1, int arg2) throws IOException {
        int n = 31 - Integer.numberOfLeadingZeros(arg2);
        int n2 = (arg1 * n + 7) / 8;
        return sprzbf.cfr_renamed_719(sprmdf.cfr_renamed_704(arg0, n2), arg1, arg2);
    }

    public static byte[] cfr_renamed_717(int[] arg0) {
        byte[] byArray = new byte[((arg0.length * 3 + 1) / 2 + 7) / 8];
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (n3 < arg0.length / 2 * 2) {
            int n4;
            int n5 = arg0[n3] + 1;
            int n6 = n5;
            int n7 = arg0[++n3] + 1;
            ++n3;
            int n8 = n7;
            if (n6 == 0 && n8 == 0) {
                throw new IllegalStateException(sprkgba.cfr_renamed_9("%z\u0000s\u000bw\u00006\tx\u000fy\b\u007f\u0002qM"));
            }
            int n9 = n6 * 3 + n8;
            int[] nArray = new int[3];
            nArray[0] = cfr_renamed_0[n9];
            nArray[1] = cfr_renamed_3[n9];
            nArray[2] = cfr_renamed_2[n9];
            int[] nArray2 = nArray;
            int n10 = n4 = 0;
            while (n10 < 3) {
                int n11 = n2++;
                byArray[n11] = (byte)(byArray[n11] | nArray2[n4] << n);
                n = n == 7 ? 0 : ++n;
                n10 = ++n4;
            }
        }
        return byArray;
    }

    public static byte[] cfr_renamed_715(int[] arg0) {
        int n;
        BigInteger bigInteger = BigInteger.ZERO;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(3L));
            long l = arg0[n] + 1;
            bigInteger = bigInteger.add(BigInteger.valueOf(l));
            n2 = --n;
        }
        n = (BigInteger.valueOf(3L).pow(arg0.length).bitLength() + 7) / 8;
        byte[] byArray = bigInteger.toByteArray();
        if (byArray.length < n) {
            byte[] byArray2 = new byte[n];
            System.arraycopy(byArray, 0, byArray2, n - byArray.length, byArray.length);
            return byArray2;
        }
        if (byArray.length > n) {
            byArray = sproze.cfr_renamed_533(byArray, 1, byArray.length);
        }
        return byArray;
    }

    static {
        int[] nArray = new int[8];
        nArray[0] = 0;
        nArray[1] = 0;
        nArray[2] = 0;
        nArray[3] = 1;
        nArray[4] = 1;
        nArray[5] = 1;
        nArray[6] = -1;
        nArray[7] = -1;
        cfr_renamed_1 = nArray;
        int[] nArray2 = new int[8];
        nArray2[0] = 0;
        nArray2[1] = 1;
        nArray2[2] = -1;
        nArray2[3] = 0;
        nArray2[4] = 1;
        nArray2[5] = -1;
        nArray2[6] = 0;
        nArray2[7] = 1;
        cfr_renamed_4 = nArray2;
        int[] nArray3 = new int[9];
        nArray3[0] = 1;
        nArray3[1] = 1;
        nArray3[2] = 1;
        nArray3[3] = 0;
        nArray3[4] = 0;
        nArray3[5] = 0;
        nArray3[6] = 1;
        nArray3[7] = 0;
        nArray3[8] = 1;
        cfr_renamed_0 = nArray3;
        int[] nArray4 = new int[9];
        nArray4[0] = 1;
        nArray4[1] = 1;
        nArray4[2] = 1;
        nArray4[3] = 1;
        nArray4[4] = 0;
        nArray4[5] = 0;
        nArray4[6] = 0;
        nArray4[7] = 1;
        nArray4[8] = 0;
        cfr_renamed_3 = nArray4;
        int[] nArray5 = new int[9];
        nArray5[0] = 1;
        nArray5[1] = 0;
        nArray5[2] = 1;
        nArray5[3] = 0;
        nArray5[4] = 0;
        nArray5[5] = 1;
        nArray5[6] = 1;
        nArray5[7] = 1;
        nArray5[8] = 0;
        cfr_renamed_2 = nArray5;
    }

    public static int[] cfr_renamed_716(byte[] arg0, int arg1) {
        int n;
        BigInteger bigInteger = new BigInteger(1, arg0);
        int[] nArray = new int[arg1];
        int n2 = n = 0;
        while (n2 < arg1) {
            nArray[n] = bigInteger.mod(BigInteger.valueOf(3L)).intValue() - 1;
            if (nArray[n] > 1) {
                int n3 = n;
                nArray[n3] = nArray[n3] - 3;
            }
            bigInteger = bigInteger.divide(BigInteger.valueOf(3L));
            n2 = ++n;
        }
        return nArray;
    }

    public static int[] cfr_renamed_713(byte[] arg0, int arg1) {
        int[] nArray = new int[arg1];
        int n = 0;
        for (int i = 0; i < arg0.length * 8; ++i) {
            int n2 = sprzbf.cfr_renamed_714(arg0, i);
            int n3 = sprzbf.cfr_renamed_714(arg0, ++i);
            int n4 = sprzbf.cfr_renamed_714(arg0, ++i);
            int n5 = n2 * 4 + n3 * 2 + n4;
            nArray[n++] = cfr_renamed_1[n5];
            nArray[n++] = cfr_renamed_4[n5];
            if (n <= arg1 - 2) continue;
            return nArray;
        }
        return nArray;
    }

    private static /* synthetic */ int cfr_renamed_714(byte[] arg0, int arg1) {
        int n = arg1 / 8;
        return (arg0[n] & 0xFF) >> arg1 % 8 & 1;
    }

    public static int[] cfr_renamed_721(InputStream arg0, int arg1) throws IOException {
        int n = (int)Math.ceil((double)arg1 * Math.log(3.0) / Math.log(2.0) / 8.0);
        return sprzbf.cfr_renamed_716(sprmdf.cfr_renamed_704(arg0, n), arg1);
    }

    public static int[] cfr_renamed_719(byte[] arg0, int arg1, int arg2) {
        int n;
        int[] nArray = new int[arg1];
        int n2 = 31 - Integer.numberOfLeadingZeros(arg2);
        int n3 = arg1 * n2;
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < n3) {
            if (n <= 0 || n % n2 == 0) {
                // empty if block
            }
            int n6 = sprzbf.cfr_renamed_714(arg0, n);
            int n7 = ++n4;
            int n8 = nArray[n7] + (n6 << n % n2);
            nArray[n7] = n8;
            n5 = ++n;
        }
        return nArray;
    }

    public static byte[] cfr_renamed_718(int[] arg0, int arg1) {
        int n;
        int n2 = 31 - Integer.numberOfLeadingZeros(arg1);
        byte[] byArray = new byte[(arg0.length * n2 + 7) / 8];
        int n3 = 0;
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < arg0.length) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < n2) {
                int n8 = arg0[n] >> n6 & 1;
                int n9 = n4++;
                byArray[n9] = (byte)(byArray[n9] | n8 << n3);
                n3 = n3 == 7 ? 0 : ++n3;
                n7 = ++n6;
            }
            n5 = ++n;
        }
        return byArray;
    }
}

