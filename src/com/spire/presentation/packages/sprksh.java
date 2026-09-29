/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprctm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spripe;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqry;
import com.spire.presentation.packages.sprvph;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

public class sprksh
extends sprvph
implements RSAPrivateCrtKey {
    private BigInteger cfr_renamed_112;
    public static final long cfr_renamed_9148 = 7834723820638524718L;
    private BigInteger cfr_renamed_119;
    private BigInteger cfr_renamed_91;
    private BigInteger cfr_renamed_9149;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;

    /*
     * WARNING - void declaration
     */
    public sprksh(RSAPrivateCrtKey rSAPrivateCrtKey) {
        void arg0;
        sprksh sprksh2 = this;
        void v1 = arg0;
        sprksh sprksh3 = this;
        void v3 = arg0;
        sprksh sprksh4 = this;
        sprksh4.cfr_renamed_1 = arg0.getModulus();
        sprksh4.cfr_renamed_9149 = arg0.getPublicExponent();
        this.cfr_renamed_4 = v3.getPrivateExponent();
        sprksh3.cfr_renamed_91 = v3.getPrimeP();
        sprksh3.cfr_renamed_112 = arg0.getPrimeQ();
        this.cfr_renamed_3 = v1.getPrimeExponentP();
        sprksh2.cfr_renamed_2 = v1.getPrimeExponentQ();
        sprksh2.cfr_renamed_119 = rSAPrivateCrtKey.getCrtCoefficient();
    }

    @Override
    public BigInteger getPrimeQ() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprksh(sprctm sprctm2) {
        void arg0;
        sprksh sprksh2 = this;
        void v1 = arg0;
        sprksh sprksh3 = this;
        void v3 = arg0;
        sprksh sprksh4 = this;
        sprksh4.cfr_renamed_1 = arg0.cfr_renamed_2295();
        sprksh4.cfr_renamed_9149 = arg0.cfr_renamed_2296();
        this.cfr_renamed_4 = v3.cfr_renamed_2299();
        sprksh3.cfr_renamed_91 = v3.cfr_renamed_2300();
        sprksh3.cfr_renamed_112 = arg0.cfr_renamed_2301();
        this.cfr_renamed_3 = v1.cfr_renamed_2302();
        sprksh2.cfr_renamed_2 = v1.cfr_renamed_2303();
        sprksh2.cfr_renamed_119 = sprctm2.cfr_renamed_2304();
    }

    @Override
    public BigInteger getPrimeExponentQ() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprksh(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        void arg0;
        sprksh sprksh2 = this;
        void v1 = arg0;
        sprksh sprksh3 = this;
        void v3 = arg0;
        sprksh sprksh4 = this;
        sprksh4.cfr_renamed_1 = arg0.getModulus();
        sprksh4.cfr_renamed_9149 = arg0.getPublicExponent();
        this.cfr_renamed_4 = v3.getPrivateExponent();
        sprksh3.cfr_renamed_91 = v3.getPrimeP();
        sprksh3.cfr_renamed_112 = arg0.getPrimeQ();
        this.cfr_renamed_3 = v1.getPrimeExponentP();
        sprksh2.cfr_renamed_2 = v1.getPrimeExponentQ();
        sprksh2.cfr_renamed_119 = rSAPrivateCrtKeySpec.getCrtCoefficient();
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

    /*
     * WARNING - void declaration
     */
    public sprksh(sprkhk sprkhk2) {
        void arg0;
        sprksh sprksh2 = this;
        void v1 = arg0;
        sprksh sprksh3 = this;
        void v3 = arg0;
        super((sprkik)arg0);
        this.cfr_renamed_9149 = v3.cfr_renamed_2296();
        sprksh3.cfr_renamed_91 = v3.cfr_renamed_1155();
        sprksh3.cfr_renamed_112 = arg0.cfr_renamed_1604();
        this.cfr_renamed_3 = v1.cfr_renamed_2305();
        sprksh2.cfr_renamed_2 = v1.cfr_renamed_2306();
        sprksh2.cfr_renamed_119 = sprkhk2.cfr_renamed_1148();
    }

    @Override
    public BigInteger getPrimeExponentP() {
        return this.cfr_renamed_3;
    }

    @Override
    public BigInteger getCrtCoefficient() {
        return this.cfr_renamed_119;
    }

    @Override
    public BigInteger getPrimeP() {
        return this.cfr_renamed_91;
    }

    @Override
    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPublicExponent().hashCode() ^ this.getPrivateExponent().hashCode();
    }

    public sprksh(sprcom arg0) throws IOException {
        this(sprctm.cfr_renamed_23(arg0.cfr_renamed_1229()));
    }

    @Override
    public BigInteger getPublicExponent() {
        return this.cfr_renamed_9149;
    }

    @Override
    public byte[] getEncoded() {
        return sprjij.cfr_renamed_5678(new sprddm(sprdl.cfr_renamed_1205, sprpen.cfr_renamed_4), new sprctm(this.getModulus(), this.getPublicExponent(), this.getPrivateExponent(), this.getPrimeP(), this.getPrimeQ(), this.getPrimeExponentP(), this.getPrimeExponentQ(), this.getCrtCoefficient()));
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = stringBuffer.append(spripe.cfr_renamed_9("\u0019k\n\u0018\u001bJ\"N*L.\u0018\bj\u001f\u0018\u0000]2")).append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprqry.cfr_renamed_9("2\u00052\u00052\u00052\u00052\u00052\u0005\u007fJvP~Pa\u001f2")).append(this.getModulus().toString(16)).append(string);
        stringBuffer3.append(spripe.cfr_renamed_9("k\u0018k\u0018;M)T\"[k]3H$V.V?\u0002k")).append(this.getPublicExponent().toString(16)).append(string);
        stringBuffer.append(sprqry.cfr_renamed_9("2\u00052U`LdDf@2@jU}KwKf\u001f2")).append(this.getPrivateExponent().toString(16)).append(string);
        stringBuffer.append(spripe.cfr_renamed_9("k\u0018k\u0018k\u0018k\u0018k\u0018k\u0018kH9Q&]\u001b\u0002k")).append(this.getPrimeP().toString(16)).append(string);
        stringBuffer.append(sprqry.cfr_renamed_9("2\u00052\u00052\u00052\u00052\u00052\u00052U`L\u007f@C\u001f2")).append(this.getPrimeQ().toString(16)).append(string);
        stringBuffer.append(spripe.cfr_renamed_9("k\u0018k\u0018kH9Q&]\u000e@;W%]%L\u001b\u0002k")).append(this.getPrimeExponentP().toString(16)).append(string);
        stringBuffer.append(sprqry.cfr_renamed_9("2\u00052\u00052U`L\u007f@W]bJ|@|QC\u001f2")).append(this.getPrimeExponentQ().toString(16)).append(string);
        stringBuffer.append(spripe.cfr_renamed_9("k\u0018k\u0018k[9L\bW.^-Q(Q.V?\u0002k")).append(this.getCrtCoefficient().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    @Override
    public String getFormat() {
        return sprqry.cfr_renamed_9("uYfA\u0006*");
    }
}

