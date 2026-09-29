/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjkg;
import com.spire.presentation.packages.sprmiaa;
import com.spire.presentation.packages.sprnmg;
import com.spire.presentation.packages.sprowl;
import com.spire.presentation.packages.sprpjl;
import com.spire.presentation.packages.sprwcl;
import com.spire.presentation.packages.sprwmg;
import com.spire.presentation.packages.sprymg;
import java.io.IOException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class sprrcl
extends sprwcl {
    private static final byte[] cfr_renamed_4 = sprfqe.cfr_renamed_488(sprjkg.cfr_renamed_9("7n693<1h1k1h041i1k080>5=2>181h19180?5=5=5=5="));

    /*
     * WARNING - void declaration
     */
    public sprrcl(X509Certificate x509Certificate, sprddm sprddm2) throws CertificateEncodingException {
        super(new sprdsm(new sprowl((X509Certificate)arg0).cfr_renamed_568()), (sprymg)new sprwmg((sprddm)arg1, arg0.getPublicKey()));
        void arg1;
        void arg0;
    }

    public sprrcl cfr_renamed_1498(Provider arg0) {
        ((sprnmg)this.cfr_renamed_4).cfr_renamed_1498(arg0);
        return this;
    }

    public sprrcl cfr_renamed_1499(String arg0) {
        ((sprnmg)this.cfr_renamed_4).cfr_renamed_1499(arg0);
        return this;
    }

    private /* synthetic */ sprrcl(X509Certificate arg0, sprdsm arg1, String arg2, int arg3) throws CertificateEncodingException {
        super(arg1, (sprymg)new sprnmg(arg0, arg2, arg3, cfr_renamed_4, sprrcl.cfr_renamed_10703(arg1)));
    }

    public sprrcl(byte[] arg0, sprddm arg1, PublicKey arg2) {
        byte[] byArray = arg0;
        super(arg0, (sprymg)new sprwmg(arg1, arg2));
    }

    public sprrcl(X509Certificate arg0, String arg1, int arg2) throws CertificateEncodingException {
        this(arg0, new sprdsm(new sprowl(arg0).cfr_renamed_568()), arg1, arg2);
    }

    public sprrcl(byte[] arg0, PublicKey arg1, String arg2, int arg3) {
        byte[] byArray = arg0;
        super(arg0, (sprymg)new sprnmg(arg1, arg2, arg3, cfr_renamed_4, sprrcl.cfr_renamed_10704(arg0)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_10704(byte[] arg0) {
        try {
            return new sprfvg(arg0).cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new spracl(new StringBuilder().insert(0, sprmiaa.cfr_renamed_9("Uwxxyb6fdyusee6ect|sub6}so6\u007frsxb\u007fp\u007fsd,6")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_10703(sprdsm arg0) throws CertificateEncodingException {
        try {
            return arg0.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new sprpjl(new StringBuilder().insert(0, sprjkg.cfr_renamed_9("Dlichy'}ubdht~'h\u007fyuldybi'Dt~rhuLiiThudfaIxjob\u007f=-")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

