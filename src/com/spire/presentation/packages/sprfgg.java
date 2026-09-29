/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdlg;
import com.spire.presentation.packages.sprhrc;
import com.spire.presentation.packages.sprowl;
import com.spire.presentation.packages.sprtpl;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class sprfgg
extends sprdlg {
    private final PrivateKey cfr_renamed_3;
    private final X509Certificate[] cfr_renamed_4;

    public X509Certificate[] cfr_renamed_7334() {
        X509Certificate[] x509CertificateArray = new X509Certificate[this.cfr_renamed_4.length];
        System.arraycopy(this.cfr_renamed_4, 0, x509CertificateArray, 0, x509CertificateArray.length);
        return x509CertificateArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprtpl[] cfr_renamed_7335(X509Certificate[] arg0) {
        sprtpl[] sprtplArray = new sprtpl[arg0.length];
        try {
            int n;
            int n2 = n = 0;
            while (true) {
                if (n2 == sprtplArray.length) {
                    return sprtplArray;
                }
                int n3 = n;
                sprowl sprowl2 = new sprowl(arg0[n]);
                sprtplArray[n3] = sprowl2;
                n2 = ++n;
            }
        }
        catch (CertificateEncodingException certificateEncodingException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhrc.cfr_renamed_9("Y;m7`0,!cu|'c6i&\u007fuo0~!e3e6m!i&6u")).append(certificateEncodingException.getMessage()).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprfgg(PrivateKey privateKey, X509Certificate[] x509CertificateArray) {
        void arg1;
        void arg0;
        sprfgg sprfgg2 = this;
        void v1 = arg0;
        super(sprfgg.cfr_renamed_7336((PrivateKey)v1), sprfgg.cfr_renamed_7335((X509Certificate[])arg1));
        sprfgg2.cfr_renamed_3 = v1;
        sprfgg2.cfr_renamed_4 = new X509Certificate[x509CertificateArray.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_4, 0, ((void)arg1).length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprcom cfr_renamed_7336(PrivateKey arg0) {
        try {
            return sprcom.cfr_renamed_23(arg0.getEncoded());
        }
        catch (Exception exception) {
            return null;
        }
    }

    public X509Certificate cfr_renamed_7337() {
        return this.cfr_renamed_4[0];
    }

    public sprfgg(PrivateKey arg0, X509Certificate arg1) {
        X509Certificate[] x509CertificateArray = new X509Certificate[1];
        x509CertificateArray[0] = arg1;
        this(arg0, x509CertificateArray);
    }

    public PrivateKey cfr_renamed_1369() {
        return this.cfr_renamed_3;
    }
}

