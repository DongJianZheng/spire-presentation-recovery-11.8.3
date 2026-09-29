/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpfm;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.sprxfca;

public final class spryuk
implements sprut {
    private final boolean cfr_renamed_0;
    private final byte[] cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 32;
    private final int cfr_renamed_4;

    public byte[] cfr_renamed_3356() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_3355() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_3353() {
        return this.cfr_renamed_4;
    }

    public static spryuk cfr_renamed_3358(byte[] arg0, byte[] arg1, int arg2) {
        return new spryuk(arg0, arg1, arg2, true);
    }

    public static spryuk cfr_renamed_3359(byte[] arg0, byte[] arg1) {
        return new spryuk(arg0, arg1, 32, false);
    }

    public byte[] cfr_renamed_3357() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spryuk(byte[] byArray, byte[] byArray2, int n, boolean bl) {
        void arg3;
        void v0;
        void arg2;
        void arg1;
        void arg0;
        if (byArray == null) {
            throw new IllegalArgumentException(sprpfm.cfr_renamed_9("\u001d;\u0017_\u001a;.~-n5i9h|P5;tz|h9~82|z/;5u,n("));
        }
        this.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg0);
        if (arg1 == null) {
            v0 = arg2;
            this.cfr_renamed_1 = new byte[0];
        } else {
            this.cfr_renamed_1 = sproze.cfr_renamed_158((byte[])arg1);
            v0 = arg2;
        }
        if (v0 != 8 && arg2 != 16 && arg2 != 24 && arg2 != 32) {
            throw new IllegalArgumentException(sprxfca.cfr_renamed_9("n\u000eL\fV\u0003\u0002\u0004DKA\u0004W\u0005V\u000ePKQ\u0003M\u001eN\u000f\u0002\tGK\u001aG\u0002Z\u0014G\u0002Y\u0016KM\u0019\u0002X\u0010"));
        }
        this.cfr_renamed_4 = arg2;
        this.cfr_renamed_0 = arg3;
    }
}

