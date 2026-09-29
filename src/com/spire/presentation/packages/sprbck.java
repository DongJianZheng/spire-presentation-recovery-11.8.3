/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfzj;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprlvj;
import com.spire.presentation.packages.sprmq;
import com.spire.presentation.packages.sprnjh;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprrvj;
import com.spire.presentation.packages.sprwgh;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryhk;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;

public class sprbck
extends sprlvj {
    private sprrr cfr_renamed_4;

    public spryhk cfr_renamed_9533(sprwgh arg0, ECPublicKey arg1, ECPublicKey arg2) {
        sprrvj sprrvj2 = null;
        if (arg2 != null) {
            sprrvj2 = new sprrvj(arg2, this.cfr_renamed_4);
        }
        return super.cfr_renamed_9534(arg0, new sprfzj(arg1, this.cfr_renamed_4), sprrvj2);
    }

    /*
     * WARNING - void declaration
     */
    public sprbck cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprxil((String)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbck(sprmq sprmq2, sprnjh sprnjh2, sprrr sprrr2) {
        super((sprmq)arg0, (sprnjh)arg1);
        void arg1;
        void arg0;
        this.cfr_renamed_4 = sprrr2;
    }

    public sprbck(sprmq arg0, sprnjh arg1) {
        this(arg0, arg1, new sprrul());
    }

    public spryhk cfr_renamed_9535(sprwgh arg0, ECPublicKey arg1) {
        return this.cfr_renamed_9533(arg0, arg1, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprbck cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprkhi((Provider)arg0);
        return this;
    }
}

