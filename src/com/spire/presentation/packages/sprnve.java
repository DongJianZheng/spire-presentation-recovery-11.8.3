/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprhve;
import com.spire.presentation.packages.sprpre;
import com.spire.presentation.packages.sprzpj;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class sprnve
extends sprpre {
    private Set cfr_renamed_2 = Collections.EMPTY_SET;
    private int cfr_renamed_3 = 5;

    @Override
    public void cfr_renamed_383(PKIXParameters arg0) {
        PKIXParameters pKIXParameters;
        PKIXParameters pKIXParameters2 = arg0;
        super.cfr_renamed_383(pKIXParameters2);
        if (pKIXParameters2 instanceof sprnve) {
            pKIXParameters = (sprnve)arg0;
            this.cfr_renamed_3 = ((sprnve)pKIXParameters).cfr_renamed_3;
            sprnve sprnve2 = this;
            sprnve2.cfr_renamed_2 = new HashSet(((sprnve)pKIXParameters).cfr_renamed_2);
        }
        if (arg0 instanceof PKIXBuilderParameters) {
            pKIXParameters = (PKIXBuilderParameters)arg0;
            this.cfr_renamed_3 = ((PKIXBuilderParameters)pKIXParameters).getMaxPathLength();
        }
    }

    public void cfr_renamed_398(Set arg0) {
        if (arg0 == null) {
            arg0 = Collections.EMPTY_SET;
            return;
        }
        this.cfr_renamed_2 = new HashSet(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprpre cfr_renamed_382(PKIXParameters arg0) {
        sprnve sprnve2;
        try {
            sprnve2 = new sprnve(arg0.getTrustAnchors(), sprhve.cfr_renamed_173((X509CertSelector)arg0.getTargetCertConstraints()));
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
        sprnve2.cfr_renamed_383(arg0);
        return sprnve2;
    }

    public int cfr_renamed_401() {
        return this.cfr_renamed_3;
    }

    public Set cfr_renamed_399() {
        return Collections.unmodifiableSet(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprnve(Set set, sprhd sprhd2) throws InvalidAlgorithmParameterException {
        super((Set)arg0);
        void arg0;
        this.cfr_renamed_5092(sprhd2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object clone() {
        sprnve sprnve2 = null;
        try {
            sprnve2 = new sprnve(this.getTrustAnchors(), this.cfr_renamed_397());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
        sprnve2.cfr_renamed_383(this);
        return sprnve2;
    }

    public void cfr_renamed_400(int arg0) {
        if (arg0 < -1) {
            throw new InvalidParameterException(sprzpj.cfr_renamed_9("n\u0000_HW\tB\u0001W\u001dWHJ\tN\u0000\u001a\u0004_\u0006]\u001cRHJ\tH\tW\rN\rHHY\tTHT\u0007NHX\r\u001a\u0004_\u001bIHN\u0000[\u0006\u001aE\u000bF"));
        }
        this.cfr_renamed_3 = arg0;
    }
}

