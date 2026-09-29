/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcwr;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprhq;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprskea;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxxn;
import java.util.Iterator;

@sprtea
public class sprmfo
extends sprrzn
implements sprhq {
    @sprtea
    public sprmfo() {
        super(sprskea.cfr_renamed_9("`iEltzVzIh"));
    }

    @sprtea
    public sprmfo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprdz cfr_renamed_15798() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprcwr.cfr_renamed_9("x~]{lmNmQ"));
        sprvrx<sprxxn> sprvrx2 = new sprvrx<sprxxn>(sprdz2.size());
        sprxxn sprxxn2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprxxn2 = new sprxxn(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprxxn2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprmfo cfr_renamed_15799(sprxxn arg0) {
        if (arg0 == null) {
            return this;
        }
        if (arg0.cfr_renamed_6005() == null) {
            throw new IllegalArgumentException(sprskea.cfr_renamed_9("\u7efc\u522d\u53e6\u656b\u63eb\u8febm_\u4e29\u80e6\u4e1e\u7a61"));
        }
        sprmfo sprmfo2 = this;
        sprmfo2.cfr_renamed_15271(arg0);
        return sprmfo2;
    }
}

