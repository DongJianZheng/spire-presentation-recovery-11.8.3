/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmod;
import com.spire.presentation.packages.sprtzd;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprhvd {
    private static final int cfr_renamed_2 = 32768;
    private final InputStream cfr_renamed_3;
    private final sprtzd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhvd(sprtzd sprtzd2, InputStream inputStream, int n) {
        void arg2;
        void arg1;
        this.cfr_renamed_4 = sprtzd2;
        sprhvd sprhvd2 = this;
        this.cfr_renamed_3 = new sprmod(new BufferedInputStream((InputStream)arg1, (int)arg2));
    }

    public sprtzd cfr_renamed_696() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprhvd(String string, InputStream inputStream, int n) {
        this(new sprtzd((String)arg0), (InputStream)arg1, (int)arg2);
        void arg2;
        void arg1;
        void arg0;
    }

    public sprhvd(sprtzd arg0, InputStream arg1) {
        this(arg0, arg1, 32768);
    }

    public InputStream cfr_renamed_4004() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprhvd(String string, InputStream inputStream) {
        this(new sprtzd((String)arg0), (InputStream)arg1, 32768);
        void arg1;
        void arg0;
    }

    public sprhvd(InputStream arg0) {
        this(sprm.cfr_renamed_1223.cfr_renamed_19(), arg0, 32768);
    }

    public void cfr_renamed_4117() throws IOException {
        sprhvd sprhvd2 = this;
        sprbsa.cfr_renamed_477(sprhvd2.cfr_renamed_3);
        sprhvd2.cfr_renamed_3.close();
    }
}

