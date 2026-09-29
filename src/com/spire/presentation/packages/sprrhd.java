/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrlb;

public class sprrhd {
    private final sprrlb cfr_renamed_3;
    private final sprrlb cfr_renamed_4;

    public sprrlb spr\u3181() {
        return this.cfr_renamed_3;
    }

    public sprrlb cfr_renamed_1980() {
        return this.cfr_renamed_4;
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode() + 37 * this.cfr_renamed_3.hashCode();
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprrhd) {
            return this.cfr_renamed_3744((sprrhd)arg0);
        }
        return false;
    }

    public boolean cfr_renamed_3744(sprrhd arg0) {
        return arg0.cfr_renamed_1980().cfr_renamed_1962(this.cfr_renamed_1980()) && arg0.spr\u3181().cfr_renamed_1962(this.spr\u3181());
    }

    /*
     * WARNING - void declaration
     */
    public sprrhd(sprrlb sprrlb2, sprrlb sprrlb3) {
        void arg0;
        sprrhd sprrhd2 = this;
        sprrhd2.cfr_renamed_4 = arg0;
        sprrhd2.cfr_renamed_3 = sprrlb3;
    }
}

