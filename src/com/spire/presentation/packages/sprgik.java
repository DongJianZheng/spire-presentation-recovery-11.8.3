/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcfk;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprqjk;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprux;
import com.spire.presentation.packages.sprxil;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;

public class sprgik {
    private sprrr cfr_renamed_4;

    public sprcfk cfr_renamed_9690(InputStream arg0) throws NoSuchProviderException, NoSuchAlgorithmException, IOException {
        return new sprcfk(arg0, (sprrk)new sprmwg(), (sprux)new sprqjk(this.cfr_renamed_4));
    }

    /*
     * WARNING - void declaration
     */
    public sprgik cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprkhi((Provider)arg0);
        return this;
    }

    public sprcfk cfr_renamed_2588(byte[] arg0) throws NoSuchProviderException, NoSuchAlgorithmException, IOException {
        byte[] byArray = arg0;
        return new sprcfk(arg0, (sprrk)new sprmwg(), (sprux)new sprqjk(this.cfr_renamed_4));
    }

    /*
     * WARNING - void declaration
     */
    public sprgik cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprxil((String)arg0);
        return this;
    }

    public sprgik() {
        sprgik sprgik2 = this;
        sprgik2.cfr_renamed_4 = new sprrul();
    }
}

