/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbho;
import com.spire.presentation.packages.sprbjj;
import com.spire.presentation.packages.sprcoj;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprctm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgij;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnuc;
import com.spire.presentation.packages.sprtlj;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

public class sprlnj
extends sprcoj
implements RSAPrivateCrtKey {
    private BigInteger cfr_renamed_112;
    private BigInteger cfr_renamed_119;
    public static final long cfr_renamed_9406 = 7834723820638524718L;
    private BigInteger cfr_renamed_91;
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_9407;
    private BigInteger cfr_renamed_3;

    @Override
    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPublicExponent().hashCode() ^ this.getPrivateExponent().hashCode();
    }

    @Override
    public BigInteger getPrimeP() {
        return this.cfr_renamed_3;
    }

    @Override
    public String getFormat() {
        return sprbho.cfr_renamed_9("\u0013t\u0000l`\u0007");
    }

    @Override
    public BigInteger getPublicExponent() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprlnj(RSAPrivateCrtKey rSAPrivateCrtKey) {
        void arg0;
        sprlnj sprlnj2 = this;
        void v1 = arg0;
        sprlnj sprlnj3 = this;
        void v3 = arg0;
        sprlnj sprlnj4 = this;
        super(new sprkhk(arg0.getModulus(), arg0.getPublicExponent(), arg0.getPrivateExponent(), arg0.getPrimeP(), arg0.getPrimeQ(), arg0.getPrimeExponentP(), arg0.getPrimeExponentQ(), arg0.getCrtCoefficient()));
        sprlnj4.cfr_renamed_4 = arg0.getModulus();
        sprlnj4.cfr_renamed_91 = arg0.getPublicExponent();
        this.cfr_renamed_0 = v3.getPrivateExponent();
        sprlnj3.cfr_renamed_3 = v3.getPrimeP();
        sprlnj3.cfr_renamed_119 = arg0.getPrimeQ();
        this.cfr_renamed_9407 = v1.getPrimeExponentP();
        sprlnj2.cfr_renamed_1 = v1.getPrimeExponentQ();
        sprlnj2.cfr_renamed_112 = rSAPrivateCrtKey.getCrtCoefficient();
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

    public sprlnj(sprctm arg0) {
        this(sprbjj.cfr_renamed_2, arg0);
    }

    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream arg0) throws IOException {
        arg0.defaultWriteObject();
    }

    @Override
    public BigInteger getPrimeExponentQ() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprlnj(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        void arg0;
        sprlnj sprlnj2 = this;
        void v1 = arg0;
        sprlnj sprlnj3 = this;
        void v3 = arg0;
        sprlnj sprlnj4 = this;
        super(new sprkhk(arg0.getModulus(), arg0.getPublicExponent(), arg0.getPrivateExponent(), arg0.getPrimeP(), arg0.getPrimeQ(), arg0.getPrimeExponentP(), arg0.getPrimeExponentQ(), arg0.getCrtCoefficient()));
        sprlnj4.cfr_renamed_4 = arg0.getModulus();
        sprlnj4.cfr_renamed_91 = arg0.getPublicExponent();
        this.cfr_renamed_0 = v3.getPrivateExponent();
        sprlnj3.cfr_renamed_3 = v3.getPrimeP();
        sprlnj3.cfr_renamed_119 = arg0.getPrimeQ();
        this.cfr_renamed_9407 = v1.getPrimeExponentP();
        sprlnj2.cfr_renamed_1 = v1.getPrimeExponentQ();
        sprlnj2.cfr_renamed_112 = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    @Override
    public BigInteger getPrimeExponentP() {
        return this.cfr_renamed_9407;
    }

    /*
     * WARNING - void declaration
     */
    public sprlnj(sprddm sprddm2, sprctm sprctm2) {
        void arg0;
        void arg1;
        sprlnj sprlnj2 = this;
        void v1 = arg1;
        sprlnj sprlnj3 = this;
        void v3 = arg1;
        sprlnj sprlnj4 = this;
        super((sprddm)arg0, new sprkhk(arg1.cfr_renamed_2295(), arg1.cfr_renamed_2296(), arg1.cfr_renamed_2299(), arg1.cfr_renamed_2300(), arg1.cfr_renamed_2301(), arg1.cfr_renamed_2302(), arg1.cfr_renamed_2303(), arg1.cfr_renamed_2304()));
        sprlnj4.cfr_renamed_4 = arg1.cfr_renamed_2295();
        sprlnj4.cfr_renamed_91 = arg1.cfr_renamed_2296();
        this.cfr_renamed_0 = v3.cfr_renamed_2299();
        sprlnj3.cfr_renamed_3 = v3.cfr_renamed_2300();
        sprlnj3.cfr_renamed_119 = arg1.cfr_renamed_2301();
        this.cfr_renamed_9407 = v1.cfr_renamed_2302();
        sprlnj2.cfr_renamed_1 = v1.cfr_renamed_2303();
        sprlnj2.cfr_renamed_112 = sprctm2.cfr_renamed_2304();
    }

    public sprlnj(sprcom arg0) throws IOException {
        this(arg0.cfr_renamed_1254(), sprctm.cfr_renamed_23(arg0.cfr_renamed_1229()));
    }

    /*
     * WARNING - void declaration
     */
    public sprlnj(sprkhk sprkhk2) {
        void arg0;
        sprlnj sprlnj2 = this;
        void v1 = arg0;
        sprlnj sprlnj3 = this;
        void v3 = arg0;
        super((sprkik)arg0);
        this.cfr_renamed_91 = v3.cfr_renamed_2296();
        sprlnj3.cfr_renamed_3 = v3.cfr_renamed_1155();
        sprlnj3.cfr_renamed_119 = arg0.cfr_renamed_1604();
        this.cfr_renamed_9407 = v1.cfr_renamed_2305();
        sprlnj2.cfr_renamed_1 = v1.cfr_renamed_2306();
        sprlnj2.cfr_renamed_112 = sprkhk2.cfr_renamed_1148();
    }

    /*
     * WARNING - void declaration
     */
    public sprlnj(sprddm sprddm2, sprkhk sprkhk2) {
        void arg0;
        void arg1;
        sprlnj sprlnj2 = this;
        void v1 = arg1;
        sprlnj sprlnj3 = this;
        void v3 = arg1;
        super((sprddm)arg0, (sprkik)arg1);
        this.cfr_renamed_91 = v3.cfr_renamed_2296();
        sprlnj3.cfr_renamed_3 = v3.cfr_renamed_1155();
        sprlnj3.cfr_renamed_119 = arg1.cfr_renamed_1604();
        this.cfr_renamed_9407 = v1.cfr_renamed_2305();
        sprlnj2.cfr_renamed_1 = v1.cfr_renamed_2306();
        sprlnj2.cfr_renamed_112 = sprkhk2.cfr_renamed_1148();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer.append(sprnuc.cfr_renamed_9("fEu6dd]`UbQ6wD`6\u007fsM6o")).append(sprgij.cfr_renamed_9395(this.getModulus())).append("]").append(sprbho.cfr_renamed_9("od")).append(sprgij.cfr_renamed_9396(this.getPublicExponent())).append("]").append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprnuc.cfr_renamed_9("6\u00146\u00146\u00146\u00146\u00146\u00146YyPcXcG,\u0014")).append(this.getModulus().toString(16)).append(string);
        stringBuffer3.append(sprbho.cfr_renamed_9("c\u001fc\u001fcO6]/V \u001f&G3P-Z-Ky\u001f")).append(this.getPublicExponent().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    @Override
    public byte[] getEncoded() {
        return sprjij.cfr_renamed_5678((sprddm)((Object)this.cfr_renamed_91), new sprctm(this.getModulus(), this.getPublicExponent(), this.getPrivateExponent(), this.getPrimeP(), this.getPrimeQ(), this.getPrimeExponentP(), this.getPrimeExponentQ(), this.getCrtCoefficient()));
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprlnj sprlnj2 = this;
        sprlnj2.cfr_renamed_112 = new sprtlj();
        sprlnj2.cfr_renamed_1 = new sprkhk(this.getModulus(), this.getPublicExponent(), this.getPrivateExponent(), this.getPrimeP(), this.getPrimeQ(), this.getPrimeExponentP(), this.getPrimeExponentQ(), this.getCrtCoefficient());
    }

    @Override
    public BigInteger getCrtCoefficient() {
        return this.cfr_renamed_112;
    }

    @Override
    public BigInteger getPrimeQ() {
        return this.cfr_renamed_119;
    }
}

