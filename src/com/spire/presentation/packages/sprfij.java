/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprekj;
import com.spire.presentation.packages.sprexo;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprghk;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprncl;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprtmha;
import com.spire.presentation.packages.sprvhm;
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

public class sprfij
extends SignatureSpi
implements sprdl,
sprhl {
    private int cfr_renamed_1;
    private sprgf cfr_renamed_2;
    private int cfr_renamed_3;
    private sprjp cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprmuk sprmuk2;
        sprmuk sprmuk3;
        if (arg0 instanceof sprxz) {
            sprmuk2 = sprmuk3 = (sprmuk)sprfij.cfr_renamed_1216(arg0);
        } else {
            try {
                byte[] byArray = arg0.getEncoded();
                arg0 = sprsci.cfr_renamed_5726(sprvhm.cfr_renamed_23(byArray));
                sprmuk2 = sprmuk3 = (sprmuk)sprqpj.cfr_renamed_1216(arg0);
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprtmha.cfr_renamed_9("M\u001c@\u0013A\t\u000e\u000fK\u001eA\u001a@\u0014]\u0018\u000e\u0016K\u0004\u000e\tW\rK]G\u0013\u000e8m:a.zP\u001cM\u001fO\u0003O\u001bK\u000e\u000eG\u001a@\u0018\\"));
            }
        }
        if (sprmuk2.cfr_renamed_284().cfr_renamed_1146().bitLength() > 256) {
            throw new InvalidKeyException(sprexo.cfr_renamed_9("\u000eC\u001c\u0006\nS\u0011\u0006\n@ET\u0004H\u0002CE@\nTEc&a*u1\u000bW\u0016T\u0014H\u0014P\u0010"));
        }
        sprfij sprfij2 = this;
        sprfij2.cfr_renamed_2.cfr_renamed_41();
        sprfij2.cfr_renamed_4.cfr_renamed_5535(false, sprmuk3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprfij sprfij2 = this;
        byte[] byArray = new byte[sprfij2.cfr_renamed_2.cfr_renamed_1218()];
        sprfij2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        try {
            sprfij sprfij3 = this;
            byte[] byArray2 = new byte[sprfij3.cfr_renamed_1];
            byte[] byArray3 = new byte[sprfij3.cfr_renamed_1];
            System.arraycopy(arg0, 0, byArray3, 0, this.cfr_renamed_1);
            System.arraycopy(arg0, this.cfr_renamed_1, byArray2, 0, this.cfr_renamed_1);
            BigInteger[] bigIntegerArray = new BigInteger[2];
            bigIntegerArray[0] = new BigInteger(1, byArray2);
            bigIntegerArray[1] = new BigInteger(1, byArray3);
            return this.cfr_renamed_4.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(sprtmha.cfr_renamed_9("K\u000f\\\u0012\\]J\u0018M\u0012J\u0014@\u001a\u000e\u000eG\u001a@\u001cZ\b\\\u0018\u000e\u001fW\tK\u000e\u0000"));
        }
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprexo.cfr_renamed_9("\u0000H\u0002O\u000bC6C\u0011v\u0004T\u0004K\u0000R\u0000TES\u000bU\u0010V\u0015I\u0017R\u0000B"));
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprtmha.cfr_renamed_9("\u0018@\u001aG\u0013K.K\t~\u001c\\\u001cC\u0018Z\u0018\\][\u0013]\b^\rA\u000fZ\u0018J"));
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprexo.cfr_renamed_9("\u0000H\u0002O\u000bC6C\u0011v\u0004T\u0004K\u0000R\u0000TES\u000bU\u0010V\u0015I\u0017R\u0000B"));
    }

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (!(arg0 instanceof sprzg)) {
            throw new InvalidKeyException(sprtmha.cfr_renamed_9("M\u001c@\u0013A\t\u000e\u000fK\u001eA\u001a@\u0014]\u0018\u000e\u0016K\u0004\u000e\tW\rK]G\u0013\u000e8m:a.zP\u001cM\u001fO\u0003O\u001bK\u000e\u000eG\u001a@\u0018\\"));
        }
        sprmuk sprmuk2 = (sprmuk)sprqpj.cfr_renamed_1220(arg0);
        if (sprmuk2.cfr_renamed_284().cfr_renamed_1146().bitLength() > 256) {
            throw new InvalidKeyException(sprexo.cfr_renamed_9("\u000eC\u001c\u0006\nS\u0011\u0006\n@ET\u0004H\u0002CE@\nTEc&a*u1\u000bW\u0016T\u0014H\u0014P\u0010"));
        }
        sprfij sprfij2 = this;
        sprfij2.cfr_renamed_2.cfr_renamed_41();
        if (sprfij2.appRandom != null) {
            this.cfr_renamed_4.cfr_renamed_5535(true, new sprbgk(sprmuk2, this.appRandom));
            return;
        }
        this.cfr_renamed_4.cfr_renamed_5535(true, sprmuk2);
    }

    @Override
    public byte[] engineSign() throws SignatureException {
        sprfij sprfij2 = this;
        byte[] byArray = new byte[sprfij2.cfr_renamed_2.cfr_renamed_1218()];
        sprfij2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        try {
            byte[] byArray2;
            sprfij sprfij3 = this;
            byte[] byArray3 = new byte[sprfij3.cfr_renamed_3];
            BigInteger[] bigIntegerArray = sprfij3.cfr_renamed_4.cfr_renamed_125(byArray);
            byte[] byArray4 = bigIntegerArray[0].toByteArray();
            byte[] byArray5 = bigIntegerArray[1].toByteArray();
            if (byArray5[0] != 0) {
                System.arraycopy(byArray5, 0, byArray3, this.cfr_renamed_1 - byArray5.length, byArray5.length);
                byArray2 = byArray4;
            } else {
                System.arraycopy(byArray5, 1, byArray3, this.cfr_renamed_1 - (byArray5.length - 1), byArray5.length - 1);
                byArray2 = byArray4;
            }
            if (byArray2[0] != 0) {
                System.arraycopy(byArray4, 0, byArray3, this.cfr_renamed_3 - byArray4.length, byArray4.length);
                return byArray3;
            }
            System.arraycopy(byArray4, 1, byArray3, this.cfr_renamed_3 - (byArray4.length - 1), byArray4.length - 1);
            return byArray3;
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    public sprfij() {
        sprfij sprfij2 = this;
        sprfij sprfij3 = this;
        sprfij2.cfr_renamed_3 = 64;
        sprfij2.cfr_renamed_1 = sprfij3.cfr_renamed_3 / 2;
        sprfij sprfij4 = this;
        sprfij2.cfr_renamed_2 = new sprncl();
        sprfij2.cfr_renamed_4 = new sprghk();
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprekj) {
            return ((sprekj)arg0).cfr_renamed_9389();
        }
        return sprqpj.cfr_renamed_1216(arg0);
    }
}

