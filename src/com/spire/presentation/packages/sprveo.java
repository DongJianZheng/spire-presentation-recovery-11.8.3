/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprhq;
import com.spire.presentation.packages.spriad;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprroo;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprsjo;
import com.spire.presentation.packages.sprsva;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprveo
extends sprrzn
implements sprhq {
    @sprtea
    public sprdz cfr_renamed_15800() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(spriad.cfr_renamed_9("\u001d\u001b3\u00041\u00077\u0000;3,\u0015.\u001c7\u0017\u000b\u001a7\u0000"));
        sprvrx<sprroo> sprvrx2 = new sprvrx<sprroo>(sprdz2.size());
        sprroo sprroo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprroo2 = new sprroo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprroo2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprveo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprveo cfr_renamed_15801(sprroo arg0) {
        if (arg0 == null) {
            return this;
        }
        if (arg0.cfr_renamed_6005() == null) {
            throw new IllegalArgumentException(sprsva.cfr_renamed_9("\u7785\u91b3\u5699\u50b3\u8d23\u6eec\u63a8\u8f8c.8\u4e6a\u8081\u4e5d\u7a06"));
        }
        arg0.cfr_renamed_15585(new sprsjo(spriad.cfr_renamed_9("\u001d\u001b3\u00041\u00077\u0000;3,\u0015.\u001c7\u0017\u000b\u001a7\u0000")));
        sprveo sprveo2 = this;
        sprveo2.cfr_renamed_15271(arg0);
        return sprveo2;
    }

    @sprtea
    public sprveo(String arg0) {
        super(arg0);
    }
}

