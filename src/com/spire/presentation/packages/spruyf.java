/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbdg;
import com.spire.presentation.packages.sprgvf;
import com.spire.presentation.packages.sprhdg;
import com.spire.presentation.packages.sproh;
import com.spire.presentation.packages.sprtdg;

public class spruyf
implements sproh {
    private sprbdg cfr_renamed_3;
    private sprhdg cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_5685(byte[] arg0) {
        spruyf spruyf2 = this;
        byte[] byArray = new byte[spruyf2.cfr_renamed_3.cfr_renamed_6092()];
        spruyf2.cfr_renamed_3.cfr_renamed_6791(byArray, arg0, ((sprtdg)this.cfr_renamed_4).cfr_renamed_1369());
        return byArray;
    }

    private /* synthetic */ void cfr_renamed_6792(sprgvf arg0) {
        this.cfr_renamed_3 = arg0.cfr_renamed_143();
    }

    @Override
    public int cfr_renamed_5687() {
        return this.cfr_renamed_3.cfr_renamed_6096();
    }

    public spruyf(sprhdg arg0) {
        spruyf spruyf2 = this;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_6792(spruyf2.cfr_renamed_4.cfr_renamed_284());
    }
}

