/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprxfm;

public class sprdog {
    public static final sprdog cfr_renamed_3 = new sprdog(33023);
    private int cfr_renamed_4;

    public boolean cfr_renamed_2162() {
        return this.cfr_renamed_4 == sprdog.cfr_renamed_3.cfr_renamed_4;
    }

    public int cfr_renamed_2204() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_7295(sprdog arg0) {
        return (this.cfr_renamed_4 | arg0.cfr_renamed_2204() ^ this.cfr_renamed_4) != 0;
    }

    public sprdog(sprxfm sprxfm2) {
        this.cfr_renamed_4 = sprxfm2.cfr_renamed_1868();
    }

    public sprdog() {
        this(0);
    }

    public void cfr_renamed_7303(sprdog arg0) {
        this.cfr_renamed_4 |= arg0.cfr_renamed_2204();
    }

    public sprdog cfr_renamed_7307(sprdog arg0) {
        sprdog sprdog2;
        sprdog sprdog3 = sprdog2 = new sprdog();
        sprdog3.cfr_renamed_7303(new sprdog(this.cfr_renamed_4 & arg0.cfr_renamed_2204()));
        return sprdog3;
    }

    private /* synthetic */ sprdog(int n) {
        this.cfr_renamed_4 = n;
    }
}

