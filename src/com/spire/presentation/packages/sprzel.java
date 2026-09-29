/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjhl;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprqfl;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class sprzel
extends sprjhl {
    public sprzel(SecretKey arg0) {
        super(arg0);
    }

    @Override
    public sprmtl cfr_renamed_10679(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        sprzel sprzel2 = this;
        Key key = sprzel2.cfr_renamed_10706(arg0, arg1, arg2);
        Cipher cipher = sprzel2.cfr_renamed_1.cfr_renamed_10701(key, arg1);
        return new sprmtl(new sprqfl(this, arg1, cipher));
    }
}

