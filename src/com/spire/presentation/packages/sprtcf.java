/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public final class sprtcf {
    private int cfr_renamed_3;
    private final int[] cfr_renamed_4;

    public final sprtcf cfr_renamed_461() {
        sprtcf sprtcf2 = this;
        return new sprtcf(sprtcf2.cfr_renamed_4, sprtcf2.cfr_renamed_3);
    }

    public final sprtcf cfr_renamed_5604(int arg0) {
        sprtcf sprtcf2 = this;
        return new sprtcf(sprtcf2.cfr_renamed_4, sprtcf2.cfr_renamed_3 + arg0);
    }

    public final int cfr_renamed_5605(int arg0, int arg1) {
        sprtcf sprtcf2 = this;
        int n = arg1;
        sprtcf2.cfr_renamed_4[sprtcf2.cfr_renamed_3 + arg0] = n;
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprtcf(int[] nArray, int n) {
        void arg0;
        sprtcf sprtcf2 = this;
        sprtcf2.cfr_renamed_4 = arg0;
        sprtcf2.cfr_renamed_3 = n;
    }

    public final int cfr_renamed_1032(int arg0) {
        sprtcf sprtcf2 = this;
        return sprtcf2.cfr_renamed_4[sprtcf2.cfr_renamed_3 + arg0];
    }

    public final int cfr_renamed_5606(int arg0, long arg1) {
        sprtcf sprtcf2 = this;
        int n = (int)arg1;
        sprtcf2.cfr_renamed_4[sprtcf2.cfr_renamed_3 + arg0] = n;
        return n;
    }

    public final void cfr_renamed_5607(int arg0) {
        this.cfr_renamed_3 += arg0;
    }
}

