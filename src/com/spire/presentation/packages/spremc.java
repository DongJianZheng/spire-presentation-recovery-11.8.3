/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprisc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprtzd;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class spremc {
    public static final sprtzd[] cfr_renamed_4;

    public static boolean cfr_renamed_2475(sprtzd arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != cfr_renamed_4.length) {
            if (arg0.equals(cfr_renamed_4[n])) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public static sprmtc cfr_renamed_2476(RSAPublicKey arg0) {
        return new sprmtc(false, arg0.getModulus(), arg0.getPublicExponent());
    }

    public static sprmtc cfr_renamed_2477(RSAPrivateKey arg0) {
        if (arg0 instanceof RSAPrivateCrtKey) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey)arg0;
            return new sprisc(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }
        RSAPrivateKey rSAPrivateKey = arg0;
        return new sprmtc(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
    }

    static {
        sprtzd[] sprtzdArray = new sprtzd[4];
        sprtzdArray[0] = sprm.cfr_renamed_1510;
        sprtzdArray[1] = sprs.cfr_renamed_2478;
        sprtzdArray[2] = sprm.cfr_renamed_1442;
        sprtzdArray[3] = sprm.cfr_renamed_131;
        cfr_renamed_4 = sprtzdArray;
    }
}

