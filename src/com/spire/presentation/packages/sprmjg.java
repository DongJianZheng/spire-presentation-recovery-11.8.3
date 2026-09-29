/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbng;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprpig;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprvmg;
import com.spire.presentation.packages.sprxfg;
import java.security.SecureRandom;

public class sprmjg
implements sprii {
    private sprvmg cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_5537(arg0);
    }

    private /* synthetic */ void cfr_renamed_5537(sprgye arg0) {
        this.cfr_renamed_3 = ((sprbng)arg0).cfr_renamed_284();
        this.cfr_renamed_4 = arg0.cfr_renamed_1295();
    }

    private /* synthetic */ sprsil cfr_renamed_1297() {
        sprmjg sprmjg2 = this;
        byte[][] byArray = sprmjg2.cfr_renamed_3.cfr_renamed_7120(sprmjg2.cfr_renamed_4).cfr_renamed_1223();
        sprpig sprpig2 = new sprpig(this.cfr_renamed_3, byArray[0], byArray[6]);
        sprxfg sprxfg2 = new sprxfg(this.cfr_renamed_3, byArray[0], byArray[1], byArray[2], byArray[3], byArray[4], byArray[5], byArray[6]);
        return new sprsil(sprpig2, sprxfg2);
    }
}

