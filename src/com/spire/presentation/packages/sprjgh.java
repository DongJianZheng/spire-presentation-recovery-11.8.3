/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraada;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprplh;

public class sprjgh
extends sprplh {
    public static sprjgh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjgh) {
            return (sprjgh)arg0;
        }
        if (arg0 != null) {
            return new sprjgh(sproug.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjgh(byte[] arg0) {
        super(arg0);
        if (arg0.length != 8) {
            throw new IllegalArgumentException(spraada.cfr_renamed_9("&E3X I&Yc\u0005c_:I&N"));
        }
    }

    private /* synthetic */ sprjgh(sproug arg0) {
        super(arg0.cfr_renamed_186());
    }
}

