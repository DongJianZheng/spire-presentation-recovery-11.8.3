/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprivl;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmol;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprqol;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprujg;

public class sprftl
extends sprivl {
    @Override
    public sprmtl cfr_renamed_10679(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        sprtpk sprtpk2 = (sprtpk)this.cfr_renamed_10706(arg0, arg1, arg2);
        Object object = sprmol.cfr_renamed_9906(false, sprtpk2, arg1);
        return new sprmtl(new sprqol(this, arg1, object));
    }

    public sprftl(sprujg arg0) {
        super(arg0);
    }
}

