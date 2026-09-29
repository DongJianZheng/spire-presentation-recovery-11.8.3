/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpv;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprhgn
implements sprpv {
    private String cfr_renamed_4;

    @Override
    public String cfr_renamed_12172(String arg0) {
        String string = arg0;
        if (this.cfr_renamed_4 != null && arg0.startsWith(this.cfr_renamed_4)) {
            string = sprraia.cfr_renamed_12269(arg0, 0, this.cfr_renamed_4.length());
        }
        return string;
    }

    public sprhgn(String string) {
        this.cfr_renamed_4 = string;
    }
}

