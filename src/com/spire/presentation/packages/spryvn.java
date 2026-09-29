/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqvn;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruhj;
import com.spire.presentation.packages.spruwn;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class spryvn
extends sprrzn {
    @sprtea
    public spryvn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprdz cfr_renamed_15653() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprqvn.cfr_renamed_9("Ogkt"));
        sprvrx<spruwn> sprvrx2 = new sprvrx<spruwn>(sprdz2.size());
        spruwn spruwn2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            spruwn2 = new spruwn(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(spruwn2);
        }
        return sprvrx2;
    }

    @sprtea
    public spryvn cfr_renamed_15721(spruwn arg0) {
        if (arg0 == null) {
            return this;
        }
        spryvn spryvn2 = this;
        spryvn2.cfr_renamed_15271(arg0);
        return spryvn2;
    }

    @sprtea
    public spryvn() {
        super(spruhj.cfr_renamed_9("4?\u00013\t4"));
    }
}

