/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprenn;
import com.spire.presentation.packages.sprgs;
import com.spire.presentation.packages.sprkmn;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrxn;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprxln;

@sprtea
public class sprmrn
extends sprkmn
implements sprgs,
Cloneable {
    private sprrxn cfr_renamed_0 = sprrxn.cfr_renamed_0;
    private sprqgp cfr_renamed_1;
    private sprxln cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprenn cfr_renamed_4;

    public void cfr_renamed_13767(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprmrn cfr_renamed_13768() {
        return (sprmrn)this.cfr_renamed_12100();
    }

    public boolean cfr_renamed_13684() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    public void cfr_renamed_12511(sprqgp arg0) {
        this.cfr_renamed_1 = arg0;
    }

    private /* synthetic */ sprmrn cfr_renamed_13769(sprmrn arg0) {
        if (this.cfr_renamed_13094() != null) {
            arg0.cfr_renamed_12511(this.cfr_renamed_13094().cfr_renamed_12099());
        }
        if (this.cfr_renamed_12590() != null) {
            arg0.cfr_renamed_12545((sprxln)this.cfr_renamed_12590().cfr_renamed_13616());
        }
        return arg0;
    }

    public sprenn cfr_renamed_13245() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprkmn cfr_renamed_13686(boolean arg0) {
        sprmrn sprmrn2 = (sprmrn)super.cfr_renamed_13686(arg0);
        return this.cfr_renamed_13769(sprmrn2);
    }

    @Override
    public sprqgp cfr_renamed_13094() {
        return this.cfr_renamed_1;
    }

    public sprrxn cfr_renamed_12733() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprvjn cfr_renamed_13616() {
        sprmrn sprmrn2 = (sprmrn)this.cfr_renamed_13686(true);
        return this.cfr_renamed_13769(sprmrn2);
    }

    @Override
    public sprxln cfr_renamed_12590() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13121(sprsmn sprsmn2) {
        void arg0;
        sprmrn sprmrn2 = this;
        void v1 = arg0;
        v1.cfr_renamed_13092(this);
        super.cfr_renamed_13121((sprsmn)arg0);
        v1.cfr_renamed_13101(sprmrn2);
    }

    public void cfr_renamed_12545(sprxln arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_13591(sprenn arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_13770(sprrxn arg0) {
        this.cfr_renamed_0 = arg0;
    }
}

