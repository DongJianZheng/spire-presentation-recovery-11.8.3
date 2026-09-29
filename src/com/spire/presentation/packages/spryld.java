/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprced;
import com.spire.presentation.packages.sprhky;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprltq;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spryld {
    public static final BigInteger cfr_renamed_3 = BigInteger.valueOf(0L);
    public static final BigInteger cfr_renamed_4 = BigInteger.valueOf(1L);

    public static BigInteger cfr_renamed_3906(char[] arg0) {
        return new BigInteger(sprywa.cfr_renamed_432(arg0));
    }

    public static BigInteger cfr_renamed_3907(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3) {
        return arg2.modPow(arg3, arg0);
    }

    public static BigInteger cfr_renamed_3908(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        return arg1.modPow(arg2, arg0);
    }

    public static BigInteger cfr_renamed_3909(BigInteger arg0, SecureRandom arg1) {
        BigInteger bigInteger = cfr_renamed_3;
        BigInteger bigInteger2 = arg0.subtract(cfr_renamed_4);
        return sprvpa.cfr_renamed_513(bigInteger, bigInteger2, arg1);
    }

    public static BigInteger cfr_renamed_3910(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3) {
        return arg1.multiply(arg2).multiply(arg3).mod(arg0);
    }

    private static /* synthetic */ byte[] cfr_renamed_3911(BigInteger arg0, sprlc arg1) {
        sprlc sprlc2 = arg1;
        sprlc sprlc3 = arg1;
        arg1.cfr_renamed_41();
        spryld.cfr_renamed_3912(sprlc3, arg0);
        spryld.cfr_renamed_3913(sprlc2, sprltq.cfr_renamed_9("+3 ($<* "));
        byte[] byArray = new byte[sprlc3.cfr_renamed_1218()];
        sprlc2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    private static /* synthetic */ void cfr_renamed_3914(spruc arg0, String arg1) {
        byte[] byArray = sprywa.cfr_renamed_431(arg1);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sprzra.cfr_renamed_492(byArray, (byte)0);
    }

    public static void cfr_renamed_3915(String arg0, String arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4, BigInteger arg5, BigInteger arg6, sprlc arg7, BigInteger arg8) throws sprvmd {
        if (!spryld.cfr_renamed_3916(arg1, arg0, arg4, arg5, arg2, arg3, arg6, arg7).equals(arg8)) {
            throw new sprvmd(sprhky.cfr_renamed_9("-=\u000f(\u00139\u000f|0=\u001e\b\u001c;]*\u001c0\u00148\u001c(\u00143\u0013|\u001b=\u00140\u00188S|)4\u0018.\u0018:\u0012.\u0018p](\u00159],\u001c/\u000e+\u0012.\u0019p]\u0011<\u001fQ|\u0012.]8\u0014;\u0018/\t|\u001c0\u001a3\u000f5\t4\u0010|\u0012:]9\u001c?\u0015|\r=\u000f(\u0014?\u0014,\u001c2\t|\u00193\u0018/]2\u0012(]1\u001c(\u001e4S"));
        }
    }

    private static /* synthetic */ void cfr_renamed_3912(sprlc arg0, BigInteger arg1) {
        byte[] byArray = sprvpa.cfr_renamed_514(arg1);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sprzra.cfr_renamed_492(byArray, (byte)0);
    }

    public static void cfr_renamed_3917(String arg0, String arg1) throws sprvmd {
        if (arg0.equals(arg1)) {
            throw new sprvmd(new StringBuilder().insert(0, sprltq.cfr_renamed_9("#\f\u0015\u000bA\u0013\u0000\u0011\u0015\n\u0002\n\u0011\u0002\u000f\u0017\u0012C\u0000\u0011\u0004C\u0014\u0010\b\r\u0006C\u0015\u000b\u0004C\u0012\u0002\f\u0006A\u0013\u0000\u0011\u0015\n\u0002\n\u0011\u0002\u000f\u0017(\u0007AK")).append(arg0).append(sprhky.cfr_renamed_9("uS|)4\u0014/]5\u000e|\u00133\t|\u001c0\u00113\n9\u0019r]")).append(sprltq.cfr_renamed_9("&\u0000\u0000\tC\u0011\u0002\u0013\u0017\b\u0000\b\u0013\u0000\r\u0015C\f\u0016\u0012\u0017A\u0016\u0012\u0006A\u0002A\u0016\u000f\n\u0010\u0016\u0004C\u0011\u0002\u0013\u0017\b\u0000\b\u0013\u0000\r\u0015*\u0005M")).toString());
        }
    }

    private static /* synthetic */ void cfr_renamed_3913(sprlc arg0, String arg1) {
        byte[] byArray = sprywa.cfr_renamed_431(arg1);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sprzra.cfr_renamed_492(byArray, (byte)0);
    }

    private static /* synthetic */ void cfr_renamed_3918(sprlc arg0, BigInteger arg1) {
        byte[] byArray = sprvpa.cfr_renamed_514(arg1);
        arg0.cfr_renamed_1197(spryld.cfr_renamed_3696(byArray.length), 0, 4);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sprzra.cfr_renamed_492(byArray, (byte)0);
    }

    public static BigInteger cfr_renamed_3919(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        return arg1.multiply(arg2).mod(arg0);
    }

    public static BigInteger[] cfr_renamed_3920(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4, String arg5, sprlc arg6, SecureRandom arg7) {
        BigInteger[] bigIntegerArray = new BigInteger[2];
        BigInteger bigInteger = cfr_renamed_3;
        BigInteger bigInteger2 = arg1.subtract(cfr_renamed_4);
        BigInteger bigInteger3 = sprvpa.cfr_renamed_513(bigInteger, bigInteger2, arg7);
        BigInteger bigInteger4 = arg2;
        BigInteger bigInteger5 = bigInteger4.modPow(bigInteger3, arg0);
        BigInteger bigInteger6 = spryld.cfr_renamed_3921(bigInteger4, bigInteger5, arg3, arg5, arg6);
        BigInteger[] bigIntegerArray2 = bigIntegerArray;
        bigIntegerArray2[0] = bigInteger5;
        bigIntegerArray[1] = bigInteger3.subtract(arg4.multiply(bigInteger6)).mod(arg1);
        return bigIntegerArray2;
    }

    public static BigInteger cfr_renamed_3922(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4, BigInteger arg5) {
        return arg2.modPow(arg3.multiply(arg4).negate().mod(arg1), arg0).multiply(arg5).modPow(arg3, arg0);
    }

    private static /* synthetic */ BigInteger cfr_renamed_3921(BigInteger arg0, BigInteger arg1, BigInteger arg2, String arg3, sprlc arg4) {
        sprlc sprlc2 = arg4;
        sprlc sprlc3 = arg4;
        sprlc sprlc4 = arg4;
        arg4.cfr_renamed_41();
        spryld.cfr_renamed_3918(sprlc4, arg0);
        spryld.cfr_renamed_3918(sprlc4, arg1);
        spryld.cfr_renamed_3918(sprlc3, arg2);
        spryld.cfr_renamed_3923(sprlc2, arg3);
        byte[] byArray = new byte[sprlc3.cfr_renamed_1218()];
        sprlc2.cfr_renamed_1219(byArray, 0);
        return new BigInteger(byArray);
    }

    public static BigInteger cfr_renamed_3916(String arg0, String arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4, BigInteger arg5, BigInteger arg6, sprlc arg7) {
        byte[] byArray = spryld.cfr_renamed_3911(arg6, arg7);
        sprced sprced2 = new sprced(arg7);
        byte[] byArray2 = new byte[sprced2.cfr_renamed_2404()];
        sprced2.cfr_renamed_1524(new sprnld(byArray));
        spryld.cfr_renamed_3914(sprced2, sprhky.cfr_renamed_9("\u0017>\u0003L\u0003("));
        spryld.cfr_renamed_3914(sprced2, arg0);
        spryld.cfr_renamed_3914(sprced2, arg1);
        spryld.cfr_renamed_3924(sprced2, arg2);
        spryld.cfr_renamed_3924(sprced2, arg3);
        spryld.cfr_renamed_3924(sprced2, arg4);
        spryld.cfr_renamed_3924(sprced2, arg5);
        sprced2.cfr_renamed_1219(byArray2, 0);
        sprzra.cfr_renamed_492(byArray, (byte)0);
        return new BigInteger(byArray2);
    }

    public static void cfr_renamed_3925(BigInteger arg0) throws sprvmd {
        if (arg0.equals(cfr_renamed_4)) {
            throw new sprvmd(sprltq.cfr_renamed_9("\u0006\u0002A\n\u0012C\u0004\u0012\u0014\u0002\rC\u0015\fAROCA*\u0015C\u0012\u000b\u000e\u0016\r\u0007A\r\u000e\u0017A\u0001\u0004MAC5\u000b\u0004C\u0002\u000b\u0000\r\u0002\u0006\u0012C\u000e\u0005A\u0017\t\n\u0012C\t\u0002\u0011\u0013\u0004\r\b\r\u0006C\u0000\u0011\u0004C\u000e\rA\u0017\t\u0006A\f\u0013\u0007\u0004\u0011A\f\u0007CS=PUQC\u0007\f\u0013C\u0000CPUQN\u0003\n\u0015C\u0010MAC5\u0011\u0018C\u0000\u0004\u0000\n\u000fM"));
        }
    }

    public static void cfr_renamed_3926(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger[] arg4, String arg5, sprlc arg6) throws sprvmd {
        BigInteger bigInteger = arg4[0];
        BigInteger bigInteger2 = arg4[1];
        BigInteger bigInteger3 = spryld.cfr_renamed_3921(arg2, bigInteger, arg3, arg5, arg6);
        if (arg3.compareTo(cfr_renamed_3) != 1 || arg3.compareTo(arg0) != -1 || arg3.modPow(arg1, arg0).compareTo(cfr_renamed_4) != 0 || arg2.modPow(bigInteger2, arg0).multiply(arg3.modPow(bigInteger3, arg0)).mod(arg0).compareTo(bigInteger) != 0) {
            throw new sprvmd(sprhky.cfr_renamed_9("\u0006\u0018.\u0012q\u00162\u0012+\u00119\u0019;\u0018|\r.\u00123\u001b|\u000b=\u00115\u0019=\t5\u00122]:\u001c5\u00119\u0019"));
        }
    }

    public static void cfr_renamed_3927(String arg0, String arg1) throws sprvmd {
        if (!arg0.equals(arg1)) {
            throw new sprvmd(new StringBuilder().insert(0, sprltq.cfr_renamed_9("1\u0004\u0000\u0004\n\u0017\u0006\u0005C\u0011\u0002\u0018\u000f\u000e\u0002\u0005C\u0007\u0011\u000e\u000eA\n\u000f\u0000\u000e\u0011\u0013\u0006\u0002\u0017A\u0013\u0000\u0011\u0015\r\u0004\u0011AK")).append(arg1).append(sprhky.cfr_renamed_9("uS|8$\r9\u001e(\u00188](\u0012|\u000f9\u001e9\u0014*\u0018|\r=\u00040\u0012=\u0019|\u001b.\u00121]")).append(arg0).append(".").toString());
        }
    }

    private static /* synthetic */ void cfr_renamed_3923(sprlc arg0, String arg1) {
        byte[] byArray = sprywa.cfr_renamed_431(arg1);
        arg0.cfr_renamed_1197(spryld.cfr_renamed_3696(byArray.length), 0, 4);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sprzra.cfr_renamed_492(byArray, (byte)0);
    }

    private static /* synthetic */ void cfr_renamed_3924(spruc arg0, BigInteger arg1) {
        byte[] byArray = sprvpa.cfr_renamed_514(arg1);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sprzra.cfr_renamed_492(byArray, (byte)0);
    }

    public static BigInteger cfr_renamed_3928(BigInteger arg0, SecureRandom arg1) {
        BigInteger bigInteger = cfr_renamed_4;
        BigInteger bigInteger2 = arg0.subtract(cfr_renamed_4);
        return sprvpa.cfr_renamed_513(bigInteger, bigInteger2, arg1);
    }

    public static void cfr_renamed_3929(BigInteger arg0) throws sprvmd {
        if (arg0.equals(cfr_renamed_4)) {
            throw new sprvmd(sprltq.cfr_renamed_9("\u0006=\u0019C\u0017\u0002\r\n\u0005\u0002\u0015\n\u000e\rA\u0005\u0000\n\r\u0006\u0005MAC\u0006=\u0019C\u0012\u000b\u000e\u0016\r\u0007A\r\u000e\u0017A\u0001\u0004CPM"));
        }
    }

    private static /* synthetic */ byte[] cfr_renamed_3696(int arg0) {
        byte[] byArray = new byte[4];
        byArray[0] = (byte)(arg0 >>> 24);
        byArray[1] = (byte)(arg0 >>> 16);
        byArray[2] = (byte)(arg0 >>> 8);
        byArray[3] = (byte)arg0;
        return byArray;
    }

    public static void cfr_renamed_3930(Object arg0, String arg1) {
        if (arg0 == null) {
            throw new NullPointerException(new StringBuilder().insert(0, arg1).append(sprhky.cfr_renamed_9("]1\b/\t|\u00133\t|\u001f9]2\b0\u0011")).toString());
        }
    }
}

