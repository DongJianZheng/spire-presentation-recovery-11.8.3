/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.spriyf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtcg;
import com.spire.presentation.packages.spruzf;
import java.security.SecureRandom;

public class spraxf
implements sprii {
    public sprtcg cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        spraxf spraxf2 = this;
        SecureRandom secureRandom = spraxf2.cfr_renamed_4.cfr_renamed_1295();
        byte[] byArray = new byte[16];
        secureRandom.nextBytes(byArray);
        sprgzf sprgzf2 = spraxf2.cfr_renamed_4.cfr_renamed_284().cfr_renamed_6467();
        byte[] byArray2 = new byte[sprgzf2.cfr_renamed_1186()];
        secureRandom.nextBytes(byArray2);
        spriyf spriyf2 = spruzf.cfr_renamed_6490(sprgzf2, this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_6489(), 0, byArray, byArray2);
        return new sprsil(spriyf2.cfr_renamed_1157(), spriyf2);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = (sprtcg)arg0;
    }
}

