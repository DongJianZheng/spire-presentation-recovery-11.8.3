/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprdfp;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprver;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprpbo
extends sprcrn {
    private sprpdja cfr_renamed_2;
    private sprqgp cfr_renamed_3;
    private sprgeja cfr_renamed_4 = sprgeja.cfr_renamed_4;

    @Override
    public void cfr_renamed_14407() {
        sprpbo sprpbo2 = this;
        sprpbo2.cfr_renamed_4924(this.cfr_renamed_2.cfr_renamed_3461(), 0, (int)sprpbo2.cfr_renamed_2.cfr_renamed_806());
    }

    public sprpbo(sprgdo arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_14404(spryjn spryjn2) {
        void arg0;
        spryjn spryjn3 = spryjn2;
        sprpbo sprpbo2 = this;
        super.cfr_renamed_14404((spryjn)arg0);
        void v2 = arg0;
        v2.cfr_renamed_14057(sprdfp.cfr_renamed_9("\u001cgJCV"), sprver.cfr_renamed_9("\u000b\bk2N5G$"));
        v2.cfr_renamed_14057(sprdfp.cfr_renamed_9("\u001c`FQGJCV"), sprver.cfr_renamed_9("\u007fb?V="));
        spryjn3.cfr_renamed_14094(sprdfp.cfr_renamed_9("\u001cu\\A^gJCV"), 1);
        spryjn3.cfr_renamed_14089(sprver.cfr_renamed_9("\u007ff\u0012K("), this.cfr_renamed_4);
        if (sprpbo2.cfr_renamed_3 != null) {
            arg0.cfr_renamed_14072(sprdfp.cfr_renamed_9("\u001c~RGAZK"), this.cfr_renamed_3);
        }
        this.cfr_renamed_2820().cfr_renamed_14420().cfr_renamed_14799((spryjn)arg0, sprver.cfr_renamed_9("\u000b\u0002A#K%V3A#"));
    }

    @sprtea
    public void cfr_renamed_13579(sprgeja arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public void cfr_renamed_12643(sprqgp arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public void cfr_renamed_14292(sprpdja arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @sprtea
    public sprqgp cfr_renamed_12672() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public sprpdja cfr_renamed_480() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public sprgeja cfr_renamed_13550() {
        return this.cfr_renamed_4;
    }
}

