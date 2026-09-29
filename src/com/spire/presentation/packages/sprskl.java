/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprkx;
import com.spire.presentation.packages.sprsdl;
import com.spire.presentation.packages.sprsu;

public class sprskl
implements sprkx {
    private final long cfr_renamed_4;

    public sprskl() {
        this.cfr_renamed_4 = -1L;
    }

    public static /* synthetic */ long cfr_renamed_10691(sprskl arg0) {
        return arg0.cfr_renamed_4;
    }

    @Override
    public sprsu cfr_renamed_5279(sprddm arg0) {
        return new sprsdl(this, arg0);
    }

    public sprskl(long l) {
        this.cfr_renamed_4 = l;
    }
}

