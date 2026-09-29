/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfkl;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprrhl;
import com.spire.presentation.packages.sprvhm;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Cipher;

public class sprxbl
extends sprrhl {
    @Override
    public sprmtl cfr_renamed_10683(sprddm arg0, sprddm arg1, sprvhm arg2, sproug arg3, byte[] arg4) throws sprlyl {
        sprxbl sprxbl2 = this;
        Key key = sprxbl2.cfr_renamed_10722(arg0, arg1, arg2, arg3, arg4);
        Cipher cipher = sprxbl2.cfr_renamed_3.cfr_renamed_10701(key, arg1);
        return new sprmtl(new sprfkl(this, arg1, cipher));
    }

    public sprxbl(PrivateKey arg0) {
        super(arg0);
    }
}

