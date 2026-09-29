/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxg;
import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.spreug;
import com.spire.presentation.packages.sprie;
import com.spire.presentation.packages.sprjzg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprxil;
import java.security.Provider;

public class sprztg {
    private sprjzg cfr_renamed_3;
    private sprcyg cfr_renamed_4;

    public sprie cfr_renamed_7925(spraxg arg0) {
        return new spreug(this.cfr_renamed_4, arg0);
    }

    public sprztg cfr_renamed_1498(Provider arg0) {
        this.cfr_renamed_4 = new sprcyg(new sprkhi(arg0));
        this.cfr_renamed_3.cfr_renamed_1498(arg0);
        return this;
    }

    public sprztg() {
        sprztg sprztg2 = this;
        this.cfr_renamed_4 = new sprcyg(new sprrul());
        sprztg2.cfr_renamed_3 = new sprjzg();
    }

    public sprztg cfr_renamed_1499(String arg0) {
        this.cfr_renamed_4 = new sprcyg(new sprxil(arg0));
        this.cfr_renamed_3.cfr_renamed_1499(arg0);
        return this;
    }
}

