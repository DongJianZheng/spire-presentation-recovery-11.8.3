/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprhyz;
import com.spire.presentation.packages.sprmyn;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprzaq;
import java.util.Iterator;

@sprtea
public class sprxyn
extends sprrzn {
    @sprtea
    public sprdz cfr_renamed_15596() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprzaq.cfr_renamed_9(".V\u0004J"));
        sprvrx<sprmyn> sprvrx2 = new sprvrx<sprmyn>(sprdz2.size());
        sprmyn sprmyn2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprmyn2 = new sprmyn(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprmyn2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprxyn(sprmyn sprmyn2) {
        sprxyn sprxyn2 = this;
        sprxyn2();
        sprxyn2.cfr_renamed_15218(sprmyn2);
    }

    @sprtea
    public sprxyn cfr_renamed_15218(sprmyn arg0) {
        if (arg0 == null) {
            return this;
        }
        sprxyn sprxyn2 = this;
        sprxyn2.cfr_renamed_15271(arg0);
        return sprxyn2;
    }

    @sprtea
    public sprxyn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprxyn() {
        super(sprhyz.cfr_renamed_9("F(l4v"));
    }

    @sprtea
    public sprxyn cfr_renamed_15219(Boolean arg0) {
        if (arg0 == null) {
            sprxyn sprxyn2 = this;
            sprxyn2.cfr_renamed_15492(sprzaq.cfr_renamed_9("n\u001f[\u0003I+V\f]"));
            return sprxyn2;
        }
        sprxyn sprxyn3 = this;
        sprxyn3.cfr_renamed_15480(sprhyz.cfr_renamed_9("Q6d*v\u0002i%b"), arg0.toString().toLowerCase());
        return sprxyn3;
    }

    @sprtea
    public Boolean cfr_renamed_15654() {
        String string = this.cfr_renamed_15482(sprzaq.cfr_renamed_9("n\u001f[\u0003I+V\f]"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }
}

