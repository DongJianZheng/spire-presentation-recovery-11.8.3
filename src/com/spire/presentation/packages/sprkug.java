/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzsg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprkug
extends sprqqe {
    private final List<sprjfh> cfr_renamed_4;

    public List<sprjfh> cfr_renamed_8362() {
        return this.cfr_renamed_4;
    }

    public static sprzsg cfr_renamed_7843() {
        return new sprzsg();
    }

    public sprkug(List<sprjfh> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public static sprkug cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkug) {
            return (sprkug)arg0;
        }
        if (arg0 != null) {
            return new sprkug(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprkug(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprjfh> arrayList = new ArrayList<sprjfh>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprjfh.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4.toArray(new sprco[0]));
    }
}

