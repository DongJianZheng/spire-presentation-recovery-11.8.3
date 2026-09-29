/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import java.io.IOException;
import java.io.OutputStream;

public class sprbqg
extends OutputStream {
    private final byte[] cfr_renamed_2;
    private final OutputStream cfr_renamed_3;
    public int cfr_renamed_4;

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        int n;
        if (arg2 >= this.cfr_renamed_2.length) {
            sprbqg sprbqg2 = this;
            sprbqg2.cfr_renamed_3.write(this.cfr_renamed_2, 0, this.cfr_renamed_4);
            this.cfr_renamed_4 = sprbqg2.cfr_renamed_2.length;
            System.arraycopy(arg0, arg1 + arg2 - this.cfr_renamed_2.length, this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
            this.cfr_renamed_3.write(arg0, arg1, arg2 - this.cfr_renamed_2.length);
            return;
        }
        int n2 = n = 0;
        while (n2 != arg2) {
            int n3 = arg1 + n;
            this.write(arg0[n3]);
            n2 = ++n;
        }
    }

    public byte[] cfr_renamed_1472() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprbqg(OutputStream outputStream, int n) {
        void arg0;
        sprbqg sprbqg2 = this;
        this.cfr_renamed_4 = 0;
        sprbqg2.cfr_renamed_3 = arg0;
        sprbqg2.cfr_renamed_2 = new byte[n];
    }

    @Override
    public void write(int arg0) throws IOException {
        sprbqg sprbqg2 = this;
        if (sprbqg2.cfr_renamed_4 == sprbqg2.cfr_renamed_2.length) {
            sprbqg sprbqg3 = this;
            byte by = sprbqg3.cfr_renamed_2[0];
            System.arraycopy(sprbqg3.cfr_renamed_2, 1, this.cfr_renamed_2, 0, this.cfr_renamed_2.length - 1);
            sprbqg sprbqg4 = this;
            sprbqg4.cfr_renamed_2[sprbqg4.cfr_renamed_2.length - 1] = (byte)arg0;
            this.cfr_renamed_3.write(by);
            return;
        }
        this.cfr_renamed_2[this.cfr_renamed_4++] = (byte)arg0;
    }
}

