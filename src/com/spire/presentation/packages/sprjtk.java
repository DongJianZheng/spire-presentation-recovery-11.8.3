/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcuk;
import com.spire.presentation.packages.spryye;

public class sprjtk
extends spryye {
    private sprcuk cfr_renamed_4;

    public int hashCode() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.hashCode();
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprjtk(boolean bl, sprcuk sprcuk2) {
        super((boolean)arg0);
        void arg0;
        this.cfr_renamed_4 = sprcuk2;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprjtk)) {
            return false;
        }
        sprjtk sprjtk2 = (sprjtk)arg0;
        if (this.cfr_renamed_4 == null) {
            return sprjtk2.cfr_renamed_284() == null;
        }
        return this.cfr_renamed_4.equals(sprjtk2.cfr_renamed_284());
    }

    public sprcuk cfr_renamed_284() {
        return this.cfr_renamed_4;
    }
}

