/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprcza;
import com.spire.presentation.packages.sprdfb;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprkdb;
import com.spire.presentation.packages.sprkkaa;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprrbb;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprt;
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

public class sprxab
extends sprdfb
implements sprm,
sprs {
    private sprlc cfr_renamed_2;
    private sprkdb cfr_renamed_3;
    private ByteArrayOutputStream cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1214(byte[] arg0) throws IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException {
        byte[] byArray = null;
        try {
            return this.cfr_renamed_3.cfr_renamed_1214(arg0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray;
        }
    }

    @Override
    public int cfr_renamed_1207(int arg0) {
        return 0;
    }

    @Override
    public int cfr_renamed_1209(int arg0) {
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprxab(sprlc sprlc2, sprkdb sprkdb2) {
        void arg0;
        sprxab sprxab2 = this;
        sprxab sprxab3 = this;
        sprxab3.cfr_renamed_4 = new ByteArrayOutputStream();
        sprxab2.cfr_renamed_2 = arg0;
        sprxab2.cfr_renamed_3 = sprkdb2;
        sprxab2.cfr_renamed_4 = new ByteArrayOutputStream();
    }

    @Override
    public String cfr_renamed_313() {
        return sprkkaa.cfr_renamed_9("\u000eO\u0006@*I I\u0013C*B7O+I5M/o*\\+I1");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1199(byte[] byArray, int n, int n2) throws BadPaddingException {
        sprxab sprxab2 = this;
        this.cfr_renamed_1197(byArray, n, n2);
        byte[] byArray2 = sprxab2.cfr_renamed_4.toByteArray();
        sprxab2.cfr_renamed_4.reset();
        if (sprxab2.cfr_renamed_2 == true) {
            try {
                return this.cfr_renamed_3.cfr_renamed_136(byArray2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
        }
        if (this.cfr_renamed_2 != 2) return null;
        try {
            return this.cfr_renamed_3.cfr_renamed_1214(byArray2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public void cfr_renamed_1210(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprt sprt2 = sprrbb.cfr_renamed_1216((PublicKey)arg0);
        sprt2 = new spraed(sprt2, arg2);
        sprxab sprxab2 = this;
        sprxab2.cfr_renamed_2.cfr_renamed_41();
        sprxab2.cfr_renamed_3.cfr_renamed_1217(true, sprt2);
    }

    @Override
    public void cfr_renamed_1208(Key arg0, AlgorithmParameterSpec arg1) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprhgb sprhgb2 = sprrbb.cfr_renamed_1220((PrivateKey)arg0);
        sprxab sprxab2 = this;
        sprxab2.cfr_renamed_2.cfr_renamed_41();
        sprxab2.cfr_renamed_3.cfr_renamed_1217(false, sprhgb2);
    }

    @Override
    public int cfr_renamed_1204(Key arg0) throws InvalidKeyException {
        sprxab sprxab2;
        sprcza sprcza2;
        if (arg0 instanceof PublicKey) {
            sprcza2 = (sprcza)sprrbb.cfr_renamed_1216((PublicKey)arg0);
            sprxab2 = this;
        } else {
            sprcza2 = (sprcza)sprrbb.cfr_renamed_1220((PrivateKey)arg0);
            sprxab2 = this;
        }
        return sprxab2.cfr_renamed_3.cfr_renamed_1232(sprcza2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] cfr_renamed_1197(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_4.write((byte[])arg0, (int)arg1, (int)arg2);
        return new byte[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_136(byte[] arg0) throws IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException {
        byte[] byArray = null;
        try {
            return this.cfr_renamed_3.cfr_renamed_136(arg0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray;
        }
    }
}

