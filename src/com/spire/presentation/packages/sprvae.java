/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprgke;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmg;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvhe;

public abstract class sprvae
extends sprkra {
    public abstract sprtzd cfr_renamed_2567();

    public static sprvae cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvae) {
            return (sprvae)arg0;
        }
        if (arg0 != null) {
            sprbne sprbne2 = sprbne.cfr_renamed_23(arg0);
            if (sprtzd.cfr_renamed_23(sprbne2.cfr_renamed_85(0)).cfr_renamed_1493(sprmg.cfr_renamed_102)) {
                return new sprvhe(sprbne2);
            }
            return new sprgke(sprbne2);
        }
        return null;
    }
}

