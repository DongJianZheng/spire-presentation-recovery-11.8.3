/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqap;
import com.spire.presentation.packages.sprqjo;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprklo
extends sprrzn {
    @sprtea
    public sprklo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprklo() {
        super(sprqap.cfr_renamed_9("L_a[cQ|[}"));
    }

    @sprtea
    public sprdz cfr_renamed_15881() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15681("Bookmark");
        sprvrx<sprqjo> sprvrx2 = new sprvrx<sprqjo>(sprdz2.size());
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprqjo sprqjo2 = new sprqjo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprqjo2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprklo cfr_renamed_15912(sprqjo arg0) {
        sprklo sprklo2 = this;
        sprklo2.cfr_renamed_15271(arg0);
        return sprklo2;
    }
}

