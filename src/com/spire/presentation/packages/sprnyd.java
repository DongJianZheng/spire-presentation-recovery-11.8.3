/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbf;
import com.spire.presentation.packages.sprre;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxte;

public class sprnyd
implements sprre {
    private final sprxte cfr_renamed_3;
    private static final sprtzd cfr_renamed_4 = sprbf.cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnyd(String string) {
        void arg0;
        sprnyd sprnyd2 = this;
        sprnyd2.cfr_renamed_3 = new sprxte((String)arg0);
    }

    public sprnyd(sprxte sprxte2) {
        this.cfr_renamed_3 = sprxte2;
    }

    @Override
    public sprtzd cfr_renamed_324() {
        return cfr_renamed_4;
    }

    @Override
    public spra cfr_renamed_97() {
        return this.cfr_renamed_3;
    }
}

