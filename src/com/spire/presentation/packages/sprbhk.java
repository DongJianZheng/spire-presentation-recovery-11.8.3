/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprenk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprkpl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqik;
import com.spire.presentation.packages.sprvok;
import com.spire.presentation.packages.sprxra;
import java.io.IOException;

public class sprbhk
extends sprenk {
    private final int cfr_renamed_0;
    private final long cfr_renamed_2;
    private final long cfr_renamed_4;

    public static sprbhk cfr_renamed_9691(int arg0, long arg1, sprvok arg2, int arg3, sprqik arg4) throws IOException {
        sprqik sprqik2 = arg4;
        int n = sprqik2.cfr_renamed_9656();
        byte[] byArray = sprqik2.cfr_renamed_9664(4);
        if (!sproze.cfr_renamed_92(byArray, (byte[])cfr_renamed_0)) {
            throw new IOException(new StringBuilder().insert(0, sprkpl.cfr_renamed_9("\t$#%28%)4j-+'##j%20/#>)$'j")).append(sprfqe.cfr_renamed_503((byte[])cfr_renamed_0)).append(sprxra.cfr_renamed_9("X`\rvXe\u0017vX")).append(sprfqe.cfr_renamed_503(byArray)).toString());
        }
        arg4.cfr_renamed_9655();
        sprqik sprqik3 = arg4;
        long l = sprqik3.cfr_renamed_9655();
        long l2 = sprqik3.cfr_renamed_9655();
        sprqik3.cfr_renamed_9655();
        arg4.cfr_renamed_9655();
        return new sprbhk(arg0, arg1, arg2, arg3, n, l, l2);
    }

    public int cfr_renamed_9692() {
        return this.cfr_renamed_0;
    }

    public long cfr_renamed_9693() {
        return this.cfr_renamed_2;
    }

    public long cfr_renamed_9694() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbhk(int n, long l, sprvok sprvok2, int n2, int n3, long l2, long l3) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprbhk sprbhk2 = this;
        super((int)arg0, (long)arg1, (sprvok)arg2, (int)arg3);
        this.cfr_renamed_0 = arg4;
        sprbhk2.cfr_renamed_4 = arg5;
        sprbhk2.cfr_renamed_2 = l3;
    }
}

