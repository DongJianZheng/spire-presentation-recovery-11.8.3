/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprije;
import java.security.Key;

public class sprgib
extends spreya {
    public sprgib(sprije arg0, Key arg1) {
        super(arg0, sprgib.cfr_renamed_1556(arg1));
    }

    private static /* synthetic */ Object cfr_renamed_1556(Key arg0) {
        byte[] byArray = arg0.getEncoded();
        if (byArray != null) {
            return byArray;
        }
        return arg0;
    }
}

