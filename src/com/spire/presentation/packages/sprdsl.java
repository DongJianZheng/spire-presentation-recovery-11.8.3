/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprowl;
import com.spire.presentation.packages.sprrwl;
import com.spire.presentation.packages.sprtpl;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class sprdsl
extends sprrwl {
    public sprdsl(X509Certificate ... arg0) throws CertificateEncodingException {
        super(sprdsl.cfr_renamed_10967(arg0));
    }

    private static /* synthetic */ sprtpl[] cfr_renamed_10967(X509Certificate ... arg0) throws CertificateEncodingException {
        int n;
        sprtpl[] sprtplArray = new sprtpl[arg0.length];
        int n2 = n = 0;
        while (n2 != sprtplArray.length) {
            int n3 = n;
            sprowl sprowl2 = new sprowl(arg0[n]);
            sprtplArray[n3] = sprowl2;
            n2 = ++n;
        }
        return sprtplArray;
    }
}

