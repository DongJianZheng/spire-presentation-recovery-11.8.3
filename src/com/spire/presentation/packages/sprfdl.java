/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sproqr;
import com.spire.presentation.packages.sprxq;

public class sprfdl
implements sprxq {
    private final int cfr_renamed_1;
    private final spriil cfr_renamed_2;
    private final Object cfr_renamed_3;
    private final String cfr_renamed_4;

    @Override
    public spriil cfr_renamed_10343() {
        return this.cfr_renamed_2;
    }

    @Override
    public int cfr_renamed_10429() {
        return this.cfr_renamed_1;
    }

    public sprfdl(String arg0, int arg1) {
        this(arg0, arg1, null, spriil.cfr_renamed_0);
    }

    @Override
    public String cfr_renamed_9171() {
        return this.cfr_renamed_4;
    }

    public sprfdl(String arg0, int arg1, Object arg2, spriil arg3) {
        sprfdl sprfdl2 = this;
        sprfdl2.cfr_renamed_4 = arg0;
        sprfdl2.cfr_renamed_1 = arg1;
        this.cfr_renamed_3 = arg2;
        if (this.cfr_renamed_3 instanceof spriil) {
            throw new IllegalArgumentException(sproqr.cfr_renamed_9("\u0015\u000e\u0017\u000e\b\u001cE\u001c\r\u0000\u0010\u0003\u0001O\u000b\u0000\u0011O\u0007\nE,\u0017\u0016\u0015\u001b\n<\u0000\u001d\u0013\u0006\u0006\n5\u001a\u0017\u001f\n\u001c\u0000"));
        }
        this.cfr_renamed_2 = arg3;
    }

    @Override
    public Object cfr_renamed_2110() {
        return this.cfr_renamed_3;
    }

    public sprfdl(String arg0, int arg1, Object arg2) {
        this(arg0, arg1, arg2, spriil.cfr_renamed_0);
    }
}

