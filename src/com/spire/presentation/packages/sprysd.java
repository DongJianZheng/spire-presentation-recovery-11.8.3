/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhyd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprssd;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Mac;

public class sprysd
extends sprhyd {
    public sprysd(PrivateKey arg0) {
        super(arg0);
    }

    @Override
    public sprixd cfr_renamed_3244(sprije arg0, sprije arg1, byte[] arg2) throws sprlqd {
        sprysd sprysd2 = this;
        Key key = sprysd2.cfr_renamed_4047(arg0, arg1, arg2);
        Mac mac = sprysd2.cfr_renamed_0.cfr_renamed_4043(key, arg1);
        return new sprixd(new sprssd(this, arg1, key, mac));
    }
}

