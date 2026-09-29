/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqn;
import com.spire.presentation.packages.sprdx;
import com.spire.presentation.packages.sprtea;

@sprtea
public abstract class sprman
implements sprdx {
    private sprdx cfr_renamed_2;
    public sprbqn cfr_renamed_12649;
    private int cfr_renamed_3;
    private sprdx cfr_renamed_12763;

    @Override
    public boolean cfr_renamed_12730() {
        return this.cfr_renamed_12763 != null;
    }

    public sprman(int n) {
        sprman sprman2 = this;
        this.cfr_renamed_12763 = null;
        sprman2.cfr_renamed_2 = null;
        sprman2.cfr_renamed_3 = n;
    }

    @Override
    public sprdx cfr_renamed_11632() {
        this.cfr_renamed_12763 = (sprman)this.cfr_renamed_12099();
        ((sprman)this.cfr_renamed_12763).cfr_renamed_2 = this;
        return this.cfr_renamed_12446();
    }

    @Override
    public abstract Object cfr_renamed_12099();

    @Override
    public boolean cfr_renamed_12532() {
        return this.cfr_renamed_2 != null;
    }

    @Override
    public sprdx cfr_renamed_12689() {
        return this.cfr_renamed_12533();
    }

    public sprdx cfr_renamed_12533() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_12589() {
        return this.cfr_renamed_3;
    }

    public abstract void cfr_renamed_11665();

    public sprdx cfr_renamed_12446() {
        return this.cfr_renamed_12763;
    }
}

