/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbw;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprysn;
import com.spire.presentation.packages.sprywc;
import com.spire.presentation.packages.sprzjo;

@sprtea
public class sprdun
extends sprysn {
    @sprtea
    public sprdun() {
        super(sprywc.cfr_renamed_9("5q\u001ax5{\u0018`\u0013z\u0002"));
    }

    @Override
    public sprysn cfr_renamed_15197(sprbw arg0) {
        this.cfr_renamed_15271((sprrzn)((Object)arg0));
        return this;
    }

    @sprtea
    public sprdun(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprzjo cfr_renamed_15607() {
        return sprzjo.cfr_renamed_141(this.cfr_renamed_15482("Thumbnail"));
    }

    @sprtea
    public sprdun cfr_renamed_15608(sprzjo arg0) {
        if (arg0 == null) {
            sprdun sprdun2 = this;
            sprdun2.cfr_renamed_15492("Thumbnail");
            return sprdun2;
        }
        sprdun sprdun3 = this;
        sprdun3.cfr_renamed_15480("Thumbnail", arg0.toString());
        return sprdun3;
    }
}

