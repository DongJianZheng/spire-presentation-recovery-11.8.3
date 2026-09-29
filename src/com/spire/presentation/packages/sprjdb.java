/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprca;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprrza;
import com.spire.presentation.packages.sprya;
import java.security.Provider;

public class sprjdb
implements sprya {
    private sprhn cfr_renamed_4;

    public sprjdb() {
        sprjdb sprjdb2 = this;
        sprjdb2.cfr_renamed_4 = new sprkvd();
    }

    /*
     * WARNING - void declaration
     */
    public sprjdb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprrwd((String)arg0);
        return this;
    }

    public static /* synthetic */ sprhn cfr_renamed_1505(sprjdb arg0) {
        return arg0.cfr_renamed_4;
    }

    @Override
    public sprca cfr_renamed_578(sprije arg0) {
        return new sprrza(this, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprjdb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new spritd((Provider)arg0);
        return this;
    }
}

