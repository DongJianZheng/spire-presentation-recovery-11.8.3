/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbte;
import com.spire.presentation.packages.sprch;
import com.spire.presentation.packages.sprgi;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprlh;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnf;
import com.spire.presentation.packages.sprrte;
import com.spire.presentation.packages.sprurd;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzud;

public class spryud
extends sprurd {
    private sprbte cfr_renamed_4;

    @Override
    public sprixd cfr_renamed_3999(sprlh arg0) throws sprlqd {
        spryud spryud2 = this;
        return ((sprnf)arg0).cfr_renamed_3244(spryud2.cfr_renamed_3, spryud2.cfr_renamed_1, this.cfr_renamed_4.cfr_renamed_4010().cfr_renamed_186());
    }

    public spryud(sprbte arg0, sprije arg1, sprch arg2, sprgi arg3) {
        super(arg0.cfr_renamed_4000(), arg1, arg2, arg3);
        this.cfr_renamed_4 = arg0;
        sprrte sprrte2 = this.cfr_renamed_4.cfr_renamed_4020();
        if (sprrte2.cfr_renamed_3972()) {
            sprxue sprxue2 = sprxue.cfr_renamed_23(sprrte2.cfr_renamed_19());
            spryud spryud2 = this;
            spryud2.cfr_renamed_0 = new sprzud(sprxue2.cfr_renamed_186());
            return;
        }
        sprvre sprvre2 = sprvre.cfr_renamed_23(sprrte2.cfr_renamed_19());
        this.cfr_renamed_0 = new sprzud(sprvre2.cfr_renamed_313(), sprvre2.cfr_renamed_114().cfr_renamed_97());
    }
}

