/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfno;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprpno;
import com.spire.presentation.packages.sprrp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxv;

@sprtea
public class sprmio
implements sprrp,
sprxv {
    private sprpno cfr_renamed_91;
    private sprgeja cfr_renamed_0;
    private sprmrn cfr_renamed_1;
    private sprmrn cfr_renamed_2;
    private sprmrn cfr_renamed_3;
    private sprfno cfr_renamed_4;

    @Override
    public void cfr_renamed_16407() {
        this.cfr_renamed_16434(sprwbp.cfr_renamed_1453);
    }

    @Override
    public void cfr_renamed_16412(sprvjn arg0) {
        if (arg0 == null) {
            return;
        }
        sprmio sprmio2 = this;
        sprmio2.cfr_renamed_1 = null;
        sprmio2.cfr_renamed_16435();
        sprmio2.cfr_renamed_2.cfr_renamed_12507(arg0);
    }

    @Override
    public void cfr_renamed_16425(sprvjn arg0) {
        if (arg0 == null) {
            return;
        }
        this.cfr_renamed_2 = null;
        this.cfr_renamed_3.cfr_renamed_12507(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_16434(sprwbp sprwbp2) {
        sprmio sprmio2 = this;
        sprmio2.cfr_renamed_3 = new sprmrn();
        if (sprwbp.cfr_renamed_13267(sprwbp2, sprwbp.cfr_renamed_1453)) {
            void arg0;
            sprmio sprmio3 = this;
            sprxln sprxln2 = sprxln.cfr_renamed_13253(sprmio3.cfr_renamed_0);
            sprxln2.cfr_renamed_12550(new sprghp((sprwbp)arg0));
            sprmio3.cfr_renamed_3.cfr_renamed_12507(sprxln2);
        }
        this.cfr_renamed_2 = null;
    }

    @Override
    public void cfr_renamed_16404(sprvjn arg0) {
        if (arg0 == null) {
            return;
        }
        sprmio sprmio2 = this;
        sprmio2.cfr_renamed_16436();
        sprmio2.cfr_renamed_1.cfr_renamed_12507(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprmio(sprgeja sprgeja2, sprfno sprfno2, sprpno sprpno2) {
        void arg2;
        void arg0;
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_4 = sprfno2;
        sprovja.cfr_renamed_11658(this.cfr_renamed_4.cfr_renamed_16424(), this);
        this.cfr_renamed_91 = arg2;
        sprovja.cfr_renamed_11658(this.cfr_renamed_91.cfr_renamed_16424(), this);
        sprmio sprmio2 = this;
        sprmio2.cfr_renamed_3 = new sprmrn();
    }

    @Override
    public void cfr_renamed_16437() {
        this.cfr_renamed_2 = null;
    }

    @Override
    public void cfr_renamed_16423() {
        this.cfr_renamed_1 = null;
    }

    private /* synthetic */ boolean cfr_renamed_16438() {
        return this.cfr_renamed_4.cfr_renamed_16439();
    }

    public sprmrn cfr_renamed_16203() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_16435() {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = new sprmrn();
            sprmio sprmio2 = this;
            this.cfr_renamed_2.cfr_renamed_12545(sprmio2.cfr_renamed_4.cfr_renamed_16440());
            sprmio2.cfr_renamed_3.cfr_renamed_12507(this.cfr_renamed_2);
            this.cfr_renamed_1 = null;
        }
    }

    private /* synthetic */ void cfr_renamed_16436() {
        sprmio sprmio2 = this;
        sprmio2.cfr_renamed_16435();
        if (sprmio2.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = new sprmrn();
            sprmio sprmio3 = this;
            this.cfr_renamed_1.cfr_renamed_12511(sprmio3.cfr_renamed_91.cfr_renamed_16312().cfr_renamed_12099());
            sprmio3.cfr_renamed_2.cfr_renamed_12507(this.cfr_renamed_1);
        }
    }
}

