/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgo;
import com.spire.presentation.packages.sprjfk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprrgk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprxik;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprukk {
    private SecureRandom cfr_renamed_2;
    private sprgo cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprukk(SecureRandom secureRandom, boolean bl) {
        void arg1;
        this.cfr_renamed_2 = secureRandom;
        sprukk sprukk2 = this;
        this.cfr_renamed_3 = new sprjfk(this.cfr_renamed_2, (boolean)arg1);
    }

    public sprukk cfr_renamed_9949(byte[] arg0) {
        this.cfr_renamed_4 = sproze.cfr_renamed_158(arg0);
        return this;
    }

    public sprukk(sprgo sprgo2) {
        sprukk sprukk2 = this;
        sprukk2.cfr_renamed_2 = null;
        sprukk2.cfr_renamed_3 = sprgo2;
    }

    public sprxik cfr_renamed_9950(sprmr arg0, sprtpk arg1, boolean arg2) {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = new byte[arg0.cfr_renamed_1195()];
            sprpxe.cfr_renamed_450(System.currentTimeMillis(), this.cfr_renamed_4, 0);
        }
        arg0.cfr_renamed_5535(true, arg1);
        sprukk sprukk2 = this;
        sprmr sprmr2 = arg0;
        return new sprxik(this.cfr_renamed_2, new sprrgk(sprmr2, sprukk2.cfr_renamed_4, sprukk2.cfr_renamed_3.cfr_renamed_576(sprmr2.cfr_renamed_1195() * 8)), arg2);
    }

    public sprukk() {
        this(sprybl.cfr_renamed_2794(), false);
    }
}

