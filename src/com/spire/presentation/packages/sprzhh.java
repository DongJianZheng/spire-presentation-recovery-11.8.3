/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprehh;
import com.spire.presentation.packages.sprmhh;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprzhh
extends sprqqe {
    private final List<sprmhh> cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return sprpch.cfr_renamed_8214(this.cfr_renamed_4);
    }

    public sprzhh(List<sprmhh> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }

    public static sprzhh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzhh) {
            return (sprzhh)arg0;
        }
        if (arg0 != null) {
            return new sprzhh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprzhh(sprszm sprszm2) {
        Iterator<sprco> iterator = sprszm2.iterator();
        ArrayList<sprmhh> arrayList = new ArrayList<sprmhh>();
        Iterator<sprco> iterator2 = iterator;
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprmhh.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public static sprehh cfr_renamed_7843() {
        return new sprehh();
    }

    public List<sprmhh> cfr_renamed_617() {
        return this.cfr_renamed_4;
    }
}

