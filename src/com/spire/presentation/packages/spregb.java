/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprouba;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

public abstract class spregb
extends CipherSpi {
    public int cfr_renamed_2;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 1;

    public abstract void cfr_renamed_1192(String var1) throws NoSuchPaddingException;

    @Override
    public final void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        this.cfr_renamed_1193(arg0);
    }

    public abstract AlgorithmParameterSpec cfr_renamed_284();

    public abstract void cfr_renamed_1193(String var1) throws NoSuchAlgorithmException;

    public abstract void cfr_renamed_1194(Key var1, AlgorithmParameterSpec var2) throws InvalidKeyException, InvalidAlgorithmParameterException;

    @Override
    public final int engineGetBlockSize() {
        return this.cfr_renamed_1195();
    }

    public final byte[] cfr_renamed_1196(byte[] arg0) {
        return this.cfr_renamed_1197(arg0, 0, arg0.length);
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (arg2 != null && !(arg2 instanceof AlgorithmParameterSpec)) {
            throw new InvalidAlgorithmParameterException();
        }
        if (arg1 == null || !(arg1 instanceof Key)) {
            throw new InvalidKeyException();
        }
        this.cfr_renamed_2 = arg0;
        if (arg0 == 1) {
            SecureRandom secureRandom = arg3;
            this.cfr_renamed_1198(arg1, arg2, secureRandom);
            return;
        }
        if (arg0 == 2) {
            this.cfr_renamed_1194(arg1, arg2);
        }
    }

    @Override
    public final void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (arg2 == null) {
            this.engineInit(arg0, arg1, arg3);
            return;
        }
        AlgorithmParameterSpec algorithmParameterSpec = null;
        this.engineInit(arg0, arg1, algorithmParameterSpec, arg3);
    }

    @Override
    public final byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        return this.cfr_renamed_1199(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void engineInit(int arg0, Key arg1, SecureRandom arg2) throws InvalidKeyException {
        try {
            this.engineInit(arg0, arg1, (AlgorithmParameterSpec)null, arg2);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(invalidAlgorithmParameterException.getMessage());
        }
    }

    @Override
    public final int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        return this.cfr_renamed_1200(arg0, arg1, arg2, arg3, arg4);
    }

    public abstract int cfr_renamed_1201(byte[] var1, int var2, int var3, byte[] var4, int var5) throws ShortBufferException;

    public abstract int cfr_renamed_1200(byte[] var1, int var2, int var3, byte[] var4, int var5) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException;

    @Override
    public final int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        return this.cfr_renamed_1201(arg0, arg1, arg2, arg3, arg4);
    }

    @Override
    public final int engineGetOutputSize(int arg0) {
        return this.cfr_renamed_1202(arg0);
    }

    public final byte[] cfr_renamed_1203(byte[] arg0) throws IllegalBlockSizeException, BadPaddingException {
        return this.cfr_renamed_1199(arg0, 0, arg0.length);
    }

    public abstract int cfr_renamed_1204(Key var1) throws InvalidKeyException;

    public abstract byte[] cfr_renamed_1205();

    public abstract int cfr_renamed_1195();

    public abstract byte[] cfr_renamed_1199(byte[] var1, int var2, int var3) throws IllegalBlockSizeException, BadPaddingException;

    @Override
    public final void engineSetPadding(String arg0) throws NoSuchPaddingException {
        this.cfr_renamed_1192(arg0);
    }

    public abstract String cfr_renamed_313();

    @Override
    public final byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        return this.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public final byte[] cfr_renamed_1206() throws IllegalBlockSizeException, BadPaddingException {
        return this.cfr_renamed_1199(null, 0, 0);
    }

    @Override
    public final byte[] engineGetIV() {
        return this.cfr_renamed_1205();
    }

    public abstract int cfr_renamed_1202(int var1);

    @Override
    public final int engineGetKeySize(Key arg0) throws InvalidKeyException {
        if (!(arg0 instanceof Key)) {
            throw new InvalidKeyException(sprouba.cfr_renamed_9("Ieo~l{syhnx+wne%"));
        }
        return this.cfr_renamed_1204(arg0);
    }

    public abstract byte[] cfr_renamed_1197(byte[] var1, int var2, int var3);

    @Override
    public final AlgorithmParameters engineGetParameters() {
        return null;
    }

    public abstract void cfr_renamed_1198(Key var1, AlgorithmParameterSpec var2, SecureRandom var3) throws InvalidKeyException, InvalidAlgorithmParameterException;
}

