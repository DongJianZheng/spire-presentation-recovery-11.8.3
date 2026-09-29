/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprncp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzsp;

@sprtea
public class sprgfp
extends sprncp {
    private static sprzsp cfr_renamed_4;

    public sprgfp() {
        super(cfr_renamed_4);
    }

    static {
        int n;
        cfr_renamed_4 = new sprzsp();
        int n2 = n = 32;
        while (n2 <= 255) {
            int n3 = n;
            cfr_renamed_4.cfr_renamed_825(n3, n3 + 61440);
            cfr_renamed_4.cfr_renamed_825(n + 61440, n++);
            n2 = n;
        }
    }
}

