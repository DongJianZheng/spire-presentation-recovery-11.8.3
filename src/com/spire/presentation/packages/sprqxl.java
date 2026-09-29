/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprhul;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmol;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprnul;
import com.spire.presentation.packages.spryye;

public class sprqxl
extends sprnul {
    @Override
    public sprmtl cfr_renamed_10679(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        sprbj sprbj2 = this.cfr_renamed_10706(arg0, arg1, arg2);
        Object object = sprmol.cfr_renamed_9906(false, sprbj2, arg1);
        return new sprmtl(new sprhul(this, arg1, object));
    }

    public sprqxl(spryye arg0) {
        super(arg0);
    }
}

