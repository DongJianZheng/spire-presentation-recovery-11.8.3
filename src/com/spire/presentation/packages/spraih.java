/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkpy;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprplh;

public class spraih
extends sprplh {
    public spraih(byte[] arg0) {
        super(arg0);
        if (arg0.length != 3) {
            throw new IllegalArgumentException(sprkpy.cfr_renamed_9("pDkM8L|\u0005vJl\u0005+\u0005z\\l@k"));
        }
    }

    public static spraih cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spraih) {
            return (spraih)arg0;
        }
        if (arg0 != null) {
            byte[] byArray = sproug.cfr_renamed_23(arg0).cfr_renamed_186();
            return new spraih(byArray);
        }
        return null;
    }
}

