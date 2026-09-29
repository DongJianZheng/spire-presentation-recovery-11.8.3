/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprooz;
import com.spire.presentation.packages.sprsly;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprpbe
extends sprkra
implements sprkj {
    public static final int cfr_renamed_1 = 1;
    private sprmee cfr_renamed_2;
    public static final int cfr_renamed_3 = 0;
    private sprmee cfr_renamed_4;

    public sprmee cfr_renamed_189() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprpbe(spryte spryte2) {
        void arg0;
        switch (spryte2.cfr_renamed_312()) {
            case 0: {
                this.cfr_renamed_4 = sprmee.cfr_renamed_341((spryte)arg0, true);
                return;
            }
            case 1: {
                this.cfr_renamed_2 = sprmee.cfr_renamed_341((spryte)arg0, true);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprsly.cfr_renamed_9("\u0007\u0019\u0019\u0019\u001d\u0000\u001cW\u0006\u0016\u0015MR")).append(arg0.cfr_renamed_312()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprpbe(int n, sprmee sprmee2) {
        this(new sprhse((int)arg0, (spra)arg1));
        void arg1;
        void arg0;
    }

    public static sprpbe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprpbe) {
            return (sprpbe)arg0;
        }
        if (arg0 instanceof spryte) {
            return new sprpbe((spryte)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprooz.cfr_renamed_9("-\t3\t7\u00106G7\u00052\u0002;\u0013x\u000e6G>\u0006;\u00137\u0015!]x")).append(arg0.getClass()).toString());
    }

    public sprmee cfr_renamed_190() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return new sprhse(true, 0, this.cfr_renamed_4);
        }
        return new sprhse(1 != 0, 1, this.cfr_renamed_2);
    }
}

