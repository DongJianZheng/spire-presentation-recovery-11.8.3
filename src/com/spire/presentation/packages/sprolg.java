/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprblg;
import com.spire.presentation.packages.sprcfg;
import com.spire.presentation.packages.sprfhg;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprnkg;
import com.spire.presentation.packages.sprsil;
import java.security.SecureRandom;

public class sprolg
implements sprii {
    private sprnkg cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    private /* synthetic */ sprsil cfr_renamed_1297() {
        sprblg sprblg2 = this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[sprblg2.cfr_renamed_6093()];
        byte[] byArray2 = new byte[sprblg2.cfr_renamed_6094()];
        sprblg2.cfr_renamed_6789(byArray2, byArray, this.cfr_renamed_4);
        sprcfg sprcfg2 = new sprcfg(this.cfr_renamed_3.cfr_renamed_284(), byArray2);
        sprfhg sprfhg2 = new sprfhg(this.cfr_renamed_3.cfr_renamed_284(), byArray);
        return new sprsil(sprcfg2, sprfhg2);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_5537(arg0);
    }

    @Override
    public sprsil cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    private /* synthetic */ void cfr_renamed_5537(sprgye arg0) {
        this.cfr_renamed_3 = (sprnkg)arg0;
        this.cfr_renamed_4 = arg0.cfr_renamed_1295();
    }
}

