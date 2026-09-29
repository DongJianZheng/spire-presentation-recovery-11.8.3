/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;

@sprtea
public abstract class sprwpo {
    private sprdsp cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_18634() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_18480() {
        sprpdja sprpdja2 = new sprpdja();
        try {
            sprruo sprruo2 = new sprruo(sprpdja2);
            this.cfr_renamed_18252(sprruo2);
            byte[] byArray = sprpdja2.cfr_renamed_4529();
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    public sprdsp cfr_renamed_18631() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwpo(int n, int n2, sprdsp sprdsp2) {
        void arg1;
        void arg0;
        sprwpo sprwpo2 = this;
        this.cfr_renamed_3 = arg0;
        sprwpo2.cfr_renamed_4 = arg1;
        sprwpo2.cfr_renamed_2 = sprdsp2;
    }

    public int cfr_renamed_18635() {
        return this.cfr_renamed_4;
    }

    public abstract void cfr_renamed_18252(sprruo var1);
}

