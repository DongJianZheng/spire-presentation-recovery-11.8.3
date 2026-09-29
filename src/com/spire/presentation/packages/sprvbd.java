/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprgnz;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtbd;
import com.spire.presentation.packages.sprtzc;
import com.spire.presentation.packages.spruj;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryvi;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.DSAKey;
import java.security.spec.AlgorithmParameterSpec;

public class sprvbd
extends SignatureSpi
implements sprm,
sprs {
    private spruj cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprlc cfr_renamed_4;

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    private /* synthetic */ BigInteger[] cfr_renamed_2515(byte[] arg0) throws IOException {
        sprbne sprbne2 = (sprbne)sprvva.cfr_renamed_184(arg0);
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = ((sprooe)sprbne2.cfr_renamed_85(0)).cfr_renamed_97();
        bigIntegerArray[1] = ((sprooe)sprbne2.cfr_renamed_85(1)).cfr_renamed_97();
        return bigIntegerArray;
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprvbd sprvbd2;
        sprhgb sprhgb2;
        if (arg0 instanceof DSAKey) {
            sprhgb2 = sprtbd.cfr_renamed_1216(arg0);
            sprvbd2 = this;
        } else {
            try {
                byte[] byArray = arg0.getEncoded();
                arg0 = new sprtzc(sprdce.cfr_renamed_23(byArray));
                if (!(arg0 instanceof DSAKey)) {
                    throw new InvalidKeyException(spryvi.cfr_renamed_9("G<JzP}V8G2C3M.A}O8]}P$T8\u00044J}`\u000ee}F<W8@}W4C3A/"));
                }
                sprhgb2 = sprtbd.cfr_renamed_1216(arg0);
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprgnz.cfr_renamed_9("\u0019\u001d\u0014[\u000e\\\b\u0019\u0019\u0013\u001d\u0012\u0013\u000f\u001f\\\u0011\u0019\u0003\\\u000e\u0005\n\u0019Z\u0015\u0014\\>/;\\\u0018\u001d\t\u0019\u001e\\\t\u0015\u001d\u0012\u001f\u000e"));
            }
            sprvbd2 = this;
        }
        sprvbd2.cfr_renamed_4.cfr_renamed_41();
        this.cfr_renamed_2.cfr_renamed_1217(false, sprhgb2);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(spryvi.cfr_renamed_9("A3C4J8w8P\rE/E0A)A/\u0004(J.Q-T2V)A9"));
    }

    /*
     * WARNING - void declaration
     */
    public sprvbd(sprlc sprlc2, spruj spruj2) {
        void arg0;
        sprvbd sprvbd2 = this;
        sprvbd2.cfr_renamed_4 = arg0;
        sprvbd2.cfr_renamed_2 = spruj2;
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprgnz.cfr_renamed_9("\u001f\u0012\u001d\u0015\u0014\u0019)\u0019\u000e,\u001b\u000e\u001b\u0011\u001f\b\u001f\u000eZ\t\u0014\u000f\u000f\f\n\u0013\b\b\u001f\u0018"));
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprt sprt2 = sprtbd.cfr_renamed_1220(arg0);
        if (this.cfr_renamed_3 != null) {
            sprt2 = new spraed(sprt2, this.cfr_renamed_3);
        }
        sprvbd sprvbd2 = this;
        sprvbd2.cfr_renamed_4.cfr_renamed_41();
        sprvbd2.cfr_renamed_2.cfr_renamed_1217(true, sprt2);
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(spryvi.cfr_renamed_9("A3C4J8w8P\rE/E0A)A/\u0004(J.Q-T2V)A9"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprvbd sprvbd2 = this;
        byte[] byArray = new byte[sprvbd2.cfr_renamed_4.cfr_renamed_1218()];
        sprvbd2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            BigInteger[] bigIntegerArray = this.cfr_renamed_2515(arg0);
            return this.cfr_renamed_2.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(sprgnz.cfr_renamed_9("\u0019\b\u000e\u0015\u000eZ\u0018\u001f\u001f\u0015\u0018\u0013\u0012\u001d\\\t\u0015\u001d\u0012\u001b\b\u000f\u000e\u001f\\\u0018\u0005\u000e\u0019\tR"));
        }
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
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

    private /* synthetic */ byte[] cfr_renamed_2516(BigInteger arg0, BigInteger arg1) throws IOException {
        spra[] spraArray = new sprooe[2];
        spraArray[0] = new sprooe(arg0);
        spraArray[1] = new sprooe(arg1);
        spra[] spraArray2 = spraArray;
        return new sprpse(spraArray2).cfr_renamed_104("DER");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprvbd sprvbd2 = this;
        byte[] byArray = new byte[sprvbd2.cfr_renamed_4.cfr_renamed_1218()];
        sprvbd2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            sprvbd sprvbd3 = this;
            BigInteger[] bigIntegerArray = sprvbd3.cfr_renamed_2.cfr_renamed_125(byArray);
            return sprvbd3.cfr_renamed_2516(bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }
}

