/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprfql;
import com.spire.presentation.packages.sprhkm;
import com.spire.presentation.packages.sprjg;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprowl;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class spronl
extends sprfql {
    /*
     * WARNING - void declaration
     */
    public sprhkm cfr_renamed_1561(X509Certificate x509Certificate) throws CertificateEncodingException, sprcsl {
        void arg0;
        return this.cfr_renamed_7464(new sprowl((X509Certificate)arg0));
    }

    public spronl(sprjg arg0, sprmh arg1) {
        super(arg0, arg1);
    }

    public sprhkm cfr_renamed_1568(PrivateKey arg0) throws CertificateEncodingException, sprcsl {
        return this.cfr_renamed_10963(sprcom.cfr_renamed_23(arg0.getEncoded()));
    }
}

