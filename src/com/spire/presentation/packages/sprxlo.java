/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.spryfo;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprxlo {
    private sprpeja cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private sprpeja cfr_renamed_2;
    private int cfr_renamed_3;
    private sprpeja cfr_renamed_4 = sprpeja.cfr_renamed_2;

    @sprtea
    public spryfo cfr_renamed_16796() {
        sprxlo sprxlo2 = this;
        sprxlo sprxlo3 = this;
        sprxlo sprxlo4 = this;
        return new spryfo(new sprlfja(sprxlo2.cfr_renamed_112, sprxlo2.cfr_renamed_0), new sprlfja(sprxlo3.cfr_renamed_91, sprxlo3.cfr_renamed_1), new sprlfja(sprxlo4.cfr_renamed_3, sprxlo4.cfr_renamed_119));
    }

    @sprtea
    public sprpeja cfr_renamed_16806() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public float cfr_renamed_14218() {
        return (float)(this.cfr_renamed_16812() * 25.4);
    }

    @sprtea
    public float cfr_renamed_14217() {
        return (float)(this.cfr_renamed_16813() * 25.4);
    }

    @sprtea
    public sprpeja cfr_renamed_16236() {
        return this.cfr_renamed_4;
    }

    private static /* synthetic */ int cfr_renamed_16814(double arg0, double arg1) {
        return spryxp.cfr_renamed_13526(arg0 / 100.0 * arg1);
    }

    @sprtea
    public sprpeja cfr_renamed_16815() {
        return this.cfr_renamed_152;
    }

    private /* synthetic */ double cfr_renamed_16813() {
        return (double)this.cfr_renamed_112 / (double)this.cfr_renamed_91;
    }

    private /* synthetic */ double cfr_renamed_16812() {
        return (double)this.cfr_renamed_0 / (double)this.cfr_renamed_1;
    }

    public sprxlo() {
        this.cfr_renamed_152 = sprpeja.cfr_renamed_2;
        this.cfr_renamed_2 = sprpeja.cfr_renamed_2;
    }

    private /* synthetic */ sprpeja cfr_renamed_16816(sprpeja arg0) {
        sprpeja sprpeja2 = arg0;
        int n = sprxlo.cfr_renamed_16814(sprpeja2.cfr_renamed_13430(), this.cfr_renamed_16813());
        int n2 = sprxlo.cfr_renamed_16814(sprpeja2.cfr_renamed_13342(), this.cfr_renamed_16812());
        int n3 = sprxlo.cfr_renamed_16814(sprpeja2.cfr_renamed_13341(), this.cfr_renamed_16813());
        int n4 = sprxlo.cfr_renamed_16814(sprpeja2.cfr_renamed_13429(), this.cfr_renamed_16812());
        return sprpeja.cfr_renamed_16817(sprrgga.cfr_renamed_12461(n, n3), sprrgga.cfr_renamed_12461(n2, n4), sprrgga.cfr_renamed_2548(n, n3) + 1, sprrgga.cfr_renamed_2548(n2, n4) + 1);
    }

    @sprtea
    public void cfr_renamed_16808(sprujo arg0) {
        sprujo sprujo2;
        arg0.cfr_renamed_13220();
        sprujo sprujo3 = arg0;
        sprujo sprujo4 = arg0;
        sprujo sprujo5 = arg0;
        long l = sprujo5.cfr_renamed_13220();
        int n = sprujo5.cfr_renamed_12261();
        int n2 = sprujo5.cfr_renamed_12261();
        int n3 = sprujo5.cfr_renamed_12261();
        int n4 = sprujo4.cfr_renamed_12261();
        this.cfr_renamed_4 = sprpeja.cfr_renamed_16817(n, n2, n3, n4);
        n = sprujo4.cfr_renamed_12261();
        n2 = sprujo4.cfr_renamed_12261();
        n3 = sprujo3.cfr_renamed_12261();
        n4 = sprujo3.cfr_renamed_12261();
        this.cfr_renamed_152 = sprpeja.cfr_renamed_16817(n, n2, n3, n4);
        sprujo3.cfr_renamed_13220();
        arg0.cfr_renamed_13220();
        arg0.cfr_renamed_13220();
        arg0.cfr_renamed_13220();
        arg0.cfr_renamed_13218();
        arg0.cfr_renamed_13218();
        arg0.cfr_renamed_13220();
        arg0.cfr_renamed_13220();
        arg0.cfr_renamed_13220();
        sprxlo sprxlo2 = this;
        sprujo sprujo6 = arg0;
        this.cfr_renamed_112 = arg0.cfr_renamed_12261();
        this.cfr_renamed_0 = sprujo6.cfr_renamed_12261();
        sprxlo2.cfr_renamed_91 = sprujo6.cfr_renamed_12261();
        sprxlo2.cfr_renamed_1 = arg0.cfr_renamed_12261();
        if ((l & 0xFFFFFFFFL) >= 108L) {
            int n5 = arg0.cfr_renamed_12261();
            sprujo sprujo7 = arg0;
            arg0.cfr_renamed_12261();
            sprujo2 = sprujo7;
            sprujo7.cfr_renamed_12261();
            sprxlo sprxlo3 = this;
            sprxlo3.cfr_renamed_3 = arg0.cfr_renamed_12261();
            sprxlo3.cfr_renamed_119 = arg0.cfr_renamed_12261();
        } else {
            sprxlo sprxlo4 = this;
            sprxlo4.cfr_renamed_3 = sprxlo4.cfr_renamed_91 * 1000;
            sprxlo4.cfr_renamed_119 = sprxlo4.cfr_renamed_1 * 1000;
            sprujo2 = arg0;
        }
        sprujo2.cfr_renamed_14060().cfr_renamed_11548(l);
        sprxlo sprxlo5 = this;
        sprxlo5.cfr_renamed_2 = sprxlo5.cfr_renamed_16816(sprxlo5.cfr_renamed_152);
    }
}

