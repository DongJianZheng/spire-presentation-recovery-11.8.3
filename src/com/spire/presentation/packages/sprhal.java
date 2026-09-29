/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprhal
extends FilterInputStream {
    public sprgf cfr_renamed_4;

    public sprgf cfr_renamed_580() {
        return this.cfr_renamed_4;
    }

    @Override
    public int read() throws IOException {
        int n = this.in.read();
        if (n >= 0) {
            this.cfr_renamed_4.cfr_renamed_1221((byte)n);
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprhal(InputStream inputStream, sprgf sprgf2) {
        super((InputStream)arg0);
        void arg0;
        this.cfr_renamed_4 = sprgf2;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        int n = this.in.read(arg0, arg1, arg2);
        if (n > 0) {
            this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, n);
        }
        return n;
    }
}

