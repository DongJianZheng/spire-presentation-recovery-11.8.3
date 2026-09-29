/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhxd;
import com.spire.presentation.packages.sprhyd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprlqd;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Cipher;

public class sprcxd
extends sprhyd {
    @Override
    public sprixd cfr_renamed_3244(sprije arg0, sprije arg1, byte[] arg2) throws sprlqd {
        sprcxd sprcxd2 = this;
        Key key = sprcxd2.cfr_renamed_4047(arg0, arg1, arg2);
        Cipher cipher = sprcxd2.cfr_renamed_0.cfr_renamed_4042(key, arg1);
        return new sprixd(new sprhxd(this, arg1, cipher));
    }

    public sprcxd(PrivateKey arg0) {
        super(arg0);
    }
}

