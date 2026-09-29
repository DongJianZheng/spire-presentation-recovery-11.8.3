/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprprca;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.spruld;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruna;
import com.spire.presentation.packages.sprzde;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;

public class sprtzc
implements DSAPublicKey {
    private static final long cfr_renamed_2 = 1752452449903495175L;
    private transient DSAParams cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtzc(sprdce arg0) {
        sprooe sprooe2;
        try {
            sprooe2 = (sprooe)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(spruna.cfr_renamed_9("o\u0001p\u000ej\u0006bOo\u0001`\u0000&\u001cr\u001ds\fr\u001at\n&\u0006hOB<GOv\u001ad\u0003o\f&\u0004c\u0016"));
        }
        this.cfr_renamed_4 = sprooe2.cfr_renamed_97();
        if (this.cfr_renamed_2289(arg0.cfr_renamed_593().cfr_renamed_284())) {
            sprzde sprzde2 = sprzde.cfr_renamed_23(arg0.cfr_renamed_593().cfr_renamed_284());
            sprtzc sprtzc2 = this;
            sprtzc2.cfr_renamed_3 = new DSAParameterSpec(sprzde2.cfr_renamed_1155(), sprzde2.cfr_renamed_1604(), sprzde2.cfr_renamed_1145());
        }
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_3 == null) {
            return sprdqc.cfr_renamed_1187(new sprije(sprtk.cfr_renamed_314), new sprooe(this.cfr_renamed_4));
        }
        return sprdqc.cfr_renamed_1187(new sprije(sprtk.cfr_renamed_314, new sprzde(this.cfr_renamed_3.getP(), this.cfr_renamed_3.getQ(), this.cfr_renamed_3.getG()).cfr_renamed_119()), new sprooe(this.cfr_renamed_4));
    }

    /*
     * WARNING - void declaration
     */
    public sprtzc(DSAPublicKey dSAPublicKey) {
        void arg0;
        sprtzc sprtzc2 = this;
        sprtzc2.cfr_renamed_4 = arg0.getY();
        sprtzc2.cfr_renamed_3 = dSAPublicKey.getParams();
    }

    private /* synthetic */ boolean cfr_renamed_2289(spra arg0) {
        return arg0 != null && !sprume.cfr_renamed_3.equals(arg0.cfr_renamed_119());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprtzc sprtzc2 = this;
        arg0.defaultWriteObject();
        arg0.writeObject(sprtzc2.cfr_renamed_3.getP());
        v0.writeObject(sprtzc2.cfr_renamed_3.getQ());
        v0.writeObject(this.cfr_renamed_3.getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprtzc(DSAPublicKeySpec dSAPublicKeySpec) {
        void arg0;
        this.cfr_renamed_4 = dSAPublicKeySpec.getY();
        sprtzc sprtzc2 = this;
        this.cfr_renamed_3 = new DSAParameterSpec(arg0.getP(), arg0.getQ(), arg0.getG());
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey)arg0;
        return this.getY().equals(dSAPublicKey.getY()) && this.getParams().getG().equals(dSAPublicKey.getParams().getG()) && this.getParams().getP().equals(dSAPublicKey.getParams().getP()) && this.getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    public int hashCode() {
        return this.getY().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getQ().hashCode();
    }

    @Override
    public String getAlgorithm() {
        return "DSA";
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprtzc sprtzc2 = this;
        sprtzc2.cfr_renamed_3 = new DSAParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
    }

    /*
     * WARNING - void declaration
     */
    public sprtzc(BigInteger bigInteger, DSAParameterSpec dSAParameterSpec) {
        void arg0;
        sprtzc sprtzc2 = this;
        sprtzc2.cfr_renamed_4 = arg0;
        sprtzc2.cfr_renamed_3 = dSAParameterSpec;
    }

    @Override
    public String getFormat() {
        return sprprca.cfr_renamed_9("lx\u0001f\r");
    }

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprtzc(spruld spruld2) {
        void arg0;
        this.cfr_renamed_4 = spruld2.spr\u3181();
        sprtzc sprtzc2 = this;
        this.cfr_renamed_3 = new DSAParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1604(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(spruna.cfr_renamed_9("j\u0006h\n(\u001cc\u001fg\u001dg\u001bi\u001d"));
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprprca.cfr_renamed_9("\u0012g\u0017\u0014\u0006A4X?Wv\u007f3M")).append(string);
        stringBuffer2.append(spruna.cfr_renamed_9("O&O&O&O&O&O&\u0016<O")).append(this.getY().toString(16)).append(string);
        return stringBuffer2.toString();
    }

    @Override
    public DSAParams getParams() {
        return this.cfr_renamed_3;
    }
}

