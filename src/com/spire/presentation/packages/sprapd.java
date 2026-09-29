/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnwd;
import com.spire.presentation.packages.sprstd;
import java.security.Key;
import javax.crypto.Mac;

public class sprapd
extends sprnwd {
    public sprapd(char[] arg0) {
        super(arg0);
    }

    @Override
    public sprixd cfr_renamed_3224(sprije arg0, sprije arg1, byte[] arg2, byte[] arg3) throws sprlqd {
        sprapd sprapd2 = this;
        Key key = sprapd2.cfr_renamed_4041(arg0, arg1, arg2, arg3);
        Mac mac = sprapd2.cfr_renamed_1.cfr_renamed_4043(key, arg1);
        return new sprixd(new sprstd(this, arg1, key, mac));
    }
}

