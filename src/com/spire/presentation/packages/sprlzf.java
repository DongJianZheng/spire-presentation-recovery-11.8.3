/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfyf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprkcg;
import com.spire.presentation.packages.sprlvf;
import com.spire.presentation.packages.sprrbg;
import com.spire.presentation.packages.sprsil;
import java.security.SecureRandom;

public class sprlzf
implements sprii {
    private int cfr_renamed_2;
    private sprkcg cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    private /* synthetic */ void cfr_renamed_5537(sprgye arg0) {
        this.cfr_renamed_3 = (sprkcg)arg0;
        this.cfr_renamed_4 = arg0.cfr_renamed_1295();
        this.cfr_renamed_2 = this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_2331();
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_5537(arg0);
    }

    private /* synthetic */ sprsil cfr_renamed_1297() {
        sprfyf sprfyf2 = this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[sprfyf2.cfr_renamed_6093()];
        byte[] byArray2 = new byte[sprfyf2.cfr_renamed_6094()];
        sprfyf2.cfr_renamed_6095(byArray2, byArray, this.cfr_renamed_4);
        sprlvf sprlvf2 = new sprlvf(this.cfr_renamed_3.cfr_renamed_284(), byArray2);
        sprrbg sprrbg2 = new sprrbg(this.cfr_renamed_3.cfr_renamed_284(), byArray);
        return new sprsil(sprlvf2, sprrbg2);
    }
}

