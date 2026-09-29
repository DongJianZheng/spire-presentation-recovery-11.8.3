/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmsf;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprtcea;
import com.spire.presentation.packages.spryn;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class sprcqc
extends CipherSpi {
    private Class[] cfr_renamed_0;
    public AlgorithmParameters cfr_renamed_1;
    public spryn cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return arg0.getEncoded().length;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException {
        byte[] byArray;
        try {
            byArray = this.cfr_renamed_2 == null ? this.engineDoFinal(arg0, 0, arg0.length) : this.cfr_renamed_2.cfr_renamed_1579(arg0, 0, arg0.length);
        }
        catch (sprpjd sprpjd2) {
            throw new InvalidKeyException(sprpjd2.getMessage());
        }
        catch (BadPaddingException badPaddingException) {
            throw new InvalidKeyException(badPaddingException.getMessage());
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new InvalidKeyException(illegalBlockSizeException.getMessage());
        }
        if (arg2 == 3) {
            return new SecretKeySpec(byArray, arg1);
        }
        if (arg1.equals("") && arg2 == 2) {
            try {
                sprmke sprmke2 = sprmke.cfr_renamed_23(byArray);
                PrivateKey privateKey = sprbrb.cfr_renamed_1253(sprmke2);
                if (privateKey == null) throw new InvalidKeyException(new StringBuilder().insert(0, sprtcea.cfr_renamed_9("u;s8f>`?yw")).append(sprmke2.cfr_renamed_1254().cfr_renamed_593()).append(sprmsf.cfr_renamed_9("C6\f,C+\u0016(\u00137\u0011,\u0006<")).toString());
                return privateKey;
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprtcea.cfr_renamed_9("\u001ez!u;}34<q.42z4{3}9sy"));
            }
        }
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(arg1, "BC");
            if (arg2 == 1) {
                return keyFactory.generatePublic(new X509EncodedKeySpec(byArray));
            }
            if (arg2 != 2) throw new InvalidKeyException(new StringBuilder().insert(0, sprtcea.cfr_renamed_9("\u0002z<z8c94<q.4#m'qw")).append(arg2).toString());
            return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(byArray));
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprmsf.cfr_renamed_9("\r\r3\r7\u00146C3\u0006!C,\u001a(\u0006x")).append(noSuchProviderException.getMessage()).toString());
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprtcea.cfr_renamed_9("\u0002z<z8c94<q.4#m'qw")).append(noSuchAlgorithmException.getMessage()).toString());
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprmsf.cfr_renamed_9("\r\r3\r7\u00146C3\u0006!C,\u001a(\u0006x")).append(invalidKeySpecException.getMessage()).toString());
        }
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineWrap(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] byArray = arg0.getEncoded();
        if (byArray == null) {
            throw new InvalidKeyException(sprmsf.cfr_renamed_9("\u001b\u00026\r7\u0017x\u0014*\u0002(C3\u0006!Ox\r-\u000f4C=\r;\f<\n6\u0004v"));
        }
        try {
            if (this.cfr_renamed_2 != null) return this.cfr_renamed_2.cfr_renamed_1575(byArray, 0, byArray.length);
            return this.engineDoFinal(byArray, 0, byArray.length);
        }
        catch (BadPaddingException badPaddingException) {
            throw new IllegalBlockSizeException(badPaddingException.getMessage());
        }
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprtcea.cfr_renamed_9("4u93#4$a'd8f#4:{3qw")).append(arg0).toString());
    }

    @Override
    public byte[] engineGetIV() {
        return null;
    }

    public sprcqc() {
        Class[] classArray = new Class[4];
        classArray[0] = IvParameterSpec.class;
        classArray[1] = PBEParameterSpec.class;
        classArray[2] = RC2ParameterSpec.class;
        classArray[3] = RC5ParameterSpec.class;
        this.cfr_renamed_0 = classArray;
        sprcqc sprcqc2 = this;
        sprcqc2.cfr_renamed_1 = null;
        sprcqc2.cfr_renamed_2 = null;
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprmsf.cfr_renamed_9("39\u0007<\n6\u0004x")).append(arg0).append(sprtcea.cfr_renamed_9("wa9\u007f9{ zy")).toString());
    }
}

