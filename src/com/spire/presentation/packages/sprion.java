/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcz;
import com.spire.presentation.packages.spriln;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprion
extends sprvjn
implements sprcz {
    private float cfr_renamed_0;
    private float cfr_renamed_1;
    private static final float cfr_renamed_2 = 45.0f;
    private sprphja cfr_renamed_3;
    private sprsuja cfr_renamed_4;

    public sprsuja cfr_renamed_13167() {
        sprion sprion2 = this;
        return sprion2.cfr_renamed_13828((float)spryxp.cfr_renamed_13829(sprion2.cfr_renamed_13180()));
    }

    public void cfr_renamed_13598(sprphja arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public spriln[] cfr_renamed_13165() {
        int n;
        float f = 45.0f;
        if (this.cfr_renamed_13182() < 0.0f) {
            f = -f;
        }
        int n2 = (int)(this.cfr_renamed_13182() / f) + 1;
        n2 = Math.min(n2, 8);
        spriln[] sprilnArray = new spriln[n2];
        float f2 = this.cfr_renamed_13180();
        int n3 = n = 0;
        while (n3 < n2) {
            float f3 = (float)sprrgga.cfr_renamed_13830(f) * Math.min(Math.abs(f), Math.abs(this.cfr_renamed_13180() + this.cfr_renamed_13182() - f2));
            sprilnArray[n] = this.cfr_renamed_13831(f2, f3);
            f2 += f3;
            n3 = ++n;
        }
        return sprilnArray;
    }

    public void cfr_renamed_13179(float arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public float cfr_renamed_13180() {
        return this.cfr_renamed_0;
    }

    public sprsuja cfr_renamed_2322() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ float cfr_renamed_13832(float arg0) {
        return (float)Math.atan2((double)(1.0f / this.cfr_renamed_13833().cfr_renamed_1452()) * Math.sin(arg0), (double)(1.0f / this.cfr_renamed_13833().cfr_renamed_1942()) * Math.cos(arg0));
    }

    public void cfr_renamed_13834(sprsuja arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public void cfr_renamed_13121(sprsmn arg0) {
        arg0.cfr_renamed_13164(this);
    }

    public sprsuja cfr_renamed_13171() {
        sprion sprion2 = this;
        return sprion2.cfr_renamed_13828((float)spryxp.cfr_renamed_13829(this.cfr_renamed_13180() + sprion2.cfr_renamed_13182()));
    }

    public float cfr_renamed_13182() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprvjn cfr_renamed_12099() {
        sprion sprion2;
        sprion sprion3 = sprion2 = new sprion();
        sprion3.cfr_renamed_4 = new sprsuja(this.cfr_renamed_4.cfr_renamed_1980(), this.cfr_renamed_4.spr\u3181());
        sprion3.cfr_renamed_3 = new sprphja(this.cfr_renamed_3);
        sprion2.cfr_renamed_0 = this.cfr_renamed_0;
        sprion2.cfr_renamed_1 = this.cfr_renamed_1;
        return sprion2;
    }

    private /* synthetic */ spriln cfr_renamed_13831(float arg0, float arg1) {
        spriln spriln2;
        float f = (float)spryxp.cfr_renamed_13829(arg0 + arg1);
        arg0 = (float)spryxp.cfr_renamed_13829(arg0);
        sprion sprion2 = this;
        float f2 = sprion2.cfr_renamed_13832(arg0);
        float f3 = sprion2.cfr_renamed_13832(f);
        float f4 = f3 - f2;
        float f5 = f4 / 2.0f;
        float f6 = (float)(Math.sin(f4) * (Math.sqrt(4.0 + 3.0 * Math.pow(Math.tan(f5), 2.0)) - 1.0) / 3.0);
        spriln spriln3 = spriln2 = new spriln();
        spriln3.cfr_renamed_13183(this.cfr_renamed_13828(arg0));
        spriln3.cfr_renamed_13621(this.cfr_renamed_13828(f));
        spriln2.cfr_renamed_13622(new sprsuja(spriln2.cfr_renamed_13167().cfr_renamed_1980() - f6 * this.cfr_renamed_13833().cfr_renamed_1942() * (float)Math.sin(f2), spriln2.cfr_renamed_13167().spr\u3181() - f6 * this.cfr_renamed_13833().cfr_renamed_1452() * (float)Math.cos(f2)));
        spriln2.cfr_renamed_13623(new sprsuja(spriln2.cfr_renamed_13171().cfr_renamed_1980() + f6 * this.cfr_renamed_13833().cfr_renamed_1942() * (float)Math.sin(f3), spriln2.cfr_renamed_13171().spr\u3181() + f6 * this.cfr_renamed_13833().cfr_renamed_1452() * (float)Math.cos(f3)));
        return spriln2;
    }

    public void cfr_renamed_13181(float arg0) {
        this.cfr_renamed_1 = arg0;
    }

    private /* synthetic */ sprsuja cfr_renamed_13828(float arg0) {
        float f = this.cfr_renamed_13832(arg0);
        return new sprsuja(this.cfr_renamed_8417().cfr_renamed_1980() + this.cfr_renamed_13833().cfr_renamed_1942() * (float)Math.cos(f), this.cfr_renamed_8417().spr\u3181() - this.cfr_renamed_13833().cfr_renamed_1452() * (float)Math.sin(f));
    }

    public sprphja cfr_renamed_2773() {
        return this.cfr_renamed_3;
    }

    public sprsuja cfr_renamed_8417() {
        return new sprsuja(this.cfr_renamed_2322().cfr_renamed_1980() + this.cfr_renamed_13833().cfr_renamed_1942(), this.cfr_renamed_2322().spr\u3181() + this.cfr_renamed_13833().cfr_renamed_1452());
    }

    @Override
    public sprvjn cfr_renamed_13616() {
        return this.cfr_renamed_12099();
    }

    public sprphja cfr_renamed_13833() {
        return new sprphja(this.cfr_renamed_2773().cfr_renamed_1942() / 2.0f, this.cfr_renamed_2773().cfr_renamed_1452() / 2.0f);
    }
}

