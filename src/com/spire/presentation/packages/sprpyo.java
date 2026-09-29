/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruyo;
import com.spire.presentation.packages.sprwpo;
import com.spire.presentation.packages.spryap;

@sprtea
public class sprpyo
extends spryap {
    private int cfr_renamed_96;
    private int cfr_renamed_137;

    @Override
    public boolean cfr_renamed_18404() {
        return this.cfr_renamed_96 == 3 && this.cfr_renamed_137 == 0;
    }

    @Override
    public sprwpo[] cfr_renamed_18627() {
        sprwpo[] sprwpoArray = new sprwpo[1];
        sprpyo sprpyo2 = this;
        sprpyo sprpyo3 = this;
        sprwpoArray[0] = new spruyo(sprpyo2.cfr_renamed_96, sprpyo2.cfr_renamed_137, (sprdsp)sprpyo3.cfr_renamed_137, sprpyo3.cfr_renamed_2);
        return sprwpoArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprpyo(sprdsp sprdsp2, int n, int n2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        sprpyo sprpyo2 = this;
        super((sprdsp)arg0, (int)arg1);
        sprpyo2.cfr_renamed_96 = arg2;
        sprpyo2.cfr_renamed_137 = n3;
    }
}

