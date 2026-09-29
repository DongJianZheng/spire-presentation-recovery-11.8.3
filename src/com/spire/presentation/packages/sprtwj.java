/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprik;
import com.spire.presentation.packages.sprjd;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsk;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public class sprtwj {
    public static ECPoint cfr_renamed_9053(spreuh arg0) {
        arg0 = arg0.cfr_renamed_1775();
        return new ECPoint(arg0.cfr_renamed_1969().cfr_renamed_1779(), arg0.cfr_renamed_1973().cfr_renamed_1779());
    }

    public static ECField cfr_renamed_9054(sprjd arg0) {
        if (sprmvh.cfr_renamed_8949(arg0)) {
            return new ECFieldFp(arg0.cfr_renamed_1762());
        }
        sprsk sprsk2 = ((sprik)arg0).cfr_renamed_1764();
        int[] nArray = sprsk2.cfr_renamed_1765();
        int[] nArray2 = sproze.cfr_renamed_5240(sproze.cfr_renamed_531(nArray, 1, nArray.length - 1));
        return new ECFieldF2m(sprsk2.cfr_renamed_813(), nArray2);
    }

    public static ECParameterSpec cfr_renamed_9386(sprhfm arg0) {
        return new ECParameterSpec(sprtwj.cfr_renamed_9052(arg0.cfr_renamed_1769(), null), sprtwj.cfr_renamed_9053(arg0.cfr_renamed_1145()), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1153().intValue());
    }

    public static EllipticCurve cfr_renamed_9052(sprgxh arg0, byte[] arg1) {
        sprgxh sprgxh2 = arg0;
        ECField eCField = sprtwj.cfr_renamed_9054(sprgxh2.cfr_renamed_845());
        BigInteger bigInteger = sprgxh2.cfr_renamed_1778().cfr_renamed_1779();
        BigInteger bigInteger2 = sprgxh2.cfr_renamed_1997().cfr_renamed_1779();
        return new EllipticCurve(eCField, bigInteger, bigInteger2, null);
    }
}

