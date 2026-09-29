/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.spreun;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.spriyn;
import com.spire.presentation.packages.sprjth;
import com.spire.presentation.packages.sproun;
import com.spire.presentation.packages.sproxn;
import com.spire.presentation.packages.sprpyn;
import com.spire.presentation.packages.sprqvn;
import com.spire.presentation.packages.sprrvn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprwyn;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprzsd;

@sprtea
public class sprmbo
extends sprqvn {
    private sprrvn cfr_renamed_3;
    private sproxn cfr_renamed_4;

    @Override
    @sprtea
    public void cfr_renamed_14873(spryjn arg0) {
        arg0.cfr_renamed_14057(this.cfr_renamed_14604().cfr_renamed_14869(), this.cfr_renamed_14604().cfr_renamed_4570());
    }

    private static /* synthetic */ sprrvn cfr_renamed_14879(sprgdo arg0, sproxn arg1) {
        if (arg1.cfr_renamed_14132()) {
            return new sprwyn(arg0, sprzsd.cfr_renamed_9("\u0017?q8~\u0013V\bl\u0005H\u0019\b?"), arg1);
        }
        return new spriyn(arg0, arg1);
    }

    private static /* synthetic */ sproxn cfr_renamed_14880(sprfzo arg0, sprgdo arg1) {
        sproxn sproxn2;
        sprvqo sprvqo2 = arg0.cfr_renamed_13412(arg1.cfr_renamed_13097().cfr_renamed_14515(), !arg1.cfr_renamed_13097().cfr_renamed_14515() && arg1.cfr_renamed_13097().cfr_renamed_14545() == 1, false);
        sproxn sproxn3 = sproxn2 = arg0.cfr_renamed_14132() && arg0.cfr_renamed_14133() ? new spreun(sprvqo2) : new sproun(sprvqo2);
        sproxn3.cfr_renamed_14863(65);
        sproxn3.cfr_renamed_14863(32);
        return sproxn3;
    }

    @sprtea
    public sproxn cfr_renamed_13411() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean cfr_renamed_14877(int arg0) {
        return this.cfr_renamed_13411().cfr_renamed_13484().cfr_renamed_14000(arg0) || this.cfr_renamed_13411().cfr_renamed_14855().cfr_renamed_14000(arg0);
    }

    @Override
    @sprtea
    public void cfr_renamed_14858(spryjn arg0) {
        int n;
        int n2 = sprpyn.cfr_renamed_14844();
        int n3 = sprpyn.cfr_renamed_14840();
        sprdsp sprdsp2 = this.cfr_renamed_13411().cfr_renamed_13484();
        int n4 = n = 0;
        while (n4 < sprdsp2.cfr_renamed_11861()) {
            int n5 = sprdsp2.cfr_renamed_7861(n);
            if (sprpyn.cfr_renamed_14839(n5)) {
                int n6 = sprpyn.cfr_renamed_14836(n5) & 0xFF;
                n2 = n2 > n6 ? n6 : n2;
                n3 = n3 < n6 ? n6 : n3;
            }
            n4 = ++n;
        }
        spryjn spryjn2 = arg0;
        spryjn2.cfr_renamed_14094(sprjth.cfr_renamed_9("$kb_xYHEj_"), n2);
        spryjn2.cfr_renamed_14094(sprzsd.cfr_renamed_9("St\u001dK\b{\u0014Y\u000e"), n3);
        arg0.cfr_renamed_14057(sprjth.cfr_renamed_9("\u0002\\DoYc^"), this.cfr_renamed_14875(n2, n3));
    }

    @sprtea
    public sprrvn cfr_renamed_14604() {
        return this.cfr_renamed_3;
    }

    @Override
    @sprtea
    public boolean cfr_renamed_14878() {
        return true;
    }

    @Override
    @sprtea
    public void cfr_renamed_14874(int arg0, int arg1) {
        this.cfr_renamed_13411().cfr_renamed_14865(arg0, arg1);
    }

    @Override
    @sprtea
    public void cfr_renamed_14876(int arg0, int[] arg1) {
        this.cfr_renamed_13411().cfr_renamed_14866(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprmbo(sprfzo sprfzo2, sprgdo sprgdo2) {
        void arg1;
        void arg0;
        void v0 = arg0;
        super((sprfzo)v0, (sprgdo)arg1);
        this.cfr_renamed_4 = sprmbo.cfr_renamed_14880((sprfzo)v0, (sprgdo)arg1);
        this.cfr_renamed_3 = sprmbo.cfr_renamed_14879(sprgdo2, this.cfr_renamed_4);
    }
}

