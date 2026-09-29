/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprosc;
import com.spire.presentation.packages.sprtua;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.sprz;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;

public class sprgva
extends X509CRLSelector
implements sprb {
    private BigInteger cfr_renamed_91;
    private sprz cfr_renamed_0;
    private boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public boolean match(CRL arg0) {
        return this.cfr_renamed_132(arg0);
    }

    public void cfr_renamed_157(byte[] arg0) {
        this.cfr_renamed_3 = sprzra.cfr_renamed_158(arg0);
    }

    public boolean cfr_renamed_159() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_160(sprz arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public boolean cfr_renamed_161() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_132(Object arg0) {
        byte[] byArray;
        if (!(arg0 instanceof X509CRL)) {
            return false;
        }
        X509CRL x509CRL = (X509CRL)arg0;
        sprooe sprooe2 = null;
        try {
            byArray = x509CRL.getExtensionValue(sprude.cfr_renamed_132.cfr_renamed_19());
            if (byArray != null) {
                sprooe2 = sprooe.cfr_renamed_23(sprtua.cfr_renamed_36(byArray));
            }
        }
        catch (Exception exception) {
            return false;
        }
        if (this.cfr_renamed_159() && sprooe2 == null) {
            return false;
        }
        if (this.cfr_renamed_161() && sprooe2 != null) {
            return false;
        }
        if (sprooe2 != null && this.cfr_renamed_91 != null && sprooe2.cfr_renamed_162().compareTo(this.cfr_renamed_91) == 1) {
            return false;
        }
        if (this.cfr_renamed_1) {
            byArray = x509CRL.getExtensionValue(sprude.cfr_renamed_4.cfr_renamed_19());
            if (this.cfr_renamed_3 == null ? byArray != null : !sprzra.cfr_renamed_92(byArray, this.cfr_renamed_3)) {
                return false;
            }
        }
        return super.match((X509CRL)arg0);
    }

    public sprz cfr_renamed_163() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_164(BigInteger arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public BigInteger cfr_renamed_165() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_166(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_167(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprgva cfr_renamed_168(X509CRLSelector arg0) {
        sprgva sprgva2;
        if (arg0 == null) {
            throw new IllegalArgumentException(sprosc.cfr_renamed_9("\u0000K\rD\f^CI\u0011O\u0002^\u0006\n\u0005X\fGCD\u0016F\u000f\n\u0010O\u000fO\u0000^\fX"));
        }
        sprgva sprgva3 = sprgva2 = new sprgva();
        sprgva3.setCertificateChecking(arg0.getCertificateChecking());
        sprgva3.setDateAndTime(arg0.getDateAndTime());
        try {
            sprgva2.setIssuerNames(arg0.getIssuerNames());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(iOException.getMessage());
        }
        sprgva2.setIssuers(arg0.getIssuers());
        sprgva sprgva4 = sprgva2;
        sprgva4.setMaxCRLNumber(arg0.getMaxCRL());
        sprgva4.setMinCRLNumber(arg0.getMinCRL());
        return sprgva4;
    }

    public void cfr_renamed_169(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public boolean cfr_renamed_170() {
        return this.cfr_renamed_1;
    }

    public sprgva() {
        sprgva sprgva2 = this;
        sprgva sprgva3 = this;
        this.cfr_renamed_2 = false;
        sprgva3.cfr_renamed_4 = false;
        sprgva3.cfr_renamed_91 = null;
        sprgva2.cfr_renamed_3 = null;
        sprgva2.cfr_renamed_1 = false;
    }

    public byte[] cfr_renamed_171() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_3);
    }

    @Override
    public Object clone() {
        sprgva sprgva2 = sprgva.cfr_renamed_168(this);
        sprgva sprgva3 = this;
        sprgva sprgva4 = sprgva2;
        sprgva sprgva5 = this;
        sprgva2.cfr_renamed_2 = sprgva5.cfr_renamed_2;
        sprgva4.cfr_renamed_4 = sprgva5.cfr_renamed_4;
        sprgva4.cfr_renamed_91 = this.cfr_renamed_91;
        sprgva2.cfr_renamed_0 = sprgva3.cfr_renamed_0;
        sprgva2.cfr_renamed_1 = sprgva3.cfr_renamed_1;
        sprgva2.cfr_renamed_3 = sprzra.cfr_renamed_158(this.cfr_renamed_3);
        return sprgva2;
    }
}

