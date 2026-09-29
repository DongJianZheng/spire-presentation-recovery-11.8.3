/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhhn;
import com.spire.presentation.packages.sprjdp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruon;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprjrn
extends spruon {
    private sprjdp cfr_renamed_3;
    private sprwbp cfr_renamed_4;

    @Override
    public void cfr_renamed_13980(sprhhn arg0) {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_14007();
        }
        arg0.cfr_renamed_13998().cfr_renamed_13989(this.cfr_renamed_3);
    }

    private /* synthetic */ void cfr_renamed_14007() {
        sprjrn sprjrn2 = this;
        sprjrn2.cfr_renamed_3 = new sprjdp();
        this.cfr_renamed_3.cfr_renamed_14008(0, 0, 0.0f);
        sprjrn2.cfr_renamed_3.cfr_renamed_14008(4, 0, this.cfr_renamed_4.cfr_renamed_3353());
        sprjrn2.cfr_renamed_3.cfr_renamed_14008(1, 1, 0.0f);
        sprjrn2.cfr_renamed_3.cfr_renamed_14008(4, 1, this.cfr_renamed_4.cfr_renamed_1145());
        sprjrn2.cfr_renamed_3.cfr_renamed_14008(2, 2, 0.0f);
        sprjrn2.cfr_renamed_3.cfr_renamed_14008(4, 2, this.cfr_renamed_4.cfr_renamed_1997());
        sprjrn2.cfr_renamed_3.cfr_renamed_14008(3, 3, 0.0f);
        sprjrn2.cfr_renamed_3.cfr_renamed_14008(4, 3, this.cfr_renamed_4.cfr_renamed_1778());
        sprjrn2.cfr_renamed_3.cfr_renamed_14008(4, 0, 0.01f);
        sprjrn2.cfr_renamed_3.cfr_renamed_14008(4, 1, 0.01f);
        sprjrn2.cfr_renamed_3.cfr_renamed_14008(4, 2, 0.01f);
    }

    public sprjrn(sprwbp sprwbp2) {
        this.cfr_renamed_4 = sprwbp2;
    }

    @Override
    public sprwbp cfr_renamed_13866(sprwbp arg0) {
        return this.cfr_renamed_4;
    }
}

