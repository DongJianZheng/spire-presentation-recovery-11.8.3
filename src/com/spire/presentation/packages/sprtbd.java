/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtm;
import com.spire.presentation.packages.sprcld;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprlnd;
import com.spire.presentation.packages.sprmwy;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruld;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;

public class sprtbd {
    public static final sprtzd[] cfr_renamed_4;

    public static sprhgb cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey)arg0;
            return new sprlnd(dSAPrivateKey.getX(), new sprcld(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
        }
        throw new InvalidKeyException(sprbtm.cfr_renamed_9("\u00065\u000bs\u0011t\f0\u0000:\u0011=\u0003-E\u00106\u0015E$\u0017=\u00135\u00111E?\u0000-K"));
    }

    public static boolean cfr_renamed_2514(sprtzd arg0) {
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

    static {
        sprtzd[] sprtzdArray = new sprtzd[2];
        sprtzdArray[0] = sprtk.cfr_renamed_314;
        sprtzdArray[1] = sprdh.cfr_renamed_1;
        cfr_renamed_4 = sprtzdArray;
    }

    public static sprhgb cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof DSAPublicKey) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey)arg0;
            return new spruld(dSAPublicKey.getY(), new sprcld(dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG()));
        }
        throw new InvalidKeyException(new StringBuilder().insert(0, sprmwy.cfr_renamed_9("D\u0006I@SGN\u0003B\tS\u000eA\u001e\u0007#t&\u0007\u0017R\u0005K\u000eDGL\u0002^]\u0007")).append(arg0.getClass().getName()).toString());
    }
}

