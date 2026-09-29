/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprvmd;
import java.io.IOException;
import java.io.OutputStream;

public class sprexa
extends OutputStream {
    private sprta cfr_renamed_4;

    @Override
    public void write(byte[] arg0) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, 0, arg0.length);
    }

    public boolean cfr_renamed_1435(byte[] arg0) {
        return this.cfr_renamed_4.cfr_renamed_1328(arg0);
    }

    public sprexa(sprta sprta2) {
        this.cfr_renamed_4 = sprta2;
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1221((byte)arg0);
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public byte[] cfr_renamed_79() throws sprvmd {
        return this.cfr_renamed_4.cfr_renamed_1329();
    }
}

