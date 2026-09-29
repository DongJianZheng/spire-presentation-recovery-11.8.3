/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprca;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprkxa;
import com.spire.presentation.packages.sprnyq;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class sprscb
implements sprca {
    private sprhn cfr_renamed_91;
    private SecureRandom cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private sprko cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    @Override
    public sprije cfr_renamed_1479() {
        return new sprije(this.cfr_renamed_4, sprume.cfr_renamed_3);
    }

    public static /* synthetic */ sprtzd cfr_renamed_1506(sprscb arg0) {
        return arg0.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprscb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_91 = new spritd((Provider)arg0);
        return this;
    }

    public sprscb() {
        this(sprdh.cfr_renamed_86);
    }

    public static /* synthetic */ int cfr_renamed_1507(sprscb arg0) {
        return arg0.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprscb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_91 = new sprrwd((String)arg0);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprha cfr_renamed_1480(char[] arg0) throws sprfya {
        if (this.cfr_renamed_0 == null) {
            sprscb sprscb2 = this;
            sprscb2.cfr_renamed_0 = new SecureRandom();
        }
        try {
            sprscb sprscb3 = this;
            sprscb sprscb4 = this;
            Mac mac = sprscb3.cfr_renamed_91.cfr_renamed_1508(sprscb4.cfr_renamed_4.cfr_renamed_19());
            sprscb3.cfr_renamed_1 = mac.getMacLength();
            byte[] byArray = new byte[sprscb4.cfr_renamed_1];
            sprscb3.cfr_renamed_0.nextBytes(byArray);
            SecretKeyFactory secretKeyFactory = sprscb3.cfr_renamed_91.cfr_renamed_1495(this.cfr_renamed_4.cfr_renamed_19());
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(byArray, this.cfr_renamed_2);
            PBEKeySpec pBEKeySpec = new PBEKeySpec(arg0);
            SecretKey secretKey = secretKeyFactory.generateSecret(pBEKeySpec);
            mac.init(secretKey, pBEParameterSpec);
            return new sprkxa(this, byArray, mac, arg0);
        }
        catch (Exception exception) {
            throw new sprfya(new StringBuilder().insert(0, sprnyq.cfr_renamed_9("\fQ\u0018]\u0015ZYK\u0016\u001f\u001aM\u001c^\rZYr8|Y\\\u0018S\u001aJ\u0015^\rP\u000b\u0005Y")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprscb(sprtzd sprtzd2) {
        sprscb sprscb2 = this;
        sprscb sprscb3 = this;
        sprscb3.cfr_renamed_91 = new sprkvd();
        sprscb2.cfr_renamed_2 = 1024;
        sprscb2.cfr_renamed_4 = sprtzd2;
    }
}

