/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spretc;
import com.spire.presentation.packages.sprgrn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvq;
import com.spire.presentation.packages.sprwvn;
import java.util.Iterator;

@sprtea
public abstract class sprkon
implements sprvq {
    private sprwvn cfr_renamed_3;
    private sprvq cfr_renamed_4;

    public int cfr_renamed_13933(sprvq arg0) {
        sprkon sprkon2 = this;
        arg0.cfr_renamed_13934(sprkon2);
        return sprovja.cfr_renamed_11658(sprkon2.cfr_renamed_3, arg0);
    }

    public sprvq cfr_renamed_576(int arg0) {
        return (sprvq)this.cfr_renamed_3.get(arg0);
    }

    public int cfr_renamed_13935(sprvq arg0) {
        return this.cfr_renamed_3.indexOf(arg0);
    }

    @Override
    public void cfr_renamed_13928(sprgrn arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_3.iterator();
        while (iterator2.hasNext()) {
            ((sprvq)iterator.next()).cfr_renamed_13928(arg0);
            iterator2 = iterator;
        }
    }

    public void cfr_renamed_722() {
        this.cfr_renamed_3.clear();
    }

    @Override
    public sprvq cfr_renamed_13936() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_12148(int arg0) {
        if (0 > arg0 || arg0 >= this.cfr_renamed_3.size()) {
            throw new IllegalArgumentException(spretc.cfr_renamed_9("3x\u0011x\u000e|\u0017|\u00119\rx\u000e|Y9\nw\u0007|\u001b"));
        }
        this.cfr_renamed_3.remove(arg0);
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_3.size();
    }

    @Override
    public void cfr_renamed_13934(sprvq arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_13937(int arg0, sprvq arg1) {
        sprkon sprkon2 = this;
        arg1.cfr_renamed_13934(sprkon2);
        sprkon2.cfr_renamed_3.add(arg0, arg1);
    }

    public sprkon() {
        sprkon sprkon2 = this;
        sprkon2.cfr_renamed_3 = new sprwvn();
    }
}

