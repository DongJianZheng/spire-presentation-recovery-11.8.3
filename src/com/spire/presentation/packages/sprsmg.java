/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhfg;
import com.spire.presentation.packages.sprkeg;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkjf;
import com.spire.presentation.packages.sprxk;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public class sprsmg
implements sprxk {
    private final SecureRandom cfr_renamed_4;

    @Override
    public sprki cfr_renamed_5686(spryye arg0) {
        sprhfg sprhfg2;
        sprkeg sprkeg2 = (sprkeg)arg0;
        sprhfg sprhfg3 = sprhfg2 = sprkeg2.cfr_renamed_284().cfr_renamed_143();
        sprhfg3.cfr_renamed_3251(this.cfr_renamed_4);
        byte[][] byArray = sprhfg3.cfr_renamed_7017(sprkeg2.cfr_renamed_91());
        return new sprkjf(byArray[0], byArray[1]);
    }

    public sprsmg(SecureRandom secureRandom) {
        this.cfr_renamed_4 = secureRandom;
    }
}

