/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcvd;
import com.spire.presentation.packages.sprczd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprjpd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnld;

public class sprkpd
extends sprjpd {
    public sprkpd(char[] arg0) {
        super(arg0);
    }

    @Override
    public sprixd cfr_renamed_3224(sprije arg0, sprije arg1, byte[] arg2, byte[] arg3) throws sprlqd {
        sprnld sprnld2 = this.cfr_renamed_4041(arg0, arg1, arg2, arg3);
        Object object = sprcvd.cfr_renamed_4210(false, sprnld2, arg1);
        return new sprixd(new sprczd(this, arg1, object));
    }
}

