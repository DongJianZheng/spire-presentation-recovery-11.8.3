/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbkn;
import com.spire.presentation.packages.sprcil;
import com.spire.presentation.packages.sprctj;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqbk;
import com.spire.presentation.packages.sprqlaa;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprtfk;
import com.spire.presentation.packages.sprxzl;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzg;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class sprruj
extends SignatureSpi
implements sprdl,
sprhl {
    private sprgf cfr_renamed_3;
    private sprjp cfr_renamed_4;

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprruj sprruj2;
        spryye spryye2 = null;
        if (arg0 instanceof sprqbk) {
            spryye2 = sprqpj.cfr_renamed_1220(arg0);
            sprruj2 = this;
            this.cfr_renamed_3 = new sprcil(this.cfr_renamed_2506(sprxzl.cfr_renamed_2511()));
        } else {
            if (arg0 instanceof sprzg) {
                spryye2 = sprqpj.cfr_renamed_1220(arg0);
                this.cfr_renamed_3 = new sprcil(this.cfr_renamed_2506(sprxzl.cfr_renamed_2511()));
            }
            sprruj2 = this;
        }
        if (sprruj2.appRandom != null) {
            this.cfr_renamed_4.cfr_renamed_5535(true, new sprbgk(spryye2, this.appRandom));
            return;
        }
        this.cfr_renamed_4.cfr_renamed_5535(true, spryye2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprruj sprruj2 = this;
        byte[] byArray = new byte[sprruj2.cfr_renamed_3.cfr_renamed_1218()];
        sprruj2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        try {
            byte[] byArray2 = ((sproug)sproug.cfr_renamed_184(arg0)).cfr_renamed_186();
            byte[] byArray3 = new byte[byArray2.length / 2];
            byte[] byArray4 = new byte[byArray2.length / 2];
            System.arraycopy(byArray2, 0, byArray4, 0, byArray2.length / 2);
            System.arraycopy(byArray2, byArray2.length / 2, byArray3, 0, byArray2.length / 2);
            BigInteger[] bigIntegerArray = new BigInteger[2];
            bigIntegerArray[0] = new BigInteger(1, byArray3);
            bigIntegerArray[1] = new BigInteger(1, byArray4);
            return this.cfr_renamed_4.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(sprbkn.cfr_renamed_9("\u0006X\u0011E\u0011\n\u0007O\u0000E\u0007C\rMCY\nM\rK\u0017_\u0011OCH\u001a^\u0006YM"));
        }
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprqlaa.cfr_renamed_9("W7U0\\<a<F\tS+S4W-W+\u0012,\\*G)B6@-W="));
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprbkn.cfr_renamed_9("O\rM\nD\u0006y\u0006^3K\u0011K\u000eO\u0017O\u0011\n\u0016D\u0010_\u0013Z\fX\u0017O\u0007"));
    }

    public byte[] cfr_renamed_2506(byte[] arg0) {
        int n;
        byte[] byArray = new byte[128];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            byArray[n * 2] = (byte)(arg0[n] >> 4 & 0xF);
            int n3 = n * 2 + 1;
            byte by = (byte)(arg0[n] & 0xF);
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    public sprruj() {
        sprruj sprruj2 = this;
        sprruj2.cfr_renamed_4 = new sprtfk();
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprruj sprruj2;
        spryye spryye2;
        if (arg0 instanceof sprctj) {
            spryye2 = ((sprctj)arg0).cfr_renamed_9389();
            sprruj sprruj3 = this;
            this.cfr_renamed_3 = new sprcil(this.cfr_renamed_2506(((sprctj)arg0).cfr_renamed_2387()));
            sprruj2 = this;
        } else {
            spryye2 = sprqpj.cfr_renamed_1216(arg0);
            sprruj sprruj4 = this;
            sprruj2 = sprruj4;
            sprruj4.cfr_renamed_3 = new sprcil(sprruj4.cfr_renamed_2506(sprxzl.cfr_renamed_2511()));
        }
        sprruj2.cfr_renamed_4.cfr_renamed_5535(false, spryye2);
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprqlaa.cfr_renamed_9("W7U0\\<a<F\tS+S4W-W+\u0012,\\*G)B6@-W="));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprruj sprruj2 = this;
        byte[] byArray = new byte[sprruj2.cfr_renamed_3.cfr_renamed_1218()];
        sprruj2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        try {
            BigInteger[] bigIntegerArray = this.cfr_renamed_4.cfr_renamed_125(byArray);
            byte[] byArray2 = bigIntegerArray[0].toByteArray();
            byte[] byArray3 = bigIntegerArray[1].toByteArray();
            byte[] byArray4 = new byte[byArray2.length > byArray3.length ? byArray2.length * 2 : byArray3.length * 2];
            System.arraycopy(byArray3, 0, byArray4, byArray4.length / 2 - byArray3.length, byArray3.length);
            System.arraycopy(byArray2, 0, byArray4, byArray4.length - byArray2.length, byArray2.length);
            return new sprfvg(byArray4).cfr_renamed_91();
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }
}

