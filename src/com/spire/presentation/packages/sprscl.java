/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;

public class sprscl {
    private final spreuh cfr_renamed_3;
    private final spreuh cfr_renamed_4;

    public spreuh spr\u3181() {
        return this.cfr_renamed_3;
    }

    public spreuh cfr_renamed_1980() {
        return this.cfr_renamed_4;
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode() + 37 * this.cfr_renamed_3.hashCode();
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprscl) {
            return this.cfr_renamed_10459((sprscl)arg0);
        }
        return false;
    }

    public boolean cfr_renamed_10459(sprscl arg0) {
        return arg0.cfr_renamed_1980().cfr_renamed_8927(this.cfr_renamed_1980()) && arg0.spr\u3181().cfr_renamed_8927(this.spr\u3181());
    }

    /*
     * WARNING - void declaration
     */
    public sprscl(spreuh spreuh2, spreuh spreuh3) {
        void arg0;
        sprscl sprscl2 = this;
        sprscl2.cfr_renamed_4 = arg0;
        sprscl2.cfr_renamed_3 = spreuh3;
    }
}

