/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprlwg
extends sprqqe {
    private final List<sproug> cfr_renamed_4;

    private /* synthetic */ sprlwg(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sproug> arrayList = new ArrayList<sproug>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprfvg.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public sprlwg(List<sproug> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public static sprlwg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlwg) {
            return (sprlwg)arg0;
        }
        if (arg0 != null) {
            return new sprlwg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        int n;
        sprrvm sprrvm2 = new sprrvm();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4.get(n++));
            n2 = n;
        }
        return new sprcen(sprrvm2);
    }

    public List<sproug> cfr_renamed_8360() {
        return this.cfr_renamed_4;
    }
}

