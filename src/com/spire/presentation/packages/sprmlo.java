/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprelo;
import com.spire.presentation.packages.sprhq;
import com.spire.presentation.packages.sprilo;
import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprmlo
extends sprrzn {
    public sprmlo() {
        super("Res");
    }

    public sprdz cfr_renamed_14727() {
        Iterator iterator;
        sprdz<sprnco> sprdz2 = this.cfr_renamed_2445();
        sprvrx<sprhq> sprvrx2 = new sprvrx<sprhq>(sprdz2.size());
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprhq sprhq2 = sprilo.cfr_renamed_15687((sprnco)iterator.next());
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprhq2);
        }
        return sprvrx2;
    }

    public sprmlo(sprnco arg0) {
        super(arg0);
    }

    public sprlgo cfr_renamed_15481() {
        String string = this.cfr_renamed_15482("BaseLoc");
        if (string == null) {
            string = "Res";
        }
        return sprlgo.cfr_renamed_141(string);
    }

    public sprmlo cfr_renamed_15235(sprlgo arg0) {
        sprmlo sprmlo2 = this;
        sprmlo2.cfr_renamed_15480("BaseLoc", arg0.toString());
        return sprmlo2;
    }

    public sprmlo cfr_renamed_15211(sprhq arg0) {
        this.cfr_renamed_15271((sprnco)((Object)arg0));
        return this;
    }

    public sprdz cfr_renamed_15191() {
        sprvrx<sprelo> sprvrx2 = new sprvrx<sprelo>();
        for (sprhq sprhq2 : this.cfr_renamed_14727()) {
            if (!(sprhq2 instanceof sprelo)) continue;
            sprvrx2.cfr_renamed_12808((sprelo)sprhq2);
        }
        return sprvrx2;
    }
}

