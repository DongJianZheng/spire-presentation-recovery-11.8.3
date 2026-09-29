/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreig;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkjf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwig;
import com.spire.presentation.packages.sprxk;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public class spruhg
implements sprxk {
    private final SecureRandom cfr_renamed_4;

    public spruhg(SecureRandom secureRandom) {
        this.cfr_renamed_4 = secureRandom;
    }

    @Override
    public sprki cfr_renamed_5686(spryye arg0) {
        sprwig sprwig2 = (sprwig)arg0;
        spreig spreig2 = sprwig2.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[sprwig2.cfr_renamed_284().cfr_renamed_7219()];
        byte[] byArray2 = new byte[sprwig2.cfr_renamed_284().cfr_renamed_5976()];
        byte[] byArray3 = new byte[sprwig2.cfr_renamed_284().cfr_renamed_7219()];
        byte[] byArray4 = sprwig2.cfr_renamed_4;
        spreig2.cfr_renamed_7222(byArray2, byArray3, byArray, byArray4, this.cfr_renamed_4);
        byte[] byArray5 = sproze.cfr_renamed_543(byArray2, byArray3);
        return new sprkjf(sproze.cfr_renamed_533(byArray, 0, sprwig2.cfr_renamed_284().cfr_renamed_6092() / 8), byArray5);
    }
}

