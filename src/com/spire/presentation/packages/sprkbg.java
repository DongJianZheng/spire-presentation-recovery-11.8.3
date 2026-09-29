/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjog;
import com.spire.presentation.packages.sprntf;
import com.spire.presentation.packages.spryh;
import com.spire.presentation.packages.spryvf;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public class sprkbg
implements spryh {
    private final SecureRandom cfr_renamed_4;

    @Override
    public sprjog cfr_renamed_5693(spryye arg0) {
        spryvf spryvf2 = (spryvf)arg0;
        byte[] byArray = new byte[32];
        byte[] byArray2 = new byte[2048];
        sprntf.cfr_renamed_6421(this.cfr_renamed_4, byArray, byArray2, spryvf2.cfr_renamed_4);
        return new sprjog(new spryvf(byArray2), byArray);
    }

    public sprkbg(SecureRandom secureRandom) {
        this.cfr_renamed_4 = secureRandom;
    }

    public sprjog cfr_renamed_6422(spryye arg0) {
        return this.cfr_renamed_5693(arg0);
    }
}

