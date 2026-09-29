/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.spruna;
import com.spire.presentation.packages.sprvdaa;

public abstract class sprcnd
implements sprff,
sprqk {
    private final sprff cfr_renamed_4;

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd {
        if (arg4 + arg2 > arg3.length) {
            throw new sprjkd(sprvdaa.cfr_renamed_9("X,C)B-\u0017;B?Q<EyC6XyD1X+C"));
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprjkd(spruna.cfr_renamed_9("o\u0001v\u001arOd\u001a`\tc\u001d&\u001bi\u0000&\u001ck\u000ej\u0003"));
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

    public abstract byte cfr_renamed_3272(byte var1);

    @Override
    public final byte cfr_renamed_3243(byte arg0) {
        return this.cfr_renamed_3272(arg0);
    }

    public sprff cfr_renamed_2349() {
        return this.cfr_renamed_4;
    }

    public sprcnd(sprff sprff2) {
        this.cfr_renamed_4 = sprff2;
    }
}

