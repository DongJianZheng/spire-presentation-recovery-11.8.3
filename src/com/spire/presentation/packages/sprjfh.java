/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebaa;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprplh;

public class sprjfh
extends sprplh {
    public static sprjfh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjfh) {
            return (sprjfh)arg0;
        }
        if (arg0 != null) {
            byte[] byArray = sproug.cfr_renamed_23(arg0).cfr_renamed_186();
            return new sprjfh(byArray);
        }
        return null;
    }

    public sprjfh(byte[] arg0) {
        super(arg0);
        if (arg0.length != 8) {
            throw new IllegalArgumentException(sprebaa.cfr_renamed_9("@/[&\b'LnF!\\n\u0010nJ7\\+["));
        }
    }
}

