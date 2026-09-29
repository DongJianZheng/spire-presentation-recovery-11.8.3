/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.spreco;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprnkr;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprdwn
extends sprrzn {
    @sprtea
    public sprdwn cfr_renamed_15748(spreco arg0) {
        if (arg0 == null) {
            return this;
        }
        sprdwn sprdwn2 = this;
        sprdwn2.cfr_renamed_15271(arg0);
        return sprdwn2;
    }

    @sprtea
    public sprdwn() {
        super(sprnkr.cfr_renamed_9("(t\u0019i\u0003\u007f\u0004c\u0003\u007f"));
    }

    @sprtea
    public sprdwn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprdz cfr_renamed_98() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477("Extension");
        sprvrx<spreco> sprvrx2 = new sprvrx<spreco>(sprdz2.size());
        spreco spreco2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            spreco2 = new spreco(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(spreco2);
        }
        return sprvrx2;
    }
}

