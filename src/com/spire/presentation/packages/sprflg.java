/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreig;
import com.spire.presentation.packages.sprgog;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprpkg;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwig;
import java.security.SecureRandom;

public class sprflg
implements sprii {
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private sprgog cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    private /* synthetic */ sprsil cfr_renamed_1297() {
        sprflg sprflg2 = this;
        spreig spreig2 = sprflg2.cfr_renamed_3.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[sprflg2.cfr_renamed_2];
        byte[] byArray2 = new byte[sprflg2.cfr_renamed_2];
        byte[] byArray3 = new byte[sprflg2.cfr_renamed_2];
        byte[] byArray4 = new byte[sprflg2.cfr_renamed_1];
        spreig2.cfr_renamed_7221(byArray, byArray2, byArray4, byArray3, this.cfr_renamed_4);
        sprwig sprwig2 = new sprwig(this.cfr_renamed_3.cfr_renamed_284(), byArray3);
        sprpkg sprpkg2 = new sprpkg(this.cfr_renamed_3.cfr_renamed_284(), byArray, byArray2, byArray4);
        return new sprsil(sprwig2, sprpkg2);
    }

    @Override
    public sprsil cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_3 = (sprgog)arg0;
        sprflg sprflg2 = this;
        sprflg2.cfr_renamed_4 = arg0.cfr_renamed_1295();
        sprflg2.cfr_renamed_91 = sprflg2.cfr_renamed_3.cfr_renamed_284().cfr_renamed_3353();
        sprflg2.cfr_renamed_0 = sprflg2.cfr_renamed_3.cfr_renamed_284().cfr_renamed_2331();
        sprflg2.cfr_renamed_1 = sprflg2.cfr_renamed_0 / 8;
        sprflg2.cfr_renamed_2 = (sprflg2.cfr_renamed_91 + 7) / 8;
    }
}

