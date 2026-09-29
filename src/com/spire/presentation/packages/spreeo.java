/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprfgo;
import com.spire.presentation.packages.sprkhb;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class spreeo
extends sprrzn {
    @sprtea
    public spreeo cfr_renamed_15246(sprfgo arg0) {
        spreeo spreeo2 = this;
        spreeo2.cfr_renamed_15271(arg0);
        return spreeo2;
    }

    @sprtea
    public spreeo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprfgo cfr_renamed_15805(int arg0) {
        return (sprfgo)this.cfr_renamed_14426().cfr_renamed_12151(arg0);
    }

    @sprtea
    public sprdz cfr_renamed_14426() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprkhb.cfr_renamed_9("N\u0005y\u0001"));
        sprvrx<sprfgo> sprvrx2 = new sprvrx<sprfgo>(sprdz2.size());
        sprfgo sprfgo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprfgo2 = new sprfgo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprfgo2);
        }
        return sprvrx2;
    }

    @sprtea
    public spreeo() {
        super("Pages");
    }

    @sprtea
    public int cfr_renamed_2773() {
        return this.cfr_renamed_2445().size();
    }
}

