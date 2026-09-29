/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqd;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprfsd;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprvyd;
import com.spire.presentation.packages.sprwxa;
import com.spire.presentation.packages.sprxpd;
import com.spire.presentation.packages.spryod;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class sprttd {
    private spryod cfr_renamed_4;

    public sprfsd cfr_renamed_1560(sprcyd arg0) throws sprfya, CertificateException {
        return new sprfsd(new sprxpd(), new sprwxa(), this.cfr_renamed_4.cfr_renamed_4072(arg0), this.cfr_renamed_4.cfr_renamed_4073());
    }

    /*
     * WARNING - void declaration
     */
    public sprttd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprvyd(this, (Provider)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprttd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new spraqd(this, (String)arg0);
        return this;
    }

    public sprfsd cfr_renamed_1561(X509Certificate arg0) throws sprfya {
        return new sprfsd(new sprxpd(), new sprwxa(), this.cfr_renamed_4.cfr_renamed_4074(arg0), this.cfr_renamed_4.cfr_renamed_4073());
    }

    public sprfsd cfr_renamed_1559(PublicKey arg0) throws sprfya {
        return new sprfsd(new sprxpd(), new sprwxa(), this.cfr_renamed_4.cfr_renamed_4075(arg0), this.cfr_renamed_4.cfr_renamed_4073());
    }

    public sprttd() {
        sprttd sprttd2 = this;
        this.cfr_renamed_4 = new spryod(this, null);
    }
}

