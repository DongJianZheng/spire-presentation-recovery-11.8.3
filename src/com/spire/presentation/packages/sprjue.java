/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import java.io.IOException;
import java.io.OutputStream;

public class sprjue
extends OutputStream {
    private final OutputStream cfr_renamed_2;
    private int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    @Override
    public void close() throws IOException {
        sprjue sprjue2 = this;
        sprjue2.flush();
        sprjue2.cfr_renamed_2.close();
    }

    /*
     * WARNING - void declaration
     */
    public sprjue(OutputStream outputStream, int n) {
        void arg0;
        sprjue sprjue2 = this;
        sprjue2.cfr_renamed_2 = arg0;
        sprjue2.cfr_renamed_4 = new byte[n];
    }

    @Override
    public void flush() throws IOException {
        sprjue sprjue2 = this;
        sprjue2.cfr_renamed_2.write(this.cfr_renamed_4, 0, this.cfr_renamed_3);
        sprjue2.cfr_renamed_3 = 0;
        sproze.cfr_renamed_492(sprjue2.cfr_renamed_4, (byte)0);
    }

    /*
     * WARNING - void declaration
     */
    public sprjue(OutputStream outputStream) {
        void arg0;
        sprjue sprjue2 = this;
        sprjue2.cfr_renamed_2 = arg0;
        sprjue2.cfr_renamed_4 = new byte[4096];
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_4[this.cfr_renamed_3++] = (byte)arg0;
        sprjue sprjue2 = this;
        if (sprjue2.cfr_renamed_3 == sprjue2.cfr_renamed_4.length) {
            this.flush();
        }
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < this.cfr_renamed_4.length - this.cfr_renamed_3) {
            sprjue sprjue2 = this;
            System.arraycopy(arg0, arg1, sprjue2.cfr_renamed_4, this.cfr_renamed_3, arg2);
            sprjue2.cfr_renamed_3 += arg2;
            return;
        }
        int n = this.cfr_renamed_4.length - this.cfr_renamed_3;
        int n2 = arg1;
        sprjue sprjue3 = this;
        System.arraycopy(arg0, n2, sprjue3.cfr_renamed_4, this.cfr_renamed_3, n);
        sprjue3.cfr_renamed_3 += n;
        this.flush();
        arg1 = n2 + n;
        int n3 = arg2 = arg2 - n;
        while (n3 >= this.cfr_renamed_4.length) {
            this.cfr_renamed_2.write(arg0, arg1, this.cfr_renamed_4.length);
            arg1 += this.cfr_renamed_4.length;
            n3 = arg2 - this.cfr_renamed_4.length;
        }
        if (arg2 > 0) {
            sprjue sprjue4 = this;
            System.arraycopy(arg0, arg1, sprjue4.cfr_renamed_4, this.cfr_renamed_3, arg2);
            sprjue4.cfr_renamed_3 += arg2;
        }
    }
}

