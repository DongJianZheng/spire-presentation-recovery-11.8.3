/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcho;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprdoo;
import com.spire.presentation.packages.sprfno;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprmio;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprpno;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprxv;
import com.spire.presentation.packages.spryxp;
import com.spire.presentation.packages.sprzyo;

@sprtea
public class sprtko
implements sprxv {
    private sprmio cfr_renamed_119;
    private sprcho cfr_renamed_91;
    private sprzyo cfr_renamed_0;
    private sprqgp cfr_renamed_1;
    public static final int cfr_renamed_2 = 72;
    private sprvyo cfr_renamed_3;
    private sprpno cfr_renamed_4;

    public void cfr_renamed_11665() {
        if (this.cfr_renamed_0 != null) {
            this.cfr_renamed_0.cfr_renamed_11665();
            this.cfr_renamed_0 = null;
        }
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_3.cfr_renamed_11665();
            this.cfr_renamed_3 = null;
        }
    }

    @Override
    public void cfr_renamed_16407() {
        sprtko sprtko2 = this;
        sprtko2.cfr_renamed_119.cfr_renamed_16407();
        int n = sprtko2.cfr_renamed_3.cfr_renamed_1942();
        int n2 = sprtko2.cfr_renamed_3.cfr_renamed_1452();
        sprtko2.cfr_renamed_0.cfr_renamed_11665();
        sprtko2.cfr_renamed_3.cfr_renamed_11665();
        sprtko sprtko3 = this;
        sprtko2.cfr_renamed_3 = new sprvyo(n, n2);
        sprtko2.cfr_renamed_0 = new sprzyo(this.cfr_renamed_3);
    }

    @Override
    public void cfr_renamed_16425(sprvjn arg0) {
        this.cfr_renamed_119.cfr_renamed_16425(arg0);
    }

    public sprvyo cfr_renamed_16422(sprgeja arg0, sprlfja arg1) {
        sprtko sprtko2 = this;
        sprtko2.cfr_renamed_16426();
        sprgeja sprgeja2 = sprtko2.cfr_renamed_4.cfr_renamed_16312().cfr_renamed_13764(arg0);
        sprgeja sprgeja3 = sprtko2.cfr_renamed_1.cfr_renamed_13764(sprgeja2);
        sprvyo sprvyo2 = new sprvyo(arg1.cfr_renamed_1942(), arg1.cfr_renamed_1452(), 72.0f, 72.0f);
        sprtko2.cfr_renamed_16427(sprgeja3, sprvyo2);
        return sprvyo2;
    }

    @Override
    public void cfr_renamed_16404(sprvjn arg0) {
        this.cfr_renamed_119.cfr_renamed_16404(arg0);
    }

    private /* synthetic */ void cfr_renamed_16427(sprgeja arg0, sprvyo arg1) {
        this.cfr_renamed_3.cfr_renamed_16416(arg0, arg1, sprgeja.cfr_renamed_16235(new sprpeja(0, 0, arg1.cfr_renamed_1942(), arg1.cfr_renamed_1452())), false, false);
    }

    @Override
    public void cfr_renamed_16412(sprvjn arg0) {
        this.cfr_renamed_119.cfr_renamed_16412(arg0);
    }

    private static /* synthetic */ sprlfja cfr_renamed_16428(sprgeja arg0) {
        sprgeja sprgeja2 = arg0;
        int n = spryxp.cfr_renamed_13526(sprgeja2.cfr_renamed_1942());
        int n2 = spryxp.cfr_renamed_13526(sprgeja2.cfr_renamed_1452());
        int n3 = n;
        while (sprsto.cfr_renamed_16429(n3, n2)) {
            n2 /= 2;
            n3 = n /= 2;
        }
        return new sprlfja(n, n2);
    }

    public sprtko(sprgeja arg0, sprfno arg1, sprpno arg2, spriy arg3) {
        sprdoo sprdoo2;
        sprtko sprtko2 = this;
        sprtko sprtko3 = this;
        this.cfr_renamed_4 = arg2;
        sprtko sprtko4 = this;
        sprtko3.cfr_renamed_119 = new sprmio(arg0, arg1, arg2);
        sprlfja sprlfja2 = sprtko.cfr_renamed_16428(arg0);
        sprtko2.cfr_renamed_3 = new sprvyo(sprlfja2.cfr_renamed_1942(), sprlfja2.cfr_renamed_1452(), 72.0f, 72.0f);
        sprtko3.cfr_renamed_0 = new sprzyo(this.cfr_renamed_3);
        sprtko2.cfr_renamed_1 = sprqgp.cfr_renamed_16234(arg0, new sprgeja(new sprsuja(), sprlfja.cfr_renamed_15060(sprlfja2)));
        sprcno sprcno2 = new sprcno(arg3);
        sprcno2.cfr_renamed_12727(2);
        sprdoo sprdoo3 = sprdoo2 = new sprdoo();
        sprdoo sprdoo4 = sprdoo2;
        sprdoo4.cfr_renamed_16430(true);
        sprdoo4.cfr_renamed_16007(3);
        sprdoo3.cfr_renamed_15987(5);
        sprdoo3.cfr_renamed_16431(3);
        sprtko2.cfr_renamed_91 = new sprcho(null, sprcno2, sprdoo2);
    }

    private /* synthetic */ void cfr_renamed_16426() {
        sprtko sprtko2 = this;
        sprtko2.cfr_renamed_16432(sprtko2.cfr_renamed_119.cfr_renamed_16203());
        sprtko2.cfr_renamed_119.cfr_renamed_16407();
    }

    public void cfr_renamed_16432(sprmrn arg0) {
        sprmrn sprmrn2;
        sprmrn sprmrn3 = sprmrn2 = new sprmrn();
        sprmrn3.cfr_renamed_12511(this.cfr_renamed_1);
        sprmrn3.cfr_renamed_12507(arg0);
        this.cfr_renamed_91.cfr_renamed_16433(sprmrn2, this.cfr_renamed_0);
    }
}

