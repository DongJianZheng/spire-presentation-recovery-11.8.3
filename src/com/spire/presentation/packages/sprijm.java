/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdbd;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprvzaa;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprijm
extends sprqqe
implements sprlm {
    private sprigm cfr_renamed_1;
    private sprigm cfr_renamed_2;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 0;

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_2 != null) {
            return new sprycn(true, 0, (sprco)this.cfr_renamed_2);
        }
        return new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_1);
    }

    public sprigm cfr_renamed_190() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprijm(sprnvm sprnvm2) {
        void arg0;
        switch (sprnvm2.cfr_renamed_312()) {
            case 0: {
                this.cfr_renamed_2 = sprigm.cfr_renamed_5085((sprnvm)arg0, true);
                return;
            }
            case 1: {
                this.cfr_renamed_1 = sprigm.cfr_renamed_5085((sprnvm)arg0, true);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdbd.cfr_renamed_9("]BCBG[F\f\\MO\u0016\b")).append(arg0.cfr_renamed_312()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprijm(int n, sprigm sprigm2) {
        this(new sprycn((int)arg0, (sprco)arg1));
        void arg1;
        void arg0;
    }

    public static sprijm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprijm) {
            return (sprijm)arg0;
        }
        if (arg0 instanceof sprnvm) {
            return new sprijm((sprnvm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprvzaa.cfr_renamed_9("@t^tZm[:Zx_\u007fVn\u0015s[:S{VnZhL \u0015")).append(arg0.getClass()).toString());
    }

    public sprigm cfr_renamed_189() {
        return this.cfr_renamed_2;
    }
}

