/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprewi;
import com.spire.presentation.packages.sprlkaa;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class sprjai
extends sprqqe {
    public sprddm cfr_renamed_91;
    public String cfr_renamed_0;
    public sprddm cfr_renamed_1;
    public PublicKey cfr_renamed_2;
    public sprdye cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public void cfr_renamed_21(PublicKey arg0) {
        this.cfr_renamed_2 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = new sprrvm();
        sprrvm sprrvm4 = new sprrvm();
        try {
            sprrvm4.cfr_renamed_5004(this.cfr_renamed_2369());
            sprrvm2 = sprrvm4;
        }
        catch (Exception exception) {
            sprrvm2 = sprrvm4;
        }
        sprrvm2.cfr_renamed_5004(new sprnrm(this.cfr_renamed_0));
        sprrvm sprrvm5 = sprrvm3;
        sprrvm sprrvm6 = sprrvm3;
        sprrvm5.cfr_renamed_5004(new sprcen(sprrvm4));
        sprrvm5.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm5.cfr_renamed_5004(new sprdye(this.cfr_renamed_4));
        return new sprcen(sprrvm3);
    }

    private static /* synthetic */ sprszm cfr_renamed_2371(byte[] arg0) throws IOException {
        return sprszm.cfr_renamed_23(new sprrzm(new ByteArrayInputStream(arg0)).cfr_renamed_24());
    }

    public void cfr_renamed_2370(String arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_2367(PrivateKey arg0) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException, InvalidKeySpecException {
        this.cfr_renamed_2368(arg0, null);
    }

    public void cfr_renamed_9178(sprddm arg0) {
        this.cfr_renamed_91 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprxgf cfr_renamed_2369() throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchProviderException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprxgf sprxgf2 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            byteArrayOutputStream2.write(this.cfr_renamed_2.getEncoded());
            byteArrayOutputStream2.close();
            sprrzm sprrzm2 = new sprrzm(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            return sprrzm2.cfr_renamed_24();
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(iOException.getMessage());
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjai(String string, sprddm sprddm2, PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchProviderException {
        void arg1;
        void arg0;
        sprjai sprjai2 = this;
        this.cfr_renamed_0 = arg0;
        sprjai2.cfr_renamed_1 = arg1;
        sprjai2.cfr_renamed_2 = publicKey;
        sprrvm sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2369());
        sprrvm2.cfr_renamed_5004(new sprnrm((String)arg0));
        try {
            this.cfr_renamed_3 = new sprdye(new sprcen(sprrvm2));
            return;
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprewi.cfr_renamed_9("\u007f%y8j)s2t}\u007f3y2~4t::6\u007f$ }")).append(iOException.toString()).toString());
        }
    }

    public PublicKey cfr_renamed_1157() {
        return this.cfr_renamed_2;
    }

    public sprddm cfr_renamed_2372() {
        return this.cfr_renamed_1;
    }

    public sprddm cfr_renamed_2373() {
        return this.cfr_renamed_91;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_2368(PrivateKey arg0, SecureRandom arg1) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException, InvalidKeySpecException {
        Signature signature = Signature.getInstance(this.cfr_renamed_1.cfr_renamed_593().cfr_renamed_19(), "BC");
        if (arg1 != null) {
            signature.initSign(arg0, arg1);
        } else {
            signature.initSign(arg0);
        }
        sprrvm sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_2369());
        sprrvm2.cfr_renamed_5004(new sprnrm(this.cfr_renamed_0));
        try {
            signature.update(new sprcen(sprrvm2).cfr_renamed_104("DER"));
        }
        catch (IOException iOException) {
            throw new SignatureException(iOException.getMessage());
        }
        this.cfr_renamed_4 = signature.sign();
    }

    public String cfr_renamed_2366() {
        return this.cfr_renamed_0;
    }

    public boolean cfr_renamed_1623(String arg0) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException {
        Signature signature;
        if (!arg0.equals(this.cfr_renamed_0)) {
            return false;
        }
        Signature signature2 = signature = Signature.getInstance(this.cfr_renamed_1.cfr_renamed_593().cfr_renamed_19(), "BC");
        sprjai sprjai2 = this;
        signature.initVerify(sprjai2.cfr_renamed_2);
        signature2.update(sprjai2.cfr_renamed_3.cfr_renamed_81());
        return signature2.verify(this.cfr_renamed_4);
    }

    public sprjai(byte[] arg0) throws IOException {
        this(sprjai.cfr_renamed_2371(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjai(sprszm arg0) {
        try {
            if (arg0.cfr_renamed_84() != 3) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprlkaa.cfr_renamed_9("RPM_WW_\u001ehnp\u007fx\u001e\u0013MRD^\u0017\u0001")).append(arg0.cfr_renamed_84()).toString());
            }
            sprszm sprszm2 = arg0;
            this.cfr_renamed_1 = sprddm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
            this.cfr_renamed_4 = ((sprdye)sprszm2.cfr_renamed_85(2)).cfr_renamed_186();
            sprszm sprszm3 = (sprszm)arg0.cfr_renamed_85(0);
            if (sprszm3.cfr_renamed_84() != 2) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprewi.cfr_renamed_9("s3l<v4~}J\u0016[\u001e:uv8tt }")).append(sprszm3.cfr_renamed_84()).toString());
            }
            this.cfr_renamed_0 = ((sprupm)sprszm3.cfr_renamed_85(1)).cfr_renamed_314();
            sprjai sprjai2 = this;
            sprjai sprjai3 = this;
            sprjai2.cfr_renamed_3 = new sprdye(sprszm3);
            sprvhm sprvhm2 = sprvhm.cfr_renamed_23(sprszm3.cfr_renamed_85(0));
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(new sprdye(sprvhm2).cfr_renamed_81());
            sprjai2.cfr_renamed_91 = sprvhm2.cfr_renamed_593();
            this.cfr_renamed_2 = KeyFactory.getInstance(this.cfr_renamed_91.cfr_renamed_593().cfr_renamed_19(), "BC").generatePublic(x509EncodedKeySpec);
            return;
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(exception.toString());
        }
    }

    public void cfr_renamed_9179(sprddm arg0) {
        this.cfr_renamed_1 = arg0;
    }
}

