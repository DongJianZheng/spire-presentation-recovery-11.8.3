/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprta;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprkhd
extends FilterInputStream {
    public sprta cfr_renamed_4;

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        int n = this.in.read(arg0, arg1, arg2);
        if (n > 0) {
            this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, n);
        }
        return n;
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
    public sprkhd(InputStream inputStream, sprta sprta2) {
        super((InputStream)arg0);
        void arg0;
        this.cfr_renamed_4 = sprta2;
    }

    public sprta cfr_renamed_3489() {
        return this.cfr_renamed_4;
    }
}

