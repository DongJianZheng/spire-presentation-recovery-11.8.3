/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.io.OutputStream;

public class sprzla
extends OutputStream {
    private final byte[] cfr_renamed_2;
    private final OutputStream cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < this.cfr_renamed_2.length - this.cfr_renamed_4) {
            sprzla sprzla2 = this;
            System.arraycopy(arg0, arg1, sprzla2.cfr_renamed_2, this.cfr_renamed_4, arg2);
            sprzla2.cfr_renamed_4 += arg2;
            return;
        }
        int n = this.cfr_renamed_2.length - this.cfr_renamed_4;
        int n2 = arg1;
        sprzla sprzla3 = this;
        System.arraycopy(arg0, n2, sprzla3.cfr_renamed_2, this.cfr_renamed_4, n);
        sprzla3.cfr_renamed_4 += n;
        this.flush();
        arg1 = n2 + n;
        int n3 = arg2 = arg2 - n;
        while (n3 >= this.cfr_renamed_2.length) {
            this.cfr_renamed_3.write(arg0, arg1, this.cfr_renamed_2.length);
            arg1 += this.cfr_renamed_2.length;
            n3 = arg2 - this.cfr_renamed_2.length;
        }
        if (arg2 > 0) {
            sprzla sprzla4 = this;
            System.arraycopy(arg0, arg1, sprzla4.cfr_renamed_2, this.cfr_renamed_4, arg2);
            sprzla4.cfr_renamed_4 += arg2;
        }
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_2[this.cfr_renamed_4++] = (byte)arg0;
        sprzla sprzla2 = this;
        if (sprzla2.cfr_renamed_4 == sprzla2.cfr_renamed_2.length) {
            this.flush();
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprzla(OutputStream outputStream) {
        void arg0;
        sprzla sprzla2 = this;
        sprzla2.cfr_renamed_3 = arg0;
        sprzla2.cfr_renamed_2 = new byte[4096];
    }

    @Override
    public void flush() throws IOException {
        sprzla sprzla2 = this;
        sprzla2.cfr_renamed_3.write(this.cfr_renamed_2, 0, this.cfr_renamed_4);
        sprzla2.cfr_renamed_4 = 0;
        sprzra.cfr_renamed_492(sprzla2.cfr_renamed_2, (byte)0);
    }

    /*
     * WARNING - void declaration
     */
    public sprzla(OutputStream outputStream, int n) {
        void arg0;
        sprzla sprzla2 = this;
        sprzla2.cfr_renamed_3 = arg0;
        sprzla2.cfr_renamed_2 = new byte[n];
    }

    @Override
    public void close() throws IOException {
        sprzla sprzla2 = this;
        sprzla2.flush();
        sprzla2.cfr_renamed_3.close();
    }
}

