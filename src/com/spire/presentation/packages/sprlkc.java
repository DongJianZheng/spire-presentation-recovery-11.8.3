/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprecd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjb;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprphc;
import com.spire.presentation.packages.sprraja;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.spruj;
import com.spire.presentation.packages.sprujha;
import com.spire.presentation.packages.sprvb;
import com.spire.presentation.packages.sprvc;
import com.spire.presentation.packages.sprzld;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class sprlkc
extends SignatureSpi
implements sprm,
sprs {
    private spruj cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprlc cfr_renamed_4;

    public sprlkc() {
        sprlkc sprlkc2 = this;
        this.cfr_renamed_4 = new sprzld();
        sprlkc2.cfr_renamed_2 = new sprecd();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprlkc sprlkc2 = this;
        byte[] byArray = new byte[sprlkc2.cfr_renamed_4.cfr_renamed_1218()];
        sprlkc2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            byte[] byArray2 = new byte[32];
            byte[] byArray3 = new byte[32];
            System.arraycopy(arg0, 0, byArray3, 0, 32);
            System.arraycopy(arg0, 32, byArray2, 0, 32);
            BigInteger[] bigIntegerArray = new BigInteger[2];
            bigIntegerArray[0] = new BigInteger(1, byArray2);
            bigIntegerArray[1] = new BigInteger(1, byArray3);
            return this.cfr_renamed_2.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(sprujha.cfr_renamed_9("s#d>dqr4u>r8x66\"\u007f6x0b$d463o%s\"8"));
        }
    }

    @Override
    public byte[] engineSign() throws SignatureException {
        sprlkc sprlkc2 = this;
        byte[] byArray = new byte[sprlkc2.cfr_renamed_4.cfr_renamed_1218()];
        sprlkc2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            byte[] byArray2;
            byte[] byArray3 = new byte[64];
            BigInteger[] bigIntegerArray = this.cfr_renamed_2.cfr_renamed_125(byArray);
            byte[] byArray4 = bigIntegerArray[0].toByteArray();
            byte[] byArray5 = bigIntegerArray[1].toByteArray();
            if (byArray5[0] != 0) {
                System.arraycopy(byArray5, 0, byArray3, 32 - byArray5.length, byArray5.length);
                byArray2 = byArray4;
            } else {
                System.arraycopy(byArray5, 1, byArray3, 32 - (byArray5.length - 1), byArray5.length - 1);
                byArray2 = byArray4;
            }
            if (byArray2[0] != 0) {
                System.arraycopy(byArray4, 0, byArray3, 64 - byArray4.length, byArray4.length);
                return byArray3;
            }
            System.arraycopy(byArray4, 1, byArray3, 64 - (byArray4.length - 1), byArray4.length - 1);
            return byArray3;
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprraja.cfr_renamed_9("4@6G?K\u0002K%~0\\0C4Z4\\q[?]$^!A#Z4J"));
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprujha.cfr_renamed_9("4x6\u007f?s\u0002s%F0d0{4b4dqc?e$f!y#b4r"));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        void arg1;
        this.cfr_renamed_3 = arg1;
        this.engineInitSign(privateKey);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprlkc sprlkc2;
        sprhgb sprhgb2;
        if (arg0 instanceof sprjb) {
            sprhgb2 = sprjkc.cfr_renamed_1220(arg0);
            sprlkc2 = this;
        } else {
            sprhgb2 = sprphc.cfr_renamed_1220(arg0);
            sprlkc2 = this;
        }
        sprlkc2.cfr_renamed_4.cfr_renamed_41();
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_2.cfr_renamed_1217(true, new spraed(sprhgb2, this.cfr_renamed_3));
            return;
        }
        this.cfr_renamed_2.cfr_renamed_1217(true, sprhgb2);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprraja.cfr_renamed_9("4@6G?K\u0002K%~0\\0C4Z4\\q[?]$^!A#Z4J"));
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprlkc sprlkc2;
        sprhgb sprhgb2;
        if (arg0 instanceof sprvb) {
            sprhgb2 = sprjkc.cfr_renamed_1216(arg0);
            sprlkc2 = this;
        } else if (arg0 instanceof sprvc) {
            sprhgb2 = sprphc.cfr_renamed_1216(arg0);
            sprlkc2 = this;
        } else {
            try {
                byte[] byArray = arg0.getEncoded();
                arg0 = sprbrb.cfr_renamed_1255(sprdce.cfr_renamed_23(byArray));
                if (!(arg0 instanceof sprvb)) {
                    throw new InvalidKeyException(sprujha.cfr_renamed_9("2w?1%6#s2y6x8e46:s(6%o!sq\u007f?6\u0015E\u001063w\"s56\"\u007f6x4d"));
                }
                sprhgb2 = sprjkc.cfr_renamed_1216(arg0);
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprraja.cfr_renamed_9("2O?\t%\u000e#K2A6@8]4\u000e:K(\u000e%W!KqG?\u000e\u0015}\u0010\u000e3O\"K5\u000e\"G6@4\\"));
            }
            sprlkc2 = this;
        }
        sprlkc2.cfr_renamed_4.cfr_renamed_41();
        this.cfr_renamed_2.cfr_renamed_1217(false, sprhgb2);
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }
}

