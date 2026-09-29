/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprceaa;
import com.spire.presentation.packages.sprcpf;
import com.spire.presentation.packages.sprdzf;
import com.spire.presentation.packages.sprgoha;
import com.spire.presentation.packages.sprivf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprozf;
import com.spire.presentation.packages.sprpmf;
import com.spire.presentation.packages.sprvhm;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

public class sprbhf
extends Signature {
    private ByteArrayOutputStream cfr_renamed_1;
    private sprdzf cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprivf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbhf(sprdzf sprdzf2, sprivf sprivf2) {
        void arg1;
        sprbhf sprbhf2 = this;
        void v1 = arg1;
        super(sprkoe.cfr_renamed_116(v1.cfr_renamed_313()));
        sprbhf2.cfr_renamed_4 = v1;
        sprbhf sprbhf3 = this;
        sprbhf2.cfr_renamed_1 = new ByteArrayOutputStream();
        sprbhf2.cfr_renamed_2 = sprdzf2;
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
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprbhf sprbhf2 = this;
        byte[] byArray = sprbhf2.cfr_renamed_1.toByteArray();
        sprbhf2.cfr_renamed_1.reset();
        return sprbhf2.cfr_renamed_2.cfr_renamed_129(byArray, arg0);
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_1.write(arg0, arg1, arg2);
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprgoha.cfr_renamed_9("\u0004@\u0006G\u000fK2K\u0015~\u0000\\\u0000C\u0004Z\u0004\\A[\u000f]\u0014^\u0011A\u0013Z\u0004J"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        try {
            sprbhf sprbhf2 = this;
            byte[] byArray = sprbhf2.cfr_renamed_1.toByteArray();
            sprbhf2.cfr_renamed_1.reset();
            return sprbhf2.cfr_renamed_2.cfr_renamed_125(byArray);
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprcpf) {
            String string;
            sprcpf sprcpf2 = (sprcpf)arg0;
            sprozf sprozf2 = sprcpf2.cfr_renamed_5650();
            if (this.cfr_renamed_4 != null && !(string = sprkoe.cfr_renamed_116(this.cfr_renamed_4.cfr_renamed_313())).equals(sprcpf2.getAlgorithm())) {
                throw new InvalidKeyException(new StringBuilder().insert(0, sprceaa.cfr_renamed_9("\u001aG\u000e@\bZ\u001c\\\f\u000e\nA\u0007H\u0000I\u001c\\\fJIH\u0006\\I")).append(string).toString());
            }
            if (this.cfr_renamed_3 != null) {
                this.cfr_renamed_2.cfr_renamed_5535(true, new sprbgk(sprozf2, this.cfr_renamed_3));
                return;
            }
            this.cfr_renamed_2.cfr_renamed_5535(true, sprozf2);
            return;
        }
        throw new InvalidKeyException(sprgoha.cfr_renamed_9("[\u000fE\u000fA\u0016@A^\u0013G\u0017O\u0015KAE\u0004WA^\u0000]\u0012K\u0005\u000e\u0015AA|\u0000G\u000fL\u000eY"));
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_1.write(arg0);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprceaa.cfr_renamed_9("K\u0007I\u0000@\f}\fZ9O\u001bO\u0004K\u001dK\u001b\u000e\u001c@\u001a[\u0019^\u0006\\\u001dK\r"));
    }

    /*
     * WARNING - void declaration
     */
    public sprbhf(sprdzf sprdzf2) {
        void arg0;
        sprbhf sprbhf2 = this;
        super(sprgoha.cfr_renamed_9("| g/l.y"));
        sprbhf sprbhf3 = this;
        sprbhf3.cfr_renamed_1 = new ByteArrayOutputStream();
        sprbhf2.cfr_renamed_2 = arg0;
        sprbhf2.cfr_renamed_4 = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        String string;
        PublicKey publicKey;
        if (!(arg0 instanceof sprpmf)) {
            try {
                publicKey = arg0 = new sprpmf(sprvhm.cfr_renamed_23(arg0.getEncoded()));
            }
            catch (Exception exception) {
                throw new InvalidKeyException(new StringBuilder().insert(0, sprceaa.cfr_renamed_9("[\u0007E\u0007A\u001e@I^\u001cL\u0005G\n\u000e\u0002K\u0010\u000e\u0019O\u001a]\fJIZ\u0006\u000e;O\u0000@\u000bA\u001e\u0014I")).append(exception.getMessage()).toString(), exception);
            }
        } else {
            publicKey = arg0;
        }
        sprpmf sprpmf2 = (sprpmf)publicKey;
        if (this.cfr_renamed_4 != null && !(string = sprkoe.cfr_renamed_116(this.cfr_renamed_4.cfr_renamed_313())).equals(sprpmf2.getAlgorithm())) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprgoha.cfr_renamed_9("]\bI\u000fO\u0015[\u0013KAM\u000e@\u0007G\u0006[\u0013K\u0005\u000e\u0007A\u0013\u000e")).append(string).toString());
        }
        this.cfr_renamed_2.cfr_renamed_5535(false, sprpmf2.cfr_renamed_5650());
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprceaa.cfr_renamed_9("K\u0007I\u0000@\f}\fZ9O\u001bO\u0004K\u001dK\u001b\u000e\u001c@\u001a[\u0019^\u0006\\\u001dK\r"));
    }
}

