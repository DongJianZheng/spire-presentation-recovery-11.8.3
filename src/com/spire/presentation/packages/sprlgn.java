/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprru;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryvm;
import com.spire.presentation.packages.spryx;
import com.spire.presentation.packages.sprzp;

@sprtea
public class sprlgn
implements sprzp {
    private sprtbp cfr_renamed_3;
    private spryx cfr_renamed_4;

    @Override
    public float cfr_renamed_1942() {
        return this.cfr_renamed_3.cfr_renamed_1942();
    }

    /*
     * WARNING - void declaration
     */
    public sprlgn(spryx spryx2, float f) {
        void arg1;
        void arg0;
        this.cfr_renamed_4 = spryx2;
        sprlgn sprlgn2 = this;
        this.cfr_renamed_3 = new sprtbp(spryvm.cfr_renamed_12601((spryx)arg0, 1.0), (float)arg1);
    }

    @Override
    public void cfr_renamed_12605(sprru arg0, float arg1, float arg2) {
        throw new UnsupportedOperationException();
    }

    /*
     * WARNING - void declaration
     */
    public sprlgn(spryx spryx2) {
        void arg0;
        this.cfr_renamed_4 = spryx2;
        sprlgn sprlgn2 = this;
        this.cfr_renamed_3 = new sprtbp(spryvm.cfr_renamed_12601((spryx)arg0, 1.0));
    }

    @Override
    public void cfr_renamed_12572(float arg0) {
        this.cfr_renamed_3.cfr_renamed_12572(arg0);
    }

    @Override
    public Object cfr_renamed_12496() {
        return this.cfr_renamed_3;
    }

    @Override
    public spryx cfr_renamed_12606() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_12497(Object arg0) {
        this.cfr_renamed_3 = (sprtbp)arg0;
    }
}

