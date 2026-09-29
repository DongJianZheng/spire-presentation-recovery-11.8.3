/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprplh;
import com.spire.presentation.packages.sprqap;

public class sprkkh
extends sprplh {
    public sprkkh(byte[] arg0) {
        super(arg0);
        if (arg0.length != 32) {
            throw new IllegalArgumentException(sprqap.cfr_renamed_9("XoCf\u0010gT.^aD.\u0003<\u0010lIzU}"));
        }
    }

    public static sprkkh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkkh) {
            return (sprkkh)arg0;
        }
        if (arg0 != null) {
            byte[] byArray = sproug.cfr_renamed_23(arg0).cfr_renamed_186();
            return new sprkkh(byArray);
        }
        return null;
    }
}

