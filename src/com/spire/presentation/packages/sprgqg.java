/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralg;
import com.spire.presentation.packages.sprbwl;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdcka;
import com.spire.presentation.packages.sprgh;
import com.spire.presentation.packages.sprowl;
import com.spire.presentation.packages.sprutf;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;

public class sprgqg
extends spralg {
    private String cfr_renamed_0;
    private char[] cfr_renamed_1;
    private Provider cfr_renamed_2;
    private Object cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Object cfr_renamed_1621(Object arg0) throws IOException {
        if (arg0 instanceof X509Certificate) {
            try {
                return new sprowl((X509Certificate)arg0);
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprdcka.cfr_renamed_9("e(H'I=\u0006,H*I-CiI+L,E=\u001ci")).append(certificateEncodingException.toString()).toString());
            }
        }
        if (arg0 instanceof X509CRL) {
            try {
                return new sprbwl((X509CRL)arg0);
            }
            catch (CRLException cRLException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprutf.cfr_renamed_9("#:\u000e5\u000f/@>\u000e8\u000f?\u0005{\u000f9\n>\u0003/Z{")).append(cRLException.toString()).toString());
            }
        }
        if (arg0 instanceof KeyPair) {
            return sprgqg.cfr_renamed_1621(((KeyPair)arg0).getPrivate());
        }
        if (arg0 instanceof PrivateKey) {
            return sprcom.cfr_renamed_23(((Key)arg0).getEncoded());
        }
        if (arg0 instanceof PublicKey) {
            return sprvhm.cfr_renamed_23(((PublicKey)arg0).getEncoded());
        }
        return arg0;
    }

    public sprgqg(Object arg0) throws IOException {
        super(sprgqg.cfr_renamed_1621(arg0));
    }

    public sprgqg(Object arg0, sprgh arg1) throws IOException {
        super(sprgqg.cfr_renamed_1621(arg0), arg1);
    }
}

