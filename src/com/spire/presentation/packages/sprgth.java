/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprxfm;

public class sprgth {
    private int cfr_renamed_3;
    public static final sprgth cfr_renamed_4 = new sprgth(33023);

    public sprgth() {
        this(0);
    }

    public boolean cfr_renamed_2162() {
        return this.cfr_renamed_3 == sprgth.cfr_renamed_4.cfr_renamed_3;
    }

    public void cfr_renamed_9082(sprgth arg0) {
        this.cfr_renamed_3 |= arg0.cfr_renamed_2204();
    }

    public sprgth(sprxfm sprxfm2) {
        this.cfr_renamed_3 = sprxfm2.cfr_renamed_1868();
    }

    public sprgth cfr_renamed_9088(sprgth arg0) {
        sprgth sprgth2;
        sprgth sprgth3 = sprgth2 = new sprgth();
        sprgth3.cfr_renamed_9082(new sprgth(this.cfr_renamed_3 & arg0.cfr_renamed_2204()));
        return sprgth3;
    }

    public int cfr_renamed_2204() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_9078(sprgth arg0) {
        return (this.cfr_renamed_3 | arg0.cfr_renamed_2204() ^ this.cfr_renamed_3) != 0;
    }

    private /* synthetic */ sprgth(int n) {
        this.cfr_renamed_3 = n;
    }
}

