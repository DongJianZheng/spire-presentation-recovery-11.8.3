/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdjl;
import com.spire.presentation.packages.sprkol;
import com.spire.presentation.packages.sprmwy;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprxky;
import java.io.IOException;
import java.security.cert.X509CertSelector;

public class sprzpl {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprdjl cfr_renamed_4084(X509CertSelector arg0) {
        try {
            if (arg0.getSubjectKeyIdentifier() == null) return new sprdjl(sprnbm.cfr_renamed_23(arg0.getIssuerAsBytes()), arg0.getSerialNumber());
            return new sprdjl(sprnbm.cfr_renamed_23(arg0.getIssuerAsBytes()), arg0.getSerialNumber(), sproug.cfr_renamed_23(arg0.getSubjectKeyIdentifier()).cfr_renamed_186());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmwy.cfr_renamed_9("\u0012I\u0006E\u000bBGS\b\u0007\u0004H\tQ\u0002U\u0013\u0007\u000eT\u0014R\u0002U]\u0007")).append(iOException.getMessage()).toString());
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprkol cfr_renamed_4085(X509CertSelector arg0) {
        try {
            if (arg0.getSubjectKeyIdentifier() == null) return new sprkol(sprnbm.cfr_renamed_23(arg0.getIssuerAsBytes()), arg0.getSerialNumber());
            return new sprkol(sprnbm.cfr_renamed_23(arg0.getIssuerAsBytes()), arg0.getSerialNumber(), sproug.cfr_renamed_23(arg0.getSubjectKeyIdentifier()).cfr_renamed_186());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxky.cfr_renamed_9("z\u007fnsct/e`1l~agjc{1fb|djc51")).append(iOException.getMessage()).toString());
        }
    }
}

