/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreig;
import com.spire.presentation.packages.sprjgg;
import com.spire.presentation.packages.sprlpg;
import com.spire.presentation.packages.sproh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpkg;

public class sprpjg
implements sproh {
    private spreig cfr_renamed_3;
    private sprlpg cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_7223(sprjgg arg0) {
        this.cfr_renamed_3 = arg0.cfr_renamed_143();
    }

    @Override
    public byte[] cfr_renamed_5685(byte[] arg0) {
        sprpjg sprpjg2 = this;
        byte[] byArray = new byte[sprpjg2.cfr_renamed_3.cfr_renamed_6092()];
        sprpkg sprpkg2 = (sprpkg)sprpjg2.cfr_renamed_4;
        byte[] byArray2 = sproze.cfr_renamed_533(arg0, 0, sprpkg2.cfr_renamed_284().cfr_renamed_5976());
        byte[] byArray3 = sproze.cfr_renamed_533(arg0, sprpkg2.cfr_renamed_284().cfr_renamed_5976(), arg0.length);
        sprpkg sprpkg3 = sprpkg2;
        byte[] byArray4 = sprpkg3.cfr_renamed_7217();
        byte[] byArray5 = sprpkg3.cfr_renamed_7216();
        byte[] byArray6 = sprpkg3.cfr_renamed_7215();
        this.cfr_renamed_3.cfr_renamed_7224(byArray, byArray4, byArray5, byArray6, byArray2, byArray3);
        return sproze.cfr_renamed_533(byArray, 0, this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_6092() / 8);
    }

    public sprpjg(sprpkg arg0) {
        sprpjg sprpjg2 = this;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_7223(sprpjg2.cfr_renamed_4.cfr_renamed_284());
    }

    @Override
    public int cfr_renamed_5687() {
        return this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_5976() + this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_7219();
    }
}

