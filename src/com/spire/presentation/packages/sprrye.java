/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgcf;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprpze;
import com.spire.presentation.packages.sprsaz;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprzuf;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class sprrye
extends SignatureSpi {
    private sprzuf cfr_renamed_1;
    private sprgf cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private final sprlem cfr_renamed_4;

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprrye sprrye2 = this;
        byte[] byArray = new byte[sprrye2.cfr_renamed_2.cfr_renamed_1218()];
        sprrye2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        return sprrye2.cfr_renamed_1.cfr_renamed_129(byArray, arg0);
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprwff.cfr_renamed_9("wuur|~A~fKsisvwowi2n|hgkbt`ow\u007f"));
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprsaz.cfr_renamed_9("1\u00123\u0015:\u0019\u0007\u0019 ,5\u000e5\u00111\b1\u000et\t:\u000f!\f$\u0013&\b1\u0018"));
    }

    /*
     * WARNING - void declaration
     */
    public sprrye(sprgf sprgf2, sprlem sprlem2, sprzuf sprzuf2) {
        void arg1;
        void arg0;
        sprrye sprrye2 = this;
        this.cfr_renamed_2 = arg0;
        sprrye2.cfr_renamed_4 = arg1;
        sprrye2.cfr_renamed_1 = sprzuf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprrye sprrye2 = this;
        byte[] byArray = new byte[sprrye2.cfr_renamed_2.cfr_renamed_1218()];
        sprrye2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        try {
            return this.cfr_renamed_1.cfr_renamed_125(byArray);
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprpze) {
            sprpze sprpze2 = (sprpze)arg0;
            if (!this.cfr_renamed_4.cfr_renamed_5078(sprpze2.cfr_renamed_3234())) {
                throw new InvalidKeyException(new StringBuilder().insert(0, sprwff.cfr_renamed_9("HBS[UQH?)'-2h{||zfn`~2}}i2o`~w;vru~ao(;")).append(sprpze2.cfr_renamed_3234()).toString());
            }
            sprbj sprbj2 = sprpze2.cfr_renamed_5650();
            sprrye sprrye2 = this;
            sprrye2.cfr_renamed_2.cfr_renamed_41();
            sprrye2.cfr_renamed_1.cfr_renamed_5535(false, sprbj2);
            return;
        }
        throw new InvalidKeyException(sprsaz.cfr_renamed_9("!\u0012?\u0012;\u000b:\\$\t6\u0010=\u001ft\u00171\u0005t\f5\u000f'\u00190\\ \u0013t/\u00044\u001d2\u0017/yNaJ"));
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprwff.cfr_renamed_9("wuur|~A~fKsisvwowi2n|hgkbt`ow\u007f"));
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

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprgcf) {
            sprgcf sprgcf2 = (sprgcf)arg0;
            if (!this.cfr_renamed_4.cfr_renamed_5078(sprgcf2.cfr_renamed_3234())) {
                throw new InvalidKeyException(new StringBuilder().insert(0, sprsaz.cfr_renamed_9("/\u00044\u001d2\u0017/yNaJt\u000f=\u001b:\u001d \t&\u0019t\u001a;\u000et\b&\u00191\\0\u00153\u0019'\bn\\")).append(sprgcf2.cfr_renamed_3234()).toString());
            }
            sprbj sprbj2 = sprgcf2.cfr_renamed_5650();
            sprrye sprrye2 = this;
            sprrye2.cfr_renamed_2.cfr_renamed_41();
            sprrye2.cfr_renamed_1.cfr_renamed_5535(true, sprbj2);
            return;
        }
        throw new InvalidKeyException(sprwff.cfr_renamed_9("n|p|teu2k`rdzf~2pwb2ksha~v;ft2HBS[UQH?)'-"));
    }
}

