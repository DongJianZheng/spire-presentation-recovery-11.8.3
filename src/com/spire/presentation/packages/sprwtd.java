/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprtrd;
import com.spire.presentation.packages.sprxue;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Cipher;

public class sprwtd
extends sprtrd {
    public sprwtd(PrivateKey arg0) {
        super(arg0);
    }

    @Override
    public sprixd cfr_renamed_4030(sprije arg0, sprije arg1, sprdce arg2, sprxue arg3, byte[] arg4) throws sprlqd {
        sprwtd sprwtd2 = this;
        Key key = sprwtd2.cfr_renamed_4062(arg0, arg1, arg2, arg3, arg4);
        Cipher cipher = sprwtd2.cfr_renamed_3.cfr_renamed_4042(key, arg1);
        return new sprixd(new spraxd(this, arg1, cipher));
    }
}

