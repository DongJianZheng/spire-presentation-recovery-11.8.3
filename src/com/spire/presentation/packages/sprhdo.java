/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcdo;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprfmr;
import com.spire.presentation.packages.sprhml;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import java.util.Iterator;

@sprtea
public class sprhdo
extends sprrzn {
    @sprtea
    public sprhdo() {
        super(sprhml.cfr_renamed_9(":\u0017\u000e\u0017\u001a\u0017\u0006\u0011\r\u0001"));
    }

    @sprtea
    public sprdz cfr_renamed_12815() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprfmr.cfr_renamed_9("}\\I\\]\\AZJ"));
        sprvrx<sprcdo> sprvrx2 = new sprvrx<sprcdo>(sprdz2.size());
        sprcdo sprcdo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprcdo2 = new sprcdo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprcdo2);
        }
        return sprvrx2;
    }

    @sprtea
    public String cfr_renamed_15568() {
        return this.cfr_renamed_15482(sprhml.cfr_renamed_9("1\u0000\u0017\u000b\u0019%\u0017\u001c\u001a\u0007\u0016"));
    }

    @sprtea
    public boolean cfr_renamed_15569(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return false;
        }
        for (sprcdo sprcdo2 : this.cfr_renamed_12815()) {
            if (!arg0.equals(sprcdo2.cfr_renamed_15570().cfr_renamed_15253())) continue;
            return true;
        }
        return false;
    }

    @sprtea
    public sprhdo cfr_renamed_15571(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            sprhdo sprhdo2 = this;
            sprhdo2.cfr_renamed_15492(sprfmr.cfr_renamed_9("lQJZDtJMGVK"));
            return sprhdo2;
        }
        sprhdo sprhdo3 = this;
        sprhdo3.cfr_renamed_15480(sprhml.cfr_renamed_9("1\u0000\u0017\u000b\u0019%\u0017\u001c\u001a\u0007\u0016"), arg0);
        return sprhdo3;
    }

    @sprtea
    public sprhdo cfr_renamed_15572(sprcdo arg0) {
        if (arg0 == null) {
            return this;
        }
        sprhdo sprhdo2 = this;
        sprhdo2.cfr_renamed_15271(arg0);
        return sprhdo2;
    }

    @sprtea
    public sprhdo(sprnco arg0) {
        super(arg0);
    }
}

