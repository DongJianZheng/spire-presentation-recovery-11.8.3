/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbdg;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkjf;
import com.spire.presentation.packages.sprmzf;
import com.spire.presentation.packages.sprxk;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public class sprbcg
implements sprxk {
    private final SecureRandom cfr_renamed_4;

    public sprbcg(SecureRandom secureRandom) {
        this.cfr_renamed_4 = secureRandom;
    }

    @Override
    public sprki cfr_renamed_5686(spryye arg0) {
        sprmzf sprmzf2 = (sprmzf)arg0;
        sprbdg sprbdg2 = sprmzf2.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[sprbdg2.cfr_renamed_6096()];
        byte[] byArray2 = new byte[sprbdg2.cfr_renamed_6092()];
        sprbdg2.cfr_renamed_6790(byArray, byArray2, sprmzf2.cfr_renamed_1157(), this.cfr_renamed_4);
        return new sprkjf(byArray2, byArray);
    }
}

