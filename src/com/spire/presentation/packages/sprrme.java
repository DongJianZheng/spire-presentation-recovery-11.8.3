/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajp;
import com.spire.presentation.packages.sprape;
import com.spire.presentation.packages.sprbd;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrdm;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;

public class sprrme
extends X509CRLSelector
implements sprhd {
    private boolean cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprbd cfr_renamed_4;

    public BigInteger cfr_renamed_165() {
        return this.cfr_renamed_0;
    }

    public sprrme() {
        sprrme sprrme2 = this;
        sprrme sprrme3 = this;
        this.cfr_renamed_1 = false;
        sprrme3.cfr_renamed_2 = false;
        sprrme3.cfr_renamed_0 = null;
        sprrme2.cfr_renamed_3 = null;
        sprrme2.cfr_renamed_91 = false;
    }

    public void cfr_renamed_164(BigInteger arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_5033(sprbd arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public Object clone() {
        sprrme sprrme2 = sprrme.cfr_renamed_168(this);
        sprrme sprrme3 = this;
        sprrme sprrme4 = sprrme2;
        sprrme sprrme5 = this;
        sprrme2.cfr_renamed_1 = sprrme5.cfr_renamed_1;
        sprrme4.cfr_renamed_2 = sprrme5.cfr_renamed_2;
        sprrme4.cfr_renamed_0 = this.cfr_renamed_0;
        sprrme2.cfr_renamed_4 = sprrme3.cfr_renamed_4;
        sprrme2.cfr_renamed_91 = sprrme3.cfr_renamed_91;
        sprrme2.cfr_renamed_3 = sproze.cfr_renamed_158(this.cfr_renamed_3);
        return sprrme2;
    }

    public sprbd cfr_renamed_163() {
        return this.cfr_renamed_4;
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
                sprktm2 = sprktm.cfr_renamed_23(sprape.cfr_renamed_36(byArray));
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
        if (sprktm2 != null && this.cfr_renamed_0 != null && sprktm2.cfr_renamed_162().compareTo(this.cfr_renamed_0) == 1) {
            return false;
        }
        if (this.cfr_renamed_91) {
            byArray = x509CRL.getExtensionValue(sprrdm.cfr_renamed_96.cfr_renamed_19());
            if (this.cfr_renamed_3 == null ? byArray != null : !sproze.cfr_renamed_92(byArray, this.cfr_renamed_3)) {
                return false;
            }
        }
        return super.match((X509CRL)arg0);
    }

    public void cfr_renamed_167(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public boolean cfr_renamed_170() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_166(boolean arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public boolean cfr_renamed_161() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprrme cfr_renamed_168(X509CRLSelector arg0) {
        sprrme sprrme2;
        if (arg0 == null) {
            throw new IllegalArgumentException(sprajp.cfr_renamed_9("%c(l)vfa4g'v#\" p)ofl3n*\"5g*g%v)p"));
        }
        sprrme sprrme3 = sprrme2 = new sprrme();
        sprrme3.setCertificateChecking(arg0.getCertificateChecking());
        sprrme3.setDateAndTime(arg0.getDateAndTime());
        try {
            sprrme2.setIssuerNames(arg0.getIssuerNames());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(iOException.getMessage());
        }
        sprrme2.setIssuers(arg0.getIssuers());
        sprrme sprrme4 = sprrme2;
        sprrme4.setMaxCRLNumber(arg0.getMaxCRL());
        sprrme4.setMinCRLNumber(arg0.getMinCRL());
        return sprrme4;
    }

    public boolean cfr_renamed_159() {
        return this.cfr_renamed_1;
    }

    @Override
    public boolean match(CRL arg0) {
        return this.cfr_renamed_132(arg0);
    }

    public byte[] cfr_renamed_171() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public void cfr_renamed_157(byte[] arg0) {
        this.cfr_renamed_3 = sproze.cfr_renamed_158(arg0);
    }

    public void cfr_renamed_169(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }
}

