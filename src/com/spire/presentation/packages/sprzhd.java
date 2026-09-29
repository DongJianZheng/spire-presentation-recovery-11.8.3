/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spruc;
import java.io.IOException;
import java.io.OutputStream;

public class sprzhd
extends OutputStream {
    public spruc cfr_renamed_4;

    public byte[] cfr_renamed_1472() {
        sprzhd sprzhd2 = this;
        byte[] byArray = new byte[sprzhd2.cfr_renamed_4.cfr_renamed_2404()];
        sprzhd2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1221((byte)arg0);
    }

    public sprzhd(spruc spruc2) {
        this.cfr_renamed_4 = spruc2;
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }
}

