/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sproxn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvqo;

@sprtea
public class spreun
extends sproxn {
    @Override
    public sprdsp cfr_renamed_13484() {
        int n;
        sprdsp sprdsp2 = new sprdsp(this.cfr_renamed_14856().cfr_renamed_13484().cfr_renamed_11861());
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_14856().cfr_renamed_13484().cfr_renamed_11861()) {
            spreun spreun2 = this;
            int n3 = spreun2.cfr_renamed_14856().cfr_renamed_13484().cfr_renamed_7861(n);
            int n4 = (Integer)spreun2.cfr_renamed_14856().cfr_renamed_13484().cfr_renamed_13485(n);
            int n5 = this.cfr_renamed_14862(n4);
            sprdsp2.cfr_renamed_12962(n3, n5);
            n2 = ++n;
        }
        return sprdsp2;
    }

    @Override
    public sprdsp cfr_renamed_14855() {
        int n;
        sprdsp sprdsp2 = new sprdsp(this.cfr_renamed_14856().cfr_renamed_13323().cfr_renamed_11861());
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_14856().cfr_renamed_13323().cfr_renamed_11861()) {
            spreun spreun2 = this;
            int n3 = spreun2.cfr_renamed_14856().cfr_renamed_13323().cfr_renamed_7861(n);
            int n4 = spreun2.cfr_renamed_14862(n3);
            sprdsp2.cfr_renamed_12962(n3, n4);
            n2 = ++n;
        }
        return sprdsp2;
    }

    @Override
    public int cfr_renamed_14862(int arg0) {
        if (!this.cfr_renamed_14856().cfr_renamed_13261().cfr_renamed_14135().cfr_renamed_14000(arg0)) {
            return 0;
        }
        return (Integer)this.cfr_renamed_14856().cfr_renamed_13261().cfr_renamed_14135().cfr_renamed_576(arg0);
    }

    public spreun(sprvqo arg0) {
        super(arg0);
    }
}

