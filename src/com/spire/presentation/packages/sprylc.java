/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprisc;
import com.spire.presentation.packages.sprlbe;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprnic;
import com.spire.presentation.packages.sprnuia;
import com.spire.presentation.packages.sprtcz;
import com.spire.presentation.packages.sprume;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

public class sprylc
extends sprnic
implements RSAPrivateCrtKey {
    private BigInteger cfr_renamed_112;
    private BigInteger cfr_renamed_119;
    private BigInteger cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    public static final long cfr_renamed_2487 = 7834723820638524718L;
    private BigInteger cfr_renamed_2488;

    @Override
    public BigInteger getPublicExponent() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprylc(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        void arg0;
        sprylc sprylc2 = this;
        void v1 = arg0;
        sprylc sprylc3 = this;
        void v3 = arg0;
        sprylc sprylc4 = this;
        sprylc4.cfr_renamed_2 = arg0.getModulus();
        sprylc4.cfr_renamed_112 = arg0.getPublicExponent();
        this.cfr_renamed_3 = v3.getPrivateExponent();
        sprylc3.cfr_renamed_1 = v3.getPrimeP();
        sprylc3.cfr_renamed_0 = arg0.getPrimeQ();
        this.cfr_renamed_119 = v1.getPrimeExponentP();
        sprylc2.cfr_renamed_91 = v1.getPrimeExponentQ();
        sprylc2.cfr_renamed_2488 = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    @Override
    public BigInteger getCrtCoefficient() {
        return this.cfr_renamed_2488;
    }

    /*
     * WARNING - void declaration
     */
    public sprylc(sprlbe sprlbe2) {
        void arg0;
        sprylc sprylc2 = this;
        void v1 = arg0;
        sprylc sprylc3 = this;
        void v3 = arg0;
        sprylc sprylc4 = this;
        sprylc4.cfr_renamed_2 = arg0.cfr_renamed_2295();
        sprylc4.cfr_renamed_112 = arg0.cfr_renamed_2296();
        this.cfr_renamed_3 = v3.cfr_renamed_2299();
        sprylc3.cfr_renamed_1 = v3.cfr_renamed_2300();
        sprylc3.cfr_renamed_0 = arg0.cfr_renamed_2301();
        this.cfr_renamed_119 = v1.cfr_renamed_2302();
        sprylc2.cfr_renamed_91 = v1.cfr_renamed_2303();
        sprylc2.cfr_renamed_2488 = sprlbe2.cfr_renamed_2304();
    }

    /*
     * WARNING - void declaration
     */
    public sprylc(sprisc sprisc2) {
        void arg0;
        sprylc sprylc2 = this;
        void v1 = arg0;
        sprylc sprylc3 = this;
        void v3 = arg0;
        super((sprmtc)arg0);
        this.cfr_renamed_112 = v3.cfr_renamed_2296();
        sprylc3.cfr_renamed_1 = v3.cfr_renamed_1155();
        sprylc3.cfr_renamed_0 = arg0.cfr_renamed_1604();
        this.cfr_renamed_119 = v1.cfr_renamed_2305();
        sprylc2.cfr_renamed_91 = v1.cfr_renamed_2306();
        sprylc2.cfr_renamed_2488 = sprisc2.cfr_renamed_1148();
    }

    @Override
    public String getFormat() {
        return sprnuia.cfr_renamed_9("G|Td4\u000f");
    }

    @Override
    public BigInteger getPrimeP() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprylc(RSAPrivateCrtKey rSAPrivateCrtKey) {
        void arg0;
        sprylc sprylc2 = this;
        void v1 = arg0;
        sprylc sprylc3 = this;
        void v3 = arg0;
        sprylc sprylc4 = this;
        sprylc4.cfr_renamed_2 = arg0.getModulus();
        sprylc4.cfr_renamed_112 = arg0.getPublicExponent();
        this.cfr_renamed_3 = v3.getPrivateExponent();
        sprylc3.cfr_renamed_1 = v3.getPrimeP();
        sprylc3.cfr_renamed_0 = arg0.getPrimeQ();
        this.cfr_renamed_119 = v1.getPrimeExponentP();
        sprylc2.cfr_renamed_91 = v1.getPrimeExponentQ();
        sprylc2.cfr_renamed_2488 = rSAPrivateCrtKey.getCrtCoefficient();
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof RSAPrivateCrtKey)) {
            return false;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey)arg0;
        return this.getModulus().equals(rSAPrivateCrtKey.getModulus()) && this.getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent()) && this.getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && this.getPrimeP().equals(rSAPrivateCrtKey.getPrimeP()) && this.getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ()) && this.getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && this.getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && this.getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient());
    }

    @Override
    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPublicExponent().hashCode() ^ this.getPrivateExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprtcz.cfr_renamed_9(":~8rxd3g7e7c9e"));
        StringBuffer stringBuffer2 = stringBuffer.append(sprnuia.cfr_renamed_9("eDv7ge^aVcR7tEc7|rN")).append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprtcz.cfr_renamed_9("7v7v7v7v7v7vz9s#{#dl7")).append(this.getModulus().toString(16)).append(string);
        stringBuffer3.append(sprnuia.cfr_renamed_9("\u00177\u00177GbU{^t\u0017rOgXyRyC-\u0017")).append(this.getPublicExponent().toString(16)).append(string);
        stringBuffer.append(sprtcz.cfr_renamed_9("7v7&e?a7c373o&x8r8cl7")).append(this.getPrivateExponent().toString(16)).append(string);
        stringBuffer.append(sprnuia.cfr_renamed_9("\u00177\u00177\u00177\u00177\u00177\u00177\u0017gE~Zrg-\u0017")).append(this.getPrimeP().toString(16)).append(string);
        stringBuffer.append(sprtcz.cfr_renamed_9("7v7v7v7v7v7v7&e?z3Fl7")).append(this.getPrimeQ().toString(16)).append(string);
        stringBuffer.append(sprnuia.cfr_renamed_9("\u00177\u00177\u0017gE~ZrroGxYrYcg-\u0017")).append(this.getPrimeExponentP().toString(16)).append(string);
        stringBuffer.append(sprtcz.cfr_renamed_9("7v7v7&e?z3R.g9y3y\"Fl7")).append(this.getPrimeExponentQ().toString(16)).append(string);
        stringBuffer.append(sprnuia.cfr_renamed_9("\u00177\u00177\u0017tEctxRqQ~T~RyC-\u0017")).append(this.getCrtCoefficient().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    @Override
    public BigInteger getPrimeExponentP() {
        return this.cfr_renamed_119;
    }

    public sprylc(sprmke arg0) throws IOException {
        this(sprlbe.cfr_renamed_23(arg0.cfr_renamed_1229()));
    }

    @Override
    public BigInteger getPrimeQ() {
        return this.cfr_renamed_0;
    }

    @Override
    public byte[] getEncoded() {
        return sprdqc.cfr_renamed_1189(new sprije(sprm.cfr_renamed_1510, sprume.cfr_renamed_3), new sprlbe(this.getModulus(), this.getPublicExponent(), this.getPrivateExponent(), this.getPrimeP(), this.getPrimeQ(), this.getPrimeExponentP(), this.getPrimeExponentQ(), this.getCrtCoefficient()));
    }

    @Override
    public BigInteger getPrimeExponentQ() {
        return this.cfr_renamed_91;
    }
}

