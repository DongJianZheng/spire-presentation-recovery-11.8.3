/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprmch;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprivg
extends sprqqe {
    private final List<sprmch> cfr_renamed_4;

    public List<sprmch> cfr_renamed_8361() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return sprpch.cfr_renamed_8214(this.cfr_renamed_4);
    }

    private /* synthetic */ sprivg(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprmch> arrayList = new ArrayList<sprmch>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprmch.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public sprivg(List<sprmch> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public static sprivg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprivg) {
            return (sprivg)arg0;
        }
        if (arg0 != null) {
            return new sprivg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

