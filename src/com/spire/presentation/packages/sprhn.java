/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

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

public interface sprhn {
    public Signature cfr_renamed_1539(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public AlgorithmParameterGenerator cfr_renamed_107(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public AlgorithmParameters cfr_renamed_1540(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public KeyGenerator cfr_renamed_2380(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public SecretKeyFactory cfr_renamed_1495(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public MessageDigest cfr_renamed_1553(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public KeyPairGenerator cfr_renamed_2381(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public Mac cfr_renamed_1508(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public KeyFactory cfr_renamed_1511(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public KeyAgreement cfr_renamed_2382(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public Cipher cfr_renamed_1496(String var1) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;

    public CertificateFactory cfr_renamed_1550(String var1) throws NoSuchAlgorithmException, NoSuchProviderException, CertificateException;
}

