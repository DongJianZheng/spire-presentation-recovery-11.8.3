/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmo;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprtyba;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprnko
extends sprrzn {
    @sprtea
    public sprnko cfr_renamed_15942(sprcmo arg0) {
        if (arg0 == null) {
            return this;
        }
        sprnko sprnko2 = this;
        sprnko2.cfr_renamed_15271(arg0);
        return sprnko2;
    }

    @sprtea
    public sprdz cfr_renamed_14426() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprtsa.cfr_renamed_9(",I\u001bM"));
        sprvrx<sprcmo> sprvrx2 = new sprvrx<sprcmo>(sprdz2.size());
        sprcmo sprcmo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprcmo2 = new sprcmo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprcmo2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprnko(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprcmo cfr_renamed_15943(String arg0) {
        for (sprcmo sprcmo2 : this.cfr_renamed_14426()) {
            if (!sprcmo2.cfr_renamed_15924().toString().equals(arg0)) continue;
            return sprcmo2;
        }
        return null;
    }

    @sprtea
    public sprnko() {
        super(sprtyba.cfr_renamed_9("\u0004\u0007+\u00061\b1\u0000*\u00076"));
    }
}

