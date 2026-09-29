/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprqtj;
import com.spire.presentation.packages.sprqzj;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.util.Collection;

public class sprexj<T extends Certificate>
implements sprhd<T> {
    private final CertSelector cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public static Collection<? extends Certificate> cfr_renamed_5098(sprexj sprexj2, CertStore certStore) throws CertStoreException {
        sprexj arg0;
        void arg1;
        return arg1.getCertificates(new sprqtj(arg0));
    }

    private /* synthetic */ sprexj(CertSelector certSelector) {
        this.cfr_renamed_4 = certSelector;
    }

    public boolean cfr_renamed_9136(Certificate arg0) {
        return this.cfr_renamed_4.match(arg0);
    }

    public static /* synthetic */ CertSelector cfr_renamed_9491(sprexj arg0) {
        return arg0.cfr_renamed_4;
    }

    public /* synthetic */ sprexj(CertSelector arg0, sprqzj arg1) {
        this(arg0);
    }

    @Override
    public Object clone() {
        return new sprexj<T>(this.cfr_renamed_4);
    }

    public Certificate cfr_renamed_2141() {
        if (this.cfr_renamed_4 instanceof X509CertSelector) {
            return ((X509CertSelector)this.cfr_renamed_4).getCertificate();
        }
        return null;
    }
}

