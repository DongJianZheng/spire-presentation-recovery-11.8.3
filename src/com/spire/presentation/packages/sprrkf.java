/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbg;
import com.spire.presentation.packages.sprbfaa;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprdwf;
import com.spire.presentation.packages.sprhuf;
import com.spire.presentation.packages.sprkif;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprpjf;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprvhm;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;

public class sprrkf
extends Signature {
    private ByteArrayOutputStream cfr_renamed_1;
    private sprbbg cfr_renamed_2;
    private sprhuf cfr_renamed_3;
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

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 3;
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

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_1.write(arg0);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprpjf) {
            String string;
            sprpjf sprpjf2 = (sprpjf)arg0;
            sprdwf sprdwf2 = sprpjf2.cfr_renamed_5650();
            if (this.cfr_renamed_2 != null && !(string = sprkoe.cfr_renamed_116(this.cfr_renamed_2.cfr_renamed_313())).equals(sprpjf2.getAlgorithm())) {
                throw new InvalidKeyException(new StringBuilder().insert(0, sprpon.cfr_renamed_9("y`mgk}\u007f{o)ifdocn\u007f{om*oe{*")).append(string).toString());
            }
            if (this.cfr_renamed_4 != null) {
                this.cfr_renamed_3.cfr_renamed_5535(true, new sprbgk(sprdwf2, this.cfr_renamed_4));
                return;
            }
            this.cfr_renamed_3.cfr_renamed_5535(true, sprdwf2);
            return;
        }
        throw new InvalidKeyException(sprbfaa.cfr_renamed_9("wWiWmNl\u0019rKkOcMg\u0019i\\{\u0019rXqJg]\"Mm\u0019DXnZmW"));
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_1.write(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprrkf(sprhuf sprhuf2, sprbbg sprbbg2) {
        void arg1;
        sprrkf sprrkf2 = this;
        void v1 = arg1;
        super(sprkoe.cfr_renamed_116(v1.cfr_renamed_313()));
        sprrkf2.cfr_renamed_2 = v1;
        sprrkf sprrkf3 = this;
        sprrkf2.cfr_renamed_1 = new ByteArrayOutputStream();
        sprrkf2.cfr_renamed_3 = sprhuf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        try {
            sprrkf sprrkf2 = this;
            byte[] byArray = sprrkf2.cfr_renamed_1.toByteArray();
            sprrkf2.cfr_renamed_1.reset();
            return sprrkf2.cfr_renamed_3.cfr_renamed_125(byArray);
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprrkf sprrkf2 = this;
        byte[] byArray = sprrkf2.cfr_renamed_1.toByteArray();
        sprrkf2.cfr_renamed_1.reset();
        return sprrkf2.cfr_renamed_3.cfr_renamed_129(byArray, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprrkf(sprhuf sprhuf2) {
        void arg0;
        sprrkf sprrkf2 = this;
        super(sprpon.cfr_renamed_9("OKEIFD"));
        sprrkf sprrkf3 = this;
        sprrkf3.cfr_renamed_1 = new ByteArrayOutputStream();
        sprrkf2.cfr_renamed_3 = arg0;
        sprrkf2.cfr_renamed_2 = null;
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
        if (!(arg0 instanceof sprkif)) {
            try {
                publicKey = arg0 = new sprkif(sprvhm.cfr_renamed_23(arg0.getEncoded()));
            }
            catch (Exception exception) {
                throw new InvalidKeyException(new StringBuilder().insert(0, sprbfaa.cfr_renamed_9("LlRlVuW\"Iw[nPa\u0019i\\{\u0019rXqJg]\"Mm\u0019DXnZmW8\u0019")).append(exception.getMessage()).toString(), exception);
            }
        } else {
            publicKey = arg0;
        }
        sprkif sprkif2 = (sprkif)publicKey;
        if (this.cfr_renamed_2 != null && !(string = sprkoe.cfr_renamed_116(this.cfr_renamed_2.cfr_renamed_313())).equals(sprkif2.getAlgorithm())) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprpon.cfr_renamed_9("y`mgk}\u007f{o)ifdocn\u007f{om*oe{*")).append(string).toString());
        }
        this.cfr_renamed_3.cfr_renamed_5535(false, sprkif2.cfr_renamed_5650());
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprbfaa.cfr_renamed_9("gWePl\\Q\\vicKcTgMgK\"LlJwIrVpMg]"));
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprpon.cfr_renamed_9("ldncgoZo}Zhxhgl~lx)\u007fgy|zye{~ln"));
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprbfaa.cfr_renamed_9("gWePl\\Q\\vicKcTgMgK\"LlJwIrVpMg]"));
    }
}

