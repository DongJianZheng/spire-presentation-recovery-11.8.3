/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprblg;
import com.spire.presentation.packages.sprcfg;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkjf;
import com.spire.presentation.packages.sprxk;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public class sprnhg
implements sprxk {
    private final SecureRandom cfr_renamed_4;

    @Override
    public sprki cfr_renamed_5686(spryye arg0) {
        sprblg sprblg2 = ((sprcfg)arg0).cfr_renamed_284().cfr_renamed_143();
        return this.cfr_renamed_7152(arg0, sprblg2.cfr_renamed_7153());
    }

    public sprki cfr_renamed_7152(spryye arg0, int arg1) {
        sprcfg sprcfg2 = (sprcfg)arg0;
        sprblg sprblg2 = sprcfg2.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[sprblg2.cfr_renamed_6096()];
        byte[] byArray2 = new byte[arg1 / 8];
        sprblg2.cfr_renamed_6790(byArray, byArray2, sprcfg2.cfr_renamed_1157(), this.cfr_renamed_4);
        return new sprkjf(byArray2, byArray);
    }

    public sprnhg(SecureRandom secureRandom) {
        this.cfr_renamed_4 = secureRandom;
    }
}

