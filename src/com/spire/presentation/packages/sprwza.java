/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprba;
import com.spire.presentation.packages.sprbab;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprsya;
import com.spire.presentation.packages.sprua;
import java.security.Provider;

public class sprwza {
    private sprhn cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprba cfr_renamed_4;

    public static /* synthetic */ boolean cfr_renamed_1501(sprwza arg0) {
        return arg0.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprwza cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_2 = new spritd((Provider)arg0);
        return this;
    }

    public sprwza cfr_renamed_1502(boolean arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprwza cfr_renamed_1500(sprba arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprwza() {
        sprwza sprwza2 = this;
        sprwza sprwza3 = this;
        sprwza2.cfr_renamed_2 = new sprkvd();
        sprwza2.cfr_renamed_3 = false;
        sprwza2.cfr_renamed_4 = sprsya.cfr_renamed_3;
    }

    public sprua cfr_renamed_1480(char[] arg0) {
        return new sprbab(this, arg0);
    }

    public static /* synthetic */ sprba cfr_renamed_1503(sprwza arg0) {
        return arg0.cfr_renamed_4;
    }

    public static /* synthetic */ sprhn cfr_renamed_1504(sprwza arg0) {
        return arg0.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwza cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_2 = new sprrwd((String)arg0);
        return this;
    }
}

