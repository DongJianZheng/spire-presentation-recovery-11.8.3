/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgoh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprvth;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public class sprhbi {
    public static ECPoint cfr_renamed_2375(EllipticCurve arg0, byte[] arg1) {
        int[] nArray;
        sprgxh sprgxh2 = null;
        return sprnlj.cfr_renamed_9053((arg0.getField() instanceof ECFieldFp ? (sprgxh2 = new sprvth(((ECFieldFp)arg0.getField()).getP(), arg0.getA(), arg0.getB(), null, null)) : ((nArray = ((ECFieldF2m)arg0.getField()).getMidTermsOfReductionPolynomial()).length == 3 ? (sprgxh2 = new sprgoh(((ECFieldF2m)arg0.getField()).getM(), nArray[2], nArray[1], nArray[0], arg0.getA(), arg0.getB(), null, null)) : (sprgxh2 = new sprgoh(((ECFieldF2m)arg0.getField()).getM(), nArray[0], arg0.getA(), arg0.getB(), null, null)))).cfr_renamed_2002(arg1));
    }
}

