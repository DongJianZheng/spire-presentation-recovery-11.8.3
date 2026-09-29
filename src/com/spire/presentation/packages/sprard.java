/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprql;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvi;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprard
implements sprql,
sprvi {
    private final byte[] cfr_renamed_3;
    private final sprtzd cfr_renamed_4;

    @Override
    public InputStream cfr_renamed_2920() {
        return new ByteArrayInputStream(this.cfr_renamed_3);
    }

    @Override
    public void cfr_renamed_624(OutputStream arg0) throws IOException, sprlqd {
        arg0.write(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprard(byte[] byArray) {
        this(new sprtzd(sprgl.cfr_renamed_152.cfr_renamed_19()), (byte[])arg0);
        void arg0;
    }

    @Override
    public sprtzd cfr_renamed_696() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprard(sprtzd sprtzd2, byte[] byArray) {
        void arg0;
        sprard sprard2 = this;
        sprard2.cfr_renamed_4 = arg0;
        sprard2.cfr_renamed_3 = byArray;
    }

    @Override
    public Object cfr_renamed_480() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_3);
    }
}

