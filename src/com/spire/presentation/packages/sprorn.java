/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprorn {
    private int[] cfr_renamed_119;
    private int cfr_renamed_91;
    private String cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private int[] cfr_renamed_4;

    @sprtea
    public String cfr_renamed_13030() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprorn(String string, int n, int n2, int[] nArray, int[] nArray2) {
        void arg4;
        void arg3;
        void arg1;
        void arg2;
        void arg0;
        if (sprraia.cfr_renamed_12280(string)) {
            throw new IllegalArgumentException("text");
        }
        sprorn sprorn2 = this;
        this.cfr_renamed_0 = arg0;
        sprorn2.cfr_renamed_91 = arg2;
        sprorn2.cfr_renamed_2 = arg1;
        int[] nArray3 = arg3 == null ? new int[]{} : (this.cfr_renamed_119 = arg3);
        this.cfr_renamed_4 = (int[])(arg4 == null ? new int[]{} : arg4);
    }

    @sprtea
    public static sprorn cfr_renamed_13031(String arg0, int arg1, int arg2) {
        return sprorn.cfr_renamed_13032(arg0, arg1, arg2, null);
    }

    @sprtea
    public int cfr_renamed_13033() {
        return this.cfr_renamed_91;
    }

    @sprtea
    public boolean cfr_renamed_13034() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public static sprorn cfr_renamed_13032(String arg0, int arg1, int arg2, int[] arg3) {
        return sprorn.cfr_renamed_13035(arg0, arg1, arg2, arg3, null);
    }

    @sprtea
    public static sprorn cfr_renamed_13036(String arg0, int arg1, int[] arg2) {
        return sprorn.cfr_renamed_13032(arg0, 0, arg1, arg2);
    }

    @sprtea
    public int[] cfr_renamed_13037() {
        return this.cfr_renamed_119;
    }

    @sprtea
    public static sprorn cfr_renamed_13038(String arg0, int[] arg1) {
        return sprorn.cfr_renamed_13032(arg0, 0, 0x5A7A7A7A, arg1);
    }

    @sprtea
    public int cfr_renamed_12994() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public void cfr_renamed_13039(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public void cfr_renamed_13040(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    @sprtea
    public static sprorn cfr_renamed_13035(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        return new sprorn(arg0, arg1, arg2, arg3, arg4);
    }

    @sprtea
    public int[] cfr_renamed_13041() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public boolean cfr_renamed_13042() {
        return this.cfr_renamed_3;
    }
}

