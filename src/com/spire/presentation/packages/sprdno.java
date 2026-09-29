/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprifp;
import com.spire.presentation.packages.sprigp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryw;

@sprtea
public class sprdno
implements spryw {
    private sprfzo cfr_renamed_2;
    private sprifp cfr_renamed_3;
    private static sprdno cfr_renamed_4 = new sprdno();

    @Override
    public sprhhp cfr_renamed_16789(String arg0, float arg1, int arg2, int arg3, boolean arg4) {
        return new sprhhp(arg1, arg2, this.cfr_renamed_2);
    }

    @Override
    public sprifp cfr_renamed_16790() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprfzo cfr_renamed_16270(String arg0, int arg1) {
        return this.cfr_renamed_2;
    }

    @Override
    public sprhhp cfr_renamed_14804(String arg0, float arg1, int arg2) {
        return new sprhhp(arg1, arg2, this.cfr_renamed_2);
    }

    public static sprdno cfr_renamed_13694() {
        return cfr_renamed_4;
    }

    @Override
    public sprfzo cfr_renamed_16269(String arg0, int arg1) {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ sprdno() {
        sprdno sprdno2 = this;
        this.cfr_renamed_3 = new sprifp(this);
        sprdno2.cfr_renamed_2 = sprigp.cfr_renamed_16791().cfr_renamed_16792("Arial", 0);
    }
}

