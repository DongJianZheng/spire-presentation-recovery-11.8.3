/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhfg;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprjbg;
import com.spire.presentation.packages.sprkeg;
import com.spire.presentation.packages.sprneg;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwuf;
import java.security.SecureRandom;

public class spredg
implements sprii {
    private sprwuf cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    private /* synthetic */ sprsil cfr_renamed_1297() {
        sprhfg sprhfg2 = this.cfr_renamed_3.cfr_renamed_143();
        sprhfg2.cfr_renamed_3251(this.cfr_renamed_4);
        byte[][] byArray = sprhfg2.cfr_renamed_7016();
        sprkeg sprkeg2 = new sprkeg(this.cfr_renamed_3, byArray[0], byArray[1]);
        sprneg sprneg2 = new sprneg(this.cfr_renamed_3, byArray[2], byArray[3], byArray[4], byArray[0], byArray[1]);
        return new sprsil(sprkeg2, sprneg2);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_5537(arg0);
    }

    private /* synthetic */ void cfr_renamed_5537(sprgye arg0) {
        this.cfr_renamed_3 = ((sprjbg)arg0).cfr_renamed_284();
        this.cfr_renamed_4 = arg0.cfr_renamed_1295();
    }
}

