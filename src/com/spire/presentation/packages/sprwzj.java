/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgak;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.Date;

public class sprwzj {
    private final int cfr_renamed_91;
    private final Date cfr_renamed_0;
    private final X509Certificate cfr_renamed_1;
    private final PublicKey cfr_renamed_2;
    private final CertPath cfr_renamed_3;
    private final sprgak cfr_renamed_4;

    public X509Certificate cfr_renamed_9113() {
        return this.cfr_renamed_1;
    }

    public sprgak cfr_renamed_9115() {
        return this.cfr_renamed_4;
    }

    public PublicKey cfr_renamed_9116() {
        return this.cfr_renamed_2;
    }

    public Date cfr_renamed_9110() {
        return new Date(this.cfr_renamed_0.getTime());
    }

    /*
     * WARNING - void declaration
     */
    public sprwzj(sprgak sprgak2, Date date, CertPath certPath, int n, X509Certificate x509Certificate, PublicKey publicKey) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprwzj sprwzj2 = this;
        sprwzj sprwzj3 = this;
        sprwzj sprwzj4 = this;
        sprwzj4.cfr_renamed_4 = arg0;
        sprwzj4.cfr_renamed_0 = arg1;
        sprwzj3.cfr_renamed_3 = arg2;
        sprwzj3.cfr_renamed_91 = arg3;
        sprwzj2.cfr_renamed_1 = arg4;
        sprwzj2.cfr_renamed_2 = publicKey;
    }

    public int cfr_renamed_320() {
        return this.cfr_renamed_91;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 2 << 3 ^ 4;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 2 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public CertPath cfr_renamed_315() {
        return this.cfr_renamed_3;
    }
}

