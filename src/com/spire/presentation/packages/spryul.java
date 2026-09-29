/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprghb;
import com.spire.presentation.packages.sprnnl;
import com.spire.presentation.packages.sprprl;
import com.spire.presentation.packages.sprtiz;
import com.spire.presentation.packages.sprtnl;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvol;
import com.spire.presentation.packages.sprwql;
import com.spire.presentation.packages.sprwtl;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class spryul {
    private sprvol cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spryul cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprnnl((String)arg0);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_7519(sprtpl arg0) throws CertificateException {
        try {
            CertificateFactory certificateFactory = this.cfr_renamed_4.cfr_renamed_4317(sprghb.cfr_renamed_9("[]6C:"));
            return (X509Certificate)certificateFactory.generateCertificate(new ByteArrayInputStream(arg0.cfr_renamed_91()));
        }
        catch (IOException iOException) {
            throw new sprprl(new StringBuilder().insert(0, sprtiz.cfr_renamed_9("\u0012\u000b\u0014\u0016\u0007\u0007\u001e\u001c\u0019S\u0007\u0012\u0005\u0000\u001e\u001d\u0010S\u0014\u0016\u0005\u0007\u001e\u0015\u001e\u0010\u0016\u0007\u0012IW")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprtnl(new StringBuilder().insert(0, sprghb.cfr_renamed_9("\u0010b\u001dm\u001cwSe\u001am\u0017#\u0001f\u0002v\u001aq\u0016gSs\u0001l\u0005j\u0017f\u00019")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
    }

    public spryul() {
        spryul spryul2 = this;
        this.cfr_renamed_4 = new sprwtl();
        spryul2.cfr_renamed_4 = new sprwtl();
    }

    /*
     * WARNING - void declaration
     */
    public spryul cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprwql((Provider)arg0);
        return this;
    }
}

