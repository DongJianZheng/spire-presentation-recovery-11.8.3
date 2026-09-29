/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdhba;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprnno;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprbno
extends sprrzn {
    @sprtea
    public sprbno() {
        super(sprdhba.cfr_renamed_9("'_\u0012U\tR\u0015"));
    }

    @sprtea
    public sprbno cfr_renamed_15969(sprnno arg0) {
        sprbno sprbno2 = this;
        sprbno2.cfr_renamed_15271(arg0);
        return sprbno2;
    }

    @sprtea
    public sprdz cfr_renamed_15592() {
        Iterator iterator;
        sprdz<sprnco> sprdz2 = this.cfr_renamed_2445();
        sprvrx<sprnno> sprvrx2 = new sprvrx<sprnno>(sprdz2.size());
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(new sprnno(sprnco2));
        }
        return sprvrx2;
    }

    @sprtea
    public sprbno(sprnco arg0) {
        super(arg0);
    }
}

