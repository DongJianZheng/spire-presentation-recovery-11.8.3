/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravc;
import com.spire.presentation.packages.sprbyc;
import com.spire.presentation.packages.sprchm;
import com.spire.presentation.packages.sprdc;
import com.spire.presentation.packages.sprgke;
import com.spire.presentation.packages.spriad;
import com.spire.presentation.packages.sprkkb;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprmg;
import com.spire.presentation.packages.sprmwc;
import com.spire.presentation.packages.sprnkp;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprtjb;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvae;
import com.spire.presentation.packages.sprvhe;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

public class spricd {
    private sprdc cfr_renamed_4;

    private /* synthetic */ sprlpb cfr_renamed_2556(sprvhe arg0) {
        if (!arg0.cfr_renamed_2557()) {
            throw new IllegalArgumentException(sprchm.cfr_renamed_9("D\u0004v\u001d}\u00124\u001aq\b4\u0015{\u0014gQz\u001e`Qw\u001ez\u0005u\u0018z\u000244WQD\u0010f\u0010y\u0002"));
        }
        sprvhe sprvhe2 = arg0;
        BigInteger bigInteger = sprvhe2.cfr_renamed_2558();
        sprtjb sprtjb2 = new sprtjb(bigInteger, arg0.cfr_renamed_2559(), arg0.cfr_renamed_2560());
        sprvhe sprvhe3 = arg0;
        sprrlb sprrlb2 = sprtjb2.cfr_renamed_2002(sprvhe3.cfr_renamed_2561());
        BigInteger bigInteger2 = sprvhe3.cfr_renamed_2562();
        BigInteger bigInteger3 = sprvhe2.cfr_renamed_2563();
        return new sprlpb(sprtjb2, sprrlb2, bigInteger2, bigInteger3);
    }

    /*
     * WARNING - void declaration
     */
    public spricd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new spravc((Provider)arg0);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ PublicKey cfr_renamed_2564(sprvhe arg0) throws spriad, InvalidKeySpecException {
        sprlpb sprlpb2 = this.cfr_renamed_2556(arg0);
        sprrlb sprrlb2 = sprlpb2.cfr_renamed_1769().cfr_renamed_2002(arg0.cfr_renamed_2565());
        sprkkb sprkkb2 = new sprkkb(sprrlb2, sprlpb2);
        try {
            KeyFactory keyFactory = this.cfr_renamed_4.cfr_renamed_1511(sprnkp.cfr_renamed_9("!/ ?%"));
            return keyFactory.generatePublic(sprkkb2);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new spriad(new StringBuilder().insert(0, sprchm.cfr_renamed_9("w\u0010z\u001f{\u00054\u0017}\u001fpQd\u0003{\u0007}\u0015q\u0003.Q")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new spriad(new StringBuilder().insert(0, sprnkp.cfr_renamed_9("\u0007\r\n\u0002\u000b\u0018D\n\r\u0002\u0000L\u0005\u0000\u0003\u0003\u0016\u0005\u0010\u0004\tL!/ ?%VD")).append(noSuchAlgorithmException.getMessage()).toString(), noSuchAlgorithmException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_2566(sprvae arg0) throws spriad, InvalidKeySpecException {
        if (arg0.cfr_renamed_2567().cfr_renamed_1493(sprmg.cfr_renamed_102)) {
            return this.cfr_renamed_2564((sprvhe)arg0);
        }
        sprgke sprgke2 = (sprgke)arg0;
        RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(sprgke2.cfr_renamed_2295(), sprgke2.cfr_renamed_2296());
        try {
            KeyFactory keyFactory = this.cfr_renamed_4.cfr_renamed_1511("RSA");
            return keyFactory.generatePublic(rSAPublicKeySpec);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new spriad(new StringBuilder().insert(0, sprchm.cfr_renamed_9("w\u0010z\u001f{\u00054\u0017}\u001fpQd\u0003{\u0007}\u0015q\u0003.Q")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new spriad(new StringBuilder().insert(0, sprnkp.cfr_renamed_9("\u0007\r\n\u0002\u000b\u0018D\n\r\u0002\u0000L\u0005\u0000\u0003\u0003\u0016\u0005\u0010\u0004\tL!/ ?%VD")).append(noSuchAlgorithmException.getMessage()).toString(), noSuchAlgorithmException);
        }
    }

    private static /* synthetic */ sprpib cfr_renamed_2323(EllipticCurve arg0) {
        EllipticCurve ellipticCurve = arg0;
        ECField eCField = ellipticCurve.getField();
        BigInteger bigInteger = ellipticCurve.getA();
        BigInteger bigInteger2 = ellipticCurve.getB();
        if (eCField instanceof ECFieldFp) {
            return new sprtjb(((ECFieldFp)eCField).getP(), bigInteger, bigInteger2);
        }
        throw new IllegalStateException(sprchm.cfr_renamed_9("z\u001e`Q}\u001cd\u001dq\u001cq\u001f`\u0014pQm\u0014`P5P"));
    }

    /*
     * WARNING - void declaration
     */
    public spricd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprbyc((String)arg0);
        return this;
    }

    public sprvae cfr_renamed_2568(sprtzd arg0, PublicKey arg1) {
        if (arg1 instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey)arg1;
            return new sprgke(arg0, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        ECPublicKey eCPublicKey = (ECPublicKey)arg1;
        ECParameterSpec eCParameterSpec = eCPublicKey.getParams();
        return new sprvhe(arg0, ((ECFieldFp)eCParameterSpec.getCurve().getField()).getP(), eCParameterSpec.getCurve().getA(), eCParameterSpec.getCurve().getB(), spricd.cfr_renamed_2323(eCParameterSpec.getCurve()).cfr_renamed_1991(eCParameterSpec.getGenerator().getAffineX(), eCParameterSpec.getGenerator().getAffineY(), false).cfr_renamed_91(), eCParameterSpec.getOrder(), spricd.cfr_renamed_2323(eCParameterSpec.getCurve()).cfr_renamed_1991(eCPublicKey.getW().getAffineX(), eCPublicKey.getW().getAffineY(), false).cfr_renamed_91(), eCParameterSpec.getCofactor());
    }

    public spricd() {
        spricd spricd2 = this;
        spricd2.cfr_renamed_4 = new sprmwc();
    }
}

