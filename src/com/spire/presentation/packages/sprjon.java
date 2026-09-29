/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgnn;
import com.spire.presentation.packages.sprhhn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruon;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprjon
extends spruon {
    private static final float cfr_renamed_4 = 0.5f;

    @Override
    public void cfr_renamed_13980(sprhhn arg0) {
        new sprgnn().cfr_renamed_13980(arg0);
        arg0.cfr_renamed_13998().cfr_renamed_14018(0.5f);
    }

    @Override
    public void cfr_renamed_13982(sprxln arg0) {
        new sprgnn().cfr_renamed_13982(arg0);
        super.cfr_renamed_13982(arg0);
    }

    @Override
    public sprwbp cfr_renamed_13866(sprwbp arg0) {
        int n = spryxp.cfr_renamed_14019(127.5);
        if (arg0.cfr_renamed_3353() < n) {
            return new sprwbp(arg0.cfr_renamed_1778(), 0, 0, 0);
        }
        return new sprwbp(arg0.cfr_renamed_1778(), 255, 255, 255);
    }
}

