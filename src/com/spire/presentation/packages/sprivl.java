/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprecia;
import com.spire.presentation.packages.sprez;
import com.spire.presentation.packages.sprjlg;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprpol;
import com.spire.presentation.packages.sprujg;
import com.spire.presentation.packages.spryhg;

public abstract class sprivl
implements sprez {
    private sprjlg cfr_renamed_4;

    public sprivl(sprujg sprujg2) {
        this.cfr_renamed_4 = sprujg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbj cfr_renamed_10706(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        try {
            return sprpol.cfr_renamed_10840(this.cfr_renamed_4.cfr_renamed_7425(arg1, arg2));
        }
        catch (spryhg spryhg2) {
            throw new sprlyl(new StringBuilder().insert(0, sprecia.cfr_renamed_9("2\u00134\u000e'\u001f>\u00049K\"\u0005 \u00196\u001b'\u00029\fw\u00002\u0012mK")).append(spryhg2.getMessage()).toString(), spryhg2);
        }
    }
}

