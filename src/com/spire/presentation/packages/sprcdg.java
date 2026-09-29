/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprnxf;
import com.spire.presentation.packages.sprqag;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtvf;
import com.spire.presentation.packages.sprwvf;
import com.spire.presentation.packages.sprybg;
import java.security.SecureRandom;

public class sprcdg
implements sprii {
    private sprnxf cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5536(sprgye sprgye2) {
        void arg0;
        sprcdg sprcdg2 = this;
        sprcdg2.cfr_renamed_4 = arg0.cfr_renamed_1295();
        sprcdg2.cfr_renamed_3 = ((sprwvf)sprgye2).cfr_renamed_284();
    }

    @Override
    public sprsil cfr_renamed_1223() {
        sprqag sprqag2 = this.cfr_renamed_3.cfr_renamed_143();
        byte[] byArray = new byte[sprqag2.cfr_renamed_6254()];
        byte[] byArray2 = new byte[sprqag2.cfr_renamed_6094()];
        sprqag2.cfr_renamed_6255(byArray2, byArray, this.cfr_renamed_4);
        sprtvf sprtvf2 = new sprtvf(this.cfr_renamed_3, byArray2);
        sprybg sprybg2 = new sprybg(this.cfr_renamed_3, byArray);
        return new sprsil(sprtvf2, sprybg2);
    }
}

