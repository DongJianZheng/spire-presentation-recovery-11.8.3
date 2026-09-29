/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.spriln;
import com.spire.presentation.packages.sprned;
import com.spire.presentation.packages.sprzra;

public final class sprihd
implements sprel {
    private final byte[] cfr_renamed_0;
    private final boolean cfr_renamed_1;
    private final int cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 32;

    public byte[] cfr_renamed_3356() {
        return this.cfr_renamed_0;
    }

    public static sprihd cfr_renamed_3358(byte[] arg0, byte[] arg1, int arg2) {
        return new sprihd(arg0, arg1, arg2, true);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprihd(byte[] byArray, byte[] byArray2, int n, boolean bl) {
        void arg3;
        void v0;
        void arg2;
        void arg1;
        void arg0;
        if (byArray == null) {
            throw new IllegalArgumentException(spriln.cfr_renamed_9("VP\\4QPe\u0015f\u0005~\u0002r\u00037;~P?\u00117\u0003r\u0015sY7\u0011dP~\u001eg\u0005c"));
        }
        this.cfr_renamed_0 = sprzra.cfr_renamed_158((byte[])arg0);
        if (arg1 == null) {
            v0 = arg2;
            this.cfr_renamed_3 = new byte[0];
        } else {
            this.cfr_renamed_3 = sprzra.cfr_renamed_158((byte[])arg1);
            v0 = arg2;
        }
        if (v0 != 8 && arg2 != 16 && arg2 != 24 && arg2 != 32) {
            throw new IllegalArgumentException(sprned.cfr_renamed_9("W$u&o);.}ax.n/o$iah)t4w%;#~a#m;p-m;s/at3;r)"));
        }
        this.cfr_renamed_2 = arg2;
        this.cfr_renamed_1 = arg3;
    }

    public static sprihd cfr_renamed_3359(byte[] arg0, byte[] arg1) {
        return new sprihd(arg0, arg1, 32, false);
    }

    public int cfr_renamed_3353() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_3357() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_3);
    }

    public boolean cfr_renamed_3355() {
        return this.cfr_renamed_1;
    }
}

