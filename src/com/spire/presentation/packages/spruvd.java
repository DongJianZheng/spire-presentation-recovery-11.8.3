/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprkwd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprzrd;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class spruvd
extends sprkwd {
    public spruvd(SecretKey arg0) {
        super(arg0);
    }

    @Override
    public sprixd cfr_renamed_3244(sprije arg0, sprije arg1, byte[] arg2) throws sprlqd {
        spruvd spruvd2 = this;
        Key key = spruvd2.cfr_renamed_4047(arg0, arg1, arg2);
        Cipher cipher = spruvd2.cfr_renamed_2.cfr_renamed_4042(key, arg1);
        return new sprixd(new sprzrd(this, arg1, cipher));
    }
}

