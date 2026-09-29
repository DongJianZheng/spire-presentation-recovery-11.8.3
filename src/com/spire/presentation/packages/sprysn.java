/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbw;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprilo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprvub;
import java.util.Iterator;

@sprtea
public class sprysn
extends sprrzn
implements sprbw {
    public sprysn(sprnco arg0) {
        super(arg0);
    }

    public sprysn() {
        this(sprvub.cfr_renamed_9("\u0001\n6\u000e\u0013\u0007>\b:"));
    }

    public sprysn cfr_renamed_15197(sprbw arg0) {
        this.cfr_renamed_15271((sprrzn)((Object)arg0));
        return this;
    }

    public sprdz cfr_renamed_15819() {
        Iterator iterator;
        sprvrx<sprbw> sprvrx2 = new sprvrx<sprbw>(this.cfr_renamed_2445().size());
        Iterator iterator2 = iterator = this.cfr_renamed_2445().iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprilo.cfr_renamed_15688(sprnco2));
        }
        return sprvrx2;
    }

    @sprtea
    public sprysn(String arg0) {
        super(arg0);
    }
}

