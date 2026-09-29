/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprca;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprfbe;
import com.spire.presentation.packages.sprfhb;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprume;
import java.security.SecureRandom;

public class sprpbb
implements sprca {
    private SecureRandom cfr_renamed_0;
    private int cfr_renamed_1;
    private sprije cfr_renamed_2;
    private sprko cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpbb(sprko sprko2, sprije sprije2) {
        void arg1;
        void arg0;
        sprpbb sprpbb2 = this;
        sprpbb sprpbb3 = this;
        sprpbb3.cfr_renamed_1 = 1024;
        sprpbb3.cfr_renamed_3 = arg0;
        sprpbb2.cfr_renamed_2 = arg1;
        sprpbb2.cfr_renamed_4 = sprko2.cfr_renamed_1218();
    }

    @Override
    public sprije cfr_renamed_1479() {
        return this.cfr_renamed_2;
    }

    public sprpbb() {
        this(new sprlid(), new sprije(sprdh.cfr_renamed_86, sprume.cfr_renamed_3));
    }

    @Override
    public sprha cfr_renamed_1480(char[] arg0) {
        if (this.cfr_renamed_0 == null) {
            sprpbb sprpbb2 = this;
            sprpbb2.cfr_renamed_0 = new SecureRandom();
        }
        sprpbb sprpbb3 = this;
        byte[] byArray = new byte[sprpbb3.cfr_renamed_4];
        sprpbb3.cfr_renamed_0.nextBytes(byArray);
        return sprfhb.cfr_renamed_1522(sprpbb3.cfr_renamed_2.cfr_renamed_593(), this.cfr_renamed_3, new sprfbe(byArray, this.cfr_renamed_1), arg0);
    }
}

