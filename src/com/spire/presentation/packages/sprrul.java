/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrr;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathValidator;
import java.security.cert.CertStore;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.ExemptionMechanism;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;

public class sprrul
implements sprrr {
    @Override
    public AlgorithmParameterGenerator cfr_renamed_107(String arg0) throws NoSuchAlgorithmException {
        return AlgorithmParameterGenerator.getInstance(arg0);
    }

    @Override
    public KeyGenerator cfr_renamed_2380(String arg0) throws NoSuchAlgorithmException {
        return KeyGenerator.getInstance(arg0);
    }

    @Override
    public SecureRandom cfr_renamed_9185(String arg0) throws NoSuchAlgorithmException {
        return SecureRandom.getInstance(arg0);
    }

    @Override
    public MessageDigest cfr_renamed_1553(String arg0) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(arg0);
    }

    @Override
    public KeyAgreement cfr_renamed_2382(String arg0) throws NoSuchAlgorithmException {
        return KeyAgreement.getInstance(arg0);
    }

    @Override
    public CertStore cfr_renamed_9189(String arg0, CertStoreParameters arg1) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        return CertStore.getInstance(arg0, arg1);
    }

    @Override
    public KeyFactory cfr_renamed_1511(String arg0) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(arg0);
    }

    @Override
    public Signature cfr_renamed_1539(String arg0) throws NoSuchAlgorithmException {
        return Signature.getInstance(arg0);
    }

    @Override
    public AlgorithmParameters cfr_renamed_1540(String arg0) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(arg0);
    }

    @Override
    public CertificateFactory cfr_renamed_1550(String arg0) throws CertificateException {
        return CertificateFactory.getInstance(arg0);
    }

    @Override
    public ExemptionMechanism cfr_renamed_9186(String arg0) throws NoSuchAlgorithmException {
        return ExemptionMechanism.getInstance(arg0);
    }

    @Override
    public Cipher cfr_renamed_1496(String arg0) throws NoSuchAlgorithmException, NoSuchPaddingException {
        return Cipher.getInstance(arg0);
    }

    @Override
    public Mac cfr_renamed_1508(String arg0) throws NoSuchAlgorithmException {
        return Mac.getInstance(arg0);
    }

    @Override
    public CertPathBuilder cfr_renamed_7310(String arg0) throws NoSuchAlgorithmException {
        return CertPathBuilder.getInstance(arg0);
    }

    @Override
    public CertPathValidator cfr_renamed_9188(String arg0) throws NoSuchAlgorithmException {
        return CertPathValidator.getInstance(arg0);
    }

    @Override
    public MessageDigest cfr_renamed_7438(String arg0) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(arg0);
    }

    @Override
    public KeyStore cfr_renamed_9187(String arg0) throws KeyStoreException {
        return KeyStore.getInstance(arg0);
    }

    @Override
    public KeyPairGenerator cfr_renamed_2381(String arg0) throws NoSuchAlgorithmException {
        return KeyPairGenerator.getInstance(arg0);
    }

    @Override
    public SecretKeyFactory cfr_renamed_1495(String arg0) throws NoSuchAlgorithmException {
        return SecretKeyFactory.getInstance(arg0);
    }
}

