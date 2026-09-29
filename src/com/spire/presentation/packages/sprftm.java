/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhnm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxrm;

public class sprftm
extends sprxrm {
    public sprftm(sprszm arg0) {
        super(arg0);
    }

    public sprftm(sprhnm arg0) {
        super(arg0);
    }

    public static sprftm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprftm) {
            return (sprftm)arg0;
        }
        if (arg0 != null) {
            return new sprftm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprftm(sprhnm[] arg0) {
        super(arg0);
    }
}

