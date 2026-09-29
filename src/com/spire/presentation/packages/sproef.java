/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprnlaa;
import com.spire.presentation.packages.sprrkp;
import com.spire.presentation.packages.sprybl;
import java.math.BigInteger;
import java.security.SecureRandom;

public final class sproef {
    private static final int[] cfr_renamed_112;
    private static final BigInteger cfr_renamed_119;
    private static final int[] cfr_renamed_91;
    private static final BigInteger cfr_renamed_0;
    private static SecureRandom cfr_renamed_1;
    private static final BigInteger cfr_renamed_2;
    private static final long cfr_renamed_3 = 152125131763605L;
    private static final BigInteger cfr_renamed_4;

    public static BigInteger cfr_renamed_925(byte[] arg0, int arg1, int arg2) {
        byte[] byArray = new byte[arg2 + 1];
        byArray[0] = 0;
        System.arraycopy(arg0, arg1, byArray, 1, arg2);
        return new BigInteger(byArray);
    }

    public static int cfr_renamed_941(BigInteger arg0) {
        BigInteger bigInteger;
        int n = 0;
        BigInteger bigInteger2 = bigInteger = cfr_renamed_0;
        while (bigInteger2.compareTo(arg0) < 0) {
            ++n;
            bigInteger2 = bigInteger.shiftLeft(1);
        }
        return n;
    }

    public static int cfr_renamed_927(int arg0, int arg1) {
        int n;
        if (arg0 <= 0) {
            return -1;
        }
        int n2 = 0;
        int n3 = n = arg0;
        while (n3 > 1) {
            if (n % arg1 != 0) {
                return -1;
            }
            ++n2;
            n3 = n /= arg1;
        }
        return n2;
    }

    public static float cfr_renamed_935(int arg0, int arg1) {
        float f = arg0 / arg1;
        float f2 = 0.0f;
        int n = 0;
        float f3 = f2;
        while ((double)Math.abs(f3 - f) > 1.0E-4) {
            float f4;
            float f5 = sproef.cfr_renamed_918(f, arg1);
            while (Float.isInfinite(f5)) {
                f = (f + f2) / 2.0f;
                f5 = sproef.cfr_renamed_918(f, arg1);
            }
            ++n;
            float f6 = f2 = f;
            f = f6 - (f4 - (float)arg0) / ((float)arg1 * sproef.cfr_renamed_918(f6, arg1 - 1));
            f3 = f2;
        }
        return f;
    }

