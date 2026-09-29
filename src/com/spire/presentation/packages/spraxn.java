/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprky;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprolo;
import com.spire.presentation.packages.sprqsn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprsjo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprutn;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxmo;
import java.util.Iterator;

@sprtea
public class spraxn
extends sprrzn
implements sprky {
    @sprtea
    public sprdz cfr_renamed_13187() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprrob.cfr_renamed_9("\u001a@#A>"));
        sprvrx<sprutn> sprvrx2 = new sprvrx<sprutn>(sprdz2.size());
        sprutn sprutn2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprutn2 = new sprutn(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprutn2);
        }
        return sprvrx2;
    }

    @sprtea
    public spraxn cfr_renamed_15643(sprutn arg0) {
        if (arg0 == null) {
            return this;
        }
        spraxn spraxn2 = this;
        spraxn2.cfr_renamed_15271(arg0);
        return spraxn2;
    }

    @sprtea
    public sprqsn cfr_renamed_15644() {
        sprnco sprnco2 = this.cfr_renamed_15494("BackColor");
        if (sprnco2 != null) {
            sprnco2.cfr_renamed_15585(new sprsjo("Color", sprxmo.cfr_renamed_0));
        }
        if (sprnco2 == null) {
            return null;
        }
        return new sprqsn(sprnco2);
    }

    @sprtea
    public spraxn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public spraxn(String arg0) {
        super(arg0);
    }

    @sprtea
    public spraxn() {
        super(sprolo.cfr_renamed_9("~\tL\u0014X\u0013]5Q\u0002"));
    }

    @sprtea
    public spraxn cfr_renamed_15645(sprqsn arg0) {
        if (arg0 == null) {
            spraxn spraxn2 = this;
            spraxn2.cfr_renamed_15492("BackColor");
            return spraxn2;
        }
        arg0.cfr_renamed_15519("BackColor");
        this.cfr_renamed_15555(arg0);
        return this;
    }

    @sprtea
    public Boolean cfr_renamed_15628() {
        String string = this.cfr_renamed_15482(sprrob.cfr_renamed_9("j2[/A."));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return false;
        }
        return Integer.parseInt(string) == 1;
    }

    @sprtea
    public spraxn cfr_renamed_15646(Boolean arg0) {
        if (arg0 == null) {
            spraxn spraxn2 = this;
            spraxn2.cfr_renamed_15492(sprolo.cfr_renamed_9("|\u001eM\u0003W\u0002"));
            return spraxn2;
        }
        this.cfr_renamed_15480(sprrob.cfr_renamed_9("j2[/A."), Integer.toString(arg0 != false ? 1 : 0));
        return this;
    }
}

