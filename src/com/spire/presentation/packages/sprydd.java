/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprta;
import java.io.IOException;
import java.io.OutputStream;

public class sprydd
extends OutputStream {
    public sprta cfr_renamed_4;

    public sprta cfr_renamed_3489() {
        return this.cfr_renamed_4;
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public sprydd(sprta sprta2) {
        this.cfr_renamed_4 = sprta2;
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1221((byte)arg0);
    }
}

