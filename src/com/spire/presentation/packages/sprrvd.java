/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkne;
import com.spire.presentation.packages.sprrhb;
import com.spire.presentation.packages.sprwsd;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.SecretKey;

public class sprrvd
extends sprwsd {
    public sprrvd cfr_renamed_1499(String arg0) {
        ((sprrhb)this.cfr_renamed_3).cfr_renamed_1499(arg0);
        return this;
    }

    public sprrvd(sprkne arg0, SecretKey arg1) {
        super(arg0, new sprrhb(arg1));
    }

    public sprrvd cfr_renamed_1498(Provider arg0) {
        ((sprrhb)this.cfr_renamed_3).cfr_renamed_1498(arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprrvd(byte[] byArray, SecretKey secretKey) {
        this(new sprkne((byte[])arg0, null, null), (SecretKey)arg1);
        void arg1;
        void arg0;
    }

    public sprrvd cfr_renamed_1555(SecureRandom arg0) {
        ((sprrhb)this.cfr_renamed_3).cfr_renamed_1555(arg0);
        return this;
    }
}

