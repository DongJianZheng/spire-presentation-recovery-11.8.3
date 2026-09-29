/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprpwp;
import com.spire.presentation.packages.sprzcf;
import com.spire.presentation.packages.sprzra;

public final class sprjhd
implements sprel {
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    public sprjhd(byte[] arg0, byte[] arg1, int arg2) {
        this(arg0, null, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjhd(byte[] byArray, byte[] byArray2, byte[] byArray3, int n) {
        void v1;
        void arg3;
        void v0;
        void arg2;
        void arg1;
        void arg0;
        if (byArray == null) {
            throw new IllegalArgumentException(sprzcf.cfr_renamed_9(" \u0013*w'\u0013\u0013V\u0010F\bA\u0004@Ax\b\u0013IRA@\u0004V\u0005\u001aAR\u0012\u0013\b]\u0011F\u0015"));
        }
        this.cfr_renamed_1 = sprzra.cfr_renamed_158((byte[])arg0);
        if (arg1 == null) {
            v0 = arg2;
            this.cfr_renamed_3 = new byte[0];
        } else {
            this.cfr_renamed_3 = sprzra.cfr_renamed_158((byte[])arg1);
            v0 = arg2;
        }
        if (v0 == null) {
            v1 = arg3;
            this.cfr_renamed_2 = new byte[0];
        } else {
            this.cfr_renamed_2 = sprzra.cfr_renamed_158((byte[])arg2);
            v1 = arg3;
        }
        if (v1 != 8 && arg3 != 16 && arg3 != 24 && arg3 != 32) {
            throw new IllegalArgumentException(sprpwp.cfr_renamed_9("}*_(E'\u0011 WoR D!E*CoB'^:]+\u0011-To\tc\u0011~\u0007c\u0011}\u0005o^=\u0011|\u0003"));
        }
        this.cfr_renamed_4 = arg3;
    }

    public byte[] cfr_renamed_3360() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_3356() {
        return this.cfr_renamed_1;
    }

    public byte[] cfr_renamed_3357() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_2);
    }

    public byte[] cfr_renamed_3361() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_2);
    }

    public int cfr_renamed_3353() {
        return this.cfr_renamed_4;
    }
}

