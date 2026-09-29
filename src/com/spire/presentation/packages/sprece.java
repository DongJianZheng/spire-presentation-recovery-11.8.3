/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprece
extends sprkra {
    private sprtzd cfr_renamed_4;

    public static sprece cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprece) {
            return (sprece)arg0;
        }
        if (arg0 != null) {
            return new sprece(sprtzd.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprece(sprtzd sprtzd2) {
        this.cfr_renamed_4 = sprtzd2;
    }

    public String cfr_renamed_19() {
        return this.cfr_renamed_4.cfr_renamed_19();
    }
}

