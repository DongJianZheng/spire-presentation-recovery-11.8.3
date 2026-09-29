/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdza;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprna;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprtkfa;
import java.security.Provider;
import java.security.SecureRandom;

public class sprldb {
    private sprhn cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private final String cfr_renamed_4;

    public static /* synthetic */ String cfr_renamed_1610(sprldb arg0) {
        return arg0.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprldb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_2 = new spritd((Provider)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprldb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_2 = new sprrwd((String)arg0);
        return this;
    }

    public sprldb(String string) {
        sprldb sprldb2 = this;
        this.cfr_renamed_2 = new sprkvd();
        this.cfr_renamed_4 = string;
    }

    public sprna cfr_renamed_1480(char[] arg0) {
        if (this.cfr_renamed_3 == null) {
            sprldb sprldb2 = this;
            sprldb2.cfr_renamed_3 = new SecureRandom();
        }
        int n = this.cfr_renamed_4.startsWith(sprtkfa.cfr_renamed_9("3A!)")) ? 16 : 8;
        byte[] byArray = new byte[n];
        this.cfr_renamed_3.nextBytes(byArray);
        return new sprdza(this, byArray, arg0);
    }

    public sprldb cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public static /* synthetic */ sprhn cfr_renamed_1611(sprldb arg0) {
        return arg0.cfr_renamed_2;
    }
}

