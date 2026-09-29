/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdmo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqpp;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwno;
import com.spire.presentation.packages.sprzjo;

@sprtea
public class sprqfo
extends sprrzn {
    @sprtea
    public sprqfo cfr_renamed_15806(sprwno arg0) {
        if (arg0 == null) {
            sprqfo sprqfo2 = this;
            sprqfo2.cfr_renamed_15492(sprdmo.cfr_renamed_9("-r\u0005Y\u0012O"));
            return sprqfo2;
        }
        sprqfo sprqfo3 = this;
        sprqfo3.cfr_renamed_15480(sprqpp.cfr_renamed_9("8\u001b\u00100\u0007&"), arg0.toString());
        return sprqfo3;
    }

    @sprtea
    public sprqfo() {
        super("Template");
    }

    @sprtea
    public sprqfo cfr_renamed_15807(sprzjo arg0) {
        sprqfo sprqfo2 = this;
        sprqfo2.cfr_renamed_15480(sprdmo.cfr_renamed_9("#X\u001aM\u001b\\\u0003X>y"), arg0.toString());
        return sprqfo2;
    }

    @sprtea
    public sprwno cfr_renamed_15808() {
        sprwno sprwno2 = sprwno.cfr_renamed_141(this.cfr_renamed_15482(sprqpp.cfr_renamed_9("8\u001b\u00100\u0007&")));
        if (sprwno2 == null) {
            return sprwno.cfr_renamed_119;
        }
        return sprwno2;
    }

    @sprtea
    public sprzjo cfr_renamed_15809() {
        return sprzjo.cfr_renamed_141(this.cfr_renamed_15482(sprdmo.cfr_renamed_9("#X\u001aM\u001b\\\u0003X>y")));
    }

    @sprtea
    public sprqfo(sprnco arg0) {
        super(arg0);
    }
}

