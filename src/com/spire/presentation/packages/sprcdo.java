/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprugk;
import com.spire.presentation.packages.sprxgk;

@sprtea
public class sprcdo
extends sprrzn {
    @sprtea
    public sprcdo cfr_renamed_15573(byte[] arg0) {
        if (arg0 == null || arg0.length == 0) {
            throw new IllegalArgumentException(sprugk.cfr_renamed_9("\u6432\u89c5\u8bcb\u7bd3\u5056\uff4c),\u000f'\u0001\u0012\u000b(\u001f!\uff63\u4e7e\u7a10"));
        }
        sprcdo sprcdo2 = this;
        sprcdo2.cfr_renamed_15538(sprxgk.cfr_renamed_9("rkT`ZUPoDf"), sprpkja.cfr_renamed_510(arg0));
        return sprcdo2;
    }

    @sprtea
    public sprcdo cfr_renamed_15574(sprlgo arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprugk.cfr_renamed_9("\u6343\u547b\u5341\u51ef\u76c0\u65ed\u4eb2\uff62\u0002\u0003(\u000f\u0016\u000f\"\uff63\u4e7e\u7a10"));
        }
        sprcdo sprcdo2 = this;
        sprcdo2.cfr_renamed_15480(sprxgk.cfr_renamed_9("EXoTQTe"), arg0.toString());
        return sprcdo2;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprcdo(sprlgo sprlgo2, byte[] byArray) {
        void arg1;
        sprcdo sprcdo2 = this;
        sprcdo2();
        sprcdo2.cfr_renamed_15574(sprlgo2).cfr_renamed_15573((byte[])arg1);
    }

    @sprtea
    public byte[] cfr_renamed_15575() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprugk.cfr_renamed_9("\u0007\u0002!\t/<%\u00061\u000f"));
        if (sprnco2 == null) {
            throw new IllegalArgumentException(sprxgk.cfr_renamed_9("\u645b\u89b0\u8ba2\u7ba6\u503f\uff39@YfRhgb]vT\uff0a\u4e0b\u7a79"));
        }
        return sprpkja.cfr_renamed_15576(sprnco2.cfr_renamed_15495());
    }

    @sprtea
    public sprcdo() {
        super(sprugk.cfr_renamed_9("8!\f!\u0018!\u0004'\u000f"));
    }

    @sprtea
    public sprcdo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprlgo cfr_renamed_15570() {
        return sprlgo.cfr_renamed_141(this.cfr_renamed_15482(sprxgk.cfr_renamed_9("EXoTQTe")));
    }
}

