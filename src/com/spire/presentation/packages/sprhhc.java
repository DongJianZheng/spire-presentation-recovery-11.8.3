/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdgd;
import com.spire.presentation.packages.sprhjc;
import com.spire.presentation.packages.sprisc;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprnmy;
import com.spire.presentation.packages.sprold;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprylc;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;

public class sprhhc
extends KeyPairGenerator {
    public sprdgd cfr_renamed_1;
    public static final int cfr_renamed_2 = 12;
    public static final BigInteger cfr_renamed_3 = BigInteger.valueOf(65537L);
    public sprold cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg0;
        void arg1;
        this.cfr_renamed_4 = new sprold(cfr_renamed_3, (SecureRandom)arg1, (int)arg0, 12);
        this.cfr_renamed_1.cfr_renamed_1222(this.cfr_renamed_4);
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof RSAKeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException(sprnmy.cfr_renamed_9("Q\u000eS\u000eL\nU\nSON\rK\nB\u001b\u0001\u0001N\u001b\u0001\u000e\u0001=r.j\nX(D\u0001q\u000eS\u000eL\nU\nS<Q\nB"));
        }
        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec)arg0;
        this.cfr_renamed_4 = new sprold(rSAKeyGenParameterSpec.getPublicExponent(), arg1, rSAKeyGenParameterSpec.getKeysize(), 12);
        this.cfr_renamed_1.cfr_renamed_1222(this.cfr_renamed_4);
    }

    @Override
    public KeyPair generateKeyPair() {
        sprwnd sprwnd2 = this.cfr_renamed_1.cfr_renamed_1223();
        sprmtc sprmtc2 = (sprmtc)sprwnd2.cfr_renamed_1224();
        sprisc sprisc2 = (sprisc)sprwnd2.cfr_renamed_1225();
        return new KeyPair(new sprhjc(sprmtc2), new sprylc(sprisc2));
    }

    public sprhhc() {
        sprhhc sprhhc2 = this;
        super("RSA");
        sprhhc sprhhc3 = this;
        sprhhc2.cfr_renamed_1 = new sprdgd();
        sprhhc3.cfr_renamed_4 = new sprold(cfr_renamed_3, new SecureRandom(), 2048, 12);
        sprhhc2.cfr_renamed_1.cfr_renamed_1222(this.cfr_renamed_4);
    }

    public sprhhc(String arg0) {
        super(arg0);
    }
}

