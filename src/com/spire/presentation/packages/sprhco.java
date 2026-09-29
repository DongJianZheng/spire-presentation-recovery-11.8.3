/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprnwj;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprudy;

@sprtea
public class sprhco
extends sprrzn {
    @sprtea
    public sprhco() {
        super(sprnwj.cfr_renamed_9("\u001ev,\u007f"));
    }

    @sprtea
    public sprhco(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprhco(sprlgo sprlgo2) {
        sprhco sprhco2 = this;
        sprhco2();
        sprhco2.cfr_renamed_15235(sprlgo2);
    }

    @sprtea
    public sprhco cfr_renamed_15235(sprlgo arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprudy.cfr_renamed_9("\u6366\u5449\u5364\u51dd\u76e5\u5bd1\u5109\u756d\u5b31\u5328\u7a81\u65df\u4e97\u8db7\u5fe5\uff50#9\u0012=-7\u0002\uff51\u4e5b\u7a22"));
        }
        sprhco sprhco2 = this;
        sprhco2.cfr_renamed_15538("BaseLoc", arg0);
        return sprhco2;
    }

    @sprtea
    public sprlgo cfr_renamed_15481() {
        sprnco sprnco2 = this.cfr_renamed_15494("BaseLoc");
        if (sprnco2 == null) {
            throw new IllegalArgumentException(sprnwj.cfr_renamed_9("\u634a\u5402\u5348\u5196\u76c9\u5b9a\u5125\u7526\u5b1d\u5363\u7aad\u6594\u4ebb\u8dfc\u5fc9\uff1b\u000fr>v\u0001|.\uff1a\u4e77\u7a69"));
        }
        return sprlgo.cfr_renamed_15562(sprnco2);
    }
}

