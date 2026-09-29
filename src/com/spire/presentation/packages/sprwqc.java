/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spremc;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprhsd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprwzc;
import com.spire.presentation.packages.sprzofa;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class sprwqc
extends SignatureSpi {
    private sprwzc cfr_renamed_4;

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprmtc sprmtc2 = spremc.cfr_renamed_2477((RSAPrivateKey)arg0);
        this.cfr_renamed_4.cfr_renamed_1217(true, sprmtc2);
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprhsd.cfr_renamed_9("98;?23\u000f3(\u0006=$=;9\"9$|#2%)&,9.\"92"));
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprzofa.cfr_renamed_9("\u0017\u007f\u0015x\u001ct!t\u0006A\u0013c\u0013|\u0017e\u0017cRd\u001cb\u0007a\u0002~\u0000e\u0017u"));
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
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprmtc sprmtc2 = spremc.cfr_renamed_2476((RSAPublicKey)arg0);
        this.cfr_renamed_4.cfr_renamed_1217(false, sprmtc2);
    }

    /*
     * WARNING - void declaration
     */
    public sprwqc(sprlc sprlc2, sprh sprh2) {
        void arg0;
        void arg1;
        sprwqc sprwqc2 = this;
        sprwqc2.cfr_renamed_4 = new sprwzc((sprh)arg1, (sprlc)arg0, true);
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprhsd.cfr_renamed_9("98;?23\u000f3(\u0006=$=;9\"9$|#2%)&,9.\"92"));
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        return this.cfr_renamed_4.cfr_renamed_1328(arg0);
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 3 ^ 5;
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
}

