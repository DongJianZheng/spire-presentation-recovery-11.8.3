/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbul;
import com.spire.presentation.packages.sprbvm;
import com.spire.presentation.packages.sprkvm;
import com.spire.presentation.packages.sprlxl;
import java.util.ArrayList;
import java.util.List;

public class sprmvl {
    public List<sprbvm> cfr_renamed_4;

    public sprmvl() {
        sprmvl sprmvl2 = this;
        sprmvl2.cfr_renamed_4 = new ArrayList<sprbvm>();
    }

    public void cfr_renamed_10995(sprbul arg0) {
        this.cfr_renamed_4.add(arg0.cfr_renamed_568());
    }

    public sprlxl cfr_renamed_1451() {
        sprlxl sprlxl2 = new sprlxl(new sprkvm(this.cfr_renamed_4.toArray(new sprbvm[0])));
        this.cfr_renamed_4.clear();
        return sprlxl2;
    }
}

