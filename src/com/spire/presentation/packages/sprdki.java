/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprsci;
import java.security.Provider;
import java.security.Security;

public class sprdki
extends sprkhi {
    private static volatile Provider cfr_renamed_3;

    private static synchronized /* synthetic */ Provider cfr_renamed_9193() {
        Provider provider = Security.getProvider("BC");
        if (provider instanceof sprsci) {
            return provider;
        }
        if (cfr_renamed_3 != null) {
            return cfr_renamed_3;
        }
        cfr_renamed_3 = new sprsci();
        return cfr_renamed_3;
    }

    public sprdki() {
        super(sprdki.cfr_renamed_9193());
    }
}

