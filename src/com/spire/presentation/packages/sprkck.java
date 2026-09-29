/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprevy;
import com.spire.presentation.packages.sprgbk;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprscf;
import com.spire.presentation.packages.sprusc;
import com.spire.presentation.packages.sprusk;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.spryye;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;

public class sprkck {
    public static final sprlem[] cfr_renamed_4;

    public static spryye cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey)arg0;
            return new sprusk(dSAPrivateKey.getX(), new sprmqk(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
        }
        throw new InvalidKeyException(sprevy.cfr_renamed_9("\u0003\\\u000e\u001a\u0014\u001d\tY\u0005S\u0014T\u0006D@y3|@M\u0012T\u0016\\\u0014X@V\u0005DN"));
    }

    public static String cfr_renamed_9450(BigInteger arg0, DSAParams arg1) {
        return new sprscf(sproze.cfr_renamed_526(arg0.toByteArray(), arg1.getP().toByteArray(), arg1.getQ().toByteArray(), arg1.getG().toByteArray())).toString();
    }

    public static boolean cfr_renamed_9449(sprlem arg0) {
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

    static {
        sprlem[] sprlemArray = new sprlem[3];
        sprlemArray[0] = sprbr.cfr_renamed_84;
        sprlemArray[1] = sprgt.cfr_renamed_93;
        sprlemArray[2] = sprbr.cfr_renamed_615;
        cfr_renamed_4 = sprlemArray;
    }

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprgbk) {
            return ((sprgbk)arg0).cfr_renamed_9389();
        }
        if (arg0 instanceof DSAPublicKey) {
            return new sprgbk((DSAPublicKey)arg0).cfr_renamed_9389();
        }
        try {
            byte[] byArray = arg0.getEncoded();
            return new sprgbk(sprvhm.cfr_renamed_23(byArray)).cfr_renamed_9389();
        }
        catch (Exception exception) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprusc.cfr_renamed_9("\fl\u0001*\u001b-\u0006i\nc\u001bd\ttOI<LO}\u001ao\u0003d\f-\u0004h\u00167O")).append(arg0.getClass().getName()).toString());
        }
    }

    public static sprmqk cfr_renamed_9451(DSAParams arg0) {
        if (arg0 != null) {
            return new sprmqk(arg0.getP(), arg0.getQ(), arg0.getG());
        }
        return null;
    }
}

