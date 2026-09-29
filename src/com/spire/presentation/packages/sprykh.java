/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprplh;
import com.spire.presentation.packages.sprrnr;

public class sprykh
extends sprplh {
    public static sprykh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprykh) {
            return (sprykh)arg0;
        }
        if (arg0 != null) {
            byte[] byArray = sproug.cfr_renamed_23(arg0).cfr_renamed_186();
            return new sprykh(byArray);
        }
        return null;
    }

    public sprykh(byte[] arg0) {
        super(arg0);
        if (arg0.length != 10) {
            throw new IllegalArgumentException(sprrnr.cfr_renamed_9("F$]-\u000e,Je@*Ze\u001fu\u000e'W1K6"));
        }
    }
}

