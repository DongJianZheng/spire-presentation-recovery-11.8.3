/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafja;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spremf;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkcf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproxfa;
import com.spire.presentation.packages.sprref;
import com.spire.presentation.packages.sprrmf;
import com.spire.presentation.packages.sprsaf;
import com.spire.presentation.packages.sprzm;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

public class sprtye
extends Signature
implements sprzm {
    private sprlem cfr_renamed_1;
    private sprgf cfr_renamed_2;
    private sprrmf cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        void arg1;
        this.cfr_renamed_4 = arg1;
        this.engineInitSign(privateKey);
    }

    @Override
    public boolean cfr_renamed_2427() {
        return this.cfr_renamed_1 != null && this.cfr_renamed_3.cfr_renamed_5649() != 0L;
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprkcf) {
            sprbj sprbj2 = ((sprkcf)arg0).cfr_renamed_5650();
            this.cfr_renamed_1 = ((sprkcf)arg0).cfr_renamed_5651();
            if (this.cfr_renamed_4 != null) {
                sprbj2 = new sprbgk(sprbj2, this.cfr_renamed_4);
            }
            sprtye sprtye2 = this;
            sprtye2.cfr_renamed_2.cfr_renamed_41();
            sprtye2.cfr_renamed_3.cfr_renamed_5535(true, sprbj2);
            return;
        }
        throw new InvalidKeyException(sproxfa.cfr_renamed_9("v\th\tl\u0010mGs\u0015j\u0011b\u0013fGh\u0002zGs\u0006p\u0014f\u0003#\u0013lG[*P4"));
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprafja.cfr_renamed_9("\u0005\u0012\u0007\u0015\u000e\u00193\u0019\u0014,\u0001\u000e\u0001\u0011\u0005\b\u0005\u000e@\t\u000e\u000f\u0015\f\u0010\u0013\u0012\b\u0005\u0018"));
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprtye sprtye2 = this;
        byte[] byArray = sprref.cfr_renamed_5652(sprtye2.cfr_renamed_2);
        return sprtye2.cfr_renamed_3.cfr_renamed_129(byArray, arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        byte[] byArray = sprref.cfr_renamed_5652(this.cfr_renamed_2);
        try {
            return this.cfr_renamed_3.cfr_renamed_125(byArray);
        }
        catch (Exception exception) {
            if (!(exception instanceof IllegalStateException)) throw new SignatureException(exception.toString(), exception);
            throw new SignatureException(exception.getMessage(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprtye(String string, sprgf sprgf2, sprrmf sprrmf2) {
        void arg1;
        void arg0;
        sprtye sprtye2 = this;
        super((String)arg0);
        sprtye2.cfr_renamed_2 = arg1;
        sprtye2.cfr_renamed_3 = sprrmf2;
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sproxfa.cfr_renamed_9("f\td\u000em\u0002P\u0002w7b\u0015b\nf\u0013f\u0015#\u0012m\u0014v\u0017s\bq\u0013f\u0003"));
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprsaf) {
            sprbj sprbj2 = ((sprsaf)arg0).cfr_renamed_5650();
            sprtye sprtye2 = this;
            sprtye2.cfr_renamed_1 = null;
            sprtye2.cfr_renamed_2.cfr_renamed_41();
            sprtye2.cfr_renamed_3.cfr_renamed_5535(false, sprbj2);
            return;
        }
        throw new InvalidKeyException(sprafja.cfr_renamed_9("\t\u000e\u0017\u000e\u0013\u0017\u0012@\f\u0015\u001e\f\u0015\u0003\\\u000b\u0019\u0019\\\u0010\u001d\u0013\u000f\u0005\u0018@\b\u000f\\813/"));
    }

    @Override
    public PrivateKey cfr_renamed_5643() {
        if (this.cfr_renamed_1 == null) {
            throw new IllegalStateException(sproxfa.cfr_renamed_9("\u0014j\u0000m\u0006w\u0012q\u0002#\ba\rf\u0004wGm\bwGj\t#\u0006#\u0014j\u0000m\u000em\u0000#\u0014w\u0006w\u0002"));
        }
        sprtye sprtye2 = this;
        this.cfr_renamed_1 = null;
        return new sprkcf(sprtye2.cfr_renamed_1, (spremf)sprtye2.cfr_renamed_3.cfr_renamed_5643());
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprafja.cfr_renamed_9("\u0005\u0012\u0007\u0015\u000e\u00193\u0019\u0014,\u0001\u000e\u0001\u0011\u0005\b\u0005\u000e@\t\u000e\u000f\u0015\f\u0010\u0013\u0012\b\u0005\u0018"));
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    public sprtye(String arg0) {
        super(arg0);
    }
}

