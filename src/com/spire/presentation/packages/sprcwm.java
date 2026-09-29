/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprro;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwo;

@sprtea
public class sprcwm
implements sprro {
    private spralq cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_12764(sprwo arg0) {
        this.cfr_renamed_3.put(arg0.getClass(), arg0);
    }

    @Override
    public int cfr_renamed_12589() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean cfr_renamed_12765(Class arg0) {
        return this.cfr_renamed_3.containsKey(arg0);
    }

    @Override
    public sprwo cfr_renamed_12690(Class arg0) {
        return (sprwo)this.cfr_renamed_3.get(arg0);
    }

    public sprcwm(int n) {
        this.cfr_renamed_4 = n;
        sprcwm sprcwm2 = this;
        this.cfr_renamed_3 = new spralq();
    }
}

