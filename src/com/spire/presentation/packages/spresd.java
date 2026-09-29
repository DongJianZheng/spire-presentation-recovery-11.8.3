/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbod;
import com.spire.presentation.packages.sprepd;
import com.spire.presentation.packages.spreqd;
import com.spire.presentation.packages.spreyd;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprgod;
import com.spire.presentation.packages.sprkzd;
import com.spire.presentation.packages.sprn;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprqqd;
import com.spire.presentation.packages.sprvte;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class spresd {
    private sprn cfr_renamed_1;
    private spreqd cfr_renamed_2;
    private sprn cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spresd cfr_renamed_1498(Provider provider) throws sprfya {
        void arg0;
        this.cfr_renamed_2 = new sprepd(this, (Provider)arg0);
        return this;
    }

    public spresd() throws sprfya {
        spresd spresd2 = this;
        this.cfr_renamed_2 = new spreqd(this, null);
    }

    private /* synthetic */ sprkzd cfr_renamed_4076() throws sprfya {
        sprkzd sprkzd2 = new sprkzd(this.cfr_renamed_2.cfr_renamed_4073());
        sprkzd sprkzd3 = sprkzd2.cfr_renamed_3977(this.cfr_renamed_4);
        sprkzd sprkzd4 = sprkzd2;
        sprkzd2.cfr_renamed_3979(this.cfr_renamed_1);
        sprkzd4.cfr_renamed_3980(this.cfr_renamed_3);
        return sprkzd4;
    }

    public spresd cfr_renamed_3977(boolean arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spresd cfr_renamed_4077(sprvte sprvte2) {
        void arg0;
        this.cfr_renamed_1 = new sprqqd((sprvte)arg0);
        return this;
    }

    public sprbod cfr_renamed_4078(String arg0, PrivateKey arg1, byte[] arg2) throws sprfya, CertificateEncodingException {
        spresd spresd2 = this;
        sprqa sprqa2 = spresd2.cfr_renamed_2.cfr_renamed_4079(arg0, arg1);
        return spresd2.cfr_renamed_4076().cfr_renamed_3983(sprqa2, arg2);
    }

    public spresd cfr_renamed_3980(sprn arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spresd cfr_renamed_1499(String string) throws sprfya {
        void arg0;
        this.cfr_renamed_2 = new sprgod(this, (String)arg0);
        return this;
    }

    public spresd cfr_renamed_3979(sprn arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprbod cfr_renamed_4080(String arg0, PrivateKey arg1, X509Certificate arg2) throws sprfya, CertificateEncodingException {
        sprqa sprqa2;
        spresd spresd2 = this;
        return spresd2.cfr_renamed_4076().cfr_renamed_3981(sprqa2 = spresd2.cfr_renamed_2.cfr_renamed_4079(arg0, arg1), new spreyd(arg2));
    }
}

