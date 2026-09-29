/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.Certificate;

public interface sprzm {
    public String getAlgorithm();

    public byte[] sign() throws SignatureException;

    public int sign(byte[] var1, int var2, int var3) throws SignatureException;

    public boolean verify(byte[] var1, int var2, int var3) throws SignatureException;

    public boolean cfr_renamed_2427();

    public void update(byte[] var1) throws SignatureException;

    public void initSign(PrivateKey var1, SecureRandom var2) throws InvalidKeyException;

    public boolean verify(byte[] var1) throws SignatureException;

    public void initVerify(Certificate var1) throws InvalidKeyException;

    public void update(ByteBuffer var1) throws SignatureException;

    public void update(byte[] var1, int var2, int var3) throws SignatureException;

    public void update(byte var1) throws SignatureException;

    public void initVerify(PublicKey var1) throws InvalidKeyException;

    public PrivateKey cfr_renamed_5643();

    public void initSign(PrivateKey var1) throws InvalidKeyException;
}