    private static /* synthetic */ double cfr_renamed_905(double arg0) {
        int n;
        double[] dArray = new double[100];
        dArray[0] = 1.0;
        dArray[1] = 0.5849625007211562;
        dArray[2] = 0.32192809488736235;
        dArray[3] = 0.16992500144231237;
        dArray[4] = 0.0874628412503394;
        dArray[5] = 0.044394119358453436;
        dArray[6] = 0.02236781302845451;
        dArray[7] = 0.01122725542325412;
        dArray[8] = 0.005624549193878107;
        dArray[9] = 0.0028150156070540383;
        dArray[10] = 0.0014081943928083889;
        dArray[11] = 7.042690112466433E-4;
        dArray[12] = 3.5217748030102726E-4;
        dArray[13] = 1.7609948644250602E-4;
        dArray[14] = 8.80524301221769E-5;
        dArray[15] = 4.4026886827316716E-5;
        dArray[16] = 2.2013611360340496E-5;
        dArray[17] = 1.1006847667481442E-5;
        dArray[18] = 5.503434330648604E-6;
        dArray[19] = 2.751719789561283E-6;
        dArray[20] = 1.375860550841138E-6;
        dArray[21] = 6.879304394358497E-7;
        dArray[22] = 3.4396526072176454E-7;
        dArray[23] = 1.7198264061184464E-7;
        dArray[24] = 8.599132286866321E-8;
        dArray[25] = 4.299566207501687E-8;
        dArray[26] = 2.1497831197679756E-8;
        dArray[27] = 1.0748915638882709E-8;
        dArray[28] = 5.374457829452062E-9;
        dArray[29] = 2.687228917228708E-9;
        dArray[30] = 1.3436144592400231E-9;
        dArray[31] = 6.718072297764289E-10;
        dArray[32] = 3.3590361492731876E-10;
        dArray[33] = 1.6795180747343547E-10;
        dArray[34] = 8.397590373916176E-11;
        dArray[35] = 4.1987951870191886E-11;
        dArray[36] = 2.0993975935248694E-11;
        dArray[37] = 1.0496987967662534E-11;
        dArray[38] = 5.2484939838408146E-12;
        dArray[39] = 2.624246991922794E-12;
        dArray[40] = 1.3121234959619935E-12;
        dArray[41] = 6.56061747981146E-13;
        dArray[42] = 3.2803087399061026E-13;
        dArray[43] = 1.6401543699531447E-13;
        dArray[44] = 8.200771849765956E-14;
        dArray[45] = 4.1003859248830365E-14;
        dArray[46] = 2.0501929624415328E-14;
        dArray[47] = 1.02509648122077E-14;
        dArray[48] = 5.1254824061038595E-15;
        dArray[49] = 2.5627412030519317E-15;
        dArray[50] = 1.2813706015259665E-15;
        dArray[51] = 6.406853007629834E-16;
        dArray[52] = 3.203426503814917E-16;
        dArray[53] = 1.6017132519074588E-16;
        dArray[54] = 8.008566259537294E-17;
        dArray[55] = 4.004283129768647E-17;
        dArray[56] = 2.0021415648843235E-17;
        dArray[57] = 1.0010707824421618E-17;
        dArray[58] = 5.005353912210809E-18;
        dArray[59] = 2.5026769561054044E-18;
        dArray[60] = 1.2513384780527022E-18;
        dArray[61] = 6.256692390263511E-19;
        dArray[62] = 3.1283461951317555E-19;
        dArray[63] = 1.5641730975658778E-19;
        dArray[64] = 7.820865487829389E-20;
        dArray[65] = 3.9104327439146944E-20;
        dArray[66] = 1.9552163719573472E-20;
        dArray[67] = 9.776081859786736E-21;
        dArray[68] = 4.888040929893368E-21;
        dArray[69] = 2.444020464946684E-21;
        dArray[70] = 1.222010232473342E-21;
        dArray[71] = 6.11005116236671E-22;
        dArray[72] = 3.055025581183355E-22;
        dArray[73] = 1.5275127905916775E-22;
        dArray[74] = 7.637563952958387E-23;
        dArray[75] = 3.818781976479194E-23;
        dArray[76] = 1.909390988239597E-23;
        dArray[77] = 9.546954941197984E-24;
        dArray[78] = 4.773477470598992E-24;
        dArray[79] = 2.386738735299496E-24;
        dArray[80] = 1.193369367649748E-24;
        dArray[81] = 5.96684683824874E-25;
        dArray[82] = 2.98342341912437E-25;
        dArray[83] = 1.491711709562185E-25;
        dArray[84] = 7.458558547810925E-26;
        dArray[85] = 3.7292792739054626E-26;
        dArray[86] = 1.8646396369527313E-26;
        dArray[87] = 9.323198184763657E-27;
        dArray[88] = 4.661599092381828E-27;
        dArray[89] = 2.330799546190914E-27;
        dArray[90] = 1.165399773095457E-27;
        dArray[91] = 5.826998865477285E-28;
        dArray[92] = 2.9134994327386427E-28;
        dArray[93] = 1.4567497163693213E-28;
        dArray[94] = 7.283748581846607E-29;
        dArray[95] = 3.6418742909233034E-29;
        dArray[96] = 1.8209371454616517E-29;
        dArray[97] = 9.104685727308258E-30;
        dArray[98] = 4.552342863654129E-30;
        dArray[99] = 2.2761714318270646E-30;
        double[] dArray2 = dArray;
        int n2 = 53;
        double d = 1.0;
        double d2 = 0.0;
        double d3 = 1.0;
        int n3 = n = 0;
        while (n3 < n2) {
            double d4;
            double d5 = d;
            double d6 = d5 + d5 * d3;
            if (d4 <= arg0) {
                d = d6;
                d2 += dArray2[n];
            }
            d3 *= 0.5;
            n3 = ++n;
        }
        return d2;
    }

    public static long cfr_renamed_940(long arg0, int arg1) {
        long l = 1L;
        int n = arg1;
        while (n > 0) {
            if ((arg1 & 1) == 1) {
                l *= arg0;
            }
            long l2 = arg0;
            arg0 = l2 * l2;
            n = arg1 >>> 1;
        }
        return l;
    }

    public static BigInteger cfr_renamed_934(BigInteger arg0) {
        if (cfr_renamed_1 == null) {
            cfr_renamed_1 = sprybl.cfr_renamed_2794();
        }
        return sproef.cfr_renamed_900(arg0, cfr_renamed_1);
    }

    public static int cfr_renamed_929(int arg0, int arg1) {
        int n = arg0 % arg1;
        int n2 = 1;
        if (n == 0) {
            throw new IllegalArgumentException(arg0 + sprnlaa.cfr_renamed_9("3\u000e`G}\bgGr\t3\u0002\u007f\u0002~\u0002}\u00133\buGIH;") + arg1 + sprrkp.cfr_renamed_9("Y\u0010]\u00138\u0019jM#Pp\u0019mVw\u0019n\\bWjWd_vU#Ml\u0019`VnIvMf\u0019jMp\u0019lKg\\q\u0017"));
        }
        int n3 = n;
        while (n3 != 1) {
            n *= arg0;
            if ((n %= arg1) < 0) {
                n += arg1;
            }
            ++n2;
            n3 = n;
        }
        return n2;
    }

