/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkxc;
import java.io.IOException;
import java.io.OutputStream;

public class sprfwc
extends OutputStream {
    private sprkxc cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void close() throws IOException {
        this.cfr_renamed_3.cfr_renamed_2637();
    }

    @Override
    public void flush() throws IOException {
        this.cfr_renamed_3.cfr_renamed_2947();
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_3.cfr_renamed_2916(arg0, arg1, arg2);
    }

    public sprfwc(sprkxc sprkxc2) {
        sprfwc sprfwc2 = this;
        sprfwc2.cfr_renamed_4 = new byte[1];
        sprfwc2.cfr_renamed_3 = sprkxc2;
    }

    @Override
    public void write(int arg0) throws IOException {
        sprfwc sprfwc2 = this;
        sprfwc2.cfr_renamed_4[0] = (byte)arg0;
        sprfwc2.write(sprfwc2.cfr_renamed_4, 0, 1);
    }
}

