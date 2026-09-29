/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlnd;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprwvd;
import com.spire.presentation.packages.sprzde;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;

public class sprrnb
implements DSAPrivateKey,
sprwb {
    private static final long cfr_renamed_1 = -4677259546958385734L;
    private sprooc cfr_renamed_2;
    public BigInteger cfr_renamed_3;
    public DSAParams cfr_renamed_4;

    @Override
    public DSAParams getParams() {
        return this.cfr_renamed_4;
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_2.cfr_renamed_2158();
    }

    public int hashCode() {
        return this.getX().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getQ().hashCode();
    }

    public sprrnb() {
        sprrnb sprrnb2 = this;
        sprrnb2.cfr_renamed_2 = new sprooc();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprmke sprmke2 = new sprmke(new sprije(sprtk.cfr_renamed_314, new sprzde(this.cfr_renamed_4.getP(), this.cfr_renamed_4.getQ(), this.cfr_renamed_4.getG())), new sprooe(this.getX()));
            return sprmke2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey)arg0;
        return this.getX().equals(dSAPrivateKey.getX()) && this.getParams().getG().equals(dSAPrivateKey.getParams().getG()) && this.getParams().getP().equals(dSAPrivateKey.getParams().getP()) && this.getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    /*
     * WARNING - void declaration
     */
    public sprrnb(DSAPrivateKeySpec dSAPrivateKeySpec) {
        void arg0;
        sprrnb sprrnb2 = this;
        sprrnb sprrnb3 = this;
        sprrnb2.cfr_renamed_2 = new sprooc();
        sprrnb2.cfr_renamed_3 = dSAPrivateKeySpec.getX();
        sprrnb2.cfr_renamed_4 = new DSAParameterSpec(arg0.getP(), arg0.getQ(), arg0.getG());
    }

    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream arg0) throws IOException {
        sprrnb sprrnb2 = this;
        ObjectOutputStream objectOutputStream = arg0;
        sprrnb sprrnb3 = this;
        arg0.writeObject(sprrnb3.cfr_renamed_3);
        objectOutputStream.writeObject(sprrnb3.cfr_renamed_4.getP());
        objectOutputStream.writeObject(this.cfr_renamed_4.getQ());
        arg0.writeObject(sprrnb2.cfr_renamed_4.getG());
        sprrnb2.cfr_renamed_2.cfr_renamed_2291(arg0);
    }

    @Override
    public BigInteger getX() {
        return this.cfr_renamed_3;
    }

    @Override
    public String getAlgorithm() {
        return "DSA";
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_2.cfr_renamed_2152(arg0, arg1);
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_2.cfr_renamed_1510(arg0);
    }

    @Override
    public String getFormat() {
        return sprwvd.cfr_renamed_9("~*m2\rY");
    }

    public sprrnb(sprmke sprmke2) throws IOException {
        sprmke sprmke3 = sprmke2;
        sprrnb sprrnb2 = this;
        sprrnb sprrnb3 = this;
        sprrnb2.cfr_renamed_2 = new sprooc();
        sprzde sprzde2 = sprzde.cfr_renamed_23(sprmke3.cfr_renamed_1254().cfr_renamed_284());
        sprrnb2.cfr_renamed_3 = sprooe.cfr_renamed_23(sprmke3.cfr_renamed_1229()).cfr_renamed_97();
        sprrnb2.cfr_renamed_4 = new DSAParameterSpec(sprzde2.cfr_renamed_1155(), sprzde2.cfr_renamed_1604(), sprzde2.cfr_renamed_1145());
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_3 = (BigInteger)arg0.readObject();
        sprrnb sprrnb2 = this;
        sprrnb2.cfr_renamed_4 = new DSAParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
        this.cfr_renamed_2 = new sprooc();
        this.cfr_renamed_2.cfr_renamed_2290(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprrnb(sprlnd sprlnd2) {
        void arg0;
        sprrnb sprrnb2 = this;
        sprrnb sprrnb3 = this;
        sprrnb2.cfr_renamed_2 = new sprooc();
        sprrnb2.cfr_renamed_3 = sprlnd2.cfr_renamed_1980();
        sprrnb2.cfr_renamed_4 = new DSAParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1604(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    /*
     * WARNING - void declaration
     */
    public sprrnb(DSAPrivateKey dSAPrivateKey) {
        void arg0;
        sprrnb sprrnb2 = this;
        sprrnb sprrnb3 = this;
        sprrnb3.cfr_renamed_2 = new sprooc();
        sprrnb2.cfr_renamed_3 = arg0.getX();
        sprrnb2.cfr_renamed_4 = dSAPrivateKey.getParams();
    }
}

