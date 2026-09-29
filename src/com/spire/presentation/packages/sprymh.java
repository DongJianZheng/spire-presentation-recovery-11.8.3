/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprmkh;
import com.spire.presentation.packages.sprofh;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprpnn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sprymh
extends sprqqe {
    private final List<sprofh> cfr_renamed_3;
    private final sprmkh cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = sprpch.cfr_renamed_8214(this.cfr_renamed_3);
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprymh(sprmkh sprmkh2, List<sprofh> list) {
        void arg0;
        sprymh sprymh2 = this;
        sprymh2.cfr_renamed_4 = arg0;
        sprymh2.cfr_renamed_3 = list;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprymh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprpnn.cfr_renamed_9("p}e`vqpa5vpt``{fp%flo`5js%'"));
        }
        this.cfr_renamed_4 = sprmkh.cfr_renamed_23(arg0.cfr_renamed_85(0));
        Iterator<sprco> iterator = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1)).iterator();
        ArrayList<sprofh> arrayList = new ArrayList<sprofh>();
        Iterator<sprco> iterator2 = iterator;
        while (iterator2.hasNext()) {
            Iterator<sprco> iterator3 = iterator;
            iterator2 = iterator3;
            arrayList.add(sprofh.cfr_renamed_23(iterator3.next()));
        }
        this.cfr_renamed_3 = Collections.unmodifiableList(arrayList);
    }

    public static sprymh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprymh) {
            return (sprymh)arg0;
        }
        if (arg0 != null) {
            return new sprymh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprmkh cfr_renamed_8304() {
        return this.cfr_renamed_4;
    }

    public List<sprofh> cfr_renamed_8325() {
        return this.cfr_renamed_3;
    }
}

