/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdbk;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprgnk;
import com.spire.presentation.packages.sprhpk;
import com.spire.presentation.packages.sprlhca;
import com.spire.presentation.packages.sprmml;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtci;
import com.spire.presentation.packages.spryio;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class spruyj
extends SignatureSpi {
    private sprtci cfr_renamed_1;
    private final sprrr cfr_renamed_2;
    private final sprhpk cfr_renamed_3;
    private AlgorithmParameters cfr_renamed_4;

    public spruyj(sprhpk sprhpk2) {
        spruyj spruyj2 = this;
        this.cfr_renamed_2 = new sprdki();
        this.cfr_renamed_3 = sprhpk2;
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        return this.cfr_renamed_3.cfr_renamed_1328(arg0);
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) throws InvalidAlgorithmParameterException {
        if (arg0 instanceof sprtci) {
            this.cfr_renamed_1 = (sprtci)arg0;
            return;
        }
        throw new InvalidAlgorithmParameterException(sprlhca.cfr_renamed_9("0\f3\u001b\u007f1\u0012P\u000f\u0003-\u00032\u0007+\u0007-1/\u0007<B,\u0017/\u00120\u0010+\u0007;"));
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprbj sprbj2 = sprqpj.cfr_renamed_1220(arg0);
        if (this.appRandom != null) {
            sprbj2 = new sprbgk(sprbj2, this.appRandom);
        }
        if (this.cfr_renamed_1 != null) {
            this.cfr_renamed_3.cfr_renamed_5535(true, new sprgnk(sprbj2, this.cfr_renamed_1.cfr_renamed_6005()));
            return;
        }
        this.cfr_renamed_3.cfr_renamed_5535(true, sprbj2);
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprbj sprbj2 = sprdbk.cfr_renamed_1216(arg0);
        if (this.cfr_renamed_1 != null) {
            sprbj2 = new sprgnk(sprbj2, this.cfr_renamed_1.cfr_renamed_6005());
        }
        this.cfr_renamed_3.cfr_renamed_5535(false, sprbj2);
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(spryio.cfr_renamed_9("F\u001dD\u001aM\u0016p\u0016W#B\u0001B\u001eF\u0007F\u0001\u0003\u0006M\u0000V\u0003S\u001cQ\u0007F\u0017"));
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprlhca.cfr_renamed_9("\u00071\u00056\f:%:\u0016\u000f\u0003-\u00032\u0007+\u0007-B*\f,\u0017/\u00120\u0010+\u0007;"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        try {
            return this.cfr_renamed_3.cfr_renamed_1329();
        }
        catch (sprmml sprmml2) {
            throw new SignatureException(new StringBuilder().insert(0, spryio.cfr_renamed_9("V\u001dB\u0011O\u0016\u0003\u0007LS@\u0001F\u0012W\u0016\u0003\u0000J\u0014M\u0012W\u0006Q\u0016\u0019S")).append(sprmml2.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        spruyj spruyj2;
        if (this.cfr_renamed_4 == null && this.cfr_renamed_1 != null) {
            try {
                spruyj spruyj3 = this;
                spruyj3.cfr_renamed_4 = spruyj3.cfr_renamed_2.cfr_renamed_1540(sprlhca.cfr_renamed_9("\u000f1\f"));
                spruyj3.cfr_renamed_4.init(this.cfr_renamed_1);
                spruyj2 = this;
                return spruyj2.cfr_renamed_4;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        spruyj2 = this;
        return spruyj2.cfr_renamed_4;
    }
}

