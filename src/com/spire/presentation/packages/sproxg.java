/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxxg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sproxg
extends sprqqe {
    private final List<sprxxg> cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return sprpch.cfr_renamed_8214(this.cfr_renamed_4);
    }

    private /* synthetic */ sproxg(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprxxg> arrayList = new ArrayList<sprxxg>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprxxg.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public sproxg(List<sprxxg> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public static sproxg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sproxg) {
            return (sproxg)arg0;
        }
        if (arg0 != null) {
            return new sproxg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public List<sprxxg> cfr_renamed_8355() {
        return this.cfr_renamed_4;
    }
}

