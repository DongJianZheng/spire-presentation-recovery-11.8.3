/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdtm;
import com.spire.presentation.packages.sprkaz;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprwyy;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprmum
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_1 = 0;
    public static final int cfr_renamed_2 = 2;
    private sprco cfr_renamed_3;
    public static final int cfr_renamed_4 = 1;

    public sprmum(sprdtm sprdtm2) {
        this.cfr_renamed_3 = sprdtm2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_3 instanceof sprdtm) {
            return new sprycn(true, 0, this.cfr_renamed_3);
        }
        if (this.cfr_renamed_3 instanceof sproug) {
            return new sprycn(false, 1, this.cfr_renamed_3);
        }
        return new sprycn(false, 2, this.cfr_renamed_3);
    }

    public int cfr_renamed_324() {
        if (this.cfr_renamed_3 instanceof sprdtm) {
            return 0;
        }
        if (this.cfr_renamed_3 instanceof sproug) {
            return 1;
        }
        return 2;
    }

    public static sprmum cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprmum) {
            return (sprmum)arg0;
        }
        if (arg0 instanceof sprnvm) {
            return new sprmum(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwyy.cfr_renamed_9("{MeMaT`\u0003aAdFmW4\u0003")).append(arg0).toString());
    }

    public sprmum(boolean bl) {
        this.cfr_renamed_3 = sprbxm.cfr_renamed_655(bl);
    }

    public sprco cfr_renamed_97() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprmum(sprnvm sprnvm2) {
        void arg0;
        switch (sprnvm2.cfr_renamed_312()) {
            case 0: {
                this.cfr_renamed_3 = sprdtm.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                this.cfr_renamed_3 = sproug.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
            case 2: {
                this.cfr_renamed_3 = sprbxm.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprkaz.cfr_renamed_9("&:8:<#=t'54t=!>66&it")).append(arg0.cfr_renamed_312()).toString());
    }

    public sprmum(sproug sproug2) {
        this.cfr_renamed_3 = sproug2;
    }
}

