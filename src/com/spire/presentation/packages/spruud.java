/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcsd;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprsud;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprzod;
import java.security.Provider;
import java.security.SecureRandom;

public class spruud {
    private sprsud cfr_renamed_1;
    private final int cfr_renamed_2;
    private final sprtzd cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public sproa cfr_renamed_1451() throws sprzod {
        spruud spruud2 = this;
        spruud spruud3 = this;
        return new sprcsd(spruud3, spruud2.cfr_renamed_3, spruud2.cfr_renamed_2, spruud3.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public spruud cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_1 = new sprsud(new spritd((Provider)arg0));
        return this;
    }

    public static /* synthetic */ sprsud cfr_renamed_4345(spruud arg0) {
        return arg0.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public spruud cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_1 = new sprsud(new sprrwd((String)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spruud(sprtzd sprtzd2, int n) {
        void arg0;
        spruud spruud2 = this;
        spruud spruud3 = this;
        spruud3.cfr_renamed_1 = new sprsud(new sprkvd());
        spruud2.cfr_renamed_3 = arg0;
        spruud2.cfr_renamed_2 = n;
    }

    public spruud cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public spruud(sprtzd arg0) {
        this(arg0, -1);
    }
}

