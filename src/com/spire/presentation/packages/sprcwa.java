/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprava;
import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprgma;

public class sprcwa
implements sprb {
    private sprgma cfr_renamed_2;
    private sprava cfr_renamed_3;
    private sprgma cfr_renamed_4;

    public void cfr_renamed_174(sprava arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public Object clone() {
        sprcwa sprcwa2 = new sprcwa();
        sprcwa sprcwa3 = this;
        new sprcwa().cfr_renamed_3 = sprcwa3.cfr_renamed_3;
        if (sprcwa3.cfr_renamed_2 != null) {
            sprcwa2.cfr_renamed_175((sprgma)this.cfr_renamed_2.clone());
        }
        if (this.cfr_renamed_4 != null) {
            sprcwa2.cfr_renamed_176((sprgma)this.cfr_renamed_4.clone());
        }
        return sprcwa2;
    }

    public void cfr_renamed_175(sprgma arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        sprava sprava2;
        block7: {
            block6: {
                try {
                    if (arg0 instanceof sprava) break block6;
                    return false;
                }
                catch (Exception exception) {
                    return false;
                }
            }
            sprava2 = (sprava)arg0;
            if (this.cfr_renamed_2 == null || this.cfr_renamed_2.cfr_renamed_132(sprava2.cfr_renamed_177())) break block7;
            return false;
        }
        if (this.cfr_renamed_4 != null && !this.cfr_renamed_4.cfr_renamed_132(sprava2.cfr_renamed_178())) {
            return false;
        }
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.equals(arg0);
        }
        return true;
    }

    public sprgma cfr_renamed_179() {
        return this.cfr_renamed_2;
    }

    public sprgma cfr_renamed_180() {
        return this.cfr_renamed_4;
    }

    public sprava cfr_renamed_181() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_176(sprgma arg0) {
        this.cfr_renamed_4 = arg0;
    }
}

