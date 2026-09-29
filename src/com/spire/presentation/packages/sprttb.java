/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprqwg;
import com.spire.presentation.packages.sprssa;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprzae;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

public class sprttb
implements RSAPublicKey {
    private BigInteger cfr_renamed_2;
    public static final long cfr_renamed_3 = 2675817738516720772L;
    private BigInteger cfr_renamed_4;

    @Override
    public String getFormat() {
        return sprssa.cfr_renamed_9("\u0018tujy");
    }

    @Override
    public BigInteger getModulus() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprttb(sprdce arg0) {
        try {
            sprzae sprzae2 = new sprzae((sprbne)arg0.cfr_renamed_1227());
            sprttb sprttb2 = this;
            sprttb2.cfr_renamed_4 = sprzae2.cfr_renamed_2295();
            sprttb2.cfr_renamed_2 = sprzae2.cfr_renamed_2296();
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprqwg.cfr_renamed_9("{9d6~>vw{9t82$f%g4f\"`22>|w@\u0004Swb\"p;{42<w."));
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprssa.cfr_renamed_9("6)4%t3?0;2;452"));
        StringBuffer stringBuffer2 = stringBuffer.append(sprqwg.cfr_renamed_9("@\u0004SwB\"p;{42\u001cw.")).append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprssa.cfr_renamed_9("`z`z`z`z`z`z-5$/,/3``")).append(this.getModulus().toString(16)).append(string);
        stringBuffer3.append(sprqwg.cfr_renamed_9("w2w2'g5~>qww/b8|2|#(w")).append(this.getPublicExponent().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprttb(RSAPublicKeySpec rSAPublicKeySpec) {
        void arg0;
        sprttb sprttb2 = this;
        sprttb2.cfr_renamed_4 = arg0.getModulus();
        sprttb2.cfr_renamed_2 = rSAPublicKeySpec.getPublicExponent();
    }

    @Override
    public BigInteger getPublicExponent() {
        return this.cfr_renamed_2;
    }

    @Override
    public byte[] getEncoded() {
        return sprdqc.cfr_renamed_1187(new sprije(sprm.cfr_renamed_1510, sprume.cfr_renamed_3), new sprzae(this.getModulus(), this.getPublicExponent()));
    }

    @Override
    public String getAlgorithm() {
        return "RSA";
    }

    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPublicExponent().hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprttb(sprmtc sprmtc2) {
        void arg0;
        sprttb sprttb2 = this;
        sprttb2.cfr_renamed_4 = arg0.cfr_renamed_2295();
        sprttb2.cfr_renamed_2 = sprmtc2.cfr_renamed_360();
    }

    /*
     * WARNING - void declaration
     */
    public sprttb(RSAPublicKey rSAPublicKey) {
        void arg0;
        sprttb sprttb2 = this;
        sprttb2.cfr_renamed_4 = arg0.getModulus();
        sprttb2.cfr_renamed_2 = rSAPublicKey.getPublicExponent();
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey)arg0;
        return this.getModulus().equals(rSAPublicKey.getModulus()) && this.getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }
}

