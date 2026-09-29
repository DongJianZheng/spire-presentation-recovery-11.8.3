/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazm;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class sprozm
extends sprazm {
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprozm(InputStream inputStream, int n) throws IOException {
        void arg1;
        void arg0;
        sprozm sprozm2 = this;
        super((InputStream)arg0, (int)arg1);
        sprozm2.cfr_renamed_3 = false;
        sprozm2.cfr_renamed_1 = true;
        this.cfr_renamed_4 = arg0.read();
        this.cfr_renamed_2 = inputStream.read();
        if (this.cfr_renamed_2 < 0) {
            throw new EOFException();
        }
        this.cfr_renamed_4638();
    }

    @Override
    public int read() throws IOException {
        if (this.cfr_renamed_4638()) {
            return -1;
        }
        int n = this.cfr_renamed_3.read();
        if (n < 0) {
            throw new EOFException();
        }
        sprozm sprozm2 = this;
        int n2 = sprozm2.cfr_renamed_4;
        sprozm2.cfr_renamed_4 = sprozm2.cfr_renamed_2;
        sprozm2.cfr_renamed_2 = n;
        return n2;
    }

    private /* synthetic */ boolean cfr_renamed_4638() {
        if (!this.cfr_renamed_3 && this.cfr_renamed_1 && this.cfr_renamed_4 == 0 && this.cfr_renamed_2 == 0) {
            this.cfr_renamed_3 = true;
            this.cfr_renamed_4609(true);
        }
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_4610(boolean arg0) {
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_4638();
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.cfr_renamed_1 || arg2 < 3) {
            return super.read(arg0, arg1, arg2);
        }
        if (this.cfr_renamed_3) {
            return -1;
        }
        int n = this.cfr_renamed_3.read(arg0, arg1 + 2, arg2 - 2);
        if (n < 0) {
            throw new EOFException();
        }
        int n2 = arg1;
        arg0[n2] = (byte)this.cfr_renamed_4;
        arg0[n2 + 1] = (byte)this.cfr_renamed_2;
        sprozm sprozm2 = this;
        sprozm2.cfr_renamed_4 = sprozm2.cfr_renamed_3.read();
        sprozm2.cfr_renamed_2 = sprozm2.cfr_renamed_3.read();
        if (sprozm2.cfr_renamed_2 < 0) {
            throw new EOFException();
        }
        return n + 2;
    }
}

