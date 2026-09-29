/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprmyg;
import com.spire.presentation.packages.sprovg;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprbtg
extends sprqqe {
    private final List<sprmyg> cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return sprpch.cfr_renamed_8214(this.cfr_renamed_4);
    }

    private /* synthetic */ sprbtg(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprmyg> arrayList = new ArrayList<sprmyg>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprmyg.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public static sprbtg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbtg) {
            return (sprbtg)arg0;
        }
        if (arg0 != null) {
            return new sprbtg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public List<sprmyg> cfr_renamed_8358() {
        return this.cfr_renamed_4;
    }

    public static sprovg cfr_renamed_7843() {
        return new sprovg();
    }

    public sprbtg(List<sprmyg> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }
}

