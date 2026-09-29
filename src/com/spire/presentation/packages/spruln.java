/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbin;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprywq;

@sprtea
public class spruln {
    private sprvrx cfr_renamed_3 = null;
    @sprtea
    public sprywq cfr_renamed_4;

    @sprtea
    public void cfr_renamed_12946(sprbin arg0) {
        this.cfr_renamed_12925().cfr_renamed_12927(arg0);
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_3.size();
    }

    public sprbin cfr_renamed_576(int arg0) {
        return spresca.cfr_renamed_11777(this.cfr_renamed_12925().cfr_renamed_12151(arg0), sprbin.class);
    }

    @sprtea
    public void cfr_renamed_2637() {
        spruln spruln2 = this;
        while (spruln2.cfr_renamed_12925().size() > 0) {
            spruln spruln3 = this;
            spruln2 = spruln3;
            spruln3.cfr_renamed_12946(spruln3.cfr_renamed_576(spruln3.cfr_renamed_12925().size() - 1));
        }
    }

    @sprtea
    public spruln() {
        spruln spruln2 = this;
        this.cfr_renamed_3 = new sprvrx();
    }

    @sprtea
    public void cfr_renamed_12913(sprbin arg0) {
        spruln spruln2 = this;
        sprbin sprbin2 = arg0;
        spruln2.cfr_renamed_12925().cfr_renamed_12808(sprbin2);
        sprbin2.cfr_renamed_12893(spruln2);
    }

    public sprbin cfr_renamed_12947(String arg0) {
        for (sprbin sprbin2 : this.cfr_renamed_3) {
            if (!sprraia.cfr_renamed_11730(sprbin2.cfr_renamed_12909(), arg0)) continue;
            return sprbin2;
        }
        return null;
    }

    @sprtea
    public sprdz cfr_renamed_12925() {
        return this.cfr_renamed_3;
    }
}

