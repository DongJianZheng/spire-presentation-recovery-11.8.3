/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhbja;
import com.spire.presentation.packages.sprir;
import com.spire.presentation.packages.sprrw;
import com.spire.presentation.packages.sprtea;

@sprtea
public class spryxm
implements sprir {
    private sprhbja cfr_renamed_4;

    public void cfr_renamed_12497(Object arg0) {
        this.cfr_renamed_4 = (sprhbja)arg0;
    }

    @Override
    public void cfr_renamed_12498(sprir arg0) {
        if (arg0 == null) {
            return;
        }
        this.cfr_renamed_4.cfr_renamed_12499((sprhbja)arg0.cfr_renamed_12496());
    }

    public spryxm() {
        spryxm spryxm2 = this;
        spryxm2.cfr_renamed_4 = new sprhbja();
    }

    @Override
    public boolean cfr_renamed_12500(sprrw arg0) {
        if (arg0 == null) {
            throw new NullPointerException("layer");
        }
        throw new UnsupportedOperationException();
    }

    private /* synthetic */ spryxm(sprhbja sprhbja2) {
        this.cfr_renamed_4 = sprhbja2;
    }

    @Override
    public boolean cfr_renamed_12501(sprrw arg0) {
        if (arg0 == null) {
            throw new NullPointerException("layer");
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public sprir cfr_renamed_12099() {
        return new spryxm(this.cfr_renamed_4.cfr_renamed_12099());
    }

    @Override
    public Object cfr_renamed_12496() {
        return this.cfr_renamed_4;
    }
}

