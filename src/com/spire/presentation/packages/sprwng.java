/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpwz;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvl;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;

public class sprwng
extends X509CRLSelector
implements sprhd {
    private boolean cfr_renamed_0;
    private boolean cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private boolean cfr_renamed_4;

    public void cfr_renamed_166(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public boolean cfr_renamed_170() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprwng cfr_renamed_168(X509CRLSelector arg0) {
        sprwng sprwng2;
        if (arg0 == null) {
            throw new IllegalArgumentException(sprpwz.cfr_renamed_9(">\u00023\r2\u0017}\u0000/\u0006<\u00178C;\u00112\u000e}\r(\u000f1C.\u00061\u0006>\u00172\u0011"));
        }
        sprwng sprwng3 = sprwng2 = new sprwng();
        sprwng3.setCertificateChecking(arg0.getCertificateChecking());
        sprwng3.setDateAndTime(arg0.getDateAndTime());
        try {
            sprwng2.setIssuerNames(arg0.getIssuerNames());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(iOException.getMessage());
        }
        sprwng2.setIssuers(arg0.getIssuers());
        sprwng sprwng4 = sprwng2;
        sprwng4.setMaxCRLNumber(arg0.getMaxCRL());
        sprwng4.setMinCRLNumber(arg0.getMinCRL());
        return sprwng4;
    }

    public sprwng() {
        sprwng sprwng2 = this;
        sprwng sprwng3 = this;
        this.cfr_renamed_1 = false;
        sprwng3.cfr_renamed_0 = false;
        sprwng3.cfr_renamed_3 = null;
        sprwng2.cfr_renamed_2 = null;
        sprwng2.cfr_renamed_4 = false;
    }

    public void cfr_renamed_167(boolean arg0) {
        this.cfr_renamed_0 = arg0;
    }

    @Override
    public Object clone() {
        sprwng sprwng2 = sprwng.cfr_renamed_168(this);
        sprwng sprwng3 = this;
        sprwng sprwng4 = sprwng2;
        sprwng4.cfr_renamed_1 = this.cfr_renamed_1;
        sprwng4.cfr_renamed_0 = this.cfr_renamed_0;
        sprwng2.cfr_renamed_3 = sprwng3.cfr_renamed_3;
        sprwng2.cfr_renamed_4 = sprwng3.cfr_renamed_4;
        sprwng2.cfr_renamed_2 = sproze.cfr_renamed_158(this.cfr_renamed_2);
        return sprwng2;
    }

    public void cfr_renamed_169(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public BigInteger cfr_renamed_165() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_161() {
        return this.cfr_renamed_0;
    }

    public byte[] cfr_renamed_171() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public boolean cfr_renamed_159() {
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_132(Object arg0) {
        byte[] byArray;
        if (!(arg0 instanceof X509CRL)) {
            return false;
        }
        X509CRL x509CRL = (X509CRL)arg0;
        sprktm sprktm2 = null;
        try {
            byArray = x509CRL.getExtensionValue(sprrdm.cfr_renamed_4.cfr_renamed_19());
            if (byArray != null) {
                sprktm2 = sprktm.cfr_renamed_23(sprrvl.cfr_renamed_7291(byArray));
            }
        }
        catch (Exception exception) {
            return false;
        }
        if (this.cfr_renamed_159() && sprktm2 == null) {
            return false;
        }
        if (this.cfr_renamed_161() && sprktm2 != null) {
            return false;
        }
        if (sprktm2 != null && this.cfr_renamed_3 != null && sprktm2.cfr_renamed_162().compareTo(this.cfr_renamed_3) == 1) {
            return false;
        }
        if (this.cfr_renamed_4) {
            byArray = x509CRL.getExtensionValue(sprrdm.cfr_renamed_96.cfr_renamed_19());
            if (this.cfr_renamed_2 == null ? byArray != null : !sproze.cfr_renamed_92(byArray, this.cfr_renamed_2)) {
                return false;
            }
        }
        return super.match((X509CRL)arg0);
    }

    public void cfr_renamed_164(BigInteger arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public boolean match(CRL arg0) {
        return this.cfr_renamed_132(arg0);
    }

    public void cfr_renamed_157(byte[] arg0) {
        this.cfr_renamed_2 = sproze.cfr_renamed_158(arg0);
    }
}

