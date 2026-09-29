/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdjl;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprjz;
import com.spire.presentation.packages.sprlq;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprlz;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproy;
import com.spire.presentation.packages.sprtnm;
import com.spire.presentation.packages.sprytm;

public class sprgyl
extends sprctl {
    private sprytm cfr_renamed_4;

    @Override
    public sprmtl cfr_renamed_10666(sprlz arg0) throws sprlyl {
        sprgyl sprgyl2 = this;
        return ((sproy)arg0).cfr_renamed_10679(new sprddm(this.cfr_renamed_2.cfr_renamed_593(), this.cfr_renamed_4), sprgyl2.cfr_renamed_119, sprgyl2.cfr_renamed_4.cfr_renamed_4010().cfr_renamed_186());
    }

    public sprgyl(sprytm arg0, sprddm arg1, sprjz arg2, sprlq arg3) {
        super(arg0.cfr_renamed_7446(), arg1, arg2, arg3);
        this.cfr_renamed_4 = arg0;
        sprtnm sprtnm2 = this.cfr_renamed_4.cfr_renamed_4020();
        if (sprtnm2.cfr_renamed_3972()) {
            sproug sproug2 = sproug.cfr_renamed_23(sprtnm2.cfr_renamed_19());
            sprgyl sprgyl2 = this;
            sprgyl2.cfr_renamed_4 = new sprdjl(sproug2.cfr_renamed_186());
            return;
        }
        sprdsm sprdsm2 = sprdsm.cfr_renamed_23(sprtnm2.cfr_renamed_19());
        this.cfr_renamed_4 = new sprdjl(sprdsm2.cfr_renamed_313(), sprdsm2.cfr_renamed_114().cfr_renamed_97());
    }
}

