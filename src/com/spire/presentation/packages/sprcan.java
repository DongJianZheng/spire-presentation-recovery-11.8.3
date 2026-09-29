/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsgn;

public class sprcan {
    public static final sprsgn cfr_renamed_3;
    public static final sprfdn cfr_renamed_4;

    static {
        cfr_renamed_4 = new sprfdn();
        cfr_renamed_3 = new sprsgn();
    }

    public static sprsgn cfr_renamed_11283(sprrvm arg0) {
        if (arg0.cfr_renamed_84() < 1) {
            return cfr_renamed_3;
        }
        return new sprsgn(arg0);
    }

    public static sprfdn cfr_renamed_11287(sprrvm arg0) {
        if (arg0.cfr_renamed_84() < 1) {
            return cfr_renamed_4;
        }
        return new sprfdn(arg0);
    }
}

