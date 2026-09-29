/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprayo;
import com.spire.presentation.packages.sprgyo;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;

@sprtea
public abstract class sprgxo {
    public short cfr_renamed_0;
    public short cfr_renamed_1;
    public short cfr_renamed_2;
    public short cfr_renamed_3;
    public short cfr_renamed_4;

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_1 == 0;
    }

    public static sprgxo cfr_renamed_15088(sprmzo arg0) {
        sprmzo sprmzo2 = arg0;
        short s = sprmzo2.cfr_renamed_12254();
        sprmzo2.cfr_renamed_14060().cfr_renamed_11548(arg0.cfr_renamed_14060().cfr_renamed_3274() - 2L);
        if (s < 0) {
            return sprgyo.cfr_renamed_18598(arg0);
        }
        return sprayo.cfr_renamed_18571(arg0);
    }

    public void cfr_renamed_18252(sprruo arg0) {
        this.cfr_renamed_18599(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_18599(sprruo sprruo2) {
        void arg0;
        void v0 = arg0;
        sprgxo sprgxo2 = this;
        void v2 = arg0;
        v2.cfr_renamed_14639(this.cfr_renamed_1);
        v2.cfr_renamed_14639(this.cfr_renamed_4);
        arg0.cfr_renamed_14639(sprgxo2.cfr_renamed_3);
        v0.cfr_renamed_14639(sprgxo2.cfr_renamed_0);
        v0.cfr_renamed_14639(this.cfr_renamed_2);
    }
}

