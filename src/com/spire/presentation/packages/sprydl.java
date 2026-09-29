/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.sprqhl;
import com.spire.presentation.packages.sprsf;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.SecureRandom;

public class sprydl {
    private final int cfr_renamed_0;
    private sprdul cfr_renamed_1;
    private final sprlem cfr_renamed_2;
    private AlgorithmParameters cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprydl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_1 = new sprdul(new sprdhl((Provider)arg0));
        return this;
    }

    public sprydl(sprlem arg0) {
        this(arg0, -1);
    }

    /*
     * WARNING - void declaration
     */
    public sprydl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_1 = new sprdul(new sprpfl((String)arg0));
        return this;
    }

    public sprydl cfr_renamed_10725(AlgorithmParameters arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public static /* synthetic */ sprdul cfr_renamed_10726(sprydl arg0) {
        return arg0.cfr_renamed_1;
    }

    public sprsf cfr_renamed_1451() throws sprlyl {
        sprydl sprydl2 = this;
        sprydl sprydl3 = this;
        return new sprqhl(sprydl3, sprydl2.cfr_renamed_2, sprydl2.cfr_renamed_0, sprydl3.cfr_renamed_3, this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprydl(sprlem sprlem2, int n) {
        void arg0;
        sprydl sprydl2 = this;
        sprydl sprydl3 = this;
        sprydl3.cfr_renamed_1 = new sprdul(new sprjrl());
        sprydl2.cfr_renamed_2 = arg0;
        sprydl2.cfr_renamed_0 = n;
    }

    public sprydl cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }
}

