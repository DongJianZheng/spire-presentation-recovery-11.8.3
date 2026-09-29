/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprhg;
import com.spire.presentation.packages.sprjgka;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprvva;
import java.io.IOException;

public class sprppe
implements sprhg {
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private sprkwe cfr_renamed_4;

    @Override
    public int cfr_renamed_312() {
        return this.cfr_renamed_3;
    }

    @Override
    public spra cfr_renamed_4829(int arg0, boolean arg1) throws IOException {
        if (arg1) {
            if (!this.cfr_renamed_2) {
                throw new IOException(sprjgka.cfr_renamed_9("';\u0012/\u000b \u000b7B7\u0003$\u0011c\u000f6\u00117B!\u0007c\u0001,\f0\u00161\u0017 \u0016&\u0006cJ0\u0007&B\u001bLu[sB{LrVmPj"));
            }
            return this.cfr_renamed_4.cfr_renamed_24();
        }
        sprppe sprppe2 = this;
        return sprppe2.cfr_renamed_4.cfr_renamed_4903(sprppe2.cfr_renamed_2, arg0);
    }

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
            throw new spraqe(iOException.getMessage());
        }
    }

    public boolean cfr_renamed_4575() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprvva cfr_renamed_2414() throws IOException {
        sprppe sprppe2 = this;
        return sprppe2.cfr_renamed_4.cfr_renamed_4904(sprppe2.cfr_renamed_2, this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprppe(boolean bl, int n, sprkwe sprkwe2) {
        void arg1;
        void arg0;
        sprppe sprppe2 = this;
        this.cfr_renamed_2 = arg0;
        sprppe2.cfr_renamed_3 = arg1;
        sprppe2.cfr_renamed_4 = sprkwe2;
    }
}

