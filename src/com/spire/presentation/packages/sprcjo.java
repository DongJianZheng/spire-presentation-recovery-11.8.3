/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprgxha;
import com.spire.presentation.packages.sprino;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruci;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprcjo
extends sprrzn
implements Iterable {
    @sprtea
    public sprcjo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprdz cfr_renamed_15822() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(spruci.cfr_renamed_9("I#r:o8c\u0013j3k"));
        sprvrx<sprino> sprvrx2 = new sprvrx<sprino>(sprdz2.size());
        sprino sprino2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprino2 = new sprino(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprino2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprcjo() {
        super(sprgxha.cfr_renamed_9("3i\bp\u0015r\u0019o"));
    }

    public Iterator iterator() {
        return this.cfr_renamed_15822().cfr_renamed_12162();
    }

    @sprtea
    public sprcjo cfr_renamed_15823(sprino arg0) {
        sprcjo sprcjo2 = this;
        sprcjo2.cfr_renamed_15271(arg0);
        return sprcjo2;
    }
}

