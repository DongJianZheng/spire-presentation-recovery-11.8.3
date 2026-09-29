/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprak;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.sprnpl;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.spruol;
import java.util.ArrayList;
import java.util.List;

public class sprsql
extends spruol {
    public sprak cfr_renamed_3;
    public sprak cfr_renamed_10820;
    public sprpnm cfr_renamed_10821;
    public final List cfr_renamed_102;

    public void cfr_renamed_10822(sprak arg0) {
        this.cfr_renamed_10820 = arg0;
    }

    @Override
    public void cfr_renamed_10804(sprnpl arg0) {
        this.cfr_renamed_10821 = arg0.cfr_renamed_568();
    }

    @Override
    public void cfr_renamed_10803(sprfz arg0) {
        this.cfr_renamed_102.add(arg0);
    }

    public void cfr_renamed_10823(sprak arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprsql() {
        sprsql sprsql2 = this;
        sprsql sprsql3 = this;
        sprsql3.cfr_renamed_102 = new ArrayList();
        sprsql2.cfr_renamed_3 = null;
        sprsql2.cfr_renamed_10820 = null;
    }
}

