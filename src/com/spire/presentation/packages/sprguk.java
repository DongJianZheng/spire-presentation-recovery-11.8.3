/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnjj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.sprywe;

public final class sprguk
implements sprut {
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprguk(byte[] byArray, byte[] byArray2, byte[] byArray3, int n) {
        void v1;
        void arg3;
        void v0;
        void arg2;
        void arg1;
        void arg0;
        if (byArray == null) {
            throw new IllegalArgumentException(sprnjj.cfr_renamed_9("2S875S\u0001\u0016\u0002\u0006\u001a\u0001\u0016\u0000S8\u001aS[\u0012S\u0000\u0016\u0016\u0017ZS\u0012\u0000S\u001a\u001d\u0003\u0006\u0007"));
        }
        this.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg0);
        if (arg1 == null) {
            v0 = arg2;
            this.cfr_renamed_1 = new byte[0];
        } else {
            this.cfr_renamed_1 = sproze.cfr_renamed_158((byte[])arg1);
            v0 = arg2;
        }
        if (v0 == null) {
            v1 = arg3;
            this.cfr_renamed_2 = new byte[0];
        } else {
            this.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg2);
            v1 = arg3;
        }
        if (v1 != 8 && arg3 != 16 && arg3 != 24 && arg3 != 32) {
            throw new IllegalArgumentException(sprywe.cfr_renamed_9("\u001f<=>'1s65y06&7'<!y 1<,?=s;6ykusheuskgy<+sja"));
        }
        this.cfr_renamed_3 = arg3;
    }

    public byte[] cfr_renamed_3357() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public int cfr_renamed_3353() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_3361() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public sprguk(byte[] arg0, byte[] arg1, int arg2) {
        this(arg0, null, arg1, arg2);
    }

    public byte[] cfr_renamed_3356() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_3360() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }
}

