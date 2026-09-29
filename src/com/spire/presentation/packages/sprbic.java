/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbjk;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjb;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprkzc;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprphc;
import com.spire.presentation.packages.sprrcba;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.spruj;
import com.spire.presentation.packages.sprvb;
import com.spire.presentation.packages.sprvc;
import com.spire.presentation.packages.sprzld;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class sprbic
extends SignatureSpi
implements sprm,
sprs {
    private sprlc cfr_renamed_3;
    private spruj cfr_renamed_4;

    public sprbic() {
        sprbic sprbic2 = this;
        this.cfr_renamed_3 = new sprzld();
        sprbic2.cfr_renamed_4 = new sprkzc();
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprbic sprbic2;
        sprhgb sprhgb2;
        if (arg0 instanceof sprjb) {
            sprhgb2 = sprjkc.cfr_renamed_1220(arg0);
            sprbic2 = this;
        } else {
            sprhgb2 = sprphc.cfr_renamed_1220(arg0);
            sprbic2 = this;
        }
        sprbic2.cfr_renamed_3.cfr_renamed_41();
        if (this.appRandom != null) {
            this.cfr_renamed_4.cfr_renamed_1217(true, new spraed(sprhgb2, this.appRandom));
            return;
        }
        this.cfr_renamed_4.cfr_renamed_1217(true, sprhgb2);
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprrcba.cfr_renamed_9("caafhjUjr_g}gbc{c}&zh|s\u007fv`t{ck"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprbic sprbic2 = this;
        byte[] byArray = new byte[sprbic2.cfr_renamed_3.cfr_renamed_1218()];
        sprbic2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
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
            throw new SignatureException(sprbjk.cfr_renamed_9("V.A3A|W9P3W5];\u0013/Z;]=G)A9\u0013>J(V/\u001d"));
        }
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprbic sprbic2;
        sprhgb sprhgb2;
        if (arg0 instanceof sprvb) {
            sprhgb2 = sprjkc.cfr_renamed_1216(arg0);
            sprbic2 = this;
        } else if (arg0 instanceof sprvc) {
            sprhgb2 = sprphc.cfr_renamed_1216(arg0);
            sprbic2 = this;
        } else {
            try {
                byte[] byArray = arg0.getEncoded();
                arg0 = sprbrb.cfr_renamed_1255(sprdce.cfr_renamed_23(byArray));
                if (!(arg0 instanceof sprvb)) {
                    throw new InvalidKeyException(sprrcba.cfr_renamed_9("enh(r/tje`aao|c/mj\u007f/rvvj&fh/B\\G/dnujb/ufaac}"));
                }
                sprhgb2 = sprjkc.cfr_renamed_1216(arg0);
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprbjk.cfr_renamed_9("?R2\u0014(\u0013.V?\\;]5@9\u00137V%\u0013(J,V|Z2\u0013\u0018`\u001d\u0013>R/V8\u0013/Z;]9A"));
            }
            sprbic2 = this;
        }
        sprbic2.cfr_renamed_3.cfr_renamed_41();
        this.cfr_renamed_4.cfr_renamed_1217(false, sprhgb2);
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprrcba.cfr_renamed_9("caafhjUjr_g}gbc{c}&zh|s\u007fv`t{ck"));
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    @Override
    public byte[] engineSign() throws SignatureException {
        sprbic sprbic2 = this;
        byte[] byArray = new byte[sprbic2.cfr_renamed_3.cfr_renamed_1218()];
        sprbic2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
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

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprbjk.cfr_renamed_9("9];Z2V\u000fV(c=A=^9G9A|F2@)C,\\.G9W"));
    }
}

