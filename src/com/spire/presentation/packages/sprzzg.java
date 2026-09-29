/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprdah;
import com.spire.presentation.packages.sprgyz;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprmqr;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprwrg;
import com.spire.presentation.packages.sprxil;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sprzzg
extends sprdah {
    private sprcyg cfr_renamed_4;

    public sprzzg(char[] arg0, int arg1) {
        char[] cArray = arg0;
        super(arg0, new sprwrg(), arg1);
        this.cfr_renamed_4 = new sprcyg(new sprrul());
    }

    public sprzzg(char[] cArray, sprsm sprsm2, int n) {
        super(cArray, sprsm2, n);
        sprzzg sprzzg2 = this;
        sprzzg2.cfr_renamed_4 = new sprcyg(new sprrul());
    }

    public sprzzg(char[] arg0) {
        char[] cArray = arg0;
        this(arg0, new sprwrg());
    }

    /*
     * WARNING - void declaration
     */
    public sprzzg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprcyg(new sprxil((String)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprzzg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprcyg(new sprkhi((Provider)arg0));
        return this;
    }

    public sprzzg(char[] cArray, sprsm sprsm2) {
        super(cArray, sprsm2);
        sprzzg sprzzg2 = this;
        sprzzg2.cfr_renamed_4 = new sprcyg(new sprrul());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_7915(int arg0, byte[] arg1, byte[] arg2) throws sprtqg {
        try {
            String string = sprmxg.cfr_renamed_7548(arg0);
            Cipher cipher = this.cfr_renamed_4.cfr_renamed_1496(new StringBuilder().insert(0, string).append(sprgyz.cfr_renamed_9("03Y20>p ~\u0014{\u0019q\u0017")).toString());
            SecretKeySpec secretKeySpec = new SecretKeySpec(arg1, sprmxg.cfr_renamed_7548(arg0));
            Cipher cipher2 = cipher;
            cipher2.init(1, (Key)secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
            return cipher2.doFinal(arg2, 0, arg2.length);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new sprtqg(new StringBuilder().insert(0, sprmqr.cfr_renamed_9("/S*Z!^*\u001f$S)\\-\u001f5V<Z|\u001f")).append(illegalBlockSizeException.getMessage()).toString(), illegalBlockSizeException);
        }
        catch (BadPaddingException badPaddingException) {
            throw new sprtqg(new StringBuilder().insert(0, sprgyz.cfr_renamed_9("\u0012~\u0014?\u0000~\u0014{\u0019q\u0017%P")).append(badPaddingException.getMessage()).toString(), badPaddingException);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new sprtqg(new StringBuilder().insert(0, sprmqr.cfr_renamed_9("\u000fifV(I'S/[|\u001f")).append(invalidAlgorithmParameterException.getMessage()).toString(), invalidAlgorithmParameterException);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprtqg(new StringBuilder().insert(0, sprgyz.cfr_renamed_9("\u001bz\t?\u0019q\u0006~\u001cv\u0014%P")).append(invalidKeyException.getMessage()).toString(), invalidKeyException);
        }
    }

    @Override
    public sprdah cfr_renamed_1555(SecureRandom arg0) {
        sprzzg sprzzg2 = this;
        super.cfr_renamed_1555(arg0);
        return sprzzg2;
    }
}

