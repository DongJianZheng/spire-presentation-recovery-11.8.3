/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtc;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprhbd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmis;
import com.spire.presentation.packages.sprnzha;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqxc;
import com.spire.presentation.packages.sprtuc;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxsc;
import com.spire.presentation.packages.spryc;
import com.spire.presentation.packages.sprysc;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;

public class spruwc {
    private sprtuc cfr_renamed_4;

    private static /* synthetic */ byte[] cfr_renamed_2481(byte[] arg0) throws IOException {
        sprlre sprlre2;
        int n = arg0.length / 2;
        byte[] byArray = new byte[n];
        byte[] byArray2 = new byte[n];
        System.arraycopy(arg0, 0, byArray, 0, n);
        System.arraycopy(arg0, n, byArray2, 0, n);
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(new sprooe(new BigInteger(1, byArray)));
        sprlre3.cfr_renamed_49(new sprooe(new BigInteger(1, byArray2)));
        return new sprpse(sprlre2).cfr_renamed_91();
    }

    public spruwc() {
        spruwc spruwc2 = this;
        spruwc2.cfr_renamed_4 = new sprqxc();
    }

    public static /* synthetic */ byte[] cfr_renamed_2550(byte[] arg0) throws IOException {
        return spruwc.cfr_renamed_2481(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spryc cfr_renamed_2554(sprtzd arg0, PublicKey arg1) throws sprfya {
        Signature signature;
        try {
            signature = this.cfr_renamed_4.cfr_renamed_2553(arg0);
            signature.initVerify(arg1);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprfya(new StringBuilder().insert(0, sprmis.cfr_renamed_9("\u001d2\t>\u00049H(\u0007|\u000e5\u00068H=\u0004;\u0007.\u0001(\u00001R|")).append(noSuchAlgorithmException.getMessage()).toString(), noSuchAlgorithmException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprfya(new StringBuilder().insert(0, sprnzha.cfr_renamed_9("\u0001k\u0015g\u0018`Tq\u001b%\u0012l\u001aaTu\u0006j\u0002l\u0010`\u0006?T")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprfya(new StringBuilder().insert(0, sprmis.cfr_renamed_9("5\u0006*\t0\u00018H7\r%R|")).append(invalidKeyException.getMessage()).toString(), invalidKeyException);
        }
        sprxsc sprxsc2 = new sprxsc(this, signature);
        return new sprbtc(this, arg0, sprxsc2);
    }

    /*
     * WARNING - void declaration
     */
    public spruwc cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprhbd((Provider)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spruwc cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprysc((String)arg0);
        return this;
    }
}

