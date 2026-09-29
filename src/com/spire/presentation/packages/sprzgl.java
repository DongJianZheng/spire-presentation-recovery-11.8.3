/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprhgl;
import com.spire.presentation.packages.sprov;
import com.spire.presentation.packages.spruek;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.sprybl;

public final class sprzgl
implements sprov {
    private spruek cfr_renamed_4;

    @Override
    public void cfr_renamed_8006(sprbj arg0, byte[] arg1, int arg2) {
        this.cfr_renamed_4.cfr_renamed_9973((sprwgk)arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_8005() {
        return 32;
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        this.cfr_renamed_4 = (spruek)arg0;
        sprybl.cfr_renamed_9170(sprhgl.cfr_renamed_10589("X25519", this.cfr_renamed_4));
    }
}

