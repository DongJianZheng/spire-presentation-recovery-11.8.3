/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sproyj;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprtuj;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.spryye;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;

public class sprdbk {
    public static sprhfm cfr_renamed_9440(ECGenParameterSpec arg0, sprqw arg1) {
        return sprdbk.cfr_renamed_9441(arg0.getName(), arg1);
    }

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sproyj) {
            return ((sproyj)arg0).cfr_renamed_9389();
        }
        return sprqpj.cfr_renamed_1216(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprlem cfr_renamed_2103(String arg0) {
        char c = arg0.charAt(0);
        if (c >= '0' && c <= '2') {
            try {
                return new sprlem(arg0);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return null;
    }

    public static sprhfm cfr_renamed_9441(String arg0, sprqw arg1) {
        sprlem sprlem2;
        if (null == arg0 || arg0.length() < 1) {
            return null;
        }
        int n = arg0.indexOf(32);
        if (n > 0) {
            arg0 = arg0.substring(n + 1);
        }
        if (null == (sprlem2 = sprdbk.cfr_renamed_2103(arg0))) {
            return sprqpj.cfr_renamed_9379(arg0);
        }
        sprhfm sprhfm2 = sprqpj.cfr_renamed_9156(sprlem2);
        if (null == sprhfm2 && null != arg1) {
            sprhfm2 = (sprhfm)arg1.cfr_renamed_9167().get(sprlem2);
        }
        return sprhfm2;
    }

    public static sprcgm cfr_renamed_9442(ECParameterSpec arg0, boolean arg1) {
        sprgxh sprgxh2;
        if (arg0 instanceof sprxvh) {
            sprlem sprlem2 = sprqpj.cfr_renamed_2326(((sprxvh)arg0).cfr_renamed_313());
            if (sprlem2 == null) {
                sprlem2 = new sprlem(((sprxvh)arg0).cfr_renamed_313());
            }
            sprcgm sprcgm2 = new sprcgm(sprlem2);
            return sprcgm2;
        }
        if (arg0 == null) {
            sprcgm sprcgm3 = new sprcgm(sprpen.cfr_renamed_4);
            return sprcgm3;
        }
        sprgxh sprgxh3 = sprgxh2 = sprnlj.cfr_renamed_2323(arg0.getCurve());
        sprgxh sprgxh4 = sprgxh2;
        sprhfm sprhfm2 = new sprhfm(sprgxh4, new sprfim(sprnlj.cfr_renamed_9154(sprgxh4, arg0.getGenerator()), arg1), arg0.getOrder(), BigInteger.valueOf(arg0.getCofactor()), arg0.getCurve().getSeed());
        sprcgm sprcgm4 = new sprcgm(sprhfm2);
        return sprcgm4;
    }

    public static spryye cfr_renamed_1220(PrivateKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprtuj) {
            return ((sprtuj)arg0).cfr_renamed_9389();
        }
        return sprqpj.cfr_renamed_1220(arg0);
    }
}

