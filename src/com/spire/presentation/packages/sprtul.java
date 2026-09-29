/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.sprug;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class sprtul<T>
implements sprug<T>,
sprse<T> {
    private Collection<T> cfr_renamed_4;

    @Override
    public Iterator<T> iterator() {
        return this.cfr_renamed_3216(null).iterator();
    }

    /*
     * WARNING - void declaration
     */
    public sprtul(Collection<T> collection) {
        void arg0;
        sprtul sprtul2 = this;
        sprtul2.cfr_renamed_4 = new ArrayList<T>(arg0);
    }

    @Override
    public Collection<T> cfr_renamed_3216(sprhd<T> arg0) {
        if (arg0 == null) {
            return new ArrayList<T>(this.cfr_renamed_4);
        }
        ArrayList<T> arrayList = new ArrayList<T>();
        for (T t : this.cfr_renamed_4) {
            if (!arg0.cfr_renamed_132(t)) continue;
            arrayList.add(t);
        }
        return arrayList;
    }
}

