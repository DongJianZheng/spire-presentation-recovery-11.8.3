/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlfh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sproeh
extends sprqqe {
    private final List<sprlfh> cfr_renamed_4;

    public List<sprlfh> cfr_renamed_4171() {
        return this.cfr_renamed_4;
    }

    public static sproeh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sproeh) {
            return (sproeh)arg0;
        }
        if (arg0 != null) {
            return new sproeh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sproeh(List<sprlfh> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public static sprsjh cfr_renamed_7843() {
        return new sprsjh();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        Iterator<sprlfh> iterator;
        sprrvm sprrvm2 = new sprrvm();
        Iterator<sprlfh> iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            sprlfh sprlfh2 = iterator.next();
            iterator2 = iterator;
            sprrvm2.cfr_renamed_5004(sprlfh2);
        }
        return new sprcen(sprrvm2);
    }

    private /* synthetic */ sproeh(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprlfh> arrayList = new ArrayList<sprlfh>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprlfh.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }
}

