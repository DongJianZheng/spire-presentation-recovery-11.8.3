/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdkg;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sproyia;
import com.spire.presentation.packages.sprulg;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class sprkfg
extends sprulg {
    public sprkfg(X509Certificate arg0) throws IOException {
        super(sprkfg.cfr_renamed_1509(arg0));
    }

    public sprkfg(PrivateKey arg0, sprmh arg1) {
        super(sprcom.cfr_renamed_23(arg0.getEncoded()), arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprndm cfr_renamed_1509(X509Certificate arg0) throws IOException {
        try {
            return sprndm.cfr_renamed_23(arg0.getEncoded());
        }
        catch (CertificateEncodingException certificateEncodingException) {
            throw new sprdkg(new StringBuilder().insert(0, sproyia.cfr_renamed_9("gLjCkY$HjNkIa\rgHvYmKmNeYa\u0017$")).append(certificateEncodingException.getMessage()).toString(), certificateEncodingException);
        }
    }

    public sprkfg(PrivateKey arg0) {
        super(sprcom.cfr_renamed_23(arg0.getEncoded()));
    }
}

