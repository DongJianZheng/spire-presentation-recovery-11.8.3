/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprkel;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprofl;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Mac;

public class sprafl
extends sprkel {
    public sprafl(PrivateKey arg0) {
        super(arg0);
    }

    @Override
    public sprmtl cfr_renamed_10679(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        sprafl sprafl2 = this;
        Key key = sprafl2.cfr_renamed_10706(arg0, arg1, arg2);
        Mac mac = sprafl2.cfr_renamed_0.cfr_renamed_10702(key, arg1);
        return new sprmtl(new sprofl(this, arg1, key, mac));
    }
}

