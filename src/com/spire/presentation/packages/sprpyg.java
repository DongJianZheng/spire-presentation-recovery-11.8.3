/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdsg;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprpyg
extends sprqqe
implements spryd {
    private final List<sprdsg> cfr_renamed_4;

    public static sprpyg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpyg) {
            return (sprpyg)arg0;
        }
        if (arg0 != null) {
            return new sprpyg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public List<sprdsg> cfr_renamed_8373() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprpyg(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprdsg> arrayList = new ArrayList<sprdsg>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprdsg.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return sprpch.cfr_renamed_8214(this.cfr_renamed_4);
    }

    public sprpyg(List<sprdsg> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }
}

