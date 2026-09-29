/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfxg;
import com.spire.presentation.packages.sprnsg;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprhwg
extends sprqqe {
    private final List<sprfxg> cfr_renamed_4;

    public List<sprfxg> cfr_renamed_8359() {
        return this.cfr_renamed_4;
    }

    public static sprnsg cfr_renamed_7843() {
        return new sprnsg();
    }

    public sprhwg(List<sprfxg> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public static sprhwg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhwg) {
            return (sprhwg)arg0;
        }
        if (arg0 != null) {
            return new sprhwg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return sprpch.cfr_renamed_8214(this.cfr_renamed_4);
    }

    private /* synthetic */ sprhwg(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprfxg> arrayList = new ArrayList<sprfxg>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprfxg.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }
}

