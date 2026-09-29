/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraih;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdrg;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprlug
extends sprqqe {
    private final List<spraih> cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4.toArray(new sprco[0]));
    }

    public static sprlug cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlug) {
            return (sprlug)arg0;
        }
        if (arg0 != null) {
            return new sprlug(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprlug(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<spraih> arrayList = new ArrayList<spraih>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(spraih.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public static sprdrg cfr_renamed_7843() {
        return new sprdrg();
    }

    public sprlug(List<spraih> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public List<spraih> cfr_renamed_8363() {
        return this.cfr_renamed_4;
    }
}

