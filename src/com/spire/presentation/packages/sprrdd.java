/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbff;
import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprywe;
import com.spire.presentation.packages.sprzra;

public final class sprrdd
implements sprel {
    private final byte[] cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private final boolean cfr_renamed_1;
    private static final int cfr_renamed_2 = -1;
    private final int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrdd(byte[] byArray, byte[] byArray2, byte[] byArray3, int n, boolean bl) {
        void arg4;
        sprrdd sprrdd2;
        void arg1;
        void arg3;
        sprrdd sprrdd3;
        void arg2;
        void arg0;
        if (byArray == null) {
            throw new IllegalArgumentException(sprbff.cfr_renamed_9("i<cXn<ZyYiAnMo\bWA<\u0000}\boMyL5\b}[<ArXi\\"));
        }
        this.cfr_renamed_0 = sprzra.cfr_renamed_158((byte[])arg0);
        if (arg2 == null) {
            sprrdd3 = this;
            this.cfr_renamed_91 = new byte[0];
        } else {
            sprrdd3 = this;
            this.cfr_renamed_91 = sprzra.cfr_renamed_158((byte[])arg2);
        }
        sprrdd3.cfr_renamed_3 = arg3;
        if (arg1 == null) {
            sprrdd2 = this;
            this.cfr_renamed_4 = new byte[0];
        } else {
            sprrdd2 = this;
            this.cfr_renamed_4 = sprzra.cfr_renamed_158((byte[])arg1);
        }
        sprrdd2.cfr_renamed_1 = arg4;
    }

    public static sprrdd cfr_renamed_3352(byte[] arg0, byte[] arg1, byte[] arg2, int arg3) {
        if (arg3 != 8 && arg3 != 16 && arg3 != 24 && arg3 != 32) {
            throw new IllegalArgumentException(sprywe.cfr_renamed_9("\u001f<=>'1s65y06&7'<!y 1<,?=s;6ykusheuskgy<+sja"));
        }
        return new sprrdd(arg0, arg1, arg2, arg3, true);
    }

    public int cfr_renamed_3353() {
        return this.cfr_renamed_3;
    }

    public static sprrdd cfr_renamed_3354(byte[] arg0, byte[] arg1, byte[] arg2) {
        return new sprrdd(arg0, arg1, arg2, -1, false);
    }

    public boolean cfr_renamed_3355() {
        return this.cfr_renamed_1;
    }

    public byte[] cfr_renamed_3356() {
        return this.cfr_renamed_0;
    }

    public byte[] cfr_renamed_3357() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_91);
    }
}

