/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabi;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtkc;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprweo;
import java.util.Iterator;

@sprtea
public class sprifo
extends sprrzn {
    @sprtea
    public sprifo cfr_renamed_15830(sprweo arg0) {
        sprifo sprifo2 = this;
        sprifo2.cfr_renamed_15271(arg0);
        return sprifo2;
    }

    @sprtea
    public String cfr_renamed_15831(String arg0) {
        sprdz sprdz2 = this.cfr_renamed_15832();
        String string = null;
        for (sprweo sprweo2 : sprdz2) {
            if (!arg0.equals(sprweo2.cfr_renamed_15833())) continue;
            string = sprweo2.cfr_renamed_97();
            return string;
        }
        return string;
    }

    @sprtea
    public sprifo cfr_renamed_15834(String arg0, String arg1) {
        sprweo sprweo2 = new sprweo(arg0, arg1);
        return this.cfr_renamed_15830(sprweo2);
    }

    @Override
    @sprtea
    public String cfr_renamed_15478() {
        return sprtkc.cfr_renamed_9("T=_ax.H/T6\u007f:O:H");
    }

    @sprtea
    public sprifo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprifo() {
        super(sprabi.cfr_renamed_9(">W\u000eV\u0012O9C\tC\u000e"));
    }

    @sprtea
    public sprdz cfr_renamed_15832() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprtkc.cfr_renamed_9("\u0018N(O4V\u001fZ/Z"));
        sprvrx<sprweo> sprvrx2 = new sprvrx<sprweo>(sprdz2.size());
        sprweo sprweo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprweo2 = new sprweo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprweo2);
        }
        return sprvrx2;
    }
}

