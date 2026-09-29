/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgij;
import com.spire.presentation.packages.sprhnk;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprmaca;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprxko;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class sprvnj
extends SignatureSpi {
    private sprhnk cfr_renamed_4;

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        return this.cfr_renamed_4.cfr_renamed_1328(arg0);
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprkik sprkik2 = sprgij.cfr_renamed_2476((RSAPublicKey)arg0);
        this.cfr_renamed_4.cfr_renamed_5535(false, sprkik2);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprxko.cfr_renamed_9("X'Z S,n,I\u0019\\;\\$X=X;\u001d<S:H9M&O=X-"));
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprmaca.cfr_renamed_9("YH[ORCoCHv]T]KYRYT\u001cSRUIVLINRYB"));
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprkik sprkik2 = sprgij.cfr_renamed_2477((RSAPrivateKey)arg0);
        this.cfr_renamed_4.cfr_renamed_5535(true, sprkik2);
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprxko.cfr_renamed_9("X'Z S,n,I\u0019\\;\\$X=X;\u001d<S:H9M&O=X-"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3;
        int cfr_ignored_0 = 5 << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 5 << 3 ^ 4;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprvnj(sprgf sprgf2, sprwn sprwn2) {
        void arg0;
        void arg1;
        sprvnj sprvnj2 = this;
        sprvnj2.cfr_renamed_4 = new sprhnk((sprwn)arg1, (sprgf)arg0);
    }

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
}

