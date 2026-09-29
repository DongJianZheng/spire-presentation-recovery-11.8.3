/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgil;
import com.spire.presentation.packages.sprihg;
import com.spire.presentation.packages.sprplm;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.SecretKey;

public class spridl
extends sprgil {
    public spridl cfr_renamed_1555(SecureRandom arg0) {
        ((sprihg)this.cfr_renamed_4).cfr_renamed_1555(arg0);
        return this;
    }

    public spridl(sprplm arg0, SecretKey arg1) {
        super(arg0, new sprihg(arg1));
    }

    public spridl cfr_renamed_1498(Provider arg0) {
        ((sprihg)this.cfr_renamed_4).cfr_renamed_1498(arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spridl(byte[] byArray, SecretKey secretKey) {
        this(new sprplm((byte[])arg0, null, null), (SecretKey)arg1);
        void arg1;
        void arg0;
    }

    public spridl cfr_renamed_1499(String arg0) {
        ((sprihg)this.cfr_renamed_4).cfr_renamed_1499(arg0);
        return this;
    }
}

