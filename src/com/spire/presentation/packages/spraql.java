/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprku;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsv;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class spraql
implements sprsv,
sprku {
    private final byte[] cfr_renamed_3;
    private final sprlem cfr_renamed_4;

    @Override
    public InputStream cfr_renamed_2920() {
        return new ByteArrayInputStream(this.cfr_renamed_3);
    }

    @Override
    public void cfr_renamed_624(OutputStream arg0) throws IOException, sprlyl {
        arg0.write(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public spraql(sprlem sprlem2, byte[] byArray) {
        void arg0;
        spraql spraql2 = this;
        spraql2.cfr_renamed_4 = arg0;
        spraql2.cfr_renamed_3 = byArray;
    }

    @Override
    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_4;
    }

    @Override
    public Object cfr_renamed_480() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public spraql(byte[] arg0) {
        this(sprgz.cfr_renamed_3, arg0);
    }
}

