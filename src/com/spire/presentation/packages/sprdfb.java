/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spregb;
import com.spire.presentation.packages.sprndda;
import com.spire.presentation.packages.sprxwg;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.ShortBufferException;

public abstract class sprdfb
extends spregb {
    public AlgorithmParameterSpec cfr_renamed_4;

    @Override
    public final void cfr_renamed_1192(String arg0) {
    }

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
            throw new InvalidParameterException(sprxwg.cfr_renamed_9("Lvqm8}qnp{j>v{}zk>yr\u007fqjwlvu>h\u007fj\u007fu{l{jm8xwl8wvwlwyrqdyjqqv>0}ypvql>z{8pmrt76"));
        }
    }

    public abstract int cfr_renamed_1207(int var1);

    /*
     * WARNING - void declaration
     */
    @Override
    public final void cfr_renamed_1194(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        void arg1;
        this.cfr_renamed_2 = 2;
        this.cfr_renamed_1208(key, (AlgorithmParameterSpec)arg1);
    }

    public abstract int cfr_renamed_1209(int var1);

    @Override
    public final byte[] cfr_renamed_1205() {
        return null;
    }

    @Override
    public abstract byte[] cfr_renamed_1199(byte[] var1, int var2, int var3) throws BadPaddingException;

    @Override
    public final void cfr_renamed_1193(String arg0) {
    }

    public abstract void cfr_renamed_1208(Key var1, AlgorithmParameterSpec var2) throws InvalidKeyException, InvalidAlgorithmParameterException;

    @Override
    public final AlgorithmParameterSpec cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    @Override
    public final int cfr_renamed_1200(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, BadPaddingException {
        if (arg3.length < this.cfr_renamed_1202(arg2)) {
            throw new ShortBufferException(sprndda.cfr_renamed_9("mbVgWc\u0002uWqDrP7VxM7Q\u007fMeV9"));
        }
        byte[] byArray = this.cfr_renamed_1199(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
    }

    @Override
    public final int cfr_renamed_1201(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        if (arg3.length < this.cfr_renamed_1202(arg2)) {
            throw new ShortBufferException(sprxwg.cfr_renamed_9("qmjhkl"));
        }
        byte[] byArray = this.cfr_renamed_1197(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
    }

    public abstract void cfr_renamed_1210(Key var1, AlgorithmParameterSpec var2, SecureRandom var3) throws InvalidKeyException, InvalidAlgorithmParameterException;

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
            throw new InvalidParameterException(sprndda.cfr_renamed_9("CJ~Q7A~R\u007fGe\u0002yGrFd\u0002vNpMeKcJz\u0002gCeCzGcGeQ7DxP7KyKcKvN~XvV~My\u0002?AvLyMc\u0002uG7LbN{\u000b9"));
        }
    }

    @Override
    public abstract byte[] cfr_renamed_1197(byte[] var1, int var2, int var3);

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

    public final void cfr_renamed_1212(Key arg0, AlgorithmParameterSpec arg1) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.cfr_renamed_1198(arg0, arg1, new SecureRandom());
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
            throw new InvalidParameterException(sprxwg.cfr_renamed_9("Lvqm8}qnp{j>v{}zk>yr\u007fqjwlvu>h\u007fj\u007fu{l{jm8xwl8wvwlwyrqdyjqqv>0}ypvql>z{8pmrt76"));
        }
    }

    @Override
    public final int cfr_renamed_1202(int arg0) {
        if (this.cfr_renamed_2 == 1) {
            return this.cfr_renamed_1209(arg0);
        }
        return this.cfr_renamed_1207(arg0);
    }

    @Override
    public final int cfr_renamed_1195() {
        return 0;
    }
}

