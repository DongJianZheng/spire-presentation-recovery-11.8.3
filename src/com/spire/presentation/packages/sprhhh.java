/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprplh;

public class sprhhh
extends sprjfh {
    public sprhhh(byte[] arg0) {
        super(arg0);
    }

    public static sprhhh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhhh) {
            return (sprhhh)arg0;
        }
        if (arg0 != null) {
            if (arg0 instanceof sprplh) {
                return new sprhhh(((sprplh)arg0).cfr_renamed_8282());
            }
            return new sprhhh(sproug.cfr_renamed_23(arg0).cfr_renamed_186());
        }
        return null;
    }
}

