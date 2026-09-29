/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprqzd;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxbe;
import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;

public class sprfrb {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprfjb cfr_renamed_373(X509Certificate arg0) throws CertificateEncodingException {
        try {
            sprqzd sprqzd2 = sprqzd.cfr_renamed_23(sprvva.cfr_renamed_184(arg0.getTBSCertificate()));
            return new sprfjb(spruib.cfr_renamed_23(sprqzd2.cfr_renamed_102()));
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(iOException.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprfjb cfr_renamed_2364(X509CRL arg0) throws CRLException {
        try {
            sprxbe sprxbe2 = sprxbe.cfr_renamed_23(sprvva.cfr_renamed_184(arg0.getTBSCertList()));
            return new sprfjb(spruib.cfr_renamed_23(sprxbe2.cfr_renamed_102()));
        }
        catch (IOException iOException) {
            throw new CRLException(iOException.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprfjb cfr_renamed_408(X509Certificate arg0) throws CertificateEncodingException {
        try {
            sprqzd sprqzd2 = sprqzd.cfr_renamed_23(sprvva.cfr_renamed_184(arg0.getTBSCertificate()));
            return new sprfjb(spruib.cfr_renamed_23(sprqzd2.cfr_renamed_1485()));
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(iOException.toString());
        }
    }
}

