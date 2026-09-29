/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehga;
import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.sprkjo;
import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwno;

@sprtea
public class sprfpo
extends sprrzn {
    @sprtea
    public sprfpo cfr_renamed_15235(sprlgo arg0) {
        if (arg0 == null) {
            sprfpo sprfpo2 = this;
            sprfpo2.cfr_renamed_15492("BaseLoc");
            return sprfpo2;
        }
        sprfpo sprfpo3 = this;
        sprfpo3.cfr_renamed_15480("BaseLoc", arg0.toString());
        return sprfpo3;
    }

    @sprtea
    public sprfpo cfr_renamed_15806(sprwno arg0) {
        if (arg0 == null) {
            sprfpo sprfpo2 = this;
            sprfpo2.cfr_renamed_15492(sprhql.cfr_renamed_9("_hwC`U"));
            return sprfpo2;
        }
        sprfpo sprfpo3 = this;
        sprfpo3.cfr_renamed_15480(sprehga.cfr_renamed_9("\u0001h)C>U"), arg0.toString());
        return sprfpo3;
    }

    @sprtea
    public sprlgo cfr_renamed_15481() {
        return sprlgo.cfr_renamed_141(this.cfr_renamed_15482("BaseLoc"));
    }

    @sprtea
    public sprfpo() {
        super(sprhql.cfr_renamed_9("QBhWiFqBUFbB"));
    }

    @sprtea
    public sprkjo cfr_renamed_6005() {
        return sprkjo.cfr_renamed_141(this.cfr_renamed_15482("ID"));
    }

    @sprtea
    public sprwno cfr_renamed_15808() {
        String string = this.cfr_renamed_15482(sprehga.cfr_renamed_9("\u0001h)C>U"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return sprwno.cfr_renamed_119;
        }
        return sprwno.cfr_renamed_141(string);
    }

    @sprtea
    public sprfpo cfr_renamed_15820(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            sprfpo sprfpo2 = this;
            sprfpo2.cfr_renamed_15492("Name");
            return sprfpo2;
        }
        sprfpo sprfpo3 = this;
        sprfpo3.cfr_renamed_15480("Name", arg0);
        return sprfpo3;
    }

    @sprtea
    public sprfpo cfr_renamed_15263(sprkjo arg0) {
        sprfpo sprfpo2 = this;
        sprfpo2.cfr_renamed_15480("ID", arg0.toString());
        return sprfpo2;
    }

    @sprtea
    public sprfpo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprkjo cfr_renamed_15821() {
        return sprkjo.cfr_renamed_141(this.cfr_renamed_15482("Name"));
    }
}

