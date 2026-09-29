/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbq;
import com.spire.presentation.packages.sprcil;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprepj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.spridc;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprsap;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxz;
import com.spire.presentation.packages.spryek;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzg;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class sprcsj
extends SignatureSpi
implements sprdl,
sprhl {
    private sprgf cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprjp cfr_renamed_4;

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(spridc.cfr_renamed_9(",D.C'O\u001aO=z(X(G,^,Xi_'Y<Z9E;^,N"));
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    @Override
    public byte[] engineSign() throws SignatureException {
        sprcsj sprcsj2 = this;
        byte[] byArray = new byte[sprcsj2.cfr_renamed_2.cfr_renamed_1218()];
        sprcsj2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        try {
            byte[] byArray2;
            byte[] byArray3 = new byte[64];
            BigInteger[] bigIntegerArray = this.cfr_renamed_4.cfr_renamed_125(byArray);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprcsj sprcsj2 = this;
        byte[] byArray = new byte[sprcsj2.cfr_renamed_2.cfr_renamed_1218()];
        sprcsj2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        try {
            byte[] byArray2 = new byte[32];
            byte[] byArray3 = new byte[32];
            System.arraycopy(arg0, 0, byArray3, 0, 32);
            System.arraycopy(arg0, 32, byArray2, 0, 32);
            BigInteger[] bigIntegerArray = new BigInteger[2];
            bigIntegerArray[0] = new BigInteger(1, byArray2);
            bigIntegerArray[1] = new BigInteger(1, byArray3);
            return this.cfr_renamed_4.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(sprsap.cfr_renamed_9("Y[NFN\tXL_FX@RN\u001cZUNRHH\\NL\u001cKE]YZ\u0012"));
        }
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
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(spridc.cfr_renamed_9(",D.C'O\u001aO=z(X(G,^,Xi_'Y<Z9E;^,N"));
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprcsj sprcsj2;
        spryye spryye2;
        if (arg0 instanceof sprzg) {
            spryye2 = sprqpj.cfr_renamed_1220(arg0);
            sprcsj2 = this;
        } else {
            spryye2 = sprepj.cfr_renamed_1220(arg0);
            sprcsj2 = this;
        }
        sprcsj2.cfr_renamed_2.cfr_renamed_41();
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_4.cfr_renamed_5535(true, new sprbgk(spryye2, this.cfr_renamed_3));
            return;
        }
        this.cfr_renamed_4.cfr_renamed_5535(true, spryye2);
    }

    public sprcsj() {
        sprcsj sprcsj2 = this;
        this.cfr_renamed_2 = new sprcil();
        sprcsj2.cfr_renamed_4 = new spryek();
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprsap.cfr_renamed_9("LRNUGYzY]lHNHQLHLN\tIGO\\LYS[HLX"));
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprcsj sprcsj2;
        spryye spryye2;
        if (arg0 instanceof sprxz) {
            spryye2 = sprqpj.cfr_renamed_1216(arg0);
            sprcsj2 = this;
        } else if (arg0 instanceof sprbq) {
            spryye2 = sprepj.cfr_renamed_1216(arg0);
            sprcsj2 = this;
        } else {
            try {
                byte[] byArray = arg0.getEncoded();
                arg0 = sprsci.cfr_renamed_5726(sprvhm.cfr_renamed_23(byArray));
                if (!(arg0 instanceof sprxz)) {
                    throw new InvalidKeyException(spridc.cfr_renamed_9("*K'\r=\n;O*E.D Y,\n\"O0\n=S9OiC'\n\ry\b\n+K:O-\n:C.D,X"));
                }
                spryye2 = sprqpj.cfr_renamed_1216(arg0);
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprsap.cfr_renamed_9("J]G\u001b]\u001c[YJSNR@OL\u001cBYP\u001c]EYY\tUG\u001cmoh\u001cK]ZYM\u001cZUNRLN"));
            }
            sprcsj2 = this;
        }
        sprcsj2.cfr_renamed_2.cfr_renamed_41();
        this.cfr_renamed_4.cfr_renamed_5535(false, spryye2);
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }
}

