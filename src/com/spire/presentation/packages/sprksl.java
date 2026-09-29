/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrl;
import com.spire.presentation.packages.sprctl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprez;
import com.spire.presentation.packages.sprgkm;
import com.spire.presentation.packages.sprjz;
import com.spire.presentation.packages.sprlq;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprlz;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprplm;
import java.io.IOException;

public class sprksl
extends sprctl {
    private sprgkm cfr_renamed_4;

    @Override
    public sprmtl cfr_renamed_10666(sprlz arg0) throws sprlyl, IOException {
        sprksl sprksl2 = this;
        return ((sprez)arg0).cfr_renamed_10679(sprksl2.cfr_renamed_2, sprksl2.cfr_renamed_119, this.cfr_renamed_4.cfr_renamed_4010().cfr_renamed_186());
    }

    public sprksl(sprgkm sprgkm2, sprddm sprddm2, sprjz sprjz2, sprlq sprlq2) {
        super(sprgkm2.cfr_renamed_4000(), sprddm2, sprjz2, sprlq2);
        this.cfr_renamed_4 = sprgkm2;
        sprplm sprplm2 = this.cfr_renamed_4.cfr_renamed_4036();
        sprksl sprksl2 = this;
        sprksl2.cfr_renamed_4 = new sprcrl(sprplm2.cfr_renamed_327().cfr_renamed_186());
    }
}

