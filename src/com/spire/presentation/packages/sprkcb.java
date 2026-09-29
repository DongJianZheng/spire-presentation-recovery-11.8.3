/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spregb;
import com.spire.presentation.packages.sproyia;
import com.spire.presentation.packages.sprsly;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

public abstract class sprkcb
extends spregb {
    public int cfr_renamed_0;
    public int cfr_renamed_1;
    public ByteArrayOutputStream cfr_renamed_3;
    public AlgorithmParameterSpec cfr_renamed_4;

    @Override
    public final AlgorithmParameterSpec cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    public abstract void cfr_renamed_1210(Key var1, AlgorithmParameterSpec var2, SecureRandom var3) throws InvalidKeyException, InvalidAlgorithmParameterException;

    /*
     * WARNING - void declaration
     */
    @Override
    public final void cfr_renamed_1198(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        void arg2;
        void arg1;
        this.cfr_renamed_2 = 1;
        this.cfr_renamed_1210(key, (AlgorithmParameterSpec)arg1, (SecureRandom)arg2);
    }

    public abstract byte[] cfr_renamed_1214(byte[] var1) throws IllegalBlockSizeException, BadPaddingException;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_1064(Key arg0, SecureRandom arg1) throws InvalidKeyException {
        try {
            this.cfr_renamed_1198(arg0, null, arg1);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(sprsly.cfr_renamed_9("&\u001f\u001b\u0004R\u0014\u001b\u0007\u001a\u0012\u0000W\u001c\u0012\u0017\u0013\u0001W\u0013\u001b\u0015\u0018\u0000\u001e\u0006\u001f\u001fW\u0002\u0016\u0000\u0016\u001f\u0012\u0006\u0012\u0000\u0004R\u0011\u001d\u0005R\u001e\u001c\u001e\u0006\u001e\u0013\u001b\u001b\r\u0013\u0003\u001b\u0018\u001cWZ\u0014\u0013\u0019\u001c\u0018\u0006W\u0010\u0012R\u0019\u0007\u001b\u001e^\\"));
        }
    }

    @Override
    public final int cfr_renamed_1200(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        if (arg3.length < this.cfr_renamed_1202(arg2)) {
            throw new ShortBufferException(sproyia.cfr_renamed_9("bqYtXp\rfXbKa_$YkB$^lBvY*"));
        }
        byte[] byArray = this.cfr_renamed_1199(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
    }

    public void cfr_renamed_1215(int arg0) throws IllegalBlockSizeException {
        int n = arg0 + this.cfr_renamed_3.size();
        if (this.cfr_renamed_2 == 1) {
            if (n > this.cfr_renamed_0) {
                throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprsly.cfr_renamed_9("&\u001f\u0017W\u001e\u0012\u001c\u0010\u0006\u001fR\u0018\u0014W\u0006\u001f\u0017W\u0002\u001b\u0013\u001e\u001c\u0003\u0017\u000f\u0006WZ")).append(n).append(sproyia.cfr_renamed_9("\rfTpHw\u0004$Dw\rjBp\rwXt]k_pH`\rfT$")).append(sprsly.cfr_renamed_9("\u0006\u001f\u0017W\u0011\u001e\u0002\u001f\u0017\u0005R_\u001f\u0016\nYR")).append(this.cfr_renamed_0).append(sproyia.cfr_renamed_9("\rfTpHw\u0004*")).toString());
            }
        } else if (this.cfr_renamed_2 == 2 && n != this.cfr_renamed_1) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprsly.cfr_renamed_9(">\u001e\u001b\u0017\u0010\u0013\u001bR\u0014\u001b\u0007\u001a\u0012\u0000\u0003\u0017\u000f\u0006W\u001e\u0012\u001c\u0010\u0006\u001fR_\u0017\u000f\u0002\u0012\u0011\u0003\u0017\u0013R")).append(this.cfr_renamed_1).append(sproyia.cfr_renamed_9("\rfTpHw\u0001$Ze^$")).append(n).append(sprsly.cfr_renamed_9("W\u0010\u000e\u0006\u0012\u0001^\\")).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void cfr_renamed_1194(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        void arg1;
        this.cfr_renamed_2 = 2;
        this.cfr_renamed_1208(key, (AlgorithmParameterSpec)arg1);
    }

    public abstract void cfr_renamed_1208(Key var1, AlgorithmParameterSpec var2) throws InvalidKeyException, InvalidAlgorithmParameterException;

    @Override
    public final int cfr_renamed_1202(int arg0) {
        int n;
        int n2 = arg0 + this.cfr_renamed_3.size();
        if (n2 > (n = this.cfr_renamed_1195())) {
            return 0;
        }
        return n;
    }

    @Override
    public final byte[] cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.cfr_renamed_3.write(arg0, arg1, arg2);
        }
        return new byte[0];
    }

    @Override
    public final int cfr_renamed_1195() {
        if (this.cfr_renamed_2 == 1) {
            return this.cfr_renamed_0;
        }
        return this.cfr_renamed_1;
    }

    public sprkcb() {
        sprkcb sprkcb2 = this;
        sprkcb2.cfr_renamed_3 = new ByteArrayOutputStream();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_1213(Key arg0) throws InvalidKeyException {
        try {
            this.cfr_renamed_1194(arg0, null);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(sproyia.cfr_renamed_9("PEm^$Nm]lHv\rjHaIw\reAcBvDpEi\rtLvLiHpHv^$Kk_$DjDpDeAmWeYmBj\r,NeCjBp\rfH$CqAh\u0004*"));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final int cfr_renamed_1201(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_1197((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }

    public abstract byte[] cfr_renamed_136(byte[] var1) throws IllegalBlockSizeException, BadPaddingException;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final byte[] cfr_renamed_1199(byte[] byArray, int n, int n2) throws IllegalBlockSizeException, BadPaddingException {
        sprkcb sprkcb2 = this;
        sprkcb2.cfr_renamed_1215(n2);
        sprkcb sprkcb3 = this;
        sprkcb2.cfr_renamed_1197(byArray, n, n2);
        byte[] byArray2 = sprkcb3.cfr_renamed_3.toByteArray();
        sprkcb3.cfr_renamed_3.reset();
        switch (sprkcb3.cfr_renamed_2) {
            case 1: {
                return this.cfr_renamed_136(byArray2);
            }
            case 2: {
                return this.cfr_renamed_1214(byArray2);
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_1211(Key arg0) throws InvalidKeyException {
        try {
            this.cfr_renamed_1198(arg0, null, new SecureRandom());
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(sprsly.cfr_renamed_9("&\u001f\u001b\u0004R\u0014\u001b\u0007\u001a\u0012\u0000W\u001c\u0012\u0017\u0013\u0001W\u0013\u001b\u0015\u0018\u0000\u001e\u0006\u001f\u001fW\u0002\u0016\u0000\u0016\u001f\u0012\u0006\u0012\u0000\u0004R\u0011\u001d\u0005R\u001e\u001c\u001e\u0006\u001e\u0013\u001b\u001b\r\u0013\u0003\u001b\u0018\u001cWZ\u0014\u0013\u0019\u001c\u0018\u0006W\u0010\u0012R\u0019\u0007\u001b\u001e^\\"));
        }
    }

    @Override
    public final byte[] cfr_renamed_1205() {
        return null;
    }

    @Override
    public final void cfr_renamed_1193(String arg0) {
    }

    @Override
    public final void cfr_renamed_1192(String arg0) {
    }

    public final void cfr_renamed_1212(Key arg0, AlgorithmParameterSpec arg1) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.cfr_renamed_1198(arg0, arg1, new SecureRandom());
    }
}

