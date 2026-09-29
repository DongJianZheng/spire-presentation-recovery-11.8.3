/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqd;
import com.spire.presentation.packages.sprhtc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprqrd;
import com.spire.presentation.packages.sprwrd;
import com.spire.presentation.packages.sprypd;
import com.spire.presentation.packages.sprzro;
import com.spire.presentation.packages.sprzxd;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;

public class spratd {
    private SecureRandom cfr_renamed_3;
    private sprzxd cfr_renamed_4;

    public spratd() {
        spratd spratd2 = this;
        spratd2.cfr_renamed_4 = new sprzxd(new sprypd());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameters cfr_renamed_4067(sprije arg0) throws sprlqd {
        if (arg0.cfr_renamed_284() == null) {
            return null;
        }
        try {
            AlgorithmParameters algorithmParameters = this.cfr_renamed_4.cfr_renamed_4068(arg0.cfr_renamed_593());
            sprwrd.cfr_renamed_1541(algorithmParameters, arg0.cfr_renamed_284());
            return algorithmParameters;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprlqd(sprhtc.cfr_renamed_9("v!{ga`s){$50t2t-p4p2f`s/g`t,r/g)a(x"), noSuchAlgorithmException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprlqd(sprzro.cfr_renamed_9("j\tgO}Ho\u0001g\f)\u0018{\u0007\u007f\u0001m\r{Ho\u0007{Hh\u0004n\u0007{\u0001}\u0000d"), noSuchProviderException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public spratd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprzxd(new sprqrd((Provider)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spratd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprzxd(new sprbqd((String)arg0));
        return this;
    }
}

