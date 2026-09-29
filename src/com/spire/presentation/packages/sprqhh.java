/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtlh;

public class sprqhh
extends sprtlh {
    public sprqhh(sprszm arg0) {
        super(arg0);
    }

    public sprqhh(sprmjh arg0) {
        super(arg0);
    }

    public static sprqhh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqhh) {
            return (sprqhh)arg0;
        }
        if (arg0 != null) {
            return new sprqhh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

