/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjbf;
import com.spire.presentation.packages.sprjre;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprpaba;
import com.spire.presentation.packages.sprpof;
import com.spire.presentation.packages.sprqrf;
import com.spire.presentation.packages.sprref;
import com.spire.presentation.packages.sprrxe;
import com.spire.presentation.packages.sprzm;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

public class spruye
extends Signature
implements sprzm {
    private SecureRandom cfr_renamed_1;
    private sprlem cfr_renamed_2;
    private sprgf cfr_renamed_3;
    private sprqrf cfr_renamed_4;

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprjre.cfr_renamed_9(".q,v%z\u0018z?O*m*r.k.mkj%l>o;p9k.{"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        byte[] byArray = sprref.cfr_renamed_5652(this.cfr_renamed_3);
        try {
            return this.cfr_renamed_4.cfr_renamed_125(byArray);
        }
        catch (Exception exception) {
            if (!(exception instanceof IllegalStateException)) throw new SignatureException(exception.toString());
            throw new SignatureException(exception.getMessage(), exception);
        }
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprjbf) {
            sprbj sprbj2 = ((sprjbf)arg0).cfr_renamed_5650();
            this.cfr_renamed_2 = ((sprjbf)arg0).cfr_renamed_5651();
            if (this.cfr_renamed_1 != null) {
                sprbj2 = new sprbgk(sprbj2, this.cfr_renamed_1);
            }
            spruye spruye2 = this;
            spruye2.cfr_renamed_3.cfr_renamed_41();
            spruye2.cfr_renamed_4.cfr_renamed_5535(true, sprbj2);
            return;
        }
        throw new InvalidKeyException(sprpaba.cfr_renamed_9("~I`IdPe\u0007{UbQjSn\u0007`Br\u0007{FxTnC+Sd\u0007SjXtFs"));
    }

    @Override
    public boolean cfr_renamed_2427() {
        return this.cfr_renamed_2 != null && this.cfr_renamed_4.cfr_renamed_5649() != 0L;
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprjre.cfr_renamed_9(".q,v%z\u0018z?O*m*r.k.mkj%l>o;p9k.{"));
    }

    /*
     * WARNING - void declaration
     */
    public spruye(String string, sprgf sprgf2, sprqrf sprqrf2) {
        void arg1;
        void arg0;
        spruye spruye2 = this;
        super((String)arg0);
        spruye2.cfr_renamed_3 = arg1;
        spruye2.cfr_renamed_4 = sprqrf2;
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

    @Override
    public PrivateKey cfr_renamed_5643() {
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(sprpaba.cfr_renamed_9("Tb@eF\u007fRyB+HiMnD\u007f\u0007eH\u007f\u0007bI+F+Tb@eNe@+T\u007fF\u007fB"));
        }
        spruye spruye2 = this;
        this.cfr_renamed_2 = null;
        return new sprjbf(spruye2.cfr_renamed_2, (sprpof)spruye2.cfr_renamed_4.cfr_renamed_5643());
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprjre.cfr_renamed_9(".q,v%z\u0018z?O*m*r.k.mkj%l>o;p9k.{"));
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public spruye(String arg0) {
        super(arg0);
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        spruye spruye2 = this;
        byte[] byArray = sprref.cfr_renamed_5652(spruye2.cfr_renamed_3);
        return spruye2.cfr_renamed_4.cfr_renamed_129(byArray, arg0);
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprrxe) {
            sprbj sprbj2 = ((sprrxe)arg0).cfr_renamed_5650();
            spruye spruye2 = this;
            spruye2.cfr_renamed_2 = null;
            spruye2.cfr_renamed_3.cfr_renamed_41();
            spruye2.cfr_renamed_4.cfr_renamed_5535(false, sprbj2);
            return;
        }
        throw new InvalidKeyException(sprpaba.cfr_renamed_9("ReLeH|I+W~EgNh\u0007`Br\u0007{FxTnC+Sd\u0007SjXtFs"));
    }
}

