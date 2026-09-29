/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprzcm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class sprmhm
extends sprzcm {
    public byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmhm(int n) {
        void arg0;
        sprmhm sprmhm2 = this;
        sprmhm2.cfr_renamed_4 = new byte[1];
        sprmhm2.cfr_renamed_4[0] = (byte)arg0;
    }

    public byte[] cfr_renamed_7794() {
        return this.cfr_renamed_4;
    }

    public sprmhm(sprmam arg0) throws IOException {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprmam sprmam2 = arg0;
        while ((n = sprmam2.read()) >= 0) {
            sprmam2 = arg0;
            byteArrayOutputStream.write(n);
        }
        this.cfr_renamed_4 = byteArrayOutputStream.toByteArray();
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        arg0.cfr_renamed_11039(12, this.cfr_renamed_4);
    }
}

