/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbe;
import com.spire.presentation.packages.sprozc;
import com.spire.presentation.packages.sprwh;
import java.security.SecureRandom;

public class sprrvc
implements sprwh {
    private final SecureRandom cfr_renamed_3;
    private final boolean cfr_renamed_4;

    @Override
    public sprbe cfr_renamed_576(int arg0) {
        return new sprozc(this, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprrvc(SecureRandom secureRandom, boolean bl) {
        void arg0;
        sprrvc sprrvc2 = this;
        sprrvc2.cfr_renamed_3 = arg0;
        sprrvc2.cfr_renamed_4 = bl;
    }

    public static /* synthetic */ boolean cfr_renamed_3336(sprrvc arg0) {
        return arg0.cfr_renamed_4;
    }

    public static /* synthetic */ SecureRandom cfr_renamed_3337(sprrvc arg0) {
        return arg0.cfr_renamed_3;
    }
}

