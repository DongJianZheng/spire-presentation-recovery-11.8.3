/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprxgl;
import java.security.Key;
import javax.crypto.Cipher;

public class sprrml
extends spradl {
    @Override
    public sprmtl cfr_renamed_10671(sprddm arg0, sprddm arg1, byte[] arg2, byte[] arg3) throws sprlyl {
        sprrml sprrml2 = this;
        Key key = sprrml2.cfr_renamed_10700(arg0, arg1, arg2, arg3);
        Cipher cipher = sprrml2.cfr_renamed_3.cfr_renamed_10701(key, arg1);
        return new sprmtl(new sprxgl(this, arg1, cipher));
    }

    public sprrml(char[] arg0) {
        super(arg0);
    }
}

