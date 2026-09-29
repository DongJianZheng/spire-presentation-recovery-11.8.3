/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpnia;
import com.spire.presentation.packages.sprqzfa;
import com.spire.presentation.packages.sprxkf;
import com.spire.presentation.packages.sprybl;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.ShortBufferException;

public abstract class sprnsf
extends sprxkf {
    public AlgorithmParameterSpec cfr_renamed_4;

    @Override
    public final void cfr_renamed_1192(String arg0) {
    }

    @Override
    public abstract byte[] cfr_renamed_1199(byte[] var1, int var2, int var3) throws BadPaddingException;

    @Override
    public final int cfr_renamed_1195() {
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void cfr_renamed_1198(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        void arg2;
        void arg1;
        this.cfr_renamed_3 = 1;
        this.cfr_renamed_1210(key, (AlgorithmParameterSpec)arg1, (SecureRandom)arg2);
    }

    @Override
    public final int cfr_renamed_1202(int arg0) {
        if (this.cfr_renamed_3 == 1) {
            return this.cfr_renamed_1209(arg0);
        }
        return this.cfr_renamed_1207(arg0);
    }

    @Override
    public abstract byte[] cfr_renamed_1197(byte[] var1, int var2, int var3);

    public abstract void cfr_renamed_1208(Key var1, AlgorithmParameterSpec var2) throws InvalidKeyException, InvalidAlgorithmParameterException;

    /*
     * WARNING - void declaration
     */
    @Override
    public final void cfr_renamed_1194(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        void arg1;
        this.cfr_renamed_3 = 2;
        this.cfr_renamed_1208(key, (AlgorithmParameterSpec)arg1);
    }

    public abstract int cfr_renamed_1209(int var1);

    public abstract void cfr_renamed_1210(Key var1, AlgorithmParameterSpec var2, SecureRandom var3) throws InvalidKeyException, InvalidAlgorithmParameterException;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_1211(Key arg0) throws InvalidKeyException {
        try {
            this.cfr_renamed_1198(arg0, null, sprybl.cfr_renamed_2794());
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(sprpnia.cfr_renamed_9("^!c:**c9b,xid,o-yik%m&x ~!giz(x(g,~,x:*/e;* d ~ k%c3k=c&di\"*k'd&~ih,*'\u007f%f`$"));
        }
    }

    @Override
    public final void cfr_renamed_1193(String arg0) {
    }

    public abstract int cfr_renamed_1207(int var1);

    @Override
    public final int cfr_renamed_1200(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, BadPaddingException {
        if (arg3.length < this.cfr_renamed_1202(arg2)) {
            throw new ShortBufferException(sprqzfa.cfr_renamed_9("\u00107+2*6\u007f *$9'-b+-0b,*00+l"));
        }
        byte[] byArray = this.cfr_renamed_1199(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
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
            throw new InvalidParameterException(sprpnia.cfr_renamed_9("^!c:**c9b,xid,o-yik%m&x ~!giz(x(g,~,x:*/e;* d ~ k%c3k=c&di\"*k'd&~ih,*'\u007f%f`$"));
        }
    }

    @Override
    public final byte[] cfr_renamed_1205() {
        return null;
    }

    public final void cfr_renamed_1212(Key arg0, AlgorithmParameterSpec arg1) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.cfr_renamed_1198(arg0, arg1, sprybl.cfr_renamed_2794());
    }

    @Override
    public final AlgorithmParameterSpec cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    @Override
    public final int cfr_renamed_1201(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        if (arg3.length < this.cfr_renamed_1202(arg2)) {
            throw new ShortBufferException(sprqzfa.cfr_renamed_9("07+2*6"));
        }
        byte[] byArray = this.cfr_renamed_1197(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
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
            throw new InvalidParameterException(sprpnia.cfr_renamed_9("^!c:**c9b,xid,o-yik%m&x ~!giz(x(g,~,x:*/e;* d ~ k%c3k=c&di\"*k'd&~ih,*'\u007f%f`$"));
        }
    }
}

