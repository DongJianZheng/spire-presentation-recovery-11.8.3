/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdml;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprghl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprowl;
import com.spire.presentation.packages.sprpil;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class spruil
extends sprdml {
    public spruil(byte[] arg0, PublicKey arg1, sprlem arg2) {
        byte[] byArray = arg0;
        super(arg0, (sprghl)new sprpil(arg1, arg2));
    }

    public spruil cfr_renamed_10724(sprddm arg0) {
        ((sprpil)this.cfr_renamed_3).cfr_renamed_10724(arg0);
        return this;
    }

    public spruil cfr_renamed_1555(SecureRandom arg0) {
        ((sprpil)this.cfr_renamed_3).cfr_renamed_1555(arg0);
        return this;
    }

    public spruil cfr_renamed_1498(Provider arg0) {
        ((sprpil)this.cfr_renamed_3).cfr_renamed_1498(arg0);
        return this;
    }

    public spruil cfr_renamed_7451(sprlem arg0, String arg1) {
        ((sprpil)this.cfr_renamed_3).cfr_renamed_7451(arg0, arg1);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spruil(X509Certificate x509Certificate, sprlem sprlem2) throws CertificateEncodingException {
        super(new sprdsm(new sprowl((X509Certificate)arg0).cfr_renamed_568()), (sprghl)new sprpil(arg0.getPublicKey(), (sprlem)arg1));
        void arg1;
        void arg0;
    }

    public spruil cfr_renamed_1499(String arg0) {
        ((sprpil)this.cfr_renamed_3).cfr_renamed_1499(arg0);
        return this;
    }
}

