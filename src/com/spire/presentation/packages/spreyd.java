/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcyd;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class spreyd
extends sprcyd {
    public spreyd(X509Certificate arg0) throws CertificateEncodingException {
        super(sprcge.cfr_renamed_23(arg0.getEncoded()));
    }
}

