/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfvm;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.spruua;
import com.spire.presentation.packages.spruwf;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

public class sprtqh
implements RSAPublicKey {
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    public static final long cfr_renamed_4 = 2675817738516720772L;

    @Override
    public String getFormat() {
        return spruua.cfr_renamed_9("Kg&y*");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer.append(spruwf.cfr_renamed_9("}\u001fnl\u007f9M F/\u000f\u0007J5")).append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(spruua.cfr_renamed_9("3i3i3i3i3i3i~&w<\u007f<`s3")).append(this.getModulus().toString(16)).append(string);
        stringBuffer3.append(spruwf.cfr_renamed_9("l\u000fl\u000f<Z.C%LlJ4_#A)A8\u0015l")).append(this.getPublicExponent().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    @Override
    public BigInteger getModulus() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprtqh(RSAPublicKey rSAPublicKey) {
        void arg0;
        sprtqh sprtqh2 = this;
        sprtqh2.cfr_renamed_3 = arg0.getModulus();
        sprtqh2.cfr_renamed_2 = rSAPublicKey.getPublicExponent();
    }

    @Override
    public byte[] getEncoded() {
        return sprjij.cfr_renamed_5679(new sprddm(sprdl.cfr_renamed_1205, sprpen.cfr_renamed_4), new sprfvm(this.getModulus(), this.getPublicExponent()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtqh(sprvhm arg0) {
        try {
            sprfvm sprfvm2 = sprfvm.cfr_renamed_23(arg0.cfr_renamed_1227());
            sprtqh sprtqh2 = this;
            sprtqh2.cfr_renamed_3 = sprfvm2.cfr_renamed_2295();
            sprtqh2.cfr_renamed_2 = sprfvm2.cfr_renamed_2296();
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(spruua.cfr_renamed_9(" }?r%z-3 }/|i`=a<p=f;viz'3\u001b@\b39f+\u007f pix,j"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprtqh(RSAPublicKeySpec rSAPublicKeySpec) {
        void arg0;
        sprtqh sprtqh2 = this;
        sprtqh2.cfr_renamed_3 = arg0.getModulus();
        sprtqh2.cfr_renamed_2 = rSAPublicKeySpec.getPublicExponent();
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

    @Override
    public String getAlgorithm() {
        return "RSA";
    }

    /*
     * WARNING - void declaration
     */
    public sprtqh(sprkik sprkik2) {
        void arg0;
        sprtqh sprtqh2 = this;
        sprtqh2.cfr_renamed_3 = arg0.cfr_renamed_2295();
        sprtqh2.cfr_renamed_2 = sprkik2.cfr_renamed_360();
    }

    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPublicExponent().hashCode();
    }

    @Override
    public BigInteger getPublicExponent() {
        return this.cfr_renamed_2;
    }
}

