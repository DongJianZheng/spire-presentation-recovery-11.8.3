/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprjfd;
import com.spire.presentation.packages.sprrkj;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spryy;
import com.spire.presentation.packages.sprzyaa;
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

public abstract class sprcqj
extends CipherSpi {
    private int cfr_renamed_91;
    private Class[] cfr_renamed_0;
    public spryy cfr_renamed_1;
    public AlgorithmParameters cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final sprrr cfr_renamed_4;

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    @Override
    public byte[] engineGetIV() {
        return null;
    }

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return arg0.getEncoded().length;
    }

    public sprcqj() {
        Class[] classArray = new Class[4];
        classArray[0] = IvParameterSpec.class;
        classArray[1] = PBEParameterSpec.class;
        classArray[2] = RC2ParameterSpec.class;
        classArray[3] = RC5ParameterSpec.class;
        this.cfr_renamed_0 = classArray;
        sprcqj sprcqj2 = this;
        sprcqj sprcqj3 = this;
        sprcqj3.cfr_renamed_4 = new sprdki();
        sprcqj2.cfr_renamed_2 = null;
        sprcqj2.cfr_renamed_1 = null;
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
            throw new InvalidKeyException(sprzyaa.cfr_renamed_9("k\u001bF\u0014G\u000e\b\rZ\u001bXZC\u001fQV\b\u0014]\u0016DZM\u0014K\u0015L\u0013F\u001d\u0006"));
        }
        try {
            if (this.cfr_renamed_1 != null) return this.cfr_renamed_1.cfr_renamed_1575(byArray, 0, byArray.length);
            return this.engineDoFinal(byArray, 0, byArray.length);
        }
        catch (BadPaddingException badPaddingException) {
            throw new IllegalBlockSizeException(badPaddingException.getMessage());
        }
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprjfd.cfr_renamed_9("\u001aH.M#G-\t")).append(arg0).append(sprzyaa.cfr_renamed_9("\b\u000fF\u0011F\u0015_\u0014\u0006")).toString());
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprjfd.cfr_renamed_9("J+Gm]jZ?Y:F8]jD%M/\t")).append(arg0).toString());
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
            byArray = this.cfr_renamed_1 == null ? this.engineDoFinal(arg0, 0, arg0.length) : this.cfr_renamed_1.cfr_renamed_1579(arg0, 0, arg0.length);
        }
        catch (sprull sprull2) {
            throw new InvalidKeyException(sprull2.getMessage());
        }
        catch (BadPaddingException badPaddingException) {
            throw new sprrkj(this, sprzyaa.cfr_renamed_9("\u000fF\u001bJ\u0016MZ\\\u0015\b\u000fF\rZ\u001bX"), badPaddingException);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new InvalidKeyException(illegalBlockSizeException.getMessage());
        }
        if (arg2 == 3) {
            return new SecretKeySpec(byArray, arg1);
        }
        if (arg1.equals("") && arg2 == 2) {
            try {
                sprcom sprcom2 = sprcom.cfr_renamed_23(byArray);
                PrivateKey privateKey = sprsci.cfr_renamed_5729(sprcom2);
                if (privateKey == null) throw new InvalidKeyException(new StringBuilder().insert(0, sprjfd.cfr_renamed_9("+E-F8@>A'\t")).append(sprcom2.cfr_renamed_1254().cfr_renamed_593()).append(sprzyaa.cfr_renamed_9("ZF\u0015\\Z[\u000fX\nG\b\\\u001fL")).toString());
                return privateKey;
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprjfd.cfr_renamed_9("`$_+E#MjB/PjL$J%M#G-\u0007"));
            }
        }
        try {
            KeyFactory keyFactory = this.cfr_renamed_4.cfr_renamed_1511(arg1);
            if (arg2 == 1) {
                return keyFactory.generatePublic(new X509EncodedKeySpec(byArray));
            }
            if (arg2 != 2) throw new InvalidKeyException(new StringBuilder().insert(0, sprjfd.cfr_renamed_9("|$B$F=GjB/Pj]3Y/\t")).append(arg2).toString());
            return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(byArray));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprzyaa.cfr_renamed_9("}\u0014C\u0014G\rFZC\u001fQZ\\\u0003X\u001f\b")).append(noSuchAlgorithmException.getMessage()).toString());
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprjfd.cfr_renamed_9("|$B$F=GjB/Pj]3Y/\t")).append(invalidKeySpecException.getMessage()).toString());
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprzyaa.cfr_renamed_9("}\u0014C\u0014G\rFZC\u001fQZ\\\u0003X\u001f\b")).append(noSuchProviderException.getMessage()).toString());
        }
    }

    public final AlgorithmParameters cfr_renamed_9250(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.cfr_renamed_4.cfr_renamed_1540(arg0);
    }
}

