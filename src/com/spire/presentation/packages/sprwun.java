/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdf;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprkqn;
import com.spire.presentation.packages.sprmjp;
import com.spire.presentation.packages.sprpbo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprrao;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtkn;
import com.spire.presentation.packages.sprxhj;
import com.spire.presentation.packages.spryjn;

@sprtea
public final class sprwun
extends sprtkn {
    private sprpbo cfr_renamed_3;
    private sprrao cfr_renamed_4;

    @Override
    @sprtea
    public void cfr_renamed_14290(sprfy arg0, sprmjp arg1) {
        super.cfr_renamed_14291(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14294(spryjn spryjn2) {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        v1.cfr_renamed_14057(sprxhj.cfr_renamed_9("]\t!"), this.cfr_renamed_4.cfr_renamed_4570());
        v1.cfr_renamed_14058("/AP");
        v0.cfr_renamed_14086();
        v0.cfr_renamed_14057("/N", this.cfr_renamed_3.cfr_renamed_4570());
        v0.cfr_renamed_14061();
    }

    @Override
    @sprtea
    public String cfr_renamed_14049() {
        return sprfdf.cfr_renamed_9("|d:N6c'V2A;O6L'");
    }

    public sprwun(sprgdo arg0, sprgeja arg1, sprkqn arg2) {
        sprwun sprwun2 = this;
        super(arg0, arg1, arg2.cfr_renamed_678());
        sprwun sprwun3 = this;
        sprwun2.cfr_renamed_4 = new sprrao(arg0, arg2);
        sprwun3.cfr_renamed_3 = new sprpbo(arg0);
        sprwun2.cfr_renamed_3.cfr_renamed_14292(new sprpdja());
        sprwun2.cfr_renamed_3.cfr_renamed_13579(new sprgeja(0.0f, 0.0f, arg1.cfr_renamed_1942(), arg1.cfr_renamed_1452()));
    }

    @Override
    public void cfr_renamed_14295(sprfy arg0) {
        sprwun sprwun2 = this;
        sprwun2.cfr_renamed_3.cfr_renamed_14291(arg0);
        sprwun2.cfr_renamed_4.cfr_renamed_14291(arg0);
    }
}

