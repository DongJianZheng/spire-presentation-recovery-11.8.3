/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprjeka;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprxln;

@sprtea
public class sprihn
extends sprsmn {
    private sprjeka cfr_renamed_3;
    private sprjeka cfr_renamed_4;

    private /* synthetic */ sprxln cfr_renamed_13760(sprxln arg0) {
        if (arg0 == null) {
            return null;
        }
        sprxln sprxln2 = arg0.cfr_renamed_13655(true);
        sprxln2.cfr_renamed_12624(this.cfr_renamed_13761());
        return sprxln2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_13762(sprmrn sprmrn2) {
        void arg0;
        this.cfr_renamed_13763(sprmrn2.cfr_renamed_13094());
        sprmrn sprmrn3 = new sprmrn();
        sprihn sprihn2 = this;
        sprmrn3.cfr_renamed_12545(sprihn2.cfr_renamed_13760(arg0.cfr_renamed_12590()));
        sprihn2.cfr_renamed_13668().cfr_renamed_12507(sprmrn3);
        this.cfr_renamed_3.cfr_renamed_12516(sprmrn3);
    }

    @Override
    public void cfr_renamed_13122(sprson arg0) {
        sprihn sprihn2 = this;
        sprgeja sprgeja2 = sprihn2.cfr_renamed_13761().cfr_renamed_13764(arg0.cfr_renamed_8505());
        sprson sprson2 = new sprson(sprgeja2.cfr_renamed_9494(), sprgeja2.cfr_renamed_2773(), arg0.cfr_renamed_12510(), arg0.cfr_renamed_13240());
        sprihn2.cfr_renamed_13668().cfr_renamed_12507(sprson2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13098(sprxln sprxln2) {
        sprxln sprxln3;
        void arg0;
        sprihn sprihn2 = this;
        sprihn2.cfr_renamed_13763(arg0.cfr_renamed_13094());
        sprxln sprxln4 = sprxln3 = sprxln2.cfr_renamed_13655(true);
        sprxln sprxln5 = sprxln3;
        sprxln5.cfr_renamed_12511(null);
        sprxln4.cfr_renamed_12545(this.cfr_renamed_13760(sprxln5.cfr_renamed_12590()));
        sprxln4.cfr_renamed_12624(this.cfr_renamed_13761());
        sprihn2.cfr_renamed_13668().cfr_renamed_12507(sprxln3);
    }

    private /* synthetic */ sprihn() {
        sprihn sprihn2 = this;
        sprihn sprihn3 = this;
        sprihn2.cfr_renamed_3 = new sprjeka();
        sprihn3.cfr_renamed_4 = new sprjeka();
        sprihn2.cfr_renamed_4.cfr_renamed_12516(new sprqgp());
        sprihn2.cfr_renamed_3.cfr_renamed_12516(new sprmrn());
    }

    @Override
    public void cfr_renamed_13107(sprxln arg0) {
        this.cfr_renamed_13765();
    }

    @Override
    public void cfr_renamed_13108(sprthn arg0) {
        boolean bl;
        sprthn sprthn2 = arg0;
        this.cfr_renamed_13763(sprthn2.cfr_renamed_13094());
        sprthn sprthn3 = (sprthn)sprthn2.cfr_renamed_13616();
        sprthn3.cfr_renamed_12511(this.cfr_renamed_13761());
        boolean bl2 = bl = arg0.cfr_renamed_12590() != null;
        if (bl) {
            sprmrn sprmrn2;
            sprmrn sprmrn3 = sprmrn2 = new sprmrn();
            sprmrn3.cfr_renamed_12545(sprthn3.cfr_renamed_12590());
            this.cfr_renamed_13762(sprmrn3);
            sprthn3.cfr_renamed_12545(null);
        }
        this.cfr_renamed_13668().cfr_renamed_12507(sprthn3);
        if (bl) {
            this.cfr_renamed_13674();
        }
        this.cfr_renamed_13765();
    }

    public static sprvjn cfr_renamed_13766(sprvjn arg0) {
        sprihn sprihn2;
        sprihn sprihn3 = sprihn2 = new sprihn();
        arg0.cfr_renamed_13121(sprihn3);
        return sprihn3.cfr_renamed_13668();
    }

    private /* synthetic */ sprmrn cfr_renamed_13668() {
        return (sprmrn)this.cfr_renamed_3.cfr_renamed_12398();
    }

    private /* synthetic */ void cfr_renamed_13763(sprqgp arg0) {
        sprqgp sprqgp2 = this.cfr_renamed_13761().cfr_renamed_12099();
        if (arg0 != null) {
            sprqgp2.cfr_renamed_12634(arg0, 0);
        }
        this.cfr_renamed_4.cfr_renamed_12516(sprqgp2);
    }

    private /* synthetic */ sprqgp cfr_renamed_13761() {
        return (sprqgp)this.cfr_renamed_4.cfr_renamed_12398();
    }

    private /* synthetic */ void cfr_renamed_13765() {
        this.cfr_renamed_4.cfr_renamed_12514();
    }

    @Override
    public void cfr_renamed_13092(sprmrn arg0) {
        this.cfr_renamed_13762(arg0);
    }

    private /* synthetic */ void cfr_renamed_13674() {
        this.cfr_renamed_3.cfr_renamed_12514();
        this.cfr_renamed_4.cfr_renamed_12514();
    }

    @Override
    public void cfr_renamed_13101(sprmrn arg0) {
        this.cfr_renamed_13674();
    }
}

