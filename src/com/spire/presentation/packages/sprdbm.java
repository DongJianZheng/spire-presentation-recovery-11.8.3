/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprde;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprzcm;
import java.io.IOException;

public class sprdbm
extends sprzcm
implements sprde {
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        arg0.cfr_renamed_11039(13, this.cfr_renamed_4);
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprdbm) {
            return sproze.cfr_renamed_92(this.cfr_renamed_4, ((sprdbm)arg0).cfr_renamed_4);
        }
        return false;
    }

    public String cfr_renamed_6005() {
        return sprkoe.cfr_renamed_427(this.cfr_renamed_4);
    }

    public sprdbm(String string) {
        this.cfr_renamed_4 = sprkoe.cfr_renamed_431(string);
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4);
    }

    public sprdbm(sprmam sprmam2) throws IOException {
        this.cfr_renamed_4 = sprmam2.cfr_renamed_145();
    }

    public sprdbm(byte[] byArray) {
        this.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    public byte[] cfr_renamed_7804() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}

