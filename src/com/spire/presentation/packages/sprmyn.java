/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprheb;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvdaa;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprvzn;
import java.util.Iterator;

@sprtea
public class sprmyn
extends sprrzn {
    @sprtea
    public sprmyn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprmyn() {
        super(sprvdaa.cfr_renamed_9("\u001a[0G"));
    }

    @sprtea
    public sprdz cfr_renamed_15653() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprheb.cfr_renamed_9("=8\u0019+"));
        sprvrx<sprvzn> sprvrx2 = new sprvrx<sprvzn>(sprdz2.size());
        sprvzn sprvzn2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprvzn2 = new sprvzn(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprvzn2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprmyn cfr_renamed_15217(sprvzn arg0) {
        if (arg0 == null) {
            return this;
        }
        sprmyn sprmyn2 = this;
        sprmyn2.cfr_renamed_15271(arg0);
        return sprmyn2;
    }
}

