/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprttg;
import com.spire.presentation.packages.sprvtb;
import com.spire.presentation.packages.sprys;
import java.math.BigInteger;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public abstract class spreqj
extends SignatureSpi
implements sprdl,
sprhl {
    public sprys cfr_renamed_2;
    public sprjp cfr_renamed_3;
    public sprgf cfr_renamed_4;

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprttg.cfr_renamed_9("5g7`>l\u0003l$Y1{1d5}5{p|>z%y f\"}5m"));
    }

    /*
     * WARNING - void declaration
     */
    public spreqj(sprgf sprgf2, sprjp sprjp2, sprys sprys2) {
        void arg1;
        void arg0;
        spreqj spreqj2 = this;
        this.cfr_renamed_4 = arg0;
        spreqj2.cfr_renamed_3 = arg1;
        spreqj2.cfr_renamed_2 = sprys2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        spreqj spreqj2 = this;
        byte[] byArray = new byte[spreqj2.cfr_renamed_4.cfr_renamed_1218()];
        spreqj2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            spreqj spreqj3 = this;
            BigInteger[] bigIntegerArray = spreqj3.cfr_renamed_2.cfr_renamed_9387(spreqj3.cfr_renamed_3.cfr_renamed_1932(), arg0);
            return this.cfr_renamed_3.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(sprvtb.cfr_renamed_9(",H;U;\u001a-_*U-S']iI ]'[=O;_iX0N,Ig"));
        }
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprttg.cfr_renamed_9("5g7`>l\u0003l$Y1{1d5}5{p|>z%y f\"}5m"));
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprvtb.cfr_renamed_9("_'] T,i,N\u0019[;[$_=_;\u001a<T:O9J&H=_-"));
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        spreqj spreqj2 = this;
        byte[] byArray = new byte[spreqj2.cfr_renamed_4.cfr_renamed_1218()];
        spreqj2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            spreqj spreqj3 = this;
            BigInteger[] bigIntegerArray = spreqj3.cfr_renamed_3.cfr_renamed_125(byArray);
            return spreqj3.cfr_renamed_2.cfr_renamed_9388(this.cfr_renamed_3.cfr_renamed_1932(), bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }
}

