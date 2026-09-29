/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprowl;
import com.spire.presentation.packages.sprwcl;
import com.spire.presentation.packages.sprwmg;
import com.spire.presentation.packages.sprymg;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class spryll
extends sprwcl {
    /*
     * WARNING - void declaration
     */
    public spryll(X509Certificate x509Certificate, sprymg sprymg2) throws CertificateEncodingException {
        super(new sprdsm(new sprowl((X509Certificate)arg0).cfr_renamed_568()), (sprymg)arg1);
        void arg1;
        void arg0;
    }

    public spryll(byte[] arg0, sprymg arg1) {
        super(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public spryll(X509Certificate x509Certificate, sprddm sprddm2) throws CertificateEncodingException {
        super(new sprdsm(new sprowl((X509Certificate)arg0).cfr_renamed_568()), (sprymg)new sprwmg((sprddm)arg1, arg0.getPublicKey()));
        void arg1;
        void arg0;
    }

    public spryll cfr_renamed_1499(String arg0) {
        ((sprwmg)this.cfr_renamed_4).cfr_renamed_1499(arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spryll(X509Certificate x509Certificate) throws CertificateEncodingException {
        super(new sprdsm(new sprowl((X509Certificate)arg0).cfr_renamed_568()), (sprymg)new sprwmg((X509Certificate)arg0));
        void arg0;
    }

    public spryll(byte[] arg0, PublicKey arg1) {
        byte[] byArray = arg0;
        super(arg0, (sprymg)new sprwmg(arg1));
    }

    public spryll(byte[] arg0, sprddm arg1, PublicKey arg2) {
        byte[] byArray = arg0;
        super(arg0, (sprymg)new sprwmg(arg1, arg2));
    }

    public spryll cfr_renamed_7451(sprlem arg0, String arg1) {
        ((sprwmg)this.cfr_renamed_4).cfr_renamed_7451(arg0, arg1);
        return this;
    }

    public spryll cfr_renamed_1498(Provider arg0) {
        ((sprwmg)this.cfr_renamed_4).cfr_renamed_1498(arg0);
        return this;
    }
}

