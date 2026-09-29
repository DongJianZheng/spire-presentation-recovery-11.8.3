/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprkfb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprvbb;
import com.spire.presentation.packages.spryvd;
import com.spire.presentation.packages.sprzto;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class sprnfb
extends SignatureSpi {
    private sprvbb cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprlc cfr_renamed_4;

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprzto.cfr_renamed_9("4I6N?B\u0002B%w0U0J4S4UqR?T$W!H#S4C"));
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(spryvd.cfr_renamed_9("d3f4o8R8u\r`/`0d)d/!(o.t-q2s)d9"));
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprhgb sprhgb2 = sprkfb.cfr_renamed_1216(arg0);
        sprnfb sprnfb2 = this;
        sprnfb2.cfr_renamed_4.cfr_renamed_41();
        sprnfb2.cfr_renamed_2.cfr_renamed_1217(false, sprhgb2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprnfb sprnfb2 = this;
        byte[] byArray = new byte[sprnfb2.cfr_renamed_4.cfr_renamed_1218()];
        sprnfb2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            return this.cfr_renamed_2.cfr_renamed_125(byArray);
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprzto.cfr_renamed_9("4I6N?B\u0002B%w0U0J4S4UqR?T$W!H#S4C"));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        void arg1;
        this.cfr_renamed_3 = arg1;
        this.engineInitSign(privateKey);
    }

    /*
     * WARNING - void declaration
     */
    public sprnfb(sprlc sprlc2, sprvbb sprvbb2) {
        void arg0;
        sprnfb sprnfb2 = this;
        sprnfb2.cfr_renamed_4 = arg0;
        sprnfb2.cfr_renamed_2 = sprvbb2;
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprt sprt2 = sprkfb.cfr_renamed_1220(arg0);
        if (this.cfr_renamed_3 != null) {
            sprt2 = new spraed(sprt2, this.cfr_renamed_3);
        }
        sprnfb sprnfb2 = this;
        sprnfb2.cfr_renamed_4.cfr_renamed_41();
        sprnfb2.cfr_renamed_2.cfr_renamed_1217(true, sprt2);
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprnfb sprnfb2 = this;
        byte[] byArray = new byte[sprnfb2.cfr_renamed_4.cfr_renamed_1218()];
        sprnfb2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        return sprnfb2.cfr_renamed_2.cfr_renamed_129(byArray, arg0);
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }
}

