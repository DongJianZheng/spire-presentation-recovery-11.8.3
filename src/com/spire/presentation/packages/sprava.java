/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbnb;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcgp;
import com.spire.presentation.packages.spresa;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprhym;
import com.spire.presentation.packages.sprrae;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

public class sprava {
    private X509Certificate cfr_renamed_3;
    private X509Certificate cfr_renamed_4;

    public X509Certificate cfr_renamed_178() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        int n = -1;
        if (this.cfr_renamed_4 != null) {
            n ^= this.cfr_renamed_4.hashCode();
        }
        if (this.cfr_renamed_3 != null) {
            n *= 17;
            n ^= this.cfr_renamed_3.hashCode();
        }
        return n;
    }

    public boolean equals(Object arg0) {
        boolean bl;
        sprava sprava2;
        if (arg0 == null) {
            return false;
        }
        if (!(arg0 instanceof sprava)) {
            return false;
        }
        sprava sprava3 = (sprava)arg0;
        boolean bl2 = true;
        boolean bl3 = true;
        if (this.cfr_renamed_4 != null) {
            sprava sprava4 = this;
            sprava2 = sprava4;
            bl3 = sprava4.cfr_renamed_4.equals(sprava3.cfr_renamed_4);
        } else {
            if (sprava3.cfr_renamed_4 != null) {
                bl3 = false;
            }
            sprava2 = this;
        }
        if (sprava2.cfr_renamed_3 != null) {
            bl2 = this.cfr_renamed_3.equals(sprava3.cfr_renamed_3);
            bl = bl3;
        } else {
            if (sprava3.cfr_renamed_3 != null) {
                bl2 = false;
            }
            bl = bl3;
        }
        return bl && bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_91() throws CertificateEncodingException {
        sprcge sprcge2 = null;
        sprcge sprcge3 = null;
        try {
            if (this.cfr_renamed_4 != null && (sprcge2 = sprcge.cfr_renamed_23(new sprgle(this.cfr_renamed_4.getEncoded()).cfr_renamed_24())) == null) {
                throw new CertificateEncodingException(sprcgp.cfr_renamed_9("*%>)3.\u007f?0k8.+k:%<$;\"1,\u007f-09\u007f-09(*-/"));
            }
            if (this.cfr_renamed_3 != null && (sprcge3 = sprcge.cfr_renamed_23(new sprgle(this.cfr_renamed_3.getEncoded()).cfr_renamed_24())) == null) {
                throw new CertificateEncodingException(sprhym.cfr_renamed_9("\u001d7\t;\u0004<H-\u0007y\u000f<\u001cy\r7\u000b6\f0\u0006>H?\u0007+H+\r/\r+\u001b<"));
            }
            return new sprrae(sprcge2, sprcge3).cfr_renamed_104("DER");
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new spresa(illegalArgumentException.toString(), illegalArgumentException);
        }
        catch (IOException iOException) {
            throw new spresa(iOException.toString(), iOException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprava(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        void arg0;
        sprava sprava2 = this;
        sprava2.cfr_renamed_4 = arg0;
        sprava2.cfr_renamed_3 = x509Certificate2;
    }

    /*
     * WARNING - void declaration
     */
    public sprava(sprrae sprrae2) throws CertificateParsingException {
        void arg0;
        if (sprrae2.cfr_renamed_177() != null) {
            sprava sprava2 = this;
            sprava2.cfr_renamed_4 = new sprbnb(arg0.cfr_renamed_177());
        }
        if (arg0.cfr_renamed_178() != null) {
            this.cfr_renamed_3 = new sprbnb(arg0.cfr_renamed_178());
        }
    }

    public X509Certificate cfr_renamed_177() {
        return this.cfr_renamed_4;
    }
}

