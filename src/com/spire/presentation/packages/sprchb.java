/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprlhca;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sprpcb;
import com.spire.presentation.packages.sprrcb;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class sprchb
extends sprrcb {
    public sprchb(PrivateKey arg0) {
        super(sprmke.cfr_renamed_23(arg0.getEncoded()));
    }

    public sprchb(PrivateKey arg0, sproa arg1) {
        super(sprmke.cfr_renamed_23(arg0.getEncoded()), arg1);
    }

    public sprchb(X509Certificate arg0) throws IOException {
        super(sprchb.cfr_renamed_1509(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprcge cfr_renamed_1509(X509Certificate arg0) throws IOException {
        try {
            return sprcge.cfr_renamed_23(arg0.getEncoded());
        }
        catch (CertificateEncodingException certificateEncodingException) {
            throw new sprpcb(new StringBuilder().insert(0, sprlhca.cfr_renamed_9("<\u00031\f0\u0016\u007f\u00071\u00010\u0006:B<\u0007-\u00166\u00046\u0001>\u0016:X\u007f")).append(certificateEncodingException.getMessage()).toString(), certificateEncodingException);
        }
    }
}

