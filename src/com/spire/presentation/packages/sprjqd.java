/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprgyd;
import com.spire.presentation.packages.sprhzd;
import com.spire.presentation.packages.sprmtd;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprqvd;
import com.spire.presentation.packages.sprrdaa;
import com.spire.presentation.packages.sprrtd;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;

public class sprjqd {
    private sprmtd cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509CRL cfr_renamed_4316(spreud arg0) throws CRLException {
        try {
            CertificateFactory certificateFactory = this.cfr_renamed_4.cfr_renamed_4317(sprrdaa.cfr_renamed_9("Se>{2"));
            return (X509CRL)certificateFactory.generateCRL(new ByteArrayInputStream(arg0.cfr_renamed_91()));
        }
        catch (IOException iOException) {
            throw new sprgyd(this, new StringBuilder().insert(0, sprmvo.cfr_renamed_9("dWbJq[h@o\u000fqNs\\hAf\u000fbJs[hIhL`[d\u0015!")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprgyd(this, new StringBuilder().insert(0, sprrdaa.cfr_renamed_9("(j%e$\u007fkm\"e/+9n:~\"y.ok{9d=b/n91")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (CertificateException certificateException) {
            throw new sprgyd(this, new StringBuilder().insert(0, sprmvo.cfr_renamed_9("bNoAn[!LsJ`[d\u000fgNb[n]x\u0015!")).append(certificateException.getMessage()).toString(), certificateException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprjqd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprhzd((Provider)arg0);
        return this;
    }

    public sprjqd() {
        sprjqd sprjqd2 = this;
        this.cfr_renamed_4 = new sprqvd();
        sprjqd2.cfr_renamed_4 = new sprqvd();
    }

    /*
     * WARNING - void declaration
     */
    public sprjqd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprrtd((String)arg0);
        return this;
    }
}

