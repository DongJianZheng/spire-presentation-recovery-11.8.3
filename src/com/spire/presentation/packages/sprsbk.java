/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboy;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprkck;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprldha;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprusk;
import com.spire.presentation.packages.sprxem;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;

public class sprsbk
implements DSAPrivateKey,
sprof {
    private static final long cfr_renamed_1 = -4677259546958385734L;
    private transient sprtlj cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private transient DSAParams cfr_renamed_4;

    @Override
    public DSAParams getParams() {
        return this.cfr_renamed_4;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        BigInteger bigInteger = this.getParams().getG().modPow(this.cfr_renamed_3, this.getParams().getP());
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprldha.cfr_renamed_9("A0DCU\u0011l\u0015d\u0017`CN\u0006|C^")).append(sprkck.cfr_renamed_9450(bigInteger, this.getParams())).append("]").append(string);
        stringBuffer2.append(sprboy.cfr_renamed_9("nqnqnqnqnqnq\u0017kn")).append(bigInteger.toString(16)).append(string);
        return stringBuffer2.toString();
    }

    public sprsbk(sprcom sprcom2) throws IOException {
        sprcom sprcom3 = sprcom2;
        sprsbk sprsbk2 = this;
        sprsbk2.cfr_renamed_2 = new sprtlj();
        sprxem sprxem2 = sprxem.cfr_renamed_23(sprcom3.cfr_renamed_1254().cfr_renamed_284());
        sprktm sprktm2 = (sprktm)sprcom3.cfr_renamed_1229();
        sprsbk sprsbk3 = this;
        sprsbk3.cfr_renamed_3 = sprktm2.cfr_renamed_97();
        sprsbk3.cfr_renamed_4 = new DSAParameterSpec(sprxem2.cfr_renamed_1155(), sprxem2.cfr_renamed_1604(), sprxem2.cfr_renamed_1145());
    }

    @Override
    public byte[] getEncoded() {
        return sprjij.cfr_renamed_5678(new sprddm(sprbr.cfr_renamed_84, new sprxem(this.cfr_renamed_4.getP(), this.cfr_renamed_4.getQ(), this.cfr_renamed_4.getG()).cfr_renamed_119()), new sprktm(this.getX()));
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        arg0.defaultReadObject();
        sprsbk sprsbk2 = this;
        sprsbk2.cfr_renamed_4 = new DSAParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
        this.cfr_renamed_2 = new sprtlj();
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_2.cfr_renamed_9065(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprsbk(DSAPrivateKey dSAPrivateKey) {
        void arg0;
        sprsbk sprsbk2 = this;
        sprsbk sprsbk3 = this;
        sprsbk3.cfr_renamed_2 = new sprtlj();
        sprsbk2.cfr_renamed_3 = arg0.getX();
        sprsbk2.cfr_renamed_4 = dSAPrivateKey.getParams();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey)arg0;
        return this.getX().equals(dSAPrivateKey.getX()) && this.getParams().getG().equals(dSAPrivateKey.getParams().getG()) && this.getParams().getP().equals(dSAPrivateKey.getParams().getP()) && this.getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    @Override
    public String getAlgorithm() {
        return "DSA";
    }

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprsbk(sprusk sprusk2) {
        void arg0;
        sprsbk sprsbk2 = this;
        sprsbk sprsbk3 = this;
        sprsbk2.cfr_renamed_2 = new sprtlj();
        sprsbk2.cfr_renamed_3 = sprusk2.cfr_renamed_1980();
        sprsbk2.cfr_renamed_4 = new DSAParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1604(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    @Override
    public String getFormat() {
        return sprldha.cfr_renamed_9("3N V@=");
    }

    public sprsbk() {
        sprsbk sprsbk2 = this;
        sprsbk2.cfr_renamed_2 = new sprtlj();
    }

    public int hashCode() {
        return this.getX().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getQ().hashCode();
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_2.cfr_renamed_9064(arg0);
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_2.cfr_renamed_2158();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprsbk sprsbk2 = this;
        arg0.defaultWriteObject();
        arg0.writeObject(sprsbk2.cfr_renamed_4.getP());
        v0.writeObject(sprsbk2.cfr_renamed_4.getQ());
        v0.writeObject(this.cfr_renamed_4.getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprsbk(DSAPrivateKeySpec dSAPrivateKeySpec) {
        void arg0;
        sprsbk sprsbk2 = this;
        sprsbk sprsbk3 = this;
        sprsbk2.cfr_renamed_2 = new sprtlj();
        sprsbk2.cfr_renamed_3 = dSAPrivateKeySpec.getX();
        sprsbk2.cfr_renamed_4 = new DSAParameterSpec(arg0.getP(), arg0.getQ(), arg0.getG());
    }
}

