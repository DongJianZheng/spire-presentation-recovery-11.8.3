/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcan;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprmxm
implements sprqp {
    private sprden cfr_renamed_4;

    public sprmxm(sprden sprden2) {
        this.cfr_renamed_4 = sprden2;
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
            throw new IllegalStateException(iOException.getMessage());
        }
    }

    @Override
    public sprco cfr_renamed_24() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_24();
    }

    @Override
    public sprxgf cfr_renamed_2414() throws IOException {
        return sprcan.cfr_renamed_11287(this.cfr_renamed_4.cfr_renamed_4789());
    }
}

