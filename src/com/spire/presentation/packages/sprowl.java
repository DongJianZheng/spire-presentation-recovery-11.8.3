/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprtpl;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class sprowl
extends sprtpl {
    public sprowl(X509Certificate arg0) throws CertificateEncodingException {
        super(sprndm.cfr_renamed_23(arg0.getEncoded()));
    }
}