    public static BigInteger cfr_renamed_902(BigInteger arg0, int arg1) {
        if (arg0.signum() < 0 || arg0.signum() == 0 || arg0.equals(cfr_renamed_0)) {
            return cfr_renamed_119;
        }
        BigInteger bigInteger = arg0.add(cfr_renamed_0);
        if (!bigInteger.testBit(0)) {
            bigInteger = bigInteger.add(cfr_renamed_0);
        }
        BigInteger bigInteger2 = bigInteger;
        while (true) {
            long l;
            if (bigInteger2.bitLength() > 6 && ((l = bigInteger.remainder(BigInteger.valueOf(152125131763605L)).longValue()) % 3L == 0L || l % 5L == 0L || l % 7L == 0L || l % 11L == 0L || l % 13L == 0L || l % 17L == 0L || l % 19L == 0L || l % 23L == 0L || l % 29L == 0L || l % 31L == 0L || l % 37L == 0L || l % 41L == 0L)) {
                bigInteger2 = bigInteger.add(cfr_renamed_119);
                continue;
            }
            if (bigInteger.bitLength() < 4) {
                return bigInteger;
            }
            if (bigInteger.isProbablePrime(arg1)) {
                return bigInteger;
            }
            bigInteger2 = bigInteger.add(cfr_renamed_119);
        }
    }

    public static int cfr_renamed_915(int arg0) {
        int n = 0;
        if (arg0 != 0) {
            int n2 = 1;
            int n3 = arg0;
            while ((n3 & n2) == 0) {
                ++n;
                n2 <<= 1;
                n3 = arg0;
            }
        }
        return n;
    }

    public static int cfr_renamed_942(int arg0, int arg1) {
        return BigInteger.valueOf(arg0).modInverse(BigInteger.valueOf(arg1)).intValue();
    }

    public static long cfr_renamed_943(long arg0, long arg1) {
        long l = arg0 % arg1;
        if (l < 0L) {
            l += arg1;
        }
        return l;
    }

    public static int cfr_renamed_916(int arg0, int arg1) {
        int n = 1;
        int n2 = arg1;
        while (n2 > 0) {
            if ((arg1 & 1) == 1) {
                n *= arg0;
            }
            int n3 = arg0;
            arg0 = n3 * n3;
            n2 = arg1 >>> 1;
        }
        return n;
    }

    public static BigInteger cfr_renamed_939(BigInteger[] arg0) {
        int n;
        int n2 = arg0.length;
        BigInteger bigInteger = arg0[0];
        int n3 = n = 1;
        while (n3 < n2) {
            BigInteger bigInteger2 = bigInteger;
            BigInteger bigInteger3 = bigInteger2.gcd(arg0[n]);
            BigInteger bigInteger4 = bigInteger2.multiply(arg0[n]);
            bigInteger = bigInteger4.divide(bigInteger3);
            n3 = ++n;
        }
        return bigInteger;
    }

    static {
        cfr_renamed_4 = BigInteger.valueOf(0L);
        cfr_renamed_0 = BigInteger.valueOf(1L);
        cfr_renamed_119 = BigInteger.valueOf(2L);
        cfr_renamed_2 = BigInteger.valueOf(4L);
        int[] nArray = new int[12];
        nArray[0] = 3;
        nArray[1] = 5;
        nArray[2] = 7;
        nArray[3] = 11;
        nArray[4] = 13;
        nArray[5] = 17;
        nArray[6] = 19;
        nArray[7] = 23;
        nArray[8] = 29;
        nArray[9] = 31;
        nArray[10] = 37;
        nArray[11] = 41;
        cfr_renamed_112 = nArray;
        cfr_renamed_1 = null;
        int[] nArray2 = new int[8];
        nArray2[0] = 0;
        nArray2[1] = 1;
        nArray2[2] = 0;
        nArray2[3] = -1;
        nArray2[4] = 0;
        nArray2[5] = -1;
        nArray2[6] = 0;
        nArray2[7] = 1;
        cfr_renamed_91 = nArray2;
    }

    public static int cfr_renamed_931(int arg0) {
        int n = 0;
        int n2 = arg0;
        while (n2 != 0) {
            n += arg0 & 1;
            n2 = arg0 >>> 1;
        }
        return n;
    }

