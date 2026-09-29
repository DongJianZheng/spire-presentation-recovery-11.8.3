/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.spryye;

public class sprztk
extends spryye {
    private sprwsk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprztk(boolean bl, sprwsk sprwsk2) {
        super((boolean)arg0);
        void arg0;
        this.cfr_renamed_4 = sprwsk2;
    }

    public int hashCode() {
        int n;
        int n2 = n = this.cfr_renamed_1352() ? 0 : 1;
        if (this.cfr_renamed_4 != null) {
            n ^= this.cfr_renamed_4.hashCode();
        }
        return n;
    }

    public sprwsk cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprztk)) {
            return false;
        }
        sprztk sprztk2 = (sprztk)arg0;
        if (this.cfr_renamed_4 == null) {
            return sprztk2.cfr_renamed_284() == null;
        }
        return this.cfr_renamed_4.equals(sprztk2.cfr_renamed_284());
    }
}

