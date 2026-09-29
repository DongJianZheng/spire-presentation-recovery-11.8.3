/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgp;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprxsb;

public class sproeda
extends sprxsb {
    private sprlc cfr_renamed_4;

    @Override
    public sprt cfr_renamed_1523(int arg0) {
        return this.cfr_renamed_249(arg0);
    }

    @Override
    public sprt cfr_renamed_249(int arg0) {
        if ((arg0 /= 8) > this.cfr_renamed_4.cfr_renamed_1218()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmrg.cfr_renamed_9("\u000bn&(<//j&j:n<jhnhk-}!y-khd-vh")).append(arg0).append(sprbgp.cfr_renamed_9("l 56)1l.#,+l")).toString());
        }
        byte[] byArray = this.cfr_renamed_3506();
        return new sprnld(byArray, 0, arg0);
    }

    public sproeda(sprlc sprlc2) {
        this.cfr_renamed_4 = sprlc2;
    }

    private /* synthetic */ byte[] cfr_renamed_3506() {
        sproeda sproeda2 = this;
        byte[] byArray = new byte[sproeda2.cfr_renamed_4.cfr_renamed_1218()];
        sproeda2.cfr_renamed_4.cfr_renamed_1197(this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
        sproeda sproeda3 = this;
        sproeda3.cfr_renamed_4.cfr_renamed_1197(sproeda3.cfr_renamed_3, 0, this.cfr_renamed_3.length);
        this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        int n = 1;
        int n2 = n;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
            this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
            n2 = ++n;
        }
        return byArray;
    }

    @Override
    public sprt cfr_renamed_1518(int arg0, int arg1) {
        if ((arg0 /= 8) + (arg1 /= 8) > this.cfr_renamed_4.cfr_renamed_1218()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmrg.cfr_renamed_9("\u000bn&(<//j&j:n<jhnhk-}!y-khd-vh")).append(arg0 + arg1).append(sprbgp.cfr_renamed_9("l 56)1l.#,+l")).toString());
        }
        byte[] byArray = this.cfr_renamed_3506();
        return new sprnjd(new sprnld(byArray, 0, arg0), byArray, arg0, arg1);
    }
}