    public static int cfr_renamed_830(int arg0, int arg1) {
        return BigInteger.valueOf(arg0).gcd(BigInteger.valueOf(arg1)).intValue();
    }

    public static double cfr_renamed_932(long arg0) {
        int n = sproef.cfr_renamed_922(BigInteger.valueOf(arg0));
        long l = 1 << n;
        double d = (double)arg0 / (double)l;
        d = sproef.cfr_renamed_905(d);
        return (double)n + d;
    }

    private /* synthetic */ sproef() {
    }

    public static BigInteger[] cfr_renamed_910(BigInteger arg0, BigInteger arg1) {
        BigInteger bigInteger = cfr_renamed_0;
        BigInteger bigInteger2 = cfr_renamed_4;
        BigInteger bigInteger3 = arg0;
        if (arg1.signum() != 0) {
            BigInteger bigInteger4;
            BigInteger bigInteger5 = cfr_renamed_4;
            BigInteger bigInteger6 = bigInteger4 = arg1;
            while (bigInteger6.signum() != 0) {
                BigInteger[] bigIntegerArray = bigInteger3.divideAndRemainder(bigInteger4);
                BigInteger bigInteger7 = bigIntegerArray[0];
                BigInteger bigInteger8 = bigIntegerArray[1];
                BigInteger bigInteger9 = bigInteger.subtract(bigInteger7.multiply(bigInteger5));
                bigInteger = bigInteger5;
                bigInteger3 = bigInteger4;
                bigInteger5 = bigInteger9;
                bigInteger6 = bigInteger8;
            }
            bigInteger2 = bigInteger3.subtract(arg0.multiply(bigInteger)).divide(arg1);
        }
        BigInteger[] bigIntegerArray = new BigInteger[3];
        bigIntegerArray[0] = bigInteger3;
        bigIntegerArray[1] = bigInteger;
        bigIntegerArray[2] = bigInteger2;
        return bigIntegerArray;
    }

    public static int cfr_renamed_913(int arg0) {
        if (arg0 <= 2) {
            return 1;
        }
        if (arg0 == 3) {
            return 2;
        }
        int n = (arg0 & 1) == 0 ? --arg0 : (arg0 -= 2);
        while (n > 3 && !sproef.cfr_renamed_914(arg0)) {
            n = arg0 -= 2;
        }
        return arg0;
    }

    public static int cfr_renamed_872(int arg0) {
        if (arg0 == 0) {
            return 1;
        }
        int n = arg0 < 0 ? -arg0 : arg0;
        int n2 = 0;
        int n3 = n;
        while (n3 > 0) {
            ++n2;
            n3 = n >>> 8;
        }
        return n2;
    }

    public static float cfr_renamed_918(float arg0, int arg1) {
        float f = 1.0f;
        int n = arg1;
        while (n > 0) {
            f *= arg0;
            n = --arg1;
        }
        return f;
    }

    public static BigInteger cfr_renamed_908(BigInteger arg0, BigInteger arg1) {
        if (arg0.signum() < 0) {
            return sproef.cfr_renamed_908(arg0.negate(), arg1).negate();
        }
        if (arg1.signum() < 0) {
            return sproef.cfr_renamed_908(arg0, arg1.negate()).negate();
        }
        return arg0.shiftLeft(1).add(arg1).divide(arg1.shiftLeft(1));
    }

    public static BigInteger[] cfr_renamed_938(BigInteger[] arg0, BigInteger arg1) {
        int n;
        BigInteger[] bigIntegerArray = new BigInteger[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            bigIntegerArray[n3] = sproef.cfr_renamed_908(arg0[n3], arg1);
            n2 = n;
        }
        return bigIntegerArray;
    }

    public static int cfr_renamed_903(int arg0) {
        int n;
        int n2 = 0;
        int n3 = n = 1;
        while (n3 < arg0) {
            ++n2;
            n3 = n <<= 1;
        }
        return n2;
    }

    public static int cfr_renamed_923(long arg0) {
        if (arg0 == 0L) {
            return 1;
        }
        long l = arg0 < 0L ? -arg0 : arg0;
        int n = 0;
        long l2 = l;
        while (l2 > 0L) {
            ++n;
            l2 = l >>> 8;
        }
        return n;
    }

