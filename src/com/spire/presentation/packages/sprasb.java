/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbae;

public class sprasb {
    private int cfr_renamed_3;
    public static final sprasb cfr_renamed_4 = new sprasb(33023);

    public sprasb cfr_renamed_2205(sprasb arg0) {
        sprasb sprasb2;
        sprasb sprasb3 = sprasb2 = new sprasb();
        sprasb3.cfr_renamed_2177(new sprasb(this.cfr_renamed_3 & arg0.cfr_renamed_2204()));
        return sprasb3;
    }

    public sprasb() {
        this(0);
    }

    public sprasb(sprbae sprbae2) {
        this.cfr_renamed_3 = sprbae2.cfr_renamed_1868();
    }

    public boolean cfr_renamed_2162() {
        return this.cfr_renamed_3 == sprasb.cfr_renamed_4.cfr_renamed_3;
    }

    public int cfr_renamed_2204() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_2177(sprasb arg0) {
        this.cfr_renamed_3 |= arg0.cfr_renamed_2204();
    }

    public boolean cfr_renamed_2167(sprasb arg0) {
        return (this.cfr_renamed_3 | arg0.cfr_renamed_2204() ^ this.cfr_renamed_3) != 0;
    }

    private /* synthetic */ sprasb(int n) {
        this.cfr_renamed_3 = n;
    }
}

