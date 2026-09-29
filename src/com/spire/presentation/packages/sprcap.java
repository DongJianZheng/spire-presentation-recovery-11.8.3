/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprms;
import com.spire.presentation.packages.sprmu;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwz;
import com.spire.presentation.packages.sprxln;

@sprtea
public abstract class sprcap
implements sprwz {
    private int cfr_renamed_1;
    private sprhhp cfr_renamed_2;
    private sprmu cfr_renamed_3;
    private double cfr_renamed_4;

    public String toString() {
        return this.cfr_renamed_13030();
    }

    @Override
    public double cfr_renamed_1980() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_16751(double arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public double cfr_renamed_13491() {
        return this.cfr_renamed_2.cfr_renamed_13744();
    }

    @Override
    public double cfr_renamed_1452() {
        return this.cfr_renamed_13490() + this.cfr_renamed_13491();
    }

    private /* synthetic */ sprvjn cfr_renamed_17097() {
        sprxln sprxln2;
        float f = 0.067f * this.cfr_renamed_13257().cfr_renamed_13265();
        float f2 = 0.108f * this.cfr_renamed_13257().cfr_renamed_13265();
        sprxln sprxln3 = sprxln2 = sprxln.cfr_renamed_13120(new sprsuja((float)this.cfr_renamed_1980(), f2), new sprsuja((float)(this.cfr_renamed_1980() + this.cfr_renamed_1942()), f2));
        sprxln3.cfr_renamed_12505(new sprtbp(this.cfr_renamed_17098().cfr_renamed_13973(), f));
        return sprxln3;
    }

    @Override
    public sprvjn cfr_renamed_16731() {
        sprphja sprphja2 = new sprphja((float)this.cfr_renamed_1942(), (float)this.cfr_renamed_13490());
        sprcap sprcap2 = this;
        sprcap sprcap3 = this;
        double d = sprcap2.cfr_renamed_17098().cfr_renamed_16763().cfr_renamed_16535(sprcap3);
        sprsuja sprsuja2 = new sprsuja((float)this.cfr_renamed_1980(), 0.0f);
        sprwbp sprwbp2 = sprcap2.cfr_renamed_17098().cfr_renamed_13973();
        sprwbp sprwbp3 = sprcap3.cfr_renamed_17098().cfr_renamed_13268();
        sprmrn sprmrn2 = new sprmrn();
        sprmrn2.cfr_renamed_12507(new sprthn(this.cfr_renamed_2, sprwbp2, sprwbp3, sprsuja2, this.cfr_renamed_13030(), sprphja2, (float)d));
        if (sprcap2.cfr_renamed_17098().cfr_renamed_16709()) {
            sprmrn2.cfr_renamed_12507(this.cfr_renamed_17097());
        }
        return sprmrn2;
    }

    /*
     * WARNING - void declaration
     */
    public sprcap(sprmu sprmu2, sprhhp sprhhp2, int n) {
        void arg2;
        void arg0;
        sprcap sprcap2 = this;
        this.cfr_renamed_3 = arg0;
        sprcap2.cfr_renamed_1 = arg2;
        sprcap2.cfr_renamed_2 = sprhhp2;
    }

    private /* synthetic */ sprms cfr_renamed_17098() {
        return this.cfr_renamed_3.cfr_renamed_16533();
    }

    @Override
    public int cfr_renamed_16767() {
        return this.cfr_renamed_1;
    }

    @Override
    public double cfr_renamed_16762() {
        return this.cfr_renamed_2.cfr_renamed_17099();
    }

    public abstract String cfr_renamed_13030();

    @Override
    public abstract double cfr_renamed_1942();

    @Override
    public double cfr_renamed_13490() {
        return this.cfr_renamed_2.cfr_renamed_13746();
    }

    public sprmu cfr_renamed_16532() {
        return this.cfr_renamed_3;
    }

    public sprhhp cfr_renamed_13257() {
        return this.cfr_renamed_2;
    }
}

