/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhnh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwdh;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprzch
extends sprqqe {
    private final List<sprwdh> cfr_renamed_4;

    public sprzch(List<sprwdh> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public List<sprwdh> cfr_renamed_8272() {
        return this.cfr_renamed_4;
    }

    public static sprzch cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzch) {
            return (sprzch)arg0;
        }
        if (arg0 != null) {
            return new sprzch(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprzch(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprwdh> arrayList = new ArrayList<sprwdh>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprwdh.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4.toArray(new sprwdh[0]));
    }

    public static sprhnh cfr_renamed_7843() {
        return new sprhnh();
    }
}

