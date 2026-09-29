/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmc;
import com.spire.presentation.packages.sprnwc;
import com.spire.presentation.packages.sprrfz;
import com.spire.presentation.packages.spruqd;

public class sprwtc {
    private final sprnwc cfr_renamed_1;
    private final int cfr_renamed_2;
    private final sprmc cfr_renamed_3;
    private long cfr_renamed_4;

    public long cfr_renamed_3150() {
        return this.cfr_renamed_4++;
    }

    public int cfr_renamed_3149() {
        return this.cfr_renamed_2;
    }

    public long cfr_renamed_3159() {
        return this.cfr_renamed_4;
    }

    public sprmc cfr_renamed_2471() {
        return this.cfr_renamed_3;
    }

    public sprnwc cfr_renamed_3160() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprwtc(int n, sprmc sprmc2) {
        void arg0;
        void arg1;
        sprwtc sprwtc2 = this;
        sprwtc sprwtc3 = this;
        sprwtc2.cfr_renamed_1 = new sprnwc();
        sprwtc2.cfr_renamed_4 = 0L;
        if (n < 0) {
            throw new IllegalArgumentException(sprrfz.cfr_renamed_9("\u001f\u0007H\r[\n\u001fBU\u0017K\u0016\u0018\u0000]B\u0006_\u0018R"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(spruqd.cfr_renamed_9("z\u000f4\u001c5\t/K}\u000f<\u00023\u0003)L?\t}\u0002(\u00001"));
        }
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_3 = arg1;
    }
}

