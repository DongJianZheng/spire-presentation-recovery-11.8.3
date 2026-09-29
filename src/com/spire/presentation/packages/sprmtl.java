/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdoe;
import com.spire.presentation.packages.sprfj;
import com.spire.presentation.packages.sprnp;
import com.spire.presentation.packages.sprsf;
import java.io.InputStream;
import java.io.OutputStream;

public class sprmtl {
    private final Object cfr_renamed_4;

    public sprmtl(sprsf sprsf2) {
        this.cfr_renamed_4 = sprsf2;
    }

    public boolean cfr_renamed_10661() {
        return this.cfr_renamed_4 instanceof sprnp;
    }

    public boolean cfr_renamed_3992() {
        return this.cfr_renamed_4 instanceof sprsf;
    }

    public sprmtl(sprfj sprfj2) {
        this.cfr_renamed_4 = sprfj2;
    }

    public byte[] cfr_renamed_1472() {
        return ((sprsf)this.cfr_renamed_4).cfr_renamed_1472();
    }

    public InputStream cfr_renamed_1447(InputStream arg0) {
        if (this.cfr_renamed_4 instanceof sprfj) {
            return ((sprfj)this.cfr_renamed_4).cfr_renamed_1447(arg0);
        }
        return new sprdoe(arg0, ((sprsf)this.cfr_renamed_4).cfr_renamed_470());
    }

    public OutputStream cfr_renamed_7491() {
        return ((sprnp)this.cfr_renamed_4).cfr_renamed_7491();
    }
}

