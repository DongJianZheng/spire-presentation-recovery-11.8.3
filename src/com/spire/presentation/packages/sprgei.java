/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class sprgei
implements AlgorithmParameterSpec {
    private final PublicKey cfr_renamed_1;
    private final PublicKey cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final PrivateKey cfr_renamed_4;

    public PublicKey cfr_renamed_2096() {
        return this.cfr_renamed_2;
    }

    public sprgei(PrivateKey arg0, PublicKey arg1, byte[] arg2) {
        this(null, arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprgei(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2, byte[] byArray) {
        void arg2;
        void arg1;
        void arg0;
        sprgei sprgei2 = this;
        sprgei sprgei3 = this;
        sprgei3.cfr_renamed_2 = arg0;
        sprgei3.cfr_renamed_4 = arg1;
        sprgei2.cfr_renamed_1 = arg2;
        sprgei2.cfr_renamed_3 = sproze.cfr_renamed_158(byArray);
    }

    public sprgei(KeyPair arg0, PublicKey arg1) {
        this(arg0.getPublic(), arg0.getPrivate(), arg1, null);
    }

    public PublicKey cfr_renamed_9200() {
        return this.cfr_renamed_1;
    }

    public PrivateKey cfr_renamed_2094() {
        return this.cfr_renamed_4;
    }

    public sprgei(PublicKey arg0, PrivateKey arg1, PublicKey arg2) {
        this(arg0, arg1, arg2, null);
    }

    public byte[] cfr_renamed_4032() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public sprgei(PrivateKey arg0, PublicKey arg1) {
        this(null, arg0, arg1, null);
    }

    public sprgei(KeyPair arg0, PublicKey arg1, byte[] arg2) {
        this(arg0.getPublic(), arg0.getPrivate(), arg1, arg2);
    }
}

