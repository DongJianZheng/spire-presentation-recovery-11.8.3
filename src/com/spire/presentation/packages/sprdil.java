/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjhl;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprwgl;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

public class sprdil
extends sprjhl {
    @Override
    public sprmtl cfr_renamed_10679(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        sprdil sprdil2 = this;
        Key key = sprdil2.cfr_renamed_10706(arg0, arg1, arg2);
        Mac mac = sprdil2.cfr_renamed_1.cfr_renamed_10702(key, arg1);
        return new sprmtl(new sprwgl(this, arg1, key, mac));
    }

    public sprdil(SecretKey arg0) {
        super(arg0);
    }
}

