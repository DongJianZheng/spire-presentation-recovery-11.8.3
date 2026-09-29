/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.cert.CertStoreParameters;
import java.util.Collection;

public class sprpjb
implements CertStoreParameters {
    private Collection cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public Object clone() {
        return this;
    }

    public Collection cfr_renamed_2283() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_2282() {
        return this.cfr_renamed_4;
    }

    public sprpjb(Collection arg0) {
        this(arg0, true);
    }

    /*
     * WARNING - void declaration
     */
    public sprpjb(Collection collection, boolean bl) {
        void arg0;
        sprpjb sprpjb2 = this;
        sprpjb2.cfr_renamed_3 = arg0;
        sprpjb2.cfr_renamed_4 = bl;
    }
}

