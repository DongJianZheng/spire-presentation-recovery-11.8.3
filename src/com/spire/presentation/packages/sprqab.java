/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.spreyc;
import com.spire.presentation.packages.sprfbb;
import com.spire.presentation.packages.sprfeb;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprkcb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprseb;
import com.spire.presentation.packages.sprt;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

public class sprqab
extends sprkcb
implements sprm,
sprs {
    private sprseb cfr_renamed_3;
    private sprlc cfr_renamed_4;

    @Override
    public void cfr_renamed_1208(Key arg0, AlgorithmParameterSpec arg1) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprhgb sprhgb2 = sprfeb.cfr_renamed_1220((PrivateKey)arg0);
        sprqab sprqab2 = this;
        sprqab2.cfr_renamed_4.cfr_renamed_41();
        sprqab2.cfr_renamed_3.cfr_renamed_1217(false, sprhgb2);
        sprqab2.cfr_renamed_0 = sprqab2.cfr_renamed_3.cfr_renamed_1;
        sprqab2.cfr_renamed_1 = sprqab2.cfr_renamed_3.cfr_renamed_0;
    }

    @Override
    public int cfr_renamed_1204(Key arg0) throws InvalidKeyException {
        sprqab sprqab2;
        sprfbb sprfbb2;
        if (arg0 instanceof PublicKey) {
            sprfbb2 = (sprfbb)sprfeb.cfr_renamed_1216((PublicKey)arg0);
            sprqab2 = this;
        } else {
            sprfbb2 = (sprfbb)sprfeb.cfr_renamed_1220((PrivateKey)arg0);
            sprqab2 = this;
        }
        return sprqab2.cfr_renamed_3.cfr_renamed_1233(sprfbb2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1214(byte[] arg0) throws IllegalBlockSizeException, BadPaddingException {
        byte[] byArray = null;
        try {
            return this.cfr_renamed_3.cfr_renamed_1214(arg0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_136(byte[] arg0) throws IllegalBlockSizeException, BadPaddingException {
        byte[] byArray = null;
        try {
            return this.cfr_renamed_3.cfr_renamed_136(arg0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return byArray;
        }
    }

    @Override
    public String cfr_renamed_313() {
        return spreyc.cfr_renamed_9("p`xoTf^fmH~P");
    }

    /*
     * WARNING - void declaration
     */
    public sprqab(sprlc sprlc2, sprseb sprseb2) {
        void arg0;
        sprqab sprqab2 = this;
        sprqab2.cfr_renamed_4 = arg0;
        sprqab2.cfr_renamed_3 = sprseb2;
    }

    @Override
    public void cfr_renamed_1210(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprt sprt2 = sprfeb.cfr_renamed_1216((PublicKey)arg0);
        sprt2 = new spraed(sprt2, arg2);
        sprqab sprqab2 = this;
        sprqab2.cfr_renamed_4.cfr_renamed_41();
        sprqab2.cfr_renamed_3.cfr_renamed_1217(true, sprt2);
        sprqab2.cfr_renamed_0 = sprqab2.cfr_renamed_3.cfr_renamed_1;
        sprqab2.cfr_renamed_1 = sprqab2.cfr_renamed_3.cfr_renamed_0;
    }
}

