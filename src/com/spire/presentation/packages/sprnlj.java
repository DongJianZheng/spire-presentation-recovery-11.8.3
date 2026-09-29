/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralm;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.spreph;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgoh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprik;
import com.spire.presentation.packages.sprjd;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnnj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprsk;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvth;
import com.spire.presentation.packages.sprvzy;
import com.spire.presentation.packages.sprxlh;
import com.spire.presentation.packages.sprxum;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.sprzfi;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Map;
import java.util.Set;

public class sprnlj {
    public static sprgxh cfr_renamed_2323(EllipticCurve arg0) {
        EllipticCurve ellipticCurve = arg0;
        ECField eCField = ellipticCurve.getField();
        BigInteger bigInteger = ellipticCurve.getA();
        BigInteger bigInteger2 = ellipticCurve.getB();
        if (eCField instanceof ECFieldFp) {
            return sprnnj.cfr_renamed_9382(new sprvth(((ECFieldFp)eCField).getP(), bigInteger, bigInteger2, null, null));
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m)eCField;
        int n = eCFieldF2m.getM();
        int[] nArray = sprqpj.cfr_renamed_2472(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new sprgoh(n, nArray[0], nArray[1], nArray[2], bigInteger, bigInteger2, null, null);
    }

    public static sprrxh cfr_renamed_9150(ECParameterSpec arg0) {
        ECParameterSpec eCParameterSpec = arg0;
        sprgxh sprgxh2 = sprnlj.cfr_renamed_2323(eCParameterSpec.getCurve());
        ECParameterSpec eCParameterSpec2 = arg0;
        spreuh spreuh2 = sprnlj.cfr_renamed_9154(sprgxh2, eCParameterSpec2.getGenerator());
        BigInteger bigInteger = eCParameterSpec.getOrder();
        BigInteger bigInteger2 = BigInteger.valueOf(eCParameterSpec2.getCofactor());
        byte[] byArray = eCParameterSpec.getCurve().getSeed();
        if (eCParameterSpec instanceof sprxvh) {
            return new spreph(((sprxvh)arg0).cfr_renamed_313(), sprgxh2, spreuh2, bigInteger, bigInteger2, byArray);
        }
        return new sprrxh(sprgxh2, spreuh2, bigInteger, bigInteger2, byArray);
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

    public static ECParameterSpec cfr_renamed_9153(EllipticCurve arg0, sprrxh arg1) {
        sprrxh sprrxh2 = arg1;
        ECPoint eCPoint = sprnlj.cfr_renamed_9053(sprrxh2.cfr_renamed_1145());
        if (sprrxh2 instanceof spreph) {
            String string = ((spreph)arg1).cfr_renamed_313();
            return new sprxvh(string, arg0, eCPoint, arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153());
        }
        return new ECParameterSpec(arg0, eCPoint, arg1.cfr_renamed_1146(), arg1.cfr_renamed_1153().intValue());
    }

    public static sprqxk cfr_renamed_9383(sprqw arg0, ECParameterSpec arg1) {
        if (arg1 == null) {
            sprrxh sprrxh2 = arg0.cfr_renamed_2312();
            sprqxk sprqxk2 = new sprqxk(sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_1145(), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153(), sprrxh2.cfr_renamed_2113());
            return sprqxk2;
        }
        sprqxk sprqxk3 = sprqpj.cfr_renamed_9378(arg0, sprnlj.cfr_renamed_9150(arg1));
        return sprqxk3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static sprgxh cfr_renamed_9384(sprqw arg0, sprcgm arg1) {
        Set set = arg0.cfr_renamed_9166();
        if (arg1.cfr_renamed_2317()) {
            sprhfm sprhfm2;
            sprlem sprlem2 = sprlem.cfr_renamed_23(arg1.cfr_renamed_284());
            if (!set.isEmpty()) {
                if (!set.contains(sprlem2)) throw new IllegalStateException(sprxlh.cfr_renamed_9("\u0002\u0006\u0001\u0002\bG\u000f\u0012\u001e\u0011\tG\u0002\b\u0018G\r\u0004\u000f\u0002\u001c\u0013\r\u0005\u0000\u0002"));
            }
            if ((sprhfm2 = sprqpj.cfr_renamed_9156(sprlem2)) != null) return sprhfm2.cfr_renamed_1769();
            sprhfm2 = (sprhfm)arg0.cfr_renamed_9167().get(sprlem2);
            return sprhfm2.cfr_renamed_1769();
        }
        if (arg1.cfr_renamed_2320()) {
            return arg0.cfr_renamed_2312().cfr_renamed_1769();
        }
        sprszm sprszm2 = sprszm.cfr_renamed_23(arg1.cfr_renamed_284());
        if (!set.isEmpty()) throw new IllegalStateException(sprvzy.cfr_renamed_9("KmMlJfJ#^b\\bCfZf\\p\u000emAw\u000ebM`KsZbLoK"));
        if (sprszm2.cfr_renamed_84() > 3) {
            sprhfm sprhfm3 = sprhfm.cfr_renamed_23(sprszm2);
            return sprhfm3.cfr_renamed_1769();
        }
        sprlem sprlem3 = sprlem.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        return spralm.cfr_renamed_9184(sprlem3).cfr_renamed_1769();
    }

    public static ECParameterSpec cfr_renamed_9211(sprqxk arg0) {
        return new ECParameterSpec(sprnlj.cfr_renamed_9052(arg0.cfr_renamed_1769(), null), sprnlj.cfr_renamed_9053(arg0.cfr_renamed_1145()), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1153().intValue());
    }

    public static spreuh cfr_renamed_9154(sprgxh arg0, ECPoint arg1) {
        return arg0.cfr_renamed_1996(arg1.getAffineX(), arg1.getAffineY());
    }

    public static spreuh cfr_renamed_9155(ECParameterSpec arg0, ECPoint arg1) {
        return sprnlj.cfr_renamed_9154(sprnlj.cfr_renamed_2323(arg0.getCurve()), arg1);
    }

    public static ECParameterSpec cfr_renamed_9385(sprcgm arg0, sprgxh arg1) {
        ECParameterSpec eCParameterSpec;
        if (arg0.cfr_renamed_2317()) {
            Map map;
            sprlem sprlem2 = (sprlem)arg0.cfr_renamed_284();
            sprhfm sprhfm2 = sprqpj.cfr_renamed_9156(sprlem2);
            if (sprhfm2 == null && !(map = sprsci.cfr_renamed_105.cfr_renamed_9167()).isEmpty()) {
                sprhfm2 = (sprhfm)map.get(sprlem2);
            }
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg1, sprhfm2.cfr_renamed_2113());
            sprxvh sprxvh2 = new sprxvh(sprqpj.cfr_renamed_7554(sprlem2), ellipticCurve, sprnlj.cfr_renamed_9053(sprhfm2.cfr_renamed_1145()), sprhfm2.cfr_renamed_1146(), sprhfm2.cfr_renamed_1153());
            return sprxvh2;
        }
        if (arg0.cfr_renamed_2320()) {
            ECParameterSpec eCParameterSpec2 = null;
            return null;
        }
        sprszm sprszm2 = sprszm.cfr_renamed_23(arg0.cfr_renamed_284());
        if (sprszm2.cfr_renamed_84() > 3) {
            ECParameterSpec eCParameterSpec3;
            sprhfm sprhfm3 = sprhfm.cfr_renamed_23(sprszm2);
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg1, sprhfm3.cfr_renamed_2113());
            if (sprhfm3.cfr_renamed_1153() != null) {
                eCParameterSpec3 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(sprhfm3.cfr_renamed_1145()), sprhfm3.cfr_renamed_1146(), sprhfm3.cfr_renamed_1153().intValue());
                eCParameterSpec = eCParameterSpec3;
            } else {
                eCParameterSpec3 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(sprhfm3.cfr_renamed_1145()), sprhfm3.cfr_renamed_1146(), 1);
                eCParameterSpec = eCParameterSpec3;
            }
        } else {
            sprxum sprxum2 = sprxum.cfr_renamed_23(sprszm2);
            spreph spreph2 = sprzfi.cfr_renamed_2315(spralm.cfr_renamed_7555(sprxum2.cfr_renamed_2106()));
            arg1 = spreph2.cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg1, spreph2.cfr_renamed_2113());
            eCParameterSpec = new sprxvh(spralm.cfr_renamed_7555(sprxum2.cfr_renamed_2106()), ellipticCurve, sprnlj.cfr_renamed_9053(spreph2.cfr_renamed_1145()), spreph2.cfr_renamed_1146(), spreph2.cfr_renamed_1153());
        }
        return eCParameterSpec;
    }

    public static EllipticCurve cfr_renamed_9052(sprgxh arg0, byte[] arg1) {
        sprgxh sprgxh2 = arg0;
        ECField eCField = sprnlj.cfr_renamed_9054(sprgxh2.cfr_renamed_845());
        BigInteger bigInteger = sprgxh2.cfr_renamed_1778().cfr_renamed_1779();
        BigInteger bigInteger2 = sprgxh2.cfr_renamed_1997().cfr_renamed_1779();
        return new EllipticCurve(eCField, bigInteger, bigInteger2, null);
    }

    public static ECParameterSpec cfr_renamed_9386(sprhfm arg0) {
        return new ECParameterSpec(sprnlj.cfr_renamed_9052(arg0.cfr_renamed_1769(), null), sprnlj.cfr_renamed_9053(arg0.cfr_renamed_1145()), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1153().intValue());
    }

    public static ECPoint cfr_renamed_9053(spreuh arg0) {
        arg0 = arg0.cfr_renamed_1775();
        return new ECPoint(arg0.cfr_renamed_1969().cfr_renamed_1779(), arg0.cfr_renamed_1973().cfr_renamed_1779());
    }
}

