/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcpe;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprrbm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprxbaa;
import com.spire.presentation.packages.spryno;
import com.spire.presentation.packages.sprzth;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

public class sprcse {
    private X509Certificate cfr_renamed_2;
    private X509Certificate cfr_renamed_3;
    private final sprrr cfr_renamed_4;

    public boolean equals(Object arg0) {
        boolean bl;
        sprcse sprcse2;
        if (arg0 == null) {
            return false;
        }
        if (!(arg0 instanceof sprcse)) {
            return false;
        }
        sprcse sprcse3 = (sprcse)arg0;
        boolean bl2 = true;
        boolean bl3 = true;
        if (this.cfr_renamed_3 != null) {
            sprcse sprcse4 = this;
            sprcse2 = sprcse4;
            bl3 = sprcse4.cfr_renamed_3.equals(sprcse3.cfr_renamed_3);
        } else {
            if (sprcse3.cfr_renamed_3 != null) {
                bl3 = false;
            }
            sprcse2 = this;
        }
        if (sprcse2.cfr_renamed_2 != null) {
            bl2 = this.cfr_renamed_2.equals(sprcse3.cfr_renamed_2);
            bl = bl3;
        } else {
            if (sprcse3.cfr_renamed_2 != null) {
                bl2 = false;
            }
            bl = bl3;
        }
        return bl && bl2;
    }

    public X509Certificate cfr_renamed_178() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprcse(sprrbm sprrbm2) throws CertificateParsingException {
        void arg0;
        sprcse sprcse2 = this;
        sprcse2.cfr_renamed_4 = new sprdki();
        if (sprrbm2.cfr_renamed_177() != null) {
            this.cfr_renamed_3 = new sprzth(arg0.cfr_renamed_177());
        }
        if (arg0.cfr_renamed_178() != null) {
            this.cfr_renamed_2 = new sprzth(arg0.cfr_renamed_178());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprcse(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        void arg0;
        sprcse sprcse2 = this;
        sprcse sprcse3 = this;
        sprcse3.cfr_renamed_4 = new sprdki();
        sprcse2.cfr_renamed_3 = arg0;
        sprcse2.cfr_renamed_2 = x509Certificate2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_91() throws CertificateEncodingException {
        sprndm sprndm2 = null;
        sprndm sprndm3 = null;
        try {
            if (this.cfr_renamed_3 != null && (sprndm2 = sprndm.cfr_renamed_23(new sprrzm(this.cfr_renamed_3.getEncoded()).cfr_renamed_24())) == null) {
                throw new CertificateEncodingException(sprxbaa.cfr_renamed_9("\u0016/\u0002#\u000f$C5\fa\u0004$\u0017a\u0006/\u0000.\u0007(\r&C'\f3C'\f3\u0014 \u0011%"));
            }
            if (this.cfr_renamed_2 != null && (sprndm3 = sprndm.cfr_renamed_23(new sprrzm(this.cfr_renamed_2.getEncoded()).cfr_renamed_24())) == null) {
                throw new CertificateEncodingException(spryno.cfr_renamed_9("f(r$\u007f#32|ft#gfv(p)w/}!3 |434v0v4`#"));
            }
            return new sprrbm(sprndm2, sprndm3).cfr_renamed_104("DER");
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprcpe(illegalArgumentException.toString(), illegalArgumentException);
        }
        catch (IOException iOException) {
            throw new sprcpe(iOException.toString(), iOException);
        }
    }

    public int hashCode() {
        int n = -1;
        if (this.cfr_renamed_3 != null) {
            n ^= this.cfr_renamed_3.hashCode();
        }
        if (this.cfr_renamed_2 != null) {
            n *= 17;
            n ^= this.cfr_renamed_2.hashCode();
        }
        return n;
    }

    public X509Certificate cfr_renamed_177() {
        return this.cfr_renamed_3;
    }
}

