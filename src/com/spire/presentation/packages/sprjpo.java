/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprplo;
import com.spire.presentation.packages.sprrt;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprjpo
implements sprrt {
    private sprplo[] cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public int cfr_renamed_324() {
        return 10;
    }

    @sprtea
    public sprplo[] cfr_renamed_16255() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_16242(sprhio sprhio2) {
        int n;
        void arg0;
        sprjpo sprjpo2 = this;
        sprjpo2.cfr_renamed_4 = arg0.cfr_renamed_12261();
        sprhio2.cfr_renamed_12254();
        int n2 = arg0.cfr_renamed_12254();
        sprjpo2.cfr_renamed_3 = new sprplo[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            this.cfr_renamed_3[n++] = new sprplo(arg0.cfr_renamed_12261());
            n3 = n;
        }
    }

    @Override
    public void cfr_renamed_16244(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public int cfr_renamed_12977() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprjpo() {
    }
}

