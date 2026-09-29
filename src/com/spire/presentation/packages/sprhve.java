/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.spriifa;
import com.spire.presentation.packages.sprolha;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;

public class sprhve
extends X509CertSelector
implements sprhd {
    @Override
    public Object clone() {
        return (sprhve)super.clone();
    }

    @Override
    public boolean match(Certificate arg0) {
        return this.cfr_renamed_132(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprhve cfr_renamed_173(X509CertSelector arg0) {
        sprhve sprhve2;
        if (arg0 == null) {
            throw new IllegalArgumentException(spriifa.cfr_renamed_9("\u001e\u0013\u0013\u001c\u0012\u0006]\u0011\u000f\u0017\u001c\u0006\u0018R\u001b\u0000\u0012\u001f]\u001c\b\u001e\u0011R\u000e\u0017\u0011\u0017\u001e\u0006\u0012\u0000"));
        }
        sprhve sprhve3 = sprhve2 = new sprhve();
        X509CertSelector x509CertSelector = arg0;
        sprhve sprhve4 = sprhve2;
        sprhve4.setAuthorityKeyIdentifier(arg0.getAuthorityKeyIdentifier());
        sprhve4.setBasicConstraints(arg0.getBasicConstraints());
        sprhve2.setCertificate(x509CertSelector.getCertificate());
        sprhve3.setCertificateValid(x509CertSelector.getCertificateValid());
        sprhve3.setMatchAllSubjectAltNames(arg0.getMatchAllSubjectAltNames());
        try {
            sprhve sprhve5 = sprhve2;
            X509CertSelector x509CertSelector2 = arg0;
            sprhve sprhve6 = sprhve2;
            X509CertSelector x509CertSelector3 = arg0;
            sprhve2.setPathToNames(arg0.getPathToNames());
            sprhve2.setExtendedKeyUsage(x509CertSelector3.getExtendedKeyUsage());
            sprhve6.setNameConstraints(x509CertSelector3.getNameConstraints());
            sprhve6.setPolicy(arg0.getPolicy());
            sprhve5.setSubjectPublicKeyAlgID(x509CertSelector2.getSubjectPublicKeyAlgID());
            sprhve5.setSubjectAlternativeNames(x509CertSelector2.getSubjectAlternativeNames());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprolha.cfr_renamed_9("fnqsq<jr#lbopyg<jr#ofpf\u007fwsq&#")).append(iOException).toString());
        }
        sprhve2.setIssuer(arg0.getIssuer());
        sprhve sprhve7 = sprhve2;
        X509CertSelector x509CertSelector4 = arg0;
        sprhve sprhve8 = sprhve2;
        X509CertSelector x509CertSelector5 = arg0;
        sprhve2.setKeyUsage(x509CertSelector5.getKeyUsage());
        sprhve8.setPrivateKeyValid(x509CertSelector5.getPrivateKeyValid());
        sprhve8.setSerialNumber(arg0.getSerialNumber());
        sprhve2.setSubject(x509CertSelector4.getSubject());
        sprhve7.setSubjectKeyIdentifier(x509CertSelector4.getSubjectKeyIdentifier());
        sprhve7.setSubjectPublicKey(arg0.getSubjectPublicKey());
        return sprhve7;
    }

    public boolean cfr_renamed_132(Object arg0) {
        if (!(arg0 instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate)arg0;
        return super.match(x509Certificate);
    }
}

