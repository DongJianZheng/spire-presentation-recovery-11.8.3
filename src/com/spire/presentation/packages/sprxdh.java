/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjgh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxhh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprxdh
extends sprqqe {
    private final List<sprjgh> cfr_renamed_4;

    private /* synthetic */ sprxdh(sprszm arg0) {
        Iterator<sprco> iterator;
        ArrayList<sprjgh> arrayList = new ArrayList<sprjgh>();
        Iterator<sprco> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprjgh.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprcen(this.cfr_renamed_4.toArray(new sprco[0]));
    }

    public static sprxdh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxdh) {
            return (sprxdh)arg0;
        }
        if (arg0 != null) {
            return new sprxdh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprxhh cfr_renamed_7843() {
        return new sprxhh();
    }

    public List<sprjgh> cfr_renamed_8443() {
        return this.cfr_renamed_4;
    }

    public sprxdh(List<sprjgh> list) {
        this.cfr_renamed_4 = Collections.unmodifiableList(list);
    }
}

