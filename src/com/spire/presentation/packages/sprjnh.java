/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwjh;

public class sprjnh
extends sprwjh {
    public sprjnh(sprmjh arg0) {
        super(arg0);
    }

    public static sprjnh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjnh) {
            return (sprjnh)arg0;
        }
        if (arg0 != null) {
            return new sprjnh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjnh(sprszm arg0) {
        super(arg0);
    }
}

