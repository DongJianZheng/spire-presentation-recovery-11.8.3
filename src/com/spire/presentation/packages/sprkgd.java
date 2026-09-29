/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import java.io.IOException;
import java.io.OutputStream;

public class sprkgd
extends OutputStream {
    public sprlc cfr_renamed_4;

    @Override
    public void write(int arg0) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1221((byte)arg0);
    }

    public sprkgd(sprlc sprlc2) {
        this.cfr_renamed_4 = sprlc2;
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public byte[] cfr_renamed_580() {
        sprkgd sprkgd2 = this;
        byte[] byArray = new byte[sprkgd2.cfr_renamed_4.cfr_renamed_1218()];
        sprkgd2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        return byArray;
    }
}

