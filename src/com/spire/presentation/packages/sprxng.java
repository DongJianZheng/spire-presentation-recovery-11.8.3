/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprpig;
import com.spire.presentation.packages.sprxfg;
import java.security.SecureRandom;

public class sprxng
implements sprgm {
    private sprpig cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprxfg cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            if (arg1 instanceof sprbgk) {
                this.cfr_renamed_4 = (sprxfg)((sprbgk)arg1).cfr_renamed_284();
                this.cfr_renamed_3 = ((sprbgk)arg1).cfr_renamed_1295();
                return;
            }
            this.cfr_renamed_4 = (sprxfg)arg1;
            this.cfr_renamed_3 = null;
            return;
        }
        this.cfr_renamed_2 = (sprpig)arg1;
    }

    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        return this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_7120(this.cfr_renamed_3).cfr_renamed_7121(arg0, arg0.length, this.cfr_renamed_4.cfr_renamed_119, this.cfr_renamed_4.cfr_renamed_1, this.cfr_renamed_4.cfr_renamed_2, this.cfr_renamed_4.cfr_renamed_0, this.cfr_renamed_4.cfr_renamed_4, this.cfr_renamed_4.cfr_renamed_91);
    }

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        return this.cfr_renamed_2.cfr_renamed_284().cfr_renamed_7120(this.cfr_renamed_3).cfr_renamed_7122(arg0, arg1, arg1.length, this.cfr_renamed_2.cfr_renamed_4, this.cfr_renamed_2.cfr_renamed_3);
    }
}

