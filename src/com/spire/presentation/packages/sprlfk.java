/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjk;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfgk;
import com.spire.presentation.packages.sprfnm;
import com.spire.presentation.packages.sprfrh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprik;
import com.spire.presentation.packages.sprjd;
import com.spire.presentation.packages.sprkqm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnkk;
import com.spire.presentation.packages.sprntm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqnja;
import com.spire.presentation.packages.sprrfk;
import com.spire.presentation.packages.sprsk;
import com.spire.presentation.packages.sprvro;
import com.spire.presentation.packages.sprvth;
import com.spire.presentation.packages.sprws;
import com.spire.presentation.packages.spryo;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

public class sprlfk {
    private spryo cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprlfk cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprfgk((String)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprlfk cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprrfk((Provider)arg0);
        return this;
    }

    private static /* synthetic */ ECField cfr_renamed_9054(sprjd arg0) {
        if (sprmvh.cfr_renamed_8949(arg0)) {
            return new ECFieldFp(arg0.cfr_renamed_1762());
        }
        sprsk sprsk2 = ((sprik)arg0).cfr_renamed_1764();
        int[] nArray = sprsk2.cfr_renamed_1765();
        int[] nArray2 = sproze.cfr_renamed_5240(sproze.cfr_renamed_531(nArray, 1, nArray.length - 1));
        return new ECFieldF2m(sprsk2.cfr_renamed_813(), nArray2);
    }

