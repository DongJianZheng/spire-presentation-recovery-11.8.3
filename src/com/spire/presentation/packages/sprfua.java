/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprdhea;
import com.spire.presentation.packages.sprgma;
import com.spire.presentation.packages.sprlsa;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class sprfua
extends sprlsa {
    private Set cfr_renamed_3 = Collections.EMPTY_SET;
    private int cfr_renamed_4 = 5;

    public void cfr_renamed_398(Set arg0) {
        if (arg0 == null) {
            arg0 = Collections.EMPTY_SET;
            return;
        }
        this.cfr_renamed_3 = new HashSet(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprlsa cfr_renamed_382(PKIXParameters arg0) {
        sprfua sprfua2;
        try {
            sprfua2 = new sprfua(arg0.getTrustAnchors(), sprgma.cfr_renamed_173((X509CertSelector)arg0.getTargetCertConstraints()));
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
        sprfua2.cfr_renamed_383(arg0);
        return sprfua2;
    }

    /*
     * WARNING - void declaration
     */
    public sprfua(Set set, sprb sprb2) throws InvalidAlgorithmParameterException {
        super((Set)arg0);
        void arg0;
        this.cfr_renamed_396(sprb2);
    }

    @Override
    public void cfr_renamed_383(PKIXParameters arg0) {
        PKIXParameters pKIXParameters;
        PKIXParameters pKIXParameters2 = arg0;
        super.cfr_renamed_383(pKIXParameters2);
        if (pKIXParameters2 instanceof sprfua) {
            pKIXParameters = (sprfua)arg0;
            this.cfr_renamed_4 = ((sprfua)pKIXParameters).cfr_renamed_4;
            sprfua sprfua2 = this;
            sprfua2.cfr_renamed_3 = new HashSet(((sprfua)pKIXParameters).cfr_renamed_3);
        }
        if (arg0 instanceof PKIXBuilderParameters) {
            pKIXParameters = (PKIXBuilderParameters)arg0;
            this.cfr_renamed_4 = ((PKIXBuilderParameters)pKIXParameters).getMaxPathLength();
        }
    }

    public Set cfr_renamed_399() {
        return Collections.unmodifiableSet(this.cfr_renamed_3);
    }

    public void cfr_renamed_400(int arg0) {
        if (arg0 < -1) {
            throw new InvalidParameterException(sprdhea.cfr_renamed_9("(X\u0019\u0010\u0011Q\u0004Y\u0011E\u0011\u0010\fQ\bX\\\\\u0019^\u001bD\u0014\u0010\fQ\u000eQ\u0011U\bU\u000e\u0010\u001fQ\u0012\u0010\u0012_\b\u0010\u001eU\\\\\u0019C\u000f\u0010\bX\u001d^\\\u001dM\u001e"));
        }
        this.cfr_renamed_4 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object clone() {
        sprfua sprfua2 = null;
        try {
            sprfua2 = new sprfua(this.getTrustAnchors(), this.cfr_renamed_397());
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
        sprfua2.cfr_renamed_383(this);
        return sprfua2;
    }

    public int cfr_renamed_401() {
        return this.cfr_renamed_4;
    }
}

