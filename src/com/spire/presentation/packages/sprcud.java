/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprtzd;
import java.util.HashSet;
import java.util.Set;

public class sprcud
implements sprrj {
    private int cfr_renamed_1;
    private Set cfr_renamed_2;
    private Set cfr_renamed_3;
    private boolean cfr_renamed_4;

    public void cfr_renamed_4264(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public sprcud(Set set) {
        sprcud sprcud2 = this;
        this.cfr_renamed_2 = new HashSet();
        this.cfr_renamed_3 = set;
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
    }

    public void cfr_renamed_4247(sprtzd arg0) {
        this.cfr_renamed_2.add(arg0);
    }

    public Set cfr_renamed_4262() {
        HashSet hashSet = new HashSet(this.cfr_renamed_3);
        hashSet.removeAll(this.cfr_renamed_2);
        return hashSet;
    }

    public boolean cfr_renamed_4248() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprrj cfr_renamed_461() {
        return null;
    }
}

