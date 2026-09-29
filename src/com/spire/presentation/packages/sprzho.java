/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcco;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprhq;
import com.spire.presentation.packages.spriko;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sproxfa;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprzho
extends sprrzn
implements sprhq {
    @sprtea
    public sprzho(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprdz cfr_renamed_15802() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sproxfa.cfr_renamed_9("@\bo\bq4s\u0006`\u0002"));
        sprvrx<sprcco> sprvrx2 = new sprvrx<sprcco>(sprdz2.size());
        sprcco sprcco2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprcco2 = new sprcco(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprcco2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprzho cfr_renamed_15803(sprcco arg0) {
        if (arg0 == null) {
            return this;
        }
        if (arg0.cfr_renamed_6005() == null) {
            throw new IllegalArgumentException(spriko.cfr_renamed_9("\u98bb\u825b\u7a5d\u95ddnm\u4e2a\u80d4\u4e1d\u7a53"));
        }
        sprzho sprzho2 = this;
        sprzho2.cfr_renamed_15271(arg0);
        return sprzho2;
    }

    @sprtea
    public sprzho() {
        super(sproxfa.cfr_renamed_9("$l\u000bl\u0015P\u0017b\u0004f\u0014"));
    }
}

