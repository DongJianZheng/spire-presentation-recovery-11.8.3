/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdgk;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprjdf;
import com.spire.presentation.packages.sprkze;
import com.spire.presentation.packages.sprlcd;
import com.spire.presentation.packages.sprnsf;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spryjf;
import com.spire.presentation.packages.spryye;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;

public class sprctf
extends sprnsf
implements sprdl,
sprhl {
    private ByteArrayOutputStream cfr_renamed_2;
    private sprjdf cfr_renamed_3;
    private sprgf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] cfr_renamed_1197(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_2.write((byte[])arg0, (int)arg1, (int)arg2);
        return new byte[0];
    }

    private /* synthetic */ byte[] cfr_renamed_1234(byte[] arg0) throws BadPaddingException {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0 && arg0[n] == 0) {
            n2 = --n;
        }
        if (arg0[n] != 1) {
            throw new BadPaddingException(sprlcd.cfr_renamed_9("\u0015=\n2\u0010:\u0018s\u001f:\f;\u0019!\b6\u0004'"));
        }
        byte[] byArray = new byte[n];
        System.arraycopy(arg0, 0, byArray, 0, n);
        return byArray;
    }

    @Override
    public int cfr_renamed_1204(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof PublicKey) {
            sprkze sprkze2 = (sprkze)spryjf.cfr_renamed_1216((PublicKey)arg0);
            return this.cfr_renamed_3.cfr_renamed_5628(sprkze2);
        }
        if (arg0 instanceof PrivateKey) {
            sprkze sprkze3 = (sprkze)spryjf.cfr_renamed_1220((PrivateKey)arg0);
            return this.cfr_renamed_3.cfr_renamed_5628(sprkze3);
        }
        throw new InvalidKeyException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1199(byte[] arg0, int arg1, int arg2) throws BadPaddingException {
        sprctf sprctf2 = this;
        sprctf2.cfr_renamed_1197(arg0, arg1, arg2);
        if (sprctf2.cfr_renamed_3 == true) {
            return this.cfr_renamed_3.cfr_renamed_136(this.cfr_renamed_1235());
        }
        if (this.cfr_renamed_3 != 2) {
            throw new IllegalStateException(sprdgk.cfr_renamed_9("A~_~[gZ0Y\u007fPu\u0014yZ0P\u007fryZqX"));
        }
        try {
            sprctf sprctf3 = this;
            byte[] byArray = sprctf3.cfr_renamed_2.toByteArray();
            sprctf3.cfr_renamed_2.reset();
            return sprctf3.cfr_renamed_1234(sprctf3.cfr_renamed_3.cfr_renamed_1214(byArray));
        }
        catch (sprull sprull2) {
            throw new BadPaddingException(sprull2.getMessage());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1210(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        void arg2;
        this.cfr_renamed_2.reset();
        sprbj sprbj2 = spryjf.cfr_renamed_1216((PublicKey)key);
        sprbj2 = new sprbgk(sprbj2, (SecureRandom)arg2);
        sprctf sprctf2 = this;
        sprctf2.cfr_renamed_4.cfr_renamed_41();
        sprctf2.cfr_renamed_3.cfr_renamed_5535(true, sprbj2);
    }

    @Override
    public void cfr_renamed_1208(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.cfr_renamed_2.reset();
        spryye spryye2 = spryjf.cfr_renamed_1220((PrivateKey)key);
        sprctf sprctf2 = this;
        sprctf2.cfr_renamed_4.cfr_renamed_41();
        sprctf2.cfr_renamed_3.cfr_renamed_5535(false, spryye2);
    }

    @Override
    public int cfr_renamed_1209(int arg0) {
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprctf(sprgf sprgf2, sprjdf sprjdf2) {
        void arg0;
        sprctf sprctf2 = this;
        sprctf sprctf3 = this;
        sprctf3.cfr_renamed_2 = new ByteArrayOutputStream();
        sprctf2.cfr_renamed_4 = arg0;
        sprctf2.cfr_renamed_3 = sprjdf2;
        sprctf2.cfr_renamed_2 = new ByteArrayOutputStream();
    }

    @Override
    public String cfr_renamed_313() {
        return sprlcd.cfr_renamed_9("109?\u00156\u001f67<\u001e2\u000e25>\u001d:?:\f;\u0019!");
    }

    @Override
    public int cfr_renamed_1207(int arg0) {
        return 0;
    }

    private /* synthetic */ byte[] cfr_renamed_1235() {
        sprctf sprctf2 = this;
        sprctf2.cfr_renamed_2.write(1);
        byte[] byArray = sprctf2.cfr_renamed_2.toByteArray();
        sprctf2.cfr_renamed_2.reset();
        return byArray;
    }

    public sprctf() {
        sprctf sprctf2 = this;
        this.cfr_renamed_2 = new ByteArrayOutputStream();
        sprctf2.cfr_renamed_2 = new ByteArrayOutputStream();
    }
}

