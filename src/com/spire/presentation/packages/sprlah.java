/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcxg;
import com.spire.presentation.packages.sprie;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sprojm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprxam;
import java.io.InputStream;

public class sprlah
extends sprcxg {
    @Override
    public int cfr_renamed_3() {
        if (this.cfr_renamed_4 instanceof sprojm) {
            sprojm sprojm2 = (sprojm)this.cfr_renamed_4;
            return sprojm2.cfr_renamed_3();
        }
        if (this.cfr_renamed_4 instanceof sproam) {
            sproam sproam2 = (sproam)this.cfr_renamed_4;
            return sproam2.cfr_renamed_3();
        }
        return -1;
    }

    public InputStream cfr_renamed_7700(sprie arg0) throws sprtqg {
        sprlah sprlah2 = this;
        sprie sprie2 = arg0;
        sprlah2.cfr_renamed_3 = sprlah2.cfr_renamed_7566(sprie2, sprie2.cfr_renamed_7701());
        return sprlah2.cfr_renamed_3;
    }

    public sprlah(sprxam arg0) {
        super(arg0);
    }

    @Override
    public int cfr_renamed_593() {
        if (this.cfr_renamed_4 instanceof sprojm) {
            return ((sprojm)this.cfr_renamed_4).cfr_renamed_593();
        }
        return -1;
    }
}

