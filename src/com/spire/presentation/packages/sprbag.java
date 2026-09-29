/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgdg;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkjf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwxf;
import com.spire.presentation.packages.sprxk;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public class sprbag
implements sprxk {
    private final SecureRandom cfr_renamed_4;

    public sprbag(SecureRandom secureRandom) {
        this.cfr_renamed_4 = secureRandom;
    }

    @Override
    public sprki cfr_renamed_5686(spryye arg0) {
        sprgdg sprgdg2 = (sprgdg)arg0;
        sprwxf sprwxf2 = sprgdg2.cfr_renamed_284().cfr_renamed_143();
        byte[] byArray = new byte[sprgdg2.cfr_renamed_284().cfr_renamed_6570()];
        byte[] byArray2 = new byte[sprgdg2.cfr_renamed_284().cfr_renamed_6567()];
        byte[] byArray3 = new byte[sprgdg2.cfr_renamed_284().cfr_renamed_6573()];
        byte[] byArray4 = new byte[sprgdg2.cfr_renamed_284().cfr_renamed_6570()];
        byte[] byArray5 = new byte[sprgdg2.cfr_renamed_284().cfr_renamed_6566()];
        byte[] byArray6 = sprgdg2.cfr_renamed_1157();
        byte[] byArray7 = new byte[48];
        this.cfr_renamed_4.nextBytes(byArray7);
        sprwxf2.cfr_renamed_6577(byArray2, byArray3, byArray, byArray4, byArray6, byArray7, byArray5);
        byte[] byArray8 = sproze.cfr_renamed_526(byArray2, byArray3, byArray4, byArray5);
        return new sprkjf(sproze.cfr_renamed_533(byArray, 0, sprgdg2.cfr_renamed_284().cfr_renamed_1150()), byArray8);
    }
}

