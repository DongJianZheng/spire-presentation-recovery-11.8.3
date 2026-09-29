/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spremc;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprnje;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprwgo;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class sprjqc
extends SignatureSpi {
    private sprije cfr_renamed_2;
    private sprlc cfr_renamed_3;
    private sprh cfr_renamed_4;

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprwgo.cfr_renamed_9("xlzksgNgiR|p|oxvxp=wsqhrmmovxf"));
    }

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprjqc sprjqc2 = this;
        byte[] byArray = new byte[sprjqc2.cfr_renamed_3.cfr_renamed_1218()];
        sprjqc2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        try {
            sprjqc sprjqc3 = this;
            byte[] byArray2 = sprjqc3.cfr_renamed_2481(byArray);
            return sprjqc3.cfr_renamed_4.cfr_renamed_1337(byArray2, 0, byArray2.length);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new SignatureException(sprkwe.cfr_renamed_9("w%e`h/s`o-},p`z/n`o){.}4i2y`h9l%"));
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprwgo.cfr_renamed_9("xlzksgNgiR|p|oxvxp=wsqhrmmovxf"));
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        if (!(arg0 instanceof RSAPublicKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprkwe.cfr_renamed_9("O5l0p)y$<+y9<h")).append(this.cfr_renamed_2482(arg0)).append(sprwgo.cfr_renamed_9("4\"tq=lrv=c=PNCMw\u007fntaVgd\"tlnv|l~g")).toString());
        }
        sprmtc sprmtc2 = spremc.cfr_renamed_2476((RSAPublicKey)arg0);
        sprjqc sprjqc2 = this;
        sprjqc2.cfr_renamed_3.cfr_renamed_41();
        sprjqc2.cfr_renamed_4.cfr_renamed_1217(false, sprmtc2);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        return null;
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (!(arg0 instanceof RSAPrivateKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprkwe.cfr_renamed_9("O5l0p)y$<+y9<h")).append(this.cfr_renamed_2482(arg0)).append(sprwgo.cfr_renamed_9("+=kn\"smi\"|\"OQ\\RokkcigVgd\"tlnv|l~g")).toString());
        }
        sprmtc sprmtc2 = spremc.cfr_renamed_2477((RSAPrivateKey)arg0);
        sprjqc sprjqc2 = this;
        sprjqc2.cfr_renamed_3.cfr_renamed_41();
        sprjqc2.cfr_renamed_4.cfr_renamed_1217(true, sprmtc2);
    }

    private /* synthetic */ String cfr_renamed_2482(Object arg0) {
        if (arg0 == null) {
            return null;
        }
        return arg0.getClass().getName();
    }

    private /* synthetic */ byte[] cfr_renamed_2481(byte[] arg0) throws IOException {
        if (this.cfr_renamed_2 == null) {
            return arg0;
        }
        return new sprnje(this.cfr_renamed_2, arg0).cfr_renamed_104("DER");
    }

    /*
     * WARNING - void declaration
     */
    public sprjqc(sprlc sprlc2, sprh sprh2) {
        void arg1;
        void arg0;
        sprjqc sprjqc2 = this;
        this.cfr_renamed_3 = arg0;
        sprjqc2.cfr_renamed_4 = arg1;
        sprjqc2.cfr_renamed_2 = null;
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
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        int n;
        int n2;
        int n3;
        int n4;
        byte[] byArray;
        byte[] byArray2;
        sprjqc sprjqc2 = this;
        byte[] byArray3 = new byte[sprjqc2.cfr_renamed_3.cfr_renamed_1218()];
        sprjqc2.cfr_renamed_3.cfr_renamed_1219(byArray3, 0);
        try {
            byArray2 = this.cfr_renamed_4.cfr_renamed_1337(arg0, 0, arg0.length);
            byArray = this.cfr_renamed_2481(byArray3);
        }
        catch (Exception exception) {
            return false;
        }
        if (byArray2.length != byArray.length) {
            if (byArray2.length != byArray.length - 2) {
                return false;
            }
            n4 = byArray2.length - byArray3.length - 2;
            n3 = byArray.length - byArray3.length - 2;
            byte[] byArray4 = byArray;
            byte[] byArray5 = byArray;
            byArray4[1] = (byte)(byArray4[1] - 2);
            byArray5[3] = (byte)(byArray5[3] - 2);
            n = n2 = 0;
        } else {
            int n5;
            int n6 = n5 = 0;
            while (n6 < byArray2.length) {
                if (byArray2[n5] != byArray[n5]) {
                    return false;
                }
                n6 = ++n5;
            }
            return true;
        }
        while (n < byArray3.length) {
            if (byArray2[n4 + n2] != byArray[n3 + n2]) {
                return false;
            }
            n = ++n2;
        }
        int n7 = n2 = 0;
        while (n7 < n4) {
            if (byArray2[n2] != byArray[n2]) {
                return false;
            }
            n7 = ++n2;
        }
        return true;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 4 << 3 ^ (2 ^ 5);
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
    public sprjqc(sprtzd sprtzd2, sprlc sprlc2, sprh sprh2) {
        void arg0;
        void arg1;
        sprjqc sprjqc2 = this;
        sprjqc2.cfr_renamed_3 = arg1;
        sprjqc2.cfr_renamed_4 = sprh2;
        sprjqc sprjqc3 = this;
        sprjqc2.cfr_renamed_2 = new sprije((sprtzd)arg0, sprume.cfr_renamed_3);
    }
}

