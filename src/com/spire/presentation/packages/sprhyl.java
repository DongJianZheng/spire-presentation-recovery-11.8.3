/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmol;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtsl;
import com.spire.presentation.packages.sprxnl;

public class sprhyl
extends sprtsl {
    @Override
    public sprmtl cfr_renamed_10671(sprddm arg0, sprddm arg1, byte[] arg2, byte[] arg3) throws sprlyl {
        sprtpk sprtpk2 = this.cfr_renamed_10700(arg0, arg1, arg2, arg3);
        Object object = sprmol.cfr_renamed_9906(false, sprtpk2, arg1);
        return new sprmtl(new sprxnl(this, arg1, object));
    }

    public sprhyl(char[] arg0) {
        super(arg0);
    }
}

