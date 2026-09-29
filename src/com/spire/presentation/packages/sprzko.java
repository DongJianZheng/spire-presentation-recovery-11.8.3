/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraie;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprexo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprpfo;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprzko
extends sprrzn {
    @sprtea
    public static final String cfr_renamed_3 = "OFD";
    @sprtea
    public static final String cfr_renamed_4 = "1.0";

    @Override
    @sprtea
    public String cfr_renamed_15478() {
        return spraie.cfr_renamed_9("%=.a\u0005\u001d\u000e");
    }

    @sprtea
    public sprdz cfr_renamed_15827() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprexo.cfr_renamed_9("b\nE'I\u0001_"));
        sprvrx<sprpfo> sprvrx2 = new sprvrx<sprpfo>(sprdz2.size());
        sprpfo sprpfo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprpfo2 = new sprpfo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprpfo2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprzko(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprzko(sprpfo sprpfo2) {
        sprzko sprzko2 = this;
        sprzko2();
        sprzko2.cfr_renamed_15271(sprpfo2);
    }

    @sprtea
    public sprpfo cfr_renamed_15364() {
        sprnco sprnco2 = this.cfr_renamed_15494(spraie.cfr_renamed_9("\u000e4)\u0019%?3"));
        if (sprnco2 == null) {
            return null;
        }
        return new sprpfo(sprnco2);
    }

    @sprtea
    public sprpfo cfr_renamed_15828(int arg0) {
        return (sprpfo)this.cfr_renamed_15827().cfr_renamed_12151(arg0);
    }

    @sprtea
    public sprzko cfr_renamed_15230(sprpfo arg0) {
        sprzko sprzko2 = this;
        sprzko2.cfr_renamed_15271(arg0);
        return sprzko2;
    }

    @sprtea
    public String cfr_renamed_3() {
        return cfr_renamed_4;
    }

    @sprtea
    public sprzko() {
        sprzko sprzko2 = this;
        super(cfr_renamed_3);
        sprzko2.cfr_renamed_15480("Version", cfr_renamed_4);
        sprzko2.cfr_renamed_15480(sprexo.cfr_renamed_9("b\nE1_\u0015C"), cfr_renamed_3);
    }

    @sprtea
    public String cfr_renamed_15829() {
        return cfr_renamed_3;
    }

    @sprtea
    public sprzko(sprdz sprdz2) {
        this();
        for (sprpfo sprpfo2 : sprdz2) {
            if (sprpfo2 == null) continue;
            this.cfr_renamed_15271(sprpfo2);
        }
    }
}

