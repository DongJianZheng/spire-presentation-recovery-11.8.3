/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprjwe;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.spropca;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzvo;

public class sprjpe
extends sprkra
implements sprkj {
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 0;
    private spra cfr_renamed_3;
    public static final int cfr_renamed_4 = 2;

    public sprjpe(boolean bl) {
        this.cfr_renamed_3 = sprnpe.cfr_renamed_655(bl);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprjpe(spryte spryte2) {
        void arg0;
        switch (spryte2.cfr_renamed_312()) {
            case 0: {
                this.cfr_renamed_3 = sprjwe.cfr_renamed_23(arg0.cfr_renamed_2456());
                return;
            }
            case 1: {
                this.cfr_renamed_3 = sprxue.cfr_renamed_341((spryte)arg0, false);
                return;
            }
            case 2: {
                this.cfr_renamed_3 = sprnpe.cfr_renamed_341((spryte)arg0, false);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spropca.cfr_renamed_9(".\u001f0\u001f4\u00065Q/\u0010<Q5\u00046\u0013>\u0003aQ")).append(arg0.cfr_renamed_312()).toString());
    }

    public sprjpe(sprjwe sprjwe2) {
        this.cfr_renamed_3 = sprjwe2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_3 instanceof sprjwe) {
            return new sprhse(true, 0, this.cfr_renamed_3);
        }
        if (this.cfr_renamed_3 instanceof sprxue) {
            return new sprhse(false, 1, this.cfr_renamed_3);
        }
        return new sprhse(false, 2, this.cfr_renamed_3);
    }

    public int cfr_renamed_324() {
        if (this.cfr_renamed_3 instanceof sprjwe) {
            return 0;
        }
        if (this.cfr_renamed_3 instanceof sprxue) {
            return 1;
        }
        return 2;
    }

    public sprjpe(sprxue sprxue2) {
        this.cfr_renamed_3 = sprxue2;
    }

    public spra cfr_renamed_97() {
        return this.cfr_renamed_3;
    }

    public static sprjpe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprjpe) {
            return (sprjpe)arg0;
        }
        if (arg0 instanceof spryte) {
            return new sprjpe((spryte)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzvo.cfr_renamed_9("2[,[(B)\u0015(W-P$A}\u0015")).append(arg0).toString());
    }
}

