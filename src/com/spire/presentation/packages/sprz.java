/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraua;
import com.spire.presentation.packages.sprawa;
import com.spire.presentation.packages.sprrva;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Extension;
import java.util.Date;

public interface sprz
extends X509Extension {
    public BigInteger cfr_renamed_114();

    public void cfr_renamed_107() throws CertificateExpiredException, CertificateNotYetValidException;

    public void cfr_renamed_96(Date var1) throws CertificateExpiredException, CertificateNotYetValidException;

    public Date cfr_renamed_0();

    public byte[] cfr_renamed_79();

    public void cfr_renamed_88(PublicKey var1, String var2) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

    public Date cfr_renamed_86();

    public sprrva cfr_renamed_93();

    public boolean[] cfr_renamed_105();

    public spraua cfr_renamed_102();

    public sprawa[] cfr_renamed_82();

    public byte[] cfr_renamed_91() throws IOException;

    public int cfr_renamed_3();

    public sprawa[] cfr_renamed_112(String var1);
}

