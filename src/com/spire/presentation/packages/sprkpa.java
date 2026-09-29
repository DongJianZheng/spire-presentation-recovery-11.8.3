/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprkpa
extends InputStream {
    private final OutputStream cfr_renamed_3;
    private final InputStream cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprkpa(InputStream inputStream, OutputStream outputStream) {
        void arg0;
        sprkpa sprkpa2 = this;
        sprkpa2.cfr_renamed_4 = arg0;
        sprkpa2.cfr_renamed_3 = outputStream;
    }

    public OutputStream cfr_renamed_470() {
        return this.cfr_renamed_3;
    }

    @Override
    public void close() throws IOException {
        sprkpa sprkpa2 = this;
        sprkpa2.cfr_renamed_4.close();
        sprkpa2.cfr_renamed_3.close();
    }

    @Override
    public int read() throws IOException {
        int n = this.cfr_renamed_4.read();
        if (n >= 0) {
            this.cfr_renamed_3.write(n);
        }
        return n;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        int n = this.cfr_renamed_4.read(arg0, arg1, arg2);
        if (n > 0) {
            this.cfr_renamed_3.write(arg0, arg1, n);
        }
        return n;
    }

    @Override
    public int read(byte[] arg0) throws IOException {
        return this.read(arg0, 0, arg0.length);
    }
}

