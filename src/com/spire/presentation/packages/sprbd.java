/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbve;
import com.spire.presentation.packages.sprfle;
import com.spire.presentation.packages.sprnne;
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

public interface sprbd
extends X509Extension {
    public void cfr_renamed_96(Date var1) throws CertificateExpiredException, CertificateNotYetValidException;

    public void cfr_renamed_107() throws CertificateExpiredException, CertificateNotYetValidException;

    public sprfle[] cfr_renamed_82();

    public Date cfr_renamed_0();

    public sprfle[] cfr_renamed_112(String var1);

    public int cfr_renamed_3();

    public void cfr_renamed_88(PublicKey var1, String var2) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

    public BigInteger cfr_renamed_114();

    public boolean[] cfr_renamed_105();

    public byte[] cfr_renamed_91() throws IOException;

    public sprnne cfr_renamed_93();

    public sprbve cfr_renamed_102();

    public byte[] cfr_renamed_79();

    public Date cfr_renamed_86();
}

