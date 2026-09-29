/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprekj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprghk;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprizda;
import com.spire.presentation.packages.sprjp;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprnjp;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.spruhl;
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

public class sprqlj
extends SignatureSpi
implements sprdl,
sprhl {
    private sprjp cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private sprgf cfr_renamed_4;

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprizda.cfr_renamed_9("g.e)l%Q%v\u0010c2c-g4g2\"5l3w0r/p4g$"));
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprnjp.cfr_renamed_9("5A7F>J\u0003J$\u007f1]1B5[5]pZ>\\%_ @\"[5K"));
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprizda.cfr_renamed_9("g.e)l%Q%v\u0010c2c-g4g2\"5l3w0r/p4g$"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprqlj sprqlj2 = this;
        byte[] byArray = new byte[sprqlj2.cfr_renamed_4.cfr_renamed_1218()];
        sprqlj2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            sprqlj sprqlj3 = this;
            byte[] byArray2 = new byte[sprqlj3.cfr_renamed_3];
            byte[] byArray3 = new byte[sprqlj3.cfr_renamed_3];
            System.arraycopy(arg0, 0, byArray3, 0, this.cfr_renamed_3);
            System.arraycopy(arg0, this.cfr_renamed_3, byArray2, 0, this.cfr_renamed_3);
            BigInteger[] bigIntegerArray = new BigInteger[2];
            bigIntegerArray[0] = new BigInteger(1, byArray2);
            bigIntegerArray[1] = new BigInteger(1, byArray3);
            return this.cfr_renamed_1.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(sprnjp.cfr_renamed_9("J\"]?]pK5L?K9A7\u000f#F7A1[%]5\u000f2V$J#\u0001"));
        }
    }

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override
    public byte[] engineSign() throws SignatureException {
        sprqlj sprqlj2 = this;
        byte[] byArray = new byte[sprqlj2.cfr_renamed_4.cfr_renamed_1218()];
        sprqlj2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            byte[] byArray2;
            sprqlj sprqlj3 = this;
            byte[] byArray3 = new byte[sprqlj3.cfr_renamed_2];
            BigInteger[] bigIntegerArray = sprqlj3.cfr_renamed_1.cfr_renamed_125(byArray);
            byte[] byArray4 = bigIntegerArray[0].toByteArray();
            byte[] byArray5 = bigIntegerArray[1].toByteArray();
            if (byArray5[0] != 0) {
                System.arraycopy(byArray5, 0, byArray3, this.cfr_renamed_3 - byArray5.length, byArray5.length);
                byArray2 = byArray4;
            } else {
                System.arraycopy(byArray5, 1, byArray3, this.cfr_renamed_3 - (byArray5.length - 1), byArray5.length - 1);
                byArray2 = byArray4;
            }
            if (byArray2[0] != 0) {
                System.arraycopy(byArray4, 0, byArray3, this.cfr_renamed_2 - byArray4.length, byArray4.length);
                return byArray3;
            }
            System.arraycopy(byArray4, 1, byArray3, this.cfr_renamed_2 - (byArray4.length - 1), byArray4.length - 1);
            return byArray3;
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    public sprqlj() {
        sprqlj sprqlj2 = this;
        sprqlj2.cfr_renamed_2 = 128;
        sprqlj2.cfr_renamed_3 = 64;
        sprqlj sprqlj3 = this;
        sprqlj2.cfr_renamed_4 = new spruhl();
        sprqlj3.cfr_renamed_1 = new sprghk();
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

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
            sprmuk2 = sprmuk3 = (sprmuk)sprqlj.cfr_renamed_1216(arg0);
        } else {
            try {
                byte[] byArray = arg0.getEncoded();
                arg0 = sprsci.cfr_renamed_5726(sprvhm.cfr_renamed_23(byArray));
                sprmuk2 = sprmuk3 = (sprmuk)sprqpj.cfr_renamed_1216(arg0);
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprizda.cfr_renamed_9("#c.l/v`p%a/e.k3g`i%{`v9r%\")l`G\u0003E\u000fQ\u0014/r2q0m7q0`q)e.g2"));
            }
        }
        if (sprmuk2.cfr_renamed_284().cfr_renamed_1146().bitLength() < 505) {
            throw new InvalidKeyException(sprnjp.cfr_renamed_9(";J)\u000f$@?\u000f'J1DpI?]pj\u0013h\u001f|\u0004\u0002b\u001fa\u001d}\u001aa\u001d"));
        }
        sprqlj sprqlj2 = this;
        sprqlj2.cfr_renamed_4.cfr_renamed_41();
        sprqlj2.cfr_renamed_1.cfr_renamed_5535(false, sprmuk3);
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        if (!(arg0 instanceof sprzg)) {
            throw new InvalidKeyException(sprizda.cfr_renamed_9("#c.l/v`p%a/e.k3g`i%{`v9r%\")l`G\u0003E\u000fQ\u0014/r2q0m7q0`q)e.g2"));
        }
        sprmuk sprmuk2 = (sprmuk)sprqpj.cfr_renamed_1220(arg0);
        if (sprmuk2.cfr_renamed_284().cfr_renamed_1146().bitLength() < 505) {
            throw new InvalidKeyException(sprnjp.cfr_renamed_9(";J)\u000f$@?\u000f'J1DpI?]pj\u0013h\u001f|\u0004\u0002b\u001fa\u001d}\u001aa\u001d"));
        }
        sprqlj sprqlj2 = this;
        sprqlj2.cfr_renamed_4.cfr_renamed_41();
        if (sprqlj2.appRandom != null) {
            this.cfr_renamed_1.cfr_renamed_5535(true, new sprbgk(sprmuk2, this.appRandom));
            return;
        }
        this.cfr_renamed_1.cfr_renamed_5535(true, sprmuk2);
    }

    public static spryye cfr_renamed_1216(PublicKey arg0) throws InvalidKeyException {
        if (arg0 instanceof sprekj) {
            return ((sprekj)arg0).cfr_renamed_9389();
        }
        return sprqpj.cfr_renamed_1216(arg0);
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }
}

