/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprlem;
import java.util.HashSet;
import java.util.Set;

public class sprxwl
implements sprhx {
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    private Set cfr_renamed_3;
    private Set cfr_renamed_4;

    public boolean cfr_renamed_4248() {
        return this.cfr_renamed_1;
    }

    public Set cfr_renamed_4262() {
        HashSet hashSet = new HashSet(this.cfr_renamed_3);
        hashSet.removeAll(this.cfr_renamed_4);
        return hashSet;
    }

    public void cfr_renamed_10894(sprlem arg0) {
        this.cfr_renamed_4.add(arg0);
    }

    @Override
    public sprhx cfr_renamed_461() {
        return null;
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
    }

    public void cfr_renamed_4264(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public sprxwl(Set set) {
        sprxwl sprxwl2 = this;
        this.cfr_renamed_4 = new HashSet();
        this.cfr_renamed_3 = set;
    }
}

