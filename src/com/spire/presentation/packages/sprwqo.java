/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgro;
import com.spire.presentation.packages.sprkr;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrv;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprwz;
import java.util.Iterator;

@sprtea
public abstract class sprwqo
implements sprkr {
    private double cfr_renamed_0;
    private sprgro cfr_renamed_1;
    private double cfr_renamed_2;
    private sprwvn cfr_renamed_3;
    private double cfr_renamed_4;

    @Override
    public abstract int cfr_renamed_324();

    public sprwqo() {
        sprwqo sprwqo2 = this;
        this.cfr_renamed_1 = new sprgro();
        sprwqo2.cfr_renamed_3 = new sprwvn();
    }

    @Override
    public sprrv cfr_renamed_17079() {
        return this.cfr_renamed_1;
    }

    @Override
    public double cfr_renamed_16774() {
        return this.cfr_renamed_0;
    }

    public sprwvn cfr_renamed_16775() {
        return this.cfr_renamed_3;
    }

    public String toString() {
        return sprraia.cfr_renamed_17093(this.cfr_renamed_16775().toArray());
    }

    @Override
    public double cfr_renamed_16769() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprmrn cfr_renamed_16731() {
        sprmrn sprmrn2 = new sprmrn();
        Iterator iterator = this.cfr_renamed_3.iterator();
        while (iterator.hasNext()) {
            sprvjn sprvjn2 = ((sprwz)iterator.next()).cfr_renamed_16731();
            if (sprvjn2 == null) continue;
            sprmrn2.cfr_renamed_12507(sprvjn2);
        }
        sprmrn sprmrn3 = sprmrn2;
        sprmrn3.cfr_renamed_12511(new sprqgp());
        sprmrn3.cfr_renamed_13094().cfr_renamed_12629((float)this.cfr_renamed_1980(), 0.0f);
        return sprmrn3;
    }

    @Override
    public double cfr_renamed_1980() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_16776(sprwz arg0) {
        sprwqo sprwqo2 = this;
        arg0.cfr_renamed_16751(sprwqo2.cfr_renamed_16769());
        sprwqo sprwqo3 = this;
        sprwqo3.cfr_renamed_4 += arg0.cfr_renamed_1942();
        sprwqo3.cfr_renamed_0 = sprwqo3.cfr_renamed_4;
        sprwqo2.cfr_renamed_1.cfr_renamed_17054(arg0);
        sprovja.cfr_renamed_11658(sprwqo2.cfr_renamed_3, arg0);
    }

    @Override
    public void cfr_renamed_17078(double arg0) {
        this.cfr_renamed_0 = arg0;
    }

    @Override
    public void cfr_renamed_16751(double arg0) {
        this.cfr_renamed_2 = arg0;
    }
}

