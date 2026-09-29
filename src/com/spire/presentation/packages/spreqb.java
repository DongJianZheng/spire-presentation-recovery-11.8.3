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
import com.spire.presentation.packages.sprrhq;
import com.spire.presentation.packages.sprufba;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprynb;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

public class spreqb
extends sprynb
implements RSAPrivateCrtKey {
    private BigInteger cfr_renamed_112;
    private BigInteger cfr_renamed_119;
    public static final long cfr_renamed_2297 = 7834723820638524718L;
    private BigInteger cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2298;

    @Override
    public String getFormat() {
        return sprrhq.cfr_renamed_9("\u001f,\f4l_");
    }

    /*
     * WARNING - void declaration
     */
    public spreqb(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        void arg0;
        spreqb spreqb2 = this;
        void v1 = arg0;
        spreqb spreqb3 = this;
        void v3 = arg0;
        spreqb spreqb4 = this;
        spreqb4.cfr_renamed_4 = arg0.getModulus();
        spreqb4.cfr_renamed_2298 = arg0.getPublicExponent();
        this.cfr_renamed_2 = v3.getPrivateExponent();
        spreqb3.cfr_renamed_1 = v3.getPrimeP();
        spreqb3.cfr_renamed_119 = arg0.getPrimeQ();
        this.cfr_renamed_91 = v1.getPrimeExponentP();
        spreqb2.cfr_renamed_0 = v1.getPrimeExponentQ();
        spreqb2.cfr_renamed_112 = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    /*
     * WARNING - void declaration
     */
    public spreqb(RSAPrivateCrtKey rSAPrivateCrtKey) {
        void arg0;
        spreqb spreqb2 = this;
        void v1 = arg0;
        spreqb spreqb3 = this;
        void v3 = arg0;
        spreqb spreqb4 = this;
        spreqb4.cfr_renamed_4 = arg0.getModulus();
        spreqb4.cfr_renamed_2298 = arg0.getPublicExponent();
        this.cfr_renamed_2 = v3.getPrivateExponent();
        spreqb3.cfr_renamed_1 = v3.getPrimeP();
        spreqb3.cfr_renamed_119 = arg0.getPrimeQ();
        this.cfr_renamed_91 = v1.getPrimeExponentP();
        spreqb2.cfr_renamed_0 = v1.getPrimeExponentQ();
        spreqb2.cfr_renamed_112 = rSAPrivateCrtKey.getCrtCoefficient();
    }

    @Override
    public int hashCode() {
        return this.getModulus().hashCode() ^ this.getPublicExponent().hashCode() ^ this.getPrivateExponent().hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public spreqb(sprlbe sprlbe2) {
        void arg0;
        spreqb spreqb2 = this;
        void v1 = arg0;
        spreqb spreqb3 = this;
        void v3 = arg0;
        spreqb spreqb4 = this;
        spreqb4.cfr_renamed_4 = arg0.cfr_renamed_2295();
        spreqb4.cfr_renamed_2298 = arg0.cfr_renamed_2296();
        this.cfr_renamed_2 = v3.cfr_renamed_2299();
        spreqb3.cfr_renamed_1 = v3.cfr_renamed_2300();
        spreqb3.cfr_renamed_119 = arg0.cfr_renamed_2301();
        this.cfr_renamed_91 = v1.cfr_renamed_2302();
        spreqb2.cfr_renamed_0 = v1.cfr_renamed_2303();
        spreqb2.cfr_renamed_112 = sprlbe2.cfr_renamed_2304();
    }

    @Override
    public byte[] getEncoded() {
        return sprdqc.cfr_renamed_1189(new sprije(sprm.cfr_renamed_1510, sprume.cfr_renamed_3), new sprlbe(this.getModulus(), this.getPublicExponent(), this.getPrivateExponent(), this.getPrimeP(), this.getPrimeQ(), this.getPrimeExponentP(), this.getPrimeExponentQ(), this.getCrtCoefficient()));
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprufba.cfr_renamed_9("n/l#,5g6c4c2m4"));
        StringBuffer stringBuffer2 = stringBuffer.append(sprrhq.cfr_renamed_9("5\u001c&o7=\u000e9\u0006;\u0002o$\u001d3o,*\u001e")).append(string);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprufba.cfr_renamed_9("f\"f\"f\"f\"f\"f\"+m\"w*w58f")).append(this.getModulus().toString(16)).append(string);
        stringBuffer3.append(sprrhq.cfr_renamed_9("GoGo\u0017:\u0005#\u000e,G*\u001f?\b!\u0002!\u0013uG")).append(this.getPublicExponent().toString(16)).append(string);
        stringBuffer.append(sprufba.cfr_renamed_9("f\"fr4k0c2gfg>r)l#l28f")).append(this.getPrivateExponent().toString(16)).append(string);
        stringBuffer.append(sprrhq.cfr_renamed_9("GoGoGoGoGoGoG?\u0015&\n*7uG")).append(this.getPrimeP().toString(16)).append(string);
        stringBuffer.append(sprufba.cfr_renamed_9("f\"f\"f\"f\"f\"f\"fr4k+g\u00178f")).append(this.getPrimeQ().toString(16)).append(string);
        stringBuffer.append(sprrhq.cfr_renamed_9("GoGoG?\u0015&\n*\"7\u0017 \t*\t;7uG")).append(this.getPrimeExponentP().toString(16)).append(string);
        stringBuffer.append(sprufba.cfr_renamed_9("f\"f\"fr4k+g\u0003z6m(g(v\u00178f")).append(this.getPrimeExponentQ().toString(16)).append(string);
        stringBuffer.append(sprrhq.cfr_renamed_9("GoGoG,\u0015;$ \u0002)\u0001&\u0004&\u0002!\u0013uG")).append(this.getCrtCoefficient().toString(16)).append(string);
        return stringBuffer3.toString();
    }

    /*
     * WARNING - void declaration
     */
    public spreqb(sprisc sprisc2) {
        void arg0;
        spreqb spreqb2 = this;
        void v1 = arg0;
        spreqb spreqb3 = this;
        void v3 = arg0;
        super((sprmtc)arg0);
        this.cfr_renamed_2298 = v3.cfr_renamed_2296();
        spreqb3.cfr_renamed_1 = v3.cfr_renamed_1155();
        spreqb3.cfr_renamed_119 = arg0.cfr_renamed_1604();
        this.cfr_renamed_91 = v1.cfr_renamed_2305();
        spreqb2.cfr_renamed_0 = v1.cfr_renamed_2306();
        spreqb2.cfr_renamed_112 = sprisc2.cfr_renamed_1148();
    }

    @Override
    public BigInteger getPrimeP() {
        return this.cfr_renamed_1;
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
    public BigInteger getPrimeExponentQ() {
        return this.cfr_renamed_0;
    }

    public spreqb(sprmke arg0) throws IOException {
        this(sprlbe.cfr_renamed_23(arg0.cfr_renamed_1229()));
    }

    @Override
    public BigInteger getPublicExponent() {
        return this.cfr_renamed_2298;
    }

    @Override
    public BigInteger getPrimeQ() {
        return this.cfr_renamed_119;
    }

    @Override
    public BigInteger getCrtCoefficient() {
        return this.cfr_renamed_112;
    }

    @Override
    public BigInteger getPrimeExponentP() {
        return this.cfr_renamed_91;
    }
}

