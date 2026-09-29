/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvzm;
import com.spire.presentation.packages.spryzm;

@sprtea
public class sprvgn
extends spryzm {
    private int cfr_renamed_4;

    @sprtea
    public sprvgn(String arg0, int arg1) {
        super(arg0, arg1);
    }

    @sprtea
    public static sprvgn cfr_renamed_11634(String arg0) {
        return new sprvgn(arg0, 11);
    }

    @sprtea
    public sprvgn(String arg0, boolean arg1, int arg2, int arg3, sprvzm arg4) {
        super(arg0, arg1 ? 9 : 10);
        this.cfr_renamed_11621(arg2);
        this.cfr_renamed_11623(arg4);
        this.cfr_renamed_4 = arg3;
    }

    public int cfr_renamed_12018() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public static sprvgn cfr_renamed_11628(String arg0) {
        return new sprvgn(arg0, 8);
    }

    @sprtea
    public sprvgn() {
    }

    @sprtea
    public static sprvgn cfr_renamed_11770(String arg0, sprvzm arg1, long arg2, long arg3) {
        sprvgn sprvgn2;
        sprvgn sprvgn3 = sprvgn2 = new sprvgn(arg0, 16);
        sprvgn sprvgn4 = sprvgn2;
        sprvgn4.cfr_renamed_11624(arg0);
        sprvgn4.cfr_renamed_11623(arg1);
        sprvgn3.cfr_renamed_11622(arg2);
        sprvgn3.cfr_renamed_11620(arg3);
        return sprvgn3;
    }
}

