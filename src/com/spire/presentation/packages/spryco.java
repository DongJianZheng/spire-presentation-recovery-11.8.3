/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcip;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprmjp;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtkn;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprzvn;

@sprtea
public class spryco {
    private sprmjp cfr_renamed_2;
    private sprwvn cfr_renamed_3;
    private sprcip cfr_renamed_4;

    @sprtea
    public spryco() {
        spryco spryco2 = this;
        this.cfr_renamed_3 = new sprwvn();
        spryco2.cfr_renamed_2 = new sprmjp(false);
        this.cfr_renamed_4 = new sprcip(false);
    }

    @sprtea
    public void cfr_renamed_14478(sprtkn arg0) {
        sprovja.cfr_renamed_11658(this.cfr_renamed_3, arg0);
    }

    @sprtea
    public void cfr_renamed_14488(String arg0, sprzvn arg1) {
        this.cfr_renamed_2.cfr_renamed_14943(arg0, arg1);
    }

    @sprtea
    public void cfr_renamed_14291(sprfy arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.size()) {
            sprtkn sprtkn2 = (sprtkn)this.cfr_renamed_3.get(n);
            sprtkn2.cfr_renamed_14290(arg0, this.cfr_renamed_2);
            n2 = ++n;
        }
    }

    @sprtea
    public String cfr_renamed_14939(String arg0) {
        if (sprraia.cfr_renamed_12280(arg0)) {
            return null;
        }
        return this.cfr_renamed_4.cfr_renamed_1600(arg0);
    }

    @sprtea
    public void cfr_renamed_14477(String arg0, String arg1) {
        if (sprraia.cfr_renamed_12280(arg0)) {
            return;
        }
        this.cfr_renamed_4.cfr_renamed_9799(arg0, arg1);
    }
}

