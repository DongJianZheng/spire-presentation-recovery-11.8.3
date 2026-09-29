/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjj;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdfq;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfsj;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprlnj;
import com.spire.presentation.packages.sprlwk;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzlk;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;

public class sprbkj
extends KeyPairGenerator {
    public sprddm cfr_renamed_91;
    public sprlwk cfr_renamed_0;
    public sprzlk cfr_renamed_1;
    private static final sprddm cfr_renamed_2;
    private static final sprddm cfr_renamed_3;
    public static final BigInteger cfr_renamed_4;

    static {
        cfr_renamed_3 = new sprddm(sprdl.cfr_renamed_1205, sprpen.cfr_renamed_4);
        cfr_renamed_2 = new sprddm(sprdl.cfr_renamed_3250);
        cfr_renamed_4 = BigInteger.valueOf(65537L);
    }

    public static /* synthetic */ sprddm cfr_renamed_2413() {
        return cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        void v0 = arg0;
        this.cfr_renamed_1 = new sprzlk(cfr_renamed_4, (SecureRandom)arg1, (int)v0, sprfsj.cfr_renamed_9372((int)v0));
        this.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_1);
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof RSAKeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException(sprdfq.cfr_renamed_9("a\u000fc\u000f|\u000be\u000bcN~\f{\u000br\u001a1\u0000~\u001a1\u000f1<B/Z\u000bh)t\u0000A\u000fc\u000f|\u000be\u000bc=a\u000br"));
        }
        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec)arg0;
        this.cfr_renamed_1 = new sprzlk(rSAKeyGenParameterSpec.getPublicExponent(), arg1, rSAKeyGenParameterSpec.getKeysize(), sprfsj.cfr_renamed_9372(2048));
        this.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_1);
    }

    public sprbkj() {
        this("RSA", cfr_renamed_3);
    }

    @Override
    public KeyPair generateKeyPair() {
        sprsil sprsil2 = this.cfr_renamed_0.cfr_renamed_1223();
        sprkik sprkik2 = (sprkik)sprsil2.cfr_renamed_1224();
        sprkhk sprkhk2 = (sprkhk)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprbjj(this.cfr_renamed_91, sprkik2), new sprlnj(this.cfr_renamed_91, sprkhk2));
    }

    public sprbkj(String arg0, sprddm arg1) {
        super(arg0);
        this.cfr_renamed_91 = arg1;
        sprbkj sprbkj2 = this;
        this.cfr_renamed_0 = new sprlwk();
        sprbkj2.cfr_renamed_1 = new sprzlk(cfr_renamed_4, sprybl.cfr_renamed_2794(), 2048, sprfsj.cfr_renamed_9372(2048));
        this.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_1);
    }
}

