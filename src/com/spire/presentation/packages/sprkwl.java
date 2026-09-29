/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyl;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprvof;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509CertSelector;

public class sprkwl {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprcyl cfr_renamed_4244(X509CertSelector arg0) {
        try {
            X509CertSelector x509CertSelector = arg0;
            sprnbm sprnbm2 = sprnbm.cfr_renamed_23(x509CertSelector.getIssuerAsBytes());
            BigInteger bigInteger = x509CertSelector.getSerialNumber();
            byte[] byArray = null;
            byte[] byArray2 = x509CertSelector.getSubjectKeyIdentifier();
            if (byArray2 != null) {
                byArray = sproug.cfr_renamed_23(byArray2).cfr_renamed_186();
            }
            return new sprcyl(sprnbm2, bigInteger, byArray);
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprvof.cfr_renamed_9("\u0004h\u0010d\u001dcQr\u001e&\u0012i\u001fp\u0014t\u0005&\u0018u\u0002s\u0014tK&")).append(iOException.getMessage()).toString());
        }
    }
}

