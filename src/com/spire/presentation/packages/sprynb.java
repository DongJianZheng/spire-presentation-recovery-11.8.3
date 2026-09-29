/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlbe;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruab;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprwb;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;

public class sprynb
implements RSAPrivateKey,
sprwb {
    private static BigInteger cfr_renamed_0 = BigInteger.valueOf(0L);
    private sprooc cfr_renamed_1;
    public BigInteger cfr_renamed_2;
    public static final long cfr_renamed_3 = 5110188922551353628L;
    public BigInteger cfr_renamed_4;

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_1.cfr_renamed_1510(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        sprynb sprynb2 = this;
        void v1 = arg0;
        v1.writeObject(this.cfr_renamed_4);
        sprynb2.cfr_renamed_1.cfr_renamed_2291((ObjectOutputStream)arg0);
        v1.writeObject(sprynb2.cfr_renamed_2);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_4 = (BigInteger)arg0.readObject();
        sprynb sprynb2 = this;
        this.cfr_renamed_1 = new sprooc();
        this.cfr_renamed_1.cfr_renamed_2290(arg0);
        this.cfr_renamed_2 = (BigInteger)arg0.readObject();
    }

    public sprynb() {
        sprynb sprynb2 = this;
        sprynb2.cfr_renamed_1 = new sprooc();
    }

    @Override
    public byte[] getEncoded() {
        return sprdqc.cfr_renamed_1189(new sprije(sprm.cfr_renamed_1510, sprume.cfr_renamed_3), new sprlbe(this.getModulus(), cfr_renamed_0, this.getPrivateExponent(), cfr_renamed_0, cfr_renamed_0, cfr_renamed_0, cfr_renamed_0, cfr_renamed_0));
    }

    /*
     * WARNING - void declaration
     */
    public sprynb(sprmtc sprmtc2) {
        void arg0;
        sprynb sprynb2 = this;
        sprynb sprynb3 = this;
        sprynb3.cfr_renamed_1 = new sprooc();
        sprynb2.cfr_renamed_4 = arg0.cfr_renamed_2295();
        sprynb2.cfr_renamed_2 = sprmtc2.cfr_renamed_360();
    }

    @Override
    public String getFormat() {
        return spruab.cfr_renamed_9("#B0ZP1");
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof RSAPrivateKey)) {
            return false;
        }
        if (arg0 == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey)arg0;
        return this.getModulus().equals(rSAPrivateKey.getModulus()) && this.getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    /*
     * WARNING - void declaration
     */
    public sprynb(RSAPrivateKeySpec rSAPrivateKeySpec) {
        void arg0;
        sprynb sprynb2 = this;
        sprynb sprynb3 = this;
        sprynb3.cfr_renamed_1 = new sprooc();
        sprynb2.cfr_renamed_4 = arg0.getModulus();
        sprynb2.cfr_renamed_2 = rSAPrivateKeySpec.getPrivateExponent();
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_1.cfr_renamed_2158();
    }

    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPrivateExponent().hashCode();
    }

    @Override
    public String getAlgorithm() {
        return "RSA";
    }

    @Override
    public BigInteger getPrivateExponent() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprynb(RSAPrivateKey rSAPrivateKey) {
        void arg0;
        sprynb sprynb2 = this;
        sprynb sprynb3 = this;
        sprynb3.cfr_renamed_1 = new sprooc();
        sprynb2.cfr_renamed_4 = arg0.getModulus();
        sprynb2.cfr_renamed_2 = rSAPrivateKey.getPrivateExponent();
    }

    @Override
    public BigInteger getModulus() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_1.cfr_renamed_2152(arg0, arg1);
    }
}

