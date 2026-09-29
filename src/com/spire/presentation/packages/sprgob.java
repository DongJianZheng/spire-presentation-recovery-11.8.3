/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprtjb;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public class sprgob {
    public static ECPoint cfr_renamed_2375(EllipticCurve arg0, byte[] arg1) {
        Object object;
        sprpib sprpib2 = null;
        object = (arg0.getField() instanceof ECFieldFp ? (sprpib2 = new sprtjb(((ECFieldFp)arg0.getField()).getP(), arg0.getA(), arg0.getB())) : (((int[])(object = ((ECFieldF2m)arg0.getField()).getMidTermsOfReductionPolynomial())).length == 3 ? (sprpib2 = new sprktb(((ECFieldF2m)arg0.getField()).getM(), object[2], (int)object[1], (int)object[0], arg0.getA(), arg0.getB())) : (sprpib2 = new sprktb(((ECFieldF2m)arg0.getField()).getM(), object[0], arg0.getA(), arg0.getB())))).cfr_renamed_2002(arg1);
        return new ECPoint(((sprrlb)object).cfr_renamed_1969().cfr_renamed_1779(), ((sprrlb)object).cfr_renamed_1973().cfr_renamed_1779());
    }
}

