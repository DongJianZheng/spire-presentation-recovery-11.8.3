/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprdoe
extends InputStream {
    private final InputStream cfr_renamed_3;
    private final OutputStream cfr_renamed_4;

    @Override
    public int read(byte[] arg0) throws IOException {
        return this.read(arg0, 0, arg0.length);
    }

    @Override
    public void close() throws IOException {
        sprdoe sprdoe2 = this;
        sprdoe2.cfr_renamed_3.close();
        sprdoe2.cfr_renamed_4.close();
    }

    @Override
    public int available() throws IOException {
        return this.cfr_renamed_3.available();
    }

    /*
     * WARNING - void declaration
     */
    public sprdoe(InputStream inputStream, OutputStream outputStream) {
        void arg0;
        sprdoe sprdoe2 = this;
        sprdoe2.cfr_renamed_3 = arg0;
        sprdoe2.cfr_renamed_4 = outputStream;
    }

    @Override
    public int read() throws IOException {
        int n = this.cfr_renamed_3.read();
        if (n >= 0) {
            this.cfr_renamed_4.write(n);
        }
        return n;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        int n = this.cfr_renamed_3.read(arg0, arg1, arg2);
        if (n > 0) {
            this.cfr_renamed_4.write(arg0, arg1, n);
        }
        return n;
    }

    public OutputStream cfr_renamed_470() {
        return this.cfr_renamed_4;
    }
}

