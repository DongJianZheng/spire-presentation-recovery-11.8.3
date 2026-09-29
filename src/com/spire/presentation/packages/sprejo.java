/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprpaba;
import com.spire.presentation.packages.sprpzy;
import com.spire.presentation.packages.sprqno;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprejo
extends sprrzn {
    @sprtea
    public sprejo cfr_renamed_15245(sprqno arg0) {
        if (arg0.cfr_renamed_15537() == null) {
            throw new IllegalArgumentException(sprpaba.cfr_renamed_9("\u5287\u516e\u76a3\u56f5\u5c65\u5bf2\u8c46\uff03d_xGFrBy\uff2e\u6caa\u672e\u8bb5\u7f49Bc\u5c55\u6000"));
        }
        sprejo sprejo2 = this;
        sprejo2.cfr_renamed_15271(arg0);
        return sprejo2;
    }

    @sprtea
    public sprejo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprdz cfr_renamed_1134() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprpzy.cfr_renamed_9("{>N:E"));
        sprvrx<sprqno> sprvrx2 = new sprvrx<sprqno>(sprdz2.size());
        sprqno sprqno2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprqno2 = new sprqno(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprqno2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprejo() {
        super(sprpaba.cfr_renamed_9("ddI\u007fBeS"));
    }
}

