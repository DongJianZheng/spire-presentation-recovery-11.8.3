/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhbh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpwe;
import com.spire.presentation.packages.spryye;

public final class sprybf
extends spryye {
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_3880() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprybf(int n, byte[] byArray) {
        super(true);
        void arg1;
        void arg0;
        if (byArray.length != sprpwe.cfr_renamed_5546((int)arg0)) {
            throw new IllegalArgumentException(sprhbh.cfr_renamed_9("eMzB`Jh\u0003gFu\u0003\u007fJvF,EcQ,Pi@yQeWu\u0003oBxFkL~Z"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg1);
    }

    public int cfr_renamed_5538() {
        return this.cfr_renamed_3;
    }
}

