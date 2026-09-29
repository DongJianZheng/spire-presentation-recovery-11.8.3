/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqm;
import java.io.IOException;
import java.io.OutputStream;

public class sprzrg
extends OutputStream {
    private final OutputStream cfr_renamed_3;
    private final sprqm cfr_renamed_4;

    @Override
    public void close() throws IOException {
        this.cfr_renamed_4.cfr_renamed_2637();
    }

    @Override
    public void flush() throws IOException {
        this.cfr_renamed_3.flush();
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_3.write(arg0, arg1, arg2);
    }

    @Override
    public void write(byte[] arg0) throws IOException {
        this.cfr_renamed_3.write(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprzrg(OutputStream outputStream, sprqm sprqm2) {
        void arg0;
        sprzrg sprzrg2 = this;
        sprzrg2.cfr_renamed_3 = arg0;
        sprzrg2.cfr_renamed_4 = sprqm2;
    }

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_3.write(arg0);
    }
}

