/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprny;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import java.util.Iterator;

@sprtea
public class sprvmn
implements Iterable {
    private sprwvn cfr_renamed_4;

    public void cfr_renamed_12774(sprny arg0) {
        if (this.cfr_renamed_4.contains(arg0)) {
            this.cfr_renamed_4.remove(arg0);
        }
    }

    public sprvmn() {
        sprvmn sprvmn2 = this;
        sprvmn2.cfr_renamed_4 = new sprwvn();
    }

    public void cfr_renamed_12148(int arg0) {
        if (this.cfr_renamed_11861() > arg0) {
            this.cfr_renamed_4.remove(arg0);
        }
    }

    public sprny cfr_renamed_576(int arg0) {
        if (this.cfr_renamed_11861() > 0) {
            return (sprny)this.cfr_renamed_4.get(arg0);
        }
        return null;
    }

    public Iterator iterator() {
        return this.cfr_renamed_4.iterator();
    }

    public sprny cfr_renamed_12775() {
        sprvmn sprvmn2 = this;
        return sprvmn2.cfr_renamed_576(sprvmn2.cfr_renamed_11861() - 1);
    }

    public void cfr_renamed_12776(sprny arg0) {
        sprovja.cfr_renamed_11658(this.cfr_renamed_4, arg0);
    }

    public void cfr_renamed_722() {
        this.cfr_renamed_4.clear();
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_4.size();
    }
}

