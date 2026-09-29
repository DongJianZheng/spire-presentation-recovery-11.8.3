/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmck;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprswj;
import com.spire.presentation.packages.sprwck;
import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Collection;

public class sprlxj<T extends CRL>
implements sprhd<T> {
    private final boolean cfr_renamed_91;
    private final CRLSelector cfr_renamed_0;
    private final BigInteger cfr_renamed_1;
    private final boolean cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final boolean cfr_renamed_4;

    public X509Certificate cfr_renamed_7326() {
        if (this.cfr_renamed_0 instanceof X509CRLSelector) {
            return ((X509CRLSelector)this.cfr_renamed_0).getCertificateChecking();
        }
        return null;
    }

    public boolean cfr_renamed_170() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_159() {
        return this.cfr_renamed_91;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_9483(CRL arg0) {
        byte[] byArray;
        if (!(arg0 instanceof X509CRL)) {
            return this.cfr_renamed_0.match(arg0);
        }
        X509CRL x509CRL = (X509CRL)arg0;
        sprktm sprktm2 = null;
        try {
            byArray = x509CRL.getExtensionValue(sprrdm.cfr_renamed_4.cfr_renamed_19());
            if (byArray != null) {
                sprktm2 = sprktm.cfr_renamed_23(sproug.cfr_renamed_23(byArray).cfr_renamed_186());
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
        if (sprktm2 != null && this.cfr_renamed_1 != null && sprktm2.cfr_renamed_162().compareTo(this.cfr_renamed_1) == 1) {
            return false;
        }
        if (this.cfr_renamed_2) {
            byArray = x509CRL.getExtensionValue(sprrdm.cfr_renamed_96.cfr_renamed_19());
            if (this.cfr_renamed_3 == null ? byArray != null : !sproze.cfr_renamed_92(byArray, this.cfr_renamed_3)) {
                return false;
            }
        }
        return this.cfr_renamed_0.match(arg0);
    }

    @Override
    public Object clone() {
        return this;
    }

    public static /* synthetic */ CRLSelector cfr_renamed_9484(sprlxj arg0) {
        return arg0.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public static Collection<? extends CRL> cfr_renamed_7327(sprlxj sprlxj2, CertStore certStore) throws CertStoreException {
        sprlxj arg0;
        void arg1;
        return arg1.getCRLs(new sprswj(arg0));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlxj(sprwck sprwck2) {
        void arg0;
        sprlxj sprlxj2 = this;
        void v1 = arg0;
        sprlxj sprlxj3 = this;
        void v3 = arg0;
        this.cfr_renamed_0 = sprwck.cfr_renamed_9485((sprwck)v3);
        sprlxj3.cfr_renamed_91 = sprwck.cfr_renamed_9486((sprwck)v3);
        sprlxj3.cfr_renamed_4 = sprwck.cfr_renamed_9487((sprwck)arg0);
        this.cfr_renamed_1 = sprwck.cfr_renamed_9488((sprwck)v1);
        sprlxj2.cfr_renamed_3 = sprwck.cfr_renamed_9489((sprwck)v1);
        sprlxj2.cfr_renamed_2 = sprwck.cfr_renamed_9490(sprwck2);
    }

    public byte[] cfr_renamed_171() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public BigInteger cfr_renamed_165() {
        return this.cfr_renamed_1;
    }

    public /* synthetic */ sprlxj(sprwck arg0, sprmck arg1) {
        this(arg0);
    }

    public boolean cfr_renamed_161() {
        return this.cfr_renamed_4;
    }
}

