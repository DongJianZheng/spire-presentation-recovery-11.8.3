/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprrtf;
import com.spire.presentation.packages.sprsbg;
import com.spire.presentation.packages.sprxvf;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprmvf
implements sprgm {
    private SecureRandom cfr_renamed_2;
    private sprxvf cfr_renamed_3;
    private sprsbg cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        sprrtf sprrtf2;
        sprrtf sprrtf3 = sprrtf2 = this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_143();
        sprrtf sprrtf4 = sprrtf2;
        int n = sprrtf3.cfr_renamed_1197 + (sprrtf3.cfr_renamed_1329 - 1) * (sprrtf4.cfr_renamed_1197 - sprrtf4.cfr_renamed_1472) + 7 >>> 3;
        byte[] byArray = new byte[arg0.length + n];
        System.arraycopy(arg0, 0, byArray, n, arg0.length);
        sprrtf2.cfr_renamed_6702(this.cfr_renamed_2, byArray, arg0, 0, arg0.length, this.cfr_renamed_4.cfr_renamed_4);
        return byArray;
    }

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        return this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_143().cfr_renamed_6253(this.cfr_renamed_3.cfr_renamed_6703(), arg0, arg1) != 0;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            if (arg1 instanceof sprbgk) {
                this.cfr_renamed_4 = (sprsbg)((sprbgk)arg1).cfr_renamed_284();
                this.cfr_renamed_2 = ((sprbgk)arg1).cfr_renamed_1295();
                return;
            }
            this.cfr_renamed_4 = (sprsbg)arg1;
            this.cfr_renamed_2 = sprybl.cfr_renamed_2794();
            return;
        }
        this.cfr_renamed_3 = (sprxvf)arg1;
    }
}

