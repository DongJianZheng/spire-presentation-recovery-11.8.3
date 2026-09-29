/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgo;
import com.spire.presentation.packages.sprwj;
import com.spire.presentation.packages.sprwne;
import java.security.SecureRandom;

public class spryse
implements sprgo {
    private final boolean cfr_renamed_3;
    private final SecureRandom cfr_renamed_4;

    public static /* synthetic */ boolean cfr_renamed_5110(spryse arg0) {
        return arg0.cfr_renamed_3;
    }

    public static /* synthetic */ SecureRandom cfr_renamed_5111(spryse arg0) {
        return arg0.cfr_renamed_4;
    }

    @Override
    public sprwj cfr_renamed_576(int arg0) {
        return new sprwne(this, arg0);
    }

    public spryse(boolean bl) {
        spryse spryse2 = this;
        this.cfr_renamed_4 = new SecureRandom();
        this.cfr_renamed_3 = bl;
    }
}

