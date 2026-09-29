/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbdg;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhzf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprmzf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtdg;
import java.security.SecureRandom;

public class sprayf
implements sprii {
    private sprhzf cfr_renamed_0;
    private int cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_5537(arg0);
    }

    private /* synthetic */ sprsil cfr_renamed_1297() {
        sprbdg sprbdg2 = this.cfr_renamed_0.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[sprbdg2.cfr_renamed_6093()];
        byte[] byArray2 = new byte[sprbdg2.cfr_renamed_6094()];
        sprbdg2.cfr_renamed_6789(byArray2, byArray, this.cfr_renamed_2);
        sprmzf sprmzf2 = new sprmzf(this.cfr_renamed_0.cfr_renamed_284(), byArray2);
        sprtdg sprtdg2 = new sprtdg(this.cfr_renamed_0.cfr_renamed_284(), byArray);
        return new sprsil(sprmzf2, sprtdg2);
    }

    @Override
    public sprsil cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    private /* synthetic */ void cfr_renamed_5537(sprgye arg0) {
        this.cfr_renamed_0 = (sprhzf)arg0;
        sprayf sprayf2 = this;
        sprayf2.cfr_renamed_2 = arg0.cfr_renamed_1295();
        sprayf2.cfr_renamed_1 = sprayf2.cfr_renamed_0.cfr_renamed_284().cfr_renamed_1146();
        sprayf2.cfr_renamed_4 = sprayf2.cfr_renamed_0.cfr_renamed_284().cfr_renamed_2112();
        sprayf2.cfr_renamed_3 = sprayf2.cfr_renamed_0.cfr_renamed_284().cfr_renamed_1997();
    }
}

