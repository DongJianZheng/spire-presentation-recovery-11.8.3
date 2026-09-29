/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjfl;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprqbl;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Cipher;

public class sprhdl
extends sprqbl {
    @Override
    public sprmtl cfr_renamed_10679(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        sprhdl sprhdl2 = this;
        Key key = sprhdl2.cfr_renamed_10706(arg0, arg1, arg2);
        Cipher cipher = sprhdl2.cfr_renamed_2.cfr_renamed_10701(key, arg1);
        return new sprmtl(new sprjfl(this, arg1, cipher));
    }

    public sprhdl(PrivateKey arg0) {
        super(arg0);
    }
}

