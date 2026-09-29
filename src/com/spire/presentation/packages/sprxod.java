/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spriqd;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprtrd;
import com.spire.presentation.packages.sprxue;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Mac;

public class sprxod
extends sprtrd {
    public sprxod(PrivateKey arg0) {
        super(arg0);
    }

    @Override
    public sprixd cfr_renamed_4030(sprije arg0, sprije arg1, sprdce arg2, sprxue arg3, byte[] arg4) throws sprlqd {
        sprxod sprxod2 = this;
        Key key = sprxod2.cfr_renamed_4062(arg0, arg1, arg2, arg3, arg4);
        Mac mac = sprxod2.cfr_renamed_3.cfr_renamed_4043(key, arg1);
        return new sprixd(new spriqd(this, arg1, key, mac));
    }
}

