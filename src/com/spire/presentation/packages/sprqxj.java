/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Mac;

public class sprqxj
extends OutputStream {
    private Mac cfr_renamed_4;

    @Override
    public void write(byte[] arg0) throws IOException {
        this.cfr_renamed_4.update(arg0);
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.update(arg0, arg1, arg2);
    }

    public sprqxj(Mac mac) {
        this.cfr_renamed_4 = mac;
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_4.update((byte)arg0);
    }
}

