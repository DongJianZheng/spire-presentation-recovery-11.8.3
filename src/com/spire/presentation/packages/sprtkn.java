/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprmjp;
import com.spire.presentation.packages.sprogb;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprznp;
import com.spire.presentation.packages.sprzto;

@sprtea
public abstract class sprtkn
extends sprbln {
    private String cfr_renamed_2;
    private int cfr_renamed_3;
    private sprgeja cfr_renamed_4;

    @sprtea
    public void cfr_renamed_14719(int arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public abstract String cfr_renamed_14049();

    @sprtea
    public abstract void cfr_renamed_14290(sprfy var1, sprmjp var2);

    /*
     * WARNING - void declaration
     */
    public sprtkn(sprgdo sprgdo2, sprgeja sprgeja2, String string) {
        void arg1;
        void arg0;
        sprtkn sprtkn2 = this;
        super((sprgdo)arg0);
        this.cfr_renamed_3 = -1;
        this.cfr_renamed_4 = sprgeja.cfr_renamed_4;
        sprtkn2.cfr_renamed_4 = arg1;
        sprtkn2.cfr_renamed_2 = string;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14285(spryjn spryjn2) {
        void arg0;
        void v0 = arg0;
        arg0.cfr_renamed_14086();
        v0.cfr_renamed_14057(sprzto.cfr_renamed_9("\b\u0005^!B"), sprogb.cfr_renamed_9("~T?{>a"));
        v0.cfr_renamed_14057(sprzto.cfr_renamed_9("~t$E%^!B"), this.cfr_renamed_14049());
        sprtkn sprtkn2 = this;
        v0.cfr_renamed_14089(sprogb.cfr_renamed_9(":\u0003p2a"), sprtkn2.cfr_renamed_13543());
        if (sprznp.cfr_renamed_12328(sprtkn2.cfr_renamed_2)) {
            arg0.cfr_renamed_14286(sprzto.cfr_renamed_9("\b\u0012H?S4I%T"), this.cfr_renamed_2);
        }
        this.cfr_renamed_14294((spryjn)arg0);
        arg0.cfr_renamed_14061();
    }

    public abstract void cfr_renamed_14294(spryjn var1);

    @sprtea
    public int cfr_renamed_14486() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public sprgeja cfr_renamed_13543() {
        return this.cfr_renamed_4;
    }
}

