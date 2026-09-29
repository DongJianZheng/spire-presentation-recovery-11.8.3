/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmag;
import com.spire.presentation.packages.sprnzf;
import com.spire.presentation.packages.sproh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwxf;
import com.spire.presentation.packages.spryyf;

public class sprmyf
implements sproh {
    private sprnzf cfr_renamed_3;
    private sprwxf cfr_renamed_4;

    public sprmyf(sprmag arg0) {
        sprmyf sprmyf2 = this;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_6578(sprmyf2.cfr_renamed_3.cfr_renamed_284());
    }

    @Override
    public byte[] cfr_renamed_5685(byte[] arg0) {
        sprmyf sprmyf2 = this;
        byte[] byArray = new byte[sprmyf2.cfr_renamed_4.cfr_renamed_6092()];
        byte[] byArray2 = ((sprmag)sprmyf2.cfr_renamed_3).cfr_renamed_1369();
        this.cfr_renamed_4.cfr_renamed_6579(byArray, arg0, byArray2);
        return sproze.cfr_renamed_533(byArray, 0, this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1150());
    }

    @Override
    public int cfr_renamed_5687() {
        return this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_6567() + this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_6573() + 64;
    }

    private /* synthetic */ void cfr_renamed_6578(spryyf arg0) {
        this.cfr_renamed_4 = arg0.cfr_renamed_143();
    }
}

