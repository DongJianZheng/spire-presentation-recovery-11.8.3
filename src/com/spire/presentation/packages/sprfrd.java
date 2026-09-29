/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprfiz;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;

public class sprfrd {
    public static sprt cfr_renamed_4213(spreya arg0) {
        if (arg0.cfr_renamed_1536() instanceof sprt) {
            return (sprt)arg0.cfr_renamed_1536();
        }
        if (arg0.cfr_renamed_1536() instanceof byte[]) {
            return new sprnld((byte[])arg0.cfr_renamed_1536());
        }
        throw new IllegalArgumentException(sprfiz.cfr_renamed_9("\u0010\u0000\u000e\u0000\n\u0019\u000bN\u0002\u000b\u000b\u000b\u0017\u0007\u0006N\u000e\u000b\u001cN\u0011\u0017\u0015\u000b"));
    }
}

