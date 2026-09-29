/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhn;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;

public class sprrwd
implements sprhn {
    public final String cfr_renamed_4;

    public sprrwd(String string) {
        this.cfr_renamed_4 = string;
    }

    @Override
    public KeyPairGenerator cfr_renamed_2381(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyPairGenerator.getInstance(arg0, this.cfr_renamed_4);
    }

    @Override
    public Mac cfr_renamed_1508(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return Mac.getInstance(arg0, this.cfr_renamed_4);
    }

    @Override
    public Cipher cfr_renamed_1496(String arg0) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {
        return Cipher.getInstance(arg0, this.cfr_renamed_4);
    }

    @Override
    public KeyAgreement cfr_renamed_2382(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyAgreement.getInstance(arg0, this.cfr_renamed_4);
    }

    @Override
    public AlgorithmParameters cfr_renamed_1540(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return AlgorithmParameters.getInstance(arg0, this.cfr_renamed_4);
    }

    @Override
    public KeyGenerator cfr_renamed_2380(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyGenerator.getInstance(arg0, this.cfr_renamed_4);
    }

    @Override
    public CertificateFactory cfr_renamed_1550(String arg0) throws NoSuchAlgorithmException, CertificateException, NoSuchProviderException {
        return CertificateFactory.getInstance(arg0, this.cfr_renamed_4);
    }

    @Override
    public Signature cfr_renamed_1539(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return Signature.getInstance(arg0, this.cfr_renamed_4);
    }

    @Override
    public KeyFactory cfr_renamed_1511(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyFactory.getInstance(arg0, this.cfr_renamed_4);
    }

    @Override
    public SecretKeyFactory cfr_renamed_1495(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return SecretKeyFactory.getInstance(arg0, this.cfr_renamed_4);
    }

    @Override
    public AlgorithmParameterGenerator cfr_renamed_107(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return AlgorithmParameterGenerator.getInstance(arg0, this.cfr_renamed_4);
    }

    @Override
    public MessageDigest cfr_renamed_1553(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return MessageDigest.getInstance(arg0, this.cfr_renamed_4);
    }
}

