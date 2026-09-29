/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhle;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnqe;
import com.spire.presentation.packages.sprpse;

public class sprzve {
    public static final sprere cfr_renamed_3;
    public static final sprbne cfr_renamed_4;

    static {
        cfr_renamed_4 = new sprpse();
        cfr_renamed_3 = new sprcwe();
    }

    public static sprbne cfr_renamed_4798(sprlre arg0) {
        if (arg0.cfr_renamed_84() < 1) {
            return cfr_renamed_4;
        }
        return new sprhle(arg0);
    }

    public static sprere cfr_renamed_4799(sprlre arg0) {
        if (arg0.cfr_renamed_84() < 1) {
            return cfr_renamed_3;
        }
        return new sprnqe(arg0);
    }
}

