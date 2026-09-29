/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprsdh;
import com.spire.presentation.packages.sprszm;

public class sprrkh
extends sprsdh {
    public sprrkh(sprmjh arg0) {
        super(arg0);
    }

    public sprrkh(sprszm arg0) {
        super(arg0);
    }

    public static sprrkh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrkh) {
            return (sprrkh)arg0;
        }
        if (arg0 != null) {
            return new sprrkh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

