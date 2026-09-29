/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdmo;
import com.spire.presentation.packages.spreu;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpq;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryr;
import com.spire.presentation.packages.sprzap;

@sprtea
public class sprcko
implements spryr {
    private sprgeja cfr_renamed_0;
    private sprphja cfr_renamed_1;
    private sprzap cfr_renamed_2;
    private sprdmo cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ boolean cfr_renamed_16737() {
        return !this.cfr_renamed_3.cfr_renamed_16555() && this.cfr_renamed_3.cfr_renamed_16538() == 0;
    }

    @Override
    public void cfr_renamed_16738(double arg0) {
        if (this.cfr_renamed_4) {
            this.cfr_renamed_2.cfr_renamed_16738(arg0);
        }
    }

    @Override
    public void cfr_renamed_16739(sprpq arg0, spreu arg1, double arg2, double arg3, int arg4) {
        if (this.cfr_renamed_4) {
            arg0.cfr_renamed_16740(false);
            return;
        }
        if (this.cfr_renamed_16737() || this.cfr_renamed_2.cfr_renamed_16741(arg0, arg1)) {
            sprpq sprpq2 = arg0;
            this.cfr_renamed_2.cfr_renamed_16742(sprpq2, arg1);
            sprpq2.cfr_renamed_16740(true);
            this.cfr_renamed_16743(sprpq2, arg4, arg2, arg3);
            return;
        }
        this.cfr_renamed_4 = true;
        arg0.cfr_renamed_16740(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_16744(int arg0) {
        sprcko sprcko2;
        double d = 0.0;
        switch (arg0) {
            case 0: {
                d = 0.0;
                sprcko2 = this;
                break;
            }
            case 1: {
                sprcko sprcko3 = this;
                sprcko2 = sprcko3;
                d = ((double)sprcko3.cfr_renamed_0.cfr_renamed_1452() - this.cfr_renamed_2.cfr_renamed_12495()) / 2.0;
                break;
            }
            case 2: {
                sprcko sprcko4 = this;
                sprcko2 = sprcko4;
                d = (double)sprcko4.cfr_renamed_0.cfr_renamed_1452() - this.cfr_renamed_2.cfr_renamed_12495();
                break;
            }
            default: {
                sprcko2 = this;
            }
        }
        sprcko2.cfr_renamed_2.cfr_renamed_16745((double)this.cfr_renamed_0.spr\u3181() + d);
    }

    private /* synthetic */ void cfr_renamed_16743(sprpq arg0, int arg1, double arg2, double arg3) {
        arg0.cfr_renamed_16746(arg1, (double)this.cfr_renamed_0.cfr_renamed_1980() + arg2, (double)(this.cfr_renamed_0.cfr_renamed_1980() + this.cfr_renamed_0.cfr_renamed_1942()) - arg3);
    }

    @Override
    public void cfr_renamed_16747(double arg0) {
        if (this.cfr_renamed_4) {
            this.cfr_renamed_2.cfr_renamed_16747(arg0);
        }
    }

    @Override
    public double cfr_renamed_16748() {
        return this.cfr_renamed_1.cfr_renamed_1942();
    }

    public sprcko(sprphja arg0, sprgeja arg1, sprdmo arg2) {
        sprcko sprcko2 = this;
        sprcko sprcko3 = this;
        this.cfr_renamed_1 = arg0;
        sprcko3.cfr_renamed_0 = arg1;
        sprcko3.cfr_renamed_3 = arg2;
        sprcko2.cfr_renamed_2 = new sprzap();
        this.cfr_renamed_2.cfr_renamed_16749(arg0.cfr_renamed_1942());
        sprcko2.cfr_renamed_2.cfr_renamed_16750(arg0.cfr_renamed_1452());
        sprcko2.cfr_renamed_2.cfr_renamed_16751(arg1.cfr_renamed_1980());
        sprcko2.cfr_renamed_2.cfr_renamed_16752(arg1.spr\u3181());
    }
}

