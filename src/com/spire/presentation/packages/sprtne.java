/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprnfe;
import com.spire.presentation.packages.sprtua;
import com.spire.presentation.packages.sprugk;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class sprtne
extends sprkra
implements sprkj {
    private sprcge cfr_renamed_3;
    private sprnfe cfr_renamed_4;

    public sprcge cfr_renamed_4415() {
        return this.cfr_renamed_3;
    }

    public sprnfe cfr_renamed_4892() {
        return this.cfr_renamed_4;
    }

    public sprtne(sprnfe sprnfe2) {
        this.cfr_renamed_4 = sprnfe2;
    }

    public static sprtne cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprtne) {
            return (sprtne)arg0;
        }
        if (arg0 instanceof sprbne || arg0 instanceof byte[]) {
            return new sprtne(sprcge.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof spryte) {
            return new sprtne(sprnfe.cfr_renamed_23(((spryte)arg0).cfr_renamed_2456()));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprugk.cfr_renamed_9("\r\u00042\u000b(\u0003 J+\b.\u000f'\u001e~J")).append(arg0.getClass().getName()).toString());
    }

    public boolean cfr_renamed_4893() {
        return this.cfr_renamed_3 != null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return new sprhse(1 != 0, 1, this.cfr_renamed_4);
        }
        return this.cfr_renamed_3.cfr_renamed_119();
    }

    /*
     * WARNING - void declaration
     */
    public sprtne(sprcge sprcge2) {
        void arg0;
        if (sprcge2.cfr_renamed_569() != 3) {
            throw new IllegalArgumentException(sprtua.cfr_renamed_9("\n[\tLEC\u0000G\u0016\\\n[E\u0006EV\u0000G\u0011\\\u0003\\\u0006T\u0011P\u0016\u0015\u0004Y\tZ\u0012P\u0001"));
        }
        this.cfr_renamed_3 = arg0;
    }
}

