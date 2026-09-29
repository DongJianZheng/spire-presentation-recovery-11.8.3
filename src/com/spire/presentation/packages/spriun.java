/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprjyn;
import com.spire.presentation.packages.sprpao;
import com.spire.presentation.packages.sprpbo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqkn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprzmn;

@sprtea
public class spriun
extends sprjyn {
    private static final boolean cfr_renamed_119 = false;
    private static final String cfr_renamed_91 = "/Off";
    private boolean cfr_renamed_0 = false;
    private sprpbo cfr_renamed_1;
    private static final String cfr_renamed_2 = "/On";
    private sprgeja cfr_renamed_3;
    private sprpbo cfr_renamed_4;

    @Override
    public void cfr_renamed_14295(sprfy arg0) {
        spriun spriun2 = this;
        super.cfr_renamed_14295(arg0);
        spriun2.cfr_renamed_4.cfr_renamed_14291(arg0);
        spriun2.cfr_renamed_1.cfr_renamed_14291(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public spriun(sprpao sprpao2, sprzmn sprzmn2) {
        super((sprpao)arg0, (sprqkn)arg1);
        void arg1;
        void arg0;
        this.cfr_renamed_0 = arg1.cfr_renamed_97();
        this.cfr_renamed_3 = sprzmn2.cfr_renamed_13550();
        this.cfr_renamed_14800();
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_14828(spryjn spryjn2, sprgeja sprgeja2, sprwbp sprwbp2, sprwbp sprwbp3) {
        void arg3;
        void arg2;
        void arg1;
        spryjn arg0;
        spryjn spryjn3 = arg0;
        spryjn spryjn4 = arg0;
        spryjn spryjn5 = arg0;
        void v3 = arg1;
        spryjn spryjn6 = arg0;
        spryjn spryjn7 = arg0;
        spryjn spryjn8 = arg0;
        void v7 = arg1;
        spryjn spryjn9 = arg0;
        spriun.cfr_renamed_14825(spryjn9, (sprgeja)arg1, (sprwbp)arg2, (sprwbp)arg3);
        spriun.cfr_renamed_14816(spryjn9, (sprwbp)arg2, true);
        spryjn8.cfr_renamed_14067(v7.cfr_renamed_13430());
        spryjn8.cfr_renamed_14055();
        spryjn7.cfr_renamed_14067(v7.cfr_renamed_13342());
        spryjn7.cfr_renamed_11835((String)((Object)cfr_renamed_1));
        spryjn7.cfr_renamed_14067(arg1.cfr_renamed_13341());
        spryjn6.cfr_renamed_14055();
        spryjn6.cfr_renamed_14067(arg1.cfr_renamed_13429());
        spryjn6.cfr_renamed_11835(cfr_renamed_132);
        spryjn5.cfr_renamed_14067(v3.cfr_renamed_13430());
        spryjn5.cfr_renamed_14055();
        spryjn4.cfr_renamed_14067(v3.cfr_renamed_13429());
        spryjn4.cfr_renamed_11835((String)((Object)cfr_renamed_1));
        spryjn4.cfr_renamed_14067(arg1.cfr_renamed_13341());
        spryjn3.cfr_renamed_14055();
        spryjn3.cfr_renamed_14067(sprgeja2.cfr_renamed_13342());
        spryjn3.cfr_renamed_11835(cfr_renamed_132);
    }

    @Override
    public void cfr_renamed_14806(spryjn arg0) {
        if (this.cfr_renamed_0) {
            arg0.cfr_renamed_14057(cfr_renamed_93, this.cfr_renamed_0 ? cfr_renamed_2 : cfr_renamed_91);
        }
        spryjn spryjn2 = arg0;
        spryjn spryjn3 = arg0;
        spryjn spryjn4 = arg0;
        spryjn spryjn5 = arg0;
        spryjn5.cfr_renamed_11835((String)((Object)cfr_renamed_4));
        spryjn5.cfr_renamed_14086();
        spryjn5.cfr_renamed_11835(cfr_renamed_107);
        spryjn5.cfr_renamed_14086();
        spryjn4.cfr_renamed_14058(cfr_renamed_91);
        spryjn4.cfr_renamed_14058(this.cfr_renamed_1.cfr_renamed_4570());
        spryjn3.cfr_renamed_14058(cfr_renamed_2);
        spryjn2.cfr_renamed_14058(this.cfr_renamed_4.cfr_renamed_4570());
        spryjn3.cfr_renamed_14061();
        spryjn2.cfr_renamed_14061();
        spryjn2.cfr_renamed_14057((String)((Object)cfr_renamed_3), this.cfr_renamed_0 ? cfr_renamed_2 : cfr_renamed_91);
    }

    @Override
    public int cfr_renamed_14810() {
        return 0;
    }

    @Override
    @sprtea
    public sprgeja cfr_renamed_13550() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_14800() {
        sprgeja sprgeja2 = new sprgeja(0.0f, 0.0f, this.cfr_renamed_13550().cfr_renamed_1942(), this.cfr_renamed_13550().cfr_renamed_1452());
        spriun spriun2 = this;
        spriun2.cfr_renamed_1 = new sprpbo(this.cfr_renamed_2820());
        this.cfr_renamed_1.cfr_renamed_13579(sprgeja2);
        spriun2.cfr_renamed_1.cfr_renamed_14292(new sprpdja());
        spriun.cfr_renamed_14825(new spryjn(this.cfr_renamed_1.cfr_renamed_480()), sprgeja2, this.cfr_renamed_13976(), this.cfr_renamed_13973());
        spriun2.cfr_renamed_4 = new sprpbo(this.cfr_renamed_2820());
        spriun2.cfr_renamed_4.cfr_renamed_13579(sprgeja2);
        spriun2.cfr_renamed_4.cfr_renamed_14292(new sprpdja());
        spriun.cfr_renamed_14828(new spryjn(this.cfr_renamed_4.cfr_renamed_480()), sprgeja2, this.cfr_renamed_13976(), this.cfr_renamed_13973());
    }
}

