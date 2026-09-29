/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjj;
import com.spire.presentation.packages.sprcoj;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprscf;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class sprgij {
    public static final sprlem[] cfr_renamed_4;

    public static String cfr_renamed_9395(BigInteger arg0) {
        return new sprscf(arg0.toByteArray()).toString();
    }

    public static sprkik cfr_renamed_2476(RSAPublicKey arg0) {
        if (arg0 instanceof sprbjj) {
            return ((sprbjj)arg0).cfr_renamed_9389();
        }
        return new sprkik(false, arg0.getModulus(), arg0.getPublicExponent());
    }

    static {
        sprlem[] sprlemArray = new sprlem[4];
        sprlemArray[0] = sprdl.cfr_renamed_1205;
        sprlemArray[1] = sprhl.cfr_renamed_2415;
        sprlemArray[2] = sprdl.cfr_renamed_1456;
        sprlemArray[3] = sprdl.cfr_renamed_3250;
        cfr_renamed_4 = sprlemArray;
    }

    public static String cfr_renamed_9396(BigInteger arg0) {
        return new sprscf(arg0.toByteArray(), 32).toString();
    }

    public static boolean cfr_renamed_9397(sprlem arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != cfr_renamed_4.length) {
            if (arg0.cfr_renamed_5078(cfr_renamed_4[n])) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public static sprkik cfr_renamed_2477(RSAPrivateKey arg0) {
        if (arg0 instanceof sprcoj) {
            return ((sprcoj)arg0).cfr_renamed_9389();
        }
        if (arg0 instanceof RSAPrivateCrtKey) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey)arg0;
            return new sprkhk(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }
        RSAPrivateKey rSAPrivateKey = arg0;
        return new sprkik(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
    }
}

