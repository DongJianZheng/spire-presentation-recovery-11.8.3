/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprlhk;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprryn;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprwdj;
import java.util.Iterator;

@sprtea
public class sprlao
extends sprrzn {
    @sprtea
    public sprlao(sprryn sprryn2) {
        sprlao sprlao2 = this;
        sprlao2();
        sprlao2.cfr_renamed_15475(sprryn2);
    }

    @sprtea
    public sprlao(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprdz cfr_renamed_15476() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477("Version");
        sprvrx<sprryn> sprvrx2 = new sprvrx<sprryn>(sprdz2.size());
        sprryn sprryn2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprryn2 = new sprryn(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprryn2);
        }
        return sprvrx2;
    }

    @Override
    @sprtea
    public String cfr_renamed_15478() {
        return sprwdj.cfr_renamed_9("15:i\b6, 7<0 ");
    }

    @sprtea
    public sprlao() {
        super(sprlhk.cfr_renamed_9("vhR~IbN~"));
    }

    @sprtea
    public sprlao cfr_renamed_15475(sprryn arg0) {
        sprlao sprlao2 = this;
        sprlao2.cfr_renamed_15271(arg0);
        return sprlao2;
    }
}

