/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.sprgff;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhff;
import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprmef;
import com.spire.presentation.packages.sprmze;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtef;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprxhf;
import com.spire.presentation.packages.sprxxe;
import java.security.SecureRandom;

public class sprvaf
implements sprii {
    private int cfr_renamed_112;
    private static final String cfr_renamed_119 = "1.3.6.1.4.1.8301.3.1.3.4.1";
    private int cfr_renamed_91;
    private boolean cfr_renamed_0 = false;
    private SecureRandom cfr_renamed_1;
    private int cfr_renamed_2;
    private sprgff cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_5537(arg0);
    }

    private /* synthetic */ void cfr_renamed_5537(sprgye arg0) {
        this.cfr_renamed_3 = (sprgff)arg0;
        sprvaf sprvaf2 = this;
        sprvaf2.cfr_renamed_1 = arg0.cfr_renamed_1295();
        sprvaf2.cfr_renamed_2 = sprvaf2.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1186();
        sprvaf2.cfr_renamed_91 = sprvaf2.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1146();
        sprvaf2.cfr_renamed_112 = sprvaf2.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1144();
        this.cfr_renamed_4 = this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1185();
        this.cfr_renamed_0 = true;
    }

    private /* synthetic */ sprsil cfr_renamed_1297() {
        if (!this.cfr_renamed_0) {
            this.cfr_renamed_1303();
        }
        sprvaf sprvaf2 = this;
        sprnhf sprnhf2 = new sprnhf(sprvaf2.cfr_renamed_2, sprvaf2.cfr_renamed_4);
        spricf spricf2 = new spricf(sprnhf2, this.cfr_renamed_112, 'I', this.cfr_renamed_1);
        spricf[] spricfArray = new sprmze(sprnhf2, spricf2).cfr_renamed_812();
        sprmef sprmef2 = sprtef.cfr_renamed_5487(sprtef.cfr_renamed_5488(sprnhf2, spricf2), this.cfr_renamed_1);
        spraye spraye2 = sprmef2.cfr_renamed_1363();
        sprwff sprwff2 = sprmef2.cfr_renamed_1364();
        spraye spraye3 = (spraye)spraye2.cfr_renamed_1090();
        spraye spraye4 = spraye3.cfr_renamed_1096();
        int n = spraye3.cfr_renamed_884();
        spraye[] sprayeArray = spraye.cfr_renamed_1104(n, this.cfr_renamed_1);
        sprvaf sprvaf3 = this;
        sprwff sprwff3 = new sprwff(sprvaf3.cfr_renamed_91, sprvaf3.cfr_renamed_1);
        spraye spraye5 = (spraye)sprayeArray[0].cfr_renamed_5486(spraye4);
        spraye5 = (spraye)spraye5.cfr_renamed_5483(sprwff3);
        sprvaf sprvaf4 = this;
        sprxxe sprxxe2 = new sprxxe(sprvaf4.cfr_renamed_91, sprvaf4.cfr_renamed_112, spraye5);
        sprhff sprhff2 = new sprhff(this.cfr_renamed_91, n, sprnhf2, spricf2, sprwff2, sprwff3, sprayeArray[1]);
        return new sprsil(sprxxe2, sprhff2);
    }

    @Override
    public sprsil cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    private /* synthetic */ void cfr_renamed_1303() {
        sprgff sprgff2 = new sprgff(null, new sprxhf());
        this.cfr_renamed_5537(sprgff2);
    }
}

