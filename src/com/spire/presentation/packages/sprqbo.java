/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprizn;
import com.spire.presentation.packages.sprpxn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruxn;
import com.spire.presentation.packages.sprvqo;

@sprtea
public class sprqbo {
    private sprpxn cfr_renamed_4;

    @sprtea
    public boolean cfr_renamed_14877(int arg0) {
        return this.cfr_renamed_13411().cfr_renamed_13484().cfr_renamed_14000(arg0) || this.cfr_renamed_13411().cfr_renamed_14855().cfr_renamed_14000(arg0);
    }

    private static /* synthetic */ sprpxn cfr_renamed_15745(sprfzo arg0) {
        sprpxn sprpxn2;
        sprfzo sprfzo2 = arg0;
        sprvqo sprvqo2 = sprfzo2.cfr_renamed_13412(false, true, false);
        sprpxn sprpxn3 = sprpxn2 = sprfzo2.cfr_renamed_14132() && arg0.cfr_renamed_14133() ? new sprizn(sprvqo2) : new spruxn(sprvqo2);
        sprpxn3.cfr_renamed_14863(65);
        sprpxn3.cfr_renamed_14863(32);
        return sprpxn3;
    }

    @sprtea
    public boolean cfr_renamed_14878() {
        return true;
    }

    @sprtea
    public sprpxn cfr_renamed_13411() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public void cfr_renamed_14876(int arg0, int[] arg1) {
        this.cfr_renamed_13411().cfr_renamed_14866(arg0, arg1);
    }

    @sprtea
    public sprqbo(sprfzo sprfzo2) {
        this.cfr_renamed_4 = sprqbo.cfr_renamed_15745(sprfzo2);
    }

    @sprtea
    public void cfr_renamed_14874(int arg0, int arg1) {
        this.cfr_renamed_13411().cfr_renamed_14865(arg0, arg1);
    }

    @sprtea
    public void cfr_renamed_15177(int arg0) {
        this.cfr_renamed_13411().cfr_renamed_14863(arg0);
    }
}

