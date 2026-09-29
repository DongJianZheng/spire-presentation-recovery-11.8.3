/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcse;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprhve;

public class sprcqe
implements sprhd {
    private sprcse cfr_renamed_2;
    private sprhve cfr_renamed_3;
    private sprhve cfr_renamed_4;

    public void cfr_renamed_5034(sprhve arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprhve cfr_renamed_180() {
        return this.cfr_renamed_3;
    }

    public sprcse cfr_renamed_181() {
        return this.cfr_renamed_2;
    }

    @Override
    public Object clone() {
        sprcqe sprcqe2 = new sprcqe();
        sprcqe sprcqe3 = this;
        new sprcqe().cfr_renamed_2 = sprcqe3.cfr_renamed_2;
        if (sprcqe3.cfr_renamed_4 != null) {
            sprcqe2.cfr_renamed_5035((sprhve)this.cfr_renamed_4.clone());
        }
        if (this.cfr_renamed_3 != null) {
            sprcqe2.cfr_renamed_5034((sprhve)this.cfr_renamed_3.clone());
        }
        return sprcqe2;
    }

    public void cfr_renamed_5035(sprhve arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public boolean cfr_renamed_132(Object arg0) {
        sprcse sprcse2;
        block7: {
            block6: {
                try {
                    if (arg0 instanceof sprcse) break block6;
                    return false;
                }
                catch (Exception exception) {
                    return false;
                }
            }
            sprcse2 = (sprcse)arg0;
            if (this.cfr_renamed_4 == null || this.cfr_renamed_4.cfr_renamed_132(sprcse2.cfr_renamed_177())) break block7;
            return false;
        }
        if (this.cfr_renamed_3 != null && !this.cfr_renamed_3.cfr_renamed_132(sprcse2.cfr_renamed_178())) {
            return false;
        }
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.equals(arg0);
        }
        return true;
    }

    public void cfr_renamed_5036(sprcse arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public sprhve cfr_renamed_179() {
        return this.cfr_renamed_4;
    }
}

