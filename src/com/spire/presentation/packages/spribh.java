/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprnug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class spribh
extends sprqqe {
    private final List<sprbvg> cfr_renamed_4;

    private /* synthetic */ spribh(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprbvg> arrayList = new ArrayList<sprbvg>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprbvg.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public static spribh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spribh) {
            return (spribh)arg0;
        }
        if (arg0 != null) {
            return new spribh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public List<sprbvg> cfr_renamed_8354() {
        return this.cfr_renamed_4;
    }

    public static sprnug cfr_renamed_7843() {
        return new sprnug();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        Iterator<sprbvg> iterator;
        sprrvm sprrvm2 = new sprrvm();
        Iterator<sprbvg> iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            sprbvg sprbvg2 = iterator.next();
            iterator2 = iterator;
            sprrvm2.cfr_renamed_5004(sprbvg2.cfr_renamed_119());
        }
        return new sprcen(sprrvm2);
    }

    public spribh(List<sprbvg> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }
}

