/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;
import java.io.OutputStream;

public class sprmve
extends OutputStream {
    private OutputStream cfr_renamed_3;
    private OutputStream cfr_renamed_4;

    @Override
    public void write(int arg0) throws IOException {
        sprmve sprmve2 = this;
        sprmve2.cfr_renamed_4.write(arg0);
        sprmve2.cfr_renamed_3.write(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprmve(OutputStream outputStream, OutputStream outputStream2) {
        void arg0;
        sprmve sprmve2 = this;
        sprmve2.cfr_renamed_4 = arg0;
        sprmve2.cfr_renamed_3 = outputStream2;
    }

    @Override
    public void close() throws IOException {
        sprmve sprmve2 = this;
        sprmve2.cfr_renamed_4.close();
        sprmve2.cfr_renamed_3.close();
    }

    @Override
    public void write(byte[] arg0) throws IOException {
        sprmve sprmve2 = this;
        sprmve2.cfr_renamed_4.write(arg0);
        sprmve2.cfr_renamed_3.write(arg0);
    }

    @Override
    public void flush() throws IOException {
        sprmve sprmve2 = this;
        sprmve2.cfr_renamed_4.flush();
        sprmve2.cfr_renamed_3.flush();
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        sprmve sprmve2 = this;
        sprmve2.cfr_renamed_4.write(arg0, arg1, arg2);
        sprmve2.cfr_renamed_3.write(arg0, arg1, arg2);
    }
}

