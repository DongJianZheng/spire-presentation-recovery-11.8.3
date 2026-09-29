/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcjn;
import com.spire.presentation.packages.sprfsn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprsin;
import com.spire.presentation.packages.sprsqn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;

@sprtea
public abstract class sprasn
extends sprfsn {
    public int cfr_renamed_1;
    public sprwvn cfr_renamed_2;
    private sprsin cfr_renamed_3;
    public int cfr_renamed_4;

    public abstract sprsin cfr_renamed_13415();

    @sprtea
    public void cfr_renamed_13127() {
        sprasn sprasn2 = this;
        sprasn2.cfr_renamed_3.cfr_renamed_13127();
        sprovja.cfr_renamed_11658(sprasn2.cfr_renamed_2, this.cfr_renamed_3);
        this.cfr_renamed_3 = null;
    }

    @sprtea
    public abstract void cfr_renamed_12453();

    @sprtea
    public abstract void cfr_renamed_12434();

    public sprasn(sprcjn sprcjn2) {
        super(sprcjn2);
        sprasn sprasn2 = this;
        sprasn2.cfr_renamed_2 = new sprwvn();
    }

    @sprtea
    public void cfr_renamed_13382(sprsqn arg0) {
        if (this.cfr_renamed_1 < arg0.cfr_renamed_13416()) {
            this.cfr_renamed_1 = arg0.cfr_renamed_13416();
        }
        sprasn sprasn2 = this;
        sprasn2.cfr_renamed_4 += arg0.cfr_renamed_13417();
        sprasn2.cfr_renamed_3 = sprasn2.cfr_renamed_13415();
        sprasn2.cfr_renamed_3.cfr_renamed_13382(arg0);
    }

    @sprtea
    public sprsin cfr_renamed_13381() {
        return this.cfr_renamed_3;
    }
}

