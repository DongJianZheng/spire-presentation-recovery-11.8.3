/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprwjd
extends FilterInputStream {
    public sprlc cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwjd(InputStream inputStream, sprlc sprlc2) {
        super((InputStream)arg0);
        void arg0;
        this.cfr_renamed_4 = sprlc2;
    }

    @Override
    public int read() throws IOException {
        int n = this.in.read();
        if (n >= 0) {
            this.cfr_renamed_4.cfr_renamed_1221((byte)n);
        }
        return n;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        int n = this.in.read(arg0, arg1, arg2);
        if (n > 0) {
            this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, n);
        }
        return n;
    }

    public sprlc cfr_renamed_580() {
        return this.cfr_renamed_4;
    }
}

