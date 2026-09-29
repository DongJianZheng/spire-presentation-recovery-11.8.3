/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhlh;
import com.spire.presentation.packages.sprqeh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprvkh
extends sprqqe {
    private final List<sprqeh> cfr_renamed_4;

    public static sprhlh cfr_renamed_7843() {
        return new sprhlh();
    }

    private /* synthetic */ sprvkh(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprqeh> arrayList = new ArrayList<sprqeh>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprqeh.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public static sprvkh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvkh) {
            return (sprvkh)arg0;
        }
        if (arg0 != null) {
            return new sprvkh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprvkh(List<sprqeh> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public List<sprqeh> cfr_renamed_8442() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4.toArray(new sprco[0]));
    }
}

