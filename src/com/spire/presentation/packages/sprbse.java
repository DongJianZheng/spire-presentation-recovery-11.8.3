/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.spriqe;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprui;
import com.spire.presentation.packages.sprvva;
import java.io.IOException;

public class sprbse
implements sprui {
    private final sprkwe cfr_renamed_3;
    private final int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvva cfr_renamed_119() {
        try {
            return this.cfr_renamed_2414();
        }
        catch (IOException iOException) {
            throw new spraqe(iOException.getMessage(), iOException);
        }
    }

    @Override
    public spra cfr_renamed_24() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_24();
    }

    @Override
    public sprvva cfr_renamed_2414() throws IOException {
        sprbse sprbse2 = this;
        return new spriqe(sprbse2.cfr_renamed_4, sprbse2.cfr_renamed_3.cfr_renamed_4789());
    }

    /*
     * WARNING - void declaration
     */
    public sprbse(int n, sprkwe sprkwe2) {
        void arg0;
        sprbse sprbse2 = this;
        sprbse2.cfr_renamed_4 = arg0;
        sprbse2.cfr_renamed_3 = sprkwe2;
    }
}

