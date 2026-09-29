/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcvd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpxd;
import com.spire.presentation.packages.sprvpd;
import com.spire.presentation.packages.sprzab;

public class sprbzd
extends sprpxd {
    public sprbzd(sprzab arg0) {
        super(arg0);
    }

    @Override
    public sprixd cfr_renamed_3244(sprije arg0, sprije arg1, byte[] arg2) throws sprlqd {
        sprnld sprnld2 = (sprnld)this.cfr_renamed_4047(arg0, arg1, arg2);
        Object object = sprcvd.cfr_renamed_4210(false, sprnld2, arg1);
        return new sprixd(new sprvpd(this, arg1, object));
    }
}

