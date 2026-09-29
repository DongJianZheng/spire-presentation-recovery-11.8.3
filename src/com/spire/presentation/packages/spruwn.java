/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprkco;
import com.spire.presentation.packages.sprltn;
import com.spire.presentation.packages.sprlwn;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprntn;
import com.spire.presentation.packages.sprosn;
import com.spire.presentation.packages.sprrbo;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprsdp;
import com.spire.presentation.packages.sprsfo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruci;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxdo;
import java.util.Iterator;

@sprtea
public class spruwn
extends sprrzn {
    @sprtea
    public sprdz cfr_renamed_15722() {
        sprdz<sprnco> sprdz2 = this.cfr_renamed_2445();
        sprvrx<sprrbo> sprvrx2 = new sprvrx<sprrbo>(sprdz2.size());
        Iterator iterator = sprdz2.iterator();
        if (iterator.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            String string = sprnco2.cfr_renamed_15478();
            if (spruci.cfr_renamed_9("9`2<\u001bi c").equals(string)) {
                sprvrx2.cfr_renamed_12808(new sprntn(sprnco2));
            } else if (sprsdp.cfr_renamed_9("\u0016N\u001d\u00125A\u0017M").equals(string)) {
                sprvrx2.cfr_renamed_12808(new sprxdo(sprnco2));
            } else if (spruci.cfr_renamed_9("i0blW#g2t7r?e\u0014c,o3t").equals(string)) {
                sprvrx2.cfr_renamed_12808(new sprltn(sprnco2));
            } else if (sprsdp.cfr_renamed_9("G\u001fLCk\fJ\u0010K;M\u0003A\u001cZ").equals(string)) {
                sprvrx2.cfr_renamed_12808(new sprkco(sprnco2));
            } else if (spruci.cfr_renamed_9("i0blG$e").equals(string)) {
                sprvrx2.cfr_renamed_12808(new sprosn(sprnco2));
            } else if (sprsdp.cfr_renamed_9("G\u001fLCk\u0015G\nM").equals(string)) {
                sprvrx2.cfr_renamed_12808(new sprlwn(sprnco2));
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, spruci.cfr_renamed_9("\u672c\u77b3\u7c7d\u57dd\uff1c")).append(string).toString());
        }
        return sprvrx2;
    }

    @sprtea
    public spruwn cfr_renamed_15723(sprsfo arg0) {
        spruwn spruwn2 = this;
        spruwn2.cfr_renamed_15480(sprsdp.cfr_renamed_9("{\rI\u000b\\"), arg0.toString());
        return spruwn2;
    }

    @sprtea
    public spruwn cfr_renamed_15724(sprrbo arg0) {
        return this.cfr_renamed_15725(arg0);
    }

    @sprtea
    public spruwn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public spruwn() {
        super(spruci.cfr_renamed_9("\u0017t3g"));
    }

    @sprtea
    public sprsfo cfr_renamed_3156() {
        return sprsfo.cfr_renamed_141(this.cfr_renamed_15482(sprsdp.cfr_renamed_9("{\rI\u000b\\")));
    }

    @sprtea
    public spruwn cfr_renamed_15725(sprrbo arg0) {
        spruwn spruwn2 = this;
        spruwn2.cfr_renamed_15271(arg0);
        return spruwn2;
    }
}

