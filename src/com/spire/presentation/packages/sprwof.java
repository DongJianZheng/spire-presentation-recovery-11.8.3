/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjtba;
import com.spire.presentation.packages.sprksz;
import com.spire.presentation.packages.sprlmf;
import com.spire.presentation.packages.sprmlf;
import com.spire.presentation.packages.sprtvf;
import com.spire.presentation.packages.sprvbg;
import com.spire.presentation.packages.sprybg;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

public class sprwof
extends Signature {
    private sprvbg cfr_renamed_2;
    private sprgf cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprwof sprwof2 = this;
        byte[] byArray = new byte[sprwof2.cfr_renamed_3.cfr_renamed_1218()];
        sprwof2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        return sprwof2.cfr_renamed_2.cfr_renamed_129(byArray, arg0);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprlmf) {
            sprybg sprybg2 = ((sprlmf)arg0).cfr_renamed_5650();
            sprwof sprwof2 = this;
            sprwof2.cfr_renamed_3.cfr_renamed_41();
            sprwof2.cfr_renamed_2.cfr_renamed_5535(true, sprybg2);
            return;
        }
        throw new InvalidKeyException(sprksz.cfr_renamed_9("NpPpTiU>KlRhZj^>P{B>K\u007fHm^z\u001bjT>kwXpR}"));
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprjtba.cfr_renamed_9("\u001db\u001fe\u0016i+i\f\\\u0019~\u0019a\u001dx\u001d~Xy\u0016\u007f\r|\bc\nx\u001dh"));
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprksz.cfr_renamed_9("^p\\wU{h{ONZlZs^j^l\u001bkUmNnKqIj^z"));
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprmlf) {
            sprtvf sprtvf2 = ((sprmlf)arg0).cfr_renamed_5650();
            sprwof sprwof2 = this;
            sprwof2.cfr_renamed_3.cfr_renamed_41();
            sprwof2.cfr_renamed_2.cfr_renamed_5535(false, sprtvf2);
            return;
        }
        throw new InvalidKeyException(sprjtba.cfr_renamed_9("y\u0016g\u0016c\u000fbX|\rn\u0014e\u001b,\u0013i\u0001,\bm\u000b\u007f\u001dhXx\u0017,(e\u001bb\u0011o"));
    }

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
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

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
        sprwof sprwof2 = this;
        byte[] byArray = new byte[sprwof2.cfr_renamed_3.cfr_renamed_1218()];
        sprwof2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        try {
            return this.cfr_renamed_2.cfr_renamed_125(byArray);
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprwof(sprgf sprgf2, sprvbg sprvbg2) {
        void arg0;
        sprwof sprwof2 = this;
        super(sprksz.cfr_renamed_9("kwXpR}"));
        sprwof2.cfr_renamed_3 = arg0;
        sprwof2.cfr_renamed_2 = sprvbg2;
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprjtba.cfr_renamed_9("\u001db\u001fe\u0016i+i\f\\\u0019~\u0019a\u001dx\u001d~Xy\u0016\u007f\r|\bc\nx\u001dh"));
    }
}

