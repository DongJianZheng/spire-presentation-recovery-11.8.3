/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcfp;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprkck;
import com.spire.presentation.packages.sprkmk;
import com.spire.presentation.packages.sprqks;
import com.spire.presentation.packages.sprys;
import com.spire.presentation.packages.spryye;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class sprgxj
extends SignatureSpi
implements sprdl,
sprhl {
    private SecureRandom cfr_renamed_1;
    private sprjp cfr_renamed_2;
    private sprys cfr_renamed_3;
    private sprgf cfr_renamed_4;

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprqks.cfr_renamed_9("\b\u0012\n\u0015\u0003\u0019>\u0019\u0019,\f\u000e\f\u0011\b\b\b\u000eM\t\u0003\u000f\u0018\f\u001d\u0013\u001f\b\b\u0018"));
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprbj sprbj2 = sprkck.cfr_renamed_1220(arg0);
        if (this.cfr_renamed_1 != null) {
            sprbj2 = new sprbgk(sprbj2, this.cfr_renamed_1);
        }
        sprgxj sprgxj2 = this;
        sprgxj2.cfr_renamed_4.cfr_renamed_41();
        sprgxj2.cfr_renamed_2.cfr_renamed_5535(true, sprbj2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprgxj sprgxj2 = this;
        byte[] byArray = new byte[sprgxj2.cfr_renamed_4.cfr_renamed_1218()];
        sprgxj2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            sprgxj sprgxj3 = this;
            BigInteger[] bigIntegerArray = sprgxj3.cfr_renamed_3.cfr_renamed_9387(sprgxj3.cfr_renamed_2.cfr_renamed_1932(), arg0);
            return this.cfr_renamed_2.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(sprcfp.cfr_renamed_9("\u0011Z\u0006G\u0006\b\u0010M\u0017G\u0010A\u001aOT[\u001dO\u001aI\u0000]\u0006MTJ\r\\\u0011[Z"));
        }
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        spryye spryye2 = sprkck.cfr_renamed_1216(arg0);
        sprgxj sprgxj2 = this;
        sprgxj2.cfr_renamed_4.cfr_renamed_41();
        sprgxj2.cfr_renamed_2.cfr_renamed_5535(false, spryye2);
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprqks.cfr_renamed_9("\b\u0012\n\u0015\u0003\u0019>\u0019\u0019,\f\u000e\f\u0011\b\b\b\u000eM\t\u0003\u000f\u0018\f\u001d\u0013\u001f\b\b\u0018"));
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprcfp.cfr_renamed_9("M\u001aO\u001dF\u0011o\u0011\\$I\u0006I\u0019M\u0000M\u0006\b\u0001F\u0007]\u0004X\u001bZ\u0000M\u0010"));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        void arg1;
        this.cfr_renamed_1 = arg1;
        this.engineInitSign(privateKey);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprgxj sprgxj2 = this;
        byte[] byArray = new byte[sprgxj2.cfr_renamed_4.cfr_renamed_1218()];
        sprgxj2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            sprgxj sprgxj3 = this;
            BigInteger[] bigIntegerArray = sprgxj3.cfr_renamed_2.cfr_renamed_125(byArray);
            return sprgxj3.cfr_renamed_3.cfr_renamed_9388(this.cfr_renamed_2.cfr_renamed_1932(), bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprgxj(sprgf sprgf2, sprjp sprjp2) {
        void arg0;
        sprgxj sprgxj2 = this;
        this.cfr_renamed_3 = sprkmk.cfr_renamed_4;
        sprgxj2.cfr_renamed_4 = arg0;
        sprgxj2.cfr_renamed_2 = sprjp2;
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }
}

