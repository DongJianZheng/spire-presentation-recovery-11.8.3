/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprjyk;
import com.spire.presentation.packages.sprjzg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprli;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprprg;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprtm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvqg;
import com.spire.presentation.packages.sprxil;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;

public class sprebh
implements sprtm {
    private int cfr_renamed_91;
    private sprjzg cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private int cfr_renamed_2;
    private sprmrg cfr_renamed_3;
    private sprcyg cfr_renamed_4;

    public sprebh cfr_renamed_7989(String arg0) {
        sprebh sprebh2 = this;
        sprebh2.cfr_renamed_3.cfr_renamed_1499(arg0);
        return sprebh2;
    }

    @Override
    public sprli cfr_renamed_7539(int arg0, sprmah arg1) throws sprtqg {
        if (arg1 instanceof sprprg) {
            return this.cfr_renamed_7990(arg0, arg1.cfr_renamed_7541(), ((sprprg)arg1).cfr_renamed_1369());
        }
        return this.cfr_renamed_7990(arg0, arg1.cfr_renamed_7541(), this.cfr_renamed_0.cfr_renamed_7934(arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprebh cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprcyg(new sprxil(string));
        sprebh sprebh2 = this;
        this.cfr_renamed_0.cfr_renamed_1499(string);
        sprebh2.cfr_renamed_3.cfr_renamed_1499((String)arg0);
        return sprebh2;
    }

    public sprebh cfr_renamed_7991(Provider arg0) {
        sprebh sprebh2 = this;
        sprebh2.cfr_renamed_3.cfr_renamed_1498(arg0);
        return sprebh2;
    }

    /*
     * WARNING - void declaration
     */
    public sprebh cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprcyg(new sprkhi(provider));
        sprebh sprebh2 = this;
        this.cfr_renamed_0.cfr_renamed_1498(provider);
        sprebh2.cfr_renamed_3.cfr_renamed_1498((Provider)arg0);
        return sprebh2;
    }

    public static /* synthetic */ int cfr_renamed_7992(sprebh arg0) {
        return arg0.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprli cfr_renamed_7990(int n, long l, PrivateKey privateKey) throws sprtqg {
        sprebh sprebh2 = this;
        sprebh sprebh3 = this;
        sprsm sprsm2 = sprebh2.cfr_renamed_3.cfr_renamed_1451().cfr_renamed_576(sprebh3.cfr_renamed_91);
        sprsm sprsm3 = sprebh2.cfr_renamed_3.cfr_renamed_1451().cfr_renamed_576(this.cfr_renamed_91);
        sprebh sprebh4 = this;
        Signature signature = sprebh3.cfr_renamed_4.cfr_renamed_7923(sprebh4.cfr_renamed_2, sprebh4.cfr_renamed_91);
        try {
            void arg1;
            void arg0;
            void arg2;
            if (this.cfr_renamed_1 != null) {
                signature.initSign((PrivateKey)arg2, this.cfr_renamed_1);
                return new sprvqg(this, (int)arg0, (long)arg1, sprsm3, sprsm2, signature);
            }
            signature.initSign((PrivateKey)arg2);
            return new sprvqg(this, (int)arg0, (long)arg1, sprsm3, sprsm2, signature);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprtqg(sprjyk.cfr_renamed_9(")@6O,G$\u000e+K9\u0000"), invalidKeyException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprebh(int n, int n2) {
        void arg0;
        sprebh sprebh2 = this;
        sprebh sprebh3 = this;
        this.cfr_renamed_4 = new sprcyg(new sprrul());
        sprebh3.cfr_renamed_3 = new sprmrg();
        this.cfr_renamed_0 = new sprjzg();
        sprebh2.cfr_renamed_2 = arg0;
        sprebh2.cfr_renamed_91 = n2;
    }

    public sprebh cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public static /* synthetic */ int cfr_renamed_7993(sprebh arg0) {
        return arg0.cfr_renamed_91;
    }
}

