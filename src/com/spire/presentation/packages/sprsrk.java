/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbmia;
import com.spire.presentation.packages.sprcvk;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprxrc;

public abstract class sprsrk
extends sprcvk
implements sprvv {
    private final sprmr cfr_renamed_4;

    public sprsrk(sprmr sprmr2) {
        this.cfr_renamed_4 = sprmr2;
    }

    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_4;
    }

    public abstract byte cfr_renamed_3272(byte var1);

    @Override
    public final byte cfr_renamed_3243(byte arg0) {
        return this.cfr_renamed_3272(arg0);
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprbmia.cfr_renamed_9("N\u0004W\u001fSJE\u001fA\fB\u0018\u0007\u001eH\u0005\u0007\u0019J\u000bK\u0006"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(sprxrc.cfr_renamed_9("[J@OAK\u0014]AYRZF\u001f@P[\u001fGW[M@"));
        }
        int n = arg1;
        int n2 = arg1 + arg2;
        int n3 = arg4;
        int n4 = n;
        while (n4 < n2) {
            int n5 = n3++;
            byte by = this.cfr_renamed_3272(arg0[n]);
            arg3[n5] = by;
            n4 = ++n;
        }
        return arg2;
    }
}

