/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprfbn {
    private sprfbn cfr_renamed_3;
    private spravp cfr_renamed_4;

    @sprtea
    public spravp cfr_renamed_12283() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public boolean cfr_renamed_12282(String arg0) {
        sprfbn sprfbn2;
        sprfbn sprfbn3 = sprfbn2 = this;
        while (sprfbn3 != null) {
            if (sprfbn2.cfr_renamed_4.cfr_renamed_12143(arg0)) {
                return true;
            }
            sprfbn3 = sprfbn2.cfr_renamed_3;
        }
        return false;
    }

    public spralq cfr_renamed_12346() {
        int n;
        spralq spralq2 = new spralq();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_12283().cfr_renamed_6507().size()) {
            Object object;
            Object object2 = object = this.cfr_renamed_12283().cfr_renamed_7861(n);
            spralq2.cfr_renamed_12160(object2, this.cfr_renamed_12283().cfr_renamed_12347(object2));
            n2 = ++n;
        }
        return spralq2;
    }

    public sprfbn(sprfbn sprfbn2) {
        sprfbn sprfbn3 = this;
        this.cfr_renamed_4 = new spravp();
        this.cfr_renamed_3 = sprfbn2;
    }
}

