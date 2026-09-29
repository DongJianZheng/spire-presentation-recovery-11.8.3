/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;
import java.io.OutputStream;

public class spruva
extends OutputStream {
    private OutputStream cfr_renamed_3;
    private OutputStream cfr_renamed_4;

    @Override
    public void close() throws IOException {
        spruva spruva2 = this;
        spruva2.cfr_renamed_3.close();
        spruva2.cfr_renamed_4.close();
    }

    @Override
    public void flush() throws IOException {
        spruva spruva2 = this;
        spruva2.cfr_renamed_3.flush();
        spruva2.cfr_renamed_4.flush();
    }

    @Override
    public void write(int arg0) throws IOException {
        spruva spruva2 = this;
        spruva2.cfr_renamed_3.write(arg0);
        spruva2.cfr_renamed_4.write(arg0);
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        spruva spruva2 = this;
        spruva2.cfr_renamed_3.write(arg0, arg1, arg2);
        spruva2.cfr_renamed_4.write(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public spruva(OutputStream outputStream, OutputStream outputStream2) {
        void arg0;
        spruva spruva2 = this;
        spruva2.cfr_renamed_3 = arg0;
        spruva2.cfr_renamed_4 = outputStream2;
    }

    @Override
    public void write(byte[] arg0) throws IOException {
        spruva spruva2 = this;
        spruva2.cfr_renamed_3.write(arg0);
        spruva2.cfr_renamed_4.write(arg0);
    }
}

