/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;

public class sprinl
extends OutputStream {
    private static final byte[] cfr_renamed_3 = new byte[1];
    private Cipher cfr_renamed_4;

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.update(arg0, arg1, arg2);
    }

    public sprinl(Cipher cipher) {
        this.cfr_renamed_4 = cipher;
    }

    @Override
    public void write(int arg0) throws IOException {
        sprinl.cfr_renamed_3[0] = (byte)arg0;
        this.cfr_renamed_4.update(cfr_renamed_3, 0, 1);
    }
}

