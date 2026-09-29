/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdw;
import com.spire.presentation.packages.spreu;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprpq;
import com.spire.presentation.packages.sprrv;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import java.util.Iterator;

@sprtea
public class sprzap
implements sprdw {
    private sprwvn cfr_renamed_91;
    private double cfr_renamed_0;
    private double cfr_renamed_1;
    private double cfr_renamed_2;
    private double cfr_renamed_3;
    private double cfr_renamed_4;

    @Override
    public double cfr_renamed_12495() {
        return this.cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_16749(double arg0) {
        this.cfr_renamed_0 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_16243(sprgeja sprgeja2) {
        void arg0;
        sprzap sprzap2 = this;
        void v1 = arg0;
        this.cfr_renamed_16751(arg0.cfr_renamed_1980());
        this.cfr_renamed_16752(v1.spr\u3181());
        sprzap2.cfr_renamed_16749(v1.cfr_renamed_1942());
        sprzap2.cfr_renamed_16750(sprgeja2.cfr_renamed_1452());
    }

    @Override
    public void cfr_renamed_16738(double arg0) {
        this.cfr_renamed_2 += arg0;
    }

    public sprgeja cfr_renamed_8505() {
        return new sprgeja((float)this.cfr_renamed_1980(), (float)this.spr\u3181(), (float)this.cfr_renamed_1942(), (float)this.cfr_renamed_1452());
    }

    public sprzap() {
        sprzap sprzap2 = this;
        sprzap2.cfr_renamed_91 = new sprwvn();
    }

    @Override
    public double cfr_renamed_1452() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_16752(double arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_16745(double arg0) {
        Iterator iterator;
        double d = arg0 - this.spr\u3181();
        sprzap sprzap2 = this;
        sprzap2.cfr_renamed_16752(arg0);
        Iterator iterator2 = iterator = sprzap2.cfr_renamed_91.iterator();
        while (iterator2.hasNext()) {
            sprpq sprpq2 = (sprpq)iterator.next();
            iterator2 = iterator;
            sprpq sprpq3 = sprpq2;
            sprpq3.cfr_renamed_16752(sprpq3.spr\u3181() + d);
        }
    }

    public double spr\u3181() {
        return this.cfr_renamed_3;
    }

    @Override
    public boolean cfr_renamed_16741(sprpq arg0, spreu arg1) {
        if (this.cfr_renamed_91.size() == 0) {
            return true;
        }
        return arg1.cfr_renamed_17074(arg0.cfr_renamed_17079()).cfr_renamed_1452() + this.cfr_renamed_2 <= this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_16750(double arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public double cfr_renamed_1942() {
        return this.cfr_renamed_0;
    }

    @Override
    public void cfr_renamed_16747(double arg0) {
        this.cfr_renamed_2 += arg0;
    }

    @Override
    public double cfr_renamed_1980() {
        return this.cfr_renamed_1;
    }

    @Override
    public void cfr_renamed_16742(sprpq arg0, spreu arg1) {
        sprrv sprrv2 = arg1.cfr_renamed_17074(arg0.cfr_renamed_17079());
        sprzap sprzap2 = this;
        arg0.cfr_renamed_16752(sprzap2.cfr_renamed_3 + this.cfr_renamed_2 + sprrv2.cfr_renamed_13490());
        sprzap2.cfr_renamed_2 += sprrv2.cfr_renamed_16762();
        sprovja.cfr_renamed_11658(sprzap2.cfr_renamed_91, arg0);
    }

    @Override
    public void cfr_renamed_16751(double arg0) {
        this.cfr_renamed_1 = arg0;
    }
}

