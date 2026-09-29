/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spriifa;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkki;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;

public class sprrje
extends sprkra
implements sprkj {
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 1;
    public spra cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprrje(int n) {
        void arg0;
        if (n == 0 || arg0 == true) {
            this.cfr_renamed_4 = new sprooe((long)arg0);
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spriifa.cfr_renamed_9("\u0007\u0013\u0019\u0013\u001d\nR-\u0000\u0018\u0016\u0018\u0014\u0014\u001c\u0018\u0016?\u001b\u0012\u001f\u0018\u0006\u000f\u001b\u001e&\u0004\u0002\u0018RGR")).append((int)arg0).toString());
    }

    public boolean cfr_renamed_4493() {
        return this.cfr_renamed_4 instanceof sprooe;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public sprrje(sprtzd sprtzd2) {
        this.cfr_renamed_4 = sprtzd2;
    }

    public static sprrje cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprrje) {
            return (sprrje)arg0;
        }
        if (arg0 instanceof sprooe) {
            sprooe sprooe2 = sprooe.cfr_renamed_23(arg0);
            int n = sprooe2.cfr_renamed_97().intValue();
            return new sprrje(n);
        }
        if (arg0 instanceof sprtzd) {
            sprtzd sprtzd2 = sprtzd.cfr_renamed_23(arg0);
            return new sprrje(sprtzd2);
        }
        throw new IllegalArgumentException(sprkki.cfr_renamed_9("&\u00018\u0001<\u0018=O<\r9\n0\u001bs\u0006=O4\n'&=\u001c'\u000e=\f6"));
    }

    public sprtzd cfr_renamed_4494() {
        return (sprtzd)this.cfr_renamed_4;
    }

    public int cfr_renamed_4495() {
        return ((sprooe)this.cfr_renamed_4).cfr_renamed_97().intValue();
    }
}

