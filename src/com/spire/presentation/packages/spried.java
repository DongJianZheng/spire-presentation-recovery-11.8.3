/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprded;
import com.spire.presentation.packages.sprlhd;
import com.spire.presentation.packages.sprned;

public class spried
extends sprded {
    @Override
    public byte[] cfr_renamed_2405() {
        byte[] byArray = new byte[this.cfr_renamed_3];
        do {
            this.cfr_renamed_4.nextBytes(byArray);
            sprlhd.cfr_renamed_1520(byArray);
        } while (sprlhd.cfr_renamed_3379(byArray, 0, byArray.length));
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1222(sprccb sprccb2) {
        void arg0;
        this.cfr_renamed_4 = arg0.cfr_renamed_1295();
        this.cfr_renamed_3 = (sprccb2.cfr_renamed_3483() + 7) / 8;
        if (this.cfr_renamed_3 == 0 || this.cfr_renamed_3 == 21) {
            this.cfr_renamed_3 = 24;
            return;
        }
        if (this.cfr_renamed_3 == 14) {
            this.cfr_renamed_3 = 16;
            return;
        }
        if (this.cfr_renamed_3 != 24 && this.cfr_renamed_3 != 16) {
            throw new IllegalArgumentException(sprned.cfr_renamed_9("\u0005^\u0012~%~ap$bav4h5;#~a*x)at3;p)y;#r5haw.u&5"));
        }
    }
}

