/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprhq;
import com.spire.presentation.packages.sprlbo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrya;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprwgaa;
import java.util.Iterator;

@sprtea
public class sprelo
extends sprrzn
implements sprhq {
    @sprtea
    public sprdz cfr_renamed_15191() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprrya.cfr_renamed_9(">\\\u0016G"));
        sprvrx<sprlbo> sprvrx2 = new sprvrx<sprlbo>(sprdz2.size());
        sprlbo sprlbo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprlbo2 = new sprlbo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprlbo2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprelo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprelo cfr_renamed_15192(sprlbo arg0) {
        if (arg0 == null) {
            return this;
        }
        if (arg0.cfr_renamed_6005() == null) {
            throw new IllegalArgumentException(sprwgaa.cfr_renamed_9("\u5b5d\u5f37\u63c5\u8fa5C\u0011\u4e07\u80a8\u4e30\u7a2f"));
        }
        sprelo sprelo2 = this;
        sprelo2.cfr_renamed_15271(arg0);
        return sprelo2;
    }

    @sprtea
    public sprelo() {
        super(sprrya.cfr_renamed_9("u\u0017]\f@"));
    }
}

