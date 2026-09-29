/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfym;
import com.spire.presentation.packages.sprgp;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprkng;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprsx;
import com.spire.presentation.packages.spruig;
import com.spire.presentation.packages.spruyda;
import com.spire.presentation.packages.sprvng;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryhg;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class sprihg
extends sprkng {
    private SecureRandom cfr_renamed_2;
    private sprvng cfr_renamed_3;
    private SecretKey cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprihg(SecretKey secretKey) {
        super(sprihg.cfr_renamed_7444(((SecretKey)arg0).getAlgorithm(), ((SecretKey)arg0).getEncoded().length * 8));
        void arg0;
        sprihg sprihg2 = this;
        this.cfr_renamed_3 = new sprvng(new sprrul());
        this.cfr_renamed_4 = secretKey;
    }

    public static sprddm cfr_renamed_7444(String arg0, int arg1) {
        if (arg0.startsWith("DES") || arg0.startsWith("TripleDES")) {
            return new sprddm(sprdl.cfr_renamed_152, sprpen.cfr_renamed_4);
        }
        if (arg0.startsWith("RC2")) {
            return new sprddm(new sprlem(spruyda.cfr_renamed_9("9\u0001:\u00010\u001b8\u00019\u001e;\u001a<\u0016&\u001e&\u0016&\u001e>\u0001;\u0001?")), new sprktm(58L));
        }
        if (arg0.startsWith(sprfym.cfr_renamed_9("{>i")) || arg0.startsWith(sprwr.cfr_renamed_91.cfr_renamed_19())) {
            sprlem sprlem2;
            if (arg1 == 128) {
                sprlem2 = sprwr.cfr_renamed_136;
            } else if (arg1 == 192) {
                sprlem2 = sprwr.cfr_renamed_287;
            } else if (arg1 == 256) {
                sprlem2 = sprwr.cfr_renamed_3;
            } else {
                throw new IllegalArgumentException(spruyda.cfr_renamed_9("FdCmHiC(DmV{FrJ(Ff\u000fIj["));
            }
            return new sprddm(sprlem2);
        }
        if (arg0.startsWith(sprfym.cfr_renamed_9("(\u007f>~"))) {
            return new sprddm(sprgp.cfr_renamed_3);
        }
        if (arg0.startsWith(spruyda.cfr_renamed_9("liBmCdFi"))) {
            sprlem sprlem3;
            if (arg1 == 128) {
                sprlem3 = sprsx.cfr_renamed_91;
            } else if (arg1 == 192) {
                sprlem3 = sprsx.cfr_renamed_0;
            } else if (arg1 == 256) {
                sprlem3 = sprsx.cfr_renamed_3;
            } else {
                throw new IllegalArgumentException(sprfym.cfr_renamed_9("S\u0017V\u001e]\u001aV[Q\u001eC\bS\u0001_[S\u0015\u001a8[\u0016_\u0017V\u0012["));
            }
            return new sprddm(sprlem3);
        }
        throw new IllegalArgumentException(spruyda.cfr_renamed_9("}AcAgXf\u000fiCo@zF|Ge"));
    }

    /*
     * WARNING - void declaration
     */
    public sprihg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprvng(new sprxil((String)arg0));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_7424(sprnfg arg0) throws spryhg {
        Key key = spruig.cfr_renamed_7426(arg0);
        Cipher cipher = this.cfr_renamed_3.cfr_renamed_7428(this.cfr_renamed_615().cfr_renamed_593());
        try {
            sprihg sprihg2 = this;
            cipher.init(3, (Key)sprihg2.cfr_renamed_4, sprihg2.cfr_renamed_2);
            return cipher.wrap(key);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new spryhg(new StringBuilder().insert(0, sprfym.cfr_renamed_9("Y\u001aT\u0015U\u000f\u001a\fH\u001aJ[Q\u001eCA\u001a")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    public sprihg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprihg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprvng(new sprkhi((Provider)arg0));
        return this;
    }
}

