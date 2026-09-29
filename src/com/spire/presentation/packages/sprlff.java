/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpwe;
import com.spire.presentation.packages.sprspo;
import com.spire.presentation.packages.spryye;

public final class sprlff
extends spryye {
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_5540() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprlff(int n, byte[] byArray) {
        super(false);
        void arg1;
        void arg0;
        if (byArray.length != sprpwe.cfr_renamed_5545((int)arg0)) {
            throw new IllegalArgumentException(sprspo.cfr_renamed_9("pBoMuE}\frI`\fjEcI9Jv^9_|Ol^pX`\fzMmI~CkU"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg1);
    }

    public int cfr_renamed_5538() {
        return this.cfr_renamed_3;
    }
}

