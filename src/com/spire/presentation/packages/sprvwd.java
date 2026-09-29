/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdhb;
import com.spire.presentation.packages.spreyd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprnza;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprvtd;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class sprvwd
extends sprvtd {
    /*
     * WARNING - void declaration
     */
    public sprvwd(X509Certificate x509Certificate, sprije sprije2) throws CertificateEncodingException {
        super(new sprvre(new spreyd((X509Certificate)arg0).cfr_renamed_568()), (sprnza)new sprdhb((sprije)arg1, arg0.getPublicKey()));
        void arg1;
        void arg0;
    }

    public sprvwd(byte[] arg0, sprije arg1, PublicKey arg2) {
        byte[] byArray = arg0;
        super(arg0, (sprnza)new sprdhb(arg1, arg2));
    }

    public sprvwd cfr_renamed_1557(sprtzd arg0, String arg1) {
        ((sprdhb)this.cfr_renamed_4).cfr_renamed_1557(arg0, arg1);
        return this;
    }

    public sprvwd cfr_renamed_1499(String arg0) {
        ((sprdhb)this.cfr_renamed_4).cfr_renamed_1499(arg0);
        return this;
    }

    public sprvwd cfr_renamed_1498(Provider arg0) {
        ((sprdhb)this.cfr_renamed_4).cfr_renamed_1498(arg0);
        return this;
    }

    public sprvwd(byte[] arg0, PublicKey arg1) {
        byte[] byArray = arg0;
        super(arg0, (sprnza)new sprdhb(arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprvwd(X509Certificate x509Certificate) throws CertificateEncodingException {
        super(new sprvre(new spreyd((X509Certificate)arg0).cfr_renamed_568()), (sprnza)new sprdhb((X509Certificate)arg0));
        void arg0;
    }
}

