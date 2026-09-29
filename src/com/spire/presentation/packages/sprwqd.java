/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprhzd;
import com.spire.presentation.packages.sprjzo;
import com.spire.presentation.packages.sprmtd;
import com.spire.presentation.packages.sprqvd;
import com.spire.presentation.packages.sprrtd;
import com.spire.presentation.packages.sprrxd;
import com.spire.presentation.packages.sprrxj;
import com.spire.presentation.packages.sprzvd;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class sprwqd {
    private sprmtd cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_4318(sprcyd arg0) throws CertificateException {
        try {
            CertificateFactory certificateFactory = this.cfr_renamed_4.cfr_renamed_4317(sprrxj.cfr_renamed_9("M\u001f \u0001,"));
            return (X509Certificate)certificateFactory.generateCertificate(new ByteArrayInputStream(arg0.cfr_renamed_91()));
        }
        catch (IOException iOException) {
            throw new sprrxd(this, new StringBuilder().insert(0, sprjzo.cfr_renamed_9("\\\u0013Z\u000eI\u001fP\u0004WKI\nK\u0018P\u0005^KZ\u000eK\u001fP\rP\bX\u001f\\Q\u0019")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprzvd(this, new StringBuilder().insert(0, sprrxj.cfr_renamed_9("Rt_{^a\u0011sX{U5Cp@`XgTq\u0011eCzG|UpC/")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprwqd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprhzd((Provider)arg0);
        return this;
    }

    public sprwqd() {
        sprwqd sprwqd2 = this;
        this.cfr_renamed_4 = new sprqvd();
        sprwqd2.cfr_renamed_4 = new sprqvd();
    }

    /*
     * WARNING - void declaration
     */
    public sprwqd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprrtd((String)arg0);
        return this;
    }
}

