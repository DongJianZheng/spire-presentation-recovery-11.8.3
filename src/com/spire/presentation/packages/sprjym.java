/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqn;
import com.spire.presentation.packages.sprdx;
import com.spire.presentation.packages.sprtea;

@sprtea
public abstract class sprjym
implements sprdx {
    public sprbqn cfr_renamed_12649;
    private sprdx cfr_renamed_12763;

    @Override
    public sprdx cfr_renamed_12689() {
        if (!this.cfr_renamed_12763.cfr_renamed_12532()) {
            return null;
        }
        sprjym sprjym2 = this;
        sprjym2.cfr_renamed_12763 = sprjym2.cfr_renamed_12763.cfr_renamed_12689();
        return sprjym2;
    }

    @Override
    public boolean cfr_renamed_12730() {
        if (this.cfr_renamed_12763 != null) {
            return this.cfr_renamed_12763.cfr_renamed_12730();
        }
        return false;
    }

    @sprtea
    public sprdx cfr_renamed_3940() {
        return this.cfr_renamed_12763;
    }

    @Override
    public abstract Object cfr_renamed_12099();

    public void cfr_renamed_12686(String arg0) {
        if (this.cfr_renamed_12649 != null) {
            this.cfr_renamed_12649.cfr_renamed_12648(arg0);
        }
    }

    @Override
    public boolean cfr_renamed_12532() {
        if (this.cfr_renamed_12763 != null) {
            return this.cfr_renamed_12763.cfr_renamed_12532();
        }
        return false;
    }

    public void cfr_renamed_11665() {
        if (this.cfr_renamed_3940() != null) {
            this.cfr_renamed_3940().cfr_renamed_12689();
        }
    }

    @Override
    public sprdx cfr_renamed_11632() {
        sprjym sprjym2 = this;
        sprjym2.cfr_renamed_12763 = sprjym2.cfr_renamed_12763.cfr_renamed_11632();
        return sprjym2;
    }

    /*
     * WARNING - void declaration
     */
    public sprjym(sprdx sprdx2) {
        void arg0;
        if (sprdx2 == null) {
            throw new NullPointerException("state");
        }
        this.cfr_renamed_12763 = arg0;
    }
}

