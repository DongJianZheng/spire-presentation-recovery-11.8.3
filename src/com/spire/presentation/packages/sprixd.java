/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfa;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkpa;
import java.io.InputStream;

public class sprixd {
    private final sprije cfr_renamed_3;
    private final Object cfr_renamed_4;

    public InputStream cfr_renamed_1447(InputStream arg0) {
        if (this.cfr_renamed_4 instanceof sprfa) {
            return ((sprfa)this.cfr_renamed_4).cfr_renamed_1447(arg0);
        }
        return new sprkpa(arg0, ((sprha)this.cfr_renamed_4).cfr_renamed_470());
    }

    /*
     * WARNING - void declaration
     */
    public sprixd(sprha sprha2) {
        void arg0;
        sprixd sprixd2 = this;
        sprixd2.cfr_renamed_3 = arg0.cfr_renamed_615();
        sprixd2.cfr_renamed_4 = sprha2;
    }

    public boolean cfr_renamed_3992() {
        return this.cfr_renamed_4 instanceof sprha;
    }

    /*
     * WARNING - void declaration
     */
    public sprixd(sprfa sprfa2) {
        void arg0;
        sprixd sprixd2 = this;
        sprixd2.cfr_renamed_3 = arg0.cfr_renamed_615();
        sprixd2.cfr_renamed_4 = sprfa2;
    }

    public byte[] cfr_renamed_1472() {
        return ((sprha)this.cfr_renamed_4).cfr_renamed_1472();
    }
}