    public static BigInteger cfr_renamed_906(BigInteger arg0) {
        if (arg0.compareTo(cfr_renamed_4) < 0) {
            throw new ArithmeticException(new StringBuilder().insert(0, sprnlaa.cfr_renamed_9("\u0004r\t}\bgGv\u001fg\u0015r\u0004gGa\b|\u00133\buG}\u0002t\u0006g\u000ee\u00023\tf\nq\u0002a")).append(arg0).append(".").toString());
        }
        int n = arg0.bitLength();
        BigInteger bigInteger = cfr_renamed_4;
        BigInteger bigInteger2 = cfr_renamed_4;
        if ((n & 1) != 0) {
            bigInteger = bigInteger.add(cfr_renamed_0);
        }
        block0: while (true) {
            int n2 = --n;
            while (n2 > 0) {
                BigInteger bigInteger3;
                int n3;
                bigInteger2 = bigInteger2.multiply(cfr_renamed_2);
                if (arg0.testBit(--n)) {
                    n3 = 2;
                    bigInteger3 = arg0;
                } else {
                    n3 = 0;
                    bigInteger3 = arg0;
                }
                bigInteger2 = bigInteger2.add(BigInteger.valueOf(n3 + (bigInteger3.testBit(--n) ? 1 : 0)));
                BigInteger bigInteger4 = bigInteger;
                BigInteger bigInteger5 = bigInteger4.multiply(cfr_renamed_2).add(cfr_renamed_0);
                bigInteger = bigInteger4.multiply(cfr_renamed_119);
                if (bigInteger2.compareTo(bigInteger5) == -1) continue block0;
                bigInteger = bigInteger.add(cfr_renamed_0);
                bigInteger2 = bigInteger2.subtract(bigInteger5);
                n2 = n;
            }
            break;
        }
        return bigInteger;
    }

    public static boolean cfr_renamed_914(int arg0) {
        if (arg0 < 2) {
            return false;
        }
        if (arg0 == 2) {
            return true;
        }
        if ((arg0 & 1) == 0) {
            return false;
        }
        if (arg0 < 42) {
            int n;
            int n2 = n = 0;
            while (n2 < cfr_renamed_112.length) {
                if (arg0 == cfr_renamed_112[n]) {
                    return true;
                }
                n2 = ++n;
            }
        }
        if (arg0 % 3 == 0 || arg0 % 5 == 0 || arg0 % 7 == 0 || arg0 % 11 == 0 || arg0 % 13 == 0 || arg0 % 17 == 0 || arg0 % 19 == 0 || arg0 % 23 == 0 || arg0 % 29 == 0 || arg0 % 31 == 0 || arg0 % 37 == 0 || arg0 % 41 == 0) {
            return false;
        }
        return BigInteger.valueOf(arg0).isProbablePrime(20);
    }

