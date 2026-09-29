/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprgyn;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvio;
import com.spire.presentation.packages.sprvoo;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprywe;
import java.util.Iterator;

@sprtea
public class sprnxn
extends sprrzn {
    @sprtea
    public sprnxn() {
        super(sprvoo.cfr_renamed_9("\n662.#?"));
    }

    @sprtea
    public sprdz cfr_renamed_15609() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprywe.cfr_renamed_9("\u001a\u0005"));
        sprvrx<sprgyn> sprvrx2 = new sprvrx<sprgyn>(sprdz2.size());
        sprgyn sprgyn2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprgyn2 = new sprgyn(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprgyn2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprvio cfr_renamed_15610(Integer arg0) {
        return this.cfr_renamed_15611(arg0).cfr_renamed_12553();
    }

    @sprtea
    public sprgyn cfr_renamed_15611(Integer arg0) {
        if (arg0 == null || arg0 < 0) {
            throw new NumberFormatException(sprvoo.cfr_renamed_9("\u00139>2\"w\u5f9f\u982c\u597d\u4ed9\u7b13\u4ed9j"));
        }
        sprdz<sprnco> sprdz2 = this.cfr_renamed_2445();
        if (arg0 >= sprdz2.size()) {
            throw new IndexOutOfBoundsException(new StringBuilder().insert(0, sprywe.cfr_renamed_9("\u98d7\u5bc3\u4e1a\u4f14\u7f3d\u98c5\u8221\u4e54\u5b0b\u5771s\u0010==6!\uff49")).append(arg0).toString());
        }
        return new sprgyn(sprdz2.cfr_renamed_12151(arg0));
    }

    @sprtea
    public sprnxn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprnxn cfr_renamed_15612(sprgyn arg0) {
        sprnxn sprnxn2 = this;
        sprnxn2.cfr_renamed_15271(arg0);
        return sprnxn2;
    }
}

