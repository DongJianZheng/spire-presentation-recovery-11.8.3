/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprbuc {
    public long cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public long cfr_renamed_3092() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprbuc(long l, byte[] byArray) {
        void arg0;
        sprbuc sprbuc2 = this;
        sprbuc2.cfr_renamed_3 = arg0;
        sprbuc2.cfr_renamed_4 = byArray;
    }

    public byte[] cfr_renamed_3093() {
        return this.cfr_renamed_4;
    }

    public static sprbuc cfr_renamed_2661(InputStream arg0) throws IOException {
        InputStream inputStream = arg0;
        long l = sprzsc.cfr_renamed_2731(inputStream);
        byte[] byArray = sprzsc.cfr_renamed_2629(inputStream);
        return new sprbuc(l, byArray);
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        sprbuc sprbuc2 = this;
        sprzsc.cfr_renamed_2735(sprbuc2.cfr_renamed_3, arg0);
        sprzsc.cfr_renamed_2624(sprbuc2.cfr_renamed_4, arg0);
    }
}

