/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprekj;
import com.spire.presentation.packages.spriel;
import com.spire.presentation.packages.sprjmf;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprknk;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprobi;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprsnj;
import com.spire.presentation.packages.sprtpia;
import com.spire.presentation.packages.sprxo;
import com.spire.presentation.packages.sprxz;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzuk;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class spryrj
extends sprjmf {
    private spriel cfr_renamed_1;
    private String cfr_renamed_112;
    private sprqxk cfr_renamed_2;
    private byte[] cfr_renamed_3;

    /*
     * WARNING - void declaration
     */
    public spryrj(String string, spriel spriel2, sprjs sprjs2) {
        void arg2;
        void arg0;
        spryrj spryrj2 = this;
        void v1 = arg0;
        super((String)v1, (sprjs)arg2);
        spryrj2.cfr_renamed_112 = v1;
        spryrj2.cfr_renamed_1 = spriel2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineDoPhase(Key arg0, boolean arg1) throws InvalidKeyException, IllegalStateException {
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprtpia.cfr_renamed_9("\u001fhPr\u001foQoKo^jVuZb\u0011")).toString());
        }
        if (!arg1) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprkqa.cfr_renamed_9("FX\u0007UFT\bW\u001f\u001b\u0004^FY\u0003O\u0011^\u0003UFO\u0011TFK\u0007I\u0012R\u0003HH")).toString());
        }
        if (!(arg0 instanceof PublicKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprtpia.cfr_renamed_9("&TcF&^aMcZkZhK&McNsVtZu\u001f")).append(spryrj.cfr_renamed_2498(sprxz.class)).append(sprkqa.cfr_renamed_9("\u001b\u0000T\u0014\u001b\u0002T6S\u0007H\u0003")).toString());
        }
        spryye spryye2 = spryrj.cfr_renamed_1216((PublicKey)arg0);
        try {
            this.cfr_renamed_3 = this.cfr_renamed_1.cfr_renamed_5695(spryye2);
            return null;
        }
        catch (Exception exception) {
            throw new sprsnj(this, sprtpia.cfr_renamed_9("e^j\\sSgKoPh\u001f`^oSc[<\u001f") + exception.getMessage(), exception);
        }
    }

    private static /* synthetic */ String cfr_renamed_2498(Class arg0) {
        String string = arg0.getName();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    @Override
    public byte[] cfr_renamed_5696() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_5691(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(arg0 instanceof PrivateKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprkqa.cfr_renamed_9("\u001b\r^\u001f\u001b\u0007\\\u0014^\u0003V\u0003U\u0012\u001b\u0014^\u0017N\u000fI\u0003HF")).append(spryrj.cfr_renamed_2498(sprxo.class)).append(sprtpia.cfr_renamed_9("\u001f`Pt\u001foQoKo^jVu^rViQ")).toString());
        }
        if (arg1 != null && !(arg1 instanceof sprobi)) {
            throw new InvalidAlgorithmParameterException(sprkqa.cfr_renamed_9("(TFZ\n\\\tI\u000fO\u000eVFK\u0007I\u0007V\u0003O\u0003I\u0015\u001b\u0015N\u0016K\tI\u0012^\u0002"));
        }
        sprzuk sprzuk2 = (sprzuk)sprqpj.cfr_renamed_1220((PrivateKey)arg0);
        spryrj spryrj2 = this;
        spryrj2.cfr_renamed_2 = sprzuk2.cfr_renamed_284();
        spryrj2.cfr_renamed_4 = arg1 instanceof sprobi ? ((sprobi)arg1).cfr_renamed_4032() : null;
        this.cfr_renamed_1.cfr_renamed_5692(new sprknk(sprzuk2, this.cfr_renamed_4));
    }

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprekj) {
            return ((sprekj)arg0).cfr_renamed_9389();
        }
        return sprqpj.cfr_renamed_1216(arg0);
    }
}

