/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprpxn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvqo;

@sprtea
public class spruxn
extends sprpxn {
    @Override
    public sprdsp cfr_renamed_13484() {
        return this.cfr_renamed_14856().cfr_renamed_13484();
    }

    public spruxn(sprvqo arg0) {
        super(arg0);
    }

    @Override
    public int cfr_renamed_14862(int arg0) {
        Object object = this.cfr_renamed_14856().cfr_renamed_13323().cfr_renamed_576(arg0);
        if (object != null) {
            return (Integer)object;
        }
        return 0;
    }

    @Override
    public sprdsp cfr_renamed_14855() {
        int n;
        sprdsp sprdsp2 = new sprdsp(this.cfr_renamed_14856().cfr_renamed_13323().cfr_renamed_11861());
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_14856().cfr_renamed_13323().cfr_renamed_11861()) {
            spruxn spruxn2 = this;
            int n3 = spruxn2.cfr_renamed_14856().cfr_renamed_13323().cfr_renamed_7861(n);
            int n4 = (Integer)spruxn2.cfr_renamed_14856().cfr_renamed_13323().cfr_renamed_13485(n);
            sprdsp2.cfr_renamed_12962(n4, n3);
            n2 = ++n;
        }
        return sprdsp2;
    }
}

