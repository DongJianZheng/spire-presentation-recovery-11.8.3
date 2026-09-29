/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfyf;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkjf;
import com.spire.presentation.packages.sprlvf;
import com.spire.presentation.packages.sprxk;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public class sprseg
implements sprxk {
    private final SecureRandom cfr_renamed_4;

    public sprseg(SecureRandom secureRandom) {
        this.cfr_renamed_4 = secureRandom;
    }

    @Override
    public sprki cfr_renamed_5686(spryye arg0) {
        sprlvf sprlvf2 = (sprlvf)arg0;
        sprfyf sprfyf2 = sprlvf2.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[sprfyf2.cfr_renamed_6096()];
        byte[] byArray2 = new byte[sprfyf2.cfr_renamed_6092()];
        sprfyf2.cfr_renamed_6097(byArray, byArray2, sprlvf2.cfr_renamed_1157(), this.cfr_renamed_4);
        return new sprkjf(byArray2, byArray);
    }
}

