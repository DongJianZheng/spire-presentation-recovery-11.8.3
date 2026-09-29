/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfag;
import com.spire.presentation.packages.sprfyf;
import com.spire.presentation.packages.sproh;
import com.spire.presentation.packages.sprrbg;
import com.spire.presentation.packages.sprxuf;

public class sprotf
implements sproh {
    private sprfag cfr_renamed_3;
    private sprfyf cfr_renamed_4;

    @Override
    public int cfr_renamed_5687() {
        return this.cfr_renamed_4.cfr_renamed_6096();
    }

    private /* synthetic */ void cfr_renamed_6098(sprxuf arg0) {
        this.cfr_renamed_4 = arg0.cfr_renamed_143();
    }

    public sprotf(sprfag arg0) {
        sprotf sprotf2 = this;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_6098(sprotf2.cfr_renamed_3.cfr_renamed_284());
    }

    @Override
    public byte[] cfr_renamed_5685(byte[] arg0) {
        sprotf sprotf2 = this;
        byte[] byArray = new byte[sprotf2.cfr_renamed_4.cfr_renamed_6092()];
        sprotf2.cfr_renamed_4.cfr_renamed_6099(byArray, arg0, ((sprrbg)this.cfr_renamed_3).cfr_renamed_1369());
        return byArray;
    }
}

