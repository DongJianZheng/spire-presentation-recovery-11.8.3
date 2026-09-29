/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbik;
import com.spire.presentation.packages.sprbuy;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprehk;
import com.spire.presentation.packages.sprfik;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprihk;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlkk;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprxbaa;
import com.spire.presentation.packages.sprxkk;
import com.spire.presentation.packages.sprzo;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;

public class spraok {
    private sprehk cfr_renamed_4;

    private static /* synthetic */ byte[] cfr_renamed_2481(byte[] arg0) throws IOException {
        sprrvm sprrvm2;
        int n = arg0.length / 2;
        byte[] byArray = new byte[n];
        byte[] byArray2 = new byte[n];
        System.arraycopy(arg0, 0, byArray, 0, n);
        System.arraycopy(arg0, n, byArray2, 0, n);
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(new sprktm(new BigInteger(1, byArray)));
        sprrvm3.cfr_renamed_5004(new sprktm(new BigInteger(1, byArray2)));
        return new sprcen(sprrvm2).cfr_renamed_91();
    }

    public static /* synthetic */ byte[] cfr_renamed_2550(byte[] arg0) throws IOException {
        return spraok.cfr_renamed_2481(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprzo cfr_renamed_9818(sprlem arg0, PublicKey arg1) throws sprhjg {
        Signature signature;
        try {
            signature = this.cfr_renamed_4.cfr_renamed_8039(arg0);
            signature.initVerify(arg1);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprhjg(new StringBuilder().insert(0, sprxbaa.cfr_renamed_9("\u0016/\u0002#\u000f$C5\fa\u0005(\r%C \u000f&\f3\n5\u000b,Ya")).append(noSuchAlgorithmException.getMessage()).toString(), noSuchAlgorithmException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprhjg(new StringBuilder().insert(0, sprbuy.cfr_renamed_9("t\u001c`\u0010m\u0017!\u0006nRg\u001bo\u0016!\u0002s\u001dw\u001be\u0017sH!")).append(noSuchProviderException.getMessage()).toString(), noSuchProviderException);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprhjg(new StringBuilder().insert(0, sprxbaa.cfr_renamed_9("(\r7\u0002-\n%C*\u00068Ya")).append(invalidKeyException.getMessage()).toString(), invalidKeyException);
        }
        sprbik sprbik2 = new sprbik(signature);
        return new sprfik(this, arg0, sprbik2);
    }

    /*
     * WARNING - void declaration
     */
    public spraok cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprxkk((Provider)arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spraok cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprihk((String)arg0);
        return this;
    }

    public spraok() {
        spraok spraok2 = this;
        spraok2.cfr_renamed_4 = new sprlkk();
    }
}

