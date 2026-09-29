/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraiaa;
import com.spire.presentation.packages.sprec;
import com.spire.presentation.packages.sprggk;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.spruj;
import java.math.BigInteger;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public abstract class sprjlc
extends SignatureSpi
implements sprm,
sprs {
    public spruj cfr_renamed_2;
    public sprec cfr_renamed_3;
    public sprlc cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjlc(sprlc sprlc2, spruj spruj2, sprec sprec2) {
        void arg1;
        void arg0;
        sprjlc sprjlc2 = this;
        this.cfr_renamed_4 = arg0;
        sprjlc2.cfr_renamed_2 = arg1;
        sprjlc2.cfr_renamed_3 = sprec2;
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprggk.cfr_renamed_9("?G=@4L\tL.y;[;D?]?[z\\4Z/Y*F(]?M"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprjlc sprjlc2 = this;
        byte[] byArray = new byte[sprjlc2.cfr_renamed_4.cfr_renamed_1218()];
        sprjlc2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            sprjlc sprjlc3 = this;
            BigInteger[] bigIntegerArray = sprjlc3.cfr_renamed_2.cfr_renamed_125(byArray);
            return sprjlc3.cfr_renamed_3.cfr_renamed_2473(bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(spraiaa.cfr_renamed_9("?+=,4 \t .\u0015;7;(?1?7z046/5**(1?!"));
    }

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprggk.cfr_renamed_9("?G=@4L\tL.y;[;D?]?[z\\4Z/Y*F(]?M"));
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
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprjlc sprjlc2 = this;
        byte[] byArray = new byte[sprjlc2.cfr_renamed_4.cfr_renamed_1218()];
        sprjlc2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        try {
            BigInteger[] bigIntegerArray = this.cfr_renamed_3.cfr_renamed_496(arg0);
            return this.cfr_renamed_2.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(spraiaa.cfr_renamed_9(" (757z!?&5!3+=e),=+;1/7?e8<. )k"));
        }
    }
}

