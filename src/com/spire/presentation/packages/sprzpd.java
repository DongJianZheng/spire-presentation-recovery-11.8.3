/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprksd;
import com.spire.presentation.packages.sprkwd;
import com.spire.presentation.packages.sprlqd;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

public class sprzpd
extends sprkwd {
    public sprzpd(SecretKey arg0) {
        super(arg0);
    }

    @Override
    public sprixd cfr_renamed_3244(sprije arg0, sprije arg1, byte[] arg2) throws sprlqd {
        sprzpd sprzpd2 = this;
        Key key = sprzpd2.cfr_renamed_4047(arg0, arg1, arg2);
        Mac mac = sprzpd2.cfr_renamed_2.cfr_renamed_4043(key, arg1);
        return new sprixd(new sprksd(this, arg1, key, mac));
    }
}

