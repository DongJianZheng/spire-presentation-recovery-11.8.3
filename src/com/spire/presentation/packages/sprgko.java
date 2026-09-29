/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprgoo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprnvn;
import com.spire.presentation.packages.sprovy;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprgko
extends sprrzn {
    @sprtea
    public sprdz cfr_renamed_15889() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprovy.cfr_renamed_9("T\u0015a\u0000v\tx\u0004{\u0015"));
        sprvrx<sprgoo> sprvrx2 = new sprvrx<sprgoo>(sprdz2.size());
        sprgoo sprgoo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprgoo2 = new sprgoo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprgoo2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprgko(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprgko() {
        super(sprnvn.cfr_renamed_9("Srfgqn\u007fc|ra"));
    }

    @sprtea
    public sprgko cfr_renamed_15919(sprgoo arg0) {
        if (arg0 == null) {
            return this;
        }
        sprgko sprgko2 = this;
        sprgko2.cfr_renamed_15271(arg0);
        return sprgko2;
    }
}

