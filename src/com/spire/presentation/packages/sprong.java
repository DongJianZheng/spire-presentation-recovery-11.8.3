/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgg;
import com.spire.presentation.packages.sproe;
import com.spire.presentation.packages.sprog;

public class sprong
implements sprog {
    private final char[] cfr_renamed_4;

    public static /* synthetic */ char[] cfr_renamed_7532(sprong arg0) {
        return arg0.cfr_renamed_4;
    }

    public sprong(char[] cArray) {
        this.cfr_renamed_4 = cArray;
    }

    @Override
    public sproe cfr_renamed_1600(String arg0) {
        return new sprcgg(this, arg0);
    }
}

