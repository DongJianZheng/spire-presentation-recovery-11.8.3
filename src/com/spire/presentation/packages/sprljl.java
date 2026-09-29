/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradl;
import com.spire.presentation.packages.sprakl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmtl;
import java.security.Key;
import javax.crypto.Mac;

public class sprljl
extends spradl {
    public sprljl(char[] arg0) {
        super(arg0);
    }

    @Override
    public sprmtl cfr_renamed_10671(sprddm arg0, sprddm arg1, byte[] arg2, byte[] arg3) throws sprlyl {
        sprljl sprljl2 = this;
        Key key = sprljl2.cfr_renamed_10700(arg0, arg1, arg2, arg3);
        Mac mac = sprljl2.cfr_renamed_3.cfr_renamed_10702(key, arg1);
        return new sprmtl(new sprakl(this, arg1, key, mac));
    }
}

