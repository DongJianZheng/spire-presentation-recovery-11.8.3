/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcvf;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprpdf;
import com.spire.presentation.packages.sprqyf;
import com.spire.presentation.packages.sprrkf;
import com.spire.presentation.packages.sprvbz;
import com.spire.presentation.packages.sprxff;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class sprgaf
extends SignatureSpi {
    private final sprgf cfr_renamed_3;
    private final sprqyf cfr_renamed_4;

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprgaf sprgaf2 = this;
        byte[] byArray = new byte[sprgaf2.cfr_renamed_3.cfr_renamed_1218()];
        sprgaf2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        try {
            return this.cfr_renamed_4.cfr_renamed_125(byArray);
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprrkf.cfr_renamed_9("\t]\u000bZ\u0002V?V\u0018c\rA\r^\tG\tALF\u0002@\u0019C\u001c\\\u001eG\tW"));
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprgaf sprgaf2 = this;
        byte[] byArray = new byte[sprgaf2.cfr_renamed_3.cfr_renamed_1218()];
        sprgaf2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        return sprgaf2.cfr_renamed_4.cfr_renamed_129(byArray, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprgaf(sprgf sprgf2, sprqyf sprqyf2) {
        void arg0;
        sprgaf sprgaf2 = this;
        sprgaf2.cfr_renamed_3 = arg0;
        sprgaf2.cfr_renamed_4 = sprqyf2;
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprvbz.cfr_renamed_9("G)E.L\"q\"V\u0017C5C*G3G5\u00022L4W7R(P3G#"));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        void arg1;
        this.appRandom = arg1;
        this.engineInitSign(privateKey);
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprrkf.cfr_renamed_9("\t]\u000bZ\u0002V?V\u0018c\rA\r^\tG\tALF\u0002@\u0019C\u001c\\\u001eG\tW"));
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprpdf) {
            sprbj sprbj2 = ((sprpdf)arg0).cfr_renamed_5650();
            this.cfr_renamed_4.cfr_renamed_5535(false, sprbj2);
            return;
        }
        throw new InvalidKeyException(sprvbz.cfr_renamed_9("2L,L(U)\u00027W%N.AgI\"[gR&Q4G#\u00023Mgq\u0017j\u000el\u0004ql"));
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprxff) {
            sprcvf sprcvf2 = ((sprxff)arg0).cfr_renamed_5650();
            if (this.appRandom != null) {
                this.cfr_renamed_4.cfr_renamed_5535(true, new sprbgk(sprcvf2, this.appRandom));
                return;
            }
            this.cfr_renamed_4.cfr_renamed_5535(true, sprcvf2);
            return;
        }
        throw new InvalidKeyException(sprrkf.cfr_renamed_9("\u0019]\u0007]\u0003D\u0002\u0013\u001cA\u0005E\rG\t\u0013\u0007V\u0015\u0013\u001cR\u001f@\tWLG\u0003\u0013?c$z\"p?\u0018"));
    }
}

