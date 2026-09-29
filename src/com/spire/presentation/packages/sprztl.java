/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafja;
import com.spire.presentation.packages.sprltl;
import com.spire.presentation.packages.sprnnl;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprvol;
import com.spire.presentation.packages.sprwql;
import com.spire.presentation.packages.sprwtl;
import com.spire.presentation.packages.sprxpe;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;

public class sprztl {
    private sprvol cfr_renamed_4;

    public sprztl() {
        sprztl sprztl2 = this;
        this.cfr_renamed_4 = new sprwtl();
        sprztl2.cfr_renamed_4 = new sprwtl();
    }

    /*
     * WARNING - void declaration
     */
    public sprztl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprnnl((String)arg0);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509CRL cfr_renamed_10930(sprpxl arg0) throws CRLException {
        try {
            CertificateFactory certificateFactory = this.cfr_renamed_4.cfr_renamed_4317(sprafja.cfr_renamed_9("$NIPE"));
            return (X509CRL)certificateFactory.generateCRL(new ByteArrayInputStream(arg0.cfr_renamed_91()));
        }
        catch (IOException iOException) {
            throw new sprltl(new StringBuilder().insert(0, sprxpe.cfr_renamed_9("nfh{{jbqe>{\u007fymbpl>h{yjbxb}jjn$+")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprltl(new StringBuilder().insert(0, sprafja.cfr_renamed_9("\u0003\u001d\u000e\u0012\u000f\b@\u001a\t\u0012\u0004\\\u0012\u0019\u0011\t\t\u000e\u0005\u0018@\f\u0012\u0013\u0016\u0015\u0004\u0019\u0012F")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (CertificateException certificateException) {
            throw new sprltl(new StringBuilder().insert(0, sprxpe.cfr_renamed_9("h\u007fepdj+}y{jjn>m\u007fhjdlr$+")).append(certificateException.getMessage()).toString(), certificateException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprztl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprwql((Provider)arg0);
        return this;
    }
}

