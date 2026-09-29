/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprprc;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;

public class sprdch
extends sprqqe {
    private final byte[] cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprfvg(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprdch(byte[] byArray) {
        void arg0;
        if (byArray.length != 16) {
            throw new IllegalArgumentException(sprprc.cfr_renamed_9("ym{otcp$fap`5jzp55#$w}aaf"));
        }
        this.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg0);
    }

    public byte[] cfr_renamed_8374() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprdch(sproug arg0) {
        this(arg0.cfr_renamed_186());
    }

    public static sprdch cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdch) {
            return (sprdch)arg0;
        }
        if (arg0 != null) {
            return new sprdch(sprfvg.cfr_renamed_23(arg0));
        }
        return null;
    }
}

