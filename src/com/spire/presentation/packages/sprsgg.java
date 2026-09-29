/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprblg;
import com.spire.presentation.packages.sprcqg;
import com.spire.presentation.packages.sprdgg;
import com.spire.presentation.packages.sprfhg;
import com.spire.presentation.packages.sproh;

public class sprsgg
implements sproh {
    private sprblg cfr_renamed_3;
    private sprdgg cfr_renamed_4;

    @Override
    public int cfr_renamed_5687() {
        return this.cfr_renamed_3.cfr_renamed_6096();
    }

    public byte[] cfr_renamed_7154(byte[] arg0, int arg1) {
        byte[] byArray = new byte[arg1 / 8];
        this.cfr_renamed_3.cfr_renamed_6791(byArray, arg0, ((sprfhg)this.cfr_renamed_4).cfr_renamed_1369());
        return byArray;
    }

    public sprsgg(sprfhg arg0) {
        sprsgg sprsgg2 = this;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_7155(sprsgg2.cfr_renamed_4.cfr_renamed_284());
    }

    private /* synthetic */ void cfr_renamed_7155(sprcqg arg0) {
        this.cfr_renamed_3 = arg0.cfr_renamed_143();
        sprfhg sprfhg2 = (sprfhg)this.cfr_renamed_4;
        if (sprfhg2.cfr_renamed_1369().length < this.cfr_renamed_3.cfr_renamed_6093()) {
            sprsgg sprsgg2 = this;
            sprsgg2.cfr_renamed_4 = new sprfhg(sprfhg2.cfr_renamed_284(), this.cfr_renamed_3.cfr_renamed_7156(sprfhg2.cfr_renamed_1369()));
        }
    }

    @Override
    public byte[] cfr_renamed_5685(byte[] byArray) {
        sprsgg sprsgg2 = this;
        return sprsgg2.cfr_renamed_7154(byArray, sprsgg2.cfr_renamed_3.cfr_renamed_7153());
    }
}

