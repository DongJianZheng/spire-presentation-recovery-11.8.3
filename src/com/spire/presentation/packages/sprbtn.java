/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdso;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprjzn;
import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtrda;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprbtn
extends sprrzn {
    @sprtea
    public sprbtn(sprnco arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprbtn cfr_renamed_15486(String string, sprlgo sprlgo2) {
        void arg1;
        void arg0;
        return this.cfr_renamed_15487(new sprjzn((String)arg0, (sprlgo)arg1));
    }

    @sprtea
    public sprdz cfr_renamed_5363() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprdso.cfr_renamed_9("P\u0005z\t"));
        sprvrx<sprjzn> sprvrx2 = new sprvrx<sprjzn>(sprdz2.size());
        sprjzn sprjzn2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprjzn2 = new sprjzn(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprjzn2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprbtn cfr_renamed_15487(sprjzn arg0) {
        if (arg0 == null) {
            return this;
        }
        sprbtn sprbtn2 = this;
        sprbtn2.cfr_renamed_15271(arg0);
        return sprbtn2;
    }

    @sprtea
    public sprbtn() {
        super(sprtrda.cfr_renamed_9("\b3\"?\u00023=."));
    }
}

