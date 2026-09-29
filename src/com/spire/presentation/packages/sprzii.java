/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.security.cert.CertStoreParameters;
import java.util.Collection;

public class sprzii
implements CertStoreParameters {
    private Collection cfr_renamed_3;
    private boolean cfr_renamed_4;

    public sprzii(Collection arg0) {
        this(arg0, true);
    }

    public Collection cfr_renamed_2283() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprzii(Collection collection, boolean bl) {
        void arg0;
        sprzii sprzii2 = this;
        sprzii2.cfr_renamed_3 = arg0;
        sprzii2.cfr_renamed_4 = bl;
    }

    public boolean cfr_renamed_2282() {
        return this.cfr_renamed_4;
    }

    @Override
    public Object clone() {
        return this;
    }
}

