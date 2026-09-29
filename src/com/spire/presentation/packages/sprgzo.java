/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjyo;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;

@sprtea
public class sprgzo {
    private sprjyo[] cfr_renamed_2;
    private sprjyo cfr_renamed_3;
    private long cfr_renamed_4;

    public static sprgzo cfr_renamed_18689(sprujo arg0, long arg1) {
        int n;
        arg0.cfr_renamed_14060().cfr_renamed_11547(arg1, 0);
        sprgzo sprgzo2 = new sprgzo();
        sprujo sprujo2 = arg0;
        int n2 = sprujo2.cfr_renamed_13218();
        int n3 = sprujo2.cfr_renamed_13218();
        sprgzo2.cfr_renamed_18690(new sprjyo[n3]);
        sprjyo[] sprjyoArray = sprgzo2.cfr_renamed_18691();
        int n4 = n = 0;
        while (n4 < (n3 & 0xFFFF)) {
            sprjyoArray[n++] = new sprjyo(arg0.cfr_renamed_13220(), arg0.cfr_renamed_13218());
            n4 = n;
        }
        if ((n2 & 0xFFFF) > 0) {
            sprgzo2.cfr_renamed_18692(new sprjyo(0L, n2));
            arg0.cfr_renamed_14060().cfr_renamed_11547(arg1 + (long)(n2 & 0xFFFF), 0);
            sprgzo2.cfr_renamed_18693().cfr_renamed_18694(arg0);
        }
        int n5 = n = 0;
        while (n5 < (n3 & 0xFFFF)) {
            sprjyo sprjyo2 = sprjyoArray[n];
            arg0.cfr_renamed_14060().cfr_renamed_11547(arg1 + (long)(sprjyo2.cfr_renamed_1 & 0xFFFF), 0);
            sprjyo2.cfr_renamed_18694(arg0);
            n5 = ++n;
        }
        return sprgzo2;
    }

    public void cfr_renamed_18695(long arg0) {
        this.cfr_renamed_4 = arg0;
    }

    private /* synthetic */ void cfr_renamed_18690(sprjyo[] arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public sprjyo cfr_renamed_18693() {
        return this.cfr_renamed_3;
    }

    public String cfr_renamed_18696() {
        return sprrzo.cfr_renamed_18658(this.cfr_renamed_18697());
    }

    private /* synthetic */ void cfr_renamed_18692(sprjyo arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprjyo[] cfr_renamed_18691() {
        return this.cfr_renamed_2;
    }

    public long cfr_renamed_18697() {
        return this.cfr_renamed_4;
    }
}

