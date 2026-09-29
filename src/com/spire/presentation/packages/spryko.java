/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcwda;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprsho;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvmp;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class spryko
extends sprrzn {
    @sprtea
    public spryko() {
        super(sprvmp.cfr_renamed_9("\f';#\u001d(2)("));
    }

    @sprtea
    public spryko(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public spryko cfr_renamed_15920(sprsho arg0) {
        if (arg0 == null) {
            return this;
        }
        spryko spryko2 = this;
        spryko2.cfr_renamed_15271(arg0);
        return spryko2;
    }

    @sprtea
    public sprdz cfr_renamed_15921() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprcwda.cfr_renamed_9("iWFV\\"));
        sprvrx<sprsho> sprvrx2 = new sprvrx<sprsho>(sprdz2.size());
        sprsho sprsho2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprsho2 = new sprsho(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprsho2);
        }
        return sprvrx2;
    }
}

