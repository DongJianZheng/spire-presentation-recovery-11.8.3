/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprewn;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprhun;
import com.spire.presentation.packages.sprmon;
import com.spire.presentation.packages.sproxn;
import com.spire.presentation.packages.sprpun;
import com.spire.presentation.packages.sprqvn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprbyn
extends sprpun {
    private sprhun cfr_renamed_4;

    @Override
    public void cfr_renamed_14870(spryjn arg0) {
        sprbyn sprbyn2 = this;
        super.cfr_renamed_14870(arg0);
        if (sprbyn2.cfr_renamed_4 != null) {
            arg0.cfr_renamed_14057(sprmon.cfr_renamed_9("e!\u0003&\u0019\u0007>"), this.cfr_renamed_4.cfr_renamed_4570());
        }
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprbyn(sprgdo sprgdo2, sprewn sprewn2, sprqvn sprqvn2, sproxn sproxn2) {
        super((sprgdo)arg0, (sprewn)arg1, (sprqvn)arg2);
        void arg2;
        void arg1;
        void arg0;
        if (!sproxn2.cfr_renamed_14867() && arg0.cfr_renamed_14358()) {
            void arg3;
            sprbyn sprbyn2 = this;
            sprbyn2.cfr_renamed_4 = new sprhun((sprgdo)arg0, (sproxn)arg3);
        }
    }

    @Override
    public void cfr_renamed_14295(sprfy arg0) {
        sprbyn sprbyn2 = this;
        super.cfr_renamed_14295(arg0);
        if (sprbyn2.cfr_renamed_4 != null) {
            sprbyn sprbyn3 = this;
            sprbyn3.cfr_renamed_4.cfr_renamed_14893();
            sprbyn3.cfr_renamed_4.cfr_renamed_14291(arg0);
        }
    }
}