    public sprfnm cfr_renamed_9819(sprlem arg0, PublicKey arg1) {
        if (arg1 instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey)arg1;
            return new sprkqm(arg0, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        ECPublicKey eCPublicKey = (ECPublicKey)arg1;
        ECParameterSpec eCParameterSpec = eCPublicKey.getParams();
        EllipticCurve ellipticCurve = eCParameterSpec.getCurve();
        sprgxh sprgxh2 = sprlfk.cfr_renamed_9820(ellipticCurve, eCParameterSpec.getOrder(), eCParameterSpec.getCofactor());
        spreuh spreuh2 = sprgxh2.cfr_renamed_1996(eCParameterSpec.getGenerator().getAffineX(), eCParameterSpec.getGenerator().getAffineY());
        spreuh spreuh3 = sprgxh2.cfr_renamed_1996(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY());
        return new sprntm(arg0, ((ECFieldFp)ellipticCurve.getField()).getP(), ellipticCurve.getA(), ellipticCurve.getB(), spreuh2.cfr_renamed_1972(false), eCParameterSpec.getOrder(), spreuh3.cfr_renamed_1972(false), eCParameterSpec.getCofactor());
    }

    private /* synthetic */ ECParameterSpec cfr_renamed_9821(sprntm arg0) {
        if (!arg0.cfr_renamed_2557()) {
            throw new IllegalArgumentException(sprvro.cfr_renamed_9("\u00128 !+.b&'4b)-(1m,\"6m!\",9#$,>b\b\u0001m\u0012,0,/>"));
        }
        sprntm sprntm2 = arg0;
        BigInteger bigInteger = sprntm2.cfr_renamed_2558();
        sprvth sprvth2 = new sprvth(bigInteger, arg0.cfr_renamed_2559(), arg0.cfr_renamed_2560(), arg0.cfr_renamed_2562(), arg0.cfr_renamed_2563());
        sprntm sprntm3 = arg0;
        spreuh spreuh2 = sprvth2.cfr_renamed_2002(sprntm3.cfr_renamed_2561());
        BigInteger bigInteger2 = sprntm3.cfr_renamed_2562();
        BigInteger bigInteger3 = sprntm2.cfr_renamed_2563();
        EllipticCurve ellipticCurve = sprlfk.cfr_renamed_9822(sprvth2);
        return new ECParameterSpec(ellipticCurve, new ECPoint(spreuh2.cfr_renamed_1969().cfr_renamed_1779(), spreuh2.cfr_renamed_1973().cfr_renamed_1779()), bigInteger2, bigInteger3.intValue());
    }

    private /* synthetic */ ECPoint cfr_renamed_9823(sprntm arg0) {
        if (!arg0.cfr_renamed_2557()) {
            throw new IllegalArgumentException(sprqnja.cfr_renamed_9("U\u0006g\u001fl\u0010%\u0018`\n%\u0017j\u0016vSk\u001cqSf\u001ck\u0007d\u001ak\u0000%6FSU\u0012w\u0012h\u0000"));
        }
        BigInteger bigInteger = arg0.cfr_renamed_2558();
        sprfrh sprfrh2 = (sprfrh)new sprvth(bigInteger, arg0.cfr_renamed_2559(), arg0.cfr_renamed_2560(), arg0.cfr_renamed_2562(), arg0.cfr_renamed_2563()).cfr_renamed_2002(arg0.cfr_renamed_2565());
        return new ECPoint(sprfrh2.cfr_renamed_1969().cfr_renamed_1779(), sprfrh2.cfr_renamed_1973().cfr_renamed_1779());
    }

    private static /* synthetic */ sprgxh cfr_renamed_9820(EllipticCurve arg0, BigInteger arg1, int arg2) {
        EllipticCurve ellipticCurve = arg0;
        ECField eCField = ellipticCurve.getField();
        BigInteger bigInteger = ellipticCurve.getA();
        BigInteger bigInteger2 = ellipticCurve.getB();
        if (eCField instanceof ECFieldFp) {
            return new sprvth(((ECFieldFp)eCField).getP(), bigInteger, bigInteger2, arg1, BigInteger.valueOf(arg2));
        }
        throw new IllegalStateException(sprvro.cfr_renamed_9(",\"6m+ 2!' '#6(&m;(6lcl"));
    }

    private static /* synthetic */ EllipticCurve cfr_renamed_9822(sprgxh arg0) {
        sprgxh sprgxh2 = arg0;
        ECField eCField = sprlfk.cfr_renamed_9054(sprgxh2.cfr_renamed_845());
        BigInteger bigInteger = sprgxh2.cfr_renamed_1778().cfr_renamed_1779();
        BigInteger bigInteger2 = sprgxh2.cfr_renamed_1997().cfr_renamed_1779();
        return new EllipticCurve(eCField, bigInteger, bigInteger2, null);
    }

    public sprlfk() {
        sprlfk sprlfk2 = this;
        sprlfk2.cfr_renamed_4 = new sprnkk();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 3;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 ^ 5) << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ PublicKey cfr_renamed_9824(sprntm arg0) throws sprbjk, InvalidKeySpecException {
        sprlfk sprlfk2 = this;
        ECParameterSpec eCParameterSpec = sprlfk2.cfr_renamed_9821(arg0);
        ECPoint eCPoint = sprlfk2.cfr_renamed_9823(arg0);
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, eCParameterSpec);
        try {
            KeyFactory keyFactory = this.cfr_renamed_4.cfr_renamed_1511(sprqnja.cfr_renamed_9("6F7V2"));
            return keyFactory.generatePublic(eCPublicKeySpec);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprbjk(new StringBuilder().insert(0, sprvro.cfr_renamed_9("!,,#-9b++#&m2?-;+)'?xm")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprbjk(new StringBuilder().insert(0, sprqnja.cfr_renamed_9("\u0010d\u001dk\u001cqSc\u001ak\u0017%\u0012i\u0014j\u0001l\u0007m\u001e%6F7V2?S")).append(noSuchAlgorithmException.getMessage()).toString(), noSuchAlgorithmException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_9825(sprfnm arg0) throws sprbjk, InvalidKeySpecException {
        if (arg0.cfr_renamed_2567().cfr_renamed_5966(sprws.cfr_renamed_137)) {
            return this.cfr_renamed_9824((sprntm)arg0);
        }
        sprkqm sprkqm2 = (sprkqm)arg0;
        RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(sprkqm2.cfr_renamed_2295(), sprkqm2.cfr_renamed_2296());
        try {
            KeyFactory keyFactory = this.cfr_renamed_4.cfr_renamed_1511("RSA");
            return keyFactory.generatePublic(rSAPublicKeySpec);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprbjk(new StringBuilder().insert(0, sprvro.cfr_renamed_9("!,,#-9b++#&m2?-;+)'?xm")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprbjk(new StringBuilder().insert(0, sprqnja.cfr_renamed_9("\u0010d\u001dk\u001cqSc\u001ak\u0017%\u0012i\u0014j\u0001l\u0007m\u001e%6F7V2?S")).append(noSuchAlgorithmException.getMessage()).toString(), noSuchAlgorithmException);
        }
    }
}

