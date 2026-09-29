/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
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

public interface sprrr {
    public Signature cfr_renamed_1539(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public ExemptionMechanism cfr_renamed_9186(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public CertPathBuilder cfr_renamed_7310(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public AlgorithmParameters cfr_renamed_1540(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public KeyGenerator cfr_renamed_2380(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public Cipher cfr_renamed_1496(String var1) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;

    public Mac cfr_renamed_1508(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public MessageDigest cfr_renamed_1553(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public MessageDigest cfr_renamed_7438(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public CertPathValidator cfr_renamed_9188(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public KeyPairGenerator cfr_renamed_2381(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public CertStore cfr_renamed_9189(String var1, CertStoreParameters var2) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, NoSuchProviderException;

    public CertificateFactory cfr_renamed_1550(String var1) throws NoSuchProviderException, CertificateException;

    public AlgorithmParameterGenerator cfr_renamed_107(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public KeyFactory cfr_renamed_1511(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public SecretKeyFactory cfr_renamed_1495(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public KeyAgreement cfr_renamed_2382(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public KeyStore cfr_renamed_9187(String var1) throws KeyStoreException, NoSuchProviderException;

    public SecureRandom cfr_renamed_9185(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;
}

