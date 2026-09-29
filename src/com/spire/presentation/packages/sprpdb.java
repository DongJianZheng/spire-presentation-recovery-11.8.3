/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprcza;
import com.spire.presentation.packages.sprdfb;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlob;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprrbb;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprveb;
import com.spire.presentation.packages.sprzdaa;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

public class sprpdb
extends sprdfb
implements sprm,
sprs {
    private ByteArrayOutputStream cfr_renamed_2;
    private sprlc cfr_renamed_3;
    private sprveb cfr_renamed_4;

    @Override
    public int cfr_renamed_1204(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof PublicKey) {
            sprcza sprcza2 = (sprcza)sprrbb.cfr_renamed_1216((PublicKey)arg0);
            return this.cfr_renamed_4.cfr_renamed_1232(sprcza2);
        }
        if (arg0 instanceof PrivateKey) {
            sprcza sprcza3 = (sprcza)sprrbb.cfr_renamed_1220((PrivateKey)arg0);
            return this.cfr_renamed_4.cfr_renamed_1232(sprcza3);
        }
        throw new InvalidKeyException();
    }

    @Override
    public String cfr_renamed_313() {
        return sprlob.cfr_renamed_9("rhzgVn\\ntd]jMjvf^b|bOcZy");
    }

    private /* synthetic */ byte[] cfr_renamed_1234(byte[] arg0) throws BadPaddingException {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0 && arg0[n] == 0) {
            n2 = --n;
        }
        if (arg0[n] != 1) {
            throw new BadPaddingException(sprzdaa.cfr_renamed_9("A\f^\u0003D\u000bLBK\u000bX\nM\u0010\\\u0007P\u0016"));
        }
        byte[] byArray = new byte[n];
        System.arraycopy(arg0, 0, byArray, 0, n);
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1199(byte[] arg0, int arg1, int arg2) throws BadPaddingException {
        sprpdb sprpdb2 = this;
        sprpdb2.cfr_renamed_1197(arg0, arg1, arg2);
        if (sprpdb2.cfr_renamed_2 == true) {
            try {
                return this.cfr_renamed_4.cfr_renamed_136(this.cfr_renamed_1235());
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
        }
        if (this.cfr_renamed_2 != 2) return null;
        sprpdb sprpdb3 = this;
        byte[] byArray = sprpdb3.cfr_renamed_2.toByteArray();
        sprpdb3.cfr_renamed_2.reset();
        try {
            sprpdb sprpdb4 = this;
            return sprpdb4.cfr_renamed_1234(sprpdb4.cfr_renamed_4.cfr_renamed_1214(byArray));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public int cfr_renamed_1209(int arg0) {
        return 0;
    }

    @Override
    public int cfr_renamed_1207(int arg0) {
        return 0;
    }

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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1236() throws IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException {
        byte[] byArray = null;
        sprpdb sprpdb2 = this;
        byte[] byArray2 = sprpdb2.cfr_renamed_2.toByteArray();
        sprpdb2.cfr_renamed_2.reset();
        try {
            sprpdb sprpdb3 = this;
            return sprpdb3.cfr_renamed_1234(sprpdb3.cfr_renamed_4.cfr_renamed_1214(byArray2));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1210(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        void arg2;
        this.cfr_renamed_2.reset();
        sprt sprt2 = sprrbb.cfr_renamed_1216((PublicKey)key);
        sprt2 = new spraed(sprt2, (SecureRandom)arg2);
        sprpdb sprpdb2 = this;
        sprpdb2.cfr_renamed_3.cfr_renamed_41();
        sprpdb2.cfr_renamed_4.cfr_renamed_1217(true, sprt2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1237() throws IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException {
        byte[] byArray = null;
        try {
            return this.cfr_renamed_4.cfr_renamed_136(this.cfr_renamed_1235());
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprpdb(sprlc sprlc2, sprveb sprveb2) {
        void arg0;
        sprpdb sprpdb2 = this;
        sprpdb sprpdb3 = this;
        sprpdb3.cfr_renamed_2 = new ByteArrayOutputStream();
        sprpdb2.cfr_renamed_3 = arg0;
        sprpdb2.cfr_renamed_4 = sprveb2;
        sprpdb2.cfr_renamed_2 = new ByteArrayOutputStream();
    }

    @Override
    public void cfr_renamed_1208(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.cfr_renamed_2.reset();
        sprhgb sprhgb2 = sprrbb.cfr_renamed_1220((PrivateKey)key);
        sprpdb sprpdb2 = this;
        sprpdb2.cfr_renamed_3.cfr_renamed_41();
        sprpdb2.cfr_renamed_4.cfr_renamed_1217(false, sprhgb2);
    }

    private /* synthetic */ byte[] cfr_renamed_1235() {
        sprpdb sprpdb2 = this;
        sprpdb2.cfr_renamed_2.write(1);
        byte[] byArray = sprpdb2.cfr_renamed_2.toByteArray();
        sprpdb2.cfr_renamed_2.reset();
        return byArray;
    }

    public sprpdb() {
        sprpdb sprpdb2 = this;
        this.cfr_renamed_2 = new ByteArrayOutputStream();
        sprpdb2.cfr_renamed_2 = new ByteArrayOutputStream();
    }
}

