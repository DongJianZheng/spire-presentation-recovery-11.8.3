/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprktb;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprlsb;
import com.spire.presentation.packages.sprmjb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprtjb;
import com.spire.presentation.packages.sprunb;
import com.spire.presentation.packages.sprwkd;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class sprijc {
    private static Map cfr_renamed_4 = new HashMap();

    public static sprrlb cfr_renamed_2324(sprpib arg0, ECPoint arg1, boolean arg2) {
        return arg0.cfr_renamed_1991(arg1.getAffineX(), arg1.getAffineY(), arg2);
    }

    public static sprlpb cfr_renamed_2328(ECParameterSpec arg0, boolean arg1) {
        sprpib sprpib2;
        sprpib sprpib3 = sprpib2 = sprijc.cfr_renamed_2323(arg0.getCurve());
        return new sprlpb(sprpib3, sprijc.cfr_renamed_2324(sprpib3, arg0.getGenerator(), arg1), arg0.getOrder(), BigInteger.valueOf(arg0.getCofactor()), arg0.getCurve().getSeed());
    }

    public static sprpib cfr_renamed_2323(EllipticCurve arg0) {
        EllipticCurve ellipticCurve = arg0;
        ECField eCField = ellipticCurve.getField();
        BigInteger bigInteger = ellipticCurve.getA();
        BigInteger bigInteger2 = ellipticCurve.getB();
        if (eCField instanceof ECFieldFp) {
            sprtjb sprtjb2 = new sprtjb(((ECFieldFp)eCField).getP(), bigInteger, bigInteger2);
            if (cfr_renamed_4.containsKey(sprtjb2)) {
                return (sprpib)cfr_renamed_4.get(sprtjb2);
            }
            return sprtjb2;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m)eCField;
        int n = eCFieldF2m.getM();
        int[] nArray = sprjkc.cfr_renamed_2472(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new sprktb(n, nArray[0], nArray[1], nArray[2], bigInteger, bigInteger2);
    }

    static {
        Enumeration enumeration = sprwkd.cfr_renamed_289();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            sprfpd sprfpd2 = sprahe.cfr_renamed_1837(string);
            if (sprfpd2 == null) continue;
            cfr_renamed_4.put(sprfpd2.cfr_renamed_1769(), sprwkd.cfr_renamed_1837(string).cfr_renamed_1769());
        }
    }

    public static EllipticCurve cfr_renamed_2114(sprpib arg0, byte[] arg1) {
        if (sprunb.cfr_renamed_1838(arg0)) {
            return new EllipticCurve(new ECFieldFp(arg0.cfr_renamed_845().cfr_renamed_1762()), arg0.cfr_renamed_1778().cfr_renamed_1779(), arg0.cfr_renamed_1997().cfr_renamed_1779(), null);
        }
        sprktb sprktb2 = (sprktb)arg0;
        if (sprktb2.cfr_renamed_1024()) {
            int[] nArray = new int[1];
            nArray[0] = sprktb2.cfr_renamed_2115();
            int[] nArray2 = nArray;
            return new EllipticCurve(new ECFieldF2m(sprktb2.cfr_renamed_1186(), nArray2), arg0.cfr_renamed_1778().cfr_renamed_1779(), arg0.cfr_renamed_1997().cfr_renamed_1779(), null);
        }
        int[] nArray = new int[3];
        nArray[0] = sprktb2.cfr_renamed_2116();
        nArray[1] = sprktb2.cfr_renamed_2117();
        nArray[2] = sprktb2.cfr_renamed_2115();
        int[] nArray3 = nArray;
        return new EllipticCurve(new ECFieldF2m(sprktb2.cfr_renamed_1186(), nArray3), arg0.cfr_renamed_1778().cfr_renamed_1779(), arg0.cfr_renamed_1997().cfr_renamed_1779(), null);
    }

    public static ECParameterSpec cfr_renamed_2311(EllipticCurve arg0, sprlpb arg1) {
        if (arg1 instanceof sprlsb) {
            return new sprmjb(((sprlsb)arg1).cfr_renamed_313(), arg0, new ECPoint(arg1.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), arg1.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153());
        }
        return new ECParameterSpec(arg0, new ECPoint(arg1.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), arg1.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153().intValue());
    }

    public static sprrlb cfr_renamed_2313(ECParameterSpec arg0, ECPoint arg1, boolean arg2) {
        return sprijc.cfr_renamed_2324(sprijc.cfr_renamed_2323(arg0.getCurve()), arg1, arg2);
    }
}

