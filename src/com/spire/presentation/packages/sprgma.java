/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprefs;
import com.spire.presentation.packages.sprvjn;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;

public class sprgma
extends X509CertSelector
implements sprb {
    @Override
    public boolean cfr_renamed_132(Object arg0) {
        if (!(arg0 instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate)arg0;
        return super.match(x509Certificate);
    }

    @Override
    public boolean match(Certificate arg0) {
        return this.cfr_renamed_132(arg0);
    }

    @Override
    public Object clone() {
        return (sprgma)super.clone();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprgma cfr_renamed_173(X509CertSelector arg0) {
        sprgma sprgma2;
        if (arg0 == null) {
            throw new IllegalArgumentException(sprvjn.cfr_renamed_9("]4P;Q!\u001e6L0_![uX'Q8\u001e;K9RuM0R0]!Q'"));
        }
        sprgma sprgma3 = sprgma2 = new sprgma();
        X509CertSelector x509CertSelector = arg0;
        sprgma sprgma4 = sprgma2;
        sprgma4.setAuthorityKeyIdentifier(arg0.getAuthorityKeyIdentifier());
        sprgma4.setBasicConstraints(arg0.getBasicConstraints());
        sprgma2.setCertificate(x509CertSelector.getCertificate());
        sprgma3.setCertificateValid(x509CertSelector.getCertificateValid());
        sprgma3.setMatchAllSubjectAltNames(arg0.getMatchAllSubjectAltNames());
        try {
            sprgma sprgma5 = sprgma2;
            X509CertSelector x509CertSelector2 = arg0;
            sprgma sprgma6 = sprgma2;
            X509CertSelector x509CertSelector3 = arg0;
            sprgma2.setPathToNames(arg0.getPathToNames());
            sprgma2.setExtendedKeyUsage(x509CertSelector3.getExtendedKeyUsage());
            sprgma6.setNameConstraints(x509CertSelector3.getNameConstraints());
            sprgma6.setPolicy(arg0.getPolicy());
            sprgma5.setSubjectPublicKeyAlgID(x509CertSelector2.getSubjectPublicKeyAlgID());
            sprgma5.setSubjectAlternativeNames(x509CertSelector2.getSubjectAlternativeNames());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprefs.cfr_renamed_9("k(|5|zg4.*o)}?jzg4.)k6k9z5|`.")).append(iOException).toString());
        }
        sprgma2.setIssuer(arg0.getIssuer());
        sprgma sprgma7 = sprgma2;
        X509CertSelector x509CertSelector4 = arg0;
        sprgma sprgma8 = sprgma2;
        X509CertSelector x509CertSelector5 = arg0;
        sprgma2.setKeyUsage(x509CertSelector5.getKeyUsage());
        sprgma8.setPrivateKeyValid(x509CertSelector5.getPrivateKeyValid());
        sprgma8.setSerialNumber(arg0.getSerialNumber());
        sprgma2.setSubject(x509CertSelector4.getSubject());
        sprgma7.setSubjectKeyIdentifier(x509CertSelector4.getSubjectKeyIdentifier());
        sprgma7.setSubjectPublicKey(arg0.getSubjectPublicKey());
        return sprgma7;
    }
}

