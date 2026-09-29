/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprksz;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprntd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruqr;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509CertSelector;

public class sprvvd {
    public X509CertSelector cfr_renamed_4243(sprntd arg0) {
        return this.cfr_renamed_4070(arg0.cfr_renamed_102(), arg0.cfr_renamed_114(), arg0.cfr_renamed_3955());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509CertSelector cfr_renamed_4070(spruhe arg0, BigInteger arg1, byte[] arg2) {
        BigInteger bigInteger;
        X509CertSelector x509CertSelector = new X509CertSelector();
        if (arg0 != null) {
            try {
                x509CertSelector.setIssuer(arg0.cfr_renamed_91());
                bigInteger = arg1;
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, spruqr.cfr_renamed_9("\u007f\u001fk\u0013f\u0014*\u0005eQi\u001ed\u0007o\u0003~Qc\u0002y\u0004o\u00030Q")).append(iOException.getMessage()).toString());
            }
        } else {
            bigInteger = arg1;
        }
        if (bigInteger != null) {
            x509CertSelector.setSerialNumber(arg1);
        }
        if (arg2 == null) {
            return x509CertSelector;
        }
        try {
            x509CertSelector.setSubjectKeyIdentifier(new sprlqe(arg2).cfr_renamed_91());
            return x509CertSelector;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprksz.cfr_renamed_9("NpZ|W{\u001bjT>XqUh^lO>RmHk^l\u0001>")).append(iOException.getMessage()).toString());
        }
    }
}