    public static boolean cfr_renamed_926(BigInteger arg0) {
        int n;
        int[] nArray = new int[239];
        nArray[0] = 2;
        nArray[1] = 3;
        nArray[2] = 5;
        nArray[3] = 7;
        nArray[4] = 11;
        nArray[5] = 13;
        nArray[6] = 17;
        nArray[7] = 19;
        nArray[8] = 23;
        nArray[9] = 29;
        nArray[10] = 31;
        nArray[11] = 37;
        nArray[12] = 41;
        nArray[13] = 43;
        nArray[14] = 47;
        nArray[15] = 53;
        nArray[16] = 59;
        nArray[17] = 61;
        nArray[18] = 67;
        nArray[19] = 71;
        nArray[20] = 73;
        nArray[21] = 79;
        nArray[22] = 83;
        nArray[23] = 89;
        nArray[24] = 97;
        nArray[25] = 101;
        nArray[26] = 103;
        nArray[27] = 107;
        nArray[28] = 109;
        nArray[29] = 113;
        nArray[30] = 127;
        nArray[31] = 131;
        nArray[32] = 137;
        nArray[33] = 139;
        nArray[34] = 149;
        nArray[35] = 151;
        nArray[36] = 157;
        nArray[37] = 163;
        nArray[38] = 167;
        nArray[39] = 173;
        nArray[40] = 179;
        nArray[41] = 181;
        nArray[42] = 191;
        nArray[43] = 193;
        nArray[44] = 197;
        nArray[45] = 199;
        nArray[46] = 211;
        nArray[47] = 223;
        nArray[48] = 227;
        nArray[49] = 229;
        nArray[50] = 233;
        nArray[51] = 239;
        nArray[52] = 241;
        nArray[53] = 251;
        nArray[54] = 257;
        nArray[55] = 263;
        nArray[56] = 269;
        nArray[57] = 271;
        nArray[58] = 277;
        nArray[59] = 281;
        nArray[60] = 283;
        nArray[61] = 293;
        nArray[62] = 307;
        nArray[63] = 311;
        nArray[64] = 313;
        nArray[65] = 317;
        nArray[66] = 331;
        nArray[67] = 337;
        nArray[68] = 347;
        nArray[69] = 349;
        nArray[70] = 353;
        nArray[71] = 359;
        nArray[72] = 367;
        nArray[73] = 373;
        nArray[74] = 379;
        nArray[75] = 383;
        nArray[76] = 389;
        nArray[77] = 397;
        nArray[78] = 401;
        nArray[79] = 409;
        nArray[80] = 419;
        nArray[81] = 421;
        nArray[82] = 431;
        nArray[83] = 433;
        nArray[84] = 439;
        nArray[85] = 443;
        nArray[86] = 449;
        nArray[87] = 457;
        nArray[88] = 461;
        nArray[89] = 463;
        nArray[90] = 467;
        nArray[91] = 479;
        nArray[92] = 487;
        nArray[93] = 491;
        nArray[94] = 499;
        nArray[95] = 503;
        nArray[96] = 509;
        nArray[97] = 521;
        nArray[98] = 523;
        nArray[99] = 541;
        nArray[100] = 547;
        nArray[101] = 557;
        nArray[102] = 563;
        nArray[103] = 569;
        nArray[104] = 571;
        nArray[105] = 577;
        nArray[106] = 587;
        nArray[107] = 593;
        nArray[108] = 599;
        nArray[109] = 601;
        nArray[110] = 607;
        nArray[111] = 613;
        nArray[112] = 617;
        nArray[113] = 619;
        nArray[114] = 631;
        nArray[115] = 641;
        nArray[116] = 643;
        nArray[117] = 647;
        nArray[118] = 653;
        nArray[119] = 659;
        nArray[120] = 661;
        nArray[121] = 673;
        nArray[122] = 677;
        nArray[123] = 683;
        nArray[124] = 691;
        nArray[125] = 701;
        nArray[126] = 709;
        nArray[127] = 719;
        nArray[128] = 727;
        nArray[129] = 733;
        nArray[130] = 739;
        nArray[131] = 743;
        nArray[132] = 751;
        nArray[133] = 757;
        nArray[134] = 761;
        nArray[135] = 769;
        nArray[136] = 773;
        nArray[137] = 787;
        nArray[138] = 797;
        nArray[139] = 809;
        nArray[140] = 811;
        nArray[141] = 821;
        nArray[142] = 823;
        nArray[143] = 827;
        nArray[144] = 829;
        nArray[145] = 839;
        nArray[146] = 853;
        nArray[147] = 857;
        nArray[148] = 859;
        nArray[149] = 863;
        nArray[150] = 877;
        nArray[151] = 881;
        nArray[152] = 883;
        nArray[153] = 887;
        nArray[154] = 907;
        nArray[155] = 911;
        nArray[156] = 919;
        nArray[157] = 929;
        nArray[158] = 937;
        nArray[159] = 941;
        nArray[160] = 947;
        nArray[161] = 953;
        nArray[162] = 967;
        nArray[163] = 971;
        nArray[164] = 977;
        nArray[165] = 983;
        nArray[166] = 991;
        nArray[167] = 997;
        nArray[168] = 1009;
        nArray[169] = 1013;
        nArray[170] = 1019;
        nArray[171] = 1021;
        nArray[172] = 1031;
        nArray[173] = 1033;
        nArray[174] = 1039;
        nArray[175] = 1049;
        nArray[176] = 1051;
        nArray[177] = 1061;
        nArray[178] = 1063;
        nArray[179] = 1069;
        nArray[180] = 1087;
        nArray[181] = 1091;
        nArray[182] = 1093;
        nArray[183] = 1097;
        nArray[184] = 1103;
        nArray[185] = 1109;
        nArray[186] = 1117;
        nArray[187] = 1123;
        nArray[188] = 1129;
        nArray[189] = 1151;
        nArray[190] = 1153;
        nArray[191] = 1163;
        nArray[192] = 1171;
        nArray[193] = 1181;
        nArray[194] = 1187;
        nArray[195] = 1193;
        nArray[196] = 1201;
        nArray[197] = 1213;
        nArray[198] = 1217;
        nArray[199] = 1223;
        nArray[200] = 1229;
        nArray[201] = 1231;
        nArray[202] = 1237;
        nArray[203] = 1249;
        nArray[204] = 1259;
        nArray[205] = 1277;
        nArray[206] = 1279;
        nArray[207] = 1283;
        nArray[208] = 1289;
        nArray[209] = 1291;
        nArray[210] = 1297;
        nArray[211] = 1301;
        nArray[212] = 1303;
        nArray[213] = 1307;
        nArray[214] = 1319;
        nArray[215] = 1321;
        nArray[216] = 1327;
        nArray[217] = 1361;
        nArray[218] = 1367;
        nArray[219] = 1373;
        nArray[220] = 1381;
        nArray[221] = 1399;
        nArray[222] = 1409;
        nArray[223] = 1423;
        nArray[224] = 1427;
        nArray[225] = 1429;
        nArray[226] = 1433;
        nArray[227] = 1439;
        nArray[228] = 1447;
        nArray[229] = 1451;
        nArray[230] = 1453;
        nArray[231] = 1459;
        nArray[232] = 1471;
        nArray[233] = 1481;
        nArray[234] = 1483;
        nArray[235] = 1487;
        nArray[236] = 1489;
        nArray[237] = 1493;
        nArray[238] = 1499;
        int[] nArray2 = nArray;
        int n2 = n = 0;
        while (n2 < nArray2.length) {
            if (arg0.mod(BigInteger.valueOf(nArray2[n])).equals(cfr_renamed_4)) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static boolean cfr_renamed_933(int[] arg0) {
        int n;
        int n2 = n = 1;
        while (n2 < arg0.length) {
            if (arg0[n - 1] >= arg0[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public static BigInteger cfr_renamed_924(byte[] byArray) {
        byte[] arg0;
        return sproef.cfr_renamed_925(arg0, 0, arg0.length);
    }

    public static int cfr_renamed_917(BigInteger arg0, BigInteger arg1) {
        long l = 1L;
        l = 1L;
        if (arg1.equals(cfr_renamed_4)) {
            BigInteger bigInteger = arg0.abs();
            if (bigInteger.equals(cfr_renamed_0)) {
                return 1;
            }
            return 0;
        }
        if (!arg0.testBit(0) && !arg1.testBit(0)) {
            return 0;
        }
        BigInteger bigInteger = arg0;
        BigInteger bigInteger2 = arg1;
        if (bigInteger2.signum() == -1) {
            bigInteger2 = bigInteger2.negate();
            if (bigInteger.signum() == -1) {
                l = -1L;
            }
        }
        BigInteger bigInteger3 = cfr_renamed_4;
        BigInteger bigInteger4 = bigInteger2;
        while (!bigInteger4.testBit(0)) {
            bigInteger3 = bigInteger3.add(cfr_renamed_0);
            bigInteger4 = bigInteger2.divide(cfr_renamed_119);
        }
        if (bigInteger3.testBit(0)) {
            l *= (long)cfr_renamed_91[bigInteger.intValue() & 7];
        }
        if (bigInteger.signum() < 0) {
            if (bigInteger2.testBit(1)) {
                l = -l;
            }
            bigInteger = bigInteger.negate();
        }
        BigInteger bigInteger5 = bigInteger;
        while (bigInteger5.signum() != 0) {
            bigInteger3 = cfr_renamed_4;
            BigInteger bigInteger6 = bigInteger;
            while (!bigInteger6.testBit(0)) {
                bigInteger3 = bigInteger3.add(cfr_renamed_0);
                bigInteger6 = bigInteger.divide(cfr_renamed_119);
            }
            if (bigInteger3.testBit(0)) {
                l *= (long)cfr_renamed_91[bigInteger2.intValue() & 7];
            }
            if (bigInteger.compareTo(bigInteger2) < 0) {
                BigInteger bigInteger7 = bigInteger;
                bigInteger = bigInteger2;
                bigInteger2 = bigInteger7;
                if (bigInteger.testBit(1) && bigInteger2.testBit(1)) {
                    l = -l;
                }
            }
            bigInteger5 = bigInteger.subtract(bigInteger2);
        }
        if (bigInteger2.equals(cfr_renamed_0)) {
            return (int)l;
        }
        return 0;
    }

    public static BigInteger cfr_renamed_901(BigInteger arg0) {
        return sproef.cfr_renamed_902(arg0, 20);
    }

    public static double cfr_renamed_904(double arg0) {
        double d;
        if (arg0 > 0.0 && arg0 < 1.0) {
            double d2 = 1.0 / arg0;
            return -sproef.cfr_renamed_904(d2);
        }
        int n = 0;
        double d3 = 1.0;
        double d4 = d = arg0;
        while (d4 > 2.0) {
            ++n;
            d3 *= 2.0;
            d4 = d /= 2.0;
        }
        double d5 = arg0 / d3;
        d5 = sproef.cfr_renamed_905(d5);
        return (double)n + d5;
    }

    public static int[] cfr_renamed_912(int arg0, int arg1) {
        int[] nArray;
        BigInteger bigInteger = BigInteger.valueOf(arg0);
        BigInteger bigInteger2 = BigInteger.valueOf(arg1);
        BigInteger[] bigIntegerArray = sproef.cfr_renamed_910(bigInteger, bigInteger2);
        int[] nArray2 = nArray = new int[3];
        nArray[0] = bigIntegerArray[0].intValue();
        nArray2[1] = bigIntegerArray[1].intValue();
        nArray[2] = bigIntegerArray[2].intValue();
        return nArray2;
    }

    public static int cfr_renamed_922(BigInteger arg0) {
        BigInteger bigInteger;
        int n = -1;
        BigInteger bigInteger2 = bigInteger = cfr_renamed_0;
        while (bigInteger2.compareTo(arg0) <= 0) {
            ++n;
            bigInteger2 = bigInteger.shiftLeft(1);
        }
        return n;
    }

    public static int cfr_renamed_911(int arg0) {
        int n;
        if (arg0 < 0) {
            arg0 = -arg0;
        }
        if (arg0 == 0) {
            return 1;
        }
        if ((arg0 & 1) == 0) {
            return 2;
        }
        int n2 = n = 3;
        while (n2 <= arg0 / n) {
            if (arg0 % n == 0) {
                return n;
            }
            n2 = n += 2;
        }
        return arg0;
    }

    public static BigInteger cfr_renamed_907(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        return arg0.subtract(arg1).mod(arg2.subtract(arg1)).add(arg1);
    }

    public static BigInteger cfr_renamed_920(int arg0, int arg1) {
        int n;
        BigInteger bigInteger = cfr_renamed_0;
        if (arg0 == 0) {
            if (arg1 == 0) {
                return bigInteger;
            }
            return cfr_renamed_4;
        }
        if (arg1 > arg0 >>> 1) {
            arg1 = arg0 - arg1;
        }
        int n2 = n = 1;
        while (n2 <= arg1) {
            BigInteger bigInteger2 = bigInteger.multiply(BigInteger.valueOf(arg0 - (n - 1)));
            long l = n;
            bigInteger = bigInteger2.divide(BigInteger.valueOf(l));
            n2 = ++n;
        }
        return bigInteger;
    }

    public static byte[] cfr_renamed_909(BigInteger arg0) {
        BigInteger bigInteger = arg0;
        byte[] byArray = bigInteger.abs().toByteArray();
        if ((bigInteger.bitLength() & 7) != 0) {
            return byArray;
        }
        byte[] byArray2 = new byte[arg0.bitLength() >> 3];
        System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
        return byArray2;
    }

    public static int cfr_renamed_930(int arg0, int arg1, int arg2) {
        if (arg2 <= 0 || (long)arg2 * (long)arg2 > Integer.MAX_VALUE || arg1 < 0) {
            return 0;
        }
        int n = 1;
        arg0 = (arg0 % arg2 + arg2) % arg2;
        int n2 = arg1;
        while (n2 > 0) {
            if ((arg1 & 1) == 1) {
                n = n * arg0 % arg2;
            }
            int n3 = arg0;
            arg0 = n3 * n3 % arg2;
            n2 = arg1 >>> 1;
        }
        return n;
    }

    public static BigInteger cfr_renamed_900(BigInteger arg0, SecureRandom arg1) {
        int n;
        int n2 = arg0.bitLength();
        BigInteger bigInteger = BigInteger.valueOf(0L);
        if (arg1 == null) {
            arg1 = cfr_renamed_1 != null ? cfr_renamed_1 : sprybl.cfr_renamed_2794();
        }
        int n3 = n = 0;
        while (n3 < 20) {
            bigInteger = sprhdf.cfr_renamed_5230(n2, arg1);
            if (bigInteger.compareTo(arg0) < 0) {
                return bigInteger;
            }
            n3 = ++n;
        }
        return bigInteger.mod(arg0);
    }

    public static long cfr_renamed_936(long arg0, long arg1) {
        return BigInteger.valueOf(arg0).modInverse(BigInteger.valueOf(arg1)).longValue();
    }

    public static BigInteger cfr_renamed_937(long arg0) {
        long l;
        boolean bl = false;
        long l2 = 0L;
        if (arg0 <= 1L) {
            return BigInteger.valueOf(2L);
        }
        if (arg0 == 2L) {
            return BigInteger.valueOf(3L);
        }
        long l3 = l = arg0 + 1L + (arg0 & 1L);
        while (l3 <= arg0 << 1 && !bl) {
            long l4;
            long l5;
            long l6 = l5 = 3L;
            while (l6 <= l >> 1 && !bl) {
                if (l % l5 == 0L) {
                    bl = true;
                }
                l6 = l5 + 2L;
            }
            if (bl) {
                bl = false;
                l4 = l;
            } else {
                l2 = l;
                bl = true;
                l4 = l;
            }
            l3 = l4 + 2L;
        }
        return BigInteger.valueOf(l2);
    }

    public static int cfr_renamed_921(int arg0) {
        int n;
        int n2 = 0;
        if (arg0 <= 0) {
            return -1;
        }
        int n3 = n = arg0 >>> 1;
        while (n3 > 0) {
            ++n2;
            n3 = n >>> 1;
        }
        return n2;
    }
}

