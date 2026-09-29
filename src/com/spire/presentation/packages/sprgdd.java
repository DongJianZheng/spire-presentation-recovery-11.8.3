/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjo;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwob;

public class sprgdd
implements sprff {
    public static final int cfr_renamed_2 = 1;
    private final int cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
    }

    @Override
    public String cfr_renamed_1315() {
        return sprbjo.cfr_renamed_9("qgS~");
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_3;
    }

    public sprgdd(int n) {
        this.cfr_renamed_3 = n;
    }

    public sprgdd() {
        this(1);
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) throws IllegalArgumentException {
        this.cfr_renamed_4 = true;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprjkd, IllegalStateException {
        int n;
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(sprwob.cfr_renamed_9("x5Z,\u0016%X'_.S`X/B`_._4_!Z)E%R"));
        }
        if (arg1 + this.cfr_renamed_3 > arg0.length) {
            throw new sprjkd(sprbjo.cfr_renamed_9("V|OgK2]gYtZ`\u001ffP}\u001faW}Mf"));
        }
        if (arg3 + this.cfr_renamed_3 > arg2.length) {
            throw new spreid(sprwob.cfr_renamed_9("Y5B0C4\u0016\"C&P%D`B/Y`E(Y2B"));
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3 = arg3 + n;
            byte by = arg0[arg1 + n];
            arg2[n3] = by;
            n2 = ++n;
        }
        return this.cfr_renamed_3;
    }
}

