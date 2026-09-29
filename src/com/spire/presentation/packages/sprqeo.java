/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdab;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprlwy;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtgo;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprqeo
extends sprrzn {
    @sprtea
    public sprqeo() {
        super(sprlwy.cfr_renamed_9("u\u0010E\u0011Y\bb\u0004Q\u0016"));
    }

    @sprtea
    public sprdz cfr_renamed_15763() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprdab.cfr_renamed_9("Q4a5},F u"));
        sprvrx<sprtgo> sprvrx2 = new sprvrx<sprtgo>(sprdz2.size());
        sprtgo sprtgo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprtgo2 = new sprtgo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprtgo2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprqeo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprqeo cfr_renamed_15764(sprtgo arg0) {
        if (arg0 == null) {
            return this;
        }
        sprqeo sprqeo2 = this;
        sprqeo2.cfr_renamed_15271(arg0);
        return sprqeo2;
    }
}

