/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprtyba;
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

public class sprsoh
implements DSAPrivateKey,
sprof {
    public DSAParams cfr_renamed_1;
    private static final long cfr_renamed_2 = -4677259546958385734L;
    private sprtlj cfr_renamed_3;
    public BigInteger cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream arg0) throws IOException {
        sprsoh sprsoh2 = this;
        ObjectOutputStream objectOutputStream = arg0;
        sprsoh sprsoh3 = this;
        arg0.writeObject(sprsoh3.cfr_renamed_4);
        objectOutputStream.writeObject(sprsoh3.cfr_renamed_1.getP());
        objectOutputStream.writeObject(this.cfr_renamed_1.getQ());
        arg0.writeObject(sprsoh2.cfr_renamed_1.getG());
        sprsoh2.cfr_renamed_3.cfr_renamed_2291(arg0);
    }

    @Override
    public String getFormat() {
        return sprtyba.cfr_renamed_9("9\u000e*\u0016J}");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprcom sprcom2 = new sprcom(new sprddm(sprbr.cfr_renamed_84, new sprxem(this.cfr_renamed_1.getP(), this.cfr_renamed_1.getQ(), this.cfr_renamed_1.getG())), new sprktm(this.getX()));
            return sprcom2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_4 = (BigInteger)arg0.readObject();
        sprsoh sprsoh2 = this;
        sprsoh2.cfr_renamed_1 = new DSAParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
        this.cfr_renamed_3 = new sprtlj();
        this.cfr_renamed_3.cfr_renamed_2290(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprsoh(DSAPrivateKeySpec dSAPrivateKeySpec) {
        void arg0;
        sprsoh sprsoh2 = this;
        sprsoh sprsoh3 = this;
        sprsoh2.cfr_renamed_3 = new sprtlj();
        sprsoh2.cfr_renamed_4 = dSAPrivateKeySpec.getX();
        sprsoh2.cfr_renamed_1 = new DSAParameterSpec(arg0.getP(), arg0.getQ(), arg0.getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprsoh(DSAPrivateKey dSAPrivateKey) {
        void arg0;
        sprsoh sprsoh2 = this;
        sprsoh sprsoh3 = this;
        sprsoh3.cfr_renamed_3 = new sprtlj();
        sprsoh2.cfr_renamed_4 = arg0.getX();
        sprsoh2.cfr_renamed_1 = dSAPrivateKey.getParams();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey)arg0;
        return this.getX().equals(dSAPrivateKey.getX()) && this.getParams().getG().equals(dSAPrivateKey.getParams().getG()) && this.getParams().getP().equals(dSAPrivateKey.getParams().getP()) && this.getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_4;
    }

    @Override
    public String getAlgorithm() {
        return "DSA";
    }

    /*
     * WARNING - void declaration
     */
    public sprsoh(sprusk sprusk2) {
        void arg0;
        sprsoh sprsoh2 = this;
        sprsoh sprsoh3 = this;
        sprsoh2.cfr_renamed_3 = new sprtlj();
        sprsoh2.cfr_renamed_4 = sprusk2.cfr_renamed_1980();
        sprsoh2.cfr_renamed_1 = new DSAParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1604(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    public int hashCode() {
        return this.getX().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getQ().hashCode();
    }

    @Override
    public DSAParams getParams() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_3.cfr_renamed_9064(arg0);
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_3.cfr_renamed_9065(arg0, arg1);
    }

    public sprsoh() {
        sprsoh sprsoh2 = this;
        sprsoh2.cfr_renamed_3 = new sprtlj();
    }

    public sprsoh(sprcom sprcom2) throws IOException {
        sprcom sprcom3 = sprcom2;
        sprsoh sprsoh2 = this;
        sprsoh sprsoh3 = this;
        sprsoh2.cfr_renamed_3 = new sprtlj();
        sprxem sprxem2 = sprxem.cfr_renamed_23(sprcom3.cfr_renamed_1254().cfr_renamed_284());
        sprsoh2.cfr_renamed_4 = sprktm.cfr_renamed_23(sprcom3.cfr_renamed_1229()).cfr_renamed_97();
        sprsoh2.cfr_renamed_1 = new DSAParameterSpec(sprxem2.cfr_renamed_1155(), sprxem2.cfr_renamed_1604(), sprxem2.cfr_renamed_1145());
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_3.cfr_renamed_2158();
    }
}

