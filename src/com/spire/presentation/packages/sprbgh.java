/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprglh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprymh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprbgh
extends sprqqe {
    private final List<sprymh> cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4.toArray(new sprymh[0]));
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    public static sprglh cfr_renamed_7843() {
        return new sprglh();
    }

    public List<sprymh> cfr_renamed_8324() {
        return this.cfr_renamed_4;
    }

    public static sprbgh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbgh) {
            return (sprbgh)arg0;
        }
        if (arg0 != null) {
            return new sprbgh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprbgh(List<sprymh> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    private /* synthetic */ sprbgh(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprymh> arrayList = new ArrayList<sprymh>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprymh.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }
}

