/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprarg;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgij;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprnro;
import com.spire.presentation.packages.sprslk;
import com.spire.presentation.packages.sprwn;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class sprsrj
extends SignatureSpi {
    private sprslk cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        try {
            return this.cfr_renamed_4.cfr_renamed_1329();
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprkik sprkik2 = sprgij.cfr_renamed_2477((RSAPrivateKey)arg0);
        this.cfr_renamed_4.cfr_renamed_5535(true, sprkik2);
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprkik sprkik2 = sprgij.cfr_renamed_2476((RSAPublicKey)arg0);
        this.cfr_renamed_4.cfr_renamed_5535(false, sprkik2);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprnro.cfr_renamed_9("M\u0005O\u0002F\u000e{\u000e\\;I\u0019I\u0006M\u001fM\u0019\b\u001eF\u0018]\u001bX\u0004Z\u001fM\u000f"));
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        return this.cfr_renamed_4.cfr_renamed_1328(arg0);
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprarg.cfr_renamed_9("NHLOECxC_vJTJKNRNT\u000bSEU^V[IYRNB"));
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprnro.cfr_renamed_9("M\u0005O\u0002F\u000e{\u000e\\;I\u0019I\u0006M\u001fM\u0019\b\u001eF\u0018]\u001bX\u0004Z\u001fM\u000f"));
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprsrj(sprgf sprgf2, sprwn sprwn2) {
        void arg0;
        void arg1;
        sprsrj sprsrj2 = this;
        sprsrj2.cfr_renamed_4 = new sprslk((sprwn)arg1, (sprgf)arg0, true);
    }
}

