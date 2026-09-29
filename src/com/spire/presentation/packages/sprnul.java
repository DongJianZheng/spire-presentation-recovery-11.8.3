/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprkkg;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmnja;
import com.spire.presentation.packages.sprpol;
import com.spire.presentation.packages.sprxx;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.spryye;

public abstract class sprnul
implements sprxx {
    private spryye cfr_renamed_4;

    public sprnul(spryye spryye2) {
        this.cfr_renamed_4 = spryye2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbj cfr_renamed_10706(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        sprkkg sprkkg2 = new sprkkg(arg0, this.cfr_renamed_4);
        try {
            return sprpol.cfr_renamed_10840(sprkkg2.cfr_renamed_7425(arg1, arg2));
        }
        catch (spryhg spryhg2) {
            throw new sprlyl(new StringBuilder().insert(0, sprmnja.cfr_renamed_9("\u0003 \u0005=\u0016,\u000f7\bx\u00136\u0011*\u0007(\u00161\b?F3\u0003!\\x")).append(spryhg2.getMessage()).toString(), spryhg2);
        }
    }
}

