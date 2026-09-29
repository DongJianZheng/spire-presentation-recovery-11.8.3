/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprudda;
import com.spire.presentation.packages.spryho;

@sprtea
public class sprqjo
extends sprrzn {
    @sprtea
    public String cfr_renamed_13190() {
        return this.cfr_renamed_15482("Name");
    }

    @sprtea
    public sprqjo cfr_renamed_15913(spryho arg0) {
        sprqjo sprqjo2 = this;
        sprqjo2.cfr_renamed_15555(arg0);
        return sprqjo2;
    }

    @sprtea
    public sprqjo cfr_renamed_15914(String arg0) {
        sprqjo sprqjo2 = this;
        sprqjo2.cfr_renamed_15480("Name", arg0);
        return sprqjo2;
    }

    @sprtea
    public sprqjo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public spryho cfr_renamed_15915() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprudda.cfr_renamed_9("\u0019J.["));
        if (sprnco2 == null) {
            return null;
        }
        return new spryho(sprnco2);
    }

    @sprtea
    public sprqjo() {
        super("Bookmark");
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprqjo(String string, spryho spryho2) {
        void arg1;
        sprqjo sprqjo2 = this;
        sprqjo2();
        sprqjo2.cfr_renamed_15914(string).cfr_renamed_15913((spryho)arg1);
    }
}

