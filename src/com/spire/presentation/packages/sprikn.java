/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhjn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprikn {
    private double cfr_renamed_119;
    private double cfr_renamed_91;
    private sprsuja cfr_renamed_0;
    private double cfr_renamed_1;
    private static final double cfr_renamed_2 = 45.0;
    private double cfr_renamed_3;
    private sprphja cfr_renamed_4;

    public sprsuja cfr_renamed_13171() {
        sprikn sprikn2 = this;
        return sprikn2.cfr_renamed_13841(spryxp.cfr_renamed_13829(this.cfr_renamed_13180() + sprikn2.cfr_renamed_13182()));
    }

    public sprsuja cfr_renamed_9494() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_13842(double arg0) {
        this.cfr_renamed_119 = arg0;
    }

    private /* synthetic */ double cfr_renamed_13843(double arg0) {
        return sprrgga.cfr_renamed_13633(1.0 / (this.cfr_renamed_3 != 0.0 ? this.cfr_renamed_3 / 2.0 : (double)this.cfr_renamed_13833().cfr_renamed_1452()) * sprrgga.cfr_renamed_13634(arg0), 1.0 / (this.cfr_renamed_1 != 0.0 ? this.cfr_renamed_1 / 2.0 : (double)this.cfr_renamed_13833().cfr_renamed_1942()) * sprrgga.cfr_renamed_13635(arg0));
    }

    private /* synthetic */ sprsuja cfr_renamed_13841(double arg0) {
        double d = this.cfr_renamed_13843(arg0);
        return new sprsuja((float)((double)this.cfr_renamed_8417().cfr_renamed_1980() + (double)this.cfr_renamed_13833().cfr_renamed_1942() * sprrgga.cfr_renamed_13635(d)), (float)((double)this.cfr_renamed_8417().spr\u3181() + (double)this.cfr_renamed_13833().cfr_renamed_1452() * sprrgga.cfr_renamed_13634(d)));
    }

    public sprikn() {
        this.cfr_renamed_4 = sprphja.cfr_renamed_4;
    }

    public sprphja cfr_renamed_13833() {
        return new sprphja(this.cfr_renamed_2773().cfr_renamed_1942() / 2.0f, this.cfr_renamed_2773().cfr_renamed_1452() / 2.0f);
    }

    public sprhjn cfr_renamed_13165() {
        int n;
        if (this.cfr_renamed_4.cfr_renamed_1942() == 0.0f || this.cfr_renamed_4.cfr_renamed_1452() == 0.0f) {
            sprhjn sprhjn2 = new sprhjn(1);
            sprikn sprikn2 = this;
            sprhjn2.cfr_renamed_13812(0, sprikn2.cfr_renamed_0, sprikn2.cfr_renamed_0, new sprsuja(this.cfr_renamed_0.cfr_renamed_1980() + this.cfr_renamed_4.cfr_renamed_1942(), this.cfr_renamed_0.spr\u3181() + this.cfr_renamed_4.cfr_renamed_1452()), new sprsuja(this.cfr_renamed_0.cfr_renamed_1980() + this.cfr_renamed_4.cfr_renamed_1942(), this.cfr_renamed_0.spr\u3181() + this.cfr_renamed_4.cfr_renamed_1452()));
            return sprhjn2;
        }
        double d = this.cfr_renamed_13182() >= 360.0 ? 90.0 : 45.0;
        sprikn sprikn3 = this;
        int n2 = (int)(sprrgga.cfr_renamed_13844(sprikn3.cfr_renamed_13182()) / d);
        if (sprikn3.cfr_renamed_13182() % d != 0.0) {
            ++n2;
        }
        n2 = sprrgga.cfr_renamed_12461(n2, (int)(360.0 / d));
        sprhjn sprhjn3 = new sprhjn(n2);
        sprikn sprikn4 = this;
        double d2 = sprikn4.cfr_renamed_13180();
        double d3 = sprrgga.cfr_renamed_13845(sprikn4.cfr_renamed_13182());
        int n3 = n = 0;
        while (n3 < n2) {
            double d4 = sprrgga.cfr_renamed_13846(d, sprrgga.cfr_renamed_13844(this.cfr_renamed_13180() + this.cfr_renamed_13182() - d2));
            double d5 = d2;
            this.cfr_renamed_13847(sprhjn3, d5, d4 *= d3);
            d2 = d5 + d4;
            n3 = ++n;
        }
        return sprhjn3;
    }

    private /* synthetic */ void cfr_renamed_13847(sprhjn arg0, double arg1, double arg2) {
        arg1 = spryxp.cfr_renamed_13829(arg1);
        arg2 = spryxp.cfr_renamed_13829(arg2);
        sprikn sprikn2 = this;
        double d = sprikn2.cfr_renamed_13843(arg1);
        double d2 = sprikn2.cfr_renamed_13843(arg1 + arg2);
        double d3 = d2 - d;
        double d4 = d3 / 2.0;
        double d5 = sprrgga.cfr_renamed_13634(d3) * (sprrgga.cfr_renamed_12687(4.0 + 3.0 * sprrgga.cfr_renamed_13815(sprrgga.cfr_renamed_13848(d4), 2.0)) - 1.0) / 3.0;
        sprsuja sprsuja2 = sprikn2.cfr_renamed_13841(arg1);
        sprsuja sprsuja3 = sprikn2.cfr_renamed_13841(arg1 + arg2);
        sprsuja sprsuja4 = new sprsuja((float)((double)sprsuja2.cfr_renamed_1980() - d5 * (double)this.cfr_renamed_13833().cfr_renamed_1942() * sprrgga.cfr_renamed_13634(d)), (float)((double)sprsuja2.spr\u3181() + d5 * (double)this.cfr_renamed_13833().cfr_renamed_1452() * sprrgga.cfr_renamed_13635(d)));
        sprsuja sprsuja5 = new sprsuja((float)((double)sprsuja3.cfr_renamed_1980() + d5 * (double)this.cfr_renamed_13833().cfr_renamed_1942() * sprrgga.cfr_renamed_13634(d2)), (float)((double)sprsuja3.spr\u3181() - d5 * (double)this.cfr_renamed_13833().cfr_renamed_1452() * sprrgga.cfr_renamed_13635(d2)));
        arg0.cfr_renamed_13806(sprsuja2, sprsuja4, sprsuja5, sprsuja3);
    }

    public sprsuja cfr_renamed_13167() {
        sprikn sprikn2 = this;
        return sprikn2.cfr_renamed_13841(spryxp.cfr_renamed_13829(sprikn2.cfr_renamed_13180()));
    }

    public void cfr_renamed_13598(sprphja arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_13849(sprsuja arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public sprsuja cfr_renamed_8417() {
        return new sprsuja(this.cfr_renamed_9494().cfr_renamed_1980() + this.cfr_renamed_13833().cfr_renamed_1942(), this.cfr_renamed_9494().spr\u3181() + this.cfr_renamed_13833().cfr_renamed_1452());
    }

    public void cfr_renamed_13850(double arg0) {
        this.cfr_renamed_91 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprikn(sprgeja sprgeja2, double d, double d2) {
        void arg1;
        void arg0;
        sprikn sprikn2 = this;
        sprikn sprikn3 = this;
        this.cfr_renamed_4 = sprphja.cfr_renamed_4;
        sprikn3.cfr_renamed_0 = arg0.cfr_renamed_9494();
        sprikn3.cfr_renamed_4 = arg0.cfr_renamed_2773();
        sprikn2.cfr_renamed_91 = arg1;
        sprikn2.cfr_renamed_119 = d2;
    }

    public sprphja cfr_renamed_2773() {
        return this.cfr_renamed_4;
    }

    public double cfr_renamed_13182() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprikn(sprgeja sprgeja2, double d, double d2, double d3, double d4) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprikn sprikn2 = this;
        this((sprgeja)arg0, (double)arg1, (double)arg2);
        sprikn2.cfr_renamed_1 = arg3;
        sprikn2.cfr_renamed_3 = d4;
    }

    public sprikn(sprgeja arg0) {
        this(arg0, 0.0, 360.0);
    }

    public double cfr_renamed_13180() {
        return this.cfr_renamed_91;
    }
}

