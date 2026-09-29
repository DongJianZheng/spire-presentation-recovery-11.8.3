/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprhq;
import com.spire.presentation.packages.sprkbz;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqko;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxun;
import java.util.Iterator;

@sprtea
public class sprrno
extends sprrzn
implements sprhq {
    @sprtea
    public sprrno() {
        super(sprkbz.cfr_renamed_9("NToUjlfEj@p"));
    }

    @sprtea
    public sprdz cfr_renamed_15797() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprxun.cfr_renamed_9("m*L+I\u0012E;I>"));
        sprvrx<sprqko> sprvrx2 = new sprvrx<sprqko>(sprdz2.size());
        sprqko sprqko2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprqko2 = new sprqko(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprqko2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprrno(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprrno cfr_renamed_15266(sprqko arg0) {
        if (arg0 == null) {
            return this;
        }
        if (arg0.cfr_renamed_6005() == null) {
            throw new IllegalArgumentException(sprkbz.cfr_renamed_9("\u5919\u5ab3\u4f50\u8d65\u6e93\u63ee\u8ff3hG\u4e2c\u80fe\u4e1b\u7a79"));
        }
        sprrno sprrno2 = this;
        sprrno2.cfr_renamed_15271(arg0);
        return sprrno2;
    }
}

