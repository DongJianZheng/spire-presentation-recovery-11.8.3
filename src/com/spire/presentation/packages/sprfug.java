/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sproug;

public class sprfug
extends sprfvg {
    public static sprfug cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfug) {
            return (sprfug)arg0;
        }
        if (arg0 != null) {
            return new sprfug(sprfvg.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprfug(byte[] arg0) {
        super(arg0);
        if (arg0.length != 1) {
            throw new IllegalArgumentException(sprjze.cfr_renamed_9("\u0015F\u0017D\rKYJ\n\u0003\u0017L\r\u0003H"));
        }
    }

    private /* synthetic */ sprfug(sproug arg0) {
        this(arg0.cfr_renamed_186());
    }
}

