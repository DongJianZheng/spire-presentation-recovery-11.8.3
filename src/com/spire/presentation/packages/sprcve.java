/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranj;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcpe;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.sprdzl;
import com.spire.presentation.packages.spriue;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnuc;
import com.spire.presentation.packages.sprodm;
import com.spire.presentation.packages.sprrbaa;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprvhm;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;

public class sprcve {
    private sprodm cfr_renamed_91;
    private sprlem cfr_renamed_0;
    private final sprrr cfr_renamed_1;
    private final spranj cfr_renamed_2;
    private sprddm cfr_renamed_3;
    private String cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_15(PrivateKey arg0, SecureRandom arg1) throws SecurityException, SignatureException, InvalidKeyException {
        try {
            return this.cfr_renamed_7(arg0, "BC", arg1);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new SecurityException(sprrbaa.cfr_renamed_9("\u0017wuD'[#]1Q'\u0014;[!\u0014<Z&@4X9Q1\u0015"));
        }
    }

    public X509Certificate cfr_renamed_42(PrivateKey arg0, String arg1) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_7(arg0, arg1, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_38(PrivateKey arg0, SecureRandom arg1) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprdzl sprdzl2 = this.cfr_renamed_91.cfr_renamed_32();
        try {
            sprcve sprcve2 = this;
            byte[] byArray = spriue.cfr_renamed_5014(sprcve2.cfr_renamed_0, sprcve2.cfr_renamed_4, arg0, arg1, sprdzl2);
            return this.cfr_renamed_5003(sprdzl2, byArray);
        }
        catch (IOException iOException) {
            throw new sprcpe(sprnuc.cfr_renamed_9("QnWsDb]yZ6QxWyP\u007fZq\u0014BvE\u0014uQd@"), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_50(String arg0) {
        this.cfr_renamed_4 = arg0;
        try {
            this.cfr_renamed_0 = spriue.cfr_renamed_51(arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(sprrbaa.cfr_renamed_9("\u0000Z>Z:C;\u0014&]2Z4@ F0\u0014!M%QuF0E Q&@0P"));
        }
        this.cfr_renamed_3 = spriue.cfr_renamed_4995(this.cfr_renamed_0, arg0);
        sprcve sprcve2 = this;
        sprcve2.cfr_renamed_91.cfr_renamed_4996(sprcve2.cfr_renamed_3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_16(X500Principal arg0) {
        try {
            this.cfr_renamed_91.cfr_renamed_5010(new sprdzh(arg0.getEncoded()));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprnuc.cfr_renamed_9("WwZ1@6Dd[uQeG6Dd]xW\u007fDwX,\u0014")).append(iOException).toString());
        }
    }

    public void cfr_renamed_5012(sprjii arg0) {
        this.cfr_renamed_91.cfr_renamed_5010(arg0);
    }

    public X509Certificate cfr_renamed_20(PrivateKey arg0, String arg1) throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_8(arg0, arg1, null);
    }

    public sprcve() {
        sprcve sprcve2 = this;
        this.cfr_renamed_1 = new sprdki();
        sprcve2.cfr_renamed_2 = new spranj();
        this.cfr_renamed_91 = new sprodm();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_43(X500Principal arg0) {
        try {
            this.cfr_renamed_91.cfr_renamed_5007(new sprdzh(arg0.getEncoded()));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrbaa.cfr_renamed_9("W4Zr@uD'[6Q&GuD'];W<D4Xo\u0014")).append(iOException).toString());
        }
    }

    public void cfr_renamed_12(Date arg0) {
        this.cfr_renamed_91.cfr_renamed_5005(new sprrcm(arg0));
    }

    public void cfr_renamed_41() {
        sprcve sprcve2 = this;
        sprcve2.cfr_renamed_91 = new sprodm();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_14(PrivateKey arg0) throws SecurityException, SignatureException, InvalidKeyException {
        try {
            return this.cfr_renamed_7(arg0, "BC", null);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new SecurityException(sprnuc.cfr_renamed_9("Tw6Dd[`]rQd\u0014x[b\u0014\u007fZe@wXzQr\u0015"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_21(PublicKey arg0) {
        try {
            this.cfr_renamed_91.cfr_renamed_5006(sprvhm.cfr_renamed_23(arg0.getEncoded()));
            return;
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrbaa.cfr_renamed_9(" Z4V9Qu@:\u0014%F:W0G&\u0014>Q,\u0014x\u0014")).append(exception.toString()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_7(PrivateKey arg0, String arg1, SecureRandom arg2) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
        try {
            return this.cfr_renamed_8(arg0, arg1, arg2);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw noSuchProviderException;
        }
        catch (SignatureException signatureException) {
            throw signatureException;
        }
        catch (InvalidKeyException invalidKeyException) {
            throw invalidKeyException;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new SecurityException(new StringBuilder().insert(0, sprnuc.cfr_renamed_9("QnWsDb]yZ,\u0014")).append(generalSecurityException).toString());
        }
    }

    public void cfr_renamed_5011(sprjii arg0) {
        this.cfr_renamed_91.cfr_renamed_5007(arg0);
    }

    public void cfr_renamed_45(Date arg0) {
        this.cfr_renamed_91.cfr_renamed_4999(new sprrcm(arg0));
    }

    public X509Certificate cfr_renamed_37(PrivateKey arg0) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_38(arg0, null);
    }

    public Iterator cfr_renamed_25() {
        return spriue.cfr_renamed_26();
    }

    public void cfr_renamed_10(BigInteger arg0) {
        if (arg0.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException(sprrbaa.cfr_renamed_9("&Q']4XuZ Y7Q'\u00148A&@uV0\u00144\u0014%[&]!]#Qu];@0S0F"));
        }
        this.cfr_renamed_91.cfr_renamed_5001(new sprktm(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ X509Certificate cfr_renamed_5003(sprdzl arg0, byte[] arg1) throws CertificateEncodingException {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(arg0);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprdye(arg1));
        try {
            return (X509Certificate)this.cfr_renamed_2.engineGenerateCertificate(new ByteArrayInputStream(new sprcen(sprrvm2).cfr_renamed_104("DER")));
        }
        catch (Exception exception) {
            throw new sprcpe(sprnuc.cfr_renamed_9("sLuQf@\u007f[x\u0014fFyPcW\u007fZq\u0014uQd@\u007fR\u007fWw@s\u0014yV|Qu@"), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_8(PrivateKey arg0, String arg1, SecureRandom arg2) throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprdzl sprdzl2 = this.cfr_renamed_91.cfr_renamed_32();
        try {
            sprcve sprcve2 = this;
            byte[] byArray = spriue.cfr_renamed_5008(sprcve2.cfr_renamed_0, sprcve2.cfr_renamed_4, arg1, arg0, arg2, sprdzl2);
            return this.cfr_renamed_5003(sprdzl2, byArray);
        }
        catch (IOException iOException) {
            throw new sprcpe(sprrbaa.cfr_renamed_9("Q-W0D!]:ZuQ;W:P<Z2\u0014\u0001v\u0006\u00146Q'@"), iOException);
        }
    }
}

