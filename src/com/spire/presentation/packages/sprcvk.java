/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcw;
import com.spire.presentation.packages.sprddl;

public abstract class sprcvk
implements sprcw {
    @Override
    public int cfr_renamed_10005() {
        return this.cfr_renamed_1195();
    }

    @Override
    public int cfr_renamed_10004(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl, IllegalStateException {
        int n;
        int n2 = 0;
        int n3 = this.cfr_renamed_10005();
        int n4 = n = 0;
        while (n4 != arg2) {
            n2 += this.cfr_renamed_3064(arg0, arg1, arg3, arg4 + n2);
            arg1 += n3;
            n4 = ++n;
        }
        return n2;
    }
}

