/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprnfg;
import java.security.Key;

public class spreqg
extends sprnfg {
    private static /* synthetic */ Object cfr_renamed_1556(Key arg0) {
        byte[] byArray = arg0.getEncoded();
        if (byArray != null) {
            return byArray;
        }
        return arg0;
    }

    public spreqg(sprddm arg0, Key arg1) {
        super(arg0, spreqg.cfr_renamed_1556(arg1));
    }
}

