/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprntf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwzf;
import com.spire.presentation.packages.spryvf;
import java.security.SecureRandom;

public class sprowf
implements sprii {
    private SecureRandom cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        byte[] byArray = new byte[1824];
        short[] sArray = new short[1024];
        sprntf.cfr_renamed_6420(this.cfr_renamed_4, byArray, sArray);
        return new sprsil(new spryvf(byArray), new sprwzf(sArray));
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = arg0.cfr_renamed_1295();
    }
}

