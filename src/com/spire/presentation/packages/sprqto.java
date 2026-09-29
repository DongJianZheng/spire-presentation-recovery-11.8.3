/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraap;
import com.spire.presentation.packages.sprcx;
import com.spire.presentation.packages.sprfvo;
import com.spire.presentation.packages.sprht;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprmx;
import com.spire.presentation.packages.sprpq;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruq;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.spryr;

@sprtea
public class sprqto
implements sprht {
    private spruq cfr_renamed_1;
    private sprcx cfr_renamed_2;
    private sprwvn cfr_renamed_3;
    private sprwvn cfr_renamed_4;

    @Override
    public void cfr_renamed_17082(spryr arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.size()) {
            sprpq sprpq2 = (sprpq)this.cfr_renamed_4.get(n);
            double d = this.cfr_renamed_17100(n);
            arg0.cfr_renamed_16739(sprpq2, this.cfr_renamed_17081().cfr_renamed_16758().cfr_renamed_16762(), d, this.cfr_renamed_17081().cfr_renamed_16758().cfr_renamed_16765(), this.cfr_renamed_17101(n++));
            n2 = n;
        }
    }

    @Override
    public sprvjn cfr_renamed_16731() {
        sprmrn sprmrn2 = new sprmrn();
        for (sprpq sprpq2 : this.cfr_renamed_4) {
            if (!sprpq2.cfr_renamed_17084()) continue;
            sprmrn2.cfr_renamed_12507(sprpq2.cfr_renamed_16731());
        }
        return sprmrn2;
    }

    @Override
    public void cfr_renamed_17080(double arg0) {
        sprqto sprqto2 = this;
        sprqto2.cfr_renamed_3 = new sprfvo(this.cfr_renamed_2).cfr_renamed_17088(sprqto2.cfr_renamed_17081());
        sprmx sprmx2 = sprqto2.cfr_renamed_2.cfr_renamed_16778();
        spraap spraap2 = new spraap(this.cfr_renamed_17081().cfr_renamed_16758(), arg0);
        this.cfr_renamed_4 = sprmx2.cfr_renamed_17083(this.cfr_renamed_3, spraap2);
    }

    /*
     * WARNING - void declaration
     */
    public sprqto(spruq spruq2, sprcx sprcx2) {
        void arg0;
        sprqto sprqto2 = this;
        sprqto sprqto3 = this;
        sprqto3.cfr_renamed_4 = new sprwvn();
        sprqto2.cfr_renamed_1 = arg0;
        sprqto2.cfr_renamed_2 = sprcx2;
    }

    public sprwvn cfr_renamed_17102() {
        return this.cfr_renamed_4;
    }

    @Override
    public spruq cfr_renamed_17081() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ int cfr_renamed_17101(int arg0) {
        if (arg0 == this.cfr_renamed_4.size() - 1 && this.cfr_renamed_17081().cfr_renamed_16758().cfr_renamed_16031() == 3) {
            return 0;
        }
        return this.cfr_renamed_17081().cfr_renamed_16758().cfr_renamed_16031();
    }

    private /* synthetic */ double cfr_renamed_17100(int arg0) {
        if (arg0 != 0) {
            return this.cfr_renamed_17081().cfr_renamed_16758().cfr_renamed_16754();
        }
        if (this.cfr_renamed_17081().cfr_renamed_16758().cfr_renamed_16759() >= 0.0) {
            return this.cfr_renamed_17081().cfr_renamed_16758().cfr_renamed_16754() + this.cfr_renamed_17081().cfr_renamed_16758().cfr_renamed_16759();
        }
        return 0.0;
    }

    public sprwvn cfr_renamed_17103() {
        return this.cfr_renamed_3;
    }
}

