/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprltg;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrfh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprdvg
extends sprqqe {
    private final List<sprrfh> cfr_renamed_4;

    public List<sprrfh> cfr_renamed_8326() {
        return this.cfr_renamed_4;
    }

    public static sprltg cfr_renamed_7843() {
        return new sprltg();
    }

    public sprdvg(List<sprrfh> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4.toArray(new sprco[0]));
    }

    private /* synthetic */ sprdvg(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprrfh> arrayList = new ArrayList<sprrfh>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprrfh.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public static sprdvg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdvg) {
            return (sprdvg)arg0;
        }
        if (arg0 != null) {
            return new sprdvg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

