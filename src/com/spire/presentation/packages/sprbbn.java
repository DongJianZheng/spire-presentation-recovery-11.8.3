/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcan;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzy;
import java.io.IOException;

public class sprbbn
implements sprzy {
    private sprden cfr_renamed_4;

    @Override
    public sprco cfr_renamed_24() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_24();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprxgf cfr_renamed_119() {
        try {
            return this.cfr_renamed_2414();
        }
        catch (IOException iOException) {
            throw new sprhbn(iOException.getMessage(), iOException);
        }
    }

    public sprbbn(sprden sprden2) {
        this.cfr_renamed_4 = sprden2;
    }

    @Override
    public sprxgf cfr_renamed_2414() throws IOException {
        return sprcan.cfr_renamed_11283(this.cfr_renamed_4.cfr_renamed_4789());
    }
}

