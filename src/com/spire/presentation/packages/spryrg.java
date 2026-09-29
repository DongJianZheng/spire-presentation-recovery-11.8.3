/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spriah;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtyg;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class spryrg
extends sprqqe {
    private final List<sprtyg> cfr_renamed_4;

    public static spriah cfr_renamed_7843() {
        return new spriah();
    }

    private /* synthetic */ spryrg(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprtyg> arrayList = new ArrayList<sprtyg>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprtyg.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        Iterator<sprtyg> iterator;
        sprrvm sprrvm2 = new sprrvm();
        Iterator<sprtyg> iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            sprrvm2.cfr_renamed_5004(iterator.next());
            iterator2 = iterator;
        }
        return new sprcen(sprrvm2);
    }

    public spryrg(List<sprtyg> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public List<sprtyg> cfr_renamed_8357() {
        return this.cfr_renamed_4;
    }

    public static spryrg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spryrg) {
            return (spryrg)arg0;
        }
        if (arg0 != null) {
            return new spryrg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

