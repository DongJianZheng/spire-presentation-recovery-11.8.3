/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfj;
import com.spire.presentation.packages.sprewl;
import com.spire.presentation.packages.sproze;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class spreai
implements AlgorithmParameterSpec {
    private final PublicKey cfr_renamed_1;
    private final PublicKey cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final PrivateKey cfr_renamed_4;

    public spreai(PrivateKey arg0, PublicKey arg1) {
        this(null, arg0, arg1, null);
    }

    public PublicKey cfr_renamed_9200() {
        return this.cfr_renamed_2;
    }

    public spreai(KeyPair arg0, PublicKey arg1, byte[] arg2) {
        this(arg0.getPublic(), arg0.getPrivate(), arg1, arg2);
    }

    public spreai(PrivateKey arg0, PublicKey arg1, byte[] arg2) {
        this(null, arg0, arg1, arg2);
    }

    public byte[] cfr_renamed_4032() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public PublicKey cfr_renamed_2096() {
        return this.cfr_renamed_1;
    }

    public spreai(KeyPair arg0, PublicKey arg1) {
        this(arg0.getPublic(), arg0.getPrivate(), arg1, null);
    }

    /*
     * WARNING - void declaration
     */
    public spreai(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2, byte[] byArray) {
        void arg3;
        void arg1;
        void arg0;
        void arg2;
        if (privateKey == null) {
            throw new IllegalArgumentException(sprewl.cfr_renamed_9("p\u001d}\bx\bg\fyMe\u001f|\u001bt\u0019pM~\blMv\f{\u0003z\u00195\u000fpM{\u0018y\u0001"));
        }
        if (arg2 == null) {
            throw new IllegalArgumentException(sprdfj.cfr_renamed_9("u'r6hsj2h'cs\u007f#r6w6h2vsq6csy2t=u':1\u007fst&v?"));
        }
        spreai spreai2 = this;
        this.cfr_renamed_1 = arg0;
        spreai2.cfr_renamed_4 = arg1;
        spreai2.cfr_renamed_2 = arg2;
        this.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg3);
    }

    public spreai(PublicKey arg0, PrivateKey arg1, PublicKey arg2) {
        this(arg0, arg1, arg2, null);
    }

    public PrivateKey cfr_renamed_2094() {
        return this.cfr_renamed_4;
    }
}

