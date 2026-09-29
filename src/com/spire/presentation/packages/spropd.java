/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprrl;
import com.spire.presentation.packages.sprugb;
import com.spire.presentation.packages.sprvi;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class spropd
implements sprrl,
sprvi {
    private boolean cfr_renamed_3;
    private InputStream cfr_renamed_4;

    @Override
    public Object cfr_renamed_480() {
        return this.cfr_renamed_2920();
    }

    @Override
    public InputStream cfr_renamed_2920() {
        spropd spropd2 = this;
        spropd2.cfr_renamed_4156();
        return spropd2.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_624(OutputStream arg0) throws IOException, sprlqd {
        spropd spropd2 = this;
        spropd2.cfr_renamed_4156();
        sprbsa.cfr_renamed_472(spropd2.cfr_renamed_4, arg0);
        spropd2.cfr_renamed_4.close();
    }

    public spropd(InputStream inputStream) {
        spropd spropd2 = this;
        spropd2.cfr_renamed_3 = false;
        spropd2.cfr_renamed_4 = inputStream;
    }

    private synchronized /* synthetic */ void cfr_renamed_4156() {
        if (this.cfr_renamed_3) {
            throw new IllegalStateException(sprugb.cfr_renamed_9("M\u001d]\u0000|?m5}#o2b5G>~%z\u0003z\"k1cpm1`pa>b).2kp{#k4.?`3k"));
        }
        this.cfr_renamed_3 = true;
    }
}

