/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgqe;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class sprxre
extends sprgqe {
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ boolean cfr_renamed_4638() {
        if (!this.cfr_renamed_4 && this.cfr_renamed_3 && this.cfr_renamed_2 == 0 && this.cfr_renamed_1 == 0) {
            this.cfr_renamed_4 = true;
            this.cfr_renamed_4609(true);
        }
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprxre(InputStream inputStream, int n) throws IOException {
        void arg1;
        void arg0;
        sprxre sprxre2 = this;
        super((InputStream)arg0, (int)arg1);
        sprxre2.cfr_renamed_4 = false;
        sprxre2.cfr_renamed_3 = true;
        this.cfr_renamed_2 = arg0.read();
        this.cfr_renamed_1 = inputStream.read();
        if (this.cfr_renamed_1 < 0) {
            throw new EOFException();
        }
        this.cfr_renamed_4638();
    }

    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.cfr_renamed_3 || arg2 < 3) {
            return super.read(arg0, arg1, arg2);
        }
        if (this.cfr_renamed_4) {
            return -1;
        }
        int n = this.cfr_renamed_4.read(arg0, arg1 + 2, arg2 - 2);
        if (n < 0) {
            throw new EOFException();
        }
        int n2 = arg1;
        arg0[n2] = (byte)this.cfr_renamed_2;
        arg0[n2 + 1] = (byte)this.cfr_renamed_1;
        sprxre sprxre2 = this;
        sprxre2.cfr_renamed_2 = sprxre2.cfr_renamed_4.read();
        sprxre2.cfr_renamed_1 = sprxre2.cfr_renamed_4.read();
        if (sprxre2.cfr_renamed_1 < 0) {
            throw new EOFException();
        }
        return n + 2;
    }

    @Override
    public int read() throws IOException {
        if (this.cfr_renamed_4638()) {
            return -1;
        }
        int n = this.cfr_renamed_4.read();
        if (n < 0) {
            throw new EOFException();
        }
        sprxre sprxre2 = this;
        int n2 = sprxre2.cfr_renamed_2;
        sprxre2.cfr_renamed_2 = sprxre2.cfr_renamed_1;
        sprxre2.cfr_renamed_1 = n;
        return n2;
    }

    public void cfr_renamed_4610(boolean arg0) {
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4638();
    }
}

