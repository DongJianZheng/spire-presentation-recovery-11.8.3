/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spretf;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprljf;
import com.spire.presentation.packages.sprluda;
import com.spire.presentation.packages.sprvof;
import com.spire.presentation.packages.sprxbaa;
import com.spire.presentation.packages.sprxl;

public final class sprirf {
    private final int cfr_renamed_119;
    private final int cfr_renamed_91;
    private final int cfr_renamed_0;
    private final int cfr_renamed_1;
    private final sprlem cfr_renamed_2;
    private final int cfr_renamed_3;
    private final sprxl cfr_renamed_4;

    public int cfr_renamed_1250() {
        return this.cfr_renamed_91;
    }

    public sprlem cfr_renamed_3234() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_5868() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_5786() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_5732() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_5869() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprirf(sprlem sprlem2) {
        void arg0;
        if (sprlem2 == null) {
            throw new NullPointerException(sprluda.cfr_renamed_9("\u007f#n4O8l4x%+l6qe$g="));
        }
        sprirf sprirf2 = this;
        sprirf sprirf3 = this;
        sprirf3.cfr_renamed_2 = arg0;
        sprgf sprgf2 = sprljf.cfr_renamed_5654((sprlem)arg0);
        sprirf3.cfr_renamed_3 = sprvof.cfr_renamed_5657(sprgf2);
        sprirf2.cfr_renamed_91 = 16;
        this.cfr_renamed_119 = (int)Math.ceil((double)(8 * this.cfr_renamed_3) / (double)sprvof.cfr_renamed_1340(this.cfr_renamed_91));
        sprirf2.cfr_renamed_1 = (int)Math.floor(sprvof.cfr_renamed_1340(sprirf2.cfr_renamed_119 * (this.cfr_renamed_91 - 1)) / sprvof.cfr_renamed_1340(this.cfr_renamed_91)) + 1;
        sprirf2.cfr_renamed_0 = sprirf2.cfr_renamed_119 + this.cfr_renamed_1;
        sprirf sprirf4 = this;
        sprirf2.cfr_renamed_4 = spretf.cfr_renamed_5870(sprgf2.cfr_renamed_1315(), sprirf4.cfr_renamed_3, sprirf4.cfr_renamed_91, this.cfr_renamed_0);
        if (sprirf2.cfr_renamed_4 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxbaa.cfr_renamed_9("\u0000 \r/\f5C'\n/\u0007a,\b'a\u0005.\u0011a\u0007(\u0004$\u00105C \u000f&\f3\n5\u000b,Ya")).append(sprgf2.cfr_renamed_1315()).toString());
        }
    }

    public sprxl cfr_renamed_4721() {
        return this.cfr_renamed_4;
    }
}

