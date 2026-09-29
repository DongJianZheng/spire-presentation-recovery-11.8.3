/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprpgd;

public class sprpld
extends sprhgb {
    private sprpgd cfr_renamed_4;

    public sprpgd cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprpld(boolean bl, sprpgd sprpgd2) {
        super((boolean)arg0);
        void arg0;
        this.cfr_renamed_4 = sprpgd2;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprpld)) {
            return false;
        }
        sprpld sprpld2 = (sprpld)arg0;
        if (this.cfr_renamed_4 == null) {
            return sprpld2.cfr_renamed_284() == null;
        }
        return this.cfr_renamed_4.equals(sprpld2.cfr_renamed_284());
    }

    public int hashCode() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.hashCode();
        }
        return 0;
    }
}

