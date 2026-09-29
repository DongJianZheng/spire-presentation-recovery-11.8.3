/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctc;
import com.spire.presentation.packages.sprjid;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprnnd;
import com.spire.presentation.packages.sprojd;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzmd;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprgwc {
    public static final BigInteger cfr_renamed_3;
    public static final BigInteger cfr_renamed_4;

    public static byte[] cfr_renamed_2904(sprmgd arg0, sprrkd arg1) {
        sprojd sprojd2;
        sprojd sprojd3 = sprojd2 = new sprojd();
        sprojd3.cfr_renamed_1524(arg1);
        return sprvpa.cfr_renamed_514(sprojd3.cfr_renamed_2501(arg0));
    }

    public static BigInteger cfr_renamed_3027(InputStream arg0) throws IOException {
        return new BigInteger(1, sprzsc.cfr_renamed_2629(arg0));
    }

    public static sprwnd cfr_renamed_3028(SecureRandom arg0, sprzmd arg1) {
        sprnnd sprnnd2;
        sprnnd sprnnd3 = sprnnd2 = new sprnnd();
        sprnnd3.cfr_renamed_1222(new sprjid(arg0, arg1));
        return sprnnd3.cfr_renamed_1223();
    }

    public static sprmgd cfr_renamed_2899(sprmgd arg0) throws IOException {
        sprmgd sprmgd2 = arg0;
        BigInteger bigInteger = sprmgd2.spr\u3181();
        sprzmd sprzmd2 = sprmgd2.cfr_renamed_284();
        BigInteger bigInteger2 = sprzmd2.cfr_renamed_1155();
        BigInteger bigInteger3 = sprzmd2.cfr_renamed_1145();
        if (!bigInteger2.isProbablePrime(2)) {
            throw new spryad(47);
        }
        if (bigInteger3.compareTo(cfr_renamed_3) < 0 || bigInteger3.compareTo(bigInteger2.subtract(cfr_renamed_3)) > 0) {
            throw new spryad(47);
        }
        if (bigInteger.compareTo(cfr_renamed_3) < 0 || bigInteger.compareTo(bigInteger2.subtract(cfr_renamed_4)) > 0) {
            throw new spryad(47);
        }
        return arg0;
    }

    public static sprrkd cfr_renamed_2903(SecureRandom arg0, sprzmd arg1, OutputStream arg2) throws IOException {
        sprwnd sprwnd2 = sprgwc.cfr_renamed_3028(arg0, arg1);
        sprmgd sprmgd2 = (sprmgd)sprwnd2.cfr_renamed_1224();
        new sprctc(sprmgd2).cfr_renamed_2623(arg2);
        return (sprrkd)sprwnd2.cfr_renamed_1225();
    }

    static {
        cfr_renamed_4 = BigInteger.valueOf(1L);
        cfr_renamed_3 = BigInteger.valueOf(2L);
    }

    public static void cfr_renamed_3029(BigInteger arg0, OutputStream arg1) throws IOException {
        sprzsc.cfr_renamed_2624(sprvpa.cfr_renamed_514(arg0), arg1);
    }

    public static sprrkd cfr_renamed_2902(SecureRandom arg0, sprzmd arg1, OutputStream arg2) throws IOException {
        sprwnd sprwnd2 = sprgwc.cfr_renamed_3028(arg0, arg1);
        sprgwc.cfr_renamed_3029(((sprmgd)sprwnd2.cfr_renamed_1224()).spr\u3181(), arg2);
        return (sprrkd)sprwnd2.cfr_renamed_1225();
    }

    public static boolean cfr_renamed_3030(sprzmd arg0, sprzmd arg1) {
        return arg0.cfr_renamed_1155().equals(arg1.cfr_renamed_1155()) && arg0.cfr_renamed_1145().equals(arg1.cfr_renamed_1145());
    }
}

