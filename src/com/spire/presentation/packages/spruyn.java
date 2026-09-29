/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrp;
import com.spire.presentation.packages.sprdlca;
import com.spire.presentation.packages.sprmvn;
import com.spire.presentation.packages.sproxn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprznp;

@sprtea
public class spruyn
extends sprmvn {
    private sproxn cfr_renamed_4;

    @Override
    public void cfr_renamed_14352(spryjn arg0) {
        arg0.cfr_renamed_11835("<");
    }

    @Override
    public void cfr_renamed_14365(spryjn arg0) {
        arg0.cfr_renamed_11835(">");
    }

    public spruyn(sproxn sproxn2) {
        this.cfr_renamed_4 = sproxn2;
    }

    @Override
    public void cfr_renamed_14838(int arg0, int arg1, spryjn arg2) {
        int n = this.cfr_renamed_4.cfr_renamed_14862(arg0);
        spryjn spryjn2 = arg2;
        spryjn2.cfr_renamed_11835(new String(sprznp.cfr_renamed_14859((byte)(n >> 8))));
        spryjn2.cfr_renamed_11835(new String(sprznp.cfr_renamed_14859((byte)n)));
    }

    @Override
    public void cfr_renamed_14843(spryjn arg0) {
        arg0.cfr_renamed_14057(sprbrp.cfr_renamed_9("\u0005yD_EXCRM"), sprdlca.cfr_renamed_9("1tzXpIwIg\u0010V"));
    }
}

