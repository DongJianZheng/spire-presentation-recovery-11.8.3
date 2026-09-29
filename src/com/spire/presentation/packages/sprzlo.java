/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbno;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprejo;
import com.spire.presentation.packages.sprgny;
import com.spire.presentation.packages.sprkgo;
import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqfo;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxvc;
import java.util.Iterator;

@sprtea
public class sprzlo
extends sprrzn {
    @Deprecated
    @sprtea
    public sprqfo cfr_renamed_15810() {
        sprnco sprnco2 = this.cfr_renamed_15494("Template");
        if (sprnco2 == null) {
            return null;
        }
        return new sprqfo(sprnco2);
    }

    @sprtea
    public sprkgo cfr_renamed_15811() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprgny.cfr_renamed_9("M\u001di\u000e"));
        if (sprnco2 == null) {
            return null;
        }
        return new sprkgo(sprnco2);
    }

    @Deprecated
    @sprtea
    public sprzlo cfr_renamed_15812(sprqfo arg0) {
        sprzlo sprzlo2 = this;
        sprzlo2.cfr_renamed_15555(arg0);
        return sprzlo2;
    }

    @sprtea
    public sprzlo() {
        super(sprxvc.cfr_renamed_9("\u0001~6z"));
    }

    @sprtea
    public sprzlo cfr_renamed_15813(sprqfo arg0) {
        if (arg0 == null) {
            return this;
        }
        sprzlo sprzlo2 = this;
        sprzlo2.cfr_renamed_15271(arg0);
        return sprzlo2;
    }

    @sprtea
    public sprzlo cfr_renamed_15240(sprkgo arg0) {
        sprzlo sprzlo2 = this;
        arg0.cfr_renamed_15519(sprgny.cfr_renamed_9("M\u001di\u000e"));
        sprzlo2.cfr_renamed_15555(arg0);
        return sprzlo2;
    }

    @sprtea
    public sprzlo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprejo cfr_renamed_480() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprxvc.cfr_renamed_9("\\>q%z?k"));
        if (sprnco2 == null) {
            return null;
        }
        return new sprejo(sprnco2);
    }

    @sprtea
    public sprdz cfr_renamed_15814() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprgny.cfr_renamed_9("?m\bi=i\u001c"));
        sprvrx<sprlgo> sprvrx2 = new sprvrx<sprlgo>(sprdz2.size());
        sprlgo sprlgo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprlgo2 = new sprlgo(sprnco2.cfr_renamed_13030());
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprlgo2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprdz cfr_renamed_15815() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477("Template");
        sprvrx<sprqfo> sprvrx2 = new sprvrx<sprqfo>(sprdz2.size());
        sprqfo sprqfo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprqfo2 = new sprqfo(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprqfo2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprbno cfr_renamed_15592() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprxvc.cfr_renamed_9("^2k8p?l"));
        if (sprnco2 == null) {
            return null;
        }
        return new sprbno(sprnco2);
    }

    @sprtea
    public sprzlo cfr_renamed_15588(sprbno arg0) {
        sprzlo sprzlo2 = this;
        sprzlo2.cfr_renamed_15555(arg0);
        return sprzlo2;
    }

    @sprtea
    public sprzlo cfr_renamed_15816(sprlgo arg0) {
        sprzlo sprzlo2 = this;
        sprzlo2.cfr_renamed_15421(sprgny.cfr_renamed_9("?m\bi=i\u001c"), arg0);
        return sprzlo2;
    }

    @sprtea
    public sprzlo cfr_renamed_15244(sprejo arg0) {
        sprzlo sprzlo2 = this;
        sprzlo2.cfr_renamed_15555(arg0);
        return sprzlo2;
    }
}

