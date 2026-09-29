/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbh;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprezg
extends sprqqe {
    private final List<sprbbh> cfr_renamed_4;

    public sprezg(List<sprbbh> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public List<sprbbh> cfr_renamed_8356() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return sprpch.cfr_renamed_8214(this.cfr_renamed_4);
    }

    public static sprezg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprezg) {
            return (sprezg)arg0;
        }
        if (arg0 != null) {
            return new sprezg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprezg(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprbbh> arrayList = new ArrayList<sprbbh>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprbbh.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }
}

