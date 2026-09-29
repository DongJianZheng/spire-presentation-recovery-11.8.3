/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfke;
import com.spire.presentation.packages.spriel;
import com.spire.presentation.packages.sprimj;
import com.spire.presentation.packages.sprjmf;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprknk;
import com.spire.presentation.packages.sprobi;
import com.spire.presentation.packages.sproyj;
import com.spire.presentation.packages.sprqjm;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprsso;
import com.spire.presentation.packages.sprxlj;
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

public class sprukj
extends sprjmf {
    private byte[] cfr_renamed_1;
    private static final sprqjm cfr_renamed_2 = new sprqjm();
    private spriel cfr_renamed_3;
    private sprqxk cfr_renamed_4;
    private String cfr_renamed_112;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineDoPhase(Key arg0, boolean arg1) throws InvalidKeyException, IllegalStateException {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprsso.cfr_renamed_9("\u001e.Q4\u001e)P)J)_,W3[$\u0010")).toString());
        }
        if (!arg1) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprfke.cfr_renamed_9("kY*TkU%V2\u001a)_kX.N<_.TkN<UkJ*H?S.Ie")).toString());
        }
        if (!(arg0 instanceof PublicKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprsso.cfr_renamed_9("`U%G`_'L%[-[.J`L%O5W2[3\u001e")).append(sprukj.cfr_renamed_2498(sprxz.class)).append(sprfke.cfr_renamed_9("\u001a-U9\u001a/U\u001bR*I.")).toString());
        }
        spryye spryye2 = sprukj.cfr_renamed_1216((PublicKey)arg0);
        try {
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_5695(spryye2);
            return null;
        }
        catch (Exception exception) {
            throw new sprimj(this, sprsso.cfr_renamed_9("#_,]5R!J)Q.\u001e&_)R%Zz\u001e") + exception.getMessage(), exception);
        }
    }

    @Override
    public byte[] cfr_renamed_5696() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprukj(String string, spriel spriel2, sprjs sprjs2) {
        void arg2;
        void arg0;
        sprukj sprukj2 = this;
        void v1 = arg0;
        super((String)v1, (sprjs)arg2);
        sprukj2.cfr_renamed_112 = v1;
        sprukj2.cfr_renamed_3 = spriel2;
    }

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sproyj) {
            return ((sprxlj)arg0).cfr_renamed_9389();
        }
        return sprqpj.cfr_renamed_1216(arg0);
    }

    private static /* synthetic */ String cfr_renamed_2498(Class arg0) {
        String string = arg0.getName();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    @Override
    public void cfr_renamed_5691(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(arg0 instanceof PrivateKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprfke.cfr_renamed_9("\u001a _2\u001a*]9_.W.T?\u001a9_:O\"H.Ik")).append(sprukj.cfr_renamed_2498(sprxo.class)).append(sprsso.cfr_renamed_9("\u001e&Q2\u001e)P)J)_,W3_4W/P")).toString());
        }
        if (arg1 != null && !(arg1 instanceof sprobi)) {
            throw new InvalidAlgorithmParameterException(sprfke.cfr_renamed_9("\u0005Uk[']$H\"N#WkJ*H*W.N.H8\u001a8O;J$H?_/"));
        }
        sprzuk sprzuk2 = (sprzuk)sprqpj.cfr_renamed_1220((PrivateKey)arg0);
        sprukj sprukj2 = this;
        sprukj2.cfr_renamed_4 = sprzuk2.cfr_renamed_284();
        sprukj2.cfr_renamed_4 = arg1 instanceof sprobi ? ((sprobi)arg1).cfr_renamed_4032() : null;
        this.cfr_renamed_3.cfr_renamed_5692(new sprknk(sprzuk2, (byte[])this.cfr_renamed_4));
    }
}

