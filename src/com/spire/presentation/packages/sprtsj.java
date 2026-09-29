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
import com.spire.presentation.packages.sprghk;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprloja;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprxlj;
import com.spire.presentation.packages.sprxz;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzg;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class sprtsj
extends SignatureSpi
implements sprdl,
sprhl {
    private sprgf cfr_renamed_3;
    private sprjp cfr_renamed_4;

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprxlj) {
            return ((sprxlj)arg0).cfr_renamed_9389();
        }
        return sprqpj.cfr_renamed_1216(arg0);
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprloja.cfr_renamed_9("[8Y?P3m3J\u0006_$_;[\"[$\u001e#P%K&N9L\"[2"));
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprtsj sprtsj2;
        spryye spryye2;
        if (arg0 instanceof sprzg) {
            spryye2 = sprqpj.cfr_renamed_1220(arg0);
            sprtsj2 = this;
        } else {
            spryye2 = sprepj.cfr_renamed_1220(arg0);
            sprtsj2 = this;
        }
        sprtsj2.cfr_renamed_3.cfr_renamed_41();
        if (this.appRandom != null) {
            this.cfr_renamed_4.cfr_renamed_5535(true, new sprbgk(spryye2, this.appRandom));
            return;
        }
        this.cfr_renamed_4.cfr_renamed_5535(true, spryye2);
    }

    public sprtsj() {
        sprtsj sprtsj2 = this;
        this.cfr_renamed_3 = new sprcil();
        sprtsj2.cfr_renamed_4 = new sprghk();
    }

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprvqo.cfr_renamed_9("4\u00196\u001e?\u0012\u0002\u0012%'0\u00050\u001a4\u00034\u0005q\u0002?\u0004$\u0007!\u0018#\u00034\u0013"));
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprtsj sprtsj2;
        spryye spryye2;
        if (arg0 instanceof sprxz) {
            spryye2 = sprtsj.cfr_renamed_1216(arg0);
            sprtsj2 = this;
        } else if (arg0 instanceof sprbq) {
            spryye2 = sprepj.cfr_renamed_1216(arg0);
            sprtsj2 = this;
        } else {
            try {
                byte[] byArray = arg0.getEncoded();
                arg0 = sprsci.cfr_renamed_5726(sprvhm.cfr_renamed_23(byArray));
                spryye2 = sprqpj.cfr_renamed_1216(arg0);
                sprtsj2 = this;
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprloja.cfr_renamed_9("]7PqJvL3]9Y8W%[vU3GvJ/N3\u001e?Pvz\u0005\u007fv\\7M3ZvM?Y8[$"));
            }
        }
        sprtsj2.cfr_renamed_3.cfr_renamed_41();
        this.cfr_renamed_4.cfr_renamed_5535(false, spryye2);
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public byte[] engineSign() throws SignatureException {
        sprtsj sprtsj2 = this;
        byte[] byArray = new byte[sprtsj2.cfr_renamed_3.cfr_renamed_1218()];
        sprtsj2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
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
        sprtsj sprtsj2 = this;
        byte[] byArray = new byte[sprtsj2.cfr_renamed_3.cfr_renamed_1218()];
        sprtsj2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
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
            throw new SignatureException(sprvqo.cfr_renamed_9("\u0012#\u0005>\u0005q\u00134\u0014>\u00138\u00196W\"\u001e6\u00190\u0003$\u00054W3\u000e%\u0012\"Y"));
        }
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprloja.cfr_renamed_9("[8Y?P3m3J\u0006_$_;[\"[$\u001e#P%K&N9L\"[2"));
    }
}

