/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprepaa;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryym;
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

public class sprbsb
extends sprkra {
    public sprije cfr_renamed_91;
    public sprmra cfr_renamed_0;
    public byte[] cfr_renamed_1;
    public sprije cfr_renamed_2;
    public PublicKey cfr_renamed_3;
    public String cfr_renamed_4;

    public String cfr_renamed_2366() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_2367(PrivateKey arg0) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException, InvalidKeySpecException {
        this.cfr_renamed_2368(arg0, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprvva cfr_renamed_2369() throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchProviderException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprvva sprvva2 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            byteArrayOutputStream2.write(this.cfr_renamed_3.getEncoded());
            byteArrayOutputStream2.close();
            sprgle sprgle2 = new sprgle(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            return sprgle2.cfr_renamed_24();
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(iOException.getMessage());
        }
    }

    public void cfr_renamed_2370(String arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public boolean cfr_renamed_1623(String arg0) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException {
        Signature signature;
        if (!arg0.equals(this.cfr_renamed_4)) {
            return false;
        }
        Signature signature2 = signature = Signature.getInstance(this.cfr_renamed_91.cfr_renamed_90().cfr_renamed_19(), "BC");
        sprbsb sprbsb2 = this;
        signature.initVerify(sprbsb2.cfr_renamed_3);
        signature2.update(sprbsb2.cfr_renamed_0.cfr_renamed_81());
        return signature2.verify(this.cfr_renamed_1);
    }

    private static /* synthetic */ sprbne cfr_renamed_2371(byte[] arg0) throws IOException {
        return sprbne.cfr_renamed_23(new sprgle(new ByteArrayInputStream(arg0)).cfr_renamed_24());
    }

    public sprije cfr_renamed_2372() {
        return this.cfr_renamed_91;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbsb(sprbne arg0) {
        try {
            if (arg0.cfr_renamed_84() != 3) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprepaa.cfr_renamed_9("I\u0017V\u0018L\u0010DYs)k8cY\b\nI\u0003EP\u001a")).append(arg0.cfr_renamed_84()).toString());
            }
            this.cfr_renamed_91 = new sprije((sprbne)arg0.cfr_renamed_85(1));
            this.cfr_renamed_1 = ((sprmra)arg0.cfr_renamed_85(2)).cfr_renamed_81();
            sprbne sprbne2 = (sprbne)arg0.cfr_renamed_85(0);
            if (sprbne2.cfr_renamed_84() != 2) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, spryym.cfr_renamed_9("n\u001bq\u0014k\u001ccUW>F6']k\u0010i\\=U")).append(sprbne2.cfr_renamed_84()).toString());
            }
            this.cfr_renamed_4 = ((sprcae)sprbne2.cfr_renamed_85(1)).cfr_renamed_314();
            sprbsb sprbsb2 = this;
            sprbsb2.cfr_renamed_0 = new sprmra(sprbne2);
            sprdce sprdce2 = new sprdce((sprbne)sprbne2.cfr_renamed_85(0));
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(new sprmra(sprdce2).cfr_renamed_81());
            this.cfr_renamed_2 = sprdce2.cfr_renamed_1473();
            this.cfr_renamed_3 = KeyFactory.getInstance(this.cfr_renamed_2.cfr_renamed_90().cfr_renamed_19(), "BC").generatePublic(x509EncodedKeySpec);
            return;
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(exception.toString());
        }
    }

    public void cfr_renamed_1819(sprije arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public sprije cfr_renamed_2373() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_2374(sprije arg0) {
        this.cfr_renamed_2 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_2368(PrivateKey arg0, SecureRandom arg1) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException, InvalidKeySpecException {
        Signature signature = Signature.getInstance(this.cfr_renamed_91.cfr_renamed_593().cfr_renamed_19(), "BC");
        if (arg1 != null) {
            signature.initSign(arg0, arg1);
        } else {
            signature.initSign(arg0);
        }
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_2369());
        sprlre2.cfr_renamed_49(new sprcae(this.cfr_renamed_4));
        try {
            signature.update(new sprpse(sprlre2).cfr_renamed_104("DER"));
        }
        catch (IOException iOException) {
            throw new SignatureException(iOException.getMessage());
        }
        this.cfr_renamed_1 = signature.sign();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = new sprlre();
        sprlre sprlre4 = new sprlre();
        try {
            sprlre4.cfr_renamed_49(this.cfr_renamed_2369());
            sprlre2 = sprlre4;
        }
        catch (Exception exception) {
            sprlre2 = sprlre4;
        }
        sprlre2.cfr_renamed_49(new sprcae(this.cfr_renamed_4));
        sprlre sprlre5 = sprlre3;
        sprlre sprlre6 = sprlre3;
        sprlre5.cfr_renamed_49(new sprpse(sprlre4));
        sprlre5.cfr_renamed_49(this.cfr_renamed_91);
        sprlre5.cfr_renamed_49(new sprmra(this.cfr_renamed_1));
        return new sprpse(sprlre3);
    }

    public void cfr_renamed_21(PublicKey arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprbsb(byte[] arg0) throws IOException {
        this(sprbsb.cfr_renamed_2371(arg0));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbsb(String string, sprije sprije2, PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchProviderException {
        void arg1;
        void arg0;
        sprbsb sprbsb2 = this;
        this.cfr_renamed_4 = arg0;
        sprbsb2.cfr_renamed_91 = arg1;
        sprbsb2.cfr_renamed_3 = publicKey;
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_2369());
        sprlre2.cfr_renamed_49(new sprcae((String)arg0));
        try {
            this.cfr_renamed_0 = new sprmra(new sprpse(sprlre2));
            return;
        }
        catch (IOException iOException) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprepaa.cfr_renamed_9("\u001cX\u001aE\tT\u0010O\u0017\u0000\u001cN\u001aO\u001dI\u0017GYK\u001cYC\u0000")).append(iOException.toString()).toString());
        }
    }

    public PublicKey cfr_renamed_1157() {
        return this.cfr_renamed_3;
    }
}

