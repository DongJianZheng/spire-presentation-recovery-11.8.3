/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdhea;
import com.spire.presentation.packages.sprdqd;
import com.spire.presentation.packages.sprhd;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;

public class sprvog
extends X509CertSelector
implements sprhd {
    @Override
    public Object clone() {
        return (sprvog)super.clone();
    }

    @Override
    public boolean match(Certificate arg0) {
        return this.cfr_renamed_132(arg0);
    }

    public boolean cfr_renamed_132(Object arg0) {
        if (!(arg0 instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate)arg0;
        return super.match(x509Certificate);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprvog cfr_renamed_173(X509CertSelector arg0) {
        sprvog sprvog2;
        if (arg0 == null) {
            throw new IllegalArgumentException(sprdhea.cfr_renamed_9("\u001fQ\u0012^\u0013D\\S\u000eU\u001dD\u0019\u0010\u001aB\u0013]\\^\t\\\u0010\u0010\u000fU\u0010U\u001fD\u0013B"));
        }
        sprvog sprvog3 = sprvog2 = new sprvog();
        X509CertSelector x509CertSelector = arg0;
        sprvog sprvog4 = sprvog2;
        sprvog4.setAuthorityKeyIdentifier(arg0.getAuthorityKeyIdentifier());
        sprvog4.setBasicConstraints(arg0.getBasicConstraints());
        sprvog2.setCertificate(x509CertSelector.getCertificate());
        sprvog3.setCertificateValid(x509CertSelector.getCertificateValid());
        sprvog3.setMatchAllSubjectAltNames(arg0.getMatchAllSubjectAltNames());
        try {
            sprvog sprvog5 = sprvog2;
            X509CertSelector x509CertSelector2 = arg0;
            sprvog sprvog6 = sprvog2;
            X509CertSelector x509CertSelector3 = arg0;
            sprvog2.setPathToNames(arg0.getPathToNames());
            sprvog2.setExtendedKeyUsage(x509CertSelector3.getExtendedKeyUsage());
            sprvog6.setNameConstraints(x509CertSelector3.getNameConstraints());
            sprvog6.setPolicy(arg0.getPolicy());
            sprvog5.setSubjectPublicKeyAlgID(x509CertSelector2.getSubjectPublicKeyAlgID());
            sprvog5.setSubjectAlternativeNames(x509CertSelector2.getSubjectAlternativeNames());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdqd.cfr_renamed_9("w\u007f`b`-{c2}s~ahv-{c2~wawnfb`72")).append(iOException).toString());
        }
        sprvog2.setIssuer(arg0.getIssuer());
        sprvog sprvog7 = sprvog2;
        X509CertSelector x509CertSelector4 = arg0;
        sprvog sprvog8 = sprvog2;
        X509CertSelector x509CertSelector5 = arg0;
        sprvog2.setKeyUsage(x509CertSelector5.getKeyUsage());
        sprvog8.setPrivateKeyValid(x509CertSelector5.getPrivateKeyValid());
        sprvog8.setSerialNumber(arg0.getSerialNumber());
        sprvog2.setSubject(x509CertSelector4.getSubject());
        sprvog7.setSubjectKeyIdentifier(x509CertSelector4.getSubjectKeyIdentifier());
        sprvog7.setSubjectPublicKey(arg0.getSubjectPublicKey());
        return sprvog7;
    }
}

