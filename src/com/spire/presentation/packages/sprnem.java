/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprzcm;
import java.io.IOException;

public class sprnem
extends sprzcm {
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        arg0.cfr_renamed_11082(19, this.cfr_renamed_4, false);
    }

    public sprnem(sprmam sprmam2) throws IOException {
        sprnem sprnem2 = this;
        sprnem2.cfr_renamed_4 = new byte[20];
        sprmam2.cfr_renamed_4932(sprnem2.cfr_renamed_4);
    }

    public byte[] cfr_renamed_580() {
        byte[] byArray = new byte[this.cfr_renamed_4.length];
        System.arraycopy(this.cfr_renamed_4, 0, byArray, 0, byArray.length);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprnem(byte[] byArray) throws IOException {
        void arg0;
        this.cfr_renamed_4 = new byte[byArray.length];
        System.arraycopy(arg0, 0, this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
    }
}

