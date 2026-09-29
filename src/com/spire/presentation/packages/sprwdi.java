/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprtfm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzzl;
import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;

public class sprwdi {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprdzh cfr_renamed_2364(X509CRL arg0) throws CRLException {
        try {
            sprtfm sprtfm2 = sprtfm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0.getTBSCertList()));
            return new sprdzh(sprjii.cfr_renamed_23(sprtfm2.cfr_renamed_102()));
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
    public static sprdzh cfr_renamed_408(X509Certificate arg0) throws CertificateEncodingException {
        try {
            sprzzl sprzzl2 = sprzzl.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0.getTBSCertificate()));
            return new sprdzh(sprjii.cfr_renamed_23(sprzzl2.cfr_renamed_1485()));
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
    public static sprdzh cfr_renamed_373(X509Certificate arg0) throws CertificateEncodingException {
        try {
            sprzzl sprzzl2 = sprzzl.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0.getTBSCertificate()));
            return new sprdzh(sprjii.cfr_renamed_23(sprzzl2.cfr_renamed_102()));
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(iOException.toString());
        }
    }
}

