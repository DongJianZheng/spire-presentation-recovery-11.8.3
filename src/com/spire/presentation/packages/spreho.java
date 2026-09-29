/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjeka;
import com.spire.presentation.packages.sprlho;
import com.spire.presentation.packages.sprtea;

@sprtea
public class spreho {
    private sprjeka cfr_renamed_4;

    public void cfr_renamed_16718(sprlho arg0) {
        this.cfr_renamed_4.cfr_renamed_12516(arg0);
    }

    public sprlho cfr_renamed_16275(int arg0) {
        while (this.cfr_renamed_4.size() > 0) {
            sprlho sprlho2 = (sprlho)this.cfr_renamed_4.cfr_renamed_12514();
            if (sprlho2.cfr_renamed_16719() != arg0) continue;
            return sprlho2;
        }
        return null;
    }

    public spreho() {
        spreho spreho2 = this;
        spreho2.cfr_renamed_4 = new sprjeka();
    }
}

