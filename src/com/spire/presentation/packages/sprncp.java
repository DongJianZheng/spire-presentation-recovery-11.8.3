/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;
import com.spire.presentation.packages.spruip;
import com.spire.presentation.packages.sprzsp;

@sprtea
public abstract class sprncp
extends spruip {
    private sprzsp cfr_renamed_4;

    @Override
    @sprtea
    public void cfr_renamed_18327(sprtvp arg0) {
        int n;
        int n2 = arg0.cfr_renamed_11861();
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = this.cfr_renamed_4.cfr_renamed_576(arg0.cfr_renamed_576(n));
            if (!sprzsp.cfr_renamed_14861(n4)) {
                arg0.cfr_renamed_12819(n4);
            }
            n3 = ++n;
        }
    }

    public sprncp(sprzsp sprzsp2) {
        this.cfr_renamed_4 = sprzsp2;
    }
}

