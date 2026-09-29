/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprvm;
import java.io.IOException;
import java.io.OutputStream;

public class sprexg
extends OutputStream {
    private sprvm cfr_renamed_4;

    @Override
    public void write(byte[] arg0) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, 0, arg0.length);
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1221((byte)arg0);
    }

    public sprexg(sprvm sprvm2) {
        this.cfr_renamed_4 = sprvm2;
    }
}

