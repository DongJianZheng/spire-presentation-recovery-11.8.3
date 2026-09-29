/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprzme;

public class sprble
extends sprooe {
    public static final sprble cfr_renamed_3;
    public static final sprble cfr_renamed_4;

    public static sprble cfr_renamed_279(int arg0) {
        if (arg0 == 0) {
            return cfr_renamed_4;
        }
        if (arg0 == 1) {
            return cfr_renamed_3;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzme.cfr_renamed_9("\u007fpapeid>|\u007ffko$*")).append(arg0).toString());
    }

    static {
        cfr_renamed_4 = new sprble(0);
        cfr_renamed_3 = new sprble(1);
    }

    private /* synthetic */ sprble(int arg0) {
        super(arg0);
    }
}

