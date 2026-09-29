/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprawba;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlbe;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprwb;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;

public class sprnic
implements RSAPrivateKey,
sprwb {
    private transient sprooc cfr_renamed_0;
    private static BigInteger cfr_renamed_1 = BigInteger.valueOf(0L);
    public BigInteger cfr_renamed_2;
    public BigInteger cfr_renamed_3;
    public static final long cfr_renamed_4 = 5110188922551353628L;

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_0.cfr_renamed_1510(arg0);
    }

    @Override
    public byte[] getEncoded() {
        return sprdqc.cfr_renamed_1189(new sprije(sprm.cfr_renamed_1510, sprume.cfr_renamed_3), new sprlbe(this.getModulus(), cfr_renamed_1, this.getPrivateExponent(), cfr_renamed_1, cfr_renamed_1, cfr_renamed_1, cfr_renamed_1, cfr_renamed_1));
    }

    public sprnic() {
        sprnic sprnic2 = this;
        sprnic2.cfr_renamed_0 = new sprooc();
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_0.cfr_renamed_2158();
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_0.cfr_renamed_2152(arg0, arg1);
    }

    @Override
    public String getAlgorithm() {
        return "RSA";
    }

    /*
     * WARNING - void declaration
     */
    public sprnic(sprlbe sprlbe2) {
        void arg0;
        sprnic sprnic2 = this;
        sprnic sprnic3 = this;
        sprnic3.cfr_renamed_0 = new sprooc();
        sprnic2.cfr_renamed_2 = arg0.cfr_renamed_2295();
        sprnic2.cfr_renamed_3 = sprlbe2.cfr_renamed_2299();
    }

    /*
     * WARNING - void declaration
     */
    public sprnic(RSAPrivateKey rSAPrivateKey) {
        void arg0;
        sprnic sprnic2 = this;
        sprnic sprnic3 = this;
        sprnic3.cfr_renamed_0 = new sprooc();
        sprnic2.cfr_renamed_2 = arg0.getModulus();
        sprnic2.cfr_renamed_3 = rSAPrivateKey.getPrivateExponent();
    }

    /*
     * WARNING - void declaration
     */
    public sprnic(RSAPrivateKeySpec rSAPrivateKeySpec) {
        void arg0;
        sprnic sprnic2 = this;
        sprnic sprnic3 = this;
        sprnic3.cfr_renamed_0 = new sprooc();
        sprnic2.cfr_renamed_2 = arg0.getModulus();
        sprnic2.cfr_renamed_3 = rSAPrivateKeySpec.getPrivateExponent();
    }

    @Override
    public String getFormat() {
        return sprawba.cfr_renamed_9("!*22RY");
    }

    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPrivateExponent().hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprnic(sprmtc sprmtc2) {
        void arg0;
        sprnic sprnic2 = this;
        sprnic sprnic3 = this;
        sprnic3.cfr_renamed_0 = new sprooc();
        sprnic2.cfr_renamed_2 = arg0.cfr_renamed_2295();
        sprnic2.cfr_renamed_3 = sprmtc2.cfr_renamed_360();
    }

    @Override
    public BigInteger getModulus() {
        return this.cfr_renamed_2;
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

    @Override
    public BigInteger getPrivateExponent() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprnic sprnic2 = this;
        sprnic2.cfr_renamed_0 = new sprooc();
    }

    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream arg0) throws IOException {
        arg0.defaultWriteObject();
    }
}

