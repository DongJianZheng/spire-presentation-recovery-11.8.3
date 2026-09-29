/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprasp;
import com.spire.presentation.packages.sprfwk;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtpk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprkil {
    public static final BigInteger cfr_renamed_3;
    public static final BigInteger cfr_renamed_4;

    public static BigInteger cfr_renamed_3922(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4, BigInteger arg5) {
        return arg2.modPow(arg3.multiply(arg4).negate().mod(arg1), arg0).multiply(arg5).modPow(arg3, arg0);
    }

    private static /* synthetic */ void cfr_renamed_10619(spraq arg0, String arg1) {
        byte[] byArray = sprkoe.cfr_renamed_431(arg1);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sproze.cfr_renamed_492(byArray, (byte)0);
    }

    public static void cfr_renamed_3929(BigInteger arg0) throws sprmml {
        if (arg0.equals(cfr_renamed_3)) {
            throw new sprmml(sprghha.cfr_renamed_9("FGY9WxMpExUpNw\u0001\u007f@pM|E7\u00019FGY9RqNlM}\u0001wNm\u0001{D9\u00107"));
        }
    }

    private static /* synthetic */ byte[] cfr_renamed_10620(BigInteger arg0, sprgf arg1) {
        sprgf sprgf2 = arg1;
        sprgf sprgf3 = arg1;
        arg1.cfr_renamed_41();
        sprkil.cfr_renamed_10621(sprgf3, arg0);
        sprkil.cfr_renamed_10622(sprgf2, sprasp.cfr_renamed_9("?94\"06>*"));
        byte[] byArray = new byte[sprgf3.cfr_renamed_1218()];
        sprgf2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_10623(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger[] arg4, String arg5, sprgf arg6) throws sprmml {
        BigInteger bigInteger = arg4[0];
        BigInteger bigInteger2 = arg4[1];
        BigInteger bigInteger3 = sprkil.cfr_renamed_10624(arg2, bigInteger, arg3, arg5, arg6);
        if (arg3.compareTo(cfr_renamed_4) != 1 || arg3.compareTo(arg0) != -1 || arg3.modPow(arg1, arg0).compareTo(cfr_renamed_3) != 0 || arg2.modPow(bigInteger2, arg0).multiply(arg3.modPow(bigInteger3, arg0)).mod(arg0).compareTo(bigInteger) != 0) {
            throw new sprmml(sprghha.cfr_renamed_9("{|Sv\frOvVuD}F|\u0001iSvN\u007f\u0001o@uH}@mHvO9GxHuD}"));
        }
    }

    private static /* synthetic */ void cfr_renamed_10625(sprgf arg0, String arg1) {
        byte[] byArray = sprkoe.cfr_renamed_431(arg1);
        arg0.cfr_renamed_1197(sprkil.cfr_renamed_3696(byArray.length), 0, 4);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sproze.cfr_renamed_492(byArray, (byte)0);
    }

    public static void cfr_renamed_3917(String arg0, String arg1) throws sprmml {
        if (arg0.equals(arg1)) {
            throw new sprmml(new StringBuilder().insert(0, sprasp.cfr_renamed_9("7\u0006\u0001\u0001U\u0019\u0014\u001b\u0001\u0000\u0016\u0000\u0005\b\u001b\u001d\u0006I\u0014\u001b\u0010I\u0000\u001a\u001c\u0007\u0012I\u0001\u0001\u0010I\u0006\b\u0018\fU\u0019\u0014\u001b\u0001\u0000\u0016\u0000\u0005\b\u001b\u001d<\rUA")).append(arg0).append(sprghha.cfr_renamed_9("\b7\u0001MIpR9Hj\u0001wNm\u0001xMuNnD}\u000f9")).append(sprasp.cfr_renamed_9(",\u0014\n\u001dI\u0005\b\u0007\u001d\u001c\n\u001c\u0019\u0014\u0007\u0001I\u0018\u001c\u0006\u001dU\u001c\u0006\fU\bU\u001c\u001b\u0000\u0004\u001c\u0010I\u0005\b\u0007\u001d\u001c\n\u001c\u0019\u0014\u0007\u0001 \u0011G")).toString());
        }
    }

    public static BigInteger cfr_renamed_3909(BigInteger arg0, SecureRandom arg1) {
        BigInteger bigInteger = cfr_renamed_4;
        BigInteger bigInteger2 = arg0.subtract(cfr_renamed_3);
        return sprhdf.cfr_renamed_513(bigInteger, bigInteger2, arg1);
    }

    public static BigInteger cfr_renamed_3906(char[] arg0) {
        return new BigInteger(1, sprkoe.cfr_renamed_432(arg0));
    }

    public static void cfr_renamed_3930(Object arg0, String arg1) {
        if (arg0 == null) {
            throw new NullPointerException(new StringBuilder().insert(0, arg1).append(sprghha.cfr_renamed_9("9LlRm\u0001wNm\u0001{D9OlMu")).toString());
        }
    }

    public static BigInteger cfr_renamed_10626(BigInteger arg0, byte[] arg1) throws sprmml {
        BigInteger bigInteger = new BigInteger(1, arg1).mod(arg0);
        if (bigInteger.signum() == 0) {
            throw new sprmml(sprasp.cfr_renamed_9("8<&=U\f\u001b\u001a\u0000\u001b\u0010I\u0006I\u001c\u001aU\u0007\u001a\u001dU\f\u0004\u001c\u0014\u0005U\u001d\u001aIEI\u0018\u0006\u0011\u001c\u0019\u0006U\u0018"));
        }
        return bigInteger;
    }

    public static BigInteger cfr_renamed_3907(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3) {
        return arg2.modPow(arg3, arg0);
    }

    public static BigInteger cfr_renamed_10627(BigInteger arg0, char[] arg1) throws sprmml {
        return sprkil.cfr_renamed_10626(arg0, sprkoe.cfr_renamed_432(arg1));
    }

    static {
        cfr_renamed_4 = BigInteger.valueOf(0L);
        cfr_renamed_3 = BigInteger.valueOf(1L);
    }

    private static /* synthetic */ BigInteger cfr_renamed_10624(BigInteger arg0, BigInteger arg1, BigInteger arg2, String arg3, sprgf arg4) {
        sprgf sprgf2 = arg4;
        sprgf sprgf3 = arg4;
        sprgf sprgf4 = arg4;
        arg4.cfr_renamed_41();
        sprkil.cfr_renamed_10628(sprgf4, arg0);
        sprkil.cfr_renamed_10628(sprgf4, arg1);
        sprkil.cfr_renamed_10628(sprgf3, arg2);
        sprkil.cfr_renamed_10625(sprgf2, arg3);
        byte[] byArray = new byte[sprgf3.cfr_renamed_1218()];
        sprgf2.cfr_renamed_1219(byArray, 0);
        return new BigInteger(byArray);
    }

    private static /* synthetic */ void cfr_renamed_10628(sprgf arg0, BigInteger arg1) {
        byte[] byArray = sprhdf.cfr_renamed_514(arg1);
        arg0.cfr_renamed_1197(sprkil.cfr_renamed_3696(byArray.length), 0, 4);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sproze.cfr_renamed_492(byArray, (byte)0);
    }

    public static BigInteger cfr_renamed_3910(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3) {
        return arg1.multiply(arg2).multiply(arg3).mod(arg0);
    }

    public static BigInteger cfr_renamed_3919(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        return arg1.multiply(arg2).mod(arg0);
    }

    public static void cfr_renamed_10629(String arg0, String arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4, BigInteger arg5, BigInteger arg6, sprgf arg7, BigInteger arg8) throws sprmml {
        if (!sprkil.cfr_renamed_10630(arg1, arg0, arg4, arg5, arg2, arg3, arg6, arg7).equals(arg8)) {
            throw new sprmml(sprghha.cfr_renamed_9("I@kUwDk\u0001T@zuxF9WxMpExUpNw\u0001\u007f@pM|E7\u0001MI|S|GvS|\r9UqD9QxRjVvS}\r9lXb5\u0001vS9EpF|Rm\u0001xM~NkHmIt\u0001vG9DxBq\u0001i@kUpBpQxOm\u0001}N|R9OvU9LxUzI7"));
        }
    }

    public static BigInteger[] cfr_renamed_10631(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4, String arg5, sprgf arg6, SecureRandom arg7) {
        BigInteger[] bigIntegerArray = new BigInteger[2];
        BigInteger bigInteger = cfr_renamed_4;
        BigInteger bigInteger2 = arg1.subtract(cfr_renamed_3);
        BigInteger bigInteger3 = sprhdf.cfr_renamed_513(bigInteger, bigInteger2, arg7);
        BigInteger bigInteger4 = arg2;
        BigInteger bigInteger5 = bigInteger4.modPow(bigInteger3, arg0);
        BigInteger bigInteger6 = sprkil.cfr_renamed_10624(bigInteger4, bigInteger5, arg3, arg5, arg6);
        BigInteger[] bigIntegerArray2 = bigIntegerArray;
        bigIntegerArray2[0] = bigInteger5;
        bigIntegerArray[1] = bigInteger3.subtract(arg4.multiply(bigInteger6)).mod(arg1);
        return bigIntegerArray2;
    }

    public static void cfr_renamed_3925(BigInteger arg0) throws sprmml {
        if (arg0.equals(cfr_renamed_3)) {
            throw new sprmml(sprasp.cfr_renamed_9("\u0012\bU\u0000\u0006I\u0010\u0018\u0000\b\u0019I\u0001\u0006UX[IU \u0001I\u0006\u0001\u001a\u001c\u0019\rU\u0007\u001a\u001dU\u000b\u0010GUI!\u0001\u0010I\u0016\u0001\u0014\u0007\u0016\f\u0006I\u001a\u000fU\u001d\u001d\u0000\u0006I\u001d\b\u0005\u0019\u0010\u0007\u001c\u0007\u0012I\u0014\u001b\u0010I\u001a\u0007U\u001d\u001d\fU\u0006\u0007\r\u0010\u001bU\u0006\u0013IG7D_EI\u0013\u0006\u0007I\u0014ID_ED\u0017\u0000\u0001I\u0004GUI!\u001b\fI\u0014\u000e\u0014\u0000\u001bG"));
        }
    }

    public static BigInteger cfr_renamed_3928(BigInteger arg0, SecureRandom arg1) {
        BigInteger bigInteger = cfr_renamed_3;
        BigInteger bigInteger2 = arg0.subtract(cfr_renamed_3);
        return sprhdf.cfr_renamed_513(bigInteger, bigInteger2, arg1);
    }

    private static /* synthetic */ byte[] cfr_renamed_3696(int arg0) {
        byte[] byArray = new byte[4];
        byArray[0] = (byte)(arg0 >>> 24);
        byArray[1] = (byte)(arg0 >>> 16);
        byArray[2] = (byte)(arg0 >>> 8);
        byArray[3] = (byte)arg0;
        return byArray;
    }

    private static /* synthetic */ void cfr_renamed_10632(spraq arg0, BigInteger arg1) {
        byte[] byArray = sprhdf.cfr_renamed_514(arg1);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sproze.cfr_renamed_492(byArray, (byte)0);
    }

    public static BigInteger cfr_renamed_3908(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        return arg1.modPow(arg2, arg0);
    }

    public static BigInteger cfr_renamed_10630(String arg0, String arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4, BigInteger arg5, BigInteger arg6, sprgf arg7) {
        byte[] byArray = sprkil.cfr_renamed_10620(arg6, arg7);
        sprfwk sprfwk2 = new sprfwk(arg7);
        byte[] byArray2 = new byte[sprfwk2.cfr_renamed_2404()];
        sprfwk2.cfr_renamed_5692(new sprtpk(byArray));
        sprkil.cfr_renamed_10619(sprfwk2, sprghha.cfr_renamed_9("jZ~(~L"));
        sprkil.cfr_renamed_10619(sprfwk2, arg0);
        sprkil.cfr_renamed_10619(sprfwk2, arg1);
        sprkil.cfr_renamed_10632(sprfwk2, arg2);
        sprkil.cfr_renamed_10632(sprfwk2, arg3);
        sprkil.cfr_renamed_10632(sprfwk2, arg4);
        sprkil.cfr_renamed_10632(sprfwk2, arg5);
        sprfwk2.cfr_renamed_1219(byArray2, 0);
        sproze.cfr_renamed_492(byArray, (byte)0);
        return new BigInteger(byArray2);
    }

    private static /* synthetic */ void cfr_renamed_10621(sprgf arg0, BigInteger arg1) {
        byte[] byArray = sprhdf.cfr_renamed_514(arg1);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sproze.cfr_renamed_492(byArray, (byte)0);
    }

    public static void cfr_renamed_3927(String arg0, String arg1) throws sprmml {
        if (!arg0.equals(arg1)) {
            throw new sprmml(new StringBuilder().insert(0, sprasp.cfr_renamed_9(";\u0010\n\u0010\u0000\u0003\f\u0011I\u0005\b\f\u0005\u001a\b\u0011I\u0013\u001b\u001a\u0004U\u0000\u001b\n\u001a\u001b\u0007\f\u0016\u001dU\u0019\u0014\u001b\u0001\u0007\u0010\u001bUA")).append(arg1).append(sprghha.cfr_renamed_9("\b7\u0001\\YiDzU|E9Uv\u0001kDzDpW|\u0001i@`Mv@}\u0001\u007fSvL9")).append(arg0).append(".").toString());
        }
    }

    private static /* synthetic */ void cfr_renamed_10622(sprgf arg0, String arg1) {
        byte[] byArray = sprkoe.cfr_renamed_431(arg1);
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sproze.cfr_renamed_492(byArray, (byte)0);
    }
}

