/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjfg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprpd;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprsf;
import com.spire.presentation.packages.spruck;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryym;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.PBEParameterSpec;

public class sprqng
implements sprpd {
    private sprrr cfr_renamed_0;
    private sprlem cfr_renamed_1;
    private int cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public sprddm cfr_renamed_1479() {
        return new sprddm(this.cfr_renamed_1, sprpen.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprqng cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_0 = new sprkhi((Provider)arg0);
        return this;
    }

    public static /* synthetic */ int cfr_renamed_7398(sprqng arg0) {
        return arg0.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprqng cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_0 = new sprxil((String)arg0);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprsf cfr_renamed_1480(char[] arg0) throws sprhjg {
        if (this.cfr_renamed_3 == null) {
            sprqng sprqng2 = this;
            sprqng2.cfr_renamed_3 = new SecureRandom();
        }
        try {
            sprqng sprqng3 = this;
            sprqng sprqng4 = this;
            Mac mac = sprqng3.cfr_renamed_0.cfr_renamed_1508(sprqng4.cfr_renamed_1.cfr_renamed_19());
            sprqng3.cfr_renamed_2 = mac.getMacLength();
            byte[] byArray = new byte[sprqng4.cfr_renamed_2];
            sprqng3.cfr_renamed_3.nextBytes(byArray);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(byArray, this.cfr_renamed_4);
            spruck spruck2 = new spruck(arg0);
            mac.init(spruck2, pBEParameterSpec);
            return new sprjfg(this, byArray, mac, spruck2);
        }
        catch (Exception exception) {
            throw new sprhjg(new StringBuilder().insert(0, spryym.cfr_renamed_9("\u0000i\u0014e\u0019bUs\u001a'\u0016u\u0010f\u0001bUJ4DUd\u0014k\u0016r\u0019f\u0001h\u0007=U")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprqng(sprlem sprlem2) {
        sprqng sprqng2 = this;
        sprqng sprqng3 = this;
        sprqng3.cfr_renamed_0 = new sprrul();
        sprqng2.cfr_renamed_4 = 1024;
        sprqng2.cfr_renamed_1 = sprlem2;
    }

    public sprqng cfr_renamed_1616(int arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprqng() {
        this(sprgt.cfr_renamed_0);
    }

    public static /* synthetic */ sprlem cfr_renamed_7399(sprqng arg0) {
        return arg0.cfr_renamed_1;
    }
}

