/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkxc;
import java.io.IOException;
import java.io.InputStream;

public class sprxbd
extends InputStream {
    private sprkxc cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void close() throws IOException {
        this.cfr_renamed_3.cfr_renamed_2637();
    }

    @Override
    public int available() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_2918();
    }

    @Override
    public int read() throws IOException {
        sprxbd sprxbd2 = this;
        if (sprxbd2.read(sprxbd2.cfr_renamed_4) < 0) {
            return -1;
        }
        return this.cfr_renamed_4[0] & 0xFF;
    }

    public sprxbd(sprkxc sprkxc2) {
        sprxbd sprxbd2 = this;
        this.cfr_renamed_4 = new byte[1];
        sprxbd2.cfr_renamed_3 = null;
        sprxbd2.cfr_renamed_3 = sprkxc2;
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        return this.cfr_renamed_3.cfr_renamed_2910(arg0, arg1, arg2);
    }
}

